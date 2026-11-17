package com.facebook.aura.common;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchCvmChipPinPurpose {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmChipPinPurpose[] $VALUES;
    public static final HatchCvmChipPinPurpose HARD_REPLACEMENT;
    public static final HatchCvmChipPinPurpose PROVISIONING;
    public final String logValue;

    static {
        HatchCvmChipPinPurpose hatchCvmChipPinPurpose = new HatchCvmChipPinPurpose(AuraSubscriptionRepositoryJsonKt.PROVISIONING_STATUS, 0, "provisioning");
        PROVISIONING = hatchCvmChipPinPurpose;
        HatchCvmChipPinPurpose hatchCvmChipPinPurpose2 = new HatchCvmChipPinPurpose("HARD_REPLACEMENT", 1, "hard_replacement");
        HARD_REPLACEMENT = hatchCvmChipPinPurpose2;
        HatchCvmChipPinPurpose[] hatchCvmChipPinPurposeArr = {hatchCvmChipPinPurpose, hatchCvmChipPinPurpose2};
        $VALUES = hatchCvmChipPinPurposeArr;
        $ENTRIES = C3cG.A0w(hatchCvmChipPinPurposeArr);
    }

    public static Ey9<HatchCvmChipPinPurpose> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmChipPinPurpose valueOf(String str) {
        return (HatchCvmChipPinPurpose) Enum.valueOf(HatchCvmChipPinPurpose.class, str);
    }

    public static HatchCvmChipPinPurpose[] values() {
        return (HatchCvmChipPinPurpose[]) $VALUES.clone();
    }

    public final String getLogValue() {
        return this.logValue;
    }

    public HatchCvmChipPinPurpose(String str, int i, String str2) {
        this.logValue = str2;
    }
}
