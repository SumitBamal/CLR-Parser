# CLR-Parser
Run the file clr.py for making CLR table for grammar you provide and then parse a string for the same.

Sample input :
&nbsp;&nbsp;&nbsp;&nbsp; 

 Example Grammar -\
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; S->AA\
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A->aA\
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; A->b\
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; end 

Example Strings -\
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  aaabab\
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  bb\
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  abb\
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  bab

# Running the parser

1.<code>$python3 clr.py

2.Then enter the grammer, the grammer will be parsed and r-r, s-r conflicts will indicate that the grammar is not CLR.

3.Then enter the string to be parsed.
