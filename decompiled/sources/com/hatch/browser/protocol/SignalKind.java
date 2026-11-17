package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SignalKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SignalKind[] $VALUES;
    public static final SignalKind CC_NUMBER_INPUT_PRESENT;
    public static final SignalKind CHECKOUT_PAGE;
    public static final Companion Companion;
    public static final SignalKind ONE_TIME_CODE_INPUT_PRESENT;
    public static final SignalKind PASSWORD_INPUT_PRESENT;
    public static final SignalKind PII_INPUT_PRESENT;
    public static final SignalKind SHOPIFY_CHECKOUT;
    public static final SignalKind SHOPIFY_STORE_PRESENT;
    public static final SignalKind SHOP_PAY_APPROVAL_INPUT_PRESENT;
    public static final SignalKind SHOP_PAY_CHECKOUT_PRESENT;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        SignalKind signalKind = new SignalKind("ONE_TIME_CODE_INPUT_PRESENT", 0);
        ONE_TIME_CODE_INPUT_PRESENT = signalKind;
        SignalKind signalKind2 = new SignalKind("PASSWORD_INPUT_PRESENT", 1);
        PASSWORD_INPUT_PRESENT = signalKind2;
        SignalKind signalKind3 = new SignalKind("CC_NUMBER_INPUT_PRESENT", 2);
        CC_NUMBER_INPUT_PRESENT = signalKind3;
        SignalKind signalKind4 = new SignalKind("CHECKOUT_PAGE", 3);
        CHECKOUT_PAGE = signalKind4;
        SignalKind signalKind5 = new SignalKind("PII_INPUT_PRESENT", 4);
        PII_INPUT_PRESENT = signalKind5;
        SignalKind signalKind6 = new SignalKind("SHOPIFY_CHECKOUT", 5);
        SHOPIFY_CHECKOUT = signalKind6;
        SignalKind signalKind7 = new SignalKind("SHOPIFY_STORE_PRESENT", 6);
        SHOPIFY_STORE_PRESENT = signalKind7;
        SignalKind signalKind8 = new SignalKind("SHOP_PAY_APPROVAL_INPUT_PRESENT", 7);
        SHOP_PAY_APPROVAL_INPUT_PRESENT = signalKind8;
        SignalKind signalKind9 = new SignalKind("SHOP_PAY_CHECKOUT_PRESENT", 8);
        SHOP_PAY_CHECKOUT_PRESENT = signalKind9;
        SignalKind[] signalKindArr = {signalKind, signalKind2, signalKind3, signalKind4, signalKind5, signalKind6, signalKind7, signalKind8, signalKind9};
        $VALUES = signalKindArr;
        $ENTRIES = C3cG.A0w(signalKindArr);
        Companion = new Companion();
    }

    public static Ey9<SignalKind> getEntries() {
        return $ENTRIES;
    }

    public static SignalKind valueOf(String str) {
        return (SignalKind) Enum.valueOf(SignalKind.class, str);
    }

    public static SignalKind[] values() {
        return (SignalKind[]) $VALUES.clone();
    }

    public SignalKind(String str, int i) {
    }
}
