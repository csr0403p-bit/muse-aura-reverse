package com.facebook.aura.composer.dictation;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DictationEngineType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DictationEngineType[] $VALUES;
    public static final DictationEngineType ON_DEVICE;
    public static final DictationEngineType VM;
    public static final DictationEngineType VOYAGER;
    public final String logName;

    static {
        DictationEngineType dictationEngineType = new DictationEngineType("VOYAGER", 0, "voyager");
        VOYAGER = dictationEngineType;
        DictationEngineType dictationEngineType2 = new DictationEngineType("ON_DEVICE", 1, "android");
        ON_DEVICE = dictationEngineType2;
        DictationEngineType dictationEngineType3 = new DictationEngineType("VM", 2, "vm");
        VM = dictationEngineType3;
        DictationEngineType[] dictationEngineTypeArr = {dictationEngineType, dictationEngineType2, dictationEngineType3};
        $VALUES = dictationEngineTypeArr;
        $ENTRIES = C3cG.A0w(dictationEngineTypeArr);
    }

    public static Ey9<DictationEngineType> getEntries() {
        return $ENTRIES;
    }

    public static DictationEngineType valueOf(String str) {
        return (DictationEngineType) Enum.valueOf(DictationEngineType.class, str);
    }

    public static DictationEngineType[] values() {
        return (DictationEngineType[]) $VALUES.clone();
    }

    public final String getLogName() {
        return this.logName;
    }

    public DictationEngineType(String str, int i, String str2) {
        this.logName = str2;
    }
}
