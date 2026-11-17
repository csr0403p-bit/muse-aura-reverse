package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FillFailureStage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FillFailureStage[] $VALUES;
    public static final FillFailureStage CLEAR;
    public static final Companion Companion;
    public static final FillFailureStage FINAL_VALUE;
    public static final FillFailureStage FOCUS;
    public static final FillFailureStage IDENTITY_CHANGED;
    public static final FillFailureStage SELECTION;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        FillFailureStage fillFailureStage = new FillFailureStage("IDENTITY_CHANGED", 0);
        IDENTITY_CHANGED = fillFailureStage;
        FillFailureStage fillFailureStage2 = new FillFailureStage("FOCUS", 1);
        FOCUS = fillFailureStage2;
        FillFailureStage fillFailureStage3 = new FillFailureStage("SELECTION", 2);
        SELECTION = fillFailureStage3;
        FillFailureStage fillFailureStage4 = new FillFailureStage("CLEAR", 3);
        CLEAR = fillFailureStage4;
        FillFailureStage fillFailureStage5 = new FillFailureStage("FINAL_VALUE", 4);
        FINAL_VALUE = fillFailureStage5;
        FillFailureStage[] fillFailureStageArr = {fillFailureStage, fillFailureStage2, fillFailureStage3, fillFailureStage4, fillFailureStage5};
        $VALUES = fillFailureStageArr;
        $ENTRIES = C3cG.A0w(fillFailureStageArr);
        Companion = new Companion();
    }

    public static Ey9<FillFailureStage> getEntries() {
        return $ENTRIES;
    }

    public static FillFailureStage valueOf(String str) {
        return (FillFailureStage) Enum.valueOf(FillFailureStage.class, str);
    }

    public static FillFailureStage[] values() {
        return (FillFailureStage[]) $VALUES.clone();
    }

    public FillFailureStage(String str, int i) {
    }
}
