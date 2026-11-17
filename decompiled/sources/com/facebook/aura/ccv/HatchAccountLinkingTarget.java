package com.facebook.aura.ccv;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchAccountLinkingTarget {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAccountLinkingTarget[] $VALUES;
    public static final HatchAccountLinkingTarget FACEBOOK;
    public static final HatchAccountLinkingTarget INSTAGRAM;
    public static final HatchAccountLinkingTarget MESSENGER;
    public static final HatchAccountLinkingTarget THREADS;
    public final String wireValue;

    static {
        HatchAccountLinkingTarget hatchAccountLinkingTarget = new HatchAccountLinkingTarget("FACEBOOK", 0, "FACEBOOK");
        FACEBOOK = hatchAccountLinkingTarget;
        HatchAccountLinkingTarget hatchAccountLinkingTarget2 = new HatchAccountLinkingTarget("MESSENGER", 1, "MESSENGER");
        MESSENGER = hatchAccountLinkingTarget2;
        HatchAccountLinkingTarget hatchAccountLinkingTarget3 = new HatchAccountLinkingTarget("INSTAGRAM", 2, "INSTAGRAM");
        INSTAGRAM = hatchAccountLinkingTarget3;
        HatchAccountLinkingTarget hatchAccountLinkingTarget4 = new HatchAccountLinkingTarget("THREADS", 3, "THREADS");
        THREADS = hatchAccountLinkingTarget4;
        HatchAccountLinkingTarget[] hatchAccountLinkingTargetArr = {hatchAccountLinkingTarget, hatchAccountLinkingTarget2, hatchAccountLinkingTarget3, hatchAccountLinkingTarget4};
        $VALUES = hatchAccountLinkingTargetArr;
        $ENTRIES = C3cG.A0w(hatchAccountLinkingTargetArr);
    }

    public static Ey9<HatchAccountLinkingTarget> getEntries() {
        return $ENTRIES;
    }

    public static HatchAccountLinkingTarget valueOf(String str) {
        return (HatchAccountLinkingTarget) Enum.valueOf(HatchAccountLinkingTarget.class, str);
    }

    public static HatchAccountLinkingTarget[] values() {
        return (HatchAccountLinkingTarget[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchAccountLinkingTarget(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
