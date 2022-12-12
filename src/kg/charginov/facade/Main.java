package kg.charginov.facade;

public class Main {
    public static void main(String[] args) {

        int duration = 10;
        String country = "Kazakhstan";
        int hotelStars = 5;
        Ration ration = Ration.TWO;

//        Tour beach = new Beach(duration,country,hotelStars,ration);
//        beach.calculatePrice();
//
//        Tour excursion = new Excursion(duration,country,hotelStars,ration);
//        excursion.calculatePrice();
//
//        Tour skiing = new Skiing(duration,country,hotelStars,ration);
//        skiing.calculatePrice();

        CalculateFacade calculateFacade = new CalculateFacade(duration,country,hotelStars,ration);
        calculateFacade.callCalculateMethods();

    }
}
