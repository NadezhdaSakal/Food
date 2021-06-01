public abstract class Soup implements Broth {

    private String name;
    private int fat;
    protected int counter;

    protected Soup(String name, int fat) {
        this.name = name;
        this.fat = fat;
    }

    public void boilBroth() {
        this.counter++;

    }

    public void addSalt() {

        this.counter++;
    }


}