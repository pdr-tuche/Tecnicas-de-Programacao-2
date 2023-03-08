package exercicio.dois;

public class Cd {
    private String title;
    private String singerName;
    private int numberOfSongs;
    private double price;

    public Cd() {
    }

    public Cd(String title, String singerName, int numberOfSongs, double price) {
        this.title = title;
        this.singerName = singerName;
        this.numberOfSongs = numberOfSongs;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cd{" +
                "title='" + title + '\'' +
                ", singerName='" + singerName + '\'' +
                ", numberOfSongs=" + numberOfSongs +
                ", price=" + price +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(int numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }
}
