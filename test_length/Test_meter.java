import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: kjjj
 * Date: 6/12/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test_meter {

    @Test
    public void to_test_unit(){

        Meter meter = new Meter(8);

        // String s = meter.to_format(6);

        assertThat(meter.toString(), is("8m"));
    }

}
