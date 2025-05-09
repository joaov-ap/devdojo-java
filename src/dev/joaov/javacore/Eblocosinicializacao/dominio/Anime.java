package dev.joaov.javacore.Eblocosinicializacao.dominio;

public class Anime {
        private String nome;
        private int[] episodios;

        {
            System.out.println("Dentro do bloco de inicialização");
            episodios = new int[100];

            for (int i = 0; i < episodios.length; i++) {
                episodios[i] = i+1;
            }
        }

        public Anime() {
            for (int episodio: this.episodios) {
                System.out.print(episodio + " ");
            }
            System.out.println();
        }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
