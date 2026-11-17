package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E3O implements InterfaceC6417E4t {
    public long A00;
    public long A01;
    public E55 A02;
    public E3A A03;

    @Override // X.InterfaceC6417E4t
    public final InterfaceC5509Djl A81() {
        long j = this.A00;
        C1G.A08(AnonymousClass002.A1L((j > (-1L) ? 1 : (j == (-1L) ? 0 : -1))));
        return new E3K(this.A03, j);
    }

    @Override // X.InterfaceC6417E4t
    public final long AZ6(E2K e2k) {
        long j = this.A01;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.A01 = -1L;
        return j2;
    }

    @Override // X.InterfaceC6417E4t
    public final void AgJ(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[Util.A08(jArr, j, true)];
    }
}
