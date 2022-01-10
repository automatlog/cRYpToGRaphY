/******************************************************************************
				Cryptography
		 Atbash ---------> plain---A--------------->Z
		 CT=         Z================>A
*******************************************************************************/

#include<stdio.h>
#include<string.h>
main()
{
//In this A-Z,B-Y....Z-A 
 int i;
 char str[1000];
 printf("Enter a Encrypted sentence\n");
 gets(str); 
 i=0;
 printf("Decrypted Atbash Cipher code\n");
  
while(str[i]!='\0')
  {
 if(!((str[i]>=0&&str[i]<65)||(str[i]>90&&str[i]<97)||(str[i]>122&&str[i]<=127)))// a to z A toZ
 {
   if(str[i]>='A'&&str[i]<='Z')   //checking of string    d->w
   printf("%c",'Z'+'A'-str[i]);             //  z+A-str[i]     25+0-3=22--->w
   if(str[i]>='a'&&str[i]<='z')
   printf("%c",'z'+'a'-str[i]);
 } 
    
    if(((str[i]>=0&&str[i]<65)||(str[i]>90&&str[i]<97)||(str[i]>122&&str[i]<=127)))
    {
      printf("%c",str[i]);    
    }
   i++;
  }
  printf("\n");
}
