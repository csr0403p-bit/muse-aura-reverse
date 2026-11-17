package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CheckoutPresentationKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CheckoutPresentationKind[] $VALUES;
    public static final CheckoutPresentationKind LODGING;
    public static final CheckoutPresentationKind RETAIL;

    static {
        CheckoutPresentationKind checkoutPresentationKind = new CheckoutPresentationKind("RETAIL", 0);
        RETAIL = checkoutPresentationKind;
        CheckoutPresentationKind checkoutPresentationKind2 = new CheckoutPresentationKind("LODGING", 1);
        LODGING = checkoutPresentationKind2;
        CheckoutPresentationKind[] checkoutPresentationKindArr = {checkoutPresentationKind, checkoutPresentationKind2};
        $VALUES = checkoutPresentationKindArr;
        $ENTRIES = C3cG.A0w(checkoutPresentationKindArr);
    }

    public static Ey9<CheckoutPresentationKind> getEntries() {
        return $ENTRIES;
    }

    public static CheckoutPresentationKind valueOf(String str) {
        return (CheckoutPresentationKind) Enum.valueOf(CheckoutPresentationKind.class, str);
    }

    public static CheckoutPresentationKind[] values() {
        return (CheckoutPresentationKind[]) $VALUES.clone();
    }

    public CheckoutPresentationKind(String str, int i) {
    }
}
