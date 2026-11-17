package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPlacement;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentInputs extends C06G {
    public final boolean appInForeground;
    public final boolean displayEnabled;
    public final boolean embodimentAvailable;
    public final VoiceEmbodimentPlacement inAppPlacement;
    public final boolean liveAvatarEnabled;
    public final VoiceEmbodimentPaintedMedia media;
    public final boolean reconnecting;
    public final boolean systemPipActive;

    public VoiceEmbodimentInputs(VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia) {
        C7384Etj.A0Y(voiceEmbodimentPlacement, 0);
        C7384Etj.A0Y(voiceEmbodimentPaintedMedia, 7);
        this.inAppPlacement = voiceEmbodimentPlacement;
        this.displayEnabled = z;
        this.liveAvatarEnabled = z2;
        this.embodimentAvailable = z3;
        this.appInForeground = z4;
        this.systemPipActive = z5;
        this.reconnecting = z6;
        this.media = voiceEmbodimentPaintedMedia;
    }

    public final VoiceEmbodimentInputs copy(VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia) {
        C7384Etj.A0Y(voiceEmbodimentPlacement, 0);
        C7384Etj.A0Y(voiceEmbodimentPaintedMedia, 7);
        return new VoiceEmbodimentInputs(voiceEmbodimentPlacement, z, z2, z3, z4, z5, z6, voiceEmbodimentPaintedMedia);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceEmbodimentInputs) {
                VoiceEmbodimentInputs voiceEmbodimentInputs = (VoiceEmbodimentInputs) obj;
                if (this.inAppPlacement != voiceEmbodimentInputs.inAppPlacement || this.displayEnabled != voiceEmbodimentInputs.displayEnabled || this.liveAvatarEnabled != voiceEmbodimentInputs.liveAvatarEnabled || this.embodimentAvailable != voiceEmbodimentInputs.embodimentAvailable || this.appInForeground != voiceEmbodimentInputs.appInForeground || this.systemPipActive != voiceEmbodimentInputs.systemPipActive || this.reconnecting != voiceEmbodimentInputs.reconnecting || this.media != voiceEmbodimentInputs.media) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceEmbodimentInputs copy$default(VoiceEmbodimentInputs voiceEmbodimentInputs, VoiceEmbodimentPlacement voiceEmbodimentPlacement, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, VoiceEmbodimentPaintedMedia voiceEmbodimentPaintedMedia, int i, Object obj) {
        if ((i & 1) != 0) {
            voiceEmbodimentPlacement = voiceEmbodimentInputs.inAppPlacement;
        }
        if ((i & 2) != 0) {
            z = voiceEmbodimentInputs.displayEnabled;
        }
        if ((i & 4) != 0) {
            z2 = voiceEmbodimentInputs.liveAvatarEnabled;
        }
        if ((i & 8) != 0) {
            z3 = voiceEmbodimentInputs.embodimentAvailable;
        }
        if ((i & 16) != 0) {
            z4 = voiceEmbodimentInputs.appInForeground;
        }
        if ((i & 32) != 0) {
            z5 = voiceEmbodimentInputs.systemPipActive;
        }
        if ((i & 64) != 0) {
            z6 = voiceEmbodimentInputs.reconnecting;
        }
        if ((i & 128) != 0) {
            voiceEmbodimentPaintedMedia = voiceEmbodimentInputs.media;
        }
        return voiceEmbodimentInputs.copy(voiceEmbodimentPlacement, z, z2, z3, z4, z5, z6, voiceEmbodimentPaintedMedia);
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

    public final boolean component5() {
        return this.appInForeground;
    }

    public final boolean component6() {
        return this.systemPipActive;
    }

    public final boolean component7() {
        return this.reconnecting;
    }

    public final VoiceEmbodimentPaintedMedia component8() {
        return this.media;
    }

    public final boolean getAppInForeground() {
        return this.appInForeground;
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

    public final VoiceEmbodimentPaintedMedia getMedia() {
        return this.media;
    }

    public final boolean getReconnecting() {
        return this.reconnecting;
    }

    public final boolean getSystemPipActive() {
        return this.systemPipActive;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.media, C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.inAppPlacement), this.displayEnabled), this.liveAvatarEnabled), this.embodimentAvailable), this.appInForeground), this.systemPipActive), this.reconnecting));
    }

    public String toString() {
        return super.toString();
    }
}
