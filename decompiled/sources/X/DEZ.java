package X;

import android.os.SystemClock;

/* loaded from: classes5.dex */
public final class DEZ implements CXB {
    public long A00;
    public final DEW A01;

    @Override // X.CXB
    public final void AS2(C1J c1j, C1O c1o, int i, boolean z) {
        this.A01.AS2(c1j, c1o, i, z);
    }

    @Override // X.CXB
    public final void AWm(C1J c1j, C1O c1o, boolean z) {
        this.A01.AWm(c1j, c1o, z);
    }

    public DEZ(DEW dew) {
        this.A01 = dew;
    }

    @Override // X.CXB
    public final void AWh(C1J c1j, C1O c1o, boolean z) {
        this.A00 = SystemClock.elapsedRealtime();
    }

    @Override // X.CXB
    public final void AWk(C1J c1j, C1O c1o, boolean z) {
    }
}
