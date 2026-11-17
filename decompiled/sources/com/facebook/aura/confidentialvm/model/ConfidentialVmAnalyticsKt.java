package com.facebook.aura.confidentialvm.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import com.facebook.aura.ageverification.AgeVerificationClientKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchDestination;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class ConfidentialVmAnalyticsKt {
    public static final HatchSurface getAnalyticsSurface(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 0) {
            return HatchSurface.CVM_SWITCH;
        }
        if (iOrdinal == 1) {
            return HatchSurface.CVM_DOWNGRADE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String getResultValue(ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure) {
        if (confidentialVmWaitlistJoinFailure == null) {
            return "success";
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmWaitlistJoinFailure.ordinal();
        if (iOrdinal == -1) {
            return "success";
        }
        if (iOrdinal == 0) {
            return AgeVerificationClientKt.NOT_ELIGIBLE;
        }
        if (iOrdinal == 1) {
            return "failed";
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDirection.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDirection.TO_SECURE_VM, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RegisterPinEntryPoint.values().length];
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.ONBOARDING, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.ACTIVATION, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.SVM_TO_CVM_SWITCH, iArr2, 3);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.SVM_TO_CVM_DATA_TRANSFER, iArr2, 4);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.INTERNAL_SETTINGS, iArr2, 5);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.SETTINGS, iArr2, 6);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(RegisterPinEntryPoint.CVM_ENROLLMENT, iArr2, 7);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ConfidentialVmSwitchDestination.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_SWITCH_INTRO, iArr3, 1);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_SUBSCRIBE, iArr3, 2);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_JOIN_WAITLIST, iArr3, 3);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_ON_WAITLIST, iArr3, 4);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_UNAVAILABLE, iArr3, 5);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.NONE, iArr3, 6);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDestination.CVM_LOADING, iArr3, 7);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass006.A1H(ConfidentialVmSwitchDestination.CVM_ENCRYPTION_SETTINGS, iArr3);
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ConfidentialVmDataChoice.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmDataChoice.UPGRADE_MIGRATION, iArr4, 1);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmDataChoice.START_FRESH, iArr4, 2);
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ConfidentialVmWaitlistJoinFailure.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmWaitlistJoinFailure.NOT_ELIGIBLE, iArr5, 1);
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmWaitlistJoinFailure.FAILED, iArr5, 2);
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final String getAnalyticsValue(ConfidentialVmDataChoice confidentialVmDataChoice) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmDataChoice.ordinal();
        if (iOrdinal == 0) {
            return "keep_data";
        }
        if (iOrdinal == 1) {
            return "start_fresh";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final HatchComponent getOptionComponent(ConfidentialVmDataChoice confidentialVmDataChoice) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmDataChoice.ordinal();
        if (iOrdinal == 0) {
            return HatchComponent.CVM_KEEP_DATA_OPTION;
        }
        if (iOrdinal == 1) {
            return HatchComponent.CVM_START_FRESH_OPTION;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final HatchOrigin getOrigin(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 0) {
            return HatchOrigin.CVM_SWITCH;
        }
        if (iOrdinal == 1) {
            return HatchOrigin.CVM_DOWNGRADE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ConfidentialVmSetupFlow getSetupFlow(RegisterPinEntryPoint registerPinEntryPoint) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (registerPinEntryPoint.ordinal()) {
            case 0:
            case 1:
            case 4:
                return null;
            case 2:
            case 3:
                return ConfidentialVmSetupFlow.ONBOARDING;
            case 5:
            case 6:
                return ConfidentialVmSetupFlow.SWITCH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final HatchComponent introImpressionComponent(ConfidentialVmSwitchDestination confidentialVmSwitchDestination) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (confidentialVmSwitchDestination.ordinal()) {
            case 0:
            case 5:
            case 7:
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return HatchComponent.CVM_SCREEN_VIEW;
            case 6:
                return HatchComponent.CVM_ERROR_STATE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final HatchComponent introPrimaryComponent(ConfidentialVmSwitchDestination confidentialVmSwitchDestination) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (confidentialVmSwitchDestination.ordinal()) {
            case 0:
            case 4:
            case 5:
            case 7:
                return null;
            case 1:
                return HatchComponent.CVM_SUBSCRIBE_BUTTON;
            case 2:
                return HatchComponent.CVM_SWITCH_BUTTON;
            case 3:
                return HatchComponent.CVM_JOIN_WAITLIST_BUTTON;
            case 6:
                return HatchComponent.RETRY_BUTTON;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final HatchScreen introScreen(ConfidentialVmSwitchDestination confidentialVmSwitchDestination) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (confidentialVmSwitchDestination.ordinal()) {
            case 0:
            case 5:
            case 7:
                return null;
            case 1:
                return HatchScreen.CVM_SUBSCRIBE_INTRO;
            case 2:
                return HatchScreen.CVM_SWITCH_INTRO;
            case 3:
                return HatchScreen.CVM_JOIN_WAITLIST;
            case 4:
                return HatchScreen.CVM_ON_WAITLIST;
            case 6:
                return HatchScreen.CVM_SWITCH_UNAVAILABLE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
