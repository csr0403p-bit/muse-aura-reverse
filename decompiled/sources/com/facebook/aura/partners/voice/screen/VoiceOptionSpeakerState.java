package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceOptionSpeakerState extends C06G {
    public final boolean chosen;
    public final boolean highlighted;
    public final String label;
    public final boolean loading;
    public final boolean locked;
    public final boolean playing;
    public final boolean selectionEnabled;

    public VoiceOptionSpeakerState(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C7384Etj.A0Y(str, 0);
        this.label = str;
        this.selectionEnabled = z;
        this.locked = z2;
        this.chosen = z3;
        this.highlighted = z4;
        this.loading = z5;
        this.playing = z6;
    }

    public final VoiceOptionSpeakerState copy(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C7384Etj.A0Y(str, 0);
        return new VoiceOptionSpeakerState(str, z, z2, z3, z4, z5, z6);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOptionSpeakerState) {
                VoiceOptionSpeakerState voiceOptionSpeakerState = (VoiceOptionSpeakerState) obj;
                if (!C7384Etj.areEqual(this.label, voiceOptionSpeakerState.label) || this.selectionEnabled != voiceOptionSpeakerState.selectionEnabled || this.locked != voiceOptionSpeakerState.locked || this.chosen != voiceOptionSpeakerState.chosen || this.highlighted != voiceOptionSpeakerState.highlighted || this.loading != voiceOptionSpeakerState.loading || this.playing != voiceOptionSpeakerState.playing) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceOptionSpeakerState copy$default(VoiceOptionSpeakerState voiceOptionSpeakerState, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceOptionSpeakerState.label;
        }
        if ((i & 2) != 0) {
            z = voiceOptionSpeakerState.selectionEnabled;
        }
        if ((i & 4) != 0) {
            z2 = voiceOptionSpeakerState.locked;
        }
        if ((i & 8) != 0) {
            z3 = voiceOptionSpeakerState.chosen;
        }
        if ((i & 16) != 0) {
            z4 = voiceOptionSpeakerState.highlighted;
        }
        if ((i & 32) != 0) {
            z5 = voiceOptionSpeakerState.loading;
        }
        if ((i & 64) != 0) {
            z6 = voiceOptionSpeakerState.playing;
        }
        return voiceOptionSpeakerState.copy(str, z, z2, z3, z4, z5, z6);
    }

    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.selectionEnabled;
    }

    public final boolean component3() {
        return this.locked;
    }

    public final boolean component4() {
        return this.chosen;
    }

    public final boolean component5() {
        return this.highlighted;
    }

    public final boolean component6() {
        return this.loading;
    }

    public final boolean component7() {
        return this.playing;
    }

    public final boolean getChosen() {
        return this.chosen;
    }

    public final boolean getDimmed() {
        return this.locked && !this.chosen;
    }

    public final boolean getEnabled() {
        return !this.locked;
    }

    public final boolean getHighlighted() {
        return this.highlighted;
    }

    public final String getLabel() {
        return this.label;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public final boolean getSelectionEnabled() {
        return this.selectionEnabled;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.label), this.selectionEnabled), this.locked), this.chosen), this.highlighted), this.loading), this.playing);
    }

    public String toString() {
        return super.toString();
    }
}
