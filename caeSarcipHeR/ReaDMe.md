# caeSarcipHeR
##### The Caesar cipher is named after Julius Caesar, who, according to Suetonius, used it with a shift of three to protect messages of military significance.
##### Caesar cipher (shift cipher) is a simple substitution cipher based on a replacement of every single character of the open text with a character, which is fixed number of positions further down the alphabet.
##### In the times of Julius Caesar used only the shift of 3 characters, but nowadays the term Caesar cipher refers to all variants (shifts) of this cryptosystem.

```
The encryption can be described with the following formula:
Ci= (Ti+k) (mod m)
Ci - i-th character of the closed text
Ti - i-th character of the open text
k - shift
m - length of the alphabet
The process of decryption uses reverted procedure:
Ti= (Ci-k) (mod m)
```
#### Algorithm:
1. The source text that needs to be encrypted is given in lower case. But if you need to decrypt the text, it should be given in upper case.
2. When it is encrypted, each letter will have its ANSII code increased for tree places. When it is decrypted, it will have its code moved toward left.
3. The letter ‘x’ will be translated into ‘A’, the letter ‘y’ is transformed into the letter ‘B’, and the ‘z’ will change into ‘C’.
4. We are keeping this logic very simple so that we can understand the code. Once you get the hang of it, come-up with more complex logic to encrypt and decrypt.
5. The program will handle only English letters and each input text will not be longer that one sentence. At the end of the input sentence it should have the marker for end ‘.’.
6. If you don’t have the sense marker, the longest sentence is 1024 letters long. This is some form of protection, which would prevent the user to input the sentence that would over populate size of the program.
7. The numbers in the input will not be changed.
8. The blank symbol or any non letter symbol will not be changed.
