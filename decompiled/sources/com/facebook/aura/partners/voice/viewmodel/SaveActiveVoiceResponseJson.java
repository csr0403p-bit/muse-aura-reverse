package com.facebook.aura.partners.voice.viewmodel;

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
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SaveActiveVoiceResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String live_switch;
    public final String profile_id;
    public final String saved_voice_id;
    public final String voice_id;
    public final String voice_name;

    public final class Companion {
        public final C9hr<SaveActiveVoiceResponseJson> serializer() {
            return SaveActiveVoiceResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel(SaveActiveVoiceResponseJson saveActiveVoiceResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(saveActiveVoiceResponseJson.voice_id, c9iZ, 0);
        c9j5.AAV(saveActiveVoiceResponseJson.voice_name, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || saveActiveVoiceResponseJson.saved_voice_id != null) {
            c9j5.AAP(saveActiveVoiceResponseJson.saved_voice_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || saveActiveVoiceResponseJson.profile_id != null) {
            c9j5.AAP(saveActiveVoiceResponseJson.profile_id, C07779iq.A01, c9iZ, 3);
        }
        c9j5.AAV(saveActiveVoiceResponseJson.live_switch, c9iZ, 4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SaveActiveVoiceResponseJson) {
                SaveActiveVoiceResponseJson saveActiveVoiceResponseJson = (SaveActiveVoiceResponseJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, saveActiveVoiceResponseJson.voice_id) || !C7384Etj.areEqual(this.voice_name, saveActiveVoiceResponseJson.voice_name) || !C7384Etj.areEqual(this.saved_voice_id, saveActiveVoiceResponseJson.saved_voice_id) || !C7384Etj.areEqual(this.profile_id, saveActiveVoiceResponseJson.profile_id) || !C7384Etj.areEqual(this.live_switch, saveActiveVoiceResponseJson.live_switch)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ SaveActiveVoiceResponseJson(int i, String str, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (19 != (i & 19)) {
            C9iI.A00(SaveActiveVoiceResponseJson$$serializer.descriptor, i, 19);
            throw F60.createAndThrow();
        }
        this.voice_id = str;
        this.voice_name = str2;
        if ((i & 4) == 0) {
            this.saved_voice_id = null;
        } else {
            this.saved_voice_id = str3;
        }
        if ((i & 8) == 0) {
            this.profile_id = null;
        } else {
            this.profile_id = str4;
        }
        this.live_switch = str5;
    }

    public static /* synthetic */ SaveActiveVoiceResponseJson copy$default(SaveActiveVoiceResponseJson saveActiveVoiceResponseJson, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveActiveVoiceResponseJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = saveActiveVoiceResponseJson.voice_name;
        }
        if ((i & 4) != 0) {
            str3 = saveActiveVoiceResponseJson.saved_voice_id;
        }
        if ((i & 8) != 0) {
            str4 = saveActiveVoiceResponseJson.profile_id;
        }
        if ((i & 16) != 0) {
            str5 = saveActiveVoiceResponseJson.live_switch;
        }
        return saveActiveVoiceResponseJson.copy(str, str2, str3, str4, str5);
    }

    public final String component1() {
        return this.voice_id;
    }

    public final String component2() {
        return this.voice_name;
    }

    public final String component3() {
        return this.saved_voice_id;
    }

    public final String component4() {
        return this.profile_id;
    }

    public final String component5() {
        return this.live_switch;
    }

    public final String getLive_switch() {
        return this.live_switch;
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

    public final String getVoice_name() {
        return this.voice_name;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.live_switch, (((AnonymousClass005.A0I(this.voice_name, AnonymousClass001.A0G(this.voice_id)) + AnonymousClass006.A0G(this.saved_voice_id)) * 31) + AnonymousClass005.A0H(this.profile_id)) * 31);
    }

    public final SaveActiveVoiceResponseJson copy(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str5, 4);
        return new SaveActiveVoiceResponseJson(str, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public SaveActiveVoiceResponseJson(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass003.A0u(str, str2);
        C7384Etj.A0Y(str5, 4);
        this.voice_id = str;
        this.voice_name = str2;
        this.saved_voice_id = str3;
        this.profile_id = str4;
        this.live_switch = str5;
    }

    public /* synthetic */ SaveActiveVoiceResponseJson(String str, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5);
    }
}
