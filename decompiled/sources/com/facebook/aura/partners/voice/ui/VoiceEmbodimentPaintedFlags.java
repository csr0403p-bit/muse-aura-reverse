package com.facebook.aura.partners.voice.ui;

import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C60R;

/* loaded from: classes4.dex */
public final class VoiceEmbodimentPaintedFlags extends C06G {
    public static final int $stable = 0;
    public final boolean activityCoverReady;
    public final boolean rtcEverPainted;
    public final boolean rtcFullyOpaque;
    public final long rtcLastFrameAtMs;
    public final boolean rtcReady;
    public final boolean stillFullyOpaque;
    public final boolean stillPainted;

    public static /* synthetic */ VoiceEmbodimentPaintedFlags copy$default(VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7 = z;
        long j2 = j;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        if ((i & 1) != 0) {
            z7 = voiceEmbodimentPaintedFlags.rtcReady;
        }
        if ((i & 2) != 0) {
            j2 = voiceEmbodimentPaintedFlags.rtcLastFrameAtMs;
        }
        if ((i & 4) != 0) {
            z8 = voiceEmbodimentPaintedFlags.rtcEverPainted;
        }
        if ((i & 8) != 0) {
            z9 = voiceEmbodimentPaintedFlags.stillPainted;
        }
        if ((i & 16) != 0) {
            z10 = voiceEmbodimentPaintedFlags.rtcFullyOpaque;
        }
        if ((i & 32) != 0) {
            z11 = voiceEmbodimentPaintedFlags.stillFullyOpaque;
        }
        if ((i & 64) != 0) {
            z12 = voiceEmbodimentPaintedFlags.activityCoverReady;
        }
        return new VoiceEmbodimentPaintedFlags(z7, j2, z8, z9, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentPaintedFlags) {
                VoiceEmbodimentPaintedFlags voiceEmbodimentPaintedFlags = (VoiceEmbodimentPaintedFlags) obj;
                if (this.rtcReady != voiceEmbodimentPaintedFlags.rtcReady || this.rtcLastFrameAtMs != voiceEmbodimentPaintedFlags.rtcLastFrameAtMs || this.rtcEverPainted != voiceEmbodimentPaintedFlags.rtcEverPainted || this.stillPainted != voiceEmbodimentPaintedFlags.stillPainted || this.rtcFullyOpaque != voiceEmbodimentPaintedFlags.rtcFullyOpaque || this.stillFullyOpaque != voiceEmbodimentPaintedFlags.stillFullyOpaque || this.activityCoverReady != voiceEmbodimentPaintedFlags.activityCoverReady) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.rtcReady;
    }

    public final long component2() {
        return this.rtcLastFrameAtMs;
    }

    public final boolean component3() {
        return this.rtcEverPainted;
    }

    public final boolean component4() {
        return this.stillPainted;
    }

    public final boolean component5() {
        return this.rtcFullyOpaque;
    }

    public final boolean component6() {
        return this.stillFullyOpaque;
    }

    public final boolean component7() {
        return this.activityCoverReady;
    }

    public final VoiceEmbodimentPaintedFlags copy(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new VoiceEmbodimentPaintedFlags(z, j, z2, z3, z4, z5, z6);
    }

    public final boolean getActivityCoverReady() {
        return this.activityCoverReady;
    }

    public final boolean getRtcEverPainted() {
        return this.rtcEverPainted;
    }

    public final boolean getRtcFullyOpaque() {
        return this.rtcFullyOpaque;
    }

    public final long getRtcLastFrameAtMs() {
        return this.rtcLastFrameAtMs;
    }

    public final boolean getRtcReady() {
        return this.rtcReady;
    }

    public final boolean getStillFullyOpaque() {
        return this.stillFullyOpaque;
    }

    public final boolean getStillPainted() {
        return this.stillPainted;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C60R.A00(this.rtcLastFrameAtMs, C0KA.A02(this.rtcReady)), this.rtcEverPainted), this.stillPainted), this.rtcFullyOpaque), this.stillFullyOpaque), this.activityCoverReady);
    }

    public VoiceEmbodimentPaintedFlags(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.rtcReady = z;
        this.rtcLastFrameAtMs = j;
        this.rtcEverPainted = z2;
        this.stillPainted = z3;
        this.rtcFullyOpaque = z4;
        this.stillFullyOpaque = z5;
        this.activityCoverReady = z6;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceEmbodimentPaintedFlags(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, C06H c06h) {
        this(z, j, z2, z3, z4, z5, C3cG.A1K(i & 64, z6));
    }
}
