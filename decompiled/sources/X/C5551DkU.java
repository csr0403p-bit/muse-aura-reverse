package X;

import java.io.EOFException;

/* renamed from: X.DkU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5551DkU implements InterfaceC5563Dkg {
    public final byte[] A00 = new byte[4096];

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ int Abu(C1L c1l, int i, boolean z) {
        return Aby(c1l, i, 0, z);
    }

    @Override // X.InterfaceC5563Dkg
    public final int Aby(C1L c1l, int i, int i2, boolean z) throws EOFException {
        int i3 = c1l.read(this.A00, 0, Math.min(4096, i));
        if (i3 != -1) {
            return i3;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void A9m(long j) {
    }

    @Override // X.InterfaceC5563Dkg
    public final void ABq(C6154Dwx c6154Dwx) {
    }

    @Override // X.InterfaceC5563Dkg
    public final /* synthetic */ void Abv(E1P e1p, int i) {
        e1p.A0S(i);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abw(E1P e1p, int i, int i2) {
        e1p.A0S(i);
    }

    @Override // X.InterfaceC5563Dkg
    public final void Abz(DjB djB, int i, int i2, int i3, long j) {
    }
}
