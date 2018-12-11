public class DomesticTrip extends Trip
{
    private double ownArrivalDiscount;

    public void setOwnArrivalDiscount(double ownArrivalDiscount)
    {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public double getPrice()
    {
        return super.getPrice()-ownArrivalDiscount;
    }

    public DomesticTrip(Date st, Date en, String dest, float priceOfTrip, double ownArrivalDiscount)
    {
        super(st, en, dest);
        setPrice(priceOfTrip);
        this.ownArrivalDiscount = ownArrivalDiscount;
    }
}
