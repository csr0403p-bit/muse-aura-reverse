package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SavedVoiceJson extends C06G {
    public static final int $stable = 8;
    public final List<SavedVoiceProfileJson> profiles;
    public final String saved_voice_id;
    public final int version;
    public final String voice_id;
    public final String voice_name;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, AbstractC5321DgF.A02(C79.A01, SavedVoiceJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<SavedVoiceJson> serializer() {
            return SavedVoiceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SavedVoiceJson copy(int i, String str, String str2, String str3, List<SavedVoiceProfileJson> list) {
        AnonymousClass005.A11(str, str2, str3, 1);
        C7384Etj.A0Y(list, 4);
        return new SavedVoiceJson(i, str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedVoiceJson) {
                SavedVoiceJson savedVoiceJson = (SavedVoiceJson) obj;
                if (this.version != savedVoiceJson.version || !C7384Etj.areEqual(this.saved_voice_id, savedVoiceJson.saved_voice_id) || !C7384Etj.areEqual(this.voice_id, savedVoiceJson.voice_id) || !C7384Etj.areEqual(this.voice_name, savedVoiceJson.voice_name) || !C7384Etj.areEqual(this.profiles, savedVoiceJson.profiles)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavedVoiceJson copy$default(SavedVoiceJson savedVoiceJson, int i, String str, String str2, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = savedVoiceJson.version;
        }
        if ((i2 & 2) != 0) {
            str = savedVoiceJson.saved_voice_id;
        }
        if ((i2 & 4) != 0) {
            str2 = savedVoiceJson.voice_id;
        }
        if ((i2 & 8) != 0) {
            str3 = savedVoiceJson.voice_name;
        }
        if ((i2 & 16) != 0) {
            list = savedVoiceJson.profiles;
        }
        return savedVoiceJson.copy(i, str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel(SavedVoiceJson savedVoiceJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || savedVoiceJson.version != 0) {
            c9j5.AAK(c9iZ, 0, savedVoiceJson.version);
        }
        if (zAfR || !"".equals(savedVoiceJson.saved_voice_id)) {
            c9j5.AAV(savedVoiceJson.saved_voice_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(savedVoiceJson.voice_id)) {
            c9j5.AAV(savedVoiceJson.voice_id, c9iZ, 2);
        }
        if (zAfR || !"".equals(savedVoiceJson.voice_name)) {
            c9j5.AAV(savedVoiceJson.voice_name, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(savedVoiceJson.profiles)) {
            c9j5.AAQ(savedVoiceJson.profiles, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.saved_voice_id;
    }

    public final String component3() {
        return this.voice_id;
    }

    public final String component4() {
        return this.voice_name;
    }

    public final List<SavedVoiceProfileJson> component5() {
        return this.profiles;
    }

    public final List<SavedVoiceProfileJson> getProfiles() {
        return this.profiles;
    }

    public final String getSaved_voice_id() {
        return this.saved_voice_id;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getVoice_id() {
        return this.voice_id;
    }

    public final String getVoice_name() {
        return this.voice_name;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.profiles, AnonymousClass005.A0I(this.voice_name, AnonymousClass005.A0I(this.voice_id, AnonymousClass005.A0I(this.saved_voice_id, this.version * 31))));
    }

    public /* synthetic */ SavedVoiceJson(int i, int i2, String str, String str2, String str3, List list, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.saved_voice_id = "";
        } else {
            this.saved_voice_id = str;
        }
        if ((i & 4) == 0) {
            this.voice_id = "";
        } else {
            this.voice_id = str2;
        }
        if ((i & 8) == 0) {
            this.voice_name = "";
        } else {
            this.voice_name = str3;
        }
        if ((i & 16) == 0) {
            this.profiles = C0881AGi.A00;
        } else {
            this.profiles = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SavedVoiceJson(int i, String str, String str2, String str3, List<SavedVoiceProfileJson> list) {
        AnonymousClass005.A11(str, str2, str3, 1);
        C7384Etj.A0Y(list, 4);
        this.version = i;
        this.saved_voice_id = str;
        this.voice_id = str2;
        this.voice_name = str3;
        this.profiles = list;
    }

    public /* synthetic */ SavedVoiceJson(int i, String str, String str2, String str3, List list, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? C0881AGi.A00 : list);
    }

    public SavedVoiceJson() {
        this(0, "", "", "", C0881AGi.A00);
    }
}
