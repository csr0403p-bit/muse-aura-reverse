package X;

/* loaded from: classes5.dex */
public final class DF5 implements InterfaceC5231Ddp {
    public byte[] A00;
    public final long A01 = C5072DTn.A05.getAndIncrement();
    public final C1O A02;
    public final DF4 A03;

    @Override // X.InterfaceC5231Ddp
    public final void A5z() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    @Override // X.InterfaceC5231Ddp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void APf() {
        /*
            r4 = this;
            X.DF4 r3 = r4.A03
            r0 = 0
            r3.A00 = r0
            X.C1O r0 = r4.A02     // Catch: java.lang.Throwable -> L30
            r3.open(r0)     // Catch: java.lang.Throwable -> L30
        Lb:
            long r0 = r3.A00     // Catch: java.lang.Throwable -> L30
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L30
            byte[] r1 = r4.A00     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L22
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L30
        L16:
            r4.A00 = r1     // Catch: java.lang.Throwable -> L30
        L18:
            int r0 = r1.length     // Catch: java.lang.Throwable -> L30
            int r0 = r0 - r2
            int r1 = r3.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L30
            r0 = -1
            if (r1 != r0) goto Lb
            goto L2c
        L22:
            int r0 = r1.length     // Catch: java.lang.Throwable -> L30
            if (r2 != r0) goto L18
            int r0 = r0 * 2
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.lang.Throwable -> L30
            goto L16
        L2c:
            r3.close()     // Catch: java.io.IOException -> L2f
        L2f:
            return
        L30:
            r0 = move-exception
            r3.close()     // Catch: java.io.IOException -> L34
        L34:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DF5.APf():void");
    }

    public DF5(C1J c1j, C1O c1o) {
        this.A02 = c1o;
        this.A03 = new DF4(c1j);
    }
}
