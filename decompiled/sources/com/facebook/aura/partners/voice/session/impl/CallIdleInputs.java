package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public final class CallIdleInputs extends C06G {
    public final String callId;
    public final HatchVoiceVideoConfigStore.Snapshot candidate;
    public final VoiceEmbodimentMedia media;
    public final CallPortraitFraming portraitFraming;
    public final HatchReadyCallIdle readyCallIdle;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallIdleInputs) {
                CallIdleInputs callIdleInputs = (CallIdleInputs) obj;
                if (!C7384Etj.areEqual(this.readyCallIdle, callIdleInputs.readyCallIdle) || !C7384Etj.areEqual(this.candidate, callIdleInputs.candidate) || !C7384Etj.areEqual(this.media, callIdleInputs.media) || !C7384Etj.areEqual(this.callId, callIdleInputs.callId) || !C7384Etj.areEqual(this.portraitFraming, callIdleInputs.portraitFraming)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CallIdleInputs copy$default(CallIdleInputs callIdleInputs, HatchReadyCallIdle hatchReadyCallIdle, HatchVoiceVideoConfigStore.Snapshot snapshot, VoiceEmbodimentMedia voiceEmbodimentMedia, String str, CallPortraitFraming callPortraitFraming, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchReadyCallIdle = callIdleInputs.readyCallIdle;
        }
        if ((i & 2) != 0) {
            snapshot = callIdleInputs.candidate;
        }
        if ((i & 4) != 0) {
            voiceEmbodimentMedia = callIdleInputs.media;
        }
        if ((i & 8) != 0) {
            str = callIdleInputs.callId;
        }
        if ((i & 16) != 0) {
            callPortraitFraming = callIdleInputs.portraitFraming;
        }
        return callIdleInputs.copy(hatchReadyCallIdle, snapshot, voiceEmbodimentMedia, str, callPortraitFraming);
    }

    public final HatchReadyCallIdle component1() {
        return this.readyCallIdle;
    }

    public final HatchVoiceVideoConfigStore.Snapshot component2() {
        return this.candidate;
    }

    public final VoiceEmbodimentMedia component3() {
        return this.media;
    }

    public final String component4() {
        return this.callId;
    }

    public final CallPortraitFraming component5() {
        return this.portraitFraming;
    }

    public final CallIdleInputs copy(HatchReadyCallIdle hatchReadyCallIdle, HatchVoiceVideoConfigStore.Snapshot snapshot, VoiceEmbodimentMedia voiceEmbodimentMedia, String str, CallPortraitFraming callPortraitFraming) {
        return new CallIdleInputs(hatchReadyCallIdle, snapshot, voiceEmbodimentMedia, str, callPortraitFraming);
    }

    public final String getCallId() {
        return this.callId;
    }

    public final HatchVoiceVideoConfigStore.Snapshot getCandidate() {
        return this.candidate;
    }

    public final VoiceEmbodimentMedia getMedia() {
        return this.media;
    }

    public final CallPortraitFraming getPortraitFraming() {
        return this.portraitFraming;
    }

    public final HatchReadyCallIdle getReadyCallIdle() {
        return this.readyCallIdle;
    }

    public int hashCode() {
        return (((((((AnonymousClass006.A0D(this.readyCallIdle) * 31) + AnonymousClass006.A0D(this.candidate)) * 31) + AnonymousClass006.A0D(this.media)) * 31) + AnonymousClass006.A0G(this.callId)) * 31) + C3cH.A02(this.portraitFraming);
    }

    public CallIdleInputs(HatchReadyCallIdle hatchReadyCallIdle, HatchVoiceVideoConfigStore.Snapshot snapshot, VoiceEmbodimentMedia voiceEmbodimentMedia, String str, CallPortraitFraming callPortraitFraming) {
        this.readyCallIdle = hatchReadyCallIdle;
        this.candidate = snapshot;
        this.media = voiceEmbodimentMedia;
        this.callId = str;
        this.portraitFraming = callPortraitFraming;
    }

    public String toString() {
        return super.toString();
    }
}
