package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
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
public final class PreviewSpeakRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String format;
    public final boolean stream;
    public final String text;
    public final String voice_id;

    public final class Companion {
        public final C9hr<PreviewSpeakRequestJson> serializer() {
            return PreviewSpeakRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(PreviewSpeakRequestJson previewSpeakRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(previewSpeakRequestJson.voice_id, c9iZ, 0);
        c9j5.AAV(previewSpeakRequestJson.text, c9iZ, 1);
        c9j5.AAV(previewSpeakRequestJson.format, c9iZ, 2);
        c9j5.AA7(c9iZ, 3, previewSpeakRequestJson.stream);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PreviewSpeakRequestJson) {
                PreviewSpeakRequestJson previewSpeakRequestJson = (PreviewSpeakRequestJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, previewSpeakRequestJson.voice_id) || !C7384Etj.areEqual(this.text, previewSpeakRequestJson.text) || !C7384Etj.areEqual(this.format, previewSpeakRequestJson.format) || this.stream != previewSpeakRequestJson.stream) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PreviewSpeakRequestJson copy$default(PreviewSpeakRequestJson previewSpeakRequestJson, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewSpeakRequestJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = previewSpeakRequestJson.text;
        }
        if ((i & 4) != 0) {
            str3 = previewSpeakRequestJson.format;
        }
        if ((i & 8) != 0) {
            z = previewSpeakRequestJson.stream;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new PreviewSpeakRequestJson(str, str2, str3, z);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.format;
    }

    public final boolean component4() {
        return this.stream;
    }

    public final String getFormat() {
        return this.format;
    }

    public final boolean getStream() {
        return this.stream;
    }

    public final String getText() {
        return this.text;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.format, AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.voice_id))), this.stream);
    }

    public PreviewSpeakRequestJson(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        this.voice_id = str;
        this.text = str2;
        this.format = str3;
        this.stream = z;
    }

    public final PreviewSpeakRequestJson copy(String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0x(str, str2, str3);
        return new PreviewSpeakRequestJson(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PreviewSpeakRequestJson(int i, String str, String str2, String str3, boolean z, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(PreviewSpeakRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.voice_id = str;
        this.text = str2;
        this.format = str3;
        this.stream = z;
    }
}
