package day4.examples;

public class sample1 {
	
       public static void main(String args[]){
try{
	int x= Integer.parseInt(args[0])/Integer.parseInt(args[1]);
	System.out.println("value: "+x);
}
catch(ArrayIndexOutOfBoundsException aie){
System.out.println("you didnt enter command line args");	
System.out.println("aie: "+aie);
}
catch(ArithmeticException ae){
	System.out.println("divide by zero error");
	System.out.println("ae: "+ae);
}
catch(Exception e){
	System.out.println("e:" + e);
	System.out.println(e.getMessage());
}
finally{    	
	System.out.println("end");
}}}
