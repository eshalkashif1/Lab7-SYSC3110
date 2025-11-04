public class ResidentialSite extends Site{

    public  ResidentialSite(double _units, double _rate){
        super(_units, _rate);
    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    @Override
    protected double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }

    @Override
    protected double getBaseAmount() {
        return _units * _rate;
    }
}
