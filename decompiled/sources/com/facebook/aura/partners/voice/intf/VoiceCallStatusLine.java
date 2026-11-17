package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VoiceCallStatusLine {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceCallStatusLine[] $VALUES;
    public static final VoiceCallStatusLine LIVE_AVATAR_COULD_NOT_UPDATE;
    public static final VoiceCallStatusLine LIVE_AVATAR_NOT_AVAILABLE;
    public static final VoiceCallStatusLine RECONNECTING;
    public static final VoiceCallStatusLine UPDATING_LIVE_AVATAR;

    static {
        VoiceCallStatusLine voiceCallStatusLine = new VoiceCallStatusLine("RECONNECTING", 0);
        RECONNECTING = voiceCallStatusLine;
        VoiceCallStatusLine voiceCallStatusLine2 = new VoiceCallStatusLine("UPDATING_LIVE_AVATAR", 1);
        UPDATING_LIVE_AVATAR = voiceCallStatusLine2;
        VoiceCallStatusLine voiceCallStatusLine3 = new VoiceCallStatusLine("LIVE_AVATAR_COULD_NOT_UPDATE", 2);
        LIVE_AVATAR_COULD_NOT_UPDATE = voiceCallStatusLine3;
        VoiceCallStatusLine voiceCallStatusLine4 = new VoiceCallStatusLine("LIVE_AVATAR_NOT_AVAILABLE", 3);
        LIVE_AVATAR_NOT_AVAILABLE = voiceCallStatusLine4;
        VoiceCallStatusLine[] voiceCallStatusLineArr = {voiceCallStatusLine, voiceCallStatusLine2, voiceCallStatusLine3, voiceCallStatusLine4};
        $VALUES = voiceCallStatusLineArr;
        $ENTRIES = C3cG.A0w(voiceCallStatusLineArr);
    }

    public static Ey9<VoiceCallStatusLine> getEntries() {
        return $ENTRIES;
    }

    public static VoiceCallStatusLine valueOf(String str) {
        return (VoiceCallStatusLine) Enum.valueOf(VoiceCallStatusLine.class, str);
    }

    public static VoiceCallStatusLine[] values() {
        return (VoiceCallStatusLine[]) $VALUES.clone();
    }

    public VoiceCallStatusLine(String str, int i) {
    }
}
