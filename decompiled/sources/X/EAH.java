package X;

/* loaded from: classes5.dex */
public final class EAH extends EAU {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // X.EAX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AZ0(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r4 = r10.position()
            int r3 = r10.limit()
            int r2 = r3 - r4
            X.EAL r0 = r9.A00
            int r0 = r0.A02
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 22
            r6 = 21
            r5 = 4
            r1 = 3
            if (r0 == r1) goto L2a
            if (r0 == r5) goto L25
            if (r0 == r6) goto L28
            if (r0 == r7) goto L25
            if (r0 == r8) goto L2c
            java.lang.IllegalStateException r0 = X.BV4.A0T()
            throw r0
        L25:
            int r2 = r2 / 2
            goto L2c
        L28:
            int r2 = r2 / 3
        L2a:
            int r2 = r2 * 2
        L2c:
            java.nio.ByteBuffer r2 = r9.A02(r2)
            X.EAL r0 = r9.A00
            int r0 = r0.A02
            if (r0 == r1) goto L93
            if (r0 == r5) goto L6e
            if (r0 == r6) goto L5f
            if (r0 == r7) goto L50
            if (r0 == r8) goto L43
            java.lang.IllegalStateException r0 = X.BV4.A0T()
            throw r0
        L43:
            if (r4 >= r3) goto La6
            int r0 = r4 + 1
            X.BV6.A1Q(r10, r2, r0)
            X.BV6.A1Q(r10, r2, r4)
            int r4 = r4 + 2
            goto L43
        L50:
            if (r4 >= r3) goto La6
            int r0 = r4 + 2
            X.BV6.A1Q(r10, r2, r0)
            int r0 = r4 + 3
            X.BV6.A1Q(r10, r2, r0)
            int r4 = r4 + 4
            goto L50
        L5f:
            if (r4 >= r3) goto La6
            int r0 = r4 + 1
            X.BV6.A1Q(r10, r2, r0)
            int r0 = r4 + 2
            X.BV6.A1Q(r10, r2, r0)
            int r4 = r4 + 3
            goto L5f
        L6e:
            if (r4 >= r3) goto La6
            float r5 = r10.getFloat(r4)
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
            goto L6e
        L93:
            if (r4 >= r3) goto La6
            r0 = 0
            r2.put(r0)
            int r0 = X.BV6.A0C(r10, r4)
            int r0 = r0 + (-128)
            byte r0 = (byte) r0
            r2.put(r0)
            int r4 = r4 + 1
            goto L93
        La6:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAH.AZ0(java.nio.ByteBuffer):void");
    }
}
