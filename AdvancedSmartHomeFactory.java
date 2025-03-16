
class AdvancedSmartHomeFactory implements SmartDeviceFactory {
    @Override
    public ScheduledOperationDecorator createLight(String name) {
        return new ScheduledOperationDecorator(new Light(name));
    }
}