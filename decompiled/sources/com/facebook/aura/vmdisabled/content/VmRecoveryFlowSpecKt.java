package com.facebook.aura.vmdisabled.content;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import com.facebook.aura.R;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class VmRecoveryFlowSpecKt {
    public static final int getBodyRes(VmRecoveryFlowType vmRecoveryFlowType) {
        int iA0E = AnonymousClass001.A0E(vmRecoveryFlowType, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f12111f;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f121127;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f121133;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getLearnMoreCompareBodyRes(VmRecoveryFlowType vmRecoveryFlowType) {
        int iA0E = AnonymousClass001.A0E(vmRecoveryFlowType, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f121122;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f121128;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f121134;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getLearnMoreCompareTitleRes(VmRecoveryFlowType vmRecoveryFlowType) {
        C7384Etj.A0Y(vmRecoveryFlowType, 0);
        return vmRecoveryFlowType == VmRecoveryFlowType.HEDGED_WARNING_MEDIUM_FRICTION ? R.string._name_removed__res_0x7f121123 : R.string._name_removed__res_0x7f121135;
    }

    public static final int getLearnMoreWhyBodyRes(VmRecoveryFlowType vmRecoveryFlowType) {
        int iA0E = AnonymousClass001.A0E(vmRecoveryFlowType, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f121125;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f121129;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f121136;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getLearnMoreWhyTitleRes(VmRecoveryFlowType vmRecoveryFlowType) {
        int iA0E = AnonymousClass001.A0E(vmRecoveryFlowType, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f121126;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f12112a;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f121137;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getListsResetFirst(VmRecoveryFlowType vmRecoveryFlowType) {
        C7384Etj.A0Y(vmRecoveryFlowType, 0);
        return vmRecoveryFlowType == VmRecoveryFlowType.NEUTRAL_MESSAGE || vmRecoveryFlowType == VmRecoveryFlowType.RESET_RECOMMENDED;
    }

    public static final int getTitleRes(VmRecoveryFlowType vmRecoveryFlowType) {
        int iA0E = AnonymousClass001.A0E(vmRecoveryFlowType, 0);
        if (iA0E == 0) {
            return R.string._name_removed__res_0x7f12111e;
        }
        if (iA0E == 1) {
            return R.string._name_removed__res_0x7f12112b;
        }
        if (iA0E == 2) {
            return R.string._name_removed__res_0x7f121138;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isHedgedWarning(VmRecoveryFlowType vmRecoveryFlowType) {
        C7384Etj.A0Y(vmRecoveryFlowType, 0);
        return vmRecoveryFlowType == VmRecoveryFlowType.HEDGED_WARNING_MEDIUM_FRICTION;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VmRecoveryFlowType.values().length];
            try {
                AnonymousClass002.A13(VmRecoveryFlowType.HEDGED_WARNING_MEDIUM_FRICTION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VmRecoveryFlowType.NEUTRAL_MESSAGE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VmRecoveryFlowType.RESET_RECOMMENDED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
