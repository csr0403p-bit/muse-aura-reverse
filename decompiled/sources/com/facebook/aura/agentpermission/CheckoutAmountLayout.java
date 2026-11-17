package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CheckoutAmountLayout {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CheckoutAmountLayout[] $VALUES;
    public static final CheckoutAmountLayout RECEIPT;
    public static final CheckoutAmountLayout SUMMARY;
    public static final CheckoutAmountLayout WRAPPING;

    static {
        CheckoutAmountLayout checkoutAmountLayout = new CheckoutAmountLayout("RECEIPT", 0);
        RECEIPT = checkoutAmountLayout;
        CheckoutAmountLayout checkoutAmountLayout2 = new CheckoutAmountLayout("SUMMARY", 1);
        SUMMARY = checkoutAmountLayout2;
        CheckoutAmountLayout checkoutAmountLayout3 = new CheckoutAmountLayout("WRAPPING", 2);
        WRAPPING = checkoutAmountLayout3;
        CheckoutAmountLayout[] checkoutAmountLayoutArr = {checkoutAmountLayout, checkoutAmountLayout2, checkoutAmountLayout3};
        $VALUES = checkoutAmountLayoutArr;
        $ENTRIES = C3cG.A0w(checkoutAmountLayoutArr);
    }

    public static Ey9<CheckoutAmountLayout> getEntries() {
        return $ENTRIES;
    }

    public static CheckoutAmountLayout valueOf(String str) {
        return (CheckoutAmountLayout) Enum.valueOf(CheckoutAmountLayout.class, str);
    }

    public static CheckoutAmountLayout[] values() {
        return (CheckoutAmountLayout[]) $VALUES.clone();
    }

    public CheckoutAmountLayout(String str, int i) {
    }
}
