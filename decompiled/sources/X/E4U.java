package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class E4U {
    public static E55 A00(E1P e1p) {
        e1p.A0S(1);
        int iA0B = e1p.A0B();
        long j = e1p.A01 + iA0B;
        int i = iA0B / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jA0G = e1p.A0G();
            if (jA0G == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jA0G;
            jArrCopyOf2[i2] = e1p.A0G();
            e1p.A0S(2);
            i2++;
        }
        e1p.A0S((int) (j - e1p.A01));
        return new E55(jArrCopyOf, jArrCopyOf2);
    }
}
