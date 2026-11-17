package X;

import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt;

/* renamed from: X.9sY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9sY extends C9jF {
    public final C9sS A00;
    public final C07959pz A01;

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[PHI: r5
  0x001c: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:5:0x0012, B:9:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[LOOP:0: B:12:0x0022->B:23:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.FKC A02(java.lang.String r11) {
        /*
            r7 = 10
            r0 = 0
            int r6 = r11.length()
            r10 = 0
            if (r6 == 0) goto L1b
            r9 = 0
            char r1 = r11.charAt(r0)
            r0 = 48
            r5 = 0
            if (r1 >= r0) goto L1c
            r5 = 1
            if (r6 == r5) goto L1b
            r0 = 43
            if (r1 == r0) goto L1c
        L1b:
            return r10
        L1c:
            r4 = 119304647(0x71c71c7, float:1.1769572E-34)
            r3 = 119304647(0x71c71c7, float:1.1769572E-34)
        L22:
            if (r5 >= r6) goto L5b
            char r0 = r11.charAt(r5)
            int r8 = java.lang.Character.digit(r0, r7)
            if (r8 < 0) goto L1b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r9 ^ r2
            r0 = r3 ^ r2
            int r0 = X.AbstractC7532Ezu.A00(r1, r0)
            if (r0 <= 0) goto L4b
            if (r3 != r4) goto L1b
            r3 = 429496729(0x19999999, float:1.5881867E-23)
            r1 = r9 ^ r2
            r0 = -1717986919(0xffffffff99999999, float:-1.5881867E-23)
            int r0 = X.AbstractC7532Ezu.A00(r1, r0)
            if (r0 <= 0) goto L4b
            return r10
        L4b:
            int r1 = r9 * 10
            int r8 = r8 + r1
            r0 = r8 ^ r2
            r1 = r1 ^ r2
            int r0 = X.AbstractC7532Ezu.A00(r0, r1)
            if (r0 < 0) goto L1b
            int r5 = r5 + 1
            r9 = r8
            goto L22
        L5b:
            X.FKC r0 = new X.FKC
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9sY.A02(java.lang.String):X.FKC");
    }

    @Override // X.C9j4
    public final int A8N(C9iZ c9iZ) {
        throw C3cG.A0Q(SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED);
    }

    @Override // X.C9j4
    public final C07959pz AKT() {
        return this.A01;
    }

    public C9sY(C9sU c9sU, C9sS c9sS) {
        AnonymousClass003.A0u(c9sS, c9sU);
        this.A00 = c9sS;
        this.A01 = c9sU.A02;
    }
}
