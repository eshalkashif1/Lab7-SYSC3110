public class LifelineSite extends Site{

    public LifelineSite(double _units, double _rate){
        super(_units, _rate);
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }

    private double getBaseAmount() {
        return _units * _rate * 0.5;
    }
}
