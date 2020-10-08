package exceptionsHandling;

public class PracticeExceptionHandling {

	public static void main(String[] args) {

       try {
    	   int a = 7;
    	   int b = 0;
    	   int c = a/b;
    	   System.out.println(c);
       }catch(ArithmeticException e) {
    	   System.out.println(e.getMessage()+" the value of denomenator can't be 0");
       }
       finally {
    	   System.out.println("bye bye");
       }
       }

	}

