package X;

/* loaded from: classes4.dex */
public final class AH3 {
    public final int A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AH3) {
                AH3 ah3 = (AH3) obj;
                if (this.A00 != ah3.A00 || !C7384Etj.areEqual(this.A01, ah3.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31 * 31) + C3cH.A02(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ComposeStackTraceFrame(groupKey=");
        sbA0x.append(this.A00);
        C8j4.A1R(sbA0x, ", sourceInfo=");
        sbA0x.append(", groupOffset=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public AH3(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
