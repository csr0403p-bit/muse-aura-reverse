package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoicePreviewPlayback extends C06G {
    public static final int $stable = 0;
    public final VoicePreviewKey key;
    public final VoicePreviewPhase phase;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePreviewPlayback) {
                VoicePreviewPlayback voicePreviewPlayback = (VoicePreviewPlayback) obj;
                if (!C7384Etj.areEqual(this.key, voicePreviewPlayback.key) || this.phase != voicePreviewPlayback.phase) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePreviewPlayback copy$default(VoicePreviewPlayback voicePreviewPlayback, VoicePreviewKey voicePreviewKey, VoicePreviewPhase voicePreviewPhase, int i, Object obj) {
        if ((i & 1) != 0) {
            voicePreviewKey = voicePreviewPlayback.key;
        }
        if ((i & 2) != 0) {
            voicePreviewPhase = voicePreviewPlayback.phase;
        }
        AnonymousClass003.A0u(voicePreviewKey, voicePreviewPhase);
        return new VoicePreviewPlayback(voicePreviewKey, voicePreviewPhase);
    }

    public final VoicePreviewKey component1() {
        return this.key;
    }

    public final VoicePreviewPhase component2() {
        return this.phase;
    }

    public final VoicePreviewKey getKey() {
        return this.key;
    }

    public final VoicePreviewPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.phase, AnonymousClass005.A0E(this.key));
    }

    public VoicePreviewPlayback(VoicePreviewKey voicePreviewKey, VoicePreviewPhase voicePreviewPhase) {
        AnonymousClass003.A0u(voicePreviewKey, voicePreviewPhase);
        this.key = voicePreviewKey;
        this.phase = voicePreviewPhase;
    }

    public final VoicePreviewPlayback copy(VoicePreviewKey voicePreviewKey, VoicePreviewPhase voicePreviewPhase) {
        AnonymousClass003.A0u(voicePreviewKey, voicePreviewPhase);
        return new VoicePreviewPlayback(voicePreviewKey, voicePreviewPhase);
    }

    public String toString() {
        return super.toString();
    }
}
