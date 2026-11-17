package X;

import java.io.InputStream;

/* renamed from: X.9sd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC07979sd {
    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/9sU;LX/9jG<+TT;>;Ljava/io/InputStream;)TT; */
    public static final Object A00(InputStream inputStream, C9jG c9jG, C9sU c9sU) {
        C7384Etj.A0Y(c9sU, 0);
        C7384Etj.A0Y(c9jG, 1);
        C7384Etj.A0Y(inputStream, 2);
        C9t1 c9t1 = new C9t1(inputStream);
        try {
            BLO blo = BLO.A00;
            char[] cArrA01 = blo.A01(16384);
            C07989se c07989se = !c9sU.A00.A03 ? new C07989se(c9t1, cArrA01) : new C9sf(c9t1, cArrA01);
            try {
                Object objA8b = new C9sP(c9jG.getDescriptor(), c9sU, c07989se, null, C9sh.A04).A8b(c9jG);
                c07989se.A0J();
                char[] cArr = c07989se.A02;
                int length = cArr.length;
                if (length != 16384) {
                    throw new IllegalArgumentException(FGI.A0H("Inconsistent internal invariant: unexpected array size ", length));
                }
                blo.A00(cArr);
                return objA8b;
            } catch (Throwable th) {
                char[] cArr2 = c07989se.A02;
                int length2 = cArr2.length;
                if (length2 != 16384) {
                    throw new IllegalArgumentException(FGI.A0H("Inconsistent internal invariant: unexpected array size ", length2));
                }
                blo.A00(cArr2);
                throw th;
            }
        } finally {
            CFX cfx = c9t1.A00;
            C0908AHk c0908AHk = C0908AHk.A00;
            byte[] bArrArray = cfx.A03.array();
            C7384Etj.A0U(bArrArray);
            c0908AHk.A00(bArrArray);
        }
    }
}
