# Shape - Area Volume Calculator

#### Create an abstract public class _Shape_ with the below public abstract methods :

`public double area()` <br> `public double volume()`

#### Create a public class _Rectangle_ with private attributes :

`double length` <br> `double width`

**Write the public getters and setters for these attributes.**

> Rectangle class should inherit the `Shape` class

_Area of rectangle is length * width_

#### Create a public class _Triangle_ with private attributes :

`double base` <br> `double height` <br>
**Write the public getters and setters for these attributes.**

> `Triangle` class should inherit the `Shape` class

_Area of triangle is  1/2 * base * height_

#### Create a public class _Cube_ with private attributes :

`double length` <br> `double width` <br> `double height`

**Write the public getters and setters for these attributes.**

> `Cube` class should inherit the `Shape` class

_Area of cube is  2 * length * width + 2 * length * height + 2* width * height_ <br>
_Volume of cube is  length * width * height_

#### Create a public class _Sphere_ with private attributes :

`double radius`

**Write the public getters and setters for these attributes.**

> `Sphere` class should inherit the `Shape` class

_Area of  Sphere is  4  * PI * radius2_ <br>
_Volume of Sphere is   ( 4  * PI * radius3 ) / 3_

**Note : You should use Math.PI for the value of PI**

> For Rectangle and Triangle class the method volume should return -1.

- Create an interface Spatial which is a marker interface. Classes that has proper implementation for volume should implement this interface. <br>
- Create a public Main class which has the main method. <br>
- Create an array of Shape of size 5. <br>

**Get the Shape type and the corresponding attributes and store those objects in the array.** <br>
- Print the area and volume of the objects created. <br>
- Volume of the array object should be printed only if it is of Spatial Type. <br>

> Sample Input :

    Triangle
    10
    20
    Sphere
    14
    Rectangle
    14
    15
    Cube
    5
    7
    9
    Triangle
    18
    24

> Sample Output

    Area 100.0
    Area 2463.0086404143976
    Volume 11494.040321933855
    Area 210.0
    Area 286.0
    Volume 315.0
    Area 216.0

**Note : Volume is displayed only when the shape is cube or sphere **
