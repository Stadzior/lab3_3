import edu.iis.mto.time.OrderExpiredException;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Kamil on 2016-04-24.
 */
public class OrderTest {

    @Before
    public void initialize(){

    }

    @Test(expected = OrderExpiredException.class)
    public void ShouldThrowException_WhenOrderHasExpired(){

    }
}
