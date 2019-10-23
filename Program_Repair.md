### Program Repair using JVM

In Ghanbari (2018), a byte code level automatic program repair (APR) system was created for Java virtual machine (JVM) and was able to produce geniune patches for 43 bugs in Defects4J data set, outperforming state-of-the-art APR.

JVM is essentially a stack machine. As such, techniques used in Ghanbari and related works can be readily ported to Phos HGM.

```
Practical program repair via bytecode mutation
A Ghanbari, S Benton, L Zhang - Proceedings of the 28th ACM SIGSOFT …, 2018 - dl.acm.org
Abstract Automated Program Repair (APR) is one of the most recent advances in automated
debugging, and can directly fix buggy programs with minimal human intervention. Although
various advanced APR techniques (including search-based or semantic-based ones) have …
Cited by 10 Related articles All 4 versions

https://arxiv.org/pdf/1807.03512


Can Automated Program Repair Refine Fault Localization?
Y Lou, A Ghanbari, X Li, L Zhang, D Hao… - arXiv preprint arXiv …, 2019 - arxiv.org
Software bugs are prevalent in modern software systems and notoriously hard to debug
manually. Therefore, a large body of research efforts have been dedicated to automated
software debugging, including both automated fault localization and program repair …
All 2 versions 

https://arxiv.org/pdf/1910.01270


[PDF] Inferring Program Transformations From Singular Examples via Big Code
J Jiang, L Ren, Y Xiong, L Zhang - luyaoren.com
Inferring program transformations from concrete program changes has many potential uses,
such as applying systematic program edits, refactoring, and automated program repair.
Existing work for inferring program transformations usually rely on statistical information over …
All 2 versions 

http://luyaoren.com/wp-content/uploads/ASE19-GENPAT.pdf
```

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


Phos HGM is open source, has theoretical basis down to one line of code. Encourage open source effort. 

Jvm is stack machine. Hence compatible with RPN.

Estimate effort: 5 PhD or 10 free software programmer equivalent to 1 PhD. 50 programmers 3 years. 300 programmers 6 months. ???

Curve fitting, can find distance of point to curve.

Get food. Hungry, is hard threshold.

Men needs means or money to get food.

Then defense and violence as means to secure food.

Write these in war game simulation improvement.

Human are capable of inventing puzzle without solution. Some software systems are like puzzles without solution. Hence can be ignored. Just need to survive. 
