package X;

import java.util.Arrays;

/* renamed from: X.Dix, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5462Dix implements InterfaceC5538DkF {
    public int A00;
    public int A03;
    public final int A04 = 65536;
    public int A01 = 0;
    public C5523Djz[] A02 = new C5523Djz[100];

    public final synchronized void A00(int i) {
        boolean zA1T = C8j3.A1T(i, this.A03);
        this.A03 = i;
        if (zA1T) {
            AhR();
        }
    }

    @Override // X.InterfaceC5538DkF
    public final synchronized int ALp() {
        return this.A00 * 65536;
    }

    @Override // X.InterfaceC5538DkF
    public final synchronized void AhR() {
        int iMax = Math.max(0, (((this.A03 + 65536) - 1) / 65536) - this.A00);
        int i = this.A01;
        if (iMax < i) {
            Arrays.fill(this.A02, iMax, i, (Object) null);
            this.A01 = iMax;
        }
    }
}
