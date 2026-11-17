package X;

import java.util.List;

/* renamed from: X.FlE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8803FlE {
    public final int A00;
    public final int A01;
    public final AbstractC8804FlF A02;
    public final String A03;
    public final List<AbstractC9142FzB> A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8803FlE) {
                C8803FlE c8803FlE = (C8803FlE) obj;
                if (this.A01 != c8803FlE.A01 || this.A00 != c8803FlE.A00 || !C7384Etj.areEqual(this.A03, c8803FlE.A03) || !this.A02.equals(c8803FlE.A02) || !this.A04.equals(c8803FlE.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, AnonymousClass005.A0F(this.A02, ((((this.A01 * 31) + this.A00) * 31) + BV7.A0I(this.A03)) * 31));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PlannedExerciseStep(exerciseType=");
        sbA0x.append(this.A01);
        sbA0x.append(", exerciseCategory=");
        sbA0x.append(this.A00);
        sbA0x.append(", description=");
        sbA0x.append(this.A03);
        sbA0x.append(", completionGoal=");
        sbA0x.append(this.A02);
        sbA0x.append(", performanceTargets=");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (IILX/FlF;Ljava/util/List<+LX/FzB;>;Ljava/lang/String;)V */
    public C8803FlE(AbstractC8804FlF abstractC8804FlF, String str, List list, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = abstractC8804FlF;
        this.A04 = list;
        this.A03 = str;
    }
}
