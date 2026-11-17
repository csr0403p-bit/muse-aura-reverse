package com.facebook.aura.rentalcars;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class RentalCarAccess {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RentalCarAccess[] $VALUES;
    public static final RentalCarAccess CALL_FOR_PICKUP;
    public static final RentalCarAccess IN_TERMINAL;
    public static final RentalCarAccess MEET_AND_GREET;
    public static final RentalCarAccess SHUTTLE;

    static {
        RentalCarAccess rentalCarAccess = new RentalCarAccess("IN_TERMINAL", 0);
        IN_TERMINAL = rentalCarAccess;
        RentalCarAccess rentalCarAccess2 = new RentalCarAccess("SHUTTLE", 1);
        SHUTTLE = rentalCarAccess2;
        RentalCarAccess rentalCarAccess3 = new RentalCarAccess("MEET_AND_GREET", 2);
        MEET_AND_GREET = rentalCarAccess3;
        RentalCarAccess rentalCarAccess4 = new RentalCarAccess("CALL_FOR_PICKUP", 3);
        CALL_FOR_PICKUP = rentalCarAccess4;
        RentalCarAccess[] rentalCarAccessArr = {rentalCarAccess, rentalCarAccess2, rentalCarAccess3, rentalCarAccess4};
        $VALUES = rentalCarAccessArr;
        $ENTRIES = C3cG.A0w(rentalCarAccessArr);
    }

    public static Ey9<RentalCarAccess> getEntries() {
        return $ENTRIES;
    }

    public static RentalCarAccess valueOf(String str) {
        return (RentalCarAccess) Enum.valueOf(RentalCarAccess.class, str);
    }

    public static RentalCarAccess[] values() {
        return (RentalCarAccess[]) $VALUES.clone();
    }

    public RentalCarAccess(String str, int i) {
    }
}
