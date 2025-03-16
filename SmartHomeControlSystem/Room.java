package SmartHomeControlSystem;

import SmartHomeControlSystem.SmartDevice;

import java.util.*;
class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning ON all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}