package com.facebook.aura.partners.voice.api;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class VoiceCatalogPage extends C06G {
    public static final int $stable = 0;
    public final VoiceOption currentVoice;
    public final String currentVoiceId;
    public final int limit;
    public final int offset;
    public final String selectedVoiceIdOnPage;
    public final int total;
    public final AHD<VoiceOption> voices;

    public VoiceCatalogPage(AHD<VoiceOption> ahd, int i, int i2, int i3, String str, VoiceOption voiceOption, String str2) {
        C7384Etj.A0Y(ahd, 0);
        this.voices = ahd;
        this.total = i;
        this.limit = i2;
        this.offset = i3;
        this.currentVoiceId = str;
        this.currentVoice = voiceOption;
        this.selectedVoiceIdOnPage = str2;
    }

    public final VoiceCatalogPage copy(AHD<VoiceOption> ahd, int i, int i2, int i3, String str, VoiceOption voiceOption, String str2) {
        C7384Etj.A0Y(ahd, 0);
        return new VoiceCatalogPage(ahd, i, i2, i3, str, voiceOption, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalogPage) {
                VoiceCatalogPage voiceCatalogPage = (VoiceCatalogPage) obj;
                if (!C7384Etj.areEqual(this.voices, voiceCatalogPage.voices) || this.total != voiceCatalogPage.total || this.limit != voiceCatalogPage.limit || this.offset != voiceCatalogPage.offset || !C7384Etj.areEqual(this.currentVoiceId, voiceCatalogPage.currentVoiceId) || !C7384Etj.areEqual(this.currentVoice, voiceCatalogPage.currentVoice) || !C7384Etj.areEqual(this.selectedVoiceIdOnPage, voiceCatalogPage.selectedVoiceIdOnPage)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceCatalogPage copy$default(VoiceCatalogPage voiceCatalogPage, AHD ahd, int i, int i2, int i3, String str, VoiceOption voiceOption, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            ahd = voiceCatalogPage.voices;
        }
        if ((i4 & 2) != 0) {
            i = voiceCatalogPage.total;
        }
        if ((i4 & 4) != 0) {
            i2 = voiceCatalogPage.limit;
        }
        if ((i4 & 8) != 0) {
            i3 = voiceCatalogPage.offset;
        }
        if ((i4 & 16) != 0) {
            str = voiceCatalogPage.currentVoiceId;
        }
        if ((i4 & 32) != 0) {
            voiceOption = voiceCatalogPage.currentVoice;
        }
        if ((i4 & 64) != 0) {
            str2 = voiceCatalogPage.selectedVoiceIdOnPage;
        }
        return voiceCatalogPage.copy(ahd, i, i2, i3, str, voiceOption, str2);
    }

    public final AHD<VoiceOption> component1() {
        return this.voices;
    }

    public final int component2() {
        return this.total;
    }

    public final int component3() {
        return this.limit;
    }

    public final int component4() {
        return this.offset;
    }

    public final String component5() {
        return this.currentVoiceId;
    }

    public final VoiceOption component6() {
        return this.currentVoice;
    }

    public final String component7() {
        return this.selectedVoiceIdOnPage;
    }

    public final VoiceOption getCurrentVoice() {
        return this.currentVoice;
    }

    public final String getCurrentVoiceId() {
        return this.currentVoiceId;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getSelectedVoiceIdOnPage() {
        return this.selectedVoiceIdOnPage;
    }

    public final int getTotal() {
        return this.total;
    }

    public final AHD<VoiceOption> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass005.A0E(this.voices) + this.total) * 31) + this.limit) * 31) + this.offset) * 31) + AnonymousClass006.A0G(this.currentVoiceId)) * 31) + AnonymousClass006.A0D(this.currentVoice)) * 31) + AnonymousClass005.A0H(this.selectedVoiceIdOnPage);
    }

    public String toString() {
        return super.toString();
    }
}
