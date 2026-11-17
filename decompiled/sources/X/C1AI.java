package X;

/* renamed from: X.1AI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AI {
    public final C1DE A00;
    public final C1DE A01;
    public final C1DE A02;
    public final C1DE A03;
    public final C1DE A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1AI) {
                C1AI c1ai = (C1AI) obj;
                if (!C7384Etj.areEqual(this.A01, c1ai.A01) || !C7384Etj.areEqual(this.A04, c1ai.A04) || !C7384Etj.areEqual(this.A03, c1ai.A03) || !C7384Etj.areEqual(this.A02, c1ai.A02) || !C7384Etj.areEqual(this.A00, c1ai.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C1AI(C1DE c1de, int i) {
        C1DE c1de2 = C1AK.A01;
        C1DE c1de3 = C1AK.A04;
        C1DE c1de4 = C1AK.A03;
        C1DE c1de5 = C1AK.A02;
        c1de = (i & 16) != 0 ? C1AK.A00 : c1de;
        this.A01 = c1de2;
        this.A04 = c1de3;
        this.A03 = c1de4;
        this.A02 = c1de5;
        this.A00 = c1de;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A03, AnonymousClass005.A0F(this.A04, AnonymousClass005.A0E(this.A01)))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shapes(extraSmall=");
        sb.append(this.A01);
        sb.append(", small=");
        sb.append(this.A04);
        sb.append(", medium=");
        sb.append(this.A03);
        sb.append(", large=");
        sb.append(this.A02);
        sb.append(", extraLarge=");
        return AnonymousClass007.A0Z(this.A00, sb);
    }

    public C1AI() {
        this(null, 31);
    }
}
