public class Commandline_add{
	
    public static void main(String[] args) {
    	
        int First = Integer.parseInt(args[0]); //taking the first integer value
        int Second = Integer.parseInt(args[1]);//taking the Second integer value
        
        int Sum = First + Second; //Add the two Integers here..
        
        System.out.println("Sum is " + Sum);//Printing the sum of integers
        
    }
}