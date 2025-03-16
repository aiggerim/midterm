package SmartHomeControlSystem;

// Decorator Pattern

import SmartHomeControlSystem.SmartDevice;

abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public SmartDeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }
}