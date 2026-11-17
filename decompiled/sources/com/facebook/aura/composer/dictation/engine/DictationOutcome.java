package com.facebook.aura.composer.dictation.engine;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DictationOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ DictationOutcome[] $VALUES;
    public static final DictationOutcome CANCELLED;
    public static final DictationOutcome COMPLETED;
    public static final DictationOutcome FAILED;

    static {
        DictationOutcome dictationOutcome = new DictationOutcome("COMPLETED", 0);
        COMPLETED = dictationOutcome;
        DictationOutcome dictationOutcome2 = new DictationOutcome("CANCELLED", 1);
        CANCELLED = dictationOutcome2;
        DictationOutcome dictationOutcome3 = new DictationOutcome(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = dictationOutcome3;
        DictationOutcome[] dictationOutcomeArr = {dictationOutcome, dictationOutcome2, dictationOutcome3};
        $VALUES = dictationOutcomeArr;
        $ENTRIES = C3cG.A0w(dictationOutcomeArr);
    }

    public static Ey9<DictationOutcome> getEntries() {
        return $ENTRIES;
    }

    public static DictationOutcome valueOf(String str) {
        return (DictationOutcome) Enum.valueOf(DictationOutcome.class, str);
    }

    public static DictationOutcome[] values() {
        return (DictationOutcome[]) $VALUES.clone();
    }

    public DictationOutcome(String str, int i) {
    }
}
