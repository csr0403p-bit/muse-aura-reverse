package com.facebook.aura.partners.voice.screen;

import X.AWA;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFM;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C78N;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster;
import com.facebook.aura.partners.voice.avatar.HatchAvatarReference;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.partners.voice.viewmodel.CallIdleSelection;

/* loaded from: classes2.dex */
public abstract class HatchPreparedAvatarIdleMediaKt {
    public static final AvatarTakeoverIdleMedia rememberPreparedAvatarIdleMedia(BFM bfm, int i) {
        C1BO c1boA02 = C2CK.A02(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).callIdleSelection);
        boolean zA65 = bfm.A65(c1boA02.getValue());
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            CallIdleSelection callIdleSelection = (CallIdleSelection) c1boA02.getValue();
            objAaT = callIdleSelection != null ? idleMedia(callIdleSelection) : null;
            bfm.Ai0(objAaT);
        }
        return (AvatarTakeoverIdleMedia) objAaT;
    }

    public static final AvatarTakeoverIdleMedia idleMedia(CallIdleSelection callIdleSelection) {
        String str;
        AWA awa;
        boolean z;
        if (callIdleSelection instanceof CallIdleSelection.Ready) {
            return idleMedia(((CallIdleSelection.Ready) callIdleSelection).idle);
        }
        if (callIdleSelection instanceof CallIdleSelection.Reference) {
            CallIdleSelection.Reference reference = (CallIdleSelection.Reference) callIdleSelection;
            return idleMedia(reference.avatar, reference.poster);
        }
        if (!(callIdleSelection instanceof CallIdleSelection.Live)) {
            throw C3cG.A0q();
        }
        CallIdleSelection.Live live = (CallIdleSelection.Live) callIdleSelection;
        String str2 = live.videoUri;
        HatchAvatarIdlePoster hatchAvatarIdlePoster = live.poster;
        if (hatchAvatarIdlePoster == null || (str = hatchAvatarIdlePoster.imageUri) == null) {
            str = live.stillUri;
        }
        float f = live.framing.cropTopFraction;
        if (hatchAvatarIdlePoster != null) {
            awa = new AWA(AnonymousClass007.A0A(hatchAvatarIdlePoster.width, hatchAvatarIdlePoster.height));
            z = true;
        } else {
            awa = null;
            z = false;
        }
        return new AvatarTakeoverIdleMedia(str2, str, f, awa, z, true);
    }

    public static final AvatarTakeoverIdleMedia idleMedia(PreparedHatchAvatar preparedHatchAvatar, HatchAvatarIdlePoster hatchAvatarIdlePoster) {
        String str;
        AWA awa;
        boolean z;
        HatchAvatarReference hatchAvatarReference = preparedHatchAvatar.selection.reference;
        HatchVideoCrop hatchVideoCropResolveHatchVoiceVideoCrop = VideoConfigJsonKt.resolveHatchVoiceVideoCrop(hatchAvatarReference.cropX, hatchAvatarReference.cropY, hatchAvatarReference.cropSize, false);
        String str2 = hatchAvatarReference.idleVideoUri;
        if (hatchAvatarIdlePoster == null || (str = hatchAvatarIdlePoster.imageUri) == null) {
            str = hatchAvatarReference.imageUri;
        }
        float f = hatchVideoCropResolveHatchVoiceVideoCrop.top / 768.0f;
        if (hatchAvatarIdlePoster != null) {
            awa = new AWA(AnonymousClass005.A0J(hatchAvatarIdlePoster.width, hatchAvatarIdlePoster.height));
            z = true;
        } else {
            awa = null;
            z = false;
        }
        return new AvatarTakeoverIdleMedia(str2, str, f, awa, z, true);
    }

    public static final AvatarTakeoverIdleMedia idleMedia(HatchReadyCallIdle hatchReadyCallIdle) {
        String str = hatchReadyCallIdle.video.url;
        String str2 = hatchReadyCallIdle.poster.imageUri;
        float f = hatchReadyCallIdle.getFraming().cropTopFraction;
        HatchAvatarIdlePoster hatchAvatarIdlePoster = hatchReadyCallIdle.poster;
        return new AvatarTakeoverIdleMedia(str, str2, f, new AWA(AnonymousClass007.A0A(hatchAvatarIdlePoster.width, hatchAvatarIdlePoster.height)), true, true);
    }
}
