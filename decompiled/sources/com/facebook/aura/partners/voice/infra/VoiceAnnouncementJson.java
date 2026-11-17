package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VoiceAnnouncementJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean voice_announcement_seen;

    public final class Companion {
        public final C9hr<VoiceAnnouncementJson> serializer() {
            return VoiceAnnouncementJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(VoiceAnnouncementJson voiceAnnouncementJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || voiceAnnouncementJson.voice_announcement_seen != null) {
            c9j5.AAP(voiceAnnouncementJson.voice_announcement_seen, C07839ix.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof VoiceAnnouncementJson) && C7384Etj.areEqual(this.voice_announcement_seen, ((VoiceAnnouncementJson) obj).voice_announcement_seen));
    }

    public static /* synthetic */ VoiceAnnouncementJson copy$default(VoiceAnnouncementJson voiceAnnouncementJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = voiceAnnouncementJson.voice_announcement_seen;
        }
        return new VoiceAnnouncementJson(bool);
    }

    public final Boolean component1() {
        return this.voice_announcement_seen;
    }

    public final VoiceAnnouncementJson copy(Boolean bool) {
        return new VoiceAnnouncementJson(bool);
    }

    public final Boolean getVoice_announcement_seen() {
        return this.voice_announcement_seen;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.voice_announcement_seen);
    }

    public /* synthetic */ VoiceAnnouncementJson(int i, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.voice_announcement_seen = null;
        } else {
            this.voice_announcement_seen = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public VoiceAnnouncementJson(Boolean bool) {
        this.voice_announcement_seen = bool;
    }

    public /* synthetic */ VoiceAnnouncementJson(Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool);
    }

    public VoiceAnnouncementJson() {
        this(null);
    }
}
