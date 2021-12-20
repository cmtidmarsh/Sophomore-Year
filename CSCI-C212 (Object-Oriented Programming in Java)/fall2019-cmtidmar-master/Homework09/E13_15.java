/*
 * Implement a SubstringGenerator that generates all substrings of a string. For example, the substrings of the string "rum" are the seven strings
 * "r", "ru", "rum", "u", "um", "m", ""
 */


public class E13_15 {
	public static void main(String[] args) {
	       String[] result = E13_15.generate("rum");
	       for (int i = 0; i < result.length; i++) {
	           System.out.print("\"" + result[i] + "\"");
	           if (result.length - 1 != i)
	               System.out.print(", ");
	        }
	        System.out.println();
	}
		public static String[] generate(String str) {
	        int len = str.length();
	        int k = 0;
	        String[] result = new String[1 << len];
	        for (int i = 0; i < (1 << len); i++) {
	            StringBuilder sub = new StringBuilder();
	            for (int j = 0; j < len; j++) {
	                if ((i & (1 << j)) > 0)
	                    sub.append(str.charAt(j));
	            }
	            result[k] = sub.toString();
	            k++;
	        }
	        return result;
	    }

	    }