# JavaChaser
A simple Java Applet game that can be used as a loading screen while something else is loaded in the background, or simply played for fun. Open source IDGAF License.

LISCENSE:
********
THE FILES INCLUDED IN THIS BUNDLE CAN BE MODIFIED AND DISTRIBUTED AT WILL, AS LONG AS CHANGES FROM THE
ORIGINAL PRODUCT ARE CLEARLY NOTED AND CREDIT IS GIVEN TO BENJAMIN C. VALLE. (benvalle33@gmail.com)

**********
HOW TO USE:
**********
First, make sure you have ALL included files:

-Chaser.class

-Chaser.html

-Sprite.class

-Enemy.class

-Player.class

-Expo.class


This is a Java™ applet and as such can be used in 2 ways:
-It can be embedded in a wepage, details on how to do this are not included here, but can be found in the Java™
 documentation.
 
-It can be launched by opening the included Chaser.html in a web browser on a compatible device.

************
REQUIREMENTS:
************
In order to use this program your computer must meet all of these requirements:

-Installed web browser

-Oracle or Open JRE 7+ installation.

-Permissive antivirus

-Keyboard input device (Sorry, no touch screens yet)

-Window manager installed (Don't worry about this unless you're a Linux wizard)

***********
HOW TO PLAY:
***********
-You control the blue dot with the arrow keys. When you move, all other entities on the grid move simultaneously.

-You must avoid the red dots. You can be in adjacent squares to them and survive, but occupying the same space as them
 will instantly end your game.
-You must try to catch the yellow dot. Upon being caught, the yellow dot will move to a semi-random location, based
 on three preset locations.

-The yellow dot, or, "Sprite", can safely occupy the same square as a red dot. You simply have to wait until it comes out
 of hiding.

-If you move onto the same square occupied by both a red AND yellow dot, your game will end and you will NOT catch the sprite
 that occupied that square.

-When you input a move, the game calculates the position change of enemies BEFORE it calculates your new position, so a red dot can
 kill you, even if you are currently moving 1 square away from it.

-When the game ends you will see a message telling you how many turns your game lasted for, as well as the number of sprites
 you caught.
