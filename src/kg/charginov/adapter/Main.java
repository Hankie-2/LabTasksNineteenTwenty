package kg.charginov.adapter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Balloon balloon1 = new AdapterFirstInterface();
        balloon1.getPressure(20);
        balloon1.amountOfMatter();
        System.out.println(balloon1.toString());

        Balloon balloon2 = new AdapterSecondInterface();
        balloon2.getPressure(20);
        balloon2.amountOfMatter();
        System.out.println(balloon2.toString());
    }
}
