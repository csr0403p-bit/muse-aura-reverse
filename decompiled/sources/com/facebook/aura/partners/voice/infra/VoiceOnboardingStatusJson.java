package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class VoiceOnboardingStatusJson extends C06G {
    public static final Companion Companion = new Companion();
    public final VoiceOnboardingCurrentVoiceJson current_voice;
    public final String projection_status;
    public final String resume_phase;
    public final long revision;
    public final String state;

    public final class Companion {
        public final C9hr<VoiceOnboardingStatusJson> serializer() {
            return VoiceOnboardingStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoiceOnboardingStatusJson(String str, long j, VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.state = str;
        this.revision = j;
        this.current_voice = voiceOnboardingCurrentVoiceJson;
        this.resume_phase = str2;
        this.projection_status = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(VoiceOnboardingStatusJson voiceOnboardingStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(voiceOnboardingStatusJson.state)) {
            c9j5.AAV(voiceOnboardingStatusJson.state, c9iZ, 0);
        }
        if (zAfR || voiceOnboardingStatusJson.revision != 0) {
            c9j5.AAN(c9iZ, 1, voiceOnboardingStatusJson.revision);
        }
        if (zAfR || voiceOnboardingStatusJson.current_voice != null) {
            c9j5.AAP(voiceOnboardingStatusJson.current_voice, VoiceOnboardingCurrentVoiceJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || voiceOnboardingStatusJson.resume_phase != null) {
            c9j5.AAP(voiceOnboardingStatusJson.resume_phase, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || voiceOnboardingStatusJson.projection_status != null) {
            c9j5.AAP(voiceOnboardingStatusJson.projection_status, C07779iq.A01, c9iZ, 4);
        }
    }

    public final VoiceOnboardingStatusJson copy(String str, long j, VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new VoiceOnboardingStatusJson(str, j, voiceOnboardingCurrentVoiceJson, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOnboardingStatusJson) {
                VoiceOnboardingStatusJson voiceOnboardingStatusJson = (VoiceOnboardingStatusJson) obj;
                if (!C7384Etj.areEqual(this.state, voiceOnboardingStatusJson.state) || this.revision != voiceOnboardingStatusJson.revision || !C7384Etj.areEqual(this.current_voice, voiceOnboardingStatusJson.current_voice) || !C7384Etj.areEqual(this.resume_phase, voiceOnboardingStatusJson.resume_phase) || !C7384Etj.areEqual(this.projection_status, voiceOnboardingStatusJson.projection_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceOnboardingStatusJson copy$default(VoiceOnboardingStatusJson voiceOnboardingStatusJson, String str, long j, VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceOnboardingStatusJson.state;
        }
        if ((i & 2) != 0) {
            j = voiceOnboardingStatusJson.revision;
        }
        if ((i & 4) != 0) {
            voiceOnboardingCurrentVoiceJson = voiceOnboardingStatusJson.current_voice;
        }
        if ((i & 8) != 0) {
            str2 = voiceOnboardingStatusJson.resume_phase;
        }
        if ((i & 16) != 0) {
            str3 = voiceOnboardingStatusJson.projection_status;
        }
        return voiceOnboardingStatusJson.copy(str, j, voiceOnboardingCurrentVoiceJson, str2, str3);
    }

    public final String component1() {
        return this.state;
    }

    public final long component2() {
        return this.revision;
    }

    public final VoiceOnboardingCurrentVoiceJson component3() {
        return this.current_voice;
    }

    public final String component4() {
        return this.resume_phase;
    }

    public final String component5() {
        return this.projection_status;
    }

    public final VoiceOnboardingCurrentVoiceJson getCurrent_voice() {
        return this.current_voice;
    }

    public final String getProjection_status() {
        return this.projection_status;
    }

    public final String getResume_phase() {
        return this.resume_phase;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return ((((C60R.A00(this.revision, AnonymousClass001.A0G(this.state)) + AnonymousClass006.A0D(this.current_voice)) * 31) + AnonymousClass006.A0G(this.resume_phase)) * 31) + AnonymousClass005.A0H(this.projection_status);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceOnboardingStatusJson(String str, long j, VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, String str2, String str3, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : voiceOnboardingCurrentVoiceJson, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public /* synthetic */ VoiceOnboardingStatusJson(int i, String str, long j, VoiceOnboardingCurrentVoiceJson voiceOnboardingCurrentVoiceJson, String str2, String str3, C2hx c2hx) {
        this.state = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.revision = 0L;
        } else {
            this.revision = j;
        }
        if ((i & 4) == 0) {
            this.current_voice = null;
        } else {
            this.current_voice = voiceOnboardingCurrentVoiceJson;
        }
        if ((i & 8) == 0) {
            this.resume_phase = null;
        } else {
            this.resume_phase = str2;
        }
        if ((i & 16) == 0) {
            this.projection_status = null;
        } else {
            this.projection_status = str3;
        }
    }

    public VoiceOnboardingStatusJson() {
        this("", 0L, null, null, null);
    }
}
