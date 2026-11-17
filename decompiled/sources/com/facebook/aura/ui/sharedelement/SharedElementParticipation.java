package com.facebook.aura.ui.sharedelement;

/* loaded from: classes4.dex */
public final class SharedElementParticipation {
    public boolean wasEnabled;

    public final boolean shouldParticipate(boolean z, boolean z2) {
        if (z) {
            return true;
        }
        return z2 && this.wasEnabled;
    }

    public final void updateAfterComposition(boolean z, boolean z2) {
        boolean z3;
        if (z) {
            z3 = true;
        } else if (z2) {
            return;
        } else {
            z3 = false;
        }
        this.wasEnabled = z3;
    }
}
