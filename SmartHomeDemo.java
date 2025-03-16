public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartHomeController controller = new SmartHomeController();
        SmartDeviceFactory factory = new BasicSmartHomeFactory();

        Light livingRoomLight = factory.createLight("Living Room Light");
        Room livingRoom = new Room("Living Room");
        livingRoom.addDevice(livingRoomLight);

        LegacyLockSystem oldLock = new OldLock();
        LockAdapter lockAdapter = new LockAdapter(oldLock);

        controller.addDevice(livingRoom);
        controller.addDevice(lockAdapter);

        controller.turnAllLightsOn();
        controller.turnAllLightsOff();
        lockAdapter.turnOn();
        lockAdapter.turnOff();
    }
}