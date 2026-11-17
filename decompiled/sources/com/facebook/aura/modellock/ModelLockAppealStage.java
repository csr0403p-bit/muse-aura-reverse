package com.facebook.aura.modellock;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ModelLockAppealStage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ModelLockAppealStage[] $VALUES;
    public static final ModelLockAppealStage DENIED;
    public static final ModelLockAppealStage IN_REVIEW;
    public static final ModelLockAppealStage NOT_SUBMITTED;
    public static final ModelLockAppealStage UNAVAILABLE;

    static {
        ModelLockAppealStage modelLockAppealStage = new ModelLockAppealStage("NOT_SUBMITTED", 0);
        NOT_SUBMITTED = modelLockAppealStage;
        ModelLockAppealStage modelLockAppealStage2 = new ModelLockAppealStage("UNAVAILABLE", 1);
        UNAVAILABLE = modelLockAppealStage2;
        ModelLockAppealStage modelLockAppealStage3 = new ModelLockAppealStage("IN_REVIEW", 2);
        IN_REVIEW = modelLockAppealStage3;
        ModelLockAppealStage modelLockAppealStage4 = new ModelLockAppealStage("DENIED", 3);
        DENIED = modelLockAppealStage4;
        ModelLockAppealStage[] modelLockAppealStageArr = {modelLockAppealStage, modelLockAppealStage2, modelLockAppealStage3, modelLockAppealStage4};
        $VALUES = modelLockAppealStageArr;
        $ENTRIES = C3cG.A0w(modelLockAppealStageArr);
    }

    public static Ey9<ModelLockAppealStage> getEntries() {
        return $ENTRIES;
    }

    public static ModelLockAppealStage valueOf(String str) {
        return (ModelLockAppealStage) Enum.valueOf(ModelLockAppealStage.class, str);
    }

    public static ModelLockAppealStage[] values() {
        return (ModelLockAppealStage[]) $VALUES.clone();
    }

    public ModelLockAppealStage(String str, int i) {
    }
}
