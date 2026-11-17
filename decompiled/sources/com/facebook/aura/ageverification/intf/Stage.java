package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Stage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ Stage[] $VALUES;
    public static final Stage ATTEMPT_RESULT;
    public static final Stage ATTEMPT_STARTED;
    public static final Stage ATTEMPT_SUBMITTED;
    public static final Stage ENTERED;
    public static final Stage EXITED;
    public static final Stage METHOD_SELECTED;
    public static final Stage SELFIE_CAPTURE;
    public static final Stage STEP_SHOWN;

    static {
        Stage stage = new Stage("ENTERED", 0);
        ENTERED = stage;
        Stage stage2 = new Stage("STEP_SHOWN", 1);
        STEP_SHOWN = stage2;
        Stage stage3 = new Stage("METHOD_SELECTED", 2);
        METHOD_SELECTED = stage3;
        Stage stage4 = new Stage("ATTEMPT_STARTED", 3);
        ATTEMPT_STARTED = stage4;
        Stage stage5 = new Stage("ATTEMPT_SUBMITTED", 4);
        ATTEMPT_SUBMITTED = stage5;
        Stage stage6 = new Stage("ATTEMPT_RESULT", 5);
        ATTEMPT_RESULT = stage6;
        Stage stage7 = new Stage("SELFIE_CAPTURE", 6);
        SELFIE_CAPTURE = stage7;
        Stage stage8 = new Stage("EXITED", 7);
        EXITED = stage8;
        Stage[] stageArr = {stage, stage2, stage3, stage4, stage5, stage6, stage7, stage8};
        $VALUES = stageArr;
        $ENTRIES = C3cG.A0w(stageArr);
    }

    public static Ey9<Stage> getEntries() {
        return $ENTRIES;
    }

    public static Stage valueOf(String str) {
        return (Stage) Enum.valueOf(Stage.class, str);
    }

    public static Stage[] values() {
        return (Stage[]) $VALUES.clone();
    }

    public Stage(String str, int i) {
    }
}
