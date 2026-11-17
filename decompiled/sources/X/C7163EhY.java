package X;

import android.graphics.Bitmap;

/* renamed from: X.EhY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7163EhY implements InterfaceC7275Ek1 {
    public int A00 = -1;
    public EfF<Bitmap> A01;

    private final synchronized void A00() {
        EfF<Bitmap> efF = this.A01;
        if (efF != null) {
            efF.close();
        }
        this.A01 = null;
        this.A00 = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    @Override // X.InterfaceC7275Ek1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A72(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.A00     // Catch: java.lang.Throwable -> L11
            if (r3 != r0) goto Le
            X.EfF<android.graphics.Bitmap> r0 = r2.A01     // Catch: java.lang.Throwable -> L11
            boolean r1 = X.EfF.A01(r0)     // Catch: java.lang.Throwable -> L11
            r0 = 1
            if (r1 != 0) goto Lf
        Le:
            r0 = 0
        Lf:
            monitor-exit(r2)
            return r0
        L11:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7163EhY.A72(int):boolean");
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized EfF ACq() {
        EfF<Bitmap> efF;
        try {
            efF = this.A01;
        } finally {
            A00();
        }
        return efF != null ? efF.A03() : null;
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized EfF<Bitmap> ADC(int i) {
        EfF<Bitmap> efF;
        return (this.A00 != i || (efF = this.A01) == null) ? null : efF.A03();
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized EfF AFX() {
        EfF<Bitmap> efF;
        efF = this.A01;
        return efF != null ? efF.A03() : null;
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized void ATU(EfF efF, int i) {
        C7384Etj.A0Y(efF, 1);
        if (this.A01 != null) {
            Object objA04 = efF.A04();
            EfF<Bitmap> efF2 = this.A01;
            if (!objA04.equals(efF2 != null ? BV6.A0M(efF2) : null)) {
            }
        }
        EfF<Bitmap> efF3 = this.A01;
        if (efF3 != null) {
            efF3.close();
        }
        this.A01 = efF.A03();
        this.A00 = i;
    }

    @Override // X.InterfaceC7275Ek1
    public final synchronized void clear() {
        A00();
    }

    @Override // X.InterfaceC7275Ek1
    public final void ATT(EfF efF, int i) {
    }
}
