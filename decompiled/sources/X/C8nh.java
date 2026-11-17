package X;

/* renamed from: X.8nh, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8nh extends C06G implements C8ni {
    public final int A00;
    public final AnonymousClass962 A01;
    public final boolean A02;
    public final boolean A03;
    public final int A04;

    public C8nh(AnonymousClass962 anonymousClass962, int i, int i2, boolean z, boolean z2) {
        C7384Etj.A0Y(anonymousClass962, 4);
        this.A00 = i;
        this.A04 = i2;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = anonymousClass962;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8nh) {
                C8nh c8nh = (C8nh) obj;
                if (this.A00 != c8nh.A00 || this.A04 != c8nh.A04 || this.A03 != c8nh.A03 || this.A02 != c8nh.A02 || !C7384Etj.areEqual(this.A01, c8nh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, C0KA.A01(C0KA.A01(((this.A00 * 31) + this.A04) * 31, this.A03), this.A02));
    }
}
