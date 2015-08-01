# Data Structures, Algorithms + Visualization

The main idea here is to implement an interesting data structure or algorithm and use it to create a simple application, using Swing.

You can choose one of the following scenarios:

## A Dictionary, using a Trie

You are up to the task to implement a dictionary, that gives meaning to common computer science terminology. This can be a helpful glossary for the beginners who study programming.

You want to keep a reference from an english world to a full explanation - what is the meaning of the world.

Few examples:

| Word          | Meaning       |
| ------------- |:-------------:|
| recursion     | The act of a function calling itself to solve a problem |
| function      | Something that takes input and gives output. Can be written as `f(x) = y`      |

Here are the details about that problem:

* **To implement the dictionary, use a Trie data structure**. [You can read more about Trie here](https://en.wikipedia.org/wiki/Trie)
* Make sure your save your data to a file or a database (It is up to you). Build the trie every time you start the application.
* Create a Java Swing Application ([You can use windowbuilder for help](https://eclipse.org/windowbuilder/)) that gives the ability to perform **CRUD** operations on the words and the meanings.
* Have a simple searching user interface. When a word is searched, find the meaning of the word.


**CRUD** means create, read, update, delete.

There should be options to:

* Add new word with meaning to it.
* Update an existing word of meaning.
* Remove a word with its meaning.
* Show all words and all meanings in a table.
