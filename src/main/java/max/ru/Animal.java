package max.ru;

public class Animal {
    private boolean isCat = false;
    private String name = "";
    private int oldYears = 0;
    private boolean vactination = false;
    private String timeVactinatio = "";

    public Animal(boolean isCat, String name, int oldYears) {
        this.isCat = isCat;
        this.name = name;
        this.oldYears = oldYears;
    }

    public Animal(boolean isCat, String name, int oldYears, boolean vactination, String timeVactinatio) {
        this.isCat = isCat;
        this.name = name;
        this.oldYears = oldYears;
        this.vactination = vactination;
        this.timeVactinatio = timeVactinatio;
    }

    public boolean isCat() {
        return isCat;
    }

    public void setCat(boolean cat) {
        isCat = cat;
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
                "isCat=" + isCat +
                ", name='" + name + '\'' +
                ", oldYears=" + oldYears +
                ", vactination=" + vactination +
                ", timeVactinatio='" + timeVactinatio + '\'' +
                '}';
    }
}

