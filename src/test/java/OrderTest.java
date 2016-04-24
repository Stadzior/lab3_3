import edu.iis.mto.time.ITimeSource;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.TimeSourceFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Kamil on 2016-04-24.
 */
public class OrderTest {
    TimeSourceFactory timeSourceFactory;
    @Before
    public void initialize(){
        timeSourceFactory = Mockito.
    }

    @Test(expected = OrderExpiredException.class)
    public void ShouldThrowException_WhenOrderHasExpired(){

    }
}
