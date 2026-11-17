package X;

/* renamed from: X.APx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1014APx {
    public final AOe<C2ae> A00;
    public final G0U<BL4, C2ae> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1014APx) {
                C1014APx c1014APx = (C1014APx) obj;
                if (!this.A01.equals(c1014APx.A01) || !C7384Etj.areEqual(this.A00, c1014APx.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(this.A01));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Slide(slideOffset=");
        sbA0x.append(this.A01);
        sbA0x.append(", animationSpec=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/BL4;LX/2ae;>;LX/AOe<LX/2ae;>;)V */
    public C1014APx(AOe aOe, G0U g0u) {
        this.A01 = g0u;
        this.A00 = aOe;
    }
}
