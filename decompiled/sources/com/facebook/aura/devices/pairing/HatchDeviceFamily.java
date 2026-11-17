package com.facebook.aura.devices.pairing;

import X.Ey9;
import X.F3w;
import java.util.Arrays;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchDeviceFamily {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchDeviceFamily[] $VALUES;
    public static final HatchDeviceFamily HATCH_LINK;
    public final List<String> namePrefixes;

    static {
        HatchDeviceFamily hatchDeviceFamily = new HatchDeviceFamily("HATCH_LINK", 0, Arrays.asList("HatchLink-", "HomeLink-"));
        HATCH_LINK = hatchDeviceFamily;
        HatchDeviceFamily[] hatchDeviceFamilyArr = {hatchDeviceFamily};
        $VALUES = hatchDeviceFamilyArr;
        $ENTRIES = new F3w(hatchDeviceFamilyArr);
    }

    public static Ey9<HatchDeviceFamily> getEntries() {
        return $ENTRIES;
    }

    public static HatchDeviceFamily valueOf(String str) {
        return (HatchDeviceFamily) Enum.valueOf(HatchDeviceFamily.class, str);
    }

    public static HatchDeviceFamily[] values() {
        return (HatchDeviceFamily[]) $VALUES.clone();
    }

    public final List<String> getNamePrefixes() {
        return this.namePrefixes;
    }

    public HatchDeviceFamily(String str, int i, List list) {
        this.namePrefixes = list;
    }
}
