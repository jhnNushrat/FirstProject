package Array;

public class ReturningArray {

	public static void main(String[] args) {
		//call the method and the result will store in returnval variable as String 
		String[] returnval= PrintArray();
		for(int i=0;i<returnval.length;i++)
			System.out.println("Print all the values of an array ==> " + returnval[i]);

	}

	//this method returns an array of type String
	public static String[] PrintArray(){
		String[] Name={"Nushrat","Papri","john"};
		
		return Name;
	}
			
}