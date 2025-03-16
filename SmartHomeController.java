// --- Facade Pattern ---
import java.util.*;
class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllLightsOn() {
        System.out.println("Turning all lights ON");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllLightsOff() {
        System.out.println("Turning all lights OFF");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}