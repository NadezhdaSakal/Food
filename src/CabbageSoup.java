public class CabbageSoup extends Soup implements Broth {
    private String color;
    private String taste;
    private String typeOfBroth;


    public CabbageSoup(String name, int fat) {
        super(name + " Cabbage Soup", 34);

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

    public void addCabbage() {

        this.counter++;
    }

    public void isReady() {

        if (this.counter == 5) {
            System.out.println("Щи готовы! Мммм... Сметанки?");
        }
    }


}
