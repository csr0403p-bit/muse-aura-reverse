package com.facebook.aura.gateway.store;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class VmSwitchCleanupType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ VmSwitchCleanupType[] $VALUES;
    public static final VmSwitchCleanupType FULL_DATA_RESET;
    public static final VmSwitchCleanupType SAME_ACCOUNT_SWITCH;

    static {
        VmSwitchCleanupType vmSwitchCleanupType = new VmSwitchCleanupType("SAME_ACCOUNT_SWITCH", 0);
        SAME_ACCOUNT_SWITCH = vmSwitchCleanupType;
        VmSwitchCleanupType vmSwitchCleanupType2 = new VmSwitchCleanupType("FULL_DATA_RESET", 1);
        FULL_DATA_RESET = vmSwitchCleanupType2;
        VmSwitchCleanupType[] vmSwitchCleanupTypeArr = {vmSwitchCleanupType, vmSwitchCleanupType2};
        $VALUES = vmSwitchCleanupTypeArr;
        $ENTRIES = C3cG.A0w(vmSwitchCleanupTypeArr);
    }

    public static Ey9<VmSwitchCleanupType> getEntries() {
        return $ENTRIES;
    }

    public static VmSwitchCleanupType valueOf(String str) {
        return (VmSwitchCleanupType) Enum.valueOf(VmSwitchCleanupType.class, str);
    }

    public static VmSwitchCleanupType[] values() {
        return (VmSwitchCleanupType[]) $VALUES.clone();
    }

    public VmSwitchCleanupType(String str, int i) {
    }
}
