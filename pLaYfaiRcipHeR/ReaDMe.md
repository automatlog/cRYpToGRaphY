# pLaYfaiRcipHer
##### 



### Psedocode:
1. Remove any punctuation or characters that are not present in the key square (this may mean spelling out numbers, punctuation etc.).
2. Identify any double letters in the plaintext and replace the second occurrence with an 'x' e.g. 'hammer' -> 'hamxer'.
3. If the plaintext has an odd number of characters, append an 'x' to the end to make it even.
4. Break the plaintext into pairs of letters, e.g. 'hamxer' -> 'ha mx er'
5. The algorithm now works on each of the letter pairs.
6. Locate the letters in the key square, (the examples given are using the key square above)

  A. If the letters are in different rows and columns, replace the pair with the letters on the same row respectively but at the other pair of corners of the rectangle
  defined by the original pair. The order is important – the first encrypted letter of the pair is the one that lies on the same row as the first plaintext letter. 'ha' -> 'bo', 'es' -> 'il'
  
  B. If the letters appear on the same row of the table, replace them with the letters to their immediate right respectively (wrapping around to the left side of the row
  if a letter inthe original pair was on the right side of the row). 'ma' -> 'or', 'lp' -> 'pq'.
  
  C. If the letters appear on the same column of the table, replace them with the letters immediately below respectively (wrapping around to the top side of the column
  if a letter in the original pair was on the bottom side of the column). 'rk' -> 'dt', 'pv' -> 'vo'.
