public class Borshch extends Soup implements Broth {

    private String color;
    private String taste;
    private String typeOfBroth;


    public Borshch(String name, int fat) {
        super(name + " Borshch", 49);

        this.color = "yellow";
        this.taste = "saturated";
        this.typeOfBroth = "meetBroth";
        this.counter = 0;
    }



    public void addPotato() {

        this.counter++;
    }

    public void addOnionCarrot() {

        this.counter++;
    }

    public void addBeet() {
        this.color = "brown";
        this.doSautBeet();
        this.counter++;
    }

    private void doSautBeet() {

        this.color = "ruby";
    }

    public void addGarlic() {

        this.counter++;
    }

    public void addBrine() {

        this.counter++;
    }

    public void isReady() {

        if (this.counter == 7) {
            System.out.println("Борщ готов! Очень вкусно, хватай пампушку!");
        }
    }
}

