package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.perf.HatchConnectorQplLogger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaLoginEventStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaLoginEventStep[] $VALUES;
    public static final HatchCaaLoginEventStep ACCOUNT_SELECTOR;
    public static final HatchCaaLoginEventStep CONTACTPOINT;
    public static final HatchCaaLoginEventStep LANDING;
    public static final HatchCaaLoginEventStep OTP;
    public static final HatchCaaLoginEventStep PASSKEY;
    public static final HatchCaaLoginEventStep PASSWORD;
    public static final HatchCaaLoginEventStep TOS;
    public static final HatchCaaLoginEventStep TWO_FAC_REDIRECT;
    public final String value;

    static {
        HatchCaaLoginEventStep hatchCaaLoginEventStep = new HatchCaaLoginEventStep("CONTACTPOINT", 0, "contactpoint");
        CONTACTPOINT = hatchCaaLoginEventStep;
        HatchCaaLoginEventStep hatchCaaLoginEventStep2 = new HatchCaaLoginEventStep("OTP", 1, "otp");
        OTP = hatchCaaLoginEventStep2;
        HatchCaaLoginEventStep hatchCaaLoginEventStep3 = new HatchCaaLoginEventStep("PASSKEY", 2, "passkey");
        PASSKEY = hatchCaaLoginEventStep3;
        HatchCaaLoginEventStep hatchCaaLoginEventStep4 = new HatchCaaLoginEventStep("PASSWORD", 3, HatchConnectorQplLogger.AuthType.PASSWORD);
        PASSWORD = hatchCaaLoginEventStep4;
        HatchCaaLoginEventStep hatchCaaLoginEventStep5 = new HatchCaaLoginEventStep("TOS", 4, "tos");
        TOS = hatchCaaLoginEventStep5;
        HatchCaaLoginEventStep hatchCaaLoginEventStep6 = new HatchCaaLoginEventStep("LANDING", 5, "landing");
        LANDING = hatchCaaLoginEventStep6;
        HatchCaaLoginEventStep hatchCaaLoginEventStep7 = new HatchCaaLoginEventStep("ACCOUNT_SELECTOR", 6, "ACCOUNT_SELECTOR");
        ACCOUNT_SELECTOR = hatchCaaLoginEventStep7;
        HatchCaaLoginEventStep hatchCaaLoginEventStep8 = new HatchCaaLoginEventStep("TWO_FAC_REDIRECT", 7, "two_fac_redirect");
        TWO_FAC_REDIRECT = hatchCaaLoginEventStep8;
        HatchCaaLoginEventStep[] hatchCaaLoginEventStepArr = {hatchCaaLoginEventStep, hatchCaaLoginEventStep2, hatchCaaLoginEventStep3, hatchCaaLoginEventStep4, hatchCaaLoginEventStep5, hatchCaaLoginEventStep6, hatchCaaLoginEventStep7, hatchCaaLoginEventStep8};
        $VALUES = hatchCaaLoginEventStepArr;
        $ENTRIES = C3cG.A0w(hatchCaaLoginEventStepArr);
    }

    public static Ey9<HatchCaaLoginEventStep> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaLoginEventStep valueOf(String str) {
        return (HatchCaaLoginEventStep) Enum.valueOf(HatchCaaLoginEventStep.class, str);
    }

    public static HatchCaaLoginEventStep[] values() {
        return (HatchCaaLoginEventStep[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaLoginEventStep(String str, int i, String str2) {
        this.value = str2;
    }
}
