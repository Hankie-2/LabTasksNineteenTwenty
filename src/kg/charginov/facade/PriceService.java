package kg.charginov.facade;

import java.util.Locale;

public class PriceService {

    public int priceByCountry(String country){
        char countryFirstLetter = country.toLowerCase(Locale.ROOT).charAt(0);

        if(countryFirstLetter >= 'a' && countryFirstLetter <= 'm') return 1000;
        else return 2000;

    }

    public int priceByRation(Ration ration){
        if(ration == Ration.ONE){
            return 500;
        }else if(ration == Ration.TWO){
            return 700;
        }else{
            return 1000;
        }
    }

}
