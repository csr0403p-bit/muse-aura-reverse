package com.facebook.aura.ui;

import X.ANR;
import X.ANU;
import X.APt;
import X.APu;
import X.AbstractC1011APs;
import X.AnonymousClass002;
import X.C2HU;

/* loaded from: classes4.dex */
public abstract class HatchSetupTransitionKt {
    public static final int HATCH_SETUP_FADE_PHASE_MS = 250;
    public static final long HATCH_SETUP_LOTTIE_HOLD_MS = 250;

    public static final APt hatchSetupFadeOut() {
        return AbstractC1011APs.A0E(AnonymousClass002.A0J(C2HU.A02, 250));
    }

    public static final ANU hatchSetupFadeThrough() {
        ANU anuA00 = ANR.A00(APu.A00, hatchSetupFadeOut());
        anuA00.A03.AdS(-1.0f);
        return anuA00;
    }
}
