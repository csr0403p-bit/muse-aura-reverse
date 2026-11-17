package X;

import android.net.Uri;
import java.math.BigInteger;
import java.net.URI;
import java.security.SecureRandom;

/* renamed from: X.7Jf, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Jf {
    public final String A00;
    public final String A01 = new BigInteger(130, new SecureRandom()).toString(32);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C7Jf) {
                C7Jf c7Jf = (C7Jf) obj;
                if (!c7Jf.A00.equals(this.A00) || !c7Jf.A01.equals(this.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(String str) {
        try {
            boolean z = C7Je.A02;
            URI uriCreate = URI.create(str);
            Uri uriBuild = new Uri.Builder().scheme(uriCreate.getScheme()).encodedAuthority(uriCreate.getRawAuthority()).encodedPath(uriCreate.getRawPath()).encodedQuery(uriCreate.getRawQuery()).encodedFragment(uriCreate.getRawFragment()).build();
            C7Je.A04(uriBuild, uriCreate, false);
            return FGI.A0U(uriBuild.getScheme(), "://", uriBuild.getAuthority());
        } catch (Exception unused) {
            return str;
        }
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C7Jf(String str) {
        this.A00 = A00(str);
    }
}
