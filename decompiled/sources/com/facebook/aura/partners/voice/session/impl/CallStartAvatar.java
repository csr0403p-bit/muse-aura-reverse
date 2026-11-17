package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass003;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public final class CallStartAvatar {
    public final String avatarStem;
    public final String callId;
    public final HatchAiIdentityHandler.AvatarImageKey idleAvatarKey;
    public final VoiceEmbodimentMedia.LiveRtc media;
    public final HatchVoiceVideoConfigStore.Snapshot pinned;
    public final String stillPath;

    public final String getAvatarStem() {
        return this.avatarStem;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final HatchAiIdentityHandler.AvatarImageKey getIdleAvatarKey() {
        return this.idleAvatarKey;
    }

    public final VoiceEmbodimentMedia.LiveRtc getMedia() {
        return this.media;
    }

    public final HatchVoiceVideoConfigStore.Snapshot getPinned() {
        return this.pinned;
    }

    public final String getStillPath() {
        return this.stillPath;
    }

    public CallStartAvatar(String str, String str2, VoiceEmbodimentMedia.LiveRtc liveRtc, HatchVoiceVideoConfigStore.Snapshot snapshot, HatchAiIdentityHandler.AvatarImageKey avatarImageKey, String str3) {
        AnonymousClass003.A0v(str, liveRtc);
        this.callId = str;
        this.avatarStem = str2;
        this.media = liveRtc;
        this.pinned = snapshot;
        this.idleAvatarKey = avatarImageKey;
        this.stillPath = str3;
    }
}
