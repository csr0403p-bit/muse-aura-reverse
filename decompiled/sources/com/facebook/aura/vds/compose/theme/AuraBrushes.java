package com.facebook.aura.vds.compose.theme;

import X.C06G;
import X.C1EQ;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class AuraBrushes extends C06G {
    public static final int $stable = 0;
    public final C1EQ planSelectedBorder;

    public AuraBrushes(C1EQ c1eq) {
        C7384Etj.A0Y(c1eq, 0);
        this.planSelectedBorder = c1eq;
    }

    public final AuraBrushes copy(C1EQ c1eq) {
        C7384Etj.A0Y(c1eq, 0);
        return new AuraBrushes(c1eq);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AuraBrushes) && C7384Etj.areEqual(this.planSelectedBorder, ((AuraBrushes) obj).planSelectedBorder));
    }

    public static /* synthetic */ AuraBrushes copy$default(AuraBrushes auraBrushes, C1EQ c1eq, int i, Object obj) {
        if ((i & 1) != 0) {
            c1eq = auraBrushes.planSelectedBorder;
        }
        C7384Etj.A0Y(c1eq, 0);
        return new AuraBrushes(c1eq);
    }

    public final C1EQ component1() {
        return this.planSelectedBorder;
    }

    public final C1EQ getPlanSelectedBorder() {
        return this.planSelectedBorder;
    }

    public int hashCode() {
        return this.planSelectedBorder.hashCode();
    }

    public String toString() {
        return super.toString();
    }
}
