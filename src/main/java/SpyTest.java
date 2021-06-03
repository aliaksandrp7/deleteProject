



import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpyTest {

    @Spy
    private Map<Integer, String> map = new HashMap<>();
//dgdg
    @Test
    public void testSpyMapPutDefaultBehavior() {
        //when
//        sdthgwth
        map.put(1, "test");

        //thennn rkulgolgui

    }
}