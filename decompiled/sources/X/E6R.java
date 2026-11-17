package X;

import android.os.SystemClock;
import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class E6R implements InterfaceC5922Ds9 {
    public C6233Dyb A00 = C6233Dyb.A03;
    public boolean A01;
    public long A02;
    public long A03;
    public final E7C A04;

    public final void A00() {
        if (this.A01) {
            return;
        }
        this.A02 = SystemClock.elapsedRealtime();
        this.A01 = true;
    }

    public final void A01(long j) {
        this.A03 = j;
        if (this.A01) {
            this.A02 = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.InterfaceC5922Ds9
    public final C6233Dyb AIo() {
        return this.A00;
    }

    @Override // X.InterfaceC5922Ds9
    public final long AIv() {
        long j = this.A03;
        if (!this.A01) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.A02;
        return j + (this.A00.A01 == 1.0f ? Util.A0A(jElapsedRealtime) : jElapsedRealtime * r4.A02);
    }

    @Override // X.InterfaceC5922Ds9
    public final /* synthetic */ boolean ANJ() {
        return false;
    }

    @Override // X.InterfaceC5922Ds9
    public final void Ae1(C6233Dyb c6233Dyb) {
        if (this.A01) {
            A01(AIv());
        }
        this.A00 = c6233Dyb;
    }

    public E6R(E7C e7c) {
        this.A04 = e7c;
    }
}
