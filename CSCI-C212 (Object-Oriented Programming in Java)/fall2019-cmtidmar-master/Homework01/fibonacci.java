package homework_01;

import java.math.BigInteger; 

public class fibonacci {
  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    int n = Integer.parseInt(args[0]); 
    BigInteger f = fibonacci.fibo(n);  
    long endTime = System.currentTimeMillis(); 
    System.out.println("It took "+(endTime - startTime) + " ms to calculate fibo(" + n + ") = " + f); 
  }
  
    public static BigInteger fibo(int n) { 
        BigInteger b = BigInteger.valueOf(n);
        
        if (b.equals(BigInteger.ZERO)) return BigInteger.ZERO;
        else if (b.equals(BigInteger.ONE)) return BigInteger.ONE;
            
        return fiboHelper(BigInteger.ONE, b, BigInteger.ZERO, BigInteger.ONE); 

    }
  
    public static BigInteger fiboHelper(BigInteger location,
                                 BigInteger target,
                                 BigInteger a,
                                 BigInteger b) {
        if (location.equals(target)) return b;
        else return fiboHelper(location.add(BigInteger.ONE), target, b, a.add(b));
        
        
    }
}