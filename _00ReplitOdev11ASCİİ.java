package _00Replit;



public class _00ReplitOdev11ASCİİ {

	
	public static void main(String[] args) {
	
		char character ='a';  
		
		int ascii= (int)character;
		while (ascii <= 122) 
			
		{	System.out.println("Ascii value of " + (character++ ) + " = " + ascii);
			ascii++;
		}
		System.out.println();
	}

}