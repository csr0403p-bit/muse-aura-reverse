package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VoiceAnnouncementStatusJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean due;
    public final String reason;

    public final class Companion {
        public final C9hr<VoiceAnnouncementStatusJson> serializer() {
            return VoiceAnnouncementStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(VoiceAnnouncementStatusJson voiceAnnouncementStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || voiceAnnouncementStatusJson.due != null) {
            c9j5.AAP(voiceAnnouncementStatusJson.due, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || voiceAnnouncementStatusJson.reason != null) {
            c9j5.AAP(voiceAnnouncementStatusJson.reason, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceAnnouncementStatusJson) {
                VoiceAnnouncementStatusJson voiceAnnouncementStatusJson = (VoiceAnnouncementStatusJson) obj;
                if (!C7384Etj.areEqual(this.due, voiceAnnouncementStatusJson.due) || !C7384Etj.areEqual(this.reason, voiceAnnouncementStatusJson.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceAnnouncementStatusJson copy$default(VoiceAnnouncementStatusJson voiceAnnouncementStatusJson, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = voiceAnnouncementStatusJson.due;
        }
        if ((i & 2) != 0) {
            str = voiceAnnouncementStatusJson.reason;
        }
        return new VoiceAnnouncementStatusJson(bool, str);
    }

    public final Boolean component1() {
        return this.due;
    }

    public final String component2() {
        return this.reason;
    }

    public final VoiceAnnouncementStatusJson copy(Boolean bool, String str) {
        return new VoiceAnnouncementStatusJson(bool, str);
    }

    public final Boolean getDue() {
        return this.due;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.due) * 31) + AnonymousClass005.A0H(this.reason);
    }

    public VoiceAnnouncementStatusJson(Boolean bool, String str) {
        this.due = bool;
        this.reason = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceAnnouncementStatusJson(int i, Boolean bool, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.due = null;
        } else {
            this.due = bool;
        }
        if ((i & 2) == 0) {
            this.reason = null;
        } else {
            this.reason = str;
        }
    }

    public /* synthetic */ VoiceAnnouncementStatusJson(Boolean bool, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }

    public VoiceAnnouncementStatusJson() {
        this(null, null);
    }
}
