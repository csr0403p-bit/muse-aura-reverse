package X;

import java.util.Random;

/* loaded from: classes5.dex */
public final class DJ8 extends AbstractC4980DJx implements DIF {
    public final DJ9 A00;

    @Override // X.DIF
    public final long getMetadataConfigForMarker(int i) {
        return this.A00.A01.A00(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // X.DIF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long getSamplingSpecForMarker(int r7) {
        /*
            r6 = this;
            X.DJ9 r3 = r6.A00
            X.DJ7 r2 = r3.A00
            X.DJA r0 = r2.A03
            if (r0 != 0) goto L11
            X.Exz r1 = r2.A00
            X.DJA r0 = new X.DJA
            r0.<init>(r1)
            r2.A03 = r0
        L11:
            X.DJA r2 = r2.A03
            X.DJW r1 = r3.A02
            X.DJO r0 = r1.A00
            if (r0 == 0) goto L22
            X.DJO r0 = r1.A00
            X.C7384Etj.A0X(r0)
            X.DJA r0 = r0.A00
            if (r0 == r2) goto L2b
        L22:
            if (r2 == 0) goto L37
            X.DJO r0 = new X.DJO
            r0.<init>(r2)
        L29:
            r1.A00 = r0
        L2b:
            X.DJO r3 = r1.A00
            if (r3 != 0) goto L39
            r2 = 5
            r1 = 1
            r0 = -1
            long r0 = X.DJP.A00(r0, r2, r1)
            return r0
        L37:
            r0 = 0
            goto L29
        L39:
            int r0 = r7 >> 16
            short r2 = (short) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r0
            short r1 = (short) r7
            X.DJA r7 = r3.A00
            int r0 = r2 << 16
            r0 = r0 | r1
            X.FCQ<java.lang.Integer, java.lang.Integer> r6 = r7.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r6.A00(r5)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L5f
            int r1 = r0.intValue()
        L58:
            r2 = 6
            r0 = 1
            long r0 = X.DJP.A00(r1, r2, r0)
            return r0
        L5f:
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.String r3 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "perf"
            r1 = 0
            monitor-enter(r7)
            X.Exz r0 = r7.A00     // Catch: java.lang.Throwable -> L7a
            int r1 = r0.getSamplingFrequency(r2, r4, r3, r1)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A02(r5, r0)
            goto L58
        L7a:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DJ8.getSamplingSpecForMarker(int):long");
    }

    @Override // X.DIF
    public final int randomlySample(int i) {
        Random random = this.A00.A03;
        if (i <= 0) {
            return Integer.MAX_VALUE;
        }
        if (i == 1) {
            return 1;
        }
        if (random.nextInt(i) != 0) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public DJ8(DJ9 dj9) {
        this.A00 = dj9;
    }
}
