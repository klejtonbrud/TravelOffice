import java.util.regex.*;

public class Date
{
    private int day;
    private int month;
    private int year;

    Date(String txt)
    {
        Pattern ptn = Pattern.compile("(\\.|-|\\/|\\\\)");
        String[] parts = ptn.split(txt);

        day = Integer.valueOf(parts[0]);
        month = Integer.valueOf(parts[1]);
        year = Integer.valueOf(parts[2]);
    }

    public static String toString(Date date)
    {
        return date.day + "." + date.month + "." + date.year;
    }

}
