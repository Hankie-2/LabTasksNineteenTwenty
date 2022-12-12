package kg.charginov.facade;

public class Excursion extends Tour{

    private final double priceByTour = 2.0;

    private final PriceService priceService;

    public Excursion(int duration, String country, int hotelStars, Ration ration) {
        super(duration, country, hotelStars, ration);
        priceService = new PriceService();
    }

    @Override
    public void calculatePrice() {
        int priceByCountry = priceService.priceByCountry(getCountry());
        int priceByRation = priceService.priceByRation(getRation());
        System.out.println("Общая сумма поездки на тур 'Экскурсия' равно = " + getDuration() * (priceByCountry + getHotelStars() * 1000 + priceByRation) * priceByTour + " сомов");
    }
}
