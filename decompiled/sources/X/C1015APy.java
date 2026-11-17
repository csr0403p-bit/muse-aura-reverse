package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.APy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1015APy {
    public final AOe<BL4> A00;
    public final Alignment A01;
    public final G0U<BL4, BL4> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1015APy) {
                C1015APy c1015APy = (C1015APy) obj;
                if (!this.A01.equals(c1015APy.A01) || !this.A02.equals(c1015APy.A02) || !C7384Etj.areEqual(this.A00, c1015APy.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A00, AnonymousClass005.A0F(this.A02, AnonymousClass005.A0E(this.A01))) + 1231;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ChangeSize(alignment=");
        sbA0x.append(this.A01);
        sbA0x.append(", size=");
        sbA0x.append(this.A02);
        sbA0x.append(", animationSpec=");
        sbA0x.append(this.A00);
        sbA0x.append(", clip=");
        sbA0x.append(true);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1015APy(AOe aOe, Alignment alignment, G0U g0u) {
        this.A01 = alignment;
        this.A02 = g0u;
        this.A00 = aOe;
    }
}
