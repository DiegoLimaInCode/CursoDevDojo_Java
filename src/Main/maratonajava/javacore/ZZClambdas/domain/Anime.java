package Main.maratonajava.javacore.ZZClambdas.domain;

public class Anime {
    private String title;
    private int episodies;

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodies=" + episodies +
                '}';
    }

    public Anime(String title, int episodies) {
        this.title = title;
        this.episodies = episodies;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodies() {
        return episodies;
    }
}
