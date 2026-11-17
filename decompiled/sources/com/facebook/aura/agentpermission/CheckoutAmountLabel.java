package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CheckoutAmountLabel {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CheckoutAmountLabel[] $VALUES;
    public static final CheckoutAmountLabel BASE_RATE;
    public static final CheckoutAmountLabel DUE_AT_PROPERTY;
    public static final CheckoutAmountLabel DUE_NOW;
    public static final CheckoutAmountLabel ORDER_TOTAL;
    public static final CheckoutAmountLabel PROPERTY_FEES;
    public static final CheckoutAmountLabel PROVIDED;
    public static final CheckoutAmountLabel STAY_TOTAL;
    public static final CheckoutAmountLabel TAXES_AND_FEES;

    static {
        CheckoutAmountLabel checkoutAmountLabel = new CheckoutAmountLabel("PROVIDED", 0);
        PROVIDED = checkoutAmountLabel;
        CheckoutAmountLabel checkoutAmountLabel2 = new CheckoutAmountLabel("ORDER_TOTAL", 1);
        ORDER_TOTAL = checkoutAmountLabel2;
        CheckoutAmountLabel checkoutAmountLabel3 = new CheckoutAmountLabel("STAY_TOTAL", 2);
        STAY_TOTAL = checkoutAmountLabel3;
        CheckoutAmountLabel checkoutAmountLabel4 = new CheckoutAmountLabel("BASE_RATE", 3);
        BASE_RATE = checkoutAmountLabel4;
        CheckoutAmountLabel checkoutAmountLabel5 = new CheckoutAmountLabel("TAXES_AND_FEES", 4);
        TAXES_AND_FEES = checkoutAmountLabel5;
        CheckoutAmountLabel checkoutAmountLabel6 = new CheckoutAmountLabel("PROPERTY_FEES", 5);
        PROPERTY_FEES = checkoutAmountLabel6;
        CheckoutAmountLabel checkoutAmountLabel7 = new CheckoutAmountLabel("DUE_NOW", 6);
        DUE_NOW = checkoutAmountLabel7;
        CheckoutAmountLabel checkoutAmountLabel8 = new CheckoutAmountLabel("DUE_AT_PROPERTY", 7);
        DUE_AT_PROPERTY = checkoutAmountLabel8;
        CheckoutAmountLabel[] checkoutAmountLabelArr = {checkoutAmountLabel, checkoutAmountLabel2, checkoutAmountLabel3, checkoutAmountLabel4, checkoutAmountLabel5, checkoutAmountLabel6, checkoutAmountLabel7, checkoutAmountLabel8};
        $VALUES = checkoutAmountLabelArr;
        $ENTRIES = C3cG.A0w(checkoutAmountLabelArr);
    }

    public static Ey9<CheckoutAmountLabel> getEntries() {
        return $ENTRIES;
    }

    public static CheckoutAmountLabel valueOf(String str) {
        return (CheckoutAmountLabel) Enum.valueOf(CheckoutAmountLabel.class, str);
    }

    public static CheckoutAmountLabel[] values() {
        return (CheckoutAmountLabel[]) $VALUES.clone();
    }

    public CheckoutAmountLabel(String str, int i) {
    }
}
