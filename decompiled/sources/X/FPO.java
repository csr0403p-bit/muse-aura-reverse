package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class FPO implements FPC {
    public static final FPO A00 = new FPO();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof FPO);
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
        return true;
    }

    @Override // X.FPC
    public final float AGF() {
        return 1.0f;
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
        return false;
    }

    @Override // X.FPN
    public final boolean AMr() {
        return false;
    }

    @Override // X.FPN
    public final /* bridge */ Bundle Agu() {
        return null;
    }

    @Override // X.FPN
    public final String getName() {
        return "full_screen_dialog";
    }

    public final String toString() {
        return "FullScreenDialogConfig";
    }

    public final int hashCode() {
        return -1879630445;
    }
}
