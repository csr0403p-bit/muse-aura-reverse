package com.facebook.aura.login.nativeflow;

import X.AnonymousClass002;
import X.C06827l3;
import X.C7384Etj;
import X.C7BY;
import android.util.Patterns;
import com.facebook.aura.login.nativeflow.NativeLoginIdentifier;

/* loaded from: classes2.dex */
public abstract class NativeLoginIdentifierKt {
    public static final String E164_PARSE_REGION = "US";
    public static final C06827l3 PHONE_SEPARATORS = new C06827l3("[\\s()\\-.]");

    public static final NativeLoginIdentifierResult classifyLoginIdentifier(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        return strA0l.length() == 0 ? new NativeLoginIdentifierResult(null, null) : C7BY.A0k(strA0l, '@') ? classifyEmail(strA0l) : classifyPhone(strA0l, str2);
    }

    public static final NativeLoginIdentifierResult classifyEmail(String str) {
        return Patterns.EMAIL_ADDRESS.matcher(str).matches() ? new NativeLoginIdentifierResult(new NativeLoginIdentifier.Email(str), null) : new NativeLoginIdentifierResult(null, NativeLoginIdentifierError.INVALID_EMAIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult classifyPhone(java.lang.String r5, java.lang.String r6) {
        /*
            X.7l3 r1 = com.facebook.aura.login.nativeflow.NativeLoginIdentifierKt.PHONE_SEPARATORS
            java.lang.String r0 = ""
            java.lang.String r5 = r1.A03(r5, r0)
            java.lang.String r0 = "+"
            r4 = 0
            r2 = 0
            boolean r3 = r5.startsWith(r0)
            int r0 = r5.length()
            if (r0 == 0) goto L5a
            java.lang.String r1 = X.BQG.A16(r5, r3)
        L1a:
            int r0 = r1.length()
            if (r4 >= r0) goto L2d
            char r0 = r1.charAt(r4)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L5a
            int r4 = r4 + 1
            goto L1a
        L2d:
            if (r3 == 0) goto L44
            if (r6 != 0) goto L44
            java.lang.String r0 = "US"
        L33:
            java.lang.String r0 = android.telephony.PhoneNumberUtils.formatNumberToE164(r5, r0)
            if (r0 == 0) goto L48
            com.facebook.aura.login.nativeflow.NativeLoginIdentifier$Phone r1 = new com.facebook.aura.login.nativeflow.NativeLoginIdentifier$Phone
            r1.<init>(r0, r6)
            com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult r0 = new com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult
            r0.<init>(r1, r2)
            return r0
        L44:
            r0 = r6
            if (r6 == 0) goto L4a
            goto L33
        L48:
            if (r6 != 0) goto L57
        L4a:
            if (r3 != 0) goto L57
            com.facebook.aura.login.nativeflow.NativeLoginIdentifier$Phone r1 = new com.facebook.aura.login.nativeflow.NativeLoginIdentifier$Phone
            r1.<init>(r5, r2)
            com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult r0 = new com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult
            r0.<init>(r1, r2)
            return r0
        L57:
            com.facebook.aura.login.nativeflow.NativeLoginIdentifierError r1 = com.facebook.aura.login.nativeflow.NativeLoginIdentifierError.INVALID_PHONE
            goto L5c
        L5a:
            com.facebook.aura.login.nativeflow.NativeLoginIdentifierError r1 = com.facebook.aura.login.nativeflow.NativeLoginIdentifierError.INVALID_CONTACT_POINT
        L5c:
            com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult r0 = new com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult
            r0.<init>(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginIdentifierKt.classifyPhone(java.lang.String, java.lang.String):com.facebook.aura.login.nativeflow.NativeLoginIdentifierResult");
    }
}
