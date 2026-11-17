package X;

import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: X.EcW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6923EcW {
    public static final void A01(String str, AbstractC6924EcX abstractC6924EcX, C6922EcV c6922EcV) {
        Logger logger = C6920EcT.A07;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(c6922EcV.A03);
        sbA0w.append(' ');
        sbA0w.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sbA0w.append(": ");
        logger.fine(AnonymousClass001.A0v(abstractC6924EcX.A02, sbA0w));
    }

    public static final String A00(long j) {
        StringBuilder sbA0w;
        long j2;
        long j3;
        long j4;
        if (j > -999500000) {
            if (j > -999500) {
                if (j <= 0) {
                    sbA0w = C60O.A0w();
                    j4 = j - 500;
                } else if (j < 999500) {
                    sbA0w = C60O.A0w();
                    j4 = j + 500;
                } else {
                    sbA0w = C60O.A0w();
                    if (j < 999500000) {
                        j3 = j + 500000;
                    } else {
                        j2 = j + 500000000;
                    }
                }
                sbA0w.append(BV4.A04(j4));
                sbA0w.append(" \u00b5s");
                return String.format("%6s", Arrays.copyOf(new Object[]{sbA0w.toString()}, 1));
            }
            sbA0w = C60O.A0w();
            j3 = j - 500000;
            sbA0w.append(BV4.A05(j3));
            sbA0w.append(" ms");
            return String.format("%6s", Arrays.copyOf(new Object[]{sbA0w.toString()}, 1));
        }
        sbA0w = C60O.A0w();
        j2 = j - 500000000;
        sbA0w.append(j2 / 1000000000);
        sbA0w.append(" s ");
        return String.format("%6s", Arrays.copyOf(new Object[]{sbA0w.toString()}, 1));
    }
}
