package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class VoiceAvatarStillSource extends C06G {
    public final String avatarPath;
    public final String url;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceAvatarStillSource) {
                VoiceAvatarStillSource voiceAvatarStillSource = (VoiceAvatarStillSource) obj;
                if (!C7384Etj.areEqual(this.url, voiceAvatarStillSource.url) || !C7384Etj.areEqual(this.avatarPath, voiceAvatarStillSource.avatarPath)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceAvatarStillSource copy$default(VoiceAvatarStillSource voiceAvatarStillSource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceAvatarStillSource.url;
        }
        if ((i & 2) != 0) {
            str2 = voiceAvatarStillSource.avatarPath;
        }
        AnonymousClass003.A0u(str, str2);
        return new VoiceAvatarStillSource(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.avatarPath;
    }

    public final String getAvatarPath() {
        return this.avatarPath;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.avatarPath, AnonymousClass001.A0G(this.url));
    }

    public VoiceAvatarStillSource(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.avatarPath = str2;
    }

    public final VoiceAvatarStillSource copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new VoiceAvatarStillSource(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
