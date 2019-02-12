import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class DataTest {
	private int tipus;
	private String fmtEsperat;
	
	public DataTest(int t,String f) {
		tipus = t;
		fmtEsperat = f;
	}
	@Parameters
	public static Collection <Object[]> parametres() {
		return Arrays.asList(new Object[][] {{1, "2019/01"},
											{2, "01/2019"},
											{3, "01/19"},
											{6, "ERROR"},
											{1, "00000"}});
	}
	@Test
	public void testRetornaData() {
		Data dia = new Data();
		String resultat = dia.retornaData(tipus);
		assertEquals(fmtEsperat, resultat);
	}

}
