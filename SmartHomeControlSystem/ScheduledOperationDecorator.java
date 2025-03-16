package SmartHomeControlSystem;

class ScheduledOperationDecorator extends Light {
    public Light decoratedLight;

    public ScheduledOperationDecorator(Light light) {
        super(light.name); // Передаем имя в родительский конструктор Light
        this.decoratedLight = light;
    }

    public void scheduleOperation() {
        System.out.println("Scheduling operation for " + decoratedLight.getClass().getSimpleName());
    }

    @Override
    public void turnOn() {
        scheduleOperation();
        decoratedLight.turnOn();
    }

    @Override
    public void turnOff() {
        scheduleOperation();
        decoratedLight.turnOff();
    }
}
