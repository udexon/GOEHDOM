`<img src="https://github.com/udexon/GOEHDOM/blob/master/phos.png" width="350" title="hover text">`

<img src="https://github.com/udexon/GOEHDOM/blob/master/Sort/sort_phos.png" width="350" title="hover text">

Phos is a Forth like programming language using Reverse Polish Notation. It is implemented as "stack machine shell" (Smashlet) in a high level host programming language, such as PHP or JavaScript.

The example above shows a Phos PHP Smashlet script for bubble sort. 

Words (a Forth jargon referring to function names) ending with colon (':') are function words, which map to functions in the host programming language. The colon suffix is a Phos convention not found in Forth, implemented for convenience as well as to distinguish from standard Forth words. Phos function words either adopt conventions in Forth or host programming language. Input parameters are assumed to be on the data stack.

```
l: label, used for branch functions.
bz: branch if zero
bzk: branch forward k tokens if zero (negative k for backward branch). Used to replace if-then-else.
esp: echo with space
dup: duplicate top of stack (TOS) item
nl: new line
... n2 n1 n0 N nle: compare N-th and (N-1)-th elements on stack, 1 if n1 <= n0 (less than or equal, 'le')
... n2 n1 n0 N nswap: swap N-th and (N-1)-th elements on stack
```
