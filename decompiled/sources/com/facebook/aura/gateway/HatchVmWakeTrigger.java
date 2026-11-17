package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchVmWakeTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchVmWakeTrigger[] $VALUES;
    public static final HatchVmWakeTrigger BACKGROUND_CYCLE;
    public static final HatchVmWakeTrigger CONNECT_FAILURE;
    public static final HatchVmWakeTrigger PRECONNECT;
    public static final HatchVmWakeTrigger STARTUP;
    public final String value;

    static {
        HatchVmWakeTrigger hatchVmWakeTrigger = new HatchVmWakeTrigger("STARTUP", 0, "startup");
        STARTUP = hatchVmWakeTrigger;
        HatchVmWakeTrigger hatchVmWakeTrigger2 = new HatchVmWakeTrigger("PRECONNECT", 1, "preconnect");
        PRECONNECT = hatchVmWakeTrigger2;
        HatchVmWakeTrigger hatchVmWakeTrigger3 = new HatchVmWakeTrigger("CONNECT_FAILURE", 2, "connect_failure");
        CONNECT_FAILURE = hatchVmWakeTrigger3;
        HatchVmWakeTrigger hatchVmWakeTrigger4 = new HatchVmWakeTrigger("BACKGROUND_CYCLE", 3, "background_cycle");
        BACKGROUND_CYCLE = hatchVmWakeTrigger4;
        HatchVmWakeTrigger[] hatchVmWakeTriggerArr = {hatchVmWakeTrigger, hatchVmWakeTrigger2, hatchVmWakeTrigger3, hatchVmWakeTrigger4};
        $VALUES = hatchVmWakeTriggerArr;
        $ENTRIES = C3cG.A0w(hatchVmWakeTriggerArr);
    }

    public static Ey9<HatchVmWakeTrigger> getEntries() {
        return $ENTRIES;
    }

    public static HatchVmWakeTrigger valueOf(String str) {
        return (HatchVmWakeTrigger) Enum.valueOf(HatchVmWakeTrigger.class, str);
    }

    public static HatchVmWakeTrigger[] values() {
        return (HatchVmWakeTrigger[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchVmWakeTrigger(String str, int i, String str2) {
        this.value = str2;
    }
}
