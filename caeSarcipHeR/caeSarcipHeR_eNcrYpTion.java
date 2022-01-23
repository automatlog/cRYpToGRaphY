import java.util.*;
class CaesarCipherProgram
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Input the plaintext message : ");
		
        String plaintext = sc.nextLine();
		
        System.out.println("Enter the value by which each character in the plaintext message gets shifted : ");
		
        int shift = sc.nextInt();
		
        String ciphertext = "";
		
        char alphabet;
		
        for(int i=0; i < plaintext.length();i++) 
        {
            alphabet = plaintext.charAt(i);				// Shift one character at a time
            
            if(alphabet >= 'a' && alphabet <= 'z') 		// if alphabet lies between a and z 
            {
				alphabet = (char) (alphabet + shift);      //  A+3=D ,shift alphabet
			 
				if(alphabet > 'z')						 // if shift alphabet greater than 'z'
				{        
					alphabet = (char) (alphabet+'a'-'z'-1); // reshift to starting position 
				}
				ciphertext = ciphertext + alphabet;
			}
            
			// if alphabet lies between 'A'and 'Z'
			else if(alphabet >= 'A' && alphabet <= 'Z') 
			{
				alphabet = (char) (alphabet + shift);    // shift alphabet
             
				if(alphabet > 'Z')			// if shift alphabet greater than 'Z'
				{
                 //reshift to starting position 
                 alphabet = (char) (alphabet+'A'-'Z'-1);
				}
				ciphertext = ciphertext + alphabet;
			}
			else
			{
				ciphertext = ciphertext + alphabet;   
			}
		}
		System.out.println(" ciphertext : " + ciphertext);
	}
}