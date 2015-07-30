# Bouncing Ball

We have provided you with [`Application.java`](Application.java) and [`Canvas.java`](Canvas.java) that are set for basic animation.

Your job is to extend the `Canvas` and do the following:

* When the ball hits one of the 4 walls, it should bounce in the opposite direction
* The ball is moving slowly now. Make it possible for the user to control the ball with the arrow keys (implement `KeyListener` interface). Of course, the ball should bounce back again, even if the user is controlling it.

## Understanding the animation

Since we have not covered threads yet, we decided to give you the animation ready. But if you are interested in how things are working, here it is:

* [The material that we have used is here](http://zetcode.com/tutorials/javagamestutorial/animation/)
* There is an `Thread animator` property in `Canvas`. This `Thread` is going to do the animation.
* Our class is a `Runnable`. Runnables can be given to Threads. Threads execute the `public void run() {}` method once.
* The thing that loops and makes the animation is called a **game loop**
* In our `run` method we make an infinite loop (in the separate thread) and calculate each game loop.
* We call `cycle()` which changes the `x` and `y` values of the ball.
* After `cycle()` we call `repaint()`, which will call `paintComponent` again. Then - we draw the circle on its new position.
* In the `run` method, there is a calculation. We find out for how much time we should sleep, so the next cycle will be atleast that long as the previous one. This helps the animation to be smooth and not rushed.
