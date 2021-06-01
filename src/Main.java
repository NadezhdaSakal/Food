public class Main {

    public static void main(String[] args) {
        Borshch soup = new Borshch("Borshch", 49);
        CabbageSoup soup1 = new CabbageSoup("Cabbage Soup", 34);


        soup.boilBroth();
        soup.addSalt();
        soup.addPotato();
        soup.addOnionCarrot();
        soup.addBeet();
        soup.addGarlic();
        soup.addBrine();
        soup.isReady();
        soup1.boilBroth();
        soup1.addSalt();
        soup1.addPotato();
        soup1.addOnionCarrot();
        soup1.addCabbage();
        soup1.isReady();

    }


}
