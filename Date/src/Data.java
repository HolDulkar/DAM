import java.text.SimpleDateFormat;
import java.util.Date;
public class Data {
	SimpleDateFormat fmat;
	Date avui;
	
	public Data() {
		avui = new Date();
	}
	public String retornaData(int tipus ) {
		String cad = "";
		
		switch (tipus) {
		case 1: {
			fmat = new SimpleDateFormat("yyyy/MM");
			cad = fmat.format(avui);
			break;
		}
		case 2: {
			fmat = new SimpleDateFormat("MM/yyyy");
			cad = fmat.format(avui);
			break;
		}
		case 3: {
			fmat = new SimpleDateFormat("MM/yy");
			cad = fmat.format(avui);
			break;
		}
		default: {
			cad = "ERROR";
		}
	}
	return cad;
}
}
