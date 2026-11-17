package com.facebook.aura.partners.voice.api;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes4.dex */
public final class VoiceCatalog extends C06G {
    public static final int $stable = 0;
    public final String currentVoiceId;
    public final String onboardingLine;
    public final String sampleLine;
    public final List<VoiceOption> suggestedVoices;
    public final List<VoiceOption> voices;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceCatalog) {
                VoiceCatalog voiceCatalog = (VoiceCatalog) obj;
                if (!C7384Etj.areEqual(this.voices, voiceCatalog.voices) || !C7384Etj.areEqual(this.suggestedVoices, voiceCatalog.suggestedVoices) || !C7384Etj.areEqual(this.sampleLine, voiceCatalog.sampleLine) || !C7384Etj.areEqual(this.onboardingLine, voiceCatalog.onboardingLine) || !C7384Etj.areEqual(this.currentVoiceId, voiceCatalog.currentVoiceId)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VoiceCatalog copy$default(VoiceCatalog voiceCatalog, List list, List list2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = voiceCatalog.voices;
        }
        if ((i & 2) != 0) {
            list2 = voiceCatalog.suggestedVoices;
        }
        if ((i & 4) != 0) {
            str = voiceCatalog.sampleLine;
        }
        if ((i & 8) != 0) {
            str2 = voiceCatalog.onboardingLine;
        }
        if ((i & 16) != 0) {
            str3 = voiceCatalog.currentVoiceId;
        }
        return voiceCatalog.copy(list, list2, str, str2, str3);
    }

    public final List<VoiceOption> component1() {
        return this.voices;
    }

    public final List<VoiceOption> component2() {
        return this.suggestedVoices;
    }

    public final String component3() {
        return this.sampleLine;
    }

    public final String component4() {
        return this.onboardingLine;
    }

    public final String component5() {
        return this.currentVoiceId;
    }

    public final String getCurrentVoiceId() {
        return this.currentVoiceId;
    }

    public final String getOnboardingLine() {
        return this.onboardingLine;
    }

    public final String getSampleLine() {
        return this.sampleLine;
    }

    public final List<VoiceOption> getSuggestedVoices() {
        return this.suggestedVoices;
    }

    public final List<VoiceOption> getVoices() {
        return this.voices;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.suggestedVoices, AnonymousClass005.A0E(this.voices)) + AnonymousClass006.A0G(this.sampleLine)) * 31) + AnonymousClass006.A0G(this.onboardingLine)) * 31) + AnonymousClass005.A0H(this.currentVoiceId);
    }

    public VoiceCatalog(List<VoiceOption> list, List<VoiceOption> list2, String str, String str2, String str3) {
        AnonymousClass003.A0u(list, list2);
        this.voices = list;
        this.suggestedVoices = list2;
        this.sampleLine = str;
        this.onboardingLine = str2;
        this.currentVoiceId = str3;
    }

    public final VoiceCatalog copy(List<VoiceOption> list, List<VoiceOption> list2, String str, String str2, String str3) {
        AnonymousClass003.A0u(list, list2);
        return new VoiceCatalog(list, list2, str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
