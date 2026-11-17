package X;

/* loaded from: classes5.dex */
public final class EAE extends EAP {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // X.EAX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AZ0(java.nio.ByteBuffer r12) {
        /*
            r11 = this;
            int r4 = r12.position()
            int r3 = r12.limit()
            int r2 = r3 - r4
            X.EAL r0 = r11.A00
            int r0 = r0.A02
            r10 = 1610612736(0x60000000, float:3.6893488E19)
            r9 = 1342177280(0x50000000, float:8.5899346E9)
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 22
            r6 = 21
            r5 = 4
            r1 = 3
            if (r0 == r1) goto L2f
            if (r0 == r5) goto L32
            if (r0 == r6) goto L2d
            if (r0 == r7) goto L32
            if (r0 == r8) goto L34
            if (r0 == r9) goto L2d
            if (r0 == r10) goto L32
            java.lang.IllegalStateException r0 = X.BV4.A0T()
            throw r0
        L2d:
            int r2 = r2 / 3
        L2f:
            int r2 = r2 * 2
            goto L34
        L32:
            int r2 = r2 / 2
        L34:
            java.nio.ByteBuffer r2 = r11.A03(r2)
            X.EAL r0 = r11.A00
            int r0 = r0.A02
            if (r0 == r1) goto Lb9
            if (r0 == r5) goto L94
            if (r0 == r6) goto L85
            if (r0 == r7) goto L76
            if (r0 == r8) goto L69
            if (r0 == r9) goto L5c
            if (r0 == r10) goto L4f
            java.lang.IllegalStateException r0 = X.BV4.A0T()
            throw r0
        L4f:
            if (r4 >= r3) goto Lcc
            int r0 = r4 + 1
            X.BV6.A1Q(r12, r2, r0)
            X.BV6.A1Q(r12, r2, r4)
            int r4 = r4 + 4
            goto L4f
        L5c:
            if (r4 >= r3) goto Lcc
            int r0 = r4 + 1
            X.BV6.A1Q(r12, r2, r0)
            X.BV6.A1Q(r12, r2, r4)
            int r4 = r4 + 3
            goto L5c
        L69:
            if (r4 >= r3) goto Lcc
            int r0 = r4 + 1
            X.BV6.A1Q(r12, r2, r0)
            X.BV6.A1Q(r12, r2, r4)
            int r4 = r4 + 2
            goto L69
        L76:
            if (r4 >= r3) goto Lcc
            int r0 = r4 + 2
            X.BV6.A1Q(r12, r2, r0)
            int r0 = r4 + 3
            X.BV6.A1Q(r12, r2, r0)
            int r4 = r4 + 4
            goto L76
        L85:
            if (r4 >= r3) goto Lcc
            int r0 = r4 + 1
            X.BV6.A1Q(r12, r2, r0)
            int r0 = r4 + 2
            X.BV6.A1Q(r12, r2, r0)
            int r4 = r4 + 3
            goto L85
        L94:
            if (r4 >= r3) goto Lcc
            float r5 = r12.getFloat(r4)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = X.BV7.A01(r5, r0, r1)
            r0 = 1191181824(0x46fffe00, float:32767.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            short r1 = (short) r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 4
            goto L94
        Lb9:
            if (r4 >= r3) goto Lcc
            r0 = 0
            r2.put(r0)
            int r0 = X.BV6.A0C(r12, r4)
            int r0 = r0 + (-128)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 1
            goto Lb9
        Lcc:
            int r0 = r12.limit()
            r12.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAE.AZ0(java.nio.ByteBuffer):void");
    }
}
