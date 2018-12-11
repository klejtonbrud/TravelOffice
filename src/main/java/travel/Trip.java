abstract class Trip
{
    private Date start;
    private Date end;
    private String destination;
    private double price;

    Trip(Date st, Date en, String dest)
    {
        start = st;
        end = en;
        destination = dest;
    }

    @Override
    public String toString()
    {
        return "\nTrip to " + destination + "\nstart: " + Date.toString(start) + "\nend: " + Date.toString(end) + "\nPrice: " + getPrice() + "\n";
    }

    public Date getStart()
    {
        return start;
    }

    public void setStart(Date start)
    {
        this.start = start;
    }

    public Date getEnd()
    {
        return end;
    }

    public void setEnd(Date end)
    {
        this.end = end;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
