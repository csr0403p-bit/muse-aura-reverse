package X;

import androidx.media3.common.ParserException;
import com.facebook.aura.components.reactions.AuraDoubleTakeKt;

/* renamed from: X.E2h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6355E2h {
    public static final int[] A00 = {2002, 2000, 1920, 1601, AuraDoubleTakeKt.DOUBLE_TAKE_TOTAL_MS, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void A01(C6340E1q c6340E1q) throws ParserException {
        int iA08 = c6340E1q.A08(6);
        if (iA08 < 2 || iA08 > 42) {
            throw ParserException.A00(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", BV5.A1Y(iA08)));
        }
        c6340E1q.A0C(iA08 * 8);
    }

    public static void A02(C6340E1q c6340E1q, C6405E4h c6405E4h) {
        int iA08 = c6340E1q.A08(5);
        c6340E1q.A0C(2);
        C6340E1q.A04(c6340E1q, 5);
        if (iA08 >= 7 && iA08 <= 10) {
            c6340E1q.A0A();
        }
        if (c6340E1q.A0I()) {
            int iA082 = c6340E1q.A08(3);
            if (c6405E4h.A00 == -1 && iA08 >= 0 && iA08 <= 15 && (iA082 == 0 || iA082 == 1)) {
                c6405E4h.A00 = iA08;
            }
            if (c6340E1q.A0I()) {
                A01(c6340E1q);
            }
        }
    }

    public static void A03(C6340E1q c6340E1q, C6405E4h c6405E4h) {
        int i;
        boolean zA05 = C6340E1q.A05(c6340E1q, 2);
        int iA08 = c6340E1q.A08(8);
        for (int i2 = 0; i2 < iA08; i2++) {
            if (C6340E1q.A05(c6340E1q, 2)) {
                c6340E1q.A0C(5);
            }
            if (zA05) {
                i = 24;
            } else {
                i = 4;
                if (c6340E1q.A0I()) {
                    if (!c6340E1q.A0I()) {
                        c6340E1q.A0C(4);
                    }
                    c6405E4h.A02 = C6340E1q.A00(c6340E1q, 6);
                }
            }
            c6340E1q.A0C(i);
        }
        if (c6340E1q.A0I() && C6340E1q.A05(c6340E1q, 3)) {
            A01(c6340E1q);
        }
    }

    public static void A04(E1P e1p, int i) {
        e1p.A0P(7);
        byte[] bArr = e1p.A02;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.E59 A00(X.C6340E1q r10) {
        /*
            r0 = 16
            int r1 = r10.A08(r0)
            int r6 = r10.A08(r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r9 = 4
            if (r6 != r0) goto L99
            r0 = 24
            int r6 = r10.A08(r0)
            r0 = 7
        L17:
            int r6 = r6 + r0
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r0) goto L1f
            int r6 = r6 + 2
        L1f:
            r8 = 2
            int r0 = r10.A08(r8)
            r7 = 3
            if (r0 != r7) goto L30
        L27:
            r10.A08(r8)
            boolean r0 = r10.A0I()
            if (r0 != 0) goto L27
        L30:
            r0 = 10
            int r2 = r10.A08(r0)
            boolean r0 = r10.A0I()
            if (r0 == 0) goto L45
            int r0 = r10.A08(r7)
            if (r0 <= 0) goto L45
            r10.A0C(r8)
        L45:
            boolean r0 = r10.A0I()
            r1 = 48000(0xbb80, float:6.7262E-41)
            r5 = 44100(0xac44, float:6.1797E-41)
            if (r0 == 0) goto L54
            r5 = 48000(0xbb80, float:6.7262E-41)
        L54:
            r0 = 44100(0xac44, float:6.1797E-41)
            int r4 = r10.A08(r9)
            if (r5 != r0) goto L6b
            r0 = 13
            if (r4 != r0) goto L97
            int[] r0 = X.AbstractC6355E2h.A00
            r3 = r0[r4]
        L65:
            X.E59 r0 = new X.E59
            r0.<init>(r5, r6, r3)
            return r0
        L6b:
            if (r5 != r1) goto L97
            int[] r1 = X.AbstractC6355E2h.A00
            r0 = 14
            if (r4 >= r0) goto L97
            r3 = r1[r4]
            int r2 = r2 % 5
            r1 = 8
            r0 = 1
            if (r2 == r0) goto L92
            r0 = 11
            if (r2 == r8) goto L8d
            if (r2 == r7) goto L92
            if (r2 != r9) goto L65
            if (r4 == r7) goto L8a
            if (r4 == r1) goto L8a
            if (r4 != r0) goto L65
        L8a:
            int r3 = r3 + 1
            goto L65
        L8d:
            if (r4 == r1) goto L8a
            if (r4 != r0) goto L65
            goto L8a
        L92:
            if (r4 == r7) goto L8a
            if (r4 != r1) goto L65
            goto L8a
        L97:
            r3 = 0
            goto L65
        L99:
            r0 = 4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6355E2h.A00(X.E1q):X.E59");
    }
}
