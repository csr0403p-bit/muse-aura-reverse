package X;

/* renamed from: X.Bye, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3114Bye implements InterfaceC5403Dhw {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3114Bye c3114Bye = (C3114Bye) obj;
                if (this.A02 != c3114Bye.A02 || this.A01 != c3114Bye.A01 || this.A00 != c3114Bye.A00 || this.A04 != c3114Bye.A04 || this.A03 != c3114Bye.A03) {
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
        long j = this.A02;
        return C8j4.A0B(this.A03, AnonymousClass006.A06(this.A04, AnonymousClass006.A06(this.A00, AnonymousClass006.A06(this.A01, (527 + ((int) (j ^ (j >>> 32)))) * 31))));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Motion photo metadata: photoStartPosition=");
        sbA0x.append(this.A02);
        sbA0x.append(", photoSize=");
        sbA0x.append(this.A01);
        sbA0x.append(", photoPresentationTimestampUs=");
        sbA0x.append(this.A00);
        sbA0x.append(", videoStartPosition=");
        sbA0x.append(this.A04);
        sbA0x.append(", videoSize=");
        return BV4.A0m(sbA0x, this.A03);
    }

    public C3114Bye(long j, long j2, long j3, long j4, long j5) {
        this.A02 = j;
        this.A01 = j2;
        this.A00 = j3;
        this.A04 = j4;
        this.A03 = j5;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }
}
