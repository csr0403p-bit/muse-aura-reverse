package com.facebook.aura.analytics.hatch.caa;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.library.model.HatchLibraryViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCaaRegistrationEventStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCaaRegistrationEventStep[] $VALUES;
    public static final HatchCaaRegistrationEventStep ACCOUNT_CENTER_OPT_IN;
    public static final HatchCaaRegistrationEventStep ACCOUNT_CREATION;
    public static final HatchCaaRegistrationEventStep BIRTHDAY;
    public static final HatchCaaRegistrationEventStep CONFIRMATION;
    public static final HatchCaaRegistrationEventStep CONTACTPOINT;
    public static final HatchCaaRegistrationEventStep LANDING;
    public static final HatchCaaRegistrationEventStep NAME;
    public static final HatchCaaRegistrationEventStep TERMS_OF_SERVICE;
    public static final HatchCaaRegistrationEventStep UPSELL_AT_LOGIN;
    public final String value;

    static {
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep = new HatchCaaRegistrationEventStep("CONTACTPOINT", 0, "contactpoint");
        CONTACTPOINT = hatchCaaRegistrationEventStep;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep2 = new HatchCaaRegistrationEventStep(HatchLibraryViewModelKt.LEGACY_SORT_NAME, 1, "name");
        NAME = hatchCaaRegistrationEventStep2;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep3 = new HatchCaaRegistrationEventStep("BIRTHDAY", 2, "birthday");
        BIRTHDAY = hatchCaaRegistrationEventStep3;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep4 = new HatchCaaRegistrationEventStep("ACCOUNT_CREATION", 3, "account_creation");
        ACCOUNT_CREATION = hatchCaaRegistrationEventStep4;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep5 = new HatchCaaRegistrationEventStep("CONFIRMATION", 4, "confirmation");
        CONFIRMATION = hatchCaaRegistrationEventStep5;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep6 = new HatchCaaRegistrationEventStep("TERMS_OF_SERVICE", 5, "terms_of_service");
        TERMS_OF_SERVICE = hatchCaaRegistrationEventStep6;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep7 = new HatchCaaRegistrationEventStep("UPSELL_AT_LOGIN", 6, "upsell_at_login");
        UPSELL_AT_LOGIN = hatchCaaRegistrationEventStep7;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep8 = new HatchCaaRegistrationEventStep("LANDING", 7, "landing");
        LANDING = hatchCaaRegistrationEventStep8;
        HatchCaaRegistrationEventStep hatchCaaRegistrationEventStep9 = new HatchCaaRegistrationEventStep("ACCOUNT_CENTER_OPT_IN", 8, "account_center_opt_in");
        ACCOUNT_CENTER_OPT_IN = hatchCaaRegistrationEventStep9;
        HatchCaaRegistrationEventStep[] hatchCaaRegistrationEventStepArr = {hatchCaaRegistrationEventStep, hatchCaaRegistrationEventStep2, hatchCaaRegistrationEventStep3, hatchCaaRegistrationEventStep4, hatchCaaRegistrationEventStep5, hatchCaaRegistrationEventStep6, hatchCaaRegistrationEventStep7, hatchCaaRegistrationEventStep8, hatchCaaRegistrationEventStep9};
        $VALUES = hatchCaaRegistrationEventStepArr;
        $ENTRIES = C3cG.A0w(hatchCaaRegistrationEventStepArr);
    }

    public static Ey9<HatchCaaRegistrationEventStep> getEntries() {
        return $ENTRIES;
    }

    public static HatchCaaRegistrationEventStep valueOf(String str) {
        return (HatchCaaRegistrationEventStep) Enum.valueOf(HatchCaaRegistrationEventStep.class, str);
    }

    public static HatchCaaRegistrationEventStep[] values() {
        return (HatchCaaRegistrationEventStep[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public HatchCaaRegistrationEventStep(String str, int i, String str2) {
        this.value = str2;
    }
}
