package max.ru;

public class Dog extends Animal{
    private boolean isNowBarking = false;

    public Dog(String name, int oldYears) {
        super(name, oldYears);
    }

    public boolean isNowBarking() {
        return isNowBarking;
    }

    public void setNowBarking(boolean nowBarking) {
        isNowBarking = nowBarking;
    }

    @Override
    public String howItSound() {
        return "It barks";
    }
}
