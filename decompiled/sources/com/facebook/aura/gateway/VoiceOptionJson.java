package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class VoiceOptionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String name;
    public final String voice_id;

    public final class Companion {
        public final C9hr<VoiceOptionJson> serializer() {
            return VoiceOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(VoiceOptionJson voiceOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(voiceOptionJson.voice_id)) {
            c9j5.AAV(voiceOptionJson.voice_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(voiceOptionJson.name)) {
            c9j5.AAV(voiceOptionJson.name, c9iZ, 1);
        }
        if (zAfR || voiceOptionJson.label != null) {
            c9j5.AAP(voiceOptionJson.label, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOptionJson) {
                VoiceOptionJson voiceOptionJson = (VoiceOptionJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, voiceOptionJson.voice_id) || !C7384Etj.areEqual(this.name, voiceOptionJson.name) || !C7384Etj.areEqual(this.label, voiceOptionJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceOptionJson copy$default(VoiceOptionJson voiceOptionJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceOptionJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = voiceOptionJson.name;
        }
        if ((i & 4) != 0) {
            str3 = voiceOptionJson.label;
        }
        return voiceOptionJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.label;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.voice_id)) + AnonymousClass006.A0G(this.label);
    }

    public VoiceOptionJson(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.voice_id = str;
        this.name = str2;
        this.label = str3;
    }

    public final VoiceOptionJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        return new VoiceOptionJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceOptionJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.voice_id = "";
        } else {
            this.voice_id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.label = null;
        } else {
            this.label = str3;
        }
    }

    public /* synthetic */ VoiceOptionJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass006.A0t(i, str3));
    }

    public VoiceOptionJson() {
        this("", "", null);
    }
}
