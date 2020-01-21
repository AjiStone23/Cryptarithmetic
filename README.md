# Cryptarithmetic

Cryptarithmetix exercise from docgunthrop @ codewars


Alphametics is a type of cryptarithm in which a set of words is written down in the form of a long 
addition sum or some other mathematical problem. The objective is to replace the letters of the alphabet 
with decimal digits to make a valid arithmetic sum.

Test Examples

INPUT: "SEND + MORE = MONEY"   
SOLUTION: "9567 + 1085 = 10652"
 
INPUT:"ZEROES + ONES = BINARY"               
SOLUTION:"698392 + 3192 = 701584"           
        
INPUT: "COUPLE + COUPLE = QUARTET"  
SOLUTION: "653924 + 653924 = 1307848"

INPUT: "DO + YOU + FEEL = LUCKY"     
SOLUTION: "57 + 870 + 9441 = 10368"
        
INPUT: "ELEVEN + NINE + FIVE + FIVE = THIRTY"   
SOLUTION: "797275 + 5057 + 4027 + 4027 = 810386"
                    
INPUT: "ZEROES + ONES = BINARY"               
SOLUTION: "698392 + 3192 = 701584"              

INPUT: "ELEVEN + NINE + FIVE + FIVE = THIRTY"  
SOLUTION: "797275 + 5057 + 4027 + 4027 = 810386"

     
Technical Details

    All alphabetic letters in the input will be uppercase
    Each unique letter may only be assigned to one unique digit
    Inputs must be of type   "AAAA + BBBBB + .... + NNNNNN = LLLLLLL"
    As a corollary to the above, there will be a maximum of 10 unique letters in any given test
    No leading zeroes
    The equations will only deal with addition with multiple summands on the left side and one term on the right side
    
    
   [Wikipedia Link](https://en.wikipedia.org/wiki/Verbal_arithmetic) 
    
    
    Anton Pavlis constructed an alphametic in 1983 with 41 addends:

    SO + MANY + MORE + MEN + SEEM + TO + SAY + THAT +
    THEY + MAY + SOON + TRY + TO + STAY + AT + HOME +
    SO + AS + TO + SEE + OR + HEAR + THE + SAME + ONE +
    MAN + TRY + TO + MEET + THE + TEAM + ON + THE +
    MOON + AS + HE + HAS + AT + THE + OTHER + TEN
     = TESTS

(The answer is that TRANHYSMOE=9876543210.)
