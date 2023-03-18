// Example code used to learn about Nested and Inner classes.
@SuppressWarnings("FieldMayBeFinal")
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
//        TVset.Remote remote = TVset.getRemote(); // This only works if the getRemote method is static.
        TVset.Remote remote = tv.getRemote();
        System.out.println(tv);
        remote.turnOn();
        System.out.println(tv);
        remote.setChannel(2);
        System.out.println(tv);
        remote.turnOff();
        System.out.println(tv);

        // This way we create "nameless" TVset object that is then used to create the Remote object
        // in 1 line!!!
        TVset.Remote remote1 = new TVset().new Remote();
        remote1.turnOn();
    }
}
