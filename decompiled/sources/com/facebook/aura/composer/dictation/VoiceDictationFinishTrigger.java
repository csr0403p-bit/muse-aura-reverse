package com.facebook.aura.composer.dictation;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class VoiceDictationFinishTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VoiceDictationFinishTrigger[] $VALUES;
    public static final VoiceDictationFinishTrigger BACKGROUNDED;
    public static final VoiceDictationFinishTrigger CANCELLED;
    public static final VoiceDictationFinishTrigger CAPTURE_TOO_SHORT;
    public static final VoiceDictationFinishTrigger CLEARED;
    public static final VoiceDictationFinishTrigger FINAL_AFTER_SEND;
    public static final VoiceDictationFinishTrigger INTERRUPTED;
    public static final VoiceDictationFinishTrigger OFFLINE;
    public static final VoiceDictationFinishTrigger PREEMPTED;
    public static final VoiceDictationFinishTrigger STOPPED;
    public static final VoiceDictationFinishTrigger SUPERSEDED;

    static {
        VoiceDictationFinishTrigger voiceDictationFinishTrigger = new VoiceDictationFinishTrigger("FINAL_AFTER_SEND", 0);
        FINAL_AFTER_SEND = voiceDictationFinishTrigger;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger2 = new VoiceDictationFinishTrigger("STOPPED", 1);
        STOPPED = voiceDictationFinishTrigger2;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger3 = new VoiceDictationFinishTrigger("SUPERSEDED", 2);
        SUPERSEDED = voiceDictationFinishTrigger3;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger4 = new VoiceDictationFinishTrigger("CANCELLED", 3);
        CANCELLED = voiceDictationFinishTrigger4;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger5 = new VoiceDictationFinishTrigger("CLEARED", 4);
        CLEARED = voiceDictationFinishTrigger5;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger6 = new VoiceDictationFinishTrigger("CAPTURE_TOO_SHORT", 5);
        CAPTURE_TOO_SHORT = voiceDictationFinishTrigger6;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger7 = new VoiceDictationFinishTrigger("PREEMPTED", 6);
        PREEMPTED = voiceDictationFinishTrigger7;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger8 = new VoiceDictationFinishTrigger("INTERRUPTED", 7);
        INTERRUPTED = voiceDictationFinishTrigger8;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger9 = new VoiceDictationFinishTrigger("BACKGROUNDED", 8);
        BACKGROUNDED = voiceDictationFinishTrigger9;
        VoiceDictationFinishTrigger voiceDictationFinishTrigger10 = new VoiceDictationFinishTrigger("OFFLINE", 9);
        OFFLINE = voiceDictationFinishTrigger10;
        VoiceDictationFinishTrigger[] voiceDictationFinishTriggerArr = {voiceDictationFinishTrigger, voiceDictationFinishTrigger2, voiceDictationFinishTrigger3, voiceDictationFinishTrigger4, voiceDictationFinishTrigger5, voiceDictationFinishTrigger6, voiceDictationFinishTrigger7, voiceDictationFinishTrigger8, voiceDictationFinishTrigger9, voiceDictationFinishTrigger10};
        $VALUES = voiceDictationFinishTriggerArr;
        $ENTRIES = C3cG.A0w(voiceDictationFinishTriggerArr);
    }

    public static Ey9<VoiceDictationFinishTrigger> getEntries() {
        return $ENTRIES;
    }

    public static VoiceDictationFinishTrigger valueOf(String str) {
        return (VoiceDictationFinishTrigger) Enum.valueOf(VoiceDictationFinishTrigger.class, str);
    }

    public static VoiceDictationFinishTrigger[] values() {
        return (VoiceDictationFinishTrigger[]) $VALUES.clone();
    }

    public VoiceDictationFinishTrigger(String str, int i) {
    }
}
