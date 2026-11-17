package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes.dex */
public final class SavedVoiceOption extends C06G {
    public static final int $stable = 0;
    public final String previewText;
    public final String profileId;
    public final String savedVoiceId;
    public final VoiceOption voice;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SavedVoiceOption) {
                SavedVoiceOption savedVoiceOption = (SavedVoiceOption) obj;
                if (!C7384Etj.areEqual(this.savedVoiceId, savedVoiceOption.savedVoiceId) || !C7384Etj.areEqual(this.profileId, savedVoiceOption.profileId) || !C7384Etj.areEqual(this.voice, savedVoiceOption.voice) || !C7384Etj.areEqual(this.previewText, savedVoiceOption.previewText)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SavedVoiceOption copy$default(SavedVoiceOption savedVoiceOption, String str, String str2, VoiceOption voiceOption, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedVoiceOption.savedVoiceId;
        }
        if ((i & 2) != 0) {
            str2 = savedVoiceOption.profileId;
        }
        if ((i & 4) != 0) {
            voiceOption = savedVoiceOption.voice;
        }
        if ((i & 8) != 0) {
            str3 = savedVoiceOption.previewText;
        }
        return savedVoiceOption.copy(str, str2, voiceOption, str3);
    }

    public final String component1() {
        return this.savedVoiceId;
    }

    public final String component2() {
        return this.profileId;
    }

    public final VoiceOption component3() {
        return this.voice;
    }

    public final String component4() {
        return this.previewText;
    }

    public final String getPreviewText() {
        return this.previewText;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final String getRowId() {
        return FGI.A0U(this.savedVoiceId, ":", this.profileId);
    }

    public final String getSavedVoiceId() {
        return this.savedVoiceId;
    }

    public final VoiceOption getVoice() {
        return this.voice;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.previewText, AnonymousClass005.A0F(this.voice, AnonymousClass005.A0I(this.profileId, AnonymousClass001.A0G(this.savedVoiceId))));
    }

    public SavedVoiceOption(String str, String str2, VoiceOption voiceOption, String str3) {
        AnonymousClass005.A14(str, str2, voiceOption, str3);
        this.savedVoiceId = str;
        this.profileId = str2;
        this.voice = voiceOption;
        this.previewText = str3;
    }

    public final SavedVoiceOption copy(String str, String str2, VoiceOption voiceOption, String str3) {
        AnonymousClass005.A14(str, str2, voiceOption, str3);
        return new SavedVoiceOption(str, str2, voiceOption, str3);
    }

    public String toString() {
        return super.toString();
    }
}
