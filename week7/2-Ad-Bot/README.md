# Ad Bot

You are given the task to make a bot that displays AD messages in the subway.

The add messages are strings that are given to you in a `String[]`.

You must display the messages with a 1 second interval.

There is a method in Java called `sleep(...)` that takes a `long` number as attribute and stops the program for the time given. Note that the time is given in miliseconds. One second equals 1000 miliseconds. So if you want to pause the program for 1 second you should call 'sleep(1000)'.
You cant just call `sleep()`. As you already know everything in Java is an object, so you must call `sleep` on a class.
The correct call is:

```java
Thread.sleep(1000);
```

## Boilerplates

So here's a boilerplate for your `Main` class:

```java
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		String[] s = {
			"Try the new invention! It gives you the ability to go from one room to another trough the wall. It is called a 'Door'!",
			"The new thing is out! It's called Sleeping! Sleeping helps you get energy for your next day! Try Sleeping TODAY!",
			"Here's another advertisement that I didn't want to think text for. Enjoy!",
			"Oh, and another AD. My, my! How exciting!"
		};
		
		AdBot ad = new AdBot(s);
		for (int i = 0; i < 100; i++) {
			ad.showNextAdd();
			Thread.sleep(1000);
		}
	}
}
```

You should implement the class `AdBot` that recieves the `String[]` with the ads and the method `public void showNextAd()` that prints the next ad.

The ads should appear in the console one after another and when they end: they should start again from the first one.