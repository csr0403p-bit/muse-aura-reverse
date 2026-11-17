package com.facebook.aura.navigation.key;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CheckoutLodgingPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CheckoutLodgingPolicy[] $VALUES;
    public static final CheckoutLodgingPolicy CANCELLATION;
    public static final CheckoutLodgingPolicy TAXES_AND_FEES;

    static {
        CheckoutLodgingPolicy checkoutLodgingPolicy = new CheckoutLodgingPolicy("CANCELLATION", 0);
        CANCELLATION = checkoutLodgingPolicy;
        CheckoutLodgingPolicy checkoutLodgingPolicy2 = new CheckoutLodgingPolicy("TAXES_AND_FEES", 1);
        TAXES_AND_FEES = checkoutLodgingPolicy2;
        CheckoutLodgingPolicy[] checkoutLodgingPolicyArr = {checkoutLodgingPolicy, checkoutLodgingPolicy2};
        $VALUES = checkoutLodgingPolicyArr;
        $ENTRIES = C3cG.A0w(checkoutLodgingPolicyArr);
    }

    public static Ey9<CheckoutLodgingPolicy> getEntries() {
        return $ENTRIES;
    }

    public static CheckoutLodgingPolicy valueOf(String str) {
        return (CheckoutLodgingPolicy) Enum.valueOf(CheckoutLodgingPolicy.class, str);
    }

    public static CheckoutLodgingPolicy[] values() {
        return (CheckoutLodgingPolicy[]) $VALUES.clone();
    }

    public CheckoutLodgingPolicy(String str, int i) {
    }
}
