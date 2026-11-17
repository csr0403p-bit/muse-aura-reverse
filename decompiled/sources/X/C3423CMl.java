package X;

import java.util.Arrays;

/* renamed from: X.CMl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3423CMl implements InterfaceC5403Dhw {
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public static int A00(byte[] bytes) {
        int length = bytes.length;
        if (!BV5.A1P(length, 4)) {
            throw BV7.A0k("array too small: %s < %s", BV5.A1Z(length, 4));
        }
        return (bytes[0] << 24) | ((bytes[1] & 255) << 16) | ((bytes[2] & 255) << 8) | (bytes[3] & 255);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3423CMl c3423CMl = (C3423CMl) obj;
                if (!this.A02.equals(c3423CMl.A02) || !Arrays.equals(this.A03, c3423CMl.A03) || this.A00 != c3423CMl.A00 || this.A01 != c3423CMl.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    public final int hashCode() {
        return ((((BV8.A0B(this.A02) + Arrays.hashCode(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            int r1 = r6.A01
            if (r1 == 0) goto L60
            r0 = 1
            if (r1 == r0) goto L56
            r0 = 23
            if (r1 == r0) goto L47
            r0 = 67
            if (r1 == r0) goto L3c
            r0 = 75
            if (r1 == r0) goto L30
            r0 = 78
            if (r1 != r0) goto La1
            byte[] r0 = r6.A03
            X.E1P r0 = X.BV6.A0Z(r0)
            long r0 = r0.A0I()
            java.lang.String r3 = java.lang.String.valueOf(r0)
        L25:
            java.lang.String r2 = "mdta: key="
            java.lang.String r1 = r6.A02
            java.lang.String r0 = ", value="
            java.lang.String r0 = X.FGI.A0d(r2, r1, r0, r3)
            return r0
        L30:
            byte[] r1 = r6.A03
            r0 = 0
            r0 = r1[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            goto L25
        L3c:
            byte[] r0 = r6.A03
            int r0 = A00(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            goto L25
        L47:
            byte[] r0 = r6.A03
            int r0 = A00(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            goto L25
        L56:
            byte[] r1 = r6.A03
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r0)
            goto L25
        L60:
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La1
            byte[] r4 = r6.A03
            r0 = 1
            r2 = r4[r0]
            java.util.ArrayList r3 = X.C3cG.A0h()
            r1 = 0
        L74:
            if (r1 >= r2) goto L80
            int r0 = r1 + 2
            r0 = r4[r0]
            X.C60Q.A1P(r3, r0)
            int r1 = r1 + 1
            goto L74
        L80:
            java.lang.StringBuilder r2 = X.C60O.A0w()
            java.lang.String r0 = "track types = "
            r2.append(r0)
            r0 = 44
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.google.common.base.Joiner r1 = new com.google.common.base.Joiner
            r1.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
            r1.appendTo(r2, r0)
            java.lang.String r3 = r2.toString()
            goto L25
        La1:
            byte[] r5 = r6.A03
            int r4 = r5.length
            int r0 = r4 * 2
            java.lang.StringBuilder r3 = X.BV4.A0p(r0)
            r2 = 0
        Lab:
            if (r2 >= r4) goto Lca
            r0 = r5[r2]
            int r0 = r0 >> 4
            r0 = r0 & 15
            r1 = 16
            char r0 = java.lang.Character.forDigit(r0, r1)
            r3.append(r0)
            r0 = r5[r2]
            r0 = r0 & 15
            char r0 = java.lang.Character.forDigit(r0, r1)
            r3.append(r0)
            int r2 = r2 + 1
            goto Lab
        Lca:
            java.lang.String r3 = r3.toString()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3423CMl.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3423CMl(byte[] r5, int r6, int r7, java.lang.String r8) {
        /*
            r4 = this;
            r4.<init>()
            int r0 = r8.hashCode()
            r3 = 4
            r2 = 0
            r1 = 1
            switch(r0) {
                case -1949883051: goto L4c;
                case -269399509: goto L36;
                case 1011693540: goto L24;
                case 1098277265: goto L21;
                case 2002123038: goto L16;
                default: goto Ld;
            }
        Ld:
            r4.A02 = r8
            r4.A03 = r5
            r4.A00 = r6
            r4.A01 = r7
            return
        L16:
            java.lang.String r0 = "auxiliary.tracks.map"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Ld
            if (r7 != 0) goto L5c
            goto L5b
        L21:
            java.lang.String r0 = "auxiliary.tracks.offset"
            goto L26
        L24:
            java.lang.String r0 = "auxiliary.tracks.length"
        L26:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Ld
            r0 = 78
            if (r7 != r0) goto L5c
            int r1 = r5.length
            r0 = 8
            if (r1 != r0) goto L5c
            goto L5b
        L36:
            java.lang.String r0 = "auxiliary.tracks.interleaved"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Ld
            r0 = 75
            if (r7 != r0) goto L5c
            int r0 = r5.length
            if (r0 != r1) goto L5c
            r0 = r5[r2]
            if (r0 == 0) goto L5b
            if (r0 != r1) goto L5c
            goto L5b
        L4c:
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Ld
            r0 = 23
            if (r7 != r0) goto L5c
            int r0 = r5.length
            if (r0 != r3) goto L5c
        L5b:
            r2 = 1
        L5c:
            X.C1G.A07(r2)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3423CMl.<init>(byte[], int, int, java.lang.String):void");
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }
}
