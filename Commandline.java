
public class Commandline {
	public static void main(String args[]) {
		
		if(args.length == 0) {
			System.out.println("No values");
		}
		else {
			for(String i : args) {
				System.out.println(i+",");
			}
				
		}
	}

}
