package X;

import java.util.Date;

/* loaded from: classes5.dex */
public abstract class EYZ {
    public static final EYY A00;
    public static final EYY A01;
    public static final EYY A02;
    public static final boolean A03;

    static {
        boolean z;
        EYY eyy;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        A03 = z;
        if (z) {
            AbstractC6745EYf<Date> abstractC6745EYf = AbstractC6745EYf.A00;
            A00 = EYa.A01;
            A02 = C6741EYb.A01;
            eyy = C6744EYe.A01;
        } else {
            eyy = null;
        }
        A01 = eyy;
    }
}
