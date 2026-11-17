package com.facebook.aura.partners.voice.session.intf;

import X.AnonymousClass002;
import com.facebook.aura.partners.voice.gating.VoiceGating;

/* loaded from: classes2.dex */
public final class VoiceCallSupport {
    public static final VoiceCallSupport INSTANCE = new VoiceCallSupport();

    public final boolean isEmbodimentSupported() {
        return AnonymousClass002.A1L(AnonymousClass002.A1Y(VoiceGating.INSTANCE.getEmbodimentOffReason()) ? 1 : 0);
    }

    public final boolean isLiveAvatarUpdateSupported() {
        return AnonymousClass002.A1L(VoiceGating.INSTANCE.isLiveAvatarUpdateEnabled() ? 1 : 0);
    }

    public final boolean isProviderPresent() {
        return true;
    }

    public final boolean isVoiceCallSupported() {
        return AnonymousClass002.A1L(VoiceGating.INSTANCE.isVoiceCallEnabled() ? 1 : 0);
    }

    public final boolean isVoiceDesignSupported() {
        return AnonymousClass002.A1L(VoiceGating.INSTANCE.isAvatarEditMenuChangeVoiceEnabled() ? 1 : 0);
    }
}
