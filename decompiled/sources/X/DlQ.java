package X;

import androidx.media3.common.util.Util;

/* loaded from: classes5.dex */
public final class DlQ implements DhD {
    public final long A00;
    public final C5591DlR A01;

    @Override // X.DhD
    public final long ACe(long j, long j2) {
        return this.A01.A00;
    }

    @Override // X.DhD
    public final long AEz(long j, long j2) {
        return this.A01.A02[(int) j];
    }

    @Override // X.DhD
    public final long AFg() {
        return 0L;
    }

    @Override // X.DhD
    public final long AK9(long j) {
        return this.A01.A00;
    }

    @Override // X.DhD
    public final long AKA(long j, long j2) {
        C5591DlR c5591DlR = this.A01;
        return Util.A08(c5591DlR.A04, j + this.A00, true);
    }

    @Override // X.DhD
    public final C5325DgJ AKC(long j) {
        return new C5325DgJ(null, this.A01.A03[(int) j], r2.A01[r1]);
    }

    @Override // X.DhD
    public final long ALf(long j) {
        return this.A01.A04[(int) j] - this.A00;
    }

    @Override // X.DhD
    public final boolean AOO() {
        return true;
    }

    public DlQ(C5591DlR c5591DlR, long j) {
        this.A01 = c5591DlR;
        this.A00 = j;
    }

    @Override // X.DhD
    public final int AIx(long j) {
        return -1;
    }

    @Override // X.DhD
    public final long AKB(long j) {
        return -1L;
    }

    @Override // X.DhD
    public final long AFd(long j, long j2) {
        return 0L;
    }

    @Override // X.DhD
    public final long AI7(long j, long j2) {
        return -9223372036854775807L;
    }
}
