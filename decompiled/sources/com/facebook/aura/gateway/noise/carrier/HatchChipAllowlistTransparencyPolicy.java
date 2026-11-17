package com.facebook.aura.gateway.noise.carrier;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchChipAllowlistTransparencyPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchChipAllowlistTransparencyPolicy[] $VALUES;
    public static final HatchChipAllowlistTransparencyPolicy DEBUG;
    public static final HatchChipAllowlistTransparencyPolicy PRODUCTION;
    public static final HatchChipAllowlistTransparencyPolicy STAGING;
    public final int minChipCount;
    public final int nativeValue;

    static {
        HatchChipAllowlistTransparencyPolicy hatchChipAllowlistTransparencyPolicy = new HatchChipAllowlistTransparencyPolicy("PRODUCTION", 0, 0, 8000);
        PRODUCTION = hatchChipAllowlistTransparencyPolicy;
        HatchChipAllowlistTransparencyPolicy hatchChipAllowlistTransparencyPolicy2 = new HatchChipAllowlistTransparencyPolicy("STAGING", 1, 1, 8000);
        STAGING = hatchChipAllowlistTransparencyPolicy2;
        HatchChipAllowlistTransparencyPolicy hatchChipAllowlistTransparencyPolicy3 = new HatchChipAllowlistTransparencyPolicy("DEBUG", 2, 2, 1);
        DEBUG = hatchChipAllowlistTransparencyPolicy3;
        HatchChipAllowlistTransparencyPolicy[] hatchChipAllowlistTransparencyPolicyArr = {hatchChipAllowlistTransparencyPolicy, hatchChipAllowlistTransparencyPolicy2, hatchChipAllowlistTransparencyPolicy3};
        $VALUES = hatchChipAllowlistTransparencyPolicyArr;
        $ENTRIES = C3cG.A0w(hatchChipAllowlistTransparencyPolicyArr);
    }

    public static Ey9<HatchChipAllowlistTransparencyPolicy> getEntries() {
        return $ENTRIES;
    }

    public static HatchChipAllowlistTransparencyPolicy valueOf(String str) {
        return (HatchChipAllowlistTransparencyPolicy) Enum.valueOf(HatchChipAllowlistTransparencyPolicy.class, str);
    }

    public static HatchChipAllowlistTransparencyPolicy[] values() {
        return (HatchChipAllowlistTransparencyPolicy[]) $VALUES.clone();
    }

    public final int getMinChipCount$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier() {
        return this.minChipCount;
    }

    public final int getNativeValue$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier() {
        return this.nativeValue;
    }

    public HatchChipAllowlistTransparencyPolicy(String str, int i, int i2, int i3) {
        this.nativeValue = i2;
        this.minChipCount = i3;
    }
}
