
Loop, count 5 to 1.

`l:` set TOS as branch label

`bnz:` branch to label if TOS is not zero

`esp:` echo space character

`nl:` newline

```
$ php phos.php 5 A l: dup: esp: 1 - A bnz: nl:
5 4 3 2 1 
```
