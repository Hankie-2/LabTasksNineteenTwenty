package kg.charginov.facade;

public class Beach extends Tour{

    private final double priceByTour = 1.5;

    private final PriceService priceService;

    public Beach(int duration, String country, int hotelStars, Ration ration) {
        super(duration, country, hotelStars, ration);
        priceService = new PriceService();
    }

    @Override
    public void calculatePrice() {
        int priceByCountry = priceService.priceByCountry(getCountry());
        int priceByRation = priceService.priceByRation(getRation());
        System.out.println("Общая сумма поездки на тур 'Пляж' равно = " + getDuration() * (priceByCountry + getHotelStars() * 1000 + priceByRation) * priceByTour + " сомов");
    }

}
