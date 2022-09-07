# Strategy Game Units with Composite Pattern

In strategy games players often command a multitude of units. To make
this simpler, it is typically possible to group multiple units together
and pass commands to the whole group. In this exercise we want to
implement a simple version of this behavior using the Composite pattern.

The starter kit `strategy_game.v1` contains an interface `Unit` that
describes the commands that Units can perform. The classes `Soldier`
and `Army` represent a single unit and a unit consisting of multiple
other units, respectively.

Modify the classes `Soldier` and `Unit` so that the provided `main()`
method (in class `Main`) produces output along the following lines:

```
====================================
Soldier at position 65, 23
====================================
Army with 3 units:
  Soldier at position 35, 47
  Soldier at position 56, 68
  Soldier at position 48, 60
====================================
Army with 2 units:
  Soldier at position 54, 5
  Soldier at position 51, 77
====================================
Army with 2 units:
  Army with 3 units:
    Soldier at position 35, 47
    Soldier at position 56, 68
    Soldier at position 48, 60
  Army with 2 units:
    Soldier at position 54, 5
    Soldier at position 51, 77
====================================
Army with 2 units:
  Army with 3 units:
    Soldier at position 35, 47
    Soldier at position 56, 68
    Soldier at position 48, 60
  Army with 2 units:
    Soldier at position 154, 105
    Soldier at position 151, 177
====================================
Soldier at position 35, 47 attacks nearest target.
Soldier at position 56, 68 attacks nearest target.
Soldier at position 48, 60 attacks nearest target.
Soldier at position 154, 105 attacks nearest target.
Soldier at position 151, 177 attacks nearest target.
```

The coordinates of soldiers are initialized to random values when the
soldier is created.

(If you want to achieve the same indentation as in the example it is
useful to add an `int indent` parameter to `describe()` that determines
the indentation of the output.)

