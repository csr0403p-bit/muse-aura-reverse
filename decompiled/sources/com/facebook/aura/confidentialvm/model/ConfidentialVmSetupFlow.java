package com.facebook.aura.confidentialvm.model;

import X.Ey9;
import X.F3w;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmSetupFlow {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmSetupFlow[] $VALUES;
    public static final ConfidentialVmSetupFlow ONBOARDING;
    public static final ConfidentialVmSetupFlow SWITCH;
    public final HatchSubsurface impressionSubsurface;
    public final HatchOrigin origin;
    public final HatchSurface surface;

    static {
        ConfidentialVmSetupFlow confidentialVmSetupFlow = new ConfidentialVmSetupFlow("ONBOARDING", 0, HatchSurface.ONBOARDING, HatchOrigin.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH);
        ONBOARDING = confidentialVmSetupFlow;
        ConfidentialVmSetupFlow confidentialVmSetupFlow2 = new ConfidentialVmSetupFlow("SWITCH", 1, HatchSurface.CVM_SWITCH, HatchOrigin.CVM_SWITCH, null);
        SWITCH = confidentialVmSetupFlow2;
        ConfidentialVmSetupFlow[] confidentialVmSetupFlowArr = {confidentialVmSetupFlow, confidentialVmSetupFlow2};
        $VALUES = confidentialVmSetupFlowArr;
        $ENTRIES = new F3w(confidentialVmSetupFlowArr);
    }

    public static Ey9<ConfidentialVmSetupFlow> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmSetupFlow valueOf(String str) {
        return (ConfidentialVmSetupFlow) Enum.valueOf(ConfidentialVmSetupFlow.class, str);
    }

    public static ConfidentialVmSetupFlow[] values() {
        return (ConfidentialVmSetupFlow[]) $VALUES.clone();
    }

    public final HatchSubsurface getImpressionSubsurface() {
        return this.impressionSubsurface;
    }

    public final HatchOrigin getOrigin() {
        return this.origin;
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public ConfidentialVmSetupFlow(String str, int i, HatchSurface hatchSurface, HatchOrigin hatchOrigin, HatchSubsurface hatchSubsurface) {
        this.surface = hatchSurface;
        this.origin = hatchOrigin;
        this.impressionSubsurface = hatchSubsurface;
    }
}
