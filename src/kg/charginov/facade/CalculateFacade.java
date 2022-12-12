package kg.charginov.facade;

public class CalculateFacade {
    private Tour beach;
    private Tour excursion;
    private Tour skiing;

    public CalculateFacade(int duration,String country,int hotelStars,Ration ration) {
        beach = new Beach(duration,country,hotelStars,ration);
        excursion = new Excursion(duration,country,hotelStars,ration);
        skiing = new Skiing(duration,country,hotelStars,ration);
    }

    void callCalculateMethods(){
        beach.calculatePrice();
        excursion.calculatePrice();
        skiing.calculatePrice();
    }

}
