public class AbroadTrip extends Trip
{
    private double insurance;

    public void setInsurance(double insurance)
    {
        this.insurance = insurance;
    }

    @Override
    public double getPrice()
    {
        return super.getPrice()+insurance;
    }

    public AbroadTrip(Date st, Date en, String dest, double priceOfTrip, double insurance)
    {
        super(st, en, dest);
        setPrice(priceOfTrip);
        this.insurance = insurance;
    }
}
