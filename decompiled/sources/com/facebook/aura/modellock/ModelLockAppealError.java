package com.facebook.aura.modellock;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ModelLockAppealError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ModelLockAppealError[] $VALUES;
    public static final ModelLockAppealError CHANGED;
    public static final ModelLockAppealError FAILED;
    public static final ModelLockAppealError NOTHING_TO_APPEAL;
    public static final ModelLockAppealError PENDING;
    public static final ModelLockAppealError SEND_FAILED;
    public static final ModelLockAppealError UNAVAILABLE;

    static {
        ModelLockAppealError modelLockAppealError = new ModelLockAppealError("UNAVAILABLE", 0);
        UNAVAILABLE = modelLockAppealError;
        ModelLockAppealError modelLockAppealError2 = new ModelLockAppealError("CHANGED", 1);
        CHANGED = modelLockAppealError2;
        ModelLockAppealError modelLockAppealError3 = new ModelLockAppealError("NOTHING_TO_APPEAL", 2);
        NOTHING_TO_APPEAL = modelLockAppealError3;
        ModelLockAppealError modelLockAppealError4 = new ModelLockAppealError(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 3);
        PENDING = modelLockAppealError4;
        ModelLockAppealError modelLockAppealError5 = new ModelLockAppealError("SEND_FAILED", 4);
        SEND_FAILED = modelLockAppealError5;
        ModelLockAppealError modelLockAppealError6 = new ModelLockAppealError(CvmMigrationStatusJson.STAGE_FAILED, 5);
        FAILED = modelLockAppealError6;
        ModelLockAppealError[] modelLockAppealErrorArr = {modelLockAppealError, modelLockAppealError2, modelLockAppealError3, modelLockAppealError4, modelLockAppealError5, modelLockAppealError6};
        $VALUES = modelLockAppealErrorArr;
        $ENTRIES = C3cG.A0w(modelLockAppealErrorArr);
    }

    public static Ey9<ModelLockAppealError> getEntries() {
        return $ENTRIES;
    }

    public static ModelLockAppealError valueOf(String str) {
        return (ModelLockAppealError) Enum.valueOf(ModelLockAppealError.class, str);
    }

    public static ModelLockAppealError[] values() {
        return (ModelLockAppealError[]) $VALUES.clone();
    }

    public ModelLockAppealError(String str, int i) {
    }
}
