package X;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class E2Z extends AbstractC6412E4o {
    public long A00;
    public long[] A01;
    public long[] A02;

    public E2Z() {
        super(new C5551DkU());
        this.A00 = -9223372036854775807L;
        this.A02 = new long[0];
        this.A01 = new long[0];
    }

    public static Object A00(E1P e1p, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(e1p.A0G()));
        }
        if (i == 1) {
            return Boolean.valueOf(BV5.A1O(e1p.A0A(), 1));
        }
        if (i == 2) {
            return A01(e1p);
        }
        if (i != 3) {
            if (i == 8) {
                return A02(e1p);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(e1p.A0G()));
                e1p.A0S(2);
                return date;
            }
            int iA0C = e1p.A0C();
            ArrayList arrayListA11 = C60O.A11(iA0C);
            for (int i2 = 0; i2 < iA0C; i2++) {
                Object objA00 = A00(e1p, e1p.A0A());
                if (objA00 != null) {
                    arrayListA11.add(objA00);
                }
            }
            return arrayListA11;
        }
        HashMap mapA0u = BV4.A0u();
        while (true) {
            String strA01 = A01(e1p);
            int iA0A = e1p.A0A();
            if (iA0A == 9) {
                return mapA0u;
            }
            Object objA002 = A00(e1p, iA0A);
            if (objA002 != null) {
                mapA0u.put(strA01, objA002);
            }
        }
    }

    public static String A01(E1P e1p) {
        int iA0D = e1p.A0D();
        int i = e1p.A01;
        e1p.A0S(iA0D);
        return new String(e1p.A02, i, iA0D);
    }

    public static HashMap<String, Object> A02(E1P e1p) {
        int iA0C = e1p.A0C();
        HashMap<String, Object> mapA0v = BV4.A0v(iA0C);
        for (int i = 0; i < iA0C; i++) {
            String strA01 = A01(e1p);
            Object objA00 = A00(e1p, e1p.A0A());
            if (objA00 != null) {
                mapA0v.put(strA01, objA00);
            }
        }
        return mapA0v;
    }
}
