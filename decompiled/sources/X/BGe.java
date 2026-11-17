package X;

/* loaded from: classes4.dex */
public final class BGe extends AbstractC1699Aoe {
    public final InterfaceC1702Aoh A00;
    public final C1697Aoc A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BGe) {
                BGe bGe = (BGe) obj;
                if (!C7384Etj.areEqual(this.A02, bGe.A02) || !C7384Etj.areEqual(this.A01, bGe.A01) || !C7384Etj.areEqual(this.A00, bGe.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass001.A0G(this.A02) + C60R.A01(this.A01)) * 31) + C8j4.A0E(this.A00, 0);
    }

    public final String toString() {
        return C8j4.A0x("LinkAnnotation.Clickable(tag=", this.A02);
    }

    public BGe(InterfaceC1702Aoh interfaceC1702Aoh, C1697Aoc c1697Aoc, String str) {
        this.A02 = str;
        this.A01 = c1697Aoc;
        this.A00 = interfaceC1702Aoh;
    }
}
