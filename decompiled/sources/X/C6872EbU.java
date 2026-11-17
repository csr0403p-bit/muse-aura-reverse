package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.EbU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6872EbU {
    public static final C6872EbU A04;
    public static final C6872EbU A05;
    public static final C6872EbU A06;
    public static final C6872EbU A07;
    public static final C6895Ebr[] A08;
    public static final C6895Ebr[] A09;
    public final boolean A00;
    public final boolean A01;
    public final String[] A02;
    public final String[] A03;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (X.AbstractC6843Eav.A0E(X.C6916EcH.A00, r2, r5.getEnabledProtocols()) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(javax.net.ssl.SSLSocket r5) {
        /*
            r4 = this;
            r3 = 0
            boolean r0 = r4.A00
            if (r0 == 0) goto L15
            java.lang.String[] r2 = r4.A03
            if (r2 == 0) goto L16
            java.lang.String[] r1 = r5.getEnabledProtocols()
            X.EcH r0 = X.C6916EcH.A00
            boolean r0 = X.AbstractC6843Eav.A0E(r0, r2, r1)
            if (r0 != 0) goto L16
        L15:
            return r3
        L16:
            java.lang.String[] r2 = r4.A02
            if (r2 == 0) goto L27
            java.lang.String[] r1 = r5.getEnabledCipherSuites()
            java.util.Comparator<java.lang.String> r0 = X.C6895Ebr.A01
            boolean r0 = X.AbstractC6843Eav.A0E(r0, r2, r1)
            if (r0 != 0) goto L27
            return r3
        L27:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6872EbU.A00(javax.net.ssl.SSLSocket):boolean");
    }

    static {
        C6895Ebr c6895Ebr = C6895Ebr.A06;
        C6895Ebr c6895Ebr2 = C6895Ebr.A07;
        C6895Ebr c6895Ebr3 = C6895Ebr.A08;
        C6895Ebr c6895Ebr4 = C6895Ebr.A0k;
        C6895Ebr c6895Ebr5 = C6895Ebr.A0x;
        C6895Ebr c6895Ebr6 = C6895Ebr.A0n;
        C6895Ebr c6895Ebr7 = C6895Ebr.A10;
        C6895Ebr c6895Ebr8 = C6895Ebr.A0o;
        C6895Ebr c6895Ebr9 = C6895Ebr.A11;
        C6895Ebr[] c6895EbrArr = {c6895Ebr, c6895Ebr2, c6895Ebr3, c6895Ebr4, c6895Ebr5, c6895Ebr6, c6895Ebr7, c6895Ebr8, c6895Ebr9};
        A09 = c6895EbrArr;
        C6895Ebr[] c6895EbrArr2 = {c6895Ebr, c6895Ebr2, c6895Ebr3, c6895Ebr4, c6895Ebr5, c6895Ebr6, c6895Ebr7, c6895Ebr8, c6895Ebr9, C6895Ebr.A0v, C6895Ebr.A0y, C6895Ebr.A1m, C6895Ebr.A1p, C6895Ebr.A1k, C6895Ebr.A1n, C6895Ebr.A1j};
        A08 = c6895EbrArr2;
        C6891Ebn c6891Ebn = new C6891Ebn();
        c6891Ebn.A01 = true;
        c6891Ebn.A03((C6895Ebr[]) Arrays.copyOf(c6895EbrArr, 9));
        EnumC6899Ebv enumC6899Ebv = EnumC6899Ebv.TLS_1_3;
        EnumC6899Ebv enumC6899Ebv2 = EnumC6899Ebv.TLS_1_2;
        c6891Ebn.A04(enumC6899Ebv, enumC6899Ebv2);
        if (!c6891Ebn.A01) {
            throw C60O.A0i("no TLS extensions for cleartext connections");
        }
        c6891Ebn.A00 = true;
        A07 = c6891Ebn.A00();
        C6891Ebn c6891Ebn2 = new C6891Ebn();
        c6891Ebn2.A01 = true;
        c6891Ebn2.A03((C6895Ebr[]) Arrays.copyOf(c6895EbrArr2, 16));
        c6891Ebn2.A04(enumC6899Ebv, enumC6899Ebv2);
        if (!c6891Ebn2.A01) {
            throw C60O.A0i("no TLS extensions for cleartext connections");
        }
        c6891Ebn2.A00 = true;
        A06 = c6891Ebn2.A00();
        C6891Ebn c6891Ebn3 = new C6891Ebn();
        c6891Ebn3.A01 = true;
        c6891Ebn3.A03((C6895Ebr[]) Arrays.copyOf(c6895EbrArr2, 16));
        c6891Ebn3.A04(enumC6899Ebv, enumC6899Ebv2, EnumC6899Ebv.TLS_1_1, EnumC6899Ebv.TLS_1_0);
        if (!c6891Ebn3.A01) {
            throw C60O.A0i("no TLS extensions for cleartext connections");
        }
        c6891Ebn3.A00 = true;
        A05 = c6891Ebn3.A00();
        C6891Ebn c6891Ebn4 = new C6891Ebn();
        c6891Ebn4.A01 = false;
        A04 = c6891Ebn4.A00();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6872EbU) {
            if (obj != this) {
                boolean z = this.A00;
                C6872EbU c6872EbU = (C6872EbU) obj;
                if (z != c6872EbU.A00 || (z && (!Arrays.equals(this.A02, c6872EbU.A02) || !Arrays.equals(this.A03, c6872EbU.A03) || this.A01 != c6872EbU.A01))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 17;
        }
        String[] strArr = this.A02;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.A03;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.A01 ? 1 : 0);
    }

    public final String toString() {
        List listA0X;
        List listA0X2;
        if (!this.A00) {
            return "ConnectionSpec()";
        }
        StringBuilder sbA0x = C60O.A0x("ConnectionSpec(cipherSuites=");
        String[] strArr = this.A02;
        if (strArr == null) {
            listA0X = null;
        } else {
            ArrayList arrayListA11 = C60O.A11(strArr.length);
            for (String str : strArr) {
                arrayListA11.add(C6895Ebr.A03.A01(str));
            }
            listA0X = AbstractC0878AGe.A0X(arrayListA11);
        }
        sbA0x.append((Object) (listA0X != null ? listA0X.toString() : "[all enabled]"));
        sbA0x.append(", tlsVersions=");
        String[] strArr2 = this.A03;
        if (strArr2 == null) {
            listA0X2 = null;
        } else {
            ArrayList arrayListA112 = C60O.A11(strArr2.length);
            for (String str2 : strArr2) {
                arrayListA112.add(EnumC6899Ebv.A00(str2));
            }
            listA0X2 = AbstractC0878AGe.A0X(arrayListA112);
        }
        sbA0x.append((Object) (listA0X2 != null ? listA0X2.toString() : "[all enabled]"));
        sbA0x.append(", supportsTlsExtensions=");
        sbA0x.append(this.A01);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C6872EbU(String[] strArr, String[] strArr2, boolean z, boolean z2) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = strArr;
        this.A03 = strArr2;
    }
}
