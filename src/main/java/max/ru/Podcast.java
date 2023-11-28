package max.ru;

public class Podcast {
    String name = "";
    String link = "";

    Podcast(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getLink() {
        return link;
    }
}

