package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SaveActiveVoiceRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String profile_id;
    public final String saved_voice_id;
    public final String voice_id;

    public final class Companion {
        public final C9hr<SaveActiveVoiceRequestJson> serializer() {
            return SaveActiveVoiceRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SaveActiveVoiceRequestJson) {
                SaveActiveVoiceRequestJson saveActiveVoiceRequestJson = (SaveActiveVoiceRequestJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, saveActiveVoiceRequestJson.voice_id) || !C7384Etj.areEqual(this.saved_voice_id, saveActiveVoiceRequestJson.saved_voice_id) || !C7384Etj.areEqual(this.profile_id, saveActiveVoiceRequestJson.profile_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SaveActiveVoiceRequestJson copy$default(SaveActiveVoiceRequestJson saveActiveVoiceRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveActiveVoiceRequestJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = saveActiveVoiceRequestJson.saved_voice_id;
        }
        if ((i & 4) != 0) {
            str3 = saveActiveVoiceRequestJson.profile_id;
        }
        return new SaveActiveVoiceRequestJson(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel(SaveActiveVoiceRequestJson saveActiveVoiceRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        C07779iq c07779iq = C07779iq.A01;
        c9j5.AAP(saveActiveVoiceRequestJson.voice_id, c07779iq, c9iZ, 0);
        c9j5.AAP(saveActiveVoiceRequestJson.saved_voice_id, c07779iq, c9iZ, 1);
        c9j5.AAP(saveActiveVoiceRequestJson.profile_id, c07779iq, c9iZ, 2);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.saved_voice_id;
    }

    public final String component3() {
        return this.profile_id;
    }

    public final SaveActiveVoiceRequestJson copy(String str, String str2, String str3) {
        return new SaveActiveVoiceRequestJson(str, str2, str3);
    }

    public final String getProfile_id() {
        return this.profile_id;
    }

    public final String getSaved_voice_id() {
        return this.saved_voice_id;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.voice_id) * 31) + AnonymousClass006.A0G(this.saved_voice_id)) * 31) + AnonymousClass005.A0H(this.profile_id);
    }

    public SaveActiveVoiceRequestJson(String str, String str2, String str3) {
        this.voice_id = str;
        this.saved_voice_id = str2;
        this.profile_id = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SaveActiveVoiceRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(SaveActiveVoiceRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.voice_id = str;
        this.saved_voice_id = str2;
        this.profile_id = str3;
    }
}
