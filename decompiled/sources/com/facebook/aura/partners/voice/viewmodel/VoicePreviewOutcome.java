package com.facebook.aura.partners.voice.viewmodel;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class VoicePreviewOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoicePreviewOutcome[] $VALUES;
    public static final VoicePreviewOutcome FAILED;
    public static final VoicePreviewOutcome INTERRUPTED;
    public static final VoicePreviewOutcome PLAYED;

    static {
        VoicePreviewOutcome voicePreviewOutcome = new VoicePreviewOutcome("PLAYED", 0);
        PLAYED = voicePreviewOutcome;
        VoicePreviewOutcome voicePreviewOutcome2 = new VoicePreviewOutcome("INTERRUPTED", 1);
        INTERRUPTED = voicePreviewOutcome2;
        VoicePreviewOutcome voicePreviewOutcome3 = new VoicePreviewOutcome(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = voicePreviewOutcome3;
        VoicePreviewOutcome[] voicePreviewOutcomeArr = {voicePreviewOutcome, voicePreviewOutcome2, voicePreviewOutcome3};
        $VALUES = voicePreviewOutcomeArr;
        $ENTRIES = C3cG.A0w(voicePreviewOutcomeArr);
    }

    public static Ey9<VoicePreviewOutcome> getEntries() {
        return $ENTRIES;
    }

    public static VoicePreviewOutcome valueOf(String str) {
        return (VoicePreviewOutcome) Enum.valueOf(VoicePreviewOutcome.class, str);
    }

    public static VoicePreviewOutcome[] values() {
        return (VoicePreviewOutcome[]) $VALUES.clone();
    }

    public VoicePreviewOutcome(String str, int i) {
    }
}
