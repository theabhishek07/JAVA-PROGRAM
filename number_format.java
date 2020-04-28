import java.util.*;
import java.text.*;
public class number_format {
    public static void main(String[] args) {
        double d=12345.546;
        NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);//To get the NumberFormat object for default Locale
        System.out.println("number format representation of :" +d +"is" +nf.format(d));
    }
    
}
