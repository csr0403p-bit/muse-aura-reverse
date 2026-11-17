package com.facebook.aura.onboarding.view;

import X.AOW;
import X.AT5;
import X.AT8;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C00q;
import X.C2HU;
import X.C3cH;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;

/* loaded from: classes2.dex */
public final class OnboardingNameReveal {
    public static final int $stable = 0;
    public final AT5<Float, AOW> clock = AT8.A00(0.0f);
    public final MutableState title$delegate = AnonymousClass002.A0P(null);
    public final C00q questionStartMs$delegate = new ParcelableSnapshotMutableFloatState(Float.POSITIVE_INFINITY);

    public final float entranceProgress(int i) {
        return C2HU.A01.transform(AnonymousClass003.A00(((C3cH.A00(this.clock) - this.questionStartMs$delegate.AFn()) - i) / 350.0f));
    }

    public final AT5<Float, AOW> getClock() {
        return this.clock;
    }

    public final float getQuestionStartMs() {
        return this.questionStartMs$delegate.AFn();
    }

    public final String getTitle() {
        return MutableState.A05(this.title$delegate);
    }

    public final void setQuestionStartMs(float f) {
        this.questionStartMs$delegate.AdS(f);
    }

    public final void setTitle(String str) {
        this.title$delegate.Af8(str);
    }
}
