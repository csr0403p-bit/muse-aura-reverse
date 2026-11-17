package com.facebook.aura.vmdisabled.content;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.VmDisabledOverlayScreenKey;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;

/* loaded from: classes.dex */
public abstract class VmDisabledVisibilityModifierKt {
    public static final BRg vmDisabledVisibility(BRg bRg, VmRecoveryFlowType vmRecoveryFlowType, BFM bfm, int i) {
        String wireValue;
        C7384Etj.A0Y(bRg, 0);
        bfm.AgE(-1908355123);
        if (!C7384Etj.areEqual(AnonymousClass002.A0b(bfm).currentKey(true), VmDisabledOverlayScreenKey.INSTANCE)) {
            AnonymousClass001.A1D(bfm);
            return bRg;
        }
        HatchOrigin hatchOrigin = HatchOrigin.HATCH;
        HatchSurface hatchSurface = HatchSurface.VM_DISCONNECTED;
        if (vmRecoveryFlowType == null || (wireValue = vmRecoveryFlowType.getWireValue()) == null) {
            wireValue = "support_only";
        }
        BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg, hatchOrigin, hatchSurface, null, null, null, wireValue, null, null, 0L, 0.0f, null, null, null);
        AnonymousClass001.A1D(bfm);
        return bRgHatchImpression;
    }
}
