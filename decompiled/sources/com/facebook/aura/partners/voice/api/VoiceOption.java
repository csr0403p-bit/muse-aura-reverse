package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceOption extends C06G {
    public static final int $stable = 0;
    public final String accent;
    public final String description;
    public final String gender;
    public final String id;
    public final String name;
    public final String tone;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceOption) {
                VoiceOption voiceOption = (VoiceOption) obj;
                if (!C7384Etj.areEqual(this.id, voiceOption.id) || !C7384Etj.areEqual(this.name, voiceOption.name) || !C7384Etj.areEqual(this.description, voiceOption.description) || !C7384Etj.areEqual(this.gender, voiceOption.gender) || !C7384Etj.areEqual(this.accent, voiceOption.accent) || !C7384Etj.areEqual(this.tone, voiceOption.tone)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ VoiceOption(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }

    public static /* synthetic */ VoiceOption copy$default(VoiceOption voiceOption, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceOption.id;
        }
        if ((i & 2) != 0) {
            str2 = voiceOption.name;
        }
        if ((i & 4) != 0) {
            str3 = voiceOption.description;
        }
        if ((i & 8) != 0) {
            str4 = voiceOption.gender;
        }
        if ((i & 16) != 0) {
            str5 = voiceOption.accent;
        }
        if ((i & 32) != 0) {
            str6 = voiceOption.tone;
        }
        return voiceOption.copy(str, str2, str3, str4, str5, str6);
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
        return AnonymousClass001.A0H(this.tone, AnonymousClass005.A0I(this.accent, AnonymousClass005.A0I(this.gender, AnonymousClass005.A0I(this.description, AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.id))))));
    }

    public final VoiceOption copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        return new VoiceOption(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public VoiceOption(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        C7384Etj.A0Y(str6, 5);
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.gender = str4;
        this.accent = str5;
        this.tone = str6;
    }
}
