import java.math.BigDecimal;

public class BigDecimalExample {

	public static void main(String[] args) {
		System.out.println(0.2 + 0.7);
		
		//BigDecimal b = new BigDecimal("203.47");  // BigDecimal has no empty constructor
		// numbers go in quotes
		System.out.println(new BigDecimal("0.2").add(new BigDecimal("0.7")));
		
		
		
	}

}

