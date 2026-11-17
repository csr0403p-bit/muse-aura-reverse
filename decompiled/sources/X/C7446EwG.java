package X;

/* renamed from: X.EwG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7446EwG extends F0Q {
    public final long A00;
    public final long A01;
    public final F25 A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof F0Q) {
                C7446EwG c7446EwG = (C7446EwG) ((F0Q) obj);
                if (this.A01 != c7446EwG.A01 || this.A00 != c7446EwG.A00 || !this.A02.equals(c7446EwG.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.A00;
        return this.A02.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("RecordingStats{recordedDurationNanos=");
        sbA0x.append(this.A01);
        sbA0x.append(", numBytesRecorded=");
        sbA0x.append(this.A00);
        sbA0x.append(", audioStats=");
        return BV8.A0v(this.A02, sbA0x);
    }

    public C7446EwG(F25 f25, long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = f25;
    }
}
