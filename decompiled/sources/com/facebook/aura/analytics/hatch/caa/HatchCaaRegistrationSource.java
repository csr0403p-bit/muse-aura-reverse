package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRegistrationSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRegistrationSource[] $VALUES;
    public static final HatchCaaRegistrationSource PASSKEY;
    public static final HatchCaaRegistrationSource SIGN_IN_WITH_GOOGLE;
    public static final HatchCaaRegistrationSource ZARI;
    public final String value;

    static {
        HatchCaaRegistrationSource hatchCaaRegistrationSource = new HatchCaaRegistrationSource("ZARI", 0, "zari");
        ZARI = hatchCaaRegistrationSource;
        HatchCaaRegistrationSource hatchCaaRegistrationSource2 = new HatchCaaRegistrationSource("SIGN_IN_WITH_GOOGLE", 1, "sign_in_with_google");
        SIGN_IN_WITH_GOOGLE = hatchCaaRegistrationSource2;
        HatchCaaRegistrationSource hatchCaaRegistrationSource3 = new HatchCaaRegistrationSource("PASSKEY", 2, "passkey");
        PASSKEY = hatchCaaRegistrationSource3;
        HatchCaaRegistrationSource[] hatchCaaRegistrationSourceArr = {hatchCaaRegistrationSource, hatchCaaRegistrationSource2, hatchCaaRegistrationSource3};
        $VALUES = hatchCaaRegistrationSourceArr;
        $ENTRIES = C3cG.A0w(hatchCaaRegistrationSourceArr);
    }

    public static Ey9<HatchCaaRegistrationSource> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRegistrationSource valueOf(String str) {
        return (HatchCaaRegistrationSource) Enum.valueOf(HatchCaaRegistrationSource.class, str);
    }

    public static HatchCaaRegistrationSource[] values() {
        return (HatchCaaRegistrationSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaRegistrationSource(String str, int i, String str2) {
        this.value = str2;
    }
}
