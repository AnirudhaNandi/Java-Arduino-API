import gnu.io.CommPortIdentifier;

//Created by Nandiola
//Created on the 30th of April
//Class creates a Serialtest pbject
//Also contains the code to be executed and handled when certain outputs are made
public class ArduinoController {
    public static void main() throws Exception {
	// start the programme
	start();
    }

    public static void data(String in) {
	//do something with data coming in, in string <in>
	//will be called everytime ANY data is available; parse data to see if it is useful data or not
    }

    public static void start() throws InterruptedException {
	// starts programme externally
	System.out.println("Looking for serial port... ");
	
	//construct serialPort
	SerialTest serialPort = new SerialTest("COM9");
	CommPortIdentifier portId = serialPort.initialize();
	serialPort.setup(portId, serialPort);
	serialPort.keepAlive();
    }

}
