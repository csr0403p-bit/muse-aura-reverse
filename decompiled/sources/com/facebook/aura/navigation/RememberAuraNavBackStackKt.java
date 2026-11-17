package com.facebook.aura.navigation;

import X.AFs;
import X.AFz;
import X.BBI;
import X.BFM;
import X.C07759in;
import X.C07769ip;
import X.C0872AFu;
import X.C7384Etj;
import X.C78N;
import android.os.Bundle;
import androidx.navigation3.runtime.NavBackStack;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class RememberAuraNavBackStackKt {
    public static final C07759in<AuraNavKey> backStackSerializer = new C07759in<>(new C07769ip());
    public static final AFs<NavBackStack<AuraNavKey>, Bundle> backStackSaver = new C0872AFu(RememberAuraNavBackStackKt$backStackSaver$1.INSTANCE, RememberAuraNavBackStackKt$backStackSaver$2.INSTANCE);

    public static final NavBackStack<AuraNavKey> rememberAuraNavBackStack(AuraNavKey[] auraNavKeyArr, BFM bfm, int i) {
        C7384Etj.A0Y(auraNavKeyArr, 0);
        Object[] objArr = new Object[0];
        AFs<NavBackStack<AuraNavKey>, Bundle> aFs = backStackSaver;
        boolean zA67 = bfm.A67(auraNavKeyArr);
        Object objAaT = bfm.AaT();
        if (zA67 || objAaT == C78N.A00) {
            objAaT = new RememberAuraNavBackStackKt$rememberAuraNavBackStack$1$1(auraNavKeyArr);
            BBI.A0T(bfm, objAaT);
        }
        return (NavBackStack) AFz.A01(bfm, aFs, (Function0) objAaT, objArr);
    }
}
