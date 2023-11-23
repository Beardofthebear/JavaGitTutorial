package max.ru;

public class Cat extends Animal{
    private boolean isNowMeow = false;

    public Cat(String name, int oldYears) {
        super(name, oldYears);
    }

    public boolean isNowMeow() {
        return isNowMeow;
    }

    public void setNowMeow(boolean nowMeow) {
        isNowMeow = nowMeow;
    }

    @Override
    public String howItSound() {
        return "Its meow now";
    }
}
