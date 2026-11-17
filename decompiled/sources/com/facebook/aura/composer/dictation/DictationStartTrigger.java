package com.facebook.aura.composer.dictation;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DictationStartTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DictationStartTrigger[] $VALUES;
    public static final DictationStartTrigger ASSIST;
    public static final DictationStartTrigger ASSIST_AGAIN;
    public static final DictationStartTrigger ASSIST_OPEN;
    public static final DictationStartTrigger COMPLICATION;
    public static final DictationStartTrigger HOME_MIC;
    public static final DictationStartTrigger MIC;
    public static final DictationStartTrigger MIC_HOLD;
    public static final DictationStartTrigger RELISTEN;
    public static final DictationStartTrigger VOICE_REQUEST;
    public static final DictationStartTrigger WATCH_FACE;

    static {
        DictationStartTrigger dictationStartTrigger = new DictationStartTrigger("MIC", 0);
        MIC = dictationStartTrigger;
        DictationStartTrigger dictationStartTrigger2 = new DictationStartTrigger("MIC_HOLD", 1);
        MIC_HOLD = dictationStartTrigger2;
        DictationStartTrigger dictationStartTrigger3 = new DictationStartTrigger("ASSIST_OPEN", 2);
        ASSIST_OPEN = dictationStartTrigger3;
        DictationStartTrigger dictationStartTrigger4 = new DictationStartTrigger("RELISTEN", 3);
        RELISTEN = dictationStartTrigger4;
        DictationStartTrigger dictationStartTrigger5 = new DictationStartTrigger("ASSIST_AGAIN", 4);
        ASSIST_AGAIN = dictationStartTrigger5;
        DictationStartTrigger dictationStartTrigger6 = new DictationStartTrigger("HOME_MIC", 5);
        HOME_MIC = dictationStartTrigger6;
        DictationStartTrigger dictationStartTrigger7 = new DictationStartTrigger("ASSIST", 6);
        ASSIST = dictationStartTrigger7;
        DictationStartTrigger dictationStartTrigger8 = new DictationStartTrigger("COMPLICATION", 7);
        COMPLICATION = dictationStartTrigger8;
        DictationStartTrigger dictationStartTrigger9 = new DictationStartTrigger("WATCH_FACE", 8);
        WATCH_FACE = dictationStartTrigger9;
        DictationStartTrigger dictationStartTrigger10 = new DictationStartTrigger("VOICE_REQUEST", 9);
        VOICE_REQUEST = dictationStartTrigger10;
        DictationStartTrigger[] dictationStartTriggerArr = {dictationStartTrigger, dictationStartTrigger2, dictationStartTrigger3, dictationStartTrigger4, dictationStartTrigger5, dictationStartTrigger6, dictationStartTrigger7, dictationStartTrigger8, dictationStartTrigger9, dictationStartTrigger10};
        $VALUES = dictationStartTriggerArr;
        $ENTRIES = new F3w(dictationStartTriggerArr);
    }

    public static Ey9<DictationStartTrigger> getEntries() {
        return $ENTRIES;
    }

    public static DictationStartTrigger valueOf(String str) {
        return (DictationStartTrigger) Enum.valueOf(DictationStartTrigger.class, str);
    }

    public static DictationStartTrigger[] values() {
        return (DictationStartTrigger[]) $VALUES.clone();
    }

    public DictationStartTrigger(String str, int i) {
    }
}
