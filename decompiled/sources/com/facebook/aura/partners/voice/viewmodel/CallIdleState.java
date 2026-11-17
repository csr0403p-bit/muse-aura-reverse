package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReference;
import com.facebook.aura.partners.voice.avatar.HatchAvatarSelection;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.viewmodel.CallIdleSelection;

/* loaded from: classes2.dex */
public final class CallIdleState extends C06G {
    public final CallIdleSelection preCallIdle;
    public final String preCallIdleAssetId;
    public final CallIdleSelection selection;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallIdleState) {
                CallIdleState callIdleState = (CallIdleState) obj;
                if (!C7384Etj.areEqual(this.selection, callIdleState.selection) || !C7384Etj.areEqual(this.preCallIdle, callIdleState.preCallIdle) || !C7384Etj.areEqual(this.preCallIdleAssetId, callIdleState.preCallIdleAssetId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final CallIdleState next(CallIdleInputs callIdleInputs) {
        CallIdleSelection reference;
        CallIdleSelection callIdleSelection;
        VoiceEmbodimentMedia.LiveRtc liveRtc;
        VoiceEmbodimentMedia.ReferenceFraming referenceFraming;
        HatchAvatarSelection hatchAvatarSelection;
        HatchAvatarReference hatchAvatarReference;
        C7384Etj.A0Y(callIdleInputs, 0);
        boolean z = callIdleInputs.dark;
        HatchReadyCallIdle hatchReadyCallIdle = callIdleInputs.ready;
        String str = null;
        if (hatchReadyCallIdle == null || hatchReadyCallIdle.video.dark != z) {
            PreparedHatchAvatar preparedHatchAvatar = callIdleInputs.prepared;
            if (preparedHatchAvatar == null || z) {
                reference = null;
            } else {
                HatchAvatarReference hatchAvatarReference2 = preparedHatchAvatar.selection.reference;
                String str2 = hatchAvatarReference2.idleVideoUri;
                reference = new CallIdleSelection.Reference(preparedHatchAvatar, str2 != null ? callIdleInputs.posters.get(new HatchAvatarIdleKey(hatchAvatarReference2.assetId, str2)) : null);
            }
        } else {
            reference = new CallIdleSelection.Ready(hatchReadyCallIdle);
        }
        PreparedHatchAvatar preparedHatchAvatar2 = callIdleInputs.prepared;
        String str3 = (preparedHatchAvatar2 == null || (hatchAvatarSelection = preparedHatchAvatar2.selection) == null || (hatchAvatarReference = hatchAvatarSelection.reference) == null) ? null : hatchAvatarReference.assetId;
        if (!callIdleInputs.active) {
            return new CallIdleState(null, reference, str3);
        }
        VoiceEmbodimentMedia voiceEmbodimentMedia = callIdleInputs.media;
        if (!(voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.LiveRtc) || (liveRtc = (VoiceEmbodimentMedia.LiveRtc) voiceEmbodimentMedia) == null || (referenceFraming = liveRtc.previewFraming) == null) {
            callIdleSelection = this.preCallIdle;
            if (z || str3 == null || !str3.equals(this.preCallIdleAssetId) || callIdleSelection == null) {
            }
            return new CallIdleState(callIdleSelection, this.preCallIdle, this.preCallIdleAssetId);
        }
        String str4 = liveRtc.idleVideoUri;
        String str5 = liveRtc.referenceAssetId;
        HatchAvatarIdlePoster hatchAvatarIdlePoster = (str5 == null || str4 == null) ? null : callIdleInputs.posters.get(new HatchAvatarIdleKey(str5, str4));
        VoiceEmbodimentMedia.StaticAvatar staticAvatar = liveRtc.fallbackAvatar;
        if (staticAvatar != null && staticAvatar.referenceFraming != null && (!z || liveRtc.idleVideoUri != null)) {
            str = staticAvatar.imageUri;
        }
        reference = new CallIdleSelection.Live(str4, hatchAvatarIdlePoster, str, referenceFraming);
        callIdleSelection = reference;
        return new CallIdleState(callIdleSelection, this.preCallIdle, this.preCallIdleAssetId);
    }

    public static /* synthetic */ CallIdleState copy$default(CallIdleState callIdleState, CallIdleSelection callIdleSelection, CallIdleSelection callIdleSelection2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            callIdleSelection = callIdleState.selection;
        }
        if ((i & 2) != 0) {
            callIdleSelection2 = callIdleState.preCallIdle;
        }
        if ((i & 4) != 0) {
            str = callIdleState.preCallIdleAssetId;
        }
        return new CallIdleState(callIdleSelection, callIdleSelection2, str);
    }

    public final CallIdleSelection component1() {
        return this.selection;
    }

    public final CallIdleSelection component2() {
        return this.preCallIdle;
    }

    public final String component3() {
        return this.preCallIdleAssetId;
    }

    public final CallIdleState copy(CallIdleSelection callIdleSelection, CallIdleSelection callIdleSelection2, String str) {
        return new CallIdleState(callIdleSelection, callIdleSelection2, str);
    }

    public final CallIdleSelection getPreCallIdle() {
        return this.preCallIdle;
    }

    public final String getPreCallIdleAssetId() {
        return this.preCallIdleAssetId;
    }

    public final CallIdleSelection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.selection) * 31) + AnonymousClass006.A0D(this.preCallIdle)) * 31) + AnonymousClass005.A0H(this.preCallIdleAssetId);
    }

    public CallIdleState(CallIdleSelection callIdleSelection, CallIdleSelection callIdleSelection2, String str) {
        this.selection = callIdleSelection;
        this.preCallIdle = callIdleSelection2;
        this.preCallIdleAssetId = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallIdleState(CallIdleSelection callIdleSelection, CallIdleSelection callIdleSelection2, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : callIdleSelection, (i & 2) != 0 ? null : callIdleSelection2, (i & 4) != 0 ? null : str);
    }

    public CallIdleState() {
        this(null, null, null);
    }
}
