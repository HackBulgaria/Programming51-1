# Labirinth

You are in a labirinth and you have to find your way out.

The labirinth looks similar to this:

```
# # # # # # # # 
# X . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . . . # # 
# . . . # . . # 
# # # # # # ! # 
```

The labirinth is a 2D array of chars - `char[][]`

First, you are going to implement a program, that takes input from the console and moves you in the right direction.

Your task is to get yourself out of the labirinth and reach the `!` char.

**You are represnted by the `X` character.**

## The Labirinth class

Implement a class called `Labirinth` that takes the labirnth array from the constructor.

The class should have the following interface:

* `String toString()` - returns a String, ready to be printed on the console.
* `void print()` - prints the labirinth to the console
* `boolean movePerson(Movement move)` - returns `true` if we can make the move, otherwise `false`

This is it.

Now, lets look into the `Movement` class.

## Movement

The Movement class is going to be our main class, that we will inherit from:

```java
public class Movement {
	public void move() {
		System.out.println("Moving from the basic movement class.");
	}
}
```

Now, subclass the `Movement` class in the following classes:

* `MoveRight`
* `MoveLeft`
* `MoveDown`
* `MoveUp`

Each of the classes should give its own implementation to the `move` method - printing the direction that we are moving to.

For example:

```java
public class MoveRight extends Movement {
	public void move() {
		System.out.println("Moving right!");
	}
}
```

## Taking input and moving us

Here is an example of how to put everything together:

Until you have reached the end of the labirinth:

* Read one string from the input.
* Print the result of the movement in the labirinth

For example:

```
# # # # # # # # 
# X . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . . . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
down

# # # # # # # # 
# . . # . . . # 
# X . . . # . # 
# . . # . . . # 
# # . . . . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
down

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# X . # . . . # 
# # . . . . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
right

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . X # . . . # 
# # . . . . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
down

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # X . . . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
right

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . X . . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
right

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . X . # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
right

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . . X # # 
# . . . # . . # 
# # # # # # ! # 

Make your move:
down

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . . . # # 
# . . . # X . # 
# # # # # # ! # 

Make your move:
right

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . . . # # 
# . . . # . X # 
# # # # # # ! # 

Make your move:
down

# # # # # # # # 
# . . # . . . # 
# . . . . # . # 
# . . # . . . # 
# # . . . . # # 
# . . . # . . # 
# # # # # # X # 

Congratulations! You have escaped the labirinth.

Here are some aliens: (-(-(-_-)-)-)
```
