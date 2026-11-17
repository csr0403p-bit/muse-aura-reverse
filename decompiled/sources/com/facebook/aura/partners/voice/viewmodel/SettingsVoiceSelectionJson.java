package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SettingsVoiceSelectionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Boolean intro_completed;
    public final String profile_id;
    public final String saved_voice_id;
    public final String voice_id;
    public final String voice_name;

    public final class Companion {
        public final C9hr<SettingsVoiceSelectionJson> serializer() {
            return SettingsVoiceSelectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel(SettingsVoiceSelectionJson settingsVoiceSelectionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(settingsVoiceSelectionJson.voice_id)) {
            c9j5.AAV(settingsVoiceSelectionJson.voice_id, c9iZ, 0);
        }
        if (zAfR || settingsVoiceSelectionJson.saved_voice_id != null) {
            c9j5.AAP(settingsVoiceSelectionJson.saved_voice_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || settingsVoiceSelectionJson.profile_id != null) {
            c9j5.AAP(settingsVoiceSelectionJson.profile_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || settingsVoiceSelectionJson.voice_name != null) {
            c9j5.AAP(settingsVoiceSelectionJson.voice_name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || settingsVoiceSelectionJson.intro_completed != null) {
            c9j5.AAP(settingsVoiceSelectionJson.intro_completed, C07839ix.A00, c9iZ, 4);
        }
    }

    public final SettingsVoiceSelectionJson copy(String str, String str2, String str3, String str4, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        return new SettingsVoiceSelectionJson(str, str2, str3, str4, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SettingsVoiceSelectionJson) {
                SettingsVoiceSelectionJson settingsVoiceSelectionJson = (SettingsVoiceSelectionJson) obj;
                if (!C7384Etj.areEqual(this.voice_id, settingsVoiceSelectionJson.voice_id) || !C7384Etj.areEqual(this.saved_voice_id, settingsVoiceSelectionJson.saved_voice_id) || !C7384Etj.areEqual(this.profile_id, settingsVoiceSelectionJson.profile_id) || !C7384Etj.areEqual(this.voice_name, settingsVoiceSelectionJson.voice_name) || !C7384Etj.areEqual(this.intro_completed, settingsVoiceSelectionJson.intro_completed)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SettingsVoiceSelectionJson copy$default(SettingsVoiceSelectionJson settingsVoiceSelectionJson, String str, String str2, String str3, String str4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = settingsVoiceSelectionJson.voice_id;
        }
        if ((i & 2) != 0) {
            str2 = settingsVoiceSelectionJson.saved_voice_id;
        }
        if ((i & 4) != 0) {
            str3 = settingsVoiceSelectionJson.profile_id;
        }
        if ((i & 8) != 0) {
            str4 = settingsVoiceSelectionJson.voice_name;
        }
        if ((i & 16) != 0) {
            bool = settingsVoiceSelectionJson.intro_completed;
        }
        return settingsVoiceSelectionJson.copy(str, str2, str3, str4, bool);
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

    public final String component4() {
        return this.voice_name;
    }

    public final Boolean component5() {
        return this.intro_completed;
    }

    public final Boolean getIntro_completed() {
        return this.intro_completed;
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
        return ((((((AnonymousClass001.A0G(this.voice_id) + AnonymousClass006.A0G(this.saved_voice_id)) * 31) + AnonymousClass006.A0G(this.profile_id)) * 31) + AnonymousClass006.A0G(this.voice_name)) * 31) + C3cH.A02(this.intro_completed);
    }

    public /* synthetic */ SettingsVoiceSelectionJson(int i, String str, String str2, String str3, String str4, Boolean bool, C2hx c2hx) {
        this.voice_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.saved_voice_id = null;
        } else {
            this.saved_voice_id = str2;
        }
        if ((i & 4) == 0) {
            this.profile_id = null;
        } else {
            this.profile_id = str3;
        }
        if ((i & 8) == 0) {
            this.voice_name = null;
        } else {
            this.voice_name = str4;
        }
        if ((i & 16) == 0) {
            this.intro_completed = null;
        } else {
            this.intro_completed = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SettingsVoiceSelectionJson(String str, String str2, String str3, String str4, Boolean bool) {
        C7384Etj.A0Y(str, 0);
        this.voice_id = str;
        this.saved_voice_id = str2;
        this.profile_id = str3;
        this.voice_name = str4;
        this.intro_completed = bool;
    }

    public /* synthetic */ SettingsVoiceSelectionJson(String str, String str2, String str3, String str4, Boolean bool, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool);
    }

    public SettingsVoiceSelectionJson() {
        this("", null, null, null, null);
    }
}
