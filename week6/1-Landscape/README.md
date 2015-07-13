# Landscape

We are going to make a beautiful, console-based 2D landscape that looks like that:

```
--~/\!/\--
```

Our landscape will consist of tiles, and each tile is represented by a String.

You have the following interface:

```java
public interface Tile {
  public String render();
}
```

Implement that interface with the following tiles:

* `Land` should render as the `--` string.
* `Water` should render as the `~~` string.
* `Mountain` should render as the `/\` string.
* `Forest` should render as the `!!` string.

When you have the 4 classes ready, implement a class called `Landscape` which should have:

* `addTile(Tile t)` method - adds tile to a list.
* `String renderAll()` method - renders all tiles, concats them and returns the resulted String.

## Example

Lets have a `Main` class:

```java
public class Main {
  public static void main(String[] args) {
    Landscape landscape = new Landscape();

    landscape.addTile(new Land());
    landscape.addTile(new Water());
    landscape.addTile(new Mountain());
    landscape.addTile(new Forest());

    System.out.println(landscpape.renderAll()); // --~~/\!!
  }
}
```
