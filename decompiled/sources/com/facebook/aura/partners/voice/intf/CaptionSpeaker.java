package com.facebook.aura.partners.voice.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CaptionSpeaker {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CaptionSpeaker[] $VALUES;
    public static final CaptionSpeaker BOT;
    public static final CaptionSpeaker USER;

    static {
        CaptionSpeaker captionSpeaker = new CaptionSpeaker("BOT", 0);
        BOT = captionSpeaker;
        CaptionSpeaker captionSpeaker2 = new CaptionSpeaker("USER", 1);
        USER = captionSpeaker2;
        CaptionSpeaker[] captionSpeakerArr = {captionSpeaker, captionSpeaker2};
        $VALUES = captionSpeakerArr;
        $ENTRIES = C3cG.A0w(captionSpeakerArr);
    }

    public static Ey9<CaptionSpeaker> getEntries() {
        return $ENTRIES;
    }

    public static CaptionSpeaker valueOf(String str) {
        return (CaptionSpeaker) Enum.valueOf(CaptionSpeaker.class, str);
    }

    public static CaptionSpeaker[] values() {
        return (CaptionSpeaker[]) $VALUES.clone();
    }

    public CaptionSpeaker(String str, int i) {
    }
}
