package X;

/* loaded from: classes4.dex */
public final class Ao3 {
    public final int A00;
    public final C1687AoR A01;
    public final Integer A02;
    public final long A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Ao3) {
                Ao3 ao3 = (Ao3) obj;
                if (this.A00 != ao3.A00 || this.A03 != ao3.A03 || this.A02 != ao3.A02 || !C7384Etj.areEqual(this.A01, ao3.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA00 = C60R.A00(this.A03, this.A00 * 31);
        int iIntValue = this.A02.intValue();
        return ((iA00 + (iIntValue != 0 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR").hashCode() + iIntValue) * 31) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ContentCaptureEvent(id=");
        sbA0x.append(this.A00);
        sbA0x.append(BV3.A00(21));
        sbA0x.append(this.A03);
        sbA0x.append(", type=");
        sbA0x.append(this.A02.intValue() != 0 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR");
        sbA0x.append(", structureCompat=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public Ao3(C1687AoR c1687AoR, Integer num, int i, long j) {
        this.A00 = i;
        this.A03 = j;
        this.A02 = num;
        this.A01 = c1687AoR;
    }
}
