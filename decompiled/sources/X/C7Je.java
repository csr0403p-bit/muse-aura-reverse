package X;

import android.net.Uri;
import android.util.Log;
import android.util.LruCache;
import java.net.URI;

/* renamed from: X.7Je, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7Je {
    public static volatile boolean A02;
    public static final C7Jh A01 = new C6936Ecm();
    public static final LruCache<String, Boolean> A00 = new LruCache<>(20);

    public static Uri A02(String str) {
        String strAc0;
        if (str == null) {
            throw C60O.A0i("Url string is null");
        }
        try {
            return A01(str);
        } catch (SecurityException e) {
            try {
                strAc0 = A01.Ac0(str);
            } catch (IllegalArgumentException unused) {
                strAc0 = "<sanitization failed>";
            }
            StringBuilder sbA0g = C3cG.A0g("Parse uri <sanitized \"");
            sbA0g.append(strAc0);
            Log.e("UriParser", C60P.A1P("\"> failed. Fail open: ", sbA0g, false), e);
            return null;
        }
    }

    public static boolean A06(String str, String str2) {
        return (str == null || str.equals("")) ? str2 == null || str2.equals("") : str.equals(str2);
    }

    public static Uri A00(C7mY c7mY, String str) {
        String strAc0;
        try {
            return A01(str);
        } catch (SecurityException e) {
            try {
                strAc0 = A01.Ac0(str);
            } catch (IllegalArgumentException unused) {
                strAc0 = "<sanitization failed>";
            }
            StringBuilder sbA0g = C3cG.A0g("Parse uri <sanitized \"");
            sbA0g.append(strAc0);
            c7mY.report("UriParser", C60P.A1P("\"> failed. Fail open: ", sbA0g, false), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r1.contains("_") != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[PHI: r4
  0x0040: PHI (r4v4 boolean) = (r4v0 boolean), (r4v6 boolean) binds: [B:12:0x002a, B:14:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri A01(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7Je.A01(java.lang.String):android.net.Uri");
    }

    public static void A03(Uri uri, String str, URI uri2) {
        String strAc0;
        String strAc02;
        String strAc03;
        boolean zA06 = A06(uri2.getScheme(), uri.getScheme());
        boolean zA062 = A06(uri2.getSchemeSpecificPart(), uri.getSchemeSpecificPart());
        if (zA06 && zA062) {
            return;
        }
        try {
            strAc0 = A01.Ac0(uri2.toString());
        } catch (IllegalArgumentException unused) {
            strAc0 = "<sanitization failed>";
        }
        try {
            strAc02 = A01.Ac0(uri.toString());
        } catch (IllegalArgumentException unused2) {
            strAc02 = "<sanitization failed>";
        }
        try {
            strAc03 = A01.Ac0(str);
        } catch (IllegalArgumentException unused3) {
            strAc03 = "<sanitization failed>";
        }
        throw new SecurityException(FGI.A0k("java uri <sanitized \"", strAc0, "\"> not equal to android uri <sanitized \"", strAc02, "\"> from original <sanitized \"", strAc03, "\">"));
    }

    public static void A04(Uri uri, URI uri2, boolean z) {
        String strAc0;
        String strAc02;
        boolean zA06 = A06(uri2.getScheme(), uri.getScheme());
        boolean zA062 = A06(uri2.getAuthority(), uri.getAuthority());
        boolean zA063 = A06(uri2.getPath(), uri.getPath());
        if (zA06 && zA062 && zA063) {
            return;
        }
        String strA0h = !zA06 ? FGI.A0h("javaUri scheme: \"", uri2.getScheme(), "\". androidUri scheme: \"", uri.getScheme(), "\".") : "";
        if (!z && !zA062) {
            strA0h = FGI.A0j(strA0h, "javaUri authority: \"", uri2.getAuthority(), "\". androidUri authority: \"", uri.getAuthority(), "\".");
        }
        if (!zA063) {
            strA0h = FGI.A0j(strA0h, "javaUri path: \"", uri2.getPath(), "\". androidUri path: \"", uri.getPath(), "\".");
        }
        try {
            strAc0 = A01.Ac0(uri2.toString());
        } catch (IllegalArgumentException unused) {
            strAc0 = "<sanitization failed>";
        }
        try {
            strAc02 = A01.Ac0(uri.toString());
        } catch (IllegalArgumentException unused2) {
            strAc02 = "<sanitization failed>";
        }
        throw new SecurityException(FGI.A0k("java uri <sanitized \"", strAc0, "\"> not equal to android uri <sanitized \"", strAc02, "\">. Debug info ", strA0h, "."));
    }

    public static boolean A05(Uri uri, String str, boolean z) {
        String host = uri.getHost();
        if (host != null) {
            return host.equalsIgnoreCase(str) || (z && host.endsWith(FGI.A0M(".", str)));
        }
        return false;
    }
}
