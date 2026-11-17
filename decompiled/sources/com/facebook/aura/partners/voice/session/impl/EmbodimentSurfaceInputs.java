package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;

/* loaded from: classes2.dex */
public final class EmbodimentSurfaceInputs extends C06G {
    public final boolean displayEnabled;
    public final boolean embodimentAvailable;
    public final VoiceEmbodimentPlacement inAppPlacement;
    public final boolean liveAvatarEnabled;

    public EmbodimentSurfaceInputs(VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(voiceEmbodimentPlacement, 0);
        this.inAppPlacement = voiceEmbodimentPlacement;
        this.displayEnabled = z;
        this.liveAvatarEnabled = z2;
        this.embodimentAvailable = z3;
    }

    public final EmbodimentSurfaceInputs copy(VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3) {
        C7384Etj.A0Y(voiceEmbodimentPlacement, 0);
        return new EmbodimentSurfaceInputs(voiceEmbodimentPlacement, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmbodimentSurfaceInputs) {
                EmbodimentSurfaceInputs embodimentSurfaceInputs = (EmbodimentSurfaceInputs) obj;
                if (this.inAppPlacement != embodimentSurfaceInputs.inAppPlacement || this.displayEnabled != embodimentSurfaceInputs.displayEnabled || this.liveAvatarEnabled != embodimentSurfaceInputs.liveAvatarEnabled || this.embodimentAvailable != embodimentSurfaceInputs.embodimentAvailable) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmbodimentSurfaceInputs copy$default(EmbodimentSurfaceInputs embodimentSurfaceInputs, VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceEmbodimentPlacement = embodimentSurfaceInputs.inAppPlacement;
        }
        if ((i & 2) != 0) {
            z = embodimentSurfaceInputs.displayEnabled;
        }
        if ((i & 4) != 0) {
            z2 = embodimentSurfaceInputs.liveAvatarEnabled;
        }
        if ((i & 8) != 0) {
            z3 = embodimentSurfaceInputs.embodimentAvailable;
        }
        C7384Etj.A0Y(voiceEmbodimentPlacement, 0);
        return new EmbodimentSurfaceInputs(voiceEmbodimentPlacement, z, z2, z3);
    }

    public final VoiceEmbodimentPlacement component1() {
        return this.inAppPlacement;
    }

    public final boolean component2() {
        return this.displayEnabled;
    }

    public final boolean component3() {
        return this.liveAvatarEnabled;
    }

    public final boolean component4() {
        return this.embodimentAvailable;
    }

    public final boolean getDisplayEnabled() {
        return this.displayEnabled;
    }

    public final boolean getEmbodimentAvailable() {
        return this.embodimentAvailable;
    }

    public final VoiceEmbodimentPlacement getInAppPlacement() {
        return this.inAppPlacement;
    }

    public final boolean getLiveAvatarEnabled() {
        return this.liveAvatarEnabled;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.inAppPlacement), this.displayEnabled), this.liveAvatarEnabled), this.embodimentAvailable);
    }

    public String toString() {
        return super.toString();
    }
}
