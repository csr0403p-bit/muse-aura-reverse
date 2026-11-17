package com.facebook.aura.devices.link.ordering;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchLinkOrderDetailsPreparation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderDetailsPreparation[] $VALUES;
    public static final HatchLinkOrderDetailsPreparation COMPLETE;
    public static final HatchLinkOrderDetailsPreparation IN_PROGRESS;
    public static final HatchLinkOrderDetailsPreparation NOT_STARTED;

    static {
        HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation = new HatchLinkOrderDetailsPreparation("NOT_STARTED", 0);
        NOT_STARTED = hatchLinkOrderDetailsPreparation;
        HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation2 = new HatchLinkOrderDetailsPreparation("IN_PROGRESS", 1);
        IN_PROGRESS = hatchLinkOrderDetailsPreparation2;
        HatchLinkOrderDetailsPreparation hatchLinkOrderDetailsPreparation3 = new HatchLinkOrderDetailsPreparation("COMPLETE", 2);
        COMPLETE = hatchLinkOrderDetailsPreparation3;
        HatchLinkOrderDetailsPreparation[] hatchLinkOrderDetailsPreparationArr = {hatchLinkOrderDetailsPreparation, hatchLinkOrderDetailsPreparation2, hatchLinkOrderDetailsPreparation3};
        $VALUES = hatchLinkOrderDetailsPreparationArr;
        $ENTRIES = C3cG.A0w(hatchLinkOrderDetailsPreparationArr);
    }

    public static Ey9<HatchLinkOrderDetailsPreparation> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderDetailsPreparation valueOf(String str) {
        return (HatchLinkOrderDetailsPreparation) Enum.valueOf(HatchLinkOrderDetailsPreparation.class, str);
    }

    public static HatchLinkOrderDetailsPreparation[] values() {
        return (HatchLinkOrderDetailsPreparation[]) $VALUES.clone();
    }

    public HatchLinkOrderDetailsPreparation(String str, int i) {
    }
}
