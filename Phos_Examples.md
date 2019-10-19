### Phos Examples

1. Loop, count 5 to 1.

`l:` set TOS as branch label

`bnz:` branch to label if TOS is not zero

`esp:` echo space character

`nl:` newline

```
$ php phos.php 5 A l: dup: esp: 1 - A bnz: nl:
5 4 3 2 1 
```

2. Expanding algebraic expression in Reverse Polish Expression

```
~/devel/5gl/20190303/parse$ php hgm.php 'a b + c d + *' space: explode: hgm: stk: 
t: nl: exp3: 6 subt: 5 subt: 
: top_edges t t2sn: cx: over: cx: 1 - i: e ix: \; 
top_edges 
: left_terms dup: 1 ix: 5 pick: swap: i: e i: dup: 0 i: subt: over: 1 i: subt: \; 
\ "left edges terms" . left_terms 3 pick: 0 i: subt: 
\\* 1 pick: 4 pick: \\* \\+ 7 mss: s:

fgl_s 397 < 10 > array ( 0 => 'd c + b a + *', 1 => 'd c +', 
2 => array ( 0 => array ( 'v' => 'a', ), 
1 => array ( 'v' => 'b', ), 
2 => array ( 'v' => '+', 't' => 'oa', 'e' => array ( 0 => 1, 1 => 0, ), ), 
3 => array ( 'v' => 'c', ), 4 => array ( 'v' => 'd', ), 
5 => array ( 'v' => '+', 't' => 'oa', 'e' => array ( 0 => 4, 1 => 3, ), ), 
6 => array ( 'v' => '*', 't' => 'om', 'e' => array ( 0 => 5, 1 => 2, ), ), ), 
3 => 7, 4 => array ( 'v' => '*', 't' => 'om', 'e' => array ( 0 => 5, 1 => 2, ), ), 
5 => array ( 0 => 5, 1 => 2, ), 6 => array ( 0 => 5, 1 => 2, ), 
7 => array ( 0 => 1, 1 => 0, ), 8 => 'b', 
9 => 'a d c + \\* d c + b \\* \\+', )
```

3. Download Instagram images by keywaord and make ranking table

```
~/devel/5gl/igdl_2019_10$ php ajax_igdl.php vsangel dltag dlsc

~/devel/5gl/igdl_2019_10$ php ajax_2loop.php array: A shv: array: B shv: 
array: C shv: 'ig/B*.html' glob: alike_user_shortcode nl: 
A B C 3sort: '<table>' esp: A rshv: ON ECHO bv: 
'<table>' esp:  ncol > o_ig_20191018.html
```
