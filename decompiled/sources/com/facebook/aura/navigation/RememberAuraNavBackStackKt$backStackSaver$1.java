package com.facebook.aura.navigation;

import X.A5Z;
import X.AbstractC0849A5g;
import X.AbstractC7559F3s;
import X.C07759in;
import X.C1bi;
import X.C7384Etj;
import X.C8j3;
import X.C9jC;
import X.C9jH;
import X.G0V;
import X.HxE;
import android.os.Bundle;
import androidx.navigation3.runtime.NavBackStack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class RememberAuraNavBackStackKt$backStackSaver$1 extends AbstractC7559F3s implements G0V<C1bi, NavBackStack<AuraNavKey>, Bundle> {
    public static final RememberAuraNavBackStackKt$backStackSaver$1 INSTANCE = new RememberAuraNavBackStackKt$backStackSaver$1();

    public RememberAuraNavBackStackKt$backStackSaver$1() {
        super(2);
    }

    @Override // X.G0V
    public final Bundle invoke(C1bi c1bi, NavBackStack<AuraNavKey> navBackStack) {
        HxE[] hxEArrA1b;
        C7384Etj.A0Y(navBackStack, 1);
        C07759in<AuraNavKey> c07759in = RememberAuraNavBackStackKt.backStackSerializer;
        C9jC c9jC = C9jC.A01;
        C7384Etj.A0Y(c07759in, 0);
        C9jH c9jH = C9jH.A00;
        if (c9jH.isEmpty()) {
            hxEArrA1b = new HxE[0];
        } else {
            ArrayList arrayListA1A = C8j3.A1A(c9jH);
            Iterator itA1B = C8j3.A1B(c9jH);
            while (itA1B.hasNext()) {
                Map.Entry entry = (Map.Entry) itA1B.next();
                arrayListA1A.add(new HxE(entry.getKey(), entry.getValue()));
            }
            hxEArrA1b = C8j3.A1b(arrayListA1A);
        }
        Bundle bundleA00 = AbstractC0849A5g.A00(hxEArrA1b);
        new A5Z(bundleA00, c9jC).AAR(navBackStack, c07759in);
        return bundleA00;
    }
}
