## Phos Smashlet

http://phos.epizy.com/pmsm/

As tutorials on Forth programming language have been widely available, we will not reiterate here. Rather, we shall focus on novel implementations of Phos Multitiered Stack Machine (PMSM).

We demonstrate [Phos Multitiered Stack Machine (PMSM)](http://phos.epizy.com/pmsm/) as a simple JavaScript+PHP web page.

Phos RPN commands can be entered via the Developer Console as a space delimited string by calling function `F()`, e.g.

```
F("1 a tn: a a b tnn:")
```

As with Forth, PMSM works on a simple algorithm as follows:

- For each token, push token onto stack if token is not a function word (token), else execute the function mapped by the function word (token).

Function words in Phos are suffixed by a colon (':'). This is a new convention that is not adopted in Forth.

For the example above, 

- `v k tn:` adds an object with key `k` to global tree `T` with value `v`
- `k0 k1 tnn:` duplicates the object with key `k0` from global tree `T` and store it as object with key `k1`

<img src="https://github.com/udexon/GOEHDOM/blob/master/phos.png" width="350" title="hover text">

As shown in the screenshot above, the commands `F("1 a tn: a a b tnn:")` first create an object with key `a` and value `1` using function word `tn:`, then duplicate this object as an object with key `b` on the global tree `T` using function word `tnn:`.

`tn:` is mapped to a JavaScript function `fgl_tn()` defined as follow:

```javascript
function fgl_tn() // make tree node: value key tn:
{
    var a=S.pop()
    var b=S.pop()
    T[a] = b
}
```

`S` is a global variable that is used as the stack.

`tnn:` is mapped to a JavaScript function `fgl_tnn()` defined as follow:

```javascript
function fgl_tnn() // input is node, copy node to node, preserve source node name: source target  tnn:
{
    var a = S.pop();
    var $F = S.pop();

    var A = []
    A[$F] = T[$F]

    T[a] = A
}
```

`$` sign is actually part of variable ported from PHP. We shall explore in depth Phos implementation in PHP vs. JavaScript in another article.

`td:` is mapped to a JavaScript function `fgl_td()` defined as follow:

```javascript
function fgl_td() // delete node: node td:
{
    var a=S.pop()
    delete T[a]
}
```
