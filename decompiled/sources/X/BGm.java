package X;

/* loaded from: classes4.dex */
public final class BGm {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGm) {
                BGm bGm = (BGm) obj;
                if (this.A00 != bGm.A00 || !C7384Etj.areEqual(this.A01, bGm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ObjectLocation(group=");
        sbA0x.append(this.A00);
        sbA0x.append(", dataOffset=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public BGm(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
