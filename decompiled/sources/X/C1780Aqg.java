package X;

/* renamed from: X.Aqg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1780Aqg {
    public static final C1780Aqg A03 = new C1780Aqg(C8j3.A0U(4278190080L), 0, 0.0f);
    public final float A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1780Aqg) {
                long j = this.A01;
                C1780Aqg c1780Aqg = (C1780Aqg) obj;
                long j2 = c1780Aqg.A01;
                long j3 = B6A.A01;
                if (j != j2 || this.A02 != c1780Aqg.A02 || this.A00 != c1780Aqg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass006.A06(this.A02, AnonymousClass005.A07(j)), this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Shadow(color=");
        AnonymousClass005.A0m(this.A01, sbA0x);
        sbA0x.append(", offset=");
        AWx.A0E(this.A02, sbA0x);
        sbA0x.append(", blurRadius=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1780Aqg(long j, long j2, float f) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
    }
}
