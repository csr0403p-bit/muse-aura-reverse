package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DeliveryCheckoutStopRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DeliveryCheckoutStopRole[] $VALUES;
    public static final DeliveryCheckoutStopRole DROPOFF;
    public static final DeliveryCheckoutStopRole PICKUP;

    static {
        DeliveryCheckoutStopRole deliveryCheckoutStopRole = new DeliveryCheckoutStopRole("PICKUP", 0);
        PICKUP = deliveryCheckoutStopRole;
        DeliveryCheckoutStopRole deliveryCheckoutStopRole2 = new DeliveryCheckoutStopRole("DROPOFF", 1);
        DROPOFF = deliveryCheckoutStopRole2;
        DeliveryCheckoutStopRole[] deliveryCheckoutStopRoleArr = {deliveryCheckoutStopRole, deliveryCheckoutStopRole2};
        $VALUES = deliveryCheckoutStopRoleArr;
        $ENTRIES = C3cG.A0w(deliveryCheckoutStopRoleArr);
    }

    public static Ey9<DeliveryCheckoutStopRole> getEntries() {
        return $ENTRIES;
    }

    public static DeliveryCheckoutStopRole valueOf(String str) {
        return (DeliveryCheckoutStopRole) Enum.valueOf(DeliveryCheckoutStopRole.class, str);
    }

    public static DeliveryCheckoutStopRole[] values() {
        return (DeliveryCheckoutStopRole[]) $VALUES.clone();
    }

    public DeliveryCheckoutStopRole(String str, int i) {
    }
}
