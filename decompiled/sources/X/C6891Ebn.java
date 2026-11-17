package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Ebn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6891Ebn {
    public boolean A00;
    public boolean A01;
    public String[] A02;
    public String[] A03;

    public final void A01(String... strArr) {
        C7384Etj.A0Y(strArr, 0);
        if (!this.A01) {
            throw C60O.A0i("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw C60O.A0i("At least one cipher suite is required");
        }
        this.A02 = (String[]) strArr.clone();
    }

    public final void A02(String... strArr) {
        C7384Etj.A0Y(strArr, 0);
        if (!this.A01) {
            throw C60O.A0i("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw C60O.A0i("At least one TLS version is required");
        }
        this.A03 = (String[]) strArr.clone();
    }

    public final void A03(C6895Ebr... c6895EbrArr) {
        C7384Etj.A0Y(c6895EbrArr, 0);
        if (!this.A01) {
            throw C60O.A0i("no cipher suites for cleartext connections");
        }
        ArrayList arrayListA11 = C60O.A11(c6895EbrArr.length);
        for (C6895Ebr c6895Ebr : c6895EbrArr) {
            arrayListA11.add(c6895Ebr.A00);
        }
        Object[] array = arrayListA11.toArray(new String[0]);
        if (array == null) {
            throw BV6.A0h();
        }
        String[] strArr = (String[]) array;
        A01((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void A04(EnumC6899Ebv... enumC6899EbvArr) {
        if (!this.A01) {
            throw C60O.A0i("no TLS versions for cleartext connections");
        }
        ArrayList arrayListA11 = C60O.A11(enumC6899EbvArr.length);
        for (EnumC6899Ebv enumC6899Ebv : enumC6899EbvArr) {
            arrayListA11.add(enumC6899Ebv.javaName);
        }
        Object[] array = arrayListA11.toArray(new String[0]);
        if (array == null) {
            throw BV6.A0h();
        }
        String[] strArr = (String[]) array;
        A02((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final C6872EbU A00() {
        return new C6872EbU(this.A02, this.A03, this.A01, this.A00);
    }
}
