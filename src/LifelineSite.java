public class LifelineSite extends Site{

    public LifelineSite(double _units, double _rate){
        super(_units, _rate);
    }

    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

    private double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
