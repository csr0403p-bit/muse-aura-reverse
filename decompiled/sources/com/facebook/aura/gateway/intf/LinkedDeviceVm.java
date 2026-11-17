package com.facebook.aura.gateway.intf;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LinkedDeviceVm {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LinkedDeviceVm[] $VALUES;
    public static final LinkedDeviceVm CURRENT;
    public static final LinkedDeviceVm NONE;
    public static final LinkedDeviceVm UNAVAILABLE;

    static {
        LinkedDeviceVm linkedDeviceVm = new LinkedDeviceVm("CURRENT", 0);
        CURRENT = linkedDeviceVm;
        LinkedDeviceVm linkedDeviceVm2 = new LinkedDeviceVm(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 1);
        NONE = linkedDeviceVm2;
        LinkedDeviceVm linkedDeviceVm3 = new LinkedDeviceVm("UNAVAILABLE", 2);
        UNAVAILABLE = linkedDeviceVm3;
        LinkedDeviceVm[] linkedDeviceVmArr = {linkedDeviceVm, linkedDeviceVm2, linkedDeviceVm3};
        $VALUES = linkedDeviceVmArr;
        $ENTRIES = C3cG.A0w(linkedDeviceVmArr);
    }

    public static Ey9<LinkedDeviceVm> getEntries() {
        return $ENTRIES;
    }

    public static LinkedDeviceVm valueOf(String str) {
        return (LinkedDeviceVm) Enum.valueOf(LinkedDeviceVm.class, str);
    }

    public static LinkedDeviceVm[] values() {
        return (LinkedDeviceVm[]) $VALUES.clone();
    }

    public LinkedDeviceVm(String str, int i) {
    }
}
