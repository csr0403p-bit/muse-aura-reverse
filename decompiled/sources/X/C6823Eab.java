package X;

/* renamed from: X.Eab, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6823Eab {
    public final C6832Eak A00;
    public final String[] A01;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001c, B:8:0x0024, B:20:0x0040, B:18:0x0038, B:19:0x003b, B:22:0x0045, B:23:0x0048, B:24:0x0059), top: B:29:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C6823Eab A00(java.lang.String... r12) {
        /*
            int r8 = r12.length     // Catch: java.io.IOException -> L6b
            X.EZx[] r6 = new X.C6788EZx[r8]     // Catch: java.io.IOException -> L6b
            X.EaW r7 = new X.EaW     // Catch: java.io.IOException -> L6b
            r7.<init>()     // Catch: java.io.IOException -> L6b
            r5 = 0
        L9:
            if (r5 >= r8) goto L59
            r11 = r12[r5]     // Catch: java.io.IOException -> L6b
            java.lang.String[] r10 = X.AbstractC6806EaH.A04     // Catch: java.io.IOException -> L6b
            r9 = 34
            r7.Aif(r9)     // Catch: java.io.IOException -> L6b
            int r4 = r11.length()     // Catch: java.io.IOException -> L6b
            r3 = 0
            r2 = 0
        L1a:
            if (r3 >= r4) goto L43
            char r1 = r11.charAt(r3)     // Catch: java.io.IOException -> L6b
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L29
            r0 = r10[r1]     // Catch: java.io.IOException -> L6b
            if (r0 != 0) goto L36
            goto L40
        L29:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L30
            java.lang.String r0 = "\\u2028"
            goto L36
        L30:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L40
            java.lang.String r0 = "\\u2029"
        L36:
            if (r2 >= r3) goto L3b
            r7.A0B(r11, r2, r3)     // Catch: java.io.IOException -> L6b
        L3b:
            r7.Aj6(r0)     // Catch: java.io.IOException -> L6b
            int r2 = r3 + 1
        L40:
            int r3 = r3 + 1
            goto L1a
        L43:
            if (r2 >= r4) goto L48
            r7.A0B(r11, r2, r4)     // Catch: java.io.IOException -> L6b
        L48:
            r7.Aif(r9)     // Catch: java.io.IOException -> L6b
            r7.readByte()     // Catch: java.io.IOException -> L6b
            long r0 = r7.A00     // Catch: java.io.IOException -> L6b
            X.EZx r0 = r7.AZC(r0)     // Catch: java.io.IOException -> L6b
            r6[r5] = r0     // Catch: java.io.IOException -> L6b
            int r5 = r5 + 1
            goto L9
        L59:
            java.lang.Object r2 = r12.clone()     // Catch: java.io.IOException -> L6b
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.io.IOException -> L6b
            X.EaY r0 = X.C6832Eak.A02     // Catch: java.io.IOException -> L6b
            X.Eak r1 = r0.A01(r6)     // Catch: java.io.IOException -> L6b
            X.Eab r0 = new X.Eab     // Catch: java.io.IOException -> L6b
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L6b
            return r0
        L6b:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6823Eab.A00(java.lang.String[]):X.Eab");
    }

    public C6823Eab(C6832Eak c6832Eak, String[] strArr) {
        this.A01 = strArr;
        this.A00 = c6832Eak;
    }
}
