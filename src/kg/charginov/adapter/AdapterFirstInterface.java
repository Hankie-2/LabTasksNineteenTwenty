package kg.charginov.adapter;

public class AdapterFirstInterface extends Balloon implements FirstInterface{

    @Override
    public double calculateDp(int to, int dT) {
        return super.getPressure(dT) - to;
    }

    @Override
    public void modifMass(double dm) {
        System.out.println(super.amountOfMatter() - dm);;
    }

    @Override
    public String getData() {
        return super.toString();
    }

}