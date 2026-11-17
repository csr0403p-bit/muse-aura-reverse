package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.model.AvatarCallIdleVideo;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public final class HatchReadyCallIdle extends C06G {
    public final HatchAvatarIdlePoster poster;
    public final AvatarCallIdleVideo video;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchReadyCallIdle) {
                HatchReadyCallIdle hatchReadyCallIdle = (HatchReadyCallIdle) obj;
                if (!C7384Etj.areEqual(this.video, hatchReadyCallIdle.video) || !C7384Etj.areEqual(this.poster, hatchReadyCallIdle.poster)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchReadyCallIdle copy$default(HatchReadyCallIdle hatchReadyCallIdle, AvatarCallIdleVideo avatarCallIdleVideo, HatchAvatarIdlePoster hatchAvatarIdlePoster, int i, Object obj) {
        if ((i & 1) != 0) {
            avatarCallIdleVideo = hatchReadyCallIdle.video;
        }
        if ((i & 2) != 0) {
            hatchAvatarIdlePoster = hatchReadyCallIdle.poster;
        }
        AnonymousClass003.A0u(avatarCallIdleVideo, hatchAvatarIdlePoster);
        return new HatchReadyCallIdle(avatarCallIdleVideo, hatchAvatarIdlePoster);
    }

    public final AvatarCallIdleVideo component1() {
        return this.video;
    }

    public final HatchAvatarIdlePoster component2() {
        return this.poster;
    }

    public final VoiceEmbodimentMedia.ReferenceFraming getFraming() {
        AvatarCallIdleVideo avatarCallIdleVideo = this.video;
        HatchVideoCrop hatchVideoCropResolveHatchVoiceVideoCrop = VideoConfigJsonKt.resolveHatchVoiceVideoCrop(avatarCallIdleVideo.cropX, avatarCallIdleVideo.cropY, avatarCallIdleVideo.cropSize, false);
        return new VoiceEmbodimentMedia.ReferenceFraming(hatchVideoCropResolveHatchVoiceVideoCrop.top / 768.0f, hatchVideoCropResolveHatchVoiceVideoCrop.bottom / 768.0f);
    }

    public final HatchAvatarIdlePoster getPoster() {
        return this.poster;
    }

    public final AvatarCallIdleVideo getVideo() {
        return this.video;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.poster, AnonymousClass005.A0E(this.video));
    }

    public HatchReadyCallIdle(AvatarCallIdleVideo avatarCallIdleVideo, HatchAvatarIdlePoster hatchAvatarIdlePoster) {
        AnonymousClass003.A0u(avatarCallIdleVideo, hatchAvatarIdlePoster);
        this.video = avatarCallIdleVideo;
        this.poster = hatchAvatarIdlePoster;
    }

    public final HatchReadyCallIdle copy(AvatarCallIdleVideo avatarCallIdleVideo, HatchAvatarIdlePoster hatchAvatarIdlePoster) {
        AnonymousClass003.A0u(avatarCallIdleVideo, hatchAvatarIdlePoster);
        return new HatchReadyCallIdle(avatarCallIdleVideo, hatchAvatarIdlePoster);
    }

    public String toString() {
        return super.toString();
    }
}
