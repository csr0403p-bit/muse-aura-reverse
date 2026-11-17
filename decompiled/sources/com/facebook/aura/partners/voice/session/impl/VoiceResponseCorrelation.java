package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceResponseCorrelation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceResponseCorrelation[] $VALUES;
    public static final VoiceResponseCorrelation EXPLICIT_REPLY_TO;
    public static final VoiceResponseCorrelation MISMATCH;
    public static final VoiceResponseCorrelation OPEN_TURN_FALLBACK;
    public final String annotationValue;

    static {
        VoiceResponseCorrelation voiceResponseCorrelation = new VoiceResponseCorrelation("EXPLICIT_REPLY_TO", 0, "explicit_reply_to");
        EXPLICIT_REPLY_TO = voiceResponseCorrelation;
        VoiceResponseCorrelation voiceResponseCorrelation2 = new VoiceResponseCorrelation("OPEN_TURN_FALLBACK", 1, "open_turn_fallback");
        OPEN_TURN_FALLBACK = voiceResponseCorrelation2;
        VoiceResponseCorrelation voiceResponseCorrelation3 = new VoiceResponseCorrelation("MISMATCH", 2, "");
        MISMATCH = voiceResponseCorrelation3;
        VoiceResponseCorrelation[] voiceResponseCorrelationArr = {voiceResponseCorrelation, voiceResponseCorrelation2, voiceResponseCorrelation3};
        $VALUES = voiceResponseCorrelationArr;
        $ENTRIES = C3cG.A0w(voiceResponseCorrelationArr);
    }

    public static Ey9<VoiceResponseCorrelation> getEntries() {
        return $ENTRIES;
    }

    public static VoiceResponseCorrelation valueOf(String str) {
        return (VoiceResponseCorrelation) Enum.valueOf(VoiceResponseCorrelation.class, str);
    }

    public static VoiceResponseCorrelation[] values() {
        return (VoiceResponseCorrelation[]) $VALUES.clone();
    }

    public final String getAnnotationValue() {
        return this.annotationValue;
    }

    public VoiceResponseCorrelation(String str, int i, String str2) {
        this.annotationValue = str2;
    }
}
