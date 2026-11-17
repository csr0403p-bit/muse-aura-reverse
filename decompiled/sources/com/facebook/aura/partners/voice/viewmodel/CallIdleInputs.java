package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdleKey;
import com.facebook.aura.partners.voice.avatar.HatchAvatarIdlePoster;
import com.facebook.aura.partners.voice.avatar.HatchReadyCallIdle;
import com.facebook.aura.partners.voice.avatar.PreparedHatchAvatar;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import java.util.Map;

/* loaded from: classes2.dex */
public final class CallIdleInputs extends C06G {
    public final boolean active;
    public final boolean dark;
    public final VoiceEmbodimentMedia media;
    public final Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> posters;
    public final PreparedHatchAvatar prepared;
    public final HatchReadyCallIdle ready;

    public CallIdleInputs(PreparedHatchAvatar preparedHatchAvatar, HatchReadyCallIdle hatchReadyCallIdle, Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> map, boolean z, VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z2) {
        C7384Etj.A0Y(map, 2);
        this.prepared = preparedHatchAvatar;
        this.ready = hatchReadyCallIdle;
        this.posters = map;
        this.active = z;
        this.media = voiceEmbodimentMedia;
        this.dark = z2;
    }

    public final CallIdleInputs copy(PreparedHatchAvatar preparedHatchAvatar, HatchReadyCallIdle hatchReadyCallIdle, Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> map, boolean z, VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z2) {
        C7384Etj.A0Y(map, 2);
        return new CallIdleInputs(preparedHatchAvatar, hatchReadyCallIdle, map, z, voiceEmbodimentMedia, z2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallIdleInputs) {
                CallIdleInputs callIdleInputs = (CallIdleInputs) obj;
                if (!C7384Etj.areEqual(this.prepared, callIdleInputs.prepared) || !C7384Etj.areEqual(this.ready, callIdleInputs.ready) || !C7384Etj.areEqual(this.posters, callIdleInputs.posters) || this.active != callIdleInputs.active || !C7384Etj.areEqual(this.media, callIdleInputs.media) || this.dark != callIdleInputs.dark) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallIdleInputs copy$default(CallIdleInputs callIdleInputs, PreparedHatchAvatar preparedHatchAvatar, HatchReadyCallIdle hatchReadyCallIdle, Map map, boolean z, VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            preparedHatchAvatar = callIdleInputs.prepared;
        }
        if ((i & 2) != 0) {
            hatchReadyCallIdle = callIdleInputs.ready;
        }
        if ((i & 4) != 0) {
            map = callIdleInputs.posters;
        }
        if ((i & 8) != 0) {
            z = callIdleInputs.active;
        }
        if ((i & 16) != 0) {
            voiceEmbodimentMedia = callIdleInputs.media;
        }
        if ((i & 32) != 0) {
            z2 = callIdleInputs.dark;
        }
        return callIdleInputs.copy(preparedHatchAvatar, hatchReadyCallIdle, map, z, voiceEmbodimentMedia, z2);
    }

    public final PreparedHatchAvatar component1() {
        return this.prepared;
    }

    public final HatchReadyCallIdle component2() {
        return this.ready;
    }

    public final Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> component3() {
        return this.posters;
    }

    public final boolean component4() {
        return this.active;
    }

    public final VoiceEmbodimentMedia component5() {
        return this.media;
    }

    public final boolean component6() {
        return this.dark;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final boolean getDark() {
        return this.dark;
    }

    public final VoiceEmbodimentMedia getMedia() {
        return this.media;
    }

    public final Map<HatchAvatarIdleKey, HatchAvatarIdlePoster> getPosters() {
        return this.posters;
    }

    public final PreparedHatchAvatar getPrepared() {
        return this.prepared;
    }

    public final HatchReadyCallIdle getReady() {
        return this.ready;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(AnonymousClass005.A0F(this.posters, ((AnonymousClass006.A0D(this.prepared) * 31) + AnonymousClass006.A0D(this.ready)) * 31), this.active) + C3cH.A02(this.media)) * 31, this.dark);
    }

    public String toString() {
        return super.toString();
    }
}
