package com.facebook.aura.components.confetti;

import X.AEP;
import X.AGI;
import X.AHD;
import X.AT1;
import X.B6A;
import X.C1DG;
import X.C8j3;
import X.C8j4;

/* loaded from: classes4.dex */
public final class AuraConfettiDefaults {
    public static final int $stable = 0;
    public static final int ParticleCount = 8;
    public static final AuraConfettiDefaults INSTANCE = new AuraConfettiDefaults();
    public static final float BurstRadius = 120.0f;
    public static final AT1<C1DG> ParticleWidth = AEP.A00(C8j3.A0k(4.0f), 6.0f);
    public static final AT1<C1DG> ParticleHeight = AEP.A00(C8j3.A0k(2.5f), 4.0f);
    public static final AHD<B6A> Palette = AGI.A0E(C8j4.A0Y(4278215892L), C8j4.A0Y(4280660313L), C8j4.A0Y(4294942474L), C8j4.A0Y(4294916971L), C8j4.A0Y(4286276095L), C8j4.A0Y(4294956554L));

    /* renamed from: getBurstRadius-D9Ej5fM, reason: not valid java name */
    public final float m373getBurstRadiusD9Ej5fM() {
        return BurstRadius;
    }

    public final AHD<B6A> getPalette() {
        return Palette;
    }

    public final AT1<C1DG> getParticleHeight() {
        return ParticleHeight;
    }

    public final AT1<C1DG> getParticleWidth() {
        return ParticleWidth;
    }
}
