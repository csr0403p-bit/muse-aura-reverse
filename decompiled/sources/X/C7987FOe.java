package X;

import android.os.Bundle;

/* renamed from: X.FOe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7987FOe implements FPC {
    public final float A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7987FOe) {
                C7987FOe c7987FOe = (C7987FOe) obj;
                if (Float.compare(this.A00, c7987FOe.A00) != 0 || this.A01 != c7987FOe.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.FPC
    public final boolean ACc() {
        return false;
    }

    @Override // X.FPN
    public final boolean ADP() {
        return false;
    }

    @Override // X.FPN
    public final boolean AFw() {
        return false;
    }

    @Override // X.FPC
    public final float AGF() {
        return this.A00;
    }

    @Override // X.FPC
    public final boolean AJh() {
        return false;
    }

    @Override // X.FPC
    public final Float AKu() {
        return null;
    }

    @Override // X.FPC
    public final boolean ALJ() {
        return this.A01;
    }

    @Override // X.FPN
    public final boolean AMr() {
        return true;
    }

    @Override // X.FPN
    public final String getName() {
        return "wraps_content_dialog";
    }

    public final int hashCode() {
        return C0KA.A00(C8j4.A04(this.A00), this.A01);
    }

    public final String toString() {
        float f = this.A00;
        boolean z = this.A01;
        StringBuilder sbA0x = C60O.A0x("WrapsContentDialogConfig(heightFraction=");
        sbA0x.append(f);
        return C8j5.A0W(", supportUnderlay=", sbA0x, z);
    }

    public C7987FOe(float f, boolean z) {
        this.A00 = f;
        this.A01 = z;
    }

    @Override // X.FPN
    public final Bundle Agu() {
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putFloat("height_fraction", this.A00);
        bundleA0N.putBoolean("support_underlay", this.A01);
        return bundleA0N;
    }
}
