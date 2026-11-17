package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DeliveryCheckoutPriceKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DeliveryCheckoutPriceKind[] $VALUES;
    public static final DeliveryCheckoutPriceKind DELIVERY_FARE;
    public static final DeliveryCheckoutPriceKind FEE;
    public static final DeliveryCheckoutPriceKind TAX;
    public static final DeliveryCheckoutPriceKind TIP;

    static {
        DeliveryCheckoutPriceKind deliveryCheckoutPriceKind = new DeliveryCheckoutPriceKind("DELIVERY_FARE", 0);
        DELIVERY_FARE = deliveryCheckoutPriceKind;
        DeliveryCheckoutPriceKind deliveryCheckoutPriceKind2 = new DeliveryCheckoutPriceKind("TAX", 1);
        TAX = deliveryCheckoutPriceKind2;
        DeliveryCheckoutPriceKind deliveryCheckoutPriceKind3 = new DeliveryCheckoutPriceKind("FEE", 2);
        FEE = deliveryCheckoutPriceKind3;
        DeliveryCheckoutPriceKind deliveryCheckoutPriceKind4 = new DeliveryCheckoutPriceKind("TIP", 3);
        TIP = deliveryCheckoutPriceKind4;
        DeliveryCheckoutPriceKind[] deliveryCheckoutPriceKindArr = {deliveryCheckoutPriceKind, deliveryCheckoutPriceKind2, deliveryCheckoutPriceKind3, deliveryCheckoutPriceKind4};
        $VALUES = deliveryCheckoutPriceKindArr;
        $ENTRIES = C3cG.A0w(deliveryCheckoutPriceKindArr);
    }

    public static Ey9<DeliveryCheckoutPriceKind> getEntries() {
        return $ENTRIES;
    }

    public static DeliveryCheckoutPriceKind valueOf(String str) {
        return (DeliveryCheckoutPriceKind) Enum.valueOf(DeliveryCheckoutPriceKind.class, str);
    }

    public static DeliveryCheckoutPriceKind[] values() {
        return (DeliveryCheckoutPriceKind[]) $VALUES.clone();
    }

    public DeliveryCheckoutPriceKind(String str, int i) {
    }
}
