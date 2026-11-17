package com.facebook.aura.confidentialvm.model;

import X.AGH;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConfidentialVmAnalytics {
    public static final int $stable = 0;
    public static final ConfidentialVmAnalytics INSTANCE = new ConfidentialVmAnalytics();
    public static final String SWITCH_EVENT_NAME = "cvm_switch";
    public static final String SWITCH_RESULT_ERROR = "error";
    public static final String SWITCH_RESULT_REFUSED = "refused";
    public static final String SWITCH_RESULT_SUCCESS = "success";
    public static final String UPGRADE_PUSH_EVENT_NAME = "cvm_upgrade_push";

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logCredentialErrorImpression(com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice r5, com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint r6, com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r7) {
        /*
            r4 = this;
            r0 = 2
            r3 = 0
            X.C7384Etj.A0Y(r7, r0)
            r2 = -1
            if (r5 == 0) goto L1e
            int[] r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics.WhenMappings.$EnumSwitchMapping$0
            int r1 = r5.ordinal()
            if (r1 == r2) goto L1e
            r0 = 1
            if (r1 == r0) goto L1b
            if (r1 == r3) goto L1e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L1b:
            com.facebook.aura.analytics.hatch.HatchScreen r0 = com.facebook.aura.analytics.hatch.HatchScreen.CVM_DELETE_DATA_SHEET
            goto L20
        L1e:
            com.facebook.aura.analytics.hatch.HatchScreen r0 = com.facebook.aura.analytics.hatch.HatchScreen.CVM_DATA_CHOICE
        L20:
            r4.logSwitchErrorImpression(r0, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics.logCredentialErrorImpression(com.facebook.aura.confidentialvm.model.ConfidentialVmDataChoice, com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint, com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection):void");
    }

    public final void logDataChoiceContinueTap(ConfidentialVmDataChoice confidentialVmDataChoice, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 2);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface analyticsSurface = ConfidentialVmAnalyticsKt.getAnalyticsSurface(confidentialVmSwitchDirection);
        HatchScreen hatchScreen = HatchScreen.CVM_DATA_CHOICE;
        HatchComponent hatchComponent = HatchComponent.CONTINUE_BUTTON;
        Map<String, String> mapEntryPointMetadata = entryPointMetadata(confidentialVmSwitchEntryPoint);
        if (mapEntryPointMetadata == null) {
            mapEntryPointMetadata = AGH.A0E();
        }
        hatchInteractionLogger.logClick(analyticsSurface, null, hatchScreen, hatchComponent, null, AGH.A08(AbstractC0885AGm.A0z(confidentialVmDataChoice != null ? new HxE(HatchMetadataKey.DATA_CHOICE.getValue(), ConfidentialVmAnalyticsKt.getAnalyticsValue(confidentialVmDataChoice)) : null), mapEntryPointMetadata), null);
    }

    public final void logDataChoiceOptionTap(ConfidentialVmDataChoice confidentialVmDataChoice, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        AnonymousClass003.A0v(confidentialVmDataChoice, confidentialVmSwitchDirection);
        logSwitchTap(HatchScreen.CVM_DATA_CHOICE, ConfidentialVmAnalyticsKt.getOptionComponent(confidentialVmDataChoice), confidentialVmSwitchEntryPoint, confidentialVmSwitchDirection, null);
    }

    public final void logGlassesUnavailableNoticeView(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 1);
        logSwitchImpression(HatchScreen.CVM_DATA_CHOICE, HatchComponent.CVM_GLASSES_UNAVAILABLE_NOTICE, confidentialVmSwitchEntryPoint, confidentialVmSwitchDirection);
    }

    public final HatchScreen logIntroImpression(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, HatchScreen hatchScreen) {
        HatchComponent hatchComponentIntroImpressionComponent;
        C7384Etj.A0Y(confidentialVmSwitchDestination, 0);
        HatchScreen hatchScreenIntroScreen = ConfidentialVmAnalyticsKt.introScreen(confidentialVmSwitchDestination);
        if (hatchScreenIntroScreen == null || (hatchComponentIntroImpressionComponent = ConfidentialVmAnalyticsKt.introImpressionComponent(confidentialVmSwitchDestination)) == null || hatchScreenIntroScreen == hatchScreen) {
            return hatchScreen;
        }
        logSwitchImpression(hatchScreenIntroScreen, hatchComponentIntroImpressionComponent, confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM);
        return hatchScreenIntroScreen;
    }

    public final void logIntroPrimaryTap(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        C7384Etj.A0Y(confidentialVmSwitchDestination, 0);
        HatchComponent hatchComponentIntroPrimaryComponent = ConfidentialVmAnalyticsKt.introPrimaryComponent(confidentialVmSwitchDestination);
        if (hatchComponentIntroPrimaryComponent != null) {
            logIntroTap(confidentialVmSwitchDestination, hatchComponentIntroPrimaryComponent, confidentialVmSwitchEntryPoint);
        }
    }

    public final void logIntroTap(ConfidentialVmSwitchDestination confidentialVmSwitchDestination, HatchComponent hatchComponent, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        AnonymousClass003.A0u(confidentialVmSwitchDestination, hatchComponent);
        HatchScreen hatchScreenIntroScreen = ConfidentialVmAnalyticsKt.introScreen(confidentialVmSwitchDestination);
        if (hatchScreenIntroScreen != null) {
            logSwitchTap(hatchScreenIntroScreen, hatchComponent, confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, null);
        }
    }

    public final void logMenuOpen(HatchScreen hatchScreen, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        AnonymousClass003.A0u(hatchScreen, confidentialVmSwitchDirection);
        HatchInteractionLogger.INSTANCE.logClick(ConfidentialVmAnalyticsKt.getAnalyticsSurface(confidentialVmSwitchDirection), null, hatchScreen, HatchComponent.THREE_DOTS_MENU, null, null, null);
    }

    public final void logMenuTap(HatchScreen hatchScreen, HatchComponent hatchComponent, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        AnonymousClass005.A0x(hatchScreen, hatchComponent, confidentialVmSwitchDirection);
        HatchInteractionLogger.INSTANCE.logClick(ConfidentialVmAnalyticsKt.getAnalyticsSurface(confidentialVmSwitchDirection), HatchSubsurface.DOT_MENU, hatchScreen, hatchComponent, null, null, null);
    }

    public final void logPinHelpTap(HatchComponent hatchComponent) {
        AnonymousClass006.A0b(hatchComponent).logClick(HatchSurface.CVM_PIN_RECOVERY, null, HatchScreen.CVM_PIN_HELP, hatchComponent, null, null, null);
    }

    public final void logPinLookupFailed(RegisterPinFlow registerPinFlow) {
        C7384Etj.A0Y(registerPinFlow, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = registerPinFlow.ordinal();
        if (iOrdinal == 2) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinLookupFailedView();
        } else if (iOrdinal != 1 && iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void logPinLookupFailureLogOutTap(RegisterPinFlow registerPinFlow) {
        C7384Etj.A0Y(registerPinFlow, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = registerPinFlow.ordinal();
        if (iOrdinal == 2) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinLogoutClick();
        } else if (iOrdinal != 1 && iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void logPinRegistrationAccepted(RegisterPinFlow registerPinFlow) {
        C7384Etj.A0Y(registerPinFlow, 0);
        logPinChange(registerPinFlow, HatchClientCvmOutcome.SUCCESS);
    }

    public final void logPinRegistrationFailed(RegisterPinFlow registerPinFlow) {
        C7384Etj.A0Y(registerPinFlow, 0);
        logPinChange(registerPinFlow, HatchClientCvmOutcome.FAILURE);
    }

    public final void logPinRegistrationSubmitted(RegisterPinFlow registerPinFlow) {
        C7384Etj.A0Y(registerPinFlow, 0);
        logPinChange(registerPinFlow, HatchClientCvmOutcome.ATTEMPT);
    }

    public final void logSetupImpression(RegisterPinEntryPoint registerPinEntryPoint, HatchScreen hatchScreen, HatchComponent hatchComponent) {
        ConfidentialVmSetupFlow setupFlow;
        AnonymousClass003.A0x(hatchScreen, hatchComponent);
        if (registerPinEntryPoint == null || (setupFlow = ConfidentialVmAnalyticsKt.getSetupFlow(registerPinEntryPoint)) == null) {
            return;
        }
        HatchImpressionLogger.INSTANCE.logImpression(setupFlow.getOrigin(), setupFlow.getSurface(), setupFlow.getImpressionSubsurface(), hatchScreen, hatchComponent, null, null, null);
    }

    public final void logSetupTap(RegisterPinEntryPoint registerPinEntryPoint, HatchScreen hatchScreen, HatchComponent hatchComponent) {
        ConfidentialVmSetupFlow setupFlow;
        AnonymousClass003.A0x(hatchScreen, hatchComponent);
        if (registerPinEntryPoint == null || (setupFlow = ConfidentialVmAnalyticsKt.getSetupFlow(registerPinEntryPoint)) == null) {
            return;
        }
        HatchInteractionLogger.INSTANCE.logClick(setupFlow.getSurface(), null, hatchScreen, hatchComponent, null, null, null);
    }

    public final void logStartFreshRunCompleted(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 1) {
            HatchClientCvmEventLogger.INSTANCE.logCvmDowngrade(HatchClientCvmOutcome.SUCCESS);
        } else {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            HatchClientCvmEventLogger.INSTANCE.logCvmSwitchStartFreshCompleted();
            logSwitchOutcome(HatchScreen.CVM_SWITCH_PROGRESS, "success");
        }
    }

    public final void logStartFreshRunFailed(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, boolean z) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            HatchClientCvmEventLogger.INSTANCE.logCvmSwitchStartFreshFailed();
            logSwitchOutcome(HatchScreen.CVM_SWITCH_PROGRESS, z ? SWITCH_RESULT_REFUSED : "error");
            return;
        }
        HatchClientCvmEventLogger hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
        if (z) {
            hatchClientCvmEventLogger.logCvmDowngradeRefused();
        } else {
            hatchClientCvmEventLogger.logCvmDowngrade(HatchClientCvmOutcome.FAILURE);
        }
    }

    public final void logStartFreshRunStarted(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        logDowngrade(confidentialVmSwitchDirection, HatchClientCvmOutcome.ATTEMPT);
    }

    public final void logSwitchBackDataChoiceContinue(ConfidentialVmDataChoice confidentialVmDataChoice, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 1);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (confidentialVmDataChoice == ConfidentialVmDataChoice.UPGRADE_MIGRATION) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackKeepDataClick();
        }
    }

    public final void logSwitchBackDataChoiceOptionTap(ConfidentialVmDataChoice confidentialVmDataChoice, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        boolean zA1a = AnonymousClass002.A1a(confidentialVmDataChoice, confidentialVmSwitchDirection);
        if (confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_SECURE_VM) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = confidentialVmDataChoice.ordinal();
            if (iOrdinal == zA1a) {
                HatchClientCvmEventLogger.INSTANCE.logSwitchBackStartFreshOptionClick();
            } else {
                if (iOrdinal != 0) {
                    throw new NoWhenBranchMatchedException();
                }
                HatchClientCvmEventLogger.INSTANCE.logSwitchBackKeepDataOptionClick();
            }
        }
    }

    public final void logSwitchBackDeleteCancelTap(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        if (confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_SECURE_VM) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackDeleteCancelClick();
        }
    }

    public final void logSwitchBackDeleteConfirmed(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 1) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackStartFreshClick();
        } else if (iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void logSwitchBackDismissTap(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        if (confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_SECURE_VM) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackDismissClick();
        }
    }

    public final void logSwitchBackDownloadTap(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        if (confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_SECURE_VM) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackDownloadClick();
        }
    }

    public final void logSwitchBackLearnMoreTap(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        if (confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_SECURE_VM) {
            HatchClientCvmEventLogger.INSTANCE.logSwitchBackLearnMoreClick();
        }
    }

    public final void logTransferRunCompleted(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 1) {
            HatchClientCvmEventLogger.INSTANCE.logCvmDowngrade(HatchClientCvmOutcome.SUCCESS);
        } else {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            HatchClientCvmEventLogger.INSTANCE.logCvmSwitchTransferCompleted();
            logSwitchOutcome(HatchScreen.CVM_TRANSFER_PROGRESS, "success");
        }
    }

    public final void logTransferRunFailed(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, boolean z) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 1) {
            HatchClientCvmEventLogger.INSTANCE.logCvmDowngrade(HatchClientCvmOutcome.FAILURE);
        } else {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                HatchClientCvmEventLogger.INSTANCE.logCvmSwitchTransferFailed();
            }
            logSwitchOutcome(HatchScreen.CVM_TRANSFER_PROGRESS, "error");
        }
    }

    public final void logTransferRunStarted(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        logDowngrade(confidentialVmSwitchDirection, HatchClientCvmOutcome.ATTEMPT);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ConfidentialVmDataChoice.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmDataChoice.START_FRESH, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmDataChoice.UPGRADE_MIGRATION, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RegisterPinFlow.values().length];
            try {
                AnonymousClass005.A0v(RegisterPinFlow.ACCESS_CONTROLLED_ENROLLMENT, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinFlow.ONBOARDING_ENROLLMENT, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(RegisterPinFlow.PIN_CHANGE, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConfidentialVmSwitchDirection.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDirection.TO_SECURE_VM, iArr3, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, iArr3, 2);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final Map<String, String> entryPointMetadata(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        if (confidentialVmSwitchEntryPoint != null) {
            return AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), confidentialVmSwitchEntryPoint.getAnalyticsValue());
        }
        return null;
    }

    private final void ifSwitchingBack(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, Function0<Unit> function0) {
        if (confidentialVmSwitchDirection == ConfidentialVmSwitchDirection.TO_SECURE_VM) {
            function0.invoke();
        }
    }

    private final void logDowngrade(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, HatchClientCvmOutcome hatchClientCvmOutcome) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 1) {
            HatchClientCvmEventLogger.INSTANCE.logCvmDowngrade(hatchClientCvmOutcome);
        } else if (iOrdinal != 0) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void logPinChange(RegisterPinFlow registerPinFlow, HatchClientCvmOutcome hatchClientCvmOutcome) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = registerPinFlow.ordinal();
        if (iOrdinal == 2) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinCreate(hatchClientCvmOutcome);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 0) {
                throw new NoWhenBranchMatchedException();
            }
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinChange(hatchClientCvmOutcome);
        }
    }

    private final void logRecoveryPinVerify(RegisterPinEntryPoint registerPinEntryPoint, HatchClientCvmOutcome hatchClientCvmOutcome) {
        if (registerPinEntryPoint == null || ConfidentialVmAnalyticsKt.getSetupFlow(registerPinEntryPoint) == null) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinVerify(hatchClientCvmOutcome);
        }
    }

    private final void logSwitchImpression(HatchScreen hatchScreen, HatchComponent hatchComponent, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        HatchImpressionLogger.INSTANCE.logImpression(ConfidentialVmAnalyticsKt.getOrigin(confidentialVmSwitchDirection), ConfidentialVmAnalyticsKt.getAnalyticsSurface(confidentialVmSwitchDirection), null, hatchScreen, hatchComponent, null, entryPointMetadata(confidentialVmSwitchEntryPoint), null);
    }

    private final void logSwitchOutcome(HatchScreen hatchScreen, String str) {
        HatchAppEventLogger.INSTANCE.logEvent(SWITCH_EVENT_NAME, HatchSurface.CVM_SWITCH.getValue(), hatchScreen.getValue(), HatchEventType.STATUS_CHECK.getValue(), SWITCH_EVENT_NAME, AnonymousClass007.A0c(HatchMetadataKey.RESULT, str), null);
    }

    public static /* synthetic */ void logSwitchTap$default(ConfidentialVmAnalytics confidentialVmAnalytics, HatchScreen hatchScreen, HatchComponent hatchComponent, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, HatchSubsurface hatchSubsurface, int i, Object obj) {
        if ((i & 16) != 0) {
            hatchSubsurface = null;
        }
        confidentialVmAnalytics.logSwitchTap(hatchScreen, hatchComponent, confidentialVmSwitchEntryPoint, confidentialVmSwitchDirection, hatchSubsurface);
    }

    public final void logChangeRecoveryPinTap() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinChangeClick();
    }

    public final void logChipBudgetSettingsTap() {
        HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetSettingsClick();
    }

    public final void logChipBudgetSupportTap() {
        HatchClientCvmEventLogger.INSTANCE.logCvmReplacementChipBudgetSupportClick();
    }

    public final void logCvmHelpTap() {
        HatchClientCvmEventLogger.INSTANCE.logHelpClick();
    }

    public final void logCvmLogOutTap() {
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
    }

    public final void logCvmReadyConfirmTap() {
        HatchClientCvmEventLogger.INSTANCE.logCvmReadyConfirmClick();
    }

    public final void logDowngradeCouldNotStart() {
        HatchClientCvmEventLogger hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
        hatchClientCvmEventLogger.logCvmDowngrade(HatchClientCvmOutcome.ATTEMPT);
        hatchClientCvmEventLogger.logCvmDowngrade(HatchClientCvmOutcome.FAILURE);
    }

    public final void logEncryptionSettingsShown() {
        HatchClientCvmEventLogger.INSTANCE.logCvmEncryptionSettingsView();
    }

    public final void logMigrationDoneOkTap(boolean z) {
        if (z) {
            return;
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CVM_DOWNGRADE, null, HatchScreen.CVM_MIGRATION_DONE, HatchComponent.CONFIRM_BUTTON, null, null, null);
    }

    public final void logMigrationDoneShown(boolean z) {
        if (z) {
            HatchClientCvmEventLogger.INSTANCE.logCvmReadyView();
        } else {
            HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.CVM_DOWNGRADE, HatchSurface.CVM_DOWNGRADE, null, HatchScreen.CVM_MIGRATION_DONE, HatchComponent.CVM_SCREEN_VIEW, null, null, null);
        }
    }

    public final void logPinHelpShown() {
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.CVM_PIN_RECOVERY, HatchSurface.CVM_PIN_RECOVERY, null, HatchScreen.CVM_PIN_HELP, HatchComponent.CVM_SCREEN_VIEW, null, null, null);
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinHelpView();
    }

    public final void logPinReminderMatched() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinReminderVerify(HatchClientCvmOutcome.SUCCESS);
    }

    public final void logPinReminderMismatched() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinReminderVerify(HatchClientCvmOutcome.FAILURE);
    }

    public final void logPinReminderShown() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinReminderView();
    }

    public final void logPinReminderSubmitted() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinReminderVerify(HatchClientCvmOutcome.ATTEMPT);
    }

    public final void logPinResetConfirmed() {
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinResetClick();
    }

    public final void logRecoveryLogOutTap(RegisterPinEntryPoint registerPinEntryPoint) {
        if (registerPinEntryPoint == null) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinLogoutClick();
        }
    }

    public final void logRecoveryPinRejected(RegisterPinEntryPoint registerPinEntryPoint) {
        logRecoveryPinVerify(registerPinEntryPoint, HatchClientCvmOutcome.FAILURE);
    }

    public final void logRecoveryPinSubmitted(RegisterPinEntryPoint registerPinEntryPoint) {
        logRecoveryPinVerify(registerPinEntryPoint, HatchClientCvmOutcome.ATTEMPT);
    }

    public final void logRecoveryPinVerified(RegisterPinEntryPoint registerPinEntryPoint) {
        logRecoveryPinVerify(registerPinEntryPoint, HatchClientCvmOutcome.SUCCESS);
    }

    public final void logSubscriptionEndedContinueClick() {
        HatchClientCvmEventLogger.INSTANCE.logSubscriptionEndedContinueClick();
    }

    public final void logSubscriptionEndedRenewTap() {
        HatchClientCvmEventLogger.INSTANCE.logSubscriptionEndedRenewClick();
    }

    public final void logSubscriptionEndedShown() {
        HatchClientCvmEventLogger.INSTANCE.logSubscriptionEndedView();
    }

    public final void logSwitchBackClick() {
        HatchClientCvmEventLogger.INSTANCE.logSwitchBackClick();
    }

    public final void logUpgradePushRetry() {
        HatchAppEventLogger.INSTANCE.logEvent(UPGRADE_PUSH_EVENT_NAME, HatchSurface.CVM_SWITCH.getValue(), HatchScreen.CVM_TRANSFER_PROGRESS.getValue(), HatchEventType.STATUS_CHECK.getValue(), UPGRADE_PUSH_EVENT_NAME, null, null);
    }

    public final void logWaitlistJoinResult(ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.CVM_SWITCH;
        HatchScreen hatchScreen = HatchScreen.CVM_JOIN_WAITLIST;
        HatchComponent hatchComponent = HatchComponent.CVM_JOIN_WAITLIST_BUTTON;
        Map<String, String> mapEntryPointMetadata = entryPointMetadata(confidentialVmSwitchEntryPoint);
        if (mapEntryPointMetadata == null) {
            mapEntryPointMetadata = AGH.A0E();
        }
        hatchInteractionLogger.logStatusCheck(hatchSurface, null, hatchScreen, hatchComponent, AnonymousClass006.A11(HatchMetadataKey.RESULT.getValue(), ConfidentialVmAnalyticsKt.getResultValue(confidentialVmWaitlistJoinFailure), mapEntryPointMetadata));
        if (confidentialVmWaitlistJoinFailure != null) {
            logSwitchErrorImpression(hatchScreen, confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM);
        }
    }

    public final void logProgressShown(HatchScreen hatchScreen, boolean z, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        AnonymousClass003.A0v(hatchScreen, confidentialVmSwitchDirection);
        logSwitchImpression(hatchScreen, z ? HatchComponent.CVM_ERROR_STATE : HatchComponent.CVM_SCREEN_VIEW, null, confidentialVmSwitchDirection);
    }

    public final void logSwitchErrorImpression(HatchScreen hatchScreen, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        AnonymousClass003.A0v(hatchScreen, confidentialVmSwitchDirection);
        logSwitchImpression(hatchScreen, HatchComponent.CVM_ERROR_STATE, confidentialVmSwitchEntryPoint, confidentialVmSwitchDirection);
    }

    public final void logSwitchScreenView(HatchScreen hatchScreen, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        AnonymousClass003.A0v(hatchScreen, confidentialVmSwitchDirection);
        logSwitchImpression(hatchScreen, HatchComponent.CVM_SCREEN_VIEW, confidentialVmSwitchEntryPoint, confidentialVmSwitchDirection);
    }

    public final void logSwitchTap(HatchScreen hatchScreen, HatchComponent hatchComponent, ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, HatchSubsurface hatchSubsurface) {
        AnonymousClass005.A0y(hatchScreen, hatchComponent, confidentialVmSwitchDirection);
        HatchInteractionLogger.INSTANCE.logClick(ConfidentialVmAnalyticsKt.getAnalyticsSurface(confidentialVmSwitchDirection), hatchSubsurface, hatchScreen, hatchComponent, null, entryPointMetadata(confidentialVmSwitchEntryPoint), null);
    }
}
