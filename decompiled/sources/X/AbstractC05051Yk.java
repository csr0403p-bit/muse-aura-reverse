package X;

/* renamed from: X.1Yk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05051Yk {
    public static final C1Yw A01;
    public static final C1Yw A02;
    public static final AKH<Boolean> A03 = C05443bq.A00(8);
    public static final AKH<C05061Yl> A00 = AnonymousClass002.A0L(new C05443bq(7));

    static {
        long j = B6A.A07;
        A01 = new C1Yw(Float.NaN, j, true);
        A02 = new C1Yw(Float.NaN, j, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC05011Yg A00(X.BFM r7, final float r8, int r9, int r10, final boolean r11) {
        /*
            r0 = r10 & 1
            if (r0 == 0) goto L5
            r11 = 1
        L5:
            r0 = r10 & 2
            if (r0 == 0) goto Lb
            r8 = 2143289344(0x7fc00000, float:NaN)
        Lb:
            long r0 = X.B6A.A07
            r2 = -1280632857(0xffffffffb3ab17e7, float:-7.967156E-8)
            r7.AgE(r2)
            X.AKH<java.lang.Boolean> r2 = X.AbstractC05051Yk.A03
            boolean r2 = X.AnonymousClass003.A1G(r7, r2)
            if (r2 == 0) goto L68
            r4 = r9 & 1022(0x3fe, float:1.432E-42)
            X.ASj<java.lang.Float> r2 = X.C1Ym.A00
            r6 = 1
            r5 = 4
            X.B6A r2 = new X.B6A
            r2.<init>(r0)
            androidx.compose.runtime.MutableState r3 = X.C1er.A00(r7, r2)
            r0 = r4 & 14
            r0 = r0 ^ 6
            if (r0 <= r5) goto L36
            boolean r0 = r7.A66(r11)
            if (r0 != 0) goto L3b
        L36:
            r0 = r4 & 6
            r2 = 0
            if (r0 != r5) goto L3c
        L3b:
            r2 = 1
        L3c:
            r0 = r4 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L4a
            boolean r0 = r7.A62(r8)
            if (r0 != 0) goto L4f
        L4a:
            r0 = r4 & 48
            if (r0 == r1) goto L4f
            r6 = 0
        L4f:
            r2 = r2 | r6
            java.lang.Object r1 = r7.AaT()
            if (r2 != 0) goto L5a
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L62
        L5a:
            X.1Yj r1 = new X.1Yj
            r1.<init>(r3, r8, r11)
            r7.Ai0(r1)
        L62:
            X.1Yi r1 = (X.AbstractC05031Yi) r1
        L64:
            X.AnonymousClass002.A19(r7)
            return r1
        L68:
            X.1Yw r1 = A01(r8, r0, r11)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC05051Yk.A00(X.BFM, float, int, int, boolean):X.1Yg");
    }

    public static final C1Yw A01(float f, long j, boolean z) {
        return (C1DG.A08(f, Float.NaN) && j == B6A.A07) ? z ? A01 : A02 : new C1Yw(f, j, z);
    }
}
