package com.facebook.aura.partners.voice.api;

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
public final class VoiceJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String accent;
    public final String description;
    public final String gender;
    public final String id;
    public final String name;
    public final String tone;

    public final class Companion {
        public final C9hr<VoiceJson> serializer() {
            return VoiceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ VoiceJson copy$default(VoiceJson voiceJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        String str11 = str5;
        String str12 = str6;
        if ((i & 1) != 0) {
            str7 = voiceJson.id;
        }
        if ((i & 2) != 0) {
            str8 = voiceJson.name;
        }
        if ((i & 4) != 0) {
            str9 = voiceJson.description;
        }
        if ((i & 8) != 0) {
            str10 = voiceJson.gender;
        }
        if ((i & 16) != 0) {
            str11 = voiceJson.accent;
        }
        if ((i & 32) != 0) {
            str12 = voiceJson.tone;
        }
        AnonymousClass003.A0u(str7, str8);
        return new VoiceJson(str7, str8, str9, str10, str11, str12);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(VoiceJson voiceJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(voiceJson.id, c9iZ, 0);
        c9j5.AAV(voiceJson.name, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || voiceJson.description != null) {
            c9j5.AAP(voiceJson.description, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || voiceJson.gender != null) {
            c9j5.AAP(voiceJson.gender, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || voiceJson.accent != null) {
            c9j5.AAP(voiceJson.accent, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || voiceJson.tone != null) {
            c9j5.AAP(voiceJson.tone, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceJson) {
                VoiceJson voiceJson = (VoiceJson) obj;
                if (!C7384Etj.areEqual(this.id, voiceJson.id) || !C7384Etj.areEqual(this.name, voiceJson.name) || !C7384Etj.areEqual(this.description, voiceJson.description) || !C7384Etj.areEqual(this.gender, voiceJson.gender) || !C7384Etj.areEqual(this.accent, voiceJson.accent) || !C7384Etj.areEqual(this.tone, voiceJson.tone)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VoiceJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VoiceJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
        if ((i & 8) == 0) {
            this.gender = null;
        } else {
            this.gender = str4;
        }
        if ((i & 16) == 0) {
            this.accent = null;
        } else {
            this.accent = str5;
        }
        if ((i & 32) == 0) {
            this.tone = null;
        } else {
            this.tone = str6;
        }
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.gender;
    }

    public final String component5() {
        return this.accent;
    }

    public final String component6() {
        return this.tone;
    }

    public final String getAccent() {
        return this.accent;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTone() {
        return this.tone;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id)) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0G(this.gender)) * 31) + AnonymousClass006.A0G(this.accent)) * 31) + AnonymousClass005.A0H(this.tone);
    }

    public final VoiceJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0u(str, str2);
        return new VoiceJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public VoiceJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.gender = str4;
        this.accent = str5;
        this.tone = str6;
    }

    public /* synthetic */ VoiceJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
