package kg.charginov.adapter;

public class AdapterSecondInterface extends Balloon implements SecondInterface{

    @Override
    public void modifVolume(double dv) {
        System.out.println(super.amountOfMatter()-dv);
    }

    @Override
    public double getDp(int to, int T1){
        return super.getPressure(to) - T1;
    }

    @Override
    public String passport() {
        return super.toString();
    }

}