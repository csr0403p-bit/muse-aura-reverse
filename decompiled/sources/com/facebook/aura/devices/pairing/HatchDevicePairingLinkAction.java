package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingLinkAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingLinkAction[] $VALUES;
    public static final HatchDevicePairingLinkAction ESTABLISH_PAIRING;
    public static final HatchDevicePairingLinkAction PROVISION;
    public static final HatchDevicePairingLinkAction WIFI_SCAN;

    static {
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction = new HatchDevicePairingLinkAction("ESTABLISH_PAIRING", 0);
        ESTABLISH_PAIRING = hatchDevicePairingLinkAction;
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction2 = new HatchDevicePairingLinkAction("WIFI_SCAN", 1);
        WIFI_SCAN = hatchDevicePairingLinkAction2;
        HatchDevicePairingLinkAction hatchDevicePairingLinkAction3 = new HatchDevicePairingLinkAction("PROVISION", 2);
        PROVISION = hatchDevicePairingLinkAction3;
        HatchDevicePairingLinkAction[] hatchDevicePairingLinkActionArr = {hatchDevicePairingLinkAction, hatchDevicePairingLinkAction2, hatchDevicePairingLinkAction3};
        $VALUES = hatchDevicePairingLinkActionArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingLinkActionArr);
    }

    public static Ey9<HatchDevicePairingLinkAction> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingLinkAction valueOf(String str) {
        return (HatchDevicePairingLinkAction) Enum.valueOf(HatchDevicePairingLinkAction.class, str);
    }

    public static HatchDevicePairingLinkAction[] values() {
        return (HatchDevicePairingLinkAction[]) $VALUES.clone();
    }

    public HatchDevicePairingLinkAction(String str, int i) {
    }
}
