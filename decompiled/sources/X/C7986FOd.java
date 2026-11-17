package X;

import android.os.Bundle;

/* renamed from: X.FOd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7986FOd implements FPC {
    public final Float A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C7986FOd() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7986FOd) {
                C7986FOd c7986FOd = (C7986FOd) obj;
                if (!C7384Etj.areEqual(this.A00, c7986FOd.A00) || this.A01 != c7986FOd.A01 || this.A02 != c7986FOd.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.FPC
    public final boolean ACc() {
        return this.A03;
    }

    @Override // X.FPN
    public final boolean ADP() {
        return this.A04;
    }

    @Override // X.FPN
    public final boolean AFw() {
        return false;
    }

    @Override // X.FPC
    public final float AGF() {
        return 1.0f;
    }

    @Override // X.FPC
    public final boolean AJh() {
        return this.A01;
    }

    @Override // X.FPC
    public final Float AKu() {
        return this.A00;
    }

    @Override // X.FPC
    public final boolean ALJ() {
        return this.A02;
    }

    @Override // X.FPN
    public final boolean AMr() {
        return false;
    }

    @Override // X.FPN
    public final String getName() {
        return "full_sheet_dialog";
    }

    public final int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass006.A0D(this.A00) * 31, this.A01), this.A02);
    }

    public final String toString() {
        Float f = this.A00;
        boolean z = this.A01;
        boolean z2 = this.A02;
        StringBuilder sbA0f = C3cG.A0f(f, "FullSheetDialogConfig(startAnchorHeightFraction=");
        sbA0f.append(", resistDismissAboveStartAnchor=");
        sbA0f.append(z);
        return C8j5.A0W(", supportUnderlay=", sbA0f, z2);
    }

    @Override // X.FPN
    public final Bundle Agu() {
        Bundle bundleA0N = BV6.A0N();
        Float f = this.A00;
        if (f != null) {
            bundleA0N.putFloat("start_anchor_height_fraction", f.floatValue());
        }
        bundleA0N.putBoolean("resist_dismiss_above_start_anchor", this.A01);
        bundleA0N.putBoolean("support_underlay", this.A02);
        return bundleA0N;
    }

    public C7986FOd(Float f, boolean z, boolean z2) {
        this.A00 = f;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = AnonymousClass002.A1Y(f);
        this.A04 = f == null;
    }
}
