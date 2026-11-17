package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingTriggerSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingTriggerSource[] $VALUES;
    public static final HatchDevicePairingTriggerSource DEEPLINK;
    public static final HatchDevicePairingTriggerSource MANUAL;
    public final String value;

    static {
        HatchDevicePairingTriggerSource hatchDevicePairingTriggerSource = new HatchDevicePairingTriggerSource("MANUAL", 0, "manual");
        MANUAL = hatchDevicePairingTriggerSource;
        HatchDevicePairingTriggerSource hatchDevicePairingTriggerSource2 = new HatchDevicePairingTriggerSource("DEEPLINK", 1, "deeplink");
        DEEPLINK = hatchDevicePairingTriggerSource2;
        HatchDevicePairingTriggerSource[] hatchDevicePairingTriggerSourceArr = {hatchDevicePairingTriggerSource, hatchDevicePairingTriggerSource2};
        $VALUES = hatchDevicePairingTriggerSourceArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingTriggerSourceArr);
    }

    public static Ey9<HatchDevicePairingTriggerSource> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingTriggerSource valueOf(String str) {
        return (HatchDevicePairingTriggerSource) Enum.valueOf(HatchDevicePairingTriggerSource.class, str);
    }

    public static HatchDevicePairingTriggerSource[] values() {
        return (HatchDevicePairingTriggerSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchDevicePairingTriggerSource(String str, int i, String str2) {
        this.value = str2;
    }
}
