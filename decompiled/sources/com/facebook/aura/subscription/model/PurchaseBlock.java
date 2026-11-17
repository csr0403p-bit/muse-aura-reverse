package com.facebook.aura.subscription.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PurchaseBlock {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PurchaseBlock[] $VALUES;
    public static final PurchaseBlock CROSS_PLATFORM;
    public static final PurchaseBlock INELIGIBLE;

    static {
        PurchaseBlock purchaseBlock = new PurchaseBlock("CROSS_PLATFORM", 0);
        CROSS_PLATFORM = purchaseBlock;
        PurchaseBlock purchaseBlock2 = new PurchaseBlock("INELIGIBLE", 1);
        INELIGIBLE = purchaseBlock2;
        PurchaseBlock[] purchaseBlockArr = {purchaseBlock, purchaseBlock2};
        $VALUES = purchaseBlockArr;
        $ENTRIES = new F3w(purchaseBlockArr);
    }

    public static Ey9<PurchaseBlock> getEntries() {
        return $ENTRIES;
    }

    public static PurchaseBlock valueOf(String str) {
        return (PurchaseBlock) Enum.valueOf(PurchaseBlock.class, str);
    }

    public static PurchaseBlock[] values() {
        return (PurchaseBlock[]) $VALUES.clone();
    }

    public PurchaseBlock(String str, int i) {
    }
}
