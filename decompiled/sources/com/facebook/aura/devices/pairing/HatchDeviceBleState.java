package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDeviceBleState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDeviceBleState[] $VALUES;
    public static final HatchDeviceBleState BLUETOOTH_OFF;
    public static final HatchDeviceBleState CONNECTING;
    public static final HatchDeviceBleState CONNECTION_FAILED;
    public static final HatchDeviceBleState DISCOVERING_SERVICES;
    public static final HatchDeviceBleState FOUND;
    public static final HatchDeviceBleState IDLE;
    public static final HatchDeviceBleState NOT_FOUND;
    public static final HatchDeviceBleState READY;
    public static final HatchDeviceBleState SCANNING;

    static {
        HatchDeviceBleState hatchDeviceBleState = new HatchDeviceBleState("IDLE", 0);
        IDLE = hatchDeviceBleState;
        HatchDeviceBleState hatchDeviceBleState2 = new HatchDeviceBleState("SCANNING", 1);
        SCANNING = hatchDeviceBleState2;
        HatchDeviceBleState hatchDeviceBleState3 = new HatchDeviceBleState("FOUND", 2);
        FOUND = hatchDeviceBleState3;
        HatchDeviceBleState hatchDeviceBleState4 = new HatchDeviceBleState("CONNECTING", 3);
        CONNECTING = hatchDeviceBleState4;
        HatchDeviceBleState hatchDeviceBleState5 = new HatchDeviceBleState("DISCOVERING_SERVICES", 4);
        DISCOVERING_SERVICES = hatchDeviceBleState5;
        HatchDeviceBleState hatchDeviceBleState6 = new HatchDeviceBleState("READY", 5);
        READY = hatchDeviceBleState6;
        HatchDeviceBleState hatchDeviceBleState7 = new HatchDeviceBleState("CONNECTION_FAILED", 6);
        CONNECTION_FAILED = hatchDeviceBleState7;
        HatchDeviceBleState hatchDeviceBleState8 = new HatchDeviceBleState("NOT_FOUND", 7);
        NOT_FOUND = hatchDeviceBleState8;
        HatchDeviceBleState hatchDeviceBleState9 = new HatchDeviceBleState("BLUETOOTH_OFF", 8);
        BLUETOOTH_OFF = hatchDeviceBleState9;
        HatchDeviceBleState[] hatchDeviceBleStateArr = {hatchDeviceBleState, hatchDeviceBleState2, hatchDeviceBleState3, hatchDeviceBleState4, hatchDeviceBleState5, hatchDeviceBleState6, hatchDeviceBleState7, hatchDeviceBleState8, hatchDeviceBleState9};
        $VALUES = hatchDeviceBleStateArr;
        $ENTRIES = C3cG.A0w(hatchDeviceBleStateArr);
    }

    public static Ey9<HatchDeviceBleState> getEntries() {
        return $ENTRIES;
    }

    public static HatchDeviceBleState valueOf(String str) {
        return (HatchDeviceBleState) Enum.valueOf(HatchDeviceBleState.class, str);
    }

    public static HatchDeviceBleState[] values() {
        return (HatchDeviceBleState[]) $VALUES.clone();
    }

    public final boolean isConnectionFailed() {
        return AnonymousClass002.A1Z(this, CONNECTION_FAILED);
    }

    public final boolean isFailure() {
        return this == CONNECTION_FAILED || this == NOT_FOUND || this == BLUETOOTH_OFF;
    }

    public final boolean isReady() {
        return AnonymousClass002.A1Z(this, READY);
    }

    public HatchDeviceBleState(String str, int i) {
    }
}
