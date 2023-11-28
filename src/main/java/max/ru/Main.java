package max.ru;

public class Main {

    private static Podcast podcasts[] = newPodcast[4];
    public static void main (String[] args){
        Podcast podcast1 = new englishPodcast ("Emotional English", "https://music.yandex.ru/album/18524790?dir=desc&activeTab=about");
        Podcast podcast2 = new educationPodcast ("TED","https://music.yandex.ru/album/23063675?dir=desc&activeTab=about");
        Podcast podcast3 = new newsPodcast ("Red Barn: С чего начать","https://music.yandex.ru/users/RedBarn.ru/playlists/1000";
        Podcast podcast4 = new gamePodcast ("https://music.yandex.ru/album/27559913?activeTab=about","https://music.yandex.ru/album/27559913?activeTab=about;")

        podcasts[0] = englishPodcast;
        podcasts[1] = bookPodcast;
        podcasts[2] = newsPodcast;
        podcast [3] = gamePodcast;

        String answer = " ";
        String link = " "; // Вопрос как инациализировать ссылку?
        Podcast podcastAnswer = ShowPodcast("English Time");
        if(podcastAnswer ! = null)
        answer = podcastAnswer.informationAboutPodcast();
        else
        answer = "Not information";


}

  /*  private static Animal animals[] = new Animal[4];

    public static void main(String[] args) {

        Animal animal1 = new Cat("Barsik", 18);
        Animal animal2 = new Dog("Mona", 9);
        Animal animal3 = new Dog("Plusha", 6);
        Animal animal4 = new Cat("Zaya", 5);

        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;
        animals[3] = animal4;

        String answer = "";
        Animal animalAnswer = GiveMePet("Mona");

        if( animalAnswer!= null)
            answer = animalAnswer.howItSound();
        else
            answer = "Я не нашел такое животное";

        System.out.println(answer);
    }


    private static Animal GiveMePet(String petName) {
        Animal findedAnimal = null;
        for (Animal animal : animals) {
            if (petName.equals(animal.getName())) {
                findedAnimal = animal;
                break;
            }
        }

        return findedAnimal;
    }










