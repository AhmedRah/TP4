package td4.gestionVol;

import org.hamcrest.core.IsInstanceOf;
import org.junit.jupiter.api.Test;
import java.sql.SQLOutput;
import java.util.concurrent.Callable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestGestVol {
    @Test
    public void testNumVol(){
        // Tests de reussite
        assertThat(NumVol.set_numvol("24XC12"),equals("24XC12"));
        // Tests d'echec
        assertThat(exceptionOf(()-> NumVol.set_numvol("000000")), instanceof(IllegalArgumentException.class));
    }
    @Test
    public void testCompagnie(){
        // Test de reussite
//        assertThat(Company.propose("24"));
    }




    //Help you to handle exception. :-)
    public static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }
}
