package com.facebook.aura.vds.compose.swipeable;

import X.AEs;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C9286GCn;

/* loaded from: classes4.dex */
public final class AuraSwipeablePeekViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _hasPeekAnimationPlayed;
    public final C1BN<Boolean> hasPeekAnimationPlayed;

    public final C1BN<Boolean> getHasPeekAnimationPlayed() {
        return this.hasPeekAnimationPlayed;
    }

    public final void setHasPeekAnimationPlayed(boolean z) {
        AnonymousClass004.A1D(z, this._hasPeekAnimationPlayed);
    }

    public AuraSwipeablePeekViewModel() {
        C9286GCn c9286GCnA14 = C3cG.A14(AnonymousClass001.A0h());
        this._hasPeekAnimationPlayed = c9286GCnA14;
        this.hasPeekAnimationPlayed = c9286GCnA14;
    }
}
