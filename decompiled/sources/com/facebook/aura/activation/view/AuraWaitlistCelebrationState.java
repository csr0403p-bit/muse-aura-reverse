package com.facebook.aura.activation.view;

import X.AOW;
import X.AT5;
import X.AT8;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AuraWaitlistCelebrationState {
    public static final int $stable = 0;
    public final AT5<Float, AOW> confettiElapsedMs;
    public final AT5<Float, AOW> ctaScale;
    public final AuraConfettiDensity density;

    public AuraWaitlistCelebrationState(AuraConfettiDensity auraConfettiDensity) {
        C7384Etj.A0Y(auraConfettiDensity, 0);
        this.density = auraConfettiDensity;
        this.ctaScale = AT8.A00(1.0f);
        this.confettiElapsedMs = AT8.A00(AuraWaitlistConfettiKt.getBurst(auraConfettiDensity).durationMs);
    }

    public final AT5<Float, AOW> getConfettiElapsedMs() {
        return this.confettiElapsedMs;
    }

    public final AT5<Float, AOW> getCtaScale() {
        return this.ctaScale;
    }

    public final AuraConfettiDensity getDensity$fbandroid_express_aura_java_com_facebook_aura_activation_view_view() {
        return this.density;
    }
}
