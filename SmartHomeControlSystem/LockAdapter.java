package SmartHomeControlSystem;

import SmartHomeControlSystem.LegacyLockSystem;

class LockAdapter implements SmartDevice {
    private LegacyLockSystem lockSystem;

    public LockAdapter(LegacyLockSystem lockSystem) {
        this.lockSystem = lockSystem;
    }

    @Override
    public void turnOn() {
        lockSystem.unlock();
    }

    @Override
    public void turnOff() {
        lockSystem.lock();
    }
}