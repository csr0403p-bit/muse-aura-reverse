package X;

/* renamed from: X.Ee1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6999Ee1 {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C7481Exe r5, int r6, int r7) {
        /*
            r4 = 1
            r3 = 0
            float r0 = (float) r6
            r2 = 1068149419(0x3faaaaab, float:1.3333334)
            float r0 = r0 * r2
            int r1 = (int) r0
            if (r5 != 0) goto L19
            float r1 = (float) r1
            r0 = 1157627904(0x45000000, float:2048.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L23
            float r0 = (float) r7
            float r0 = r0 * r2
            int r1 = (int) r0
            r0 = 2048(0x800, float:2.87E-42)
        L16:
            if (r1 < r0) goto L23
            return r4
        L19:
            int r0 = r5.A01
            if (r1 < r0) goto L23
            float r0 = (float) r7
            float r0 = r0 * r2
            int r1 = (int) r0
            int r0 = r5.A00
            goto L16
        L23:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6999Ee1.A00(X.Exe, int, int):boolean");
    }

    public static final boolean A01(C7481Exe c7481Exe, C6988Edo c6988Edo) {
        int i;
        int i2;
        if (c6988Edo == null) {
            return false;
        }
        C6988Edo.A03(c6988Edo);
        int i3 = c6988Edo.A02;
        if (i3 == 90 || i3 == 270) {
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
        return A00(c7481Exe, i, i2);
    }
}
