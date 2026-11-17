package com.facebook.aura.activation.model;

import X.C60O;
import X.C7384Etj;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class InviteCodeKt {
    public static final int INVITE_CODE_LENGTH = 6;

    public static final String normalizeInviteCodeInput(String str) {
        C7384Etj.A0Y(str, 0);
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        String upperCase = sbA0w.toString().toUpperCase(Locale.ROOT);
        if (upperCase.length() > 6) {
            return null;
        }
        return upperCase;
    }
}
