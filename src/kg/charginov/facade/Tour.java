package kg.charginov.facade;

public abstract class Tour {

    private int duration;

    private String country;

    private int hotelStars;

    private Ration ration;

    public Tour(int duration, String country, int hotelStars, Ration ration) {
        this.duration = duration;
        this.country = country;
        this.hotelStars = hotelStars;
        this.ration = ration;
    }

    public Tour() {
    }

    public abstract void calculatePrice();

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getHotelStars() {
        return hotelStars;
    }

    public void setHotelStars(int hotelStars) {
        this.hotelStars = hotelStars;
    }

    public Ration getRation() {
        return ration;
    }

    public void setRation(Ration ration) {
        this.ration = ration;
    }
}
