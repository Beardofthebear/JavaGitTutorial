package max.ru;

public class Game {
    private int price = 0;
    private int count = 0;
    private String name = "";
    private String genre = "";
    private String review = "";

    public Game(int price, int count, String name, String genre, String review) {
        this.price = price;
        this.count = count;
        this.name = name;
        this.genre = genre;
        this.review = review;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getReview() {
        return review;
    }

    @Override
    public String toString() {
        return "Game{" +
                "price=" + price +
                ", count=" + count +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}
