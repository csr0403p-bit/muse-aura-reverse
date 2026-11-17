package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallRejoinOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallRejoinOutcome[] $VALUES;
    public static final VoiceCallRejoinOutcome CONNECTED;
    public static final VoiceCallRejoinOutcome FAILED;
    public static final VoiceCallRejoinOutcome TIMEOUT;
    public final String value;

    static {
        VoiceCallRejoinOutcome voiceCallRejoinOutcome = new VoiceCallRejoinOutcome("CONNECTED", 0, "connected");
        CONNECTED = voiceCallRejoinOutcome;
        VoiceCallRejoinOutcome voiceCallRejoinOutcome2 = new VoiceCallRejoinOutcome(CvmMigrationStatusJson.STAGE_FAILED, 1, "failed");
        FAILED = voiceCallRejoinOutcome2;
        VoiceCallRejoinOutcome voiceCallRejoinOutcome3 = new VoiceCallRejoinOutcome("TIMEOUT", 2, "timeout");
        TIMEOUT = voiceCallRejoinOutcome3;
        VoiceCallRejoinOutcome[] voiceCallRejoinOutcomeArr = {voiceCallRejoinOutcome, voiceCallRejoinOutcome2, voiceCallRejoinOutcome3};
        $VALUES = voiceCallRejoinOutcomeArr;
        $ENTRIES = C3cG.A0w(voiceCallRejoinOutcomeArr);
    }

    public static Ey9<VoiceCallRejoinOutcome> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallRejoinOutcome valueOf(String str) {
        return (VoiceCallRejoinOutcome) Enum.valueOf(VoiceCallRejoinOutcome.class, str);
    }

    public static VoiceCallRejoinOutcome[] values() {
        return (VoiceCallRejoinOutcome[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallRejoinOutcome(String str, int i, String str2) {
        this.value = str2;
    }
}
