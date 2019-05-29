# Assignment2
CS410

I used an interface callled SensorInterface.java this interface worked but I noticed that the status was always displaying OK 
and not Critical or Danger. Because of this, the status was incorrect and the rectangles were wrong.

To fix this I added another class called Sensor.java which is used instead of SensorInterface. 
This forces the same value to be passed allowing for a more accurate result.

Also, a min and max value were added along with a hardcoded dimmension to get a more accurate representation
of the rectangle length being displayed. This was a seperate class called MathUtils.java

Since I couldn't get the 3 .class files to be instantiated even though my class path listed them
and their file names were listed in the included files. I added the sensorlibs.jar file and added that as a library.
(I ended up deleting these .class files as they were not necessary)

The initial design didn't utilize the adaptor interface so Jpanel would have to be utilized specifically each time. By adding the 
createPanel() method I could create the JPanel by using the sensor interface.

