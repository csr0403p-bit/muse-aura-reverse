package X;

import java.io.IOException;
import java.util.Collections;

/* renamed from: X.Edt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6992Edt {
    public static final F0O<Integer> A00;

    public static final int A00(C7481Exe c7481Exe, C1bk c1bk, C6988Edo c6988Edo, boolean z) throws IOException {
        int i;
        int i2;
        C7384Etj.A0Y(c6988Edo, 2);
        if (z && c7481Exe != null) {
            int iA02 = A02(c1bk, c6988Edo);
            int iA01 = C6988Edo.A04(c6988Edo) ? A01(c1bk, c6988Edo) : 0;
            if (iA02 == 90 || iA02 == 270 || iA01 == 5 || iA01 == 7) {
                C6988Edo.A03(c6988Edo);
                i = c6988Edo.A01;
                C6988Edo.A03(c6988Edo);
                i2 = c6988Edo.A05;
            } else {
                C6988Edo.A03(c6988Edo);
                i = c6988Edo.A05;
                C6988Edo.A03(c6988Edo);
                i2 = c6988Edo.A01;
            }
            float f = i;
            float f2 = i2;
            float fMax = Math.max(c7481Exe.A01 / f, c7481Exe.A00 / f2);
            if (f * fMax > 2048.0f) {
                fMax = 2048.0f / f;
            }
            if (f2 * fMax > 2048.0f) {
                fMax = 2048.0f / f2;
            }
            int i3 = (int) (0.6666667f + (fMax * 8.0f));
            if (i3 <= 8) {
                if (i3 < 1) {
                    return 1;
                }
                return i3;
            }
        }
        return 8;
    }

    public static final int A02(C1bk c1bk, C6988Edo c6988Edo) throws IOException {
        int i;
        int i2 = c1bk.A00;
        if (i2 == -2) {
            return 0;
        }
        C6988Edo.A03(c6988Edo);
        int i3 = c6988Edo.A02;
        if (i3 == 90 || i3 == 180 || i3 == 270) {
            C6988Edo.A03(c6988Edo);
            i = c6988Edo.A02;
        } else {
            i = 0;
        }
        return i2 != -1 ? (i - 2) % 360 : i;
    }

    static {
        Integer[] numArr = {BV4.A0X(), 7, 4, 5};
        F0O<Integer> f0o = new F0O<>(4);
        Collections.addAll(f0o, numArr);
        A00 = f0o;
    }

    public static final int A01(C1bk c1bk, C6988Edo c6988Edo) throws IOException {
        C6988Edo.A03(c6988Edo);
        int i = c6988Edo.A00;
        F0O<Integer> f0o = A00;
        int iIndexOf = f0o.indexOf(Integer.valueOf(i));
        if (iIndexOf < 0) {
            throw C60O.A0i("Only accepts inverted exif orientations");
        }
        int i2 = c1bk.A00;
        if (i2 == -1) {
            i2 = 0;
        }
        Integer num = f0o.get((iIndexOf + (i2 / 90)) % f0o.size());
        C7384Etj.A0U(num);
        return AnonymousClass001.A0F(num);
    }
}
