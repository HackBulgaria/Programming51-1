# Tree Level

You have the implementation of a Binary Tree. There are two tasks for you here:

## The First Task

You must implement a function that returns the height of the tree.
For example a tree like this:

```
  3
 /  \
2	 5
```

Has a height of 2.

And a tree like this:

```
 2
  \
   3
    \
     4
      \
       6
```

Has a height of 4.

Implement the method `public int getTreeHeight()` (in the BST implementation that you will find in github) that returns the height of the tree given.

## The Second Task

You must now implement the method `public LinkedList<T> getTreeLevel(int level)` that returns a list with the elements of the tree on a certain level.
For example:

```
    5
   / \
  3   7
 / \   \
1   2  10
```

The third level of this tree is:

```
[1, 2, 10]
```