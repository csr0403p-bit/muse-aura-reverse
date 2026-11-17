package com.facebook.aura.navigation;

import X.AGO;
import X.AKH;
import X.BFM;
import X.C7384Etj;
import X.C78N;
import androidx.navigation3.runtime.NavBackStack;

/* loaded from: classes.dex */
public abstract class AuraNavigatorKt {
    public static final AKH<AuraNavigator> LocalNavigator = new AGO(AuraNavigatorKt$LocalNavigator$1.INSTANCE);

    public static final AuraNavigator rememberAuraNavigator(NavBackStack<AuraNavKey> navBackStack, BFM bfm, int i) {
        C7384Etj.A0Y(navBackStack, 0);
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new AuraNavigatorImpl(navBackStack);
            bfm.Ai0(objAaT);
        }
        return (AuraNavigatorImpl) objAaT;
    }

    public static final AKH<AuraNavigator> getLocalNavigator() {
        return LocalNavigator;
    }
}
