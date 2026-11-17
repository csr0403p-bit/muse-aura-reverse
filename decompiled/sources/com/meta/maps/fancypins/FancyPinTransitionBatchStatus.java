package com.meta.maps.fancypins;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FancyPinTransitionBatchStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FancyPinTransitionBatchStatus[] $VALUES;
    public static final FancyPinTransitionBatchStatus COMPLETED;
    public static final FancyPinTransitionBatchStatus STARTED;
    public static final FancyPinTransitionBatchStatus SUPERSEDED;

    static {
        FancyPinTransitionBatchStatus fancyPinTransitionBatchStatus = new FancyPinTransitionBatchStatus(CvmMigrationStatusJson.STAGE_STARTED, 0);
        STARTED = fancyPinTransitionBatchStatus;
        FancyPinTransitionBatchStatus fancyPinTransitionBatchStatus2 = new FancyPinTransitionBatchStatus("COMPLETED", 1);
        COMPLETED = fancyPinTransitionBatchStatus2;
        FancyPinTransitionBatchStatus fancyPinTransitionBatchStatus3 = new FancyPinTransitionBatchStatus("SUPERSEDED", 2);
        SUPERSEDED = fancyPinTransitionBatchStatus3;
        FancyPinTransitionBatchStatus[] fancyPinTransitionBatchStatusArr = {fancyPinTransitionBatchStatus, fancyPinTransitionBatchStatus2, fancyPinTransitionBatchStatus3};
        $VALUES = fancyPinTransitionBatchStatusArr;
        $ENTRIES = C3cG.A0w(fancyPinTransitionBatchStatusArr);
    }

    public static Ey9<FancyPinTransitionBatchStatus> getEntries() {
        return $ENTRIES;
    }

    public static FancyPinTransitionBatchStatus valueOf(String str) {
        return (FancyPinTransitionBatchStatus) Enum.valueOf(FancyPinTransitionBatchStatus.class, str);
    }

    public static FancyPinTransitionBatchStatus[] values() {
        return (FancyPinTransitionBatchStatus[]) $VALUES.clone();
    }

    public FancyPinTransitionBatchStatus(String str, int i) {
    }
}
