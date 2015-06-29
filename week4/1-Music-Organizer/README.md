# Music Player

In a `com.hackbulgaria.programming51.week4` package do the following:

## Define a `class Song` where you

Have the following attributes and methods:

* `name`
* `artist`
* `duration` (in seconds)
* `album`
* proper constructors
* `toString()` method

**Think about the types of each attribute and method. This is your job!**

## Define a `class MusicOrganiser` where you

Have the following attributes and methods:

* `Vector` of type `Song` named `songs`
* proper constructors
* method `public void addSong(Song s)` that adds a song to the music player. If addition is successful return true. If there is not enough space, return false
* method `public int getCount()` that returns the number of songs added to the player
* method `public Vector<String> getAlbums()` that returns an vector of all the **different** album names in the Music Organiser
* method `public int getAlbumsCount()` that returns the number of **different** album names in the Music Organiser
* method `public Vector<Song> getAlbumSongs(String albumName)` that returns the songs in an album
* method `public Vector<String> getAlbumsAndSongs()` that returns an vector of all the **different** album names in the Music Organiser, and the number of songs in each album concatenated in one string for each album name. **Check the example below**

## Examples

### Example for `addSong()`

```java
MusicOrganiser mo = new MusicOrganiser();

mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));

System.out.println(mo);
```

Should print:

```
The real Slim Shady Eminem 213 The Marshall Mathers LP
```

### Example for `getCount()`

```java
MusicOrganiser mo = new MusicOrganiser();

mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

System.out.println(mo.getCount());
```

Should print:

```
 4
```

### Example for `getAlbums()`

```java
MusicOrganiser mo = new MusicOrganiser();
mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

Vector<String> albums = mo.getAlbums();

for(int i = 0; i < albums.size(); i++) {
    System.out.println(albums.get(i));
}
```

Should print:

```
The Marshall Mathers LP
Curtain Call: The Hits
```

### Example for `getAlbumsCount()`

```java
MusicOrganiser mo = new MusicOrganiser();

mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

System.out.println(mo.getAlbumsCount());
```

Should print:

```
2
```

### Example for `getAlbumSongs()`

```java
MusicOrganiser mo = new MusicOrganiser();

mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

Vector<Song> songs = mo.getAlbumSongs("The Marshall Mathers LP");

for(int i = 0; i < songs.size(); i++) {
    System.out.println(songs.get(i));
}
```

Should print:

```
The real Slim Shady Eminem 213 The Marshall Mathers LP
The Way I Am Eminem 183 The Marshall Mathers LP
```

### Example for `getAlbumsAndSongs()`

```java
MusicOrganiser mo = new MusicOrganiser();

mo.addSong(new Song("The real Slim Shady", "Eminem", 213, "The Marshall Mathers LP"));
mo.addSong(new Song("The Way I Am", "Eminem", 183, "The Marshall Mathers LP"));
mo.addSong(new Song("When I'm Gone", "Eminem", 256, "Curtain Call: The Hits"));
mo.addSong(new Song("Lose Yourself", "Eminem", 221, "Curtain Call: The Hits"));

Vector<String> songs = mo.getAlbumsAndSongs();

for(int i = 0; i < songs.size(); i++) {
    System.out.println(songs.get(i));
}
```

Should print:

```
The Marshall Mathers LP(2)
Curtain Call: The Hits(2)
```
