package X;

/* renamed from: X.AgE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1269AgE {
    public final long A00;
    public final long A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1269AgE) {
                C1269AgE c1269AgE = (C1269AgE) obj;
                if (this.A01 != c1269AgE.A01 || this.A00 != c1269AgE.A00 || this.A02 != c1269AgE.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final C1269AgE A00(C1269AgE c1269AgE) {
        return new C1269AgE(AWx.A05(this.A01, c1269AgE.A01), Math.max(this.A00, c1269AgE.A00), this.A02);
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass006.A06(this.A00, AnonymousClass005.A07(this.A01)), this.A02);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MouseWheelScrollDelta(value=");
        AWx.A0E(this.A01, sbA0x);
        sbA0x.append(", timeMillis=");
        sbA0x.append(this.A00);
        sbA0x.append(", shouldApplyImmediately=");
        sbA0x.append(this.A02);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1269AgE(long j, long j2, boolean z) {
        this.A01 = j;
        this.A00 = j2;
        this.A02 = z;
    }
}
