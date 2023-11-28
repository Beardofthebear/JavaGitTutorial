package max.ru;

public class Main {
    public static Podcast podcastList[] = new Podcast[3];

    public static void main(String[] args) {
        podcastList[0] = new Podcast("English podcast", " gfgfhhjg");
        podcastList[1] = new Podcast("Game podcast", " 1238585767");
        podcastList[2] = new Podcast("News podcast", " zxcvcbvnv");
        String result = getLinkByName("News podcast", podcastList);
        System.out.println(result);
    }

    public static String getLinkByName(String name, Podcast[] podcastList) {
        for (Podcast hgjhgj : podcastList
        ) {
            if (name == hgjhgj.name) {
                return hgjhgj.link;
            }
        }
        return "Нет такой ифнормации";
    }
}











