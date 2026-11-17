package X;

import java.util.Map;

/* renamed from: X.APv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1012APv {
    public final C1015APy A00;
    public final C1013APw A01;
    public final C1016APz A02;
    public final C1014APx A03;
    public final Map A04;
    public final boolean A05;

    public C1012APv() {
        this(null, null, null, null, C9jH.A00, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1012APv) {
                C1012APv c1012APv = (C1012APv) obj;
                if (!C7384Etj.areEqual(this.A01, c1012APv.A01) || !C7384Etj.areEqual(this.A03, c1012APv.A03) || !C7384Etj.areEqual(this.A00, c1012APv.A00) || !C7384Etj.areEqual(this.A02, c1012APv.A02) || this.A05 != c1012APv.A05 || !this.A04.equals(c1012APv.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A04, C0KA.A01(((((((AnonymousClass006.A0D(this.A01) * 31) + AnonymousClass006.A0D(this.A03)) * 31) + AnonymousClass006.A0D(this.A00)) * 31) + AnonymousClass006.A0D(this.A02)) * 31 * 31, this.A05));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TransitionData(fade=");
        sbA0x.append(this.A01);
        sbA0x.append(", slide=");
        sbA0x.append(this.A03);
        sbA0x.append(", changeSize=");
        sbA0x.append(this.A00);
        sbA0x.append(", scale=");
        sbA0x.append(this.A02);
        C8j4.A1R(sbA0x, ", veil=");
        sbA0x.append(", hold=");
        sbA0x.append(this.A05);
        sbA0x.append(", effectsMap=");
        return AnonymousClass007.A0Z(this.A04, sbA0x);
    }

    public C1012APv(C1015APy c1015APy, C1013APw c1013APw, C1016APz c1016APz, C1014APx c1014APx, Map map, boolean z) {
        this.A01 = c1013APw;
        this.A03 = c1014APx;
        this.A00 = c1015APy;
        this.A02 = c1016APz;
        this.A05 = z;
        this.A04 = map;
    }
}
