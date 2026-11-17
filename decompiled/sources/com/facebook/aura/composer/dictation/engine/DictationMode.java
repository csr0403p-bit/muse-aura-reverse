package com.facebook.aura.composer.dictation.engine;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DictationMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DictationMode[] $VALUES;
    public static final DictationMode AUTO_SUBMIT;
    public static final DictationMode MANUAL;

    static {
        DictationMode dictationMode = new DictationMode("AUTO_SUBMIT", 0);
        AUTO_SUBMIT = dictationMode;
        DictationMode dictationMode2 = new DictationMode("MANUAL", 1);
        MANUAL = dictationMode2;
        DictationMode[] dictationModeArr = {dictationMode, dictationMode2};
        $VALUES = dictationModeArr;
        $ENTRIES = C3cG.A0w(dictationModeArr);
    }

    public static Ey9<DictationMode> getEntries() {
        return $ENTRIES;
    }

    public static DictationMode valueOf(String str) {
        return (DictationMode) Enum.valueOf(DictationMode.class, str);
    }

    public static DictationMode[] values() {
        return (DictationMode[]) $VALUES.clone();
    }

    public DictationMode(String str, int i) {
    }
}
