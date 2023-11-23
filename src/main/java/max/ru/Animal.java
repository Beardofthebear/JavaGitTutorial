package max.ru;

public class Animal {
    private String name = "";
    private int oldYears = 0;
    private boolean vactination = false;
    private String timeVactinatio = "";

    public Animal(String name, int oldYears) {
        this.name = name;
        this.oldYears = oldYears;
    }

    public Animal(String name, int oldYears, boolean vactination, String timeVactinatio) {
        this.name = name;
        this.oldYears = oldYears;
        this.vactination = vactination;
        this.timeVactinatio = timeVactinatio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOldYears() {
        return oldYears;
    }

    public void setOldYears(int oldYears) {
        this.oldYears = oldYears;
    }

    public boolean isVactination() {
        return vactination;
    }

    public void setVactination(boolean vactination) {
        this.vactination = vactination;
    }

    public String getTimeVactinatio() {
        return timeVactinatio;
    }

    public void setTimeVactinatio(String timeVactinatio) {
        this.timeVactinatio = timeVactinatio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", oldYears=" + oldYears +
                ", vactination=" + vactination +
                ", timeVactinatio='" + timeVactinatio + '\'' +
                '}';
    }

    public String howItSound(){
        return "silence";
    }
}

