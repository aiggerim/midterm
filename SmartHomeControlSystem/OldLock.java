package SmartHomeControlSystem;

import SmartHomeControlSystem.LegacyLockSystem;

class OldLock implements LegacyLockSystem {
    @Override
    public void unlock() {
        System.out.println("Old lock system unlocked");
    }

    @Override
    public void lock() {
        System.out.println("Old lock system locked");
    }
}