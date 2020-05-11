public class hw1{
	  
	   public static void drawTriangle(int N){
	       int i=1;
	       int j=1;
	      while (i<=N){
	            System.out.print("*".repeat(i));	     
                System.out.println();
                i++;  
      }
	              
	   }
	   public static void main(String[] args) {
      if (args.length<1){
            System.out.println("Please enther command line arguments.");
	      }
	      for(int i=0; i<args.length; i++){
	            int N= Integer.parseInt(args[i]);
	            drawTriangle(N);
	      }
	   }
	}