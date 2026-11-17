package com.facebook.aura.gateway.store;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchCvmChipClaimDisposition {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmChipClaimDisposition[] $VALUES;
    public static final HatchCvmChipClaimDisposition ACCEPTED;
    public static final HatchCvmChipClaimDisposition FATAL;
    public static final HatchCvmChipClaimDisposition PENDING;
    public static final HatchCvmChipClaimDisposition STOOD_DOWN;

    static {
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition = new HatchCvmChipClaimDisposition(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 0);
        PENDING = hatchCvmChipClaimDisposition;
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition2 = new HatchCvmChipClaimDisposition("ACCEPTED", 1);
        ACCEPTED = hatchCvmChipClaimDisposition2;
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition3 = new HatchCvmChipClaimDisposition("STOOD_DOWN", 2);
        STOOD_DOWN = hatchCvmChipClaimDisposition3;
        HatchCvmChipClaimDisposition hatchCvmChipClaimDisposition4 = new HatchCvmChipClaimDisposition("FATAL", 3);
        FATAL = hatchCvmChipClaimDisposition4;
        HatchCvmChipClaimDisposition[] hatchCvmChipClaimDispositionArr = {hatchCvmChipClaimDisposition, hatchCvmChipClaimDisposition2, hatchCvmChipClaimDisposition3, hatchCvmChipClaimDisposition4};
        $VALUES = hatchCvmChipClaimDispositionArr;
        $ENTRIES = C3cG.A0w(hatchCvmChipClaimDispositionArr);
    }

    public static Ey9<HatchCvmChipClaimDisposition> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmChipClaimDisposition valueOf(String str) {
        return (HatchCvmChipClaimDisposition) Enum.valueOf(HatchCvmChipClaimDisposition.class, str);
    }

    public static HatchCvmChipClaimDisposition[] values() {
        return (HatchCvmChipClaimDisposition[]) $VALUES.clone();
    }

    public final boolean getMayBid() {
        return this == PENDING || this == ACCEPTED;
    }

    public HatchCvmChipClaimDisposition(String str, int i) {
    }
}
