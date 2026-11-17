package com.facebook.aura.partners.voice.intf;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentVideoSuppression extends C06G {
    public static final int $stable = 0;
    public final boolean avatarUpdating;
    public final boolean memoryBlocked;
    public final boolean memoryMeasured;
    public final boolean offScreen;
    public final boolean poorLink;
    public final boolean portraitMissing;

    public VoiceEmbodimentVideoSuppression() {
        this(false, true, false, false, false, false);
    }

    public static /* synthetic */ VoiceEmbodimentVideoSuppression copy$default(VoiceEmbodimentVideoSuppression voiceEmbodimentVideoSuppression, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7 = z;
        boolean z8 = z2;
        boolean z9 = z3;
        boolean z10 = z4;
        boolean z11 = z5;
        boolean z12 = z6;
        if ((i & 1) != 0) {
            z7 = voiceEmbodimentVideoSuppression.poorLink;
        }
        if ((i & 2) != 0) {
            z8 = voiceEmbodimentVideoSuppression.memoryBlocked;
        }
        if ((i & 4) != 0) {
            z9 = voiceEmbodimentVideoSuppression.memoryMeasured;
        }
        if ((i & 8) != 0) {
            z10 = voiceEmbodimentVideoSuppression.portraitMissing;
        }
        if ((i & 16) != 0) {
            z11 = voiceEmbodimentVideoSuppression.avatarUpdating;
        }
        if ((i & 32) != 0) {
            z12 = voiceEmbodimentVideoSuppression.offScreen;
        }
        return new VoiceEmbodimentVideoSuppression(z7, z8, z9, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentVideoSuppression) {
                VoiceEmbodimentVideoSuppression voiceEmbodimentVideoSuppression = (VoiceEmbodimentVideoSuppression) obj;
                if (this.poorLink != voiceEmbodimentVideoSuppression.poorLink || this.memoryBlocked != voiceEmbodimentVideoSuppression.memoryBlocked || this.memoryMeasured != voiceEmbodimentVideoSuppression.memoryMeasured || this.portraitMissing != voiceEmbodimentVideoSuppression.portraitMissing || this.avatarUpdating != voiceEmbodimentVideoSuppression.avatarUpdating || this.offScreen != voiceEmbodimentVideoSuppression.offScreen) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.poorLink;
    }

    public final boolean component2() {
        return this.memoryBlocked;
    }

    public final boolean component3() {
        return this.memoryMeasured;
    }

    public final boolean component4() {
        return this.portraitMissing;
    }

    public final boolean component5() {
        return this.avatarUpdating;
    }

    public final boolean component6() {
        return this.offScreen;
    }

    public final VoiceEmbodimentVideoSuppression copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return new VoiceEmbodimentVideoSuppression(z, z2, z3, z4, z5, z6);
    }

    public final boolean getAvatarUpdating() {
        return this.avatarUpdating;
    }

    public final boolean getLiveVideoBlocked() {
        return this.poorLink || this.memoryBlocked || this.portraitMissing || this.avatarUpdating;
    }

    public final boolean getMemoryBlocked() {
        return this.memoryBlocked;
    }

    public final boolean getMemoryMeasured() {
        return this.memoryMeasured;
    }

    public final boolean getMemoryPressureReported() {
        return this.memoryBlocked && this.memoryMeasured;
    }

    public final boolean getOffScreen() {
        return this.offScreen;
    }

    public final boolean getPoorLink() {
        return this.poorLink;
    }

    public final boolean getPortraitMissing() {
        return this.portraitMissing;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.poorLink), this.memoryBlocked), this.memoryMeasured), this.portraitMissing), this.avatarUpdating), this.offScreen);
    }

    public final boolean getLiveVideoSuppressed() {
        return getLiveVideoBlocked() || this.offScreen;
    }

    public String toString() {
        return super.toString();
    }

    public VoiceEmbodimentVideoSuppression(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.poorLink = z;
        this.memoryBlocked = z2;
        this.memoryMeasured = z3;
        this.portraitMissing = z4;
        this.avatarUpdating = z5;
        this.offScreen = z6;
    }

    public /* synthetic */ VoiceEmbodimentVideoSuppression(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), C3cG.A1J(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass005.A1P(i, z4), AnonymousClass005.A1Q(i, z5), AnonymousClass002.A1R(i, z6));
    }
}
