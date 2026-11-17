package com.facebook.aura.confidentialvm.model;

import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;

/* loaded from: classes.dex */
public final class ConfidentialVmSheetLogger {
    public static final int $stable = 0;
    public static final ConfidentialVmSheetLogger INSTANCE = new ConfidentialVmSheetLogger();

    private final void logOffWaitlistTap(HatchComponent hatchComponent) {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_OFF_WAITLIST_SHEET, hatchComponent, ConfidentialVmSwitchEntryPoint.OFF_WAITLIST_PUSH, ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, null);
    }

    public final void logOffWaitlistNotNowTap() {
        logOffWaitlistTap(HatchComponent.NOT_NOW_BUTTON);
    }

    public final void logOffWaitlistShown() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchScreenView(HatchScreen.CVM_OFF_WAITLIST_SHEET, ConfidentialVmSwitchEntryPoint.OFF_WAITLIST_PUSH, ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM);
    }

    public final void logOffWaitlistSwitchTap() {
        logOffWaitlistTap(HatchComponent.CVM_SWITCH_BUTTON);
    }

    public final void logPinHelpHelpSupportTap() {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpTap(HatchComponent.HELP_SUPPORT_BUTTON);
    }

    public final void logPinHelpManageAccountTap() {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpTap(HatchComponent.MANAGE_ACCOUNT_BUTTON);
    }

    public final void logPinHelpResetTap() {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpTap(HatchComponent.RESET_HATCH_BUTTON);
    }

    public final void logPinHelpSetNewPinTap() {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpTap(HatchComponent.CHANGE_RECOVERY_PIN_BUTTON);
    }

    public final void logPinHelpShown() {
        ConfidentialVmAnalytics.INSTANCE.logPinHelpShown();
    }

    public final void logPinResetConfirmed() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinResetClick();
    }
}
