## Homoiconic Graph Theory

- Homoiconic Transformation
- Universal Derivative Homoiconicity
- Homoiconic Graph Machine & Homoiconic Graph Search

#### Introduction

We implemented an inverse of the shunting yard algorithm in several high level programming languages, thus establishing the foundation of homoiconic transformation.

Homoiconic transformation refers to the transformation of non-homoiconic code in high level programming language into homoiconic form, and vice versa.

Specifically, we employ a form of Reverse Polish Notation based on the Forth programming language in homoiconic transformation. As the operands and operations of homoiconic transformation can both be represented as graph objects, we also refer to them as homoiconic graph. 

The theory, virtual machine and search algorithms associated with homoiconic graph are called homoiconic graph theory, homoiconic graph machine and homoiconic graph search respectively.





#### Homoiconic Transformation

[Dijkstra's Shunting Yard Algorithm (DSYA)](https://en.wikipedia.org/wiki/Shunting-yard_algorithm) might be regarded as the common ancestor of subsequent programming languages. It was central to the design of ALGOL, which influenced all other modern programming languages.

Although the Forth programming language has been implemented in many host Programming Languages in the past, I believe I was the first to coin the term ***Inverse Shunting Yard Algorithm (ISYA)*** as a generalization of *translating reverse Polish notation into a host (high level, "third generation") programming language,* which is effectively the inverse of Dijkstra's now legendary Shunting Yard Algorithm (DSYA). In summary, the steps include parsing a list of tokens in the Reverse Polish Notation, pushing non-function tokens on to the stack, and executing a function upon reading a function token.

We would like to introduce the term "homoiconic transformation" to refer to process of transforming non-homoiconic code into homoiconic form, involving the use DYSA and ISYA. 


#### Forth & Phos Smashlets

We have selected several Forth implementations in high level host programming languages as reference:

https://github.com/udexon/GOEHDOM/blob/master/Forth_ports.md

In most of these Forth ports, the developers did not focus on high level issues, e.g. integrating mainstream, host programming language functions, into the Forth framework, but rather, satisfied themselves with executing a partial set of Forth words (function names in Forth lingo). As such, integrating with functions of host programming languages becomes one of the main goals of Phos Smashlet:

https://github.com/udexon/GOEHDOM/blob/master/Phos_Smashlet.md

The examples above illustrate fundamental tree operations using Phos RPN commands. The following examples include: 

https://github.com/udexon/GOEHDOM/blob/master/Phos_Examples.md

- a simple loop
- algebraic distributive law
- download and ranking of Instagram images
- Android: Kotlin, Java, C++
- Linux C++

The following file illustrates Phos commands implemented in PHP:

https://github.com/udexon/GOEHDOM/blob/master/w_phos_include


#### Program as Graph

Graph theory has been employed in many areas in computer science as well as other areas in mathematics.

Although homoiconicity has been regarded as one of the fundamental topics in computer programming, it has not beeen studied extensively, due to various difficulties that we ....

We believe with the homoiconic transformation as outlined above, we may establish a theoretical foundation for the study of homoiconicity using graph theory, hence called "homoiconic graph theory" (HGT).

In homoiconic graph theory (HGT), we model a program and its constituents as graphs. Using HGT, any function within a program can be transformed into its homoiconic equivalent, in the form of Reverse Polish Notaion (RPN). Crucially, an RPN expression can be readily processed by another RPN expression, by definition of its homoiconic property. As such, HGT enables the implementation of type III graph search (GS3), which is described below:

1. Type I Graph search (GS1): 
- simple look up. 
- hello world, print string: search from string buffer. 
- database query.

2. Type II Graph search (GS2): 
- search involving predefined functions written by programmers, map, inverse kinematics, chess.

3. Type III Graph search (GS3): 
- homoiconic composite functions. 
- Target functions can be composed from existing functions. 
- make GS2 and GS1 functions as search candidates / targets.

Human programmer is the homoiconic interface or homoiconic graph machine that performs homoiconic transformation of code, then compose new code.

Programming can be modeled as graph modifying operations, specifically type III graph search.


#### Portability of Homoiconic Transformation

One of primary the novelties of our solution is its portability, which enables it, in theory, to be implemented in any known host programming language. We have tested it on the following programming languages: 

- C, C++, Java, Kotlin, JavaScript, PHP, Python, Rust, Haskell, Forth, LISP, Go

Based on the sample code which we have made available, we believe it will only take a competent student taking up introductory programming courses as little as one week to port our solution, called Phos Smashlet, to a programming language of his (her) choice. 




#### Human level artificial intelligence is type III graph search (GS3)

Homoiconic Graph Search as Model of Human Level Artificial Intelligence

Armed with Homoiconic Graph Theory, converting GS1 and GS2 to homoiconic form is no longer rocket science -- but free software labour.

GS3: includes computer algebra system (limited, cannot unify with GS1 and GS2? proof: has tree manipulation functions, e.g. python sympy) and human ability to program?



#### To Do: Relationship from fundamental graph operations in Phos Smashlet to GS3 

The portability of homoiconic transformation is crucial to the viability of bootstrapping machine intelligence, as it enables us to access code written in practically any known programming language, including assembly language of most microprocessors, using one universal script, ie. Reverse Polish Notation, and examine their relationships. 

As we are able to represent all known code in RPN, we may attempt to build a hierarchy of code, starting from the most primitive assignment operation to the most complex numerical functions. 

Huge Forth and LISP code base. LISP mathematics. previously no way to integrate and analyze. Phos can.

We will be able to construct functions that compose functions using primitive functions, based on the homoiconic properties of RPN.

An RPN operator is homoiconic as it can become an operand of another RPN operator.


#### Link to GOEHDOM War Game Improvement



#### Unification of Programming and Mathematics

While there has been no ?? mathematical model on homoiconic transformation, HT intrinsically by definition can bootstrap its own mathematical model. Use homoiconic code to build mathematical model to analyze homoiconic code.

The scope of code to be examined could range from simple PHP associative array to 3D multiplayer games.

GOEHDOM, human vs. machine maintaining free software repositories. 

Now it is possible to compare and analyze function composition in Phos vs. other programming languages. Previously not possible. This is one of the most crucial benefits of Phos.

Discuss simple tree to type III search.

https://patentscope.wipo.int/search/de/detail.jsf;jsessionid=1BDC0AAFEDCE961DF969E9DC9F63FAB2.wapp2nC?docId=US225266147&tab=PCTDESCRIPTION

Patent did not mention RPN!!

Theoretical issues can be addressed using homoiconic code build up itself!!

[Phos multitiered stack machine](http://5gl.epizy.com/nsm/Phos.html) demonstrates the viability of implementing a shell to execute Phos commands within any known host programming language.

By definition, we do not know how much homoiconic code will be needed to achieve human level artificial intelligence. However, through trials, when we have 100 or 1000 Phos code example, we may begin to find a pattern, just like any scientific experiment. 

Time from now to Technological singularity, time to build 100k Phos function for self question answering?

Concepts need to be built based on code. eg. pointers. Same with stack machine. 

Homoiconicity refers to ....

Derivative homoiconicity ....

Universal Derivative Homoiconicity ....

#### Learning Curve

#### Benefits of Learning Phos

:: Needs to elaborate as it is a new language. Use this as tutorial and marketing piece.

One may wonder what the benefits of learning Phos are, compared to the at least a dozen of well publicized and well documented new programming languages, supported by huge corporations? 

Graph theory, fundamental of programming, mathematics, unification of programming and mathematics.

3 most important reasons first, others later:

- fundamental of graph and stack machine programming
- Forth can provide the above, but no ecosystem to learn, hence Phos let programmers to create own ecosystem compatible with existing habits, from JavaScript to Android NDK. Cite examples.
- to understand the concepts and motivations proposed in this project.

Phos does not conflict with other ecosystems, but is the glue to integrate all ecosystems.


#### Programming & Other Human Tasks as GS3


#### End

The example in .... illustrate several fundamental operations of graph theory, specifically, using reverse Polish notation, which itself can be represented by a tree, to construct a tree.  This is fundamental property of RPN being homoiconic.

We model all programs written by human, as well as the mechanisms how human write programs, as search algorithms.

:: notes

- Homoiconic Graph Theory
- Homoiconic Graph Machine
- Homoiconic Graph Search

Homoiconic Graph Search (HGS)

Homoiconic Graph Machine HGM??

:: Emphasize word "graph"

:: notes (use this tag to separate edited text and unedited notes)

:: since unedited notes are not organized, move useful one to front, unused notes to back

Homoiconic transformation: transform non homoiconic code into homoiconic form. 

:: Focus on this as theoretical basis of code transformation to convince readers. 

Homoiconic transformation = Shunting Yard Algorithm + Inverse

https://github.com/udexon/ISYA/blob/master/README.md


#### fundamental graph operations in PMSM vs. GS3 

:: temporary section heading

https://github.com/udexon/GOEHDOM/blob/master/PMSM.md

Screenshot illustrates fundamental operations of tree / Graph Theory ...


#### Main Contribution

As we are able to represent all known code in RPN, we may attempt to build a hierarchy of code, starting from the most primitive assignment operation to the most complex numerical functions. 
We will be able to construct functions that compose functions using primitive functions, based on the homoiconic properties of RPN.



#### Universal Derivative Homoiconicity

#### Homoiconic Graph Machine & Homoiconic Graph Search

:: Do not write more than 5 sections per Gmail. Copy section headings to top of Gmail for reference.

:: Organize old notes in Gmail

:: Must write to motivate others as pioneers. This is the reality I must face. Then only will readers trust me.

Say I will be happy to recruit 5 collaborators. 



The module that implements homoiconic transformation is called "Phos Multitiered Stack Machine":

https://github.com/udexon/GOEHDOM/blob/master/PMSM.md

:: put link at critical locations for details and coding examples

:: Rename PMSM to Smashlet? easy to remember? not theoretical? Stack machine shell.


We would like to present our conjecture, that: Human level artificial intelligence is type III graph search (GS3), where the categories are as follow:

1. Type I Graph search (GS1): 
- simple look up. 
- hello world, print string: search from string buffer. 
- database query.

2. Type II Graph search (GS2): 
- search involving predefined functions written by programmers, map, inverse kinematics, chess.

3. Type III Graph search (GS3): 
- homoiconic composite functions. 
- Target functions can be composed from existing functions. 
- make GS2 and GS1 functions as search candidates / targets.

:: PMSM or Phos Homoiconic Graph Machine?
