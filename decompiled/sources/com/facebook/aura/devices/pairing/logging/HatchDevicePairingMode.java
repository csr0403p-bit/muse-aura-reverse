package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingMode[] $VALUES;
    public static final HatchDevicePairingMode FIRST_TIME;
    public static final HatchDevicePairingMode REPAIR;
    public final String value;

    static {
        HatchDevicePairingMode hatchDevicePairingMode = new HatchDevicePairingMode("FIRST_TIME", 0, "first_time");
        FIRST_TIME = hatchDevicePairingMode;
        HatchDevicePairingMode hatchDevicePairingMode2 = new HatchDevicePairingMode("REPAIR", 1, "repair");
        REPAIR = hatchDevicePairingMode2;
        HatchDevicePairingMode[] hatchDevicePairingModeArr = {hatchDevicePairingMode, hatchDevicePairingMode2};
        $VALUES = hatchDevicePairingModeArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingModeArr);
    }

    public static Ey9<HatchDevicePairingMode> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingMode valueOf(String str) {
        return (HatchDevicePairingMode) Enum.valueOf(HatchDevicePairingMode.class, str);
    }

    public static HatchDevicePairingMode[] values() {
        return (HatchDevicePairingMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchDevicePairingMode(String str, int i, String str2) {
        this.value = str2;
    }
}
