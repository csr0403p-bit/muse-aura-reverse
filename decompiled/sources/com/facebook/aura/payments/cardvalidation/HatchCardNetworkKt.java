package com.facebook.aura.payments.cardvalidation;

import X.C60O;
import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class HatchCardNetworkKt {
    public static final String alphanumericsOnly(String str) {
        C7384Etj.A0Y(str, 0);
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (isAsciiAlphanumeric(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        return sbA0w.toString();
    }

    public static final String digitsOnly(String str) {
        C7384Etj.A0Y(str, 0);
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (isAsciiDigit(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        return sbA0w.toString();
    }

    public static final boolean isAsciiDigit(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean isAsciiLetter(char c) {
        if ('A' > c) {
            return false;
        }
        if (c >= '[') {
            return 'a' <= c && c < '{';
        }
        return true;
    }

    public static final boolean isAsciiAlphanumeric(char c) {
        return isAsciiDigit(c) || isAsciiLetter(c);
    }
}
