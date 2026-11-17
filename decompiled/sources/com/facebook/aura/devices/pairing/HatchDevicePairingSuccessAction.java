package com.facebook.aura.devices.pairing;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingSuccessAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingSuccessAction[] $VALUES;
    public static final HatchDevicePairingSuccessAction OPEN_SUCCESS_DESTINATION;
    public static final HatchDevicePairingSuccessAction RETURN_TO_CALLER;

    static {
        HatchDevicePairingSuccessAction hatchDevicePairingSuccessAction = new HatchDevicePairingSuccessAction("OPEN_SUCCESS_DESTINATION", 0);
        OPEN_SUCCESS_DESTINATION = hatchDevicePairingSuccessAction;
        HatchDevicePairingSuccessAction hatchDevicePairingSuccessAction2 = new HatchDevicePairingSuccessAction("RETURN_TO_CALLER", 1);
        RETURN_TO_CALLER = hatchDevicePairingSuccessAction2;
        HatchDevicePairingSuccessAction[] hatchDevicePairingSuccessActionArr = {hatchDevicePairingSuccessAction, hatchDevicePairingSuccessAction2};
        $VALUES = hatchDevicePairingSuccessActionArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingSuccessActionArr);
    }

    public static Ey9<HatchDevicePairingSuccessAction> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingSuccessAction valueOf(String str) {
        return (HatchDevicePairingSuccessAction) Enum.valueOf(HatchDevicePairingSuccessAction.class, str);
    }

    public static HatchDevicePairingSuccessAction[] values() {
        return (HatchDevicePairingSuccessAction[]) $VALUES.clone();
    }

    public HatchDevicePairingSuccessAction(String str, int i) {
    }
}
