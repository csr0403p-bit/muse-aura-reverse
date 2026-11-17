package com.facebook.aura.status.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BuyCreditsError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BuyCreditsError[] $VALUES;
    public static final BuyCreditsError LOAD_FAILED;
    public static final BuyCreditsError NO_PRODUCTS;

    static {
        BuyCreditsError buyCreditsError = new BuyCreditsError("NO_PRODUCTS", 0);
        NO_PRODUCTS = buyCreditsError;
        BuyCreditsError buyCreditsError2 = new BuyCreditsError("LOAD_FAILED", 1);
        LOAD_FAILED = buyCreditsError2;
        BuyCreditsError[] buyCreditsErrorArr = {buyCreditsError, buyCreditsError2};
        $VALUES = buyCreditsErrorArr;
        $ENTRIES = C3cG.A0w(buyCreditsErrorArr);
    }

    public static Ey9<BuyCreditsError> getEntries() {
        return $ENTRIES;
    }

    public static BuyCreditsError valueOf(String str) {
        return (BuyCreditsError) Enum.valueOf(BuyCreditsError.class, str);
    }

    public static BuyCreditsError[] values() {
        return (BuyCreditsError[]) $VALUES.clone();
    }

    public BuyCreditsError(String str, int i) {
    }
}
