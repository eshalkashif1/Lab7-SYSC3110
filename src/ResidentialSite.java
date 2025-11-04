public class ResidentialSite extends Site{

    public  ResidentialSite(double _units, double _rate){
        super(_units, _rate);
    }

    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }
}
