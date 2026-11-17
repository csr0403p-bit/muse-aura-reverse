package com.facebook.aura.partners.voice.screen;

import X.BFM;
import X.C1BO;
import com.facebook.aura.model.AvatarStatusVideos;

/* loaded from: classes2.dex */
public abstract class VoiceEmbodimentStatusVideosKt {
    public static final AvatarStatusVideos rememberVoiceEmbodimentStatusVideos(BFM bfm, int i) {
        return (AvatarStatusVideos) C1BO.A07(bfm, VoiceCallSurfacesKt.rememberVoiceCallViewModel(bfm, 0).callStatusVideos);
    }
}
