# Queue-and-Stack-data-structures

Question0.java
A Queue may be considered as a linked list in which node insertion is done at the back of the list
and deletion is done in front (analogous to the queue at a super market). This program
creates a queue, add elements to the queue and delete elements from the queue.

Question1.java
A stack may be thought of as a linked list in which insertion/deletion is performed at the “top” of
the list (similar to the way a stack of plates works, the last plate to go in is the first one to come out,
conventionally). This menu driven program adds elements to the stack and deletes elements
from the stack and prints out Stack is empty when the user tries to delete from or
display a Stack with no elements in it.

Question2.java
Queues are used extensively in situations where the input or output has to be delayed because of
reasons such as limitations in data transfer rates or processing capabilities. These queues are called
I/O buffers.
This program simulates the operation of a first in first out I/O buffer using a linked queue data
structure. 
The program allows the user to continually enter lines of text until they enter a line starting
with the letter X. While the user enters the lines of text, process the input as follows:
• If the first character is O (Oh), extract the next string from the buffer and print it out
prefixed with “Data:”. If all the data has been extracted from the queue or there is no data in
the queue, output "Buffer empty"
• If the first character is X, exit.
• Otherwise, store the string in the buffer.

Question3.java
This program identifies mismatched brackets. This happens when there are too many opening
brackets ('{', '[', '(' and '<') and not enough closing brackets ('}', ']', ')' and '>'), or vice versa; or when
an opening bracket of one type corresponds to a closing bracket of another type, for example if a '('
is closed by a ']'.
The program takes a string as input. It then scans the string, checking that all brackets
match. If it encounters an opening bracket that does not match its corresponding closing bracket, it
should print a message to that effect and then terminate any further checking as further errors will
be ambiguous. If, at the end of the scan, there remain unclosed brackets or excess closing brackets,
a message should be printed to that effect.
This problem is best solved using a stack, by popping brackets from the end off and storing
them in another stack until an opening bracket is found.
It may be helpful to write other methods such as ones that check whether a bracket is an opening or
closing bracket and ones that return the corresponding bracket to a given bracket. However, these
are not essential.

Question4.java
Reverse Polish Notation is an alternative way of writing arithmetic expressions where the operator
is supplied after the 2 arguments. For example, "3 2 +" is equivalent to the traditional "3+2" and "3
2 * 1 +" is equivalent to the traditional "(3*2)+1". See Wikipedia for more details and examples.
This program to calculates the value of an integer expression in Reverse Polish Notation using a
linked stack data structure to store intermediate values. 
The basic algorithm is to scan over the expression (a space-separated list of symbols) from left to
right and:
• when an integer is encountered, push it onto the stack;
• when an operator is encountered, pop 2 integers off the stack, perform the operation and
push the result back onto the stack; and
• when no more symbols are left, pop the answer off the stack.
The operators to be supported are +/*-. Note that "4 2 -" evaluates to 2 and "4 2 /" evaluates to 2.
Your program must also cater for the following errors:
• Insufficient arguments for <operator>, where less than 2 arguments are provided. For
example, "3 +"
• Integer expected but not found, where a value is not an integer. For example, "3 f +"
• Extra symbols in expression, where the expression has been fully processed but more than
one value remains on the stack. For example, "3 2 + 4"
• Insufficient symbols in expression, where the expression has been fully processed but there is
no answer left on the stack. For example, "".
