package X;

/* loaded from: classes5.dex */
public final class E1R extends AbstractC3113Byd {
    public final long A00;
    public final long A01;

    @Override // X.AbstractC3113Byd
    public final String toString() {
        return FGI.A0b("SCTE-35 TimeSignalCommand { ptsTime=", ", playbackPositionUs= ", " }", this.A01, this.A00);
    }

    public E1R(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public static long A00(E1P e1p, long j) {
        long jA0A = e1p.A0A();
        if ((128 & jA0A) != 0) {
            return 8589934591L & ((((jA0A & 1) << 32) | e1p.A0H()) + j);
        }
        return -9223372036854775807L;
    }
}
