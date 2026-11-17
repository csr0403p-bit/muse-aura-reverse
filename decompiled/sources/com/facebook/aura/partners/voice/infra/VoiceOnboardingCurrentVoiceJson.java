package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class VoiceOnboardingCurrentVoiceJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String voice_id;
    public final String voice_name;

    public final class Companion {
        public final C9hr<VoiceOnboardingCurrentVoiceJson> serializer() {
            return VoiceOnboardingCurrentVoiceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || voiceOnboardingCurrentVoiceJson.voice_id != null) {
            c9j5.AAP(voiceOnboardingCurrentVoiceJson.voice_id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || voiceOnboardingCurrentVoiceJson.voice_name != null) {
            c9j5.AAP(voiceOnboardingCurrentVoiceJson.voice_name, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOnboardingCurrentVoiceJson) {
                VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson = (VoiceOnboardingCurrentVoiceJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, voiceOnboardingCurrentVoiceJson.voice_id) || !C7384Etj.areEqual(this.voice_name, voiceOnboardingCurrentVoiceJson.voice_name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceOnboardingCurrentVoiceJson copy$default(VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceOnboardingCurrentVoiceJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = voiceOnboardingCurrentVoiceJson.voice_name;
        }
        return new VoiceOnboardingCurrentVoiceJson(str, str2);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.voice_name;
    }

    public final VoiceOnboardingCurrentVoiceJson copy(String str, String str2) {
        return new VoiceOnboardingCurrentVoiceJson(str, str2);
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public final String getVoice_name() {
        return this.voice_name;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.voice_id) * 31) + AnonymousClass005.A0H(this.voice_name);
    }

    public VoiceOnboardingCurrentVoiceJson(String str, String str2) {
        this.voice_id = str;
        this.voice_name = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceOnboardingCurrentVoiceJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.voice_id = null;
        } else {
            this.voice_id = str;
        }
        if ((i & 2) == 0) {
            this.voice_name = null;
        } else {
            this.voice_name = str2;
        }
    }

    public /* synthetic */ VoiceOnboardingCurrentVoiceJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public VoiceOnboardingCurrentVoiceJson() {
        this(null, null);
    }
}
