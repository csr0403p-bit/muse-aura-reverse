package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HiS {
    public final int A00;
    public final String A01;
    public final List<C8803FlE> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HiS) {
                HiS hiS = (HiS) obj;
                if (this.A00 != hiS.A00 || !C7384Etj.areEqual(this.A01, hiS.A01) || !this.A02.equals(hiS.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A02, ((this.A00 * 31) + BV7.A0I(this.A01)) * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlannedExerciseBlock(repetitions=");
        sbA0x.append(this.A00);
        sbA0x.append(", description=");
        sbA0x.append(this.A01);
        sbA0x.append(", steps=");
        return AnonymousClass007.A0Z(this.A02, sbA0x);
    }

    public HiS(int i, List<C8803FlE> list, String str) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = str;
    }
}
