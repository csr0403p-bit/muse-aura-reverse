package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VoicePreviewStreamRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String audio_format;
    public final String text;
    public final String voice_id;

    public final class Companion {
        public final C9hr<VoicePreviewStreamRequestJson> serializer() {
            return VoicePreviewStreamRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(VoicePreviewStreamRequestJson voicePreviewStreamRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(voicePreviewStreamRequestJson.voice_id, c9iZ, 0);
        c9j5.AAV(voicePreviewStreamRequestJson.text, c9iZ, 1);
        c9j5.AAV(voicePreviewStreamRequestJson.audio_format, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoicePreviewStreamRequestJson) {
                VoicePreviewStreamRequestJson voicePreviewStreamRequestJson = (VoicePreviewStreamRequestJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, voicePreviewStreamRequestJson.voice_id) || !C7384Etj.areEqual(this.text, voicePreviewStreamRequestJson.text) || !C7384Etj.areEqual(this.audio_format, voicePreviewStreamRequestJson.audio_format)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoicePreviewStreamRequestJson copy$default(VoicePreviewStreamRequestJson voicePreviewStreamRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voicePreviewStreamRequestJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = voicePreviewStreamRequestJson.text;
        }
        if ((i & 4) != 0) {
            str3 = voicePreviewStreamRequestJson.audio_format;
        }
        return voicePreviewStreamRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.audio_format;
    }

    public final String getAudio_format() {
        return this.audio_format;
    }

    public final String getText() {
        return this.text;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.audio_format, AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.voice_id)));
    }

    public VoicePreviewStreamRequestJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.voice_id = str;
        this.text = str2;
        this.audio_format = str3;
    }

    public final VoicePreviewStreamRequestJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new VoicePreviewStreamRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoicePreviewStreamRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(VoicePreviewStreamRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.voice_id = str;
        this.text = str2;
        this.audio_format = str3;
    }
}
