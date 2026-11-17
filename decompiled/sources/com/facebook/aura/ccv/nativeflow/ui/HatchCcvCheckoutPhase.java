package com.facebook.aura.ccv.nativeflow.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchCcvCheckoutPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCcvCheckoutPhase[] $VALUES;
    public static final HatchCcvCheckoutPhase LOADING;
    public static final HatchCcvCheckoutPhase READY;
    public static final HatchCcvCheckoutPhase UNAVAILABLE;

    static {
        HatchCcvCheckoutPhase hatchCcvCheckoutPhase = new HatchCcvCheckoutPhase("LOADING", 0);
        LOADING = hatchCcvCheckoutPhase;
        HatchCcvCheckoutPhase hatchCcvCheckoutPhase2 = new HatchCcvCheckoutPhase("READY", 1);
        READY = hatchCcvCheckoutPhase2;
        HatchCcvCheckoutPhase hatchCcvCheckoutPhase3 = new HatchCcvCheckoutPhase("UNAVAILABLE", 2);
        UNAVAILABLE = hatchCcvCheckoutPhase3;
        HatchCcvCheckoutPhase[] hatchCcvCheckoutPhaseArr = {hatchCcvCheckoutPhase, hatchCcvCheckoutPhase2, hatchCcvCheckoutPhase3};
        $VALUES = hatchCcvCheckoutPhaseArr;
        $ENTRIES = C3cG.A0w(hatchCcvCheckoutPhaseArr);
    }

    public static Ey9<HatchCcvCheckoutPhase> getEntries() {
        return $ENTRIES;
    }

    public static HatchCcvCheckoutPhase valueOf(String str) {
        return (HatchCcvCheckoutPhase) Enum.valueOf(HatchCcvCheckoutPhase.class, str);
    }

    public static HatchCcvCheckoutPhase[] values() {
        return (HatchCcvCheckoutPhase[]) $VALUES.clone();
    }

    public HatchCcvCheckoutPhase(String str, int i) {
    }
}
