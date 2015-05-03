ARDUINO-CONTROLLER FOR JAVA V 1.0 25/04/2015

NOTE: Works only on computers with multiple CPUs. 

SETUP:

-Set up libraries for:
		Windows 32-bit
		Copy the win32/rxtxSerial.dll into C:\Windows\System32
		Append the directory containing rxtxSerial.dll into your PATH environment variable.
		Windows 64-bit
		Copy the win64/rxtxSerial.dll into C:\Windows\SysWOW64
		Append the directory containing rxtxSerial.dll into your PATH environment variable
-Add rxtxSerial.dll to your System 'Path' variable
-Open SerialTest.java and change the <PORT> variable to desired COM Port on the host PC. Close SerialTest.

HOW TO USE:
-Write code in Arduino IDE and push it to the Arduino board as usual. We use the IDE just to push code the Arduino.
-Open ArduinoController and write code in data() method. 
-OutputStream gets data from the arduino 
-Inputstream gets information from the user.


------------------------------

CONTACT:
Anirudha Nandi
anirudha11nandi@gmail.com

------------------------------
