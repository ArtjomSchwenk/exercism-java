class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFastAttack() method");
        if (knightIsAwake == true) {
          return false;
        } else {
          return true;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSpy() method");
        if (knightIsAwake == false || archerIsAwake == false || prisonerIsAwake == false) {
          return false;
        } else {
          return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        if (prisonerIsAwake == true && archerIsAwake == false) {
          return true;
        } else {
          return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
    }
}
