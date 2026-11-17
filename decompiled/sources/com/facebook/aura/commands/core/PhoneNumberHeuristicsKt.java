package com.facebook.aura.commands.core;

import X.C06827l3;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class PhoneNumberHeuristicsKt {
    public static final C06827l3 PHONE_NUMBER_LIKE_REGEX = C06827l3.A02("^[+0-9()\\-\\s.]+$");

    public static final boolean looksLikePhoneNumber(String str) {
        C7384Etj.A0Y(str, 0);
        if (!PHONE_NUMBER_LIKE_REGEX.A08(str)) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        return i >= 3;
    }
}
