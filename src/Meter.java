/**
 * Created with IntelliJ IDEA.
 * User: kjjj
 * Date: 6/12/13
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {
    int value;
    public Meter(int i) {
        value=i;
        //To change body of created methods use File | Settings | File Templates.
    }


   /*
    public static void main(String[] args) {
        Meter meter = new Meter(6);
        String s = meter.to_format(6);
        System.out.println(meter);
    }   */



    @Override
    public String toString() {

        return value + "m";
    }
}
