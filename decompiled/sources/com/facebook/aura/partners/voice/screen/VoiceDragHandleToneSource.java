package com.facebook.aura.partners.voice.screen;

import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceDragHandleToneSource {
    public static final int $stable = 8;
    public final float liveCropTopFraction;
    public final VoiceDragHandleStill still;

    public VoiceDragHandleToneSource(VoiceDragHandleStill voiceDragHandleStill, float f) {
        C7384Etj.A0Y(voiceDragHandleStill, 0);
        this.still = voiceDragHandleStill;
        this.liveCropTopFraction = f;
    }

    public final float getLiveCropTopFraction() {
        return this.liveCropTopFraction;
    }

    public final VoiceDragHandleStill getStill() {
        return this.still;
    }
}
