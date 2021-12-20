package lab01;
import java.math.BigDecimal; // for the last problem of the lab

public class chapter02 {

	public static void main(String[] args) {
		System.out.print("R2.5: After the sequence of statements, \n"
				+ "the value should come out to be 0. \n");
		System.out.print("\nR2.6: The problem with the following sequence of statements \n"
				+ "is that the variable 'mystery' was already declared as an integer \n"
				+ "and does not need to be redeclared again (at the end of the statements). \n");
		
		System.out.println("\nBig Decimals Problem:\n");
		BigDecimal a, b, c, d, e;
		a = new BigDecimal("1");
		b = new BigDecimal("2");
		c = new BigDecimal("3");
		d = new BigDecimal("4");
		e = new BigDecimal("5");
		System.out.println(a.add(b));
		System.out.println(b.multiply(c));
		System.out.println(a.subtract(b.subtract(c.subtract(d))));
		System.out.println(a.subtract(b).subtract(c).subtract(d));
		System.out.println(b.multiply(c).subtract(d.multiply(e)));

		
		

	}

}
