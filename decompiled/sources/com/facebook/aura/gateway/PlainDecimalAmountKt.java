package com.facebook.aura.gateway;

import X.C06827l3;
import X.C7384Etj;

/* loaded from: classes2.dex */
public abstract class PlainDecimalAmountKt {
    public static final C06827l3 PLAIN_DECIMAL_AMOUNT = new C06827l3("^[0-9]+(\\.[0-9]+)?$");

    public static final boolean isPlainDecimalAmount(String str) {
        C7384Etj.A0Y(str, 0);
        return PLAIN_DECIMAL_AMOUNT.A08(str);
    }
}
