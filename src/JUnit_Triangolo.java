import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnit_Triangolo {

	@Test
	void testArea1() {
		Triangolo t=new Triangolo(4,2);
		double risultatoAtteso=4;
		double risultatoOttenuta=t.area();
		assertEquals( risultatoAtteso, risultatoOttenuta);
	}

	@Test
	void testArea2() {
		Triangolo t=new Triangolo(1,2);
		double risultatoAtteso=1;
		double risultatoOttenuta=t.area();
		assertEquals( risultatoAtteso, risultatoOttenuta);
	}
	
	@Test
	void testArea3() {
		Triangolo t=new Triangolo(5,2);
		double risultatoAtteso=4;
		double risultatoOttenuta=t.area();
		assertEquals( risultatoAtteso, risultatoOttenuta);
	}
}
