package SmartHomeControlSystem;

class BasicSmartHomeFactory implements SmartDeviceFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name);
    }
}