package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DeliveryCheckoutHandoff {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DeliveryCheckoutHandoff[] $VALUES;
    public static final DeliveryCheckoutHandoff LEAVE_AT_DOOR;
    public static final DeliveryCheckoutHandoff MEET_AT_DOOR;

    static {
        DeliveryCheckoutHandoff deliveryCheckoutHandoff = new DeliveryCheckoutHandoff("MEET_AT_DOOR", 0);
        MEET_AT_DOOR = deliveryCheckoutHandoff;
        DeliveryCheckoutHandoff deliveryCheckoutHandoff2 = new DeliveryCheckoutHandoff("LEAVE_AT_DOOR", 1);
        LEAVE_AT_DOOR = deliveryCheckoutHandoff2;
        DeliveryCheckoutHandoff[] deliveryCheckoutHandoffArr = {deliveryCheckoutHandoff, deliveryCheckoutHandoff2};
        $VALUES = deliveryCheckoutHandoffArr;
        $ENTRIES = C3cG.A0w(deliveryCheckoutHandoffArr);
    }

    public static Ey9<DeliveryCheckoutHandoff> getEntries() {
        return $ENTRIES;
    }

    public static DeliveryCheckoutHandoff valueOf(String str) {
        return (DeliveryCheckoutHandoff) Enum.valueOf(DeliveryCheckoutHandoff.class, str);
    }

    public static DeliveryCheckoutHandoff[] values() {
        return (DeliveryCheckoutHandoff[]) $VALUES.clone();
    }

    public DeliveryCheckoutHandoff(String str, int i) {
    }
}
