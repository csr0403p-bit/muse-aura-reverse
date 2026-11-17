package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallReconnectOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallReconnectOutcome[] $VALUES;
    public static final VoiceCallReconnectOutcome CALL_ENDED;
    public static final VoiceCallReconnectOutcome RECOVERED;
    public final String value;

    static {
        VoiceCallReconnectOutcome voiceCallReconnectOutcome = new VoiceCallReconnectOutcome("RECOVERED", 0, "recovered");
        RECOVERED = voiceCallReconnectOutcome;
        VoiceCallReconnectOutcome voiceCallReconnectOutcome2 = new VoiceCallReconnectOutcome("CALL_ENDED", 1, "call_ended");
        CALL_ENDED = voiceCallReconnectOutcome2;
        VoiceCallReconnectOutcome[] voiceCallReconnectOutcomeArr = {voiceCallReconnectOutcome, voiceCallReconnectOutcome2};
        $VALUES = voiceCallReconnectOutcomeArr;
        $ENTRIES = C3cG.A0w(voiceCallReconnectOutcomeArr);
    }

    public static Ey9<VoiceCallReconnectOutcome> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallReconnectOutcome valueOf(String str) {
        return (VoiceCallReconnectOutcome) Enum.valueOf(VoiceCallReconnectOutcome.class, str);
    }

    public static VoiceCallReconnectOutcome[] values() {
        return (VoiceCallReconnectOutcome[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallReconnectOutcome(String str, int i, String str2) {
        this.value = str2;
    }
}
