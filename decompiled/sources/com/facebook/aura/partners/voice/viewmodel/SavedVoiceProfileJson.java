package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SavedVoiceProfileJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final String preview_text;
    public final String profile_id;

    public final class Companion {
        public final C9hr<SavedVoiceProfileJson> serializer() {
            return SavedVoiceProfileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel(SavedVoiceProfileJson savedVoiceProfileJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(savedVoiceProfileJson.profile_id)) {
            c9j5.AAV(savedVoiceProfileJson.profile_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(savedVoiceProfileJson.label)) {
            c9j5.AAV(savedVoiceProfileJson.label, c9iZ, 1);
        }
        if (zAfR || !"".equals(savedVoiceProfileJson.preview_text)) {
            c9j5.AAV(savedVoiceProfileJson.preview_text, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedVoiceProfileJson) {
                SavedVoiceProfileJson savedVoiceProfileJson = (SavedVoiceProfileJson) obj;
                if (!C7384Etj.areEqual(this.profile_id, savedVoiceProfileJson.profile_id) || !C7384Etj.areEqual(this.label, savedVoiceProfileJson.label) || !C7384Etj.areEqual(this.preview_text, savedVoiceProfileJson.preview_text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedVoiceProfileJson copy$default(SavedVoiceProfileJson savedVoiceProfileJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedVoiceProfileJson.profile_id;
        }
        if ((i & 2) != 0) {
            str2 = savedVoiceProfileJson.label;
        }
        if ((i & 4) != 0) {
            str3 = savedVoiceProfileJson.preview_text;
        }
        return savedVoiceProfileJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.profile_id;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.preview_text;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPreview_text() {
        return this.preview_text;
    }

    public final String getProfile_id() {
        return this.profile_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.preview_text, AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.profile_id)));
    }

    public SavedVoiceProfileJson(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.profile_id = str;
        this.label = str2;
        this.preview_text = str3;
    }

    public final SavedVoiceProfileJson copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new SavedVoiceProfileJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SavedVoiceProfileJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.profile_id = "";
        } else {
            this.profile_id = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.preview_text = "";
        } else {
            this.preview_text = str3;
        }
    }

    public /* synthetic */ SavedVoiceProfileJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public SavedVoiceProfileJson() {
        this("", "", "");
    }
}
