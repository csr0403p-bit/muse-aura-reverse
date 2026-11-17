package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FlightCheckoutBagType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FlightCheckoutBagType[] $VALUES;
    public static final FlightCheckoutBagType CARRY_ON;
    public static final FlightCheckoutBagType CHECKED;

    static {
        FlightCheckoutBagType flightCheckoutBagType = new FlightCheckoutBagType("CARRY_ON", 0);
        CARRY_ON = flightCheckoutBagType;
        FlightCheckoutBagType flightCheckoutBagType2 = new FlightCheckoutBagType("CHECKED", 1);
        CHECKED = flightCheckoutBagType2;
        FlightCheckoutBagType[] flightCheckoutBagTypeArr = {flightCheckoutBagType, flightCheckoutBagType2};
        $VALUES = flightCheckoutBagTypeArr;
        $ENTRIES = C3cG.A0w(flightCheckoutBagTypeArr);
    }

    public static Ey9<FlightCheckoutBagType> getEntries() {
        return $ENTRIES;
    }

    public static FlightCheckoutBagType valueOf(String str) {
        return (FlightCheckoutBagType) Enum.valueOf(FlightCheckoutBagType.class, str);
    }

    public static FlightCheckoutBagType[] values() {
        return (FlightCheckoutBagType[]) $VALUES.clone();
    }

    public FlightCheckoutBagType(String str, int i) {
    }
}
