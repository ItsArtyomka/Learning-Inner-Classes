// Example class used to learn about Static Inner Classes
public class MotherBoard {

    // Static Nested Class
    static class USB {
        public static String wikilink = "https://en.wikipedia.org/wiki/USB";
        int usb2;
        int usb3;

        int getTotalPorts(){
            return usb2 + usb3;
        }

        USB(int usb2, int usb3){
            this.usb2 = usb2;
            this.usb3 = usb3;
        }
    }
    USB usb = new USB(2, 3); // Example Constructor
}

// Class to Run the code...
class TestRun1 {
    public static void main(String[] args) {
        // Create new object MotherBoard
        MotherBoard mb = new MotherBoard();
        // Work with an object of a nested class
        System.out.println("Total Ports = " + mb.usb.getTotalPorts());
        // Calling a static field inside the static class
        System.out.println(MotherBoard.USB.wikilink);

        // Example of how to use the USB class separately.
        MotherBoard.USB usb1 = new MotherBoard.USB(100, 500);
        System.out.println(usb1.getTotalPorts());
    }
}