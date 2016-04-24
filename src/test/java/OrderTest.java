import edu.iis.mto.time.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class OrderTest {
    TimeSourceFactory timeSourceFactory;
    Order order;
    @Before
    public void initialize(){

        timeSourceFactory = Mockito.mock(TimeSourceFactory.class);
        when(timeSourceFactory.create()).thenReturn(new TimeSourceYearAhead());
        order = new Order(timeSourceFactory);

    }

    @Test(expected = OrderExpiredException.class)
    public void ShouldThrowException_WhenOrderHasExpired(){
        order.submit();
        order.confirm();
    }
}
