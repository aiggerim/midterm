class ScheduledOperationDecorator extends SmartDeviceDecorator {
    public ScheduledOperationDecorator(SmartDevice device) {
        super(device);
    }

    public void scheduleOperation() {
        System.out.println("Scheduling operation for " + decoratedDevice.getClass().getSimpleName());
    }

    @Override
    public void turnOn() {
        scheduleOperation();
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        scheduleOperation();
        decoratedDevice.turnOff();
    }
}
