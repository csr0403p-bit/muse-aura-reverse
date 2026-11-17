package com.facebook.aura.onboarding.view;

import X.AnonymousClass002;
import X.BFM;
import X.C06G;
import X.C1822Arm;
import X.C19U;

/* loaded from: classes.dex */
public final class OnboardingUiFlowTypography {
    public static final int $stable = 0;
    public static final OnboardingUiFlowTypography INSTANCE = new OnboardingUiFlowTypography();

    private final C1822Arm withLineHeight(C1822Arm c1822Arm, int i) {
        return C1822Arm.A00(null, c1822Arm, null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(i));
    }

    public final C1822Arm getAction(BFM bfm, int i) {
        return withLineHeight(C06G.A0W(bfm), 22);
    }

    public final C1822Arm getChip(BFM bfm, int i) {
        return withLineHeight(C06G.A0V(bfm), 20);
    }

    public final C1822Arm getField(BFM bfm, int i) {
        return withLineHeight(C06G.A0T(bfm), 22);
    }

    public final C1822Arm getFootnote(BFM bfm, int i) {
        return withLineHeight(C06G.A0Y(bfm), 18);
    }

    public final C1822Arm getGreetingSubtitle(BFM bfm, int i) {
        return withLineHeight(AnonymousClass002.A0f(bfm).title3Regular, 28);
    }

    public final C1822Arm getSubtitle(BFM bfm, int i) {
        return withLineHeight(C06G.A0Z(bfm), 20);
    }

    public final C1822Arm getTitle(BFM bfm, int i) {
        return withLineHeight(AnonymousClass002.A0f(bfm).title2Medium, 28);
    }
}
