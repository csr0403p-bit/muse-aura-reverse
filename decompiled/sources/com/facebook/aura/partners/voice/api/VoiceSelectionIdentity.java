package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceSelectionIdentity extends C06G {
    public static final int $stable = 0;
    public final String profileId;
    public final String savedVoiceId;
    public final String voiceId;

    public VoiceSelectionIdentity(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.voiceId = str;
        this.savedVoiceId = str2;
        this.profileId = str3;
    }

    public final VoiceSelectionIdentity copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new VoiceSelectionIdentity(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceSelectionIdentity) {
                VoiceSelectionIdentity voiceSelectionIdentity = (VoiceSelectionIdentity) obj;
                if (!C7384Etj.areEqual(this.voiceId, voiceSelectionIdentity.voiceId) || !C7384Etj.areEqual(this.savedVoiceId, voiceSelectionIdentity.savedVoiceId) || !C7384Etj.areEqual(this.profileId, voiceSelectionIdentity.profileId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceSelectionIdentity copy$default(VoiceSelectionIdentity voiceSelectionIdentity, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voiceSelectionIdentity.voiceId;
        }
        if ((i & 2) != 0) {
            str2 = voiceSelectionIdentity.savedVoiceId;
        }
        if ((i & 4) != 0) {
            str3 = voiceSelectionIdentity.profileId;
        }
        return voiceSelectionIdentity.copy(str, str2, str3);
    }

    public final String component1() {
        return this.voiceId;
    }

    public final String component2() {
        return this.savedVoiceId;
    }

    public final String component3() {
        return this.profileId;
    }

    public final String getProfileId() {
        return this.profileId;
    }

    public final String getSavedVoiceId() {
        return this.savedVoiceId;
    }

    public final String getVoiceId() {
        return this.voiceId;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.voiceId) + AnonymousClass006.A0G(this.savedVoiceId)) * 31) + AnonymousClass005.A0H(this.profileId);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoiceSelectionIdentity(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
