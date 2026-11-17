package com.facebook.aura.partners.voice.api;

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
/* loaded from: classes2.dex */
public final class VoicePreviewStreamFrameJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String audio;
    public final String type;

    public final class Companion {
        public final C9hr<VoicePreviewStreamFrameJson> serializer() {
            return VoicePreviewStreamFrameJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(VoicePreviewStreamFrameJson voicePreviewStreamFrameJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || voicePreviewStreamFrameJson.type != null) {
            c9j5.AAP(voicePreviewStreamFrameJson.type, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || voicePreviewStreamFrameJson.audio != null) {
            c9j5.AAP(voicePreviewStreamFrameJson.audio, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePreviewStreamFrameJson) {
                VoicePreviewStreamFrameJson voicePreviewStreamFrameJson = (VoicePreviewStreamFrameJson) obj;
                if (!C7384Etj.areEqual(this.type, voicePreviewStreamFrameJson.type) || !C7384Etj.areEqual(this.audio, voicePreviewStreamFrameJson.audio)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePreviewStreamFrameJson copy$default(VoicePreviewStreamFrameJson voicePreviewStreamFrameJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voicePreviewStreamFrameJson.type;
        }
        if ((i & 2) != 0) {
            str2 = voicePreviewStreamFrameJson.audio;
        }
        return new VoicePreviewStreamFrameJson(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.audio;
    }

    public final VoicePreviewStreamFrameJson copy(String str, String str2) {
        return new VoicePreviewStreamFrameJson(str, str2);
    }

    public final String getAudio() {
        return this.audio;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.type) * 31) + AnonymousClass005.A0H(this.audio);
    }

    public VoicePreviewStreamFrameJson(String str, String str2) {
        this.type = str;
        this.audio = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoicePreviewStreamFrameJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.audio = null;
        } else {
            this.audio = str2;
        }
    }

    public /* synthetic */ VoicePreviewStreamFrameJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public VoicePreviewStreamFrameJson() {
        this(null, null);
    }
}
