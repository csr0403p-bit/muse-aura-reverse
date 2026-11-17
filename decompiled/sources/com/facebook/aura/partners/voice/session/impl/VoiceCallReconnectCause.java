package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.gateway.HatchFileOperations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallReconnectCause {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallReconnectCause[] $VALUES;
    public static final VoiceCallReconnectCause GATEWAY;
    public static final VoiceCallReconnectCause MEDIA;
    public static final VoiceCallReconnectCause OFFLINE;
    public static final VoiceCallReconnectCause REJOIN;
    public final String value;

    static {
        VoiceCallReconnectCause voiceCallReconnectCause = new VoiceCallReconnectCause("GATEWAY", 0, "gateway");
        GATEWAY = voiceCallReconnectCause;
        VoiceCallReconnectCause voiceCallReconnectCause2 = new VoiceCallReconnectCause("MEDIA", 1, HatchFileOperations.LibraryPreset.media);
        MEDIA = voiceCallReconnectCause2;
        VoiceCallReconnectCause voiceCallReconnectCause3 = new VoiceCallReconnectCause("OFFLINE", 2, "offline");
        OFFLINE = voiceCallReconnectCause3;
        VoiceCallReconnectCause voiceCallReconnectCause4 = new VoiceCallReconnectCause("REJOIN", 3, "rejoin");
        REJOIN = voiceCallReconnectCause4;
        VoiceCallReconnectCause[] voiceCallReconnectCauseArr = {voiceCallReconnectCause, voiceCallReconnectCause2, voiceCallReconnectCause3, voiceCallReconnectCause4};
        $VALUES = voiceCallReconnectCauseArr;
        $ENTRIES = C3cG.A0w(voiceCallReconnectCauseArr);
    }

    public static Ey9<VoiceCallReconnectCause> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallReconnectCause valueOf(String str) {
        return (VoiceCallReconnectCause) Enum.valueOf(VoiceCallReconnectCause.class, str);
    }

    public static VoiceCallReconnectCause[] values() {
        return (VoiceCallReconnectCause[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public VoiceCallReconnectCause(String str, int i, String str2) {
        this.value = str2;
    }
}
