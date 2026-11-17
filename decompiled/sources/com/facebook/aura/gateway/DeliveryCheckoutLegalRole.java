package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DeliveryCheckoutLegalRole {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DeliveryCheckoutLegalRole[] $VALUES;
    public static final DeliveryCheckoutLegalRole CANCELLATION_POLICY;
    public static final DeliveryCheckoutLegalRole PRIVACY_STATEMENT;
    public static final DeliveryCheckoutLegalRole TERMS_OF_SERVICE;

    static {
        DeliveryCheckoutLegalRole deliveryCheckoutLegalRole = new DeliveryCheckoutLegalRole("TERMS_OF_SERVICE", 0);
        TERMS_OF_SERVICE = deliveryCheckoutLegalRole;
        DeliveryCheckoutLegalRole deliveryCheckoutLegalRole2 = new DeliveryCheckoutLegalRole("PRIVACY_STATEMENT", 1);
        PRIVACY_STATEMENT = deliveryCheckoutLegalRole2;
        DeliveryCheckoutLegalRole deliveryCheckoutLegalRole3 = new DeliveryCheckoutLegalRole("CANCELLATION_POLICY", 2);
        CANCELLATION_POLICY = deliveryCheckoutLegalRole3;
        DeliveryCheckoutLegalRole[] deliveryCheckoutLegalRoleArr = {deliveryCheckoutLegalRole, deliveryCheckoutLegalRole2, deliveryCheckoutLegalRole3};
        $VALUES = deliveryCheckoutLegalRoleArr;
        $ENTRIES = C3cG.A0w(deliveryCheckoutLegalRoleArr);
    }

    public static Ey9<DeliveryCheckoutLegalRole> getEntries() {
        return $ENTRIES;
    }

    public static DeliveryCheckoutLegalRole valueOf(String str) {
        return (DeliveryCheckoutLegalRole) Enum.valueOf(DeliveryCheckoutLegalRole.class, str);
    }

    public static DeliveryCheckoutLegalRole[] values() {
        return (DeliveryCheckoutLegalRole[]) $VALUES.clone();
    }

    public DeliveryCheckoutLegalRole(String str, int i) {
    }
}
