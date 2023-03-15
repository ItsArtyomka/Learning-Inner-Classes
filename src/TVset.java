// Example code used to learn about Nested and Inner classes.
class TVset {
    //---Fields---
    private int channel = 1;
    private boolean isOn;
    private Remote remote = new Remote(); // Creating remote object.

    // Remote getter
    public Remote getRemote() {
        return remote; // Returns private remote object
    }

    // Inner class Remote
    class Remote {
        //---Setters---
        public void setChannel(int channel) {
            TVset.this.channel = channel;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }
    }

    // Example of Static Polymorphism
    @Override
    public String toString(){
        if (!isOn){
            return "TV is off.";
        }
        return "Channel " + channel + " is on.";
    }
}

// Class to Run the code...
class TestRun {
    public static void main(String[] args) {
        TVset tv = new TVset();
        TVset.Remote remote = tv.getRemote();
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

    }
}
