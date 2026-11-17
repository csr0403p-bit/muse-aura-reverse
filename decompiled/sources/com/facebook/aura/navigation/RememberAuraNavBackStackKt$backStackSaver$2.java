package com.facebook.aura.navigation;

import X.A5Y;
import X.AbstractC7559F3s;
import X.C07759in;
import X.C7384Etj;
import X.C9jC;
import X.G0U;
import android.os.Bundle;
import androidx.navigation3.runtime.NavBackStack;

/* loaded from: classes4.dex */
public final class RememberAuraNavBackStackKt$backStackSaver$2 extends AbstractC7559F3s implements G0U<Bundle, NavBackStack<AuraNavKey>> {
    public static final RememberAuraNavBackStackKt$backStackSaver$2 INSTANCE = new RememberAuraNavBackStackKt$backStackSaver$2();

    public RememberAuraNavBackStackKt$backStackSaver$2() {
        super(1);
    }

    @Override // X.G0U
    public final NavBackStack<AuraNavKey> invoke(Bundle bundle) {
        C7384Etj.A0Y(bundle, 0);
        try {
            C07759in<AuraNavKey> c07759in = RememberAuraNavBackStackKt.backStackSerializer;
            C9jC c9jC = C9jC.A01;
            C7384Etj.A0Y(c07759in, 0);
            return (NavBackStack) new A5Y(bundle, c9jC).A8b(c07759in);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
