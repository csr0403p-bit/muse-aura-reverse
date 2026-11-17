package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaAccountRecoveryEvent {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaAccountRecoveryEvent[] $VALUES;
    public static final HatchCaaAccountRecoveryEvent ACCOUNT_RECOVERY_START;
    public final String value;

    static {
        HatchCaaAccountRecoveryEvent hatchCaaAccountRecoveryEvent = new HatchCaaAccountRecoveryEvent("ACCOUNT_RECOVERY_START", 0, "account_recovery_start");
        ACCOUNT_RECOVERY_START = hatchCaaAccountRecoveryEvent;
        HatchCaaAccountRecoveryEvent[] hatchCaaAccountRecoveryEventArr = {hatchCaaAccountRecoveryEvent};
        $VALUES = hatchCaaAccountRecoveryEventArr;
        $ENTRIES = C3cG.A0w(hatchCaaAccountRecoveryEventArr);
    }

    public static Ey9<HatchCaaAccountRecoveryEvent> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaAccountRecoveryEvent valueOf(String str) {
        return (HatchCaaAccountRecoveryEvent) Enum.valueOf(HatchCaaAccountRecoveryEvent.class, str);
    }

    public static HatchCaaAccountRecoveryEvent[] values() {
        return (HatchCaaAccountRecoveryEvent[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaAccountRecoveryEvent(String str, int i, String str2) {
        this.value = str2;
    }
}
