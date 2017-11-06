# Mart Rover Kata

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth. A roversTransceiver's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the roversTransceiver is in the bottom left corner and facing North. In order to control a roversTransceiver, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the roversTransceiver spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

The roversTransceiver wraps around if it reaches the end of the grid.

(Optional)The grid may have obstacles. If a given sequence of commands encounters an obstacle, the roversTransceiver moves up to the last possible point and reports the obstacle e.g. O,2,2,N

INPUT:

The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each roversTransceiver has two lines of input. The first line gives the roversTransceiver's position, and the second line is a series of instructions telling the roversTransceiver how to explore the plateau. The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the roversTransceiver's orientation.

Each roversTransceiver will finish sequentially, which means that the second roversTransceiver won't start to move until the first one has finished moving.

OUTPUT:

The output for each roversTransceiver should be its final co-ordinates and heading.

INPUT AND OUTPUT:

Test Input:

5 5

1 2 N

LMLMLMLMM

3 3 E

MMRMMRMRRM

Expected Output:

1 3 N

5 1 E

### Run

On windows use `gradlew.bat` instead of `./gradlew` to build.
You can also install gradle globally and then run just `gradle` and ignore `gradlew` script.

Build:

    ./gradlew clean jar

Test:

    ./gradlew clean test

Run:

    java -classpath ./build/libs/app.jar com.codurance.App
