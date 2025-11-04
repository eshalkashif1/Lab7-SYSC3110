public class ResidentialSite extends Site{

    public  ResidentialSite(double _units, double _rate){
        super(_units, _rate);
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    private double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return _units * _rate;
    }
}
