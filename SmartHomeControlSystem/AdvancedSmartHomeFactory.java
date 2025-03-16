package SmartHomeControlSystem;

class AdvancedSmartHomeFactory implements SmartDeviceFactory {
    @Override
    public Light createLight(String name) {
        return new ScheduledOperationDecorator(new Light(name));
    }
}