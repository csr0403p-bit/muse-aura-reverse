package X;

/* loaded from: classes4.dex */
public final class AvX {
    public float A00;
    public int A01 = -1;
    public final C1999Aw8 A02;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float A00(X.AvX r6, int r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = 1
            if (r8 == 0) goto L62
            X.Aw8 r4 = r6.A02
            android.text.Layout r3 = r4.A09
            if (r7 > 0) goto L3f
            r2 = 0
        La:
            int r1 = r3.getLineStart(r2)
            int r0 = r4.A07(r2)
            if (r7 == r1) goto L16
            if (r7 != r0) goto L62
        L16:
            r0 = 1
        L17:
            int r1 = r7 * 4
            if (r10 == 0) goto L3a
            if (r0 == 0) goto L1e
            r5 = 0
        L1e:
            int r1 = r1 + r5
            int r0 = r6.A01
            if (r0 != r1) goto L26
            float r0 = r6.A00
        L25:
            return r0
        L26:
            X.Aw8 r0 = r6.A02
            if (r10 == 0) goto L35
            float r0 = r0.A05(r7, r8)
        L2e:
            if (r9 == 0) goto L25
            r6.A01 = r1
            r6.A00 = r0
            return r0
        L35:
            float r0 = r0.A06(r7, r8)
            goto L2e
        L3a:
            r5 = 3
            if (r0 == 0) goto L1e
            r5 = 2
            goto L1e
        L3f:
            int r0 = X.C8j3.A0H(r3)
            if (r7 < r0) goto L4c
            int r0 = r3.getLineCount()
            int r2 = r0 + (-1)
            goto La
        L4c:
            int r2 = r3.getLineForOffset(r7)
            int r1 = r3.getLineStart(r2)
            int r0 = r3.getLineEnd(r2)
            if (r1 == r7) goto L5d
            if (r0 == r7) goto L5d
            goto La
        L5d:
            if (r1 != r7) goto La
            int r2 = r2 + (-1)
            goto La
        L62:
            r0 = 0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AvX.A00(X.AvX, int, boolean, boolean, boolean):float");
    }

    public AvX(C1999Aw8 c1999Aw8) {
        this.A02 = c1999Aw8;
    }
}
