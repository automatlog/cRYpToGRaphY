import java.util.*;
class atbashcipher
{
	private static Scanner in;
	
	public static void main(String[] args)
	{
		in=new Scanner(System.in);
		
		System.out.println("Encrytion : ");
		cipherEncrypt();
		
		System.out.println("Decryption : ");
		cipherDecrypt();
	}
	
	private static void cipherEncrypt()
	{
		String alpa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String rev="";
	
		for (int i =alpa.length()-1;i>-1;i--)
		{
			rev+=alpa.charAt(i);
		}
		System.out.println("ENTER TEXT : ");
		String mess=in.nextLine();
	
		mess=mess.toUpperCase();
		String encryText="";
	
		for (int i =0;i<mess.length();i++)
		{
			if(mess.charAt(i)==(char)32)
			{
				encryText+=" ";
			}
			else
			{
				int count=0;
				for(int j=0;j<alpa.length();j++)
				{
					if(mess.charAt(i)==alpa.charAt(j))
					{
						encryText+=rev.charAt(j);
						break;
					}
				}
			}
		}

		System.out.println("THE ENCRYPTED CODE IS : "+encryText);
	}
	
	private static void cipherDecrypt()
	{
		String alpa="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String rev="";
		
		for (int i =alpa.length()-1;i>-1;i--)
		{
			rev+=alpa.charAt(i);
		}
		
		System.out.println("ENTER ENCRYPTED TEXT : ");
		String mess=in.nextLine();
		mess=mess.toUpperCase();
		String dencryText="";
		
		for (int i =0;i<mess.length();i++)
		{
			if(mess.charAt(i)==(char)32)
			{
				dencryText+=" ";
			}
			else
			{
				int count=0;
				for(int j=0;j<rev.length();j++)
				{
					if(mess.charAt(i)==rev.charAt(j))
					{
						dencryText+=alpa.charAt(j);
						break;
					}
				}
			}
		}
		System.out.println("THE DECRYPTED CODE IS : "+dencryText);
	}
}
