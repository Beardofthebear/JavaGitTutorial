package max.ru;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                culculate(1, 4)
        );
        System.out.println(
                culculate(5, 4)
        );
        System.out.println(
                removeAllSpaces("Привет, меня зовут Паша и тут будет куча пробелов        ")
        );

        Game darkSouls = new Game(999, 20, "Dark Souls", "Hardcore", "Ахуенная ебанутая задротсткая игра!");
        darkSouls.getPrice();

        System.out.println(
                darkSouls.toString()
        );
    }

    public static int culculate(int first, int second){
        int result = first + second;
        return result;
    }

    public static String removeAllSpaces(String input){
        return input.replaceAll(" ", "");
    }

    /*
    Задача на следующий урок

    ОСНОВНАЯ ЗАДАЧА
    При вызове метода GiveMePet("Кличка") возвращался питомец и его данные в строке и выводить их в консоль


    ПОДСКАЗКА
    Класс Pet  мог содержать кошек и собак
    так же их возраст и есть или нет прививка и дату привики
    Создай 5 животных 3 кошки и 2 собаки
    И положи их в массив
     */

}




