package max.ru;

public class Main {

    private static Animal animals[] = new Animal[4];

    public static void main(String[] args) {

        Animal animal1 = new Animal(true, "Barsik", 18);
        Animal animal2 = new Animal(false, "Mona", 9);
        Animal animal3 = new Animal(false, "Plusha", 6);
        Animal animal4 = new Animal(true, "Zaya", 5);

        animals[0] = animal1;
        animals[1] = animal2;
        animals[2] = animal3;
        animals[3] = animal4;

        String answer = "";
        Animal animalAnswer = GiveMePet("Zaya");

        if( animalAnswer!= null)
            answer = animalAnswer.toString();
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
}











