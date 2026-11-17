package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCvmReplaceReadBlock {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmReplaceReadBlock[] $VALUES;
    public static final HatchCvmReplaceReadBlock NOT_FOUND;
    public static final HatchCvmReplaceReadBlock RATE_LIMITED;

    static {
        HatchCvmReplaceReadBlock hatchCvmReplaceReadBlock = new HatchCvmReplaceReadBlock("RATE_LIMITED", 0);
        RATE_LIMITED = hatchCvmReplaceReadBlock;
        HatchCvmReplaceReadBlock hatchCvmReplaceReadBlock2 = new HatchCvmReplaceReadBlock("NOT_FOUND", 1);
        NOT_FOUND = hatchCvmReplaceReadBlock2;
        HatchCvmReplaceReadBlock[] hatchCvmReplaceReadBlockArr = {hatchCvmReplaceReadBlock, hatchCvmReplaceReadBlock2};
        $VALUES = hatchCvmReplaceReadBlockArr;
        $ENTRIES = C3cG.A0w(hatchCvmReplaceReadBlockArr);
    }

    public static Ey9<HatchCvmReplaceReadBlock> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmReplaceReadBlock valueOf(String str) {
        return (HatchCvmReplaceReadBlock) Enum.valueOf(HatchCvmReplaceReadBlock.class, str);
    }

    public static HatchCvmReplaceReadBlock[] values() {
        return (HatchCvmReplaceReadBlock[]) $VALUES.clone();
    }

    public HatchCvmReplaceReadBlock(String str, int i) {
    }
}
