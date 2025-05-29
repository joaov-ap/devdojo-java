package dev.joaov.javacore.ZZGcrud.repository;

import dev.joaov.javacore.ZZGcrud.conn.ConnectionFactory;
import dev.joaov.javacore.ZZGcrud.dominio.Anime;
import dev.joaov.javacore.ZZGcrud.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        log.info("Finding Anime by name '{}'", name);
        List<Anime> animes = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindByName(conn, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Producer producer = Producer.builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("producer_name"))
                        .build();
                Anime anime = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .episodes(rs.getInt("episodes"))
                        .producer(producer)
                        .build();
                animes.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find all animes", e);
        }
        return animes;
    }

    private static PreparedStatement createPreparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                FROM anime a
                INNER JOIN producer p ON a.producer_id = p.id
                WHERE a.name LIKE ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, String.format("%%%s%%", name));
        return ps;
    }

    public static Optional<Anime> findById(Integer id) {
        log.info("Finding anime by id '{}'", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementFindById(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            Producer producer = Producer.builder()
                    .id(rs.getInt("producer_id"))
                    .name(rs.getString("producer_name"))
                    .build();
            Anime anime = Anime.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .episodes(rs.getInt("episodes"))
                    .producer(producer)
                    .build();
             return Optional.of(anime);
        } catch (SQLException e) {
            log.error("Error while trying to find anime", e);
        }
        return Optional.empty();
    }

    private static PreparedStatement createPreparedStatementFindById(Connection conn, Integer id) throws SQLException {
        String sql = """
                SELECT a.id, a.name, a.episodes, a.producer_id, p.name AS 'producer_name'
                FROM anime a
                INNER JOIN producer p ON a.producer_id = p.id
                WHERE a.id = ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void delete(Integer id) {
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementDelete(conn, id)) {
            ps.execute();
            log.info("Deleted anime '{}' from the database", id);
        } catch (SQLException e) {
            log.error("Error while trying to delete anime", e);
        }
    }

    private static PreparedStatement createPreparedStatementDelete(Connection conn, Integer id) throws SQLException {
        String sql = "DELETE FROM anime WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        log.info("Saving Anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementSave(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying save anime", e);
        }
    }

    private static PreparedStatement createPreparedStatementSave(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime (name, episodes, producer_id) VALUES (?, ?, ?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static void update(Anime anime) {
        log.info("Updating Anime '{}'", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatementUpdate(conn, anime)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying update anime", e);
        }
    }

    private static PreparedStatement createPreparedStatementUpdate(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE anime SET name = ?, episodes = ? WHERE id = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
