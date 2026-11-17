package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.7ng, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07087ng {
    public final long A00;
    public final EnumC07097nh A01;
    public final String A02;
    public final String A03;

    public static C07087ng A00(String str) throws NumberFormatException {
        EnumC07097nh enumC07097nhValueOf;
        if (TextUtils.isEmpty(str)) {
            throw C60O.A0i("rawKeyID cannot be empty");
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length != 4) {
            throw C60O.A0i("rawKeyID wrong format");
        }
        String str2 = strArrSplit[0];
        if (TextUtils.isEmpty(str2.trim())) {
            throw C60O.A0i("appID must not be empty");
        }
        String str3 = strArrSplit[1];
        String str4 = strArrSplit[2];
        String str5 = strArrSplit[3];
        try {
            try {
                enumC07097nhValueOf = EnumC07097nh.valueOf(str3.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                if (str3.equals("SHA256withRSA")) {
                    enumC07097nhValueOf = EnumC07097nh.RS256;
                } else {
                    if (!str3.equals("SHA256withECDSA")) {
                        throw C60O.A0i("Unrecognized JCA algorithm");
                    }
                    enumC07097nhValueOf = EnumC07097nh.ES256;
                }
            }
            try {
                long j = Long.parseLong(str4, 10);
                try {
                    Long.parseLong(str5, 10);
                    return new C07087ng(enumC07097nhValueOf, str, str2, j);
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(FGI.A0M("Unable to parse createdTime ", str5), e);
                }
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(FGI.A0M("Unable to parse keyID ", str4), e2);
            }
        } catch (IllegalArgumentException unused2) {
            throw C60Q.A0U("Unknown SignatureAlgorithm name or JCA value", str3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C07087ng) {
            return this.A03.equals(((C07087ng) obj).A03);
        }
        return false;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        return this.A03;
    }

    public C07087ng(EnumC07097nh enumC07097nh, String str, String str2, long j) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = enumC07097nh;
        this.A00 = j;
    }
}
