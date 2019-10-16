## Phos Multitiered Stack Machine

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
