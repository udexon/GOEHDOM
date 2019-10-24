#### Reverse Engineering the Human Mind using Homoiconic Graph Machine

Reverse engineering has proven to be a very effective tool in the development of technologies. In order to apply reverse engineering to the human mind, various models have been proposed.

https://www.wired.com/story/to-advance-artificial-intelligence-reverse-engineer-the-brain/

In this article, we propose a homoiconic graph machine (HGM), a model based on homoiconic graph, comprising representation of knowledge and program code using Reverse Polish Notation (RPN) expressions.

We apply reverse engineering using HGM to free software repositories (FSR), such as github. We also limit the search space to finished patches, as we assume that not all bugs or issues can be resolved by human programmers in finite time.

A program is a finished product by a programmer. Need to use HGM to create whole program, or just incrementally work out the incremental patches? Incremental patches are good enough first targets. Do this first.

Start with the classic sort is made of swap algorithm?

:: notes

HGM may not produce results in time, just like human. Need to use simulation to guarantee returning results in time, comparable to human. ie. Compare to finished commits? 

Categorize last changes. Enough work to do. Reverse engineer. Work backwards. 

diff patch files reflect changes between commits. HGM task is to produce diff patch automatically?

Zhang's jvm shows Phos HGM approach is correct, but granularity is large, takes large effort to reproduce, not open source?

Construct existing program using Homoiconic Graph, investigate their search properties.

A finished program is the search result. Reverse deconstruct it to components. Find alternative components to construct alternative programs. Try with simple programs.

e.g. 2d map, can go up down left right.

Program? 

Start with 3d food grasp program?

Get simple robotics program. Build homoiconic graph until HG can modify host program?

Convert war games to homoiconic graph. 

Reduce war game or robots to smallest homoiconic graph that can self modify.

Minimum homoiconic graph mhg can grow like biological cells into complex organisms?

Try build mhg in 2d discrete world, then expand to 3d real number world?

Game of life?

Self can be defined using HG. 

To survive, need more energy material resources. Need money. Make Datong Token program.

:: Generate section heading using keywords from one or more paragraphs

#### Fork & Goals

Fork and change goal variables. A program is forked from parent, and its goals modified. This is done before or during execution? How does this relate to Datong Token, a program whose goal is to generate income? What are the relationships of goals of children (forked) processes and parent? Parent's goals are general and children's goals are specialized? Need goal management functions? 

Generate children program from parent or reverse engineer parent from children, based on creating or modifying goals, then generate additional code in target (parent or children). Conventional programming includes all above but programmers do that subconsciously. 


In conventional programming, a programmer copies code from a template, uses knowledge and motivations in his brain, then produces modified code. Can Homoiconic encode the knowledge and motivations of programmer for the limited scope of producing the modified output? 

Theorem X: Given any two programs, represented as homoiconic graphs, it must be possible to find a common ancestor, also represented as homoiconic graph.

Test 1: Construct a triplet of parent and two or more children, by forking parent and make modifications. 

If delete is used after fork, how to identify parent?

diff can show differences, but can they be classified as parent or children?

Small fragments of code like assignment are reused for many different tasks which may not have immediate common ancestors. 

Use object oriented programming as reference of inheritance. But need to find more examples to define GOEHDOM hierarchy. 

Use objects in real world as reference of hierarchy?

Vehicles car lorry ....

Human programmers learn these knowledge as background for programming?

Baseline: youngest Programmer's background knowledge?

Consider set of knowledge of all human programmers, categorize and reduce them, with respect to code changes. Analyze and create hierarchy for all knowledge. Use HG code to represent all knowledge and code. Reuse code to analyze knowledge and code. Analyze basic code and their usage statistics as we build up HGM.

Limited number of programmers who committed code change per repository?

First set of HGM code will analyze GitHub repositories. Then write code to analyze HGM code. Recursively do the above.

Hierarchy is a misnomer. We can only define code reuse. Hierarchy is a subjective view based on something else. 

HGM may not produce results in time, just like human. Need to use simulation to guarantee returning results in time, comparable to human. ie. Compare to finished commits? 

Categorize last changes. Enough work to do. Reverse engineer. Work backwards. 

diff patch files reflect changes between commits. HGM task is to produce diff patch automatically?

Phos HGM is open source, has theoretical basis down to one line of code. Encourage open source effort. 

Jvm is stack machine. Hence compatible with RPN.

Estimate effort: 5 PhD or 10 free software programmer equivalent to 1 PhD. 50 programmers 3 years. 300 programmers 6 months. ???

Curve fitting, can find distance of point to curve.

Get food. Hungry, is hard threshold.

Men needs means or money to get food.

Then defense and violence as means to secure food.

Write these in war game simulation improvement.

Human are capable of inventing puzzle without solution. Some software systems are like puzzles without solution. Hence can be ignored. Just need to survive. 
