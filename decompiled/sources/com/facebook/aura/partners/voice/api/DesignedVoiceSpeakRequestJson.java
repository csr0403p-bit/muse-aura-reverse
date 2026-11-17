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
public final class DesignedVoiceSpeakRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String engine;
    public final String format;
    public final String text;
    public final String voice_id;

    public final class Companion {
        public final C9hr<DesignedVoiceSpeakRequestJson> serializer() {
            return DesignedVoiceSpeakRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(DesignedVoiceSpeakRequestJson designedVoiceSpeakRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(designedVoiceSpeakRequestJson.text, c9iZ, 0);
        c9j5.AAV(designedVoiceSpeakRequestJson.voice_id, c9iZ, 1);
        c9j5.AAV(designedVoiceSpeakRequestJson.format, c9iZ, 2);
        c9j5.AAV(designedVoiceSpeakRequestJson.engine, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DesignedVoiceSpeakRequestJson) {
                DesignedVoiceSpeakRequestJson designedVoiceSpeakRequestJson = (DesignedVoiceSpeakRequestJson) obj;
                if (!C7384Etj.areEqual(this.text, designedVoiceSpeakRequestJson.text) || !C7384Etj.areEqual(this.voice_id, designedVoiceSpeakRequestJson.voice_id) || !C7384Etj.areEqual(this.format, designedVoiceSpeakRequestJson.format) || !C7384Etj.areEqual(this.engine, designedVoiceSpeakRequestJson.engine)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DesignedVoiceSpeakRequestJson copy$default(DesignedVoiceSpeakRequestJson designedVoiceSpeakRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = designedVoiceSpeakRequestJson.text;
        }
        if ((i & 2) != 0) {
            str2 = designedVoiceSpeakRequestJson.voice_id;
        }
        if ((i & 4) != 0) {
            str3 = designedVoiceSpeakRequestJson.format;
        }
        if ((i & 8) != 0) {
            str4 = designedVoiceSpeakRequestJson.engine;
        }
        return designedVoiceSpeakRequestJson.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.voice_id;
    }

    public final String component3() {
        return this.format;
    }

    public final String component4() {
        return this.engine;
    }

    public final String getEngine() {
        return this.engine;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getText() {
        return this.text;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.engine, AnonymousClass005.A0I(this.format, AnonymousClass005.A0I(this.voice_id, AnonymousClass001.A0G(this.text))));
    }

    public DesignedVoiceSpeakRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.text = str;
        this.voice_id = str2;
        this.format = str3;
        this.engine = str4;
    }

    public final DesignedVoiceSpeakRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        return new DesignedVoiceSpeakRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DesignedVoiceSpeakRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(DesignedVoiceSpeakRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.text = str;
        this.voice_id = str2;
        this.format = str3;
        this.engine = str4;
    }
}
