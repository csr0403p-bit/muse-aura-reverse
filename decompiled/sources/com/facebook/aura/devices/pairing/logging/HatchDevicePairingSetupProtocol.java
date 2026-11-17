package com.facebook.aura.devices.pairing.logging;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchDevicePairingSetupProtocol {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDevicePairingSetupProtocol[] $VALUES;
    public static final HatchDevicePairingSetupProtocol ENCRYPTED_LINK;
    public static final HatchDevicePairingSetupProtocol LEGACY;
    public static final HatchDevicePairingSetupProtocol UNKNOWN;
    public final String value;

    static {
        HatchDevicePairingSetupProtocol hatchDevicePairingSetupProtocol = new HatchDevicePairingSetupProtocol("UNKNOWN", 0, "unknown");
        UNKNOWN = hatchDevicePairingSetupProtocol;
        HatchDevicePairingSetupProtocol hatchDevicePairingSetupProtocol2 = new HatchDevicePairingSetupProtocol("LEGACY", 1, "legacy");
        LEGACY = hatchDevicePairingSetupProtocol2;
        HatchDevicePairingSetupProtocol hatchDevicePairingSetupProtocol3 = new HatchDevicePairingSetupProtocol("ENCRYPTED_LINK", 2, "encrypted_link");
        ENCRYPTED_LINK = hatchDevicePairingSetupProtocol3;
        HatchDevicePairingSetupProtocol[] hatchDevicePairingSetupProtocolArr = {hatchDevicePairingSetupProtocol, hatchDevicePairingSetupProtocol2, hatchDevicePairingSetupProtocol3};
        $VALUES = hatchDevicePairingSetupProtocolArr;
        $ENTRIES = C3cG.A0w(hatchDevicePairingSetupProtocolArr);
    }

    public static Ey9<HatchDevicePairingSetupProtocol> getEntries() {
        return $ENTRIES;
    }

    public static HatchDevicePairingSetupProtocol valueOf(String str) {
        return (HatchDevicePairingSetupProtocol) Enum.valueOf(HatchDevicePairingSetupProtocol.class, str);
    }

    public static HatchDevicePairingSetupProtocol[] values() {
        return (HatchDevicePairingSetupProtocol[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchDevicePairingSetupProtocol(String str, int i, String str2) {
        this.value = str2;
    }
}
