package X;

/* renamed from: X.Byi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3118Byi implements InterfaceC5403Dhw {
    public final long A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3118Byi) {
                C3118Byi c3118Byi = (C3118Byi) obj;
                if (this.A00 != c3118Byi.A00 || this.A01 != c3118Byi.A01 || this.A02 != c3118Byi.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    public final int hashCode() {
        long j = this.A00;
        return AnonymousClass006.A06(this.A01, (527 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Mp4Timestamp: creation time=");
        sbA0x.append(this.A00);
        sbA0x.append(", modification time=");
        sbA0x.append(this.A01);
        sbA0x.append(", timescale=");
        return BV4.A0m(sbA0x, this.A02);
    }

    public C3118Byi(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }
}
