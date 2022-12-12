package kg.charginov.adapter;

public class Balloon {

    private double volume;

    private double mass;

    private double molar;

    public double getPressure(int T){
        return T*3.14;
    }

    public double amountOfMatter(){
        return volume*mass;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "volume=" + volume +
                ", mass=" + mass +
                ", molar=" + molar +
                '}';
    }
}
