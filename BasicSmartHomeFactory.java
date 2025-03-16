class BasicSmartHomeFactory implements SmartDeviceFactory {
    @Override
    public ScheduledOperationDecorator createLight(String name) {
        return new Light(name);
    }
}