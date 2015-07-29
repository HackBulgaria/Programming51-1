# Find The Panda

**After you get this done, try to rewrite it using recursion only!**

You are in a maze and you are searching for your panda!

Make a Java program that takes a maze, your position and a panda position. It should print ``true`` if there is a way from you to the panda and ``false`` if there is not a way.

## The Input
First we take two numbers - The rows count and the cols count of the maze.


Then we take a string that represents the maze:

``.`` - You can pass through this position.

``#`` - You can't pass through this position.

``U`` - This is your position

``P`` - This is the panda position


## Moves

**You can move only up, down, left and right. You can't move diagonally!**


### Example 1:

Input:

```
10
10
U..#......
...#......
##........
..........
#########.
..........
.#########
.........P
..........
..........
```

Output:
```
true
```

### Example 2:

Input:

```
7
10
...#...U..
..........
..........
...#......
........#.
.......#P#
...#....#.
```


Output:
```
false
```