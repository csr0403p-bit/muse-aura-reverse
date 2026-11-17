package com.facebook.aura.bloks.screenquery.navigator;

import X.AbstractC5321DgF;
import X.AbstractC7608F5v;
import X.AbstractC7965FMw;
import X.AnonymousClass003;
import X.BV4;
import X.C1mB;
import X.C3cG;
import X.C7384Etj;
import X.C7727FCd;
import X.C79;
import X.C7967FMy;
import X.C8632Fhj;
import X.F0C;
import X.FDB;
import X.FDC;
import X.FDD;
import X.FDW;
import X.FFI;
import X.FN3;
import X.HiG;
import android.content.Context;

/* loaded from: classes6.dex */
public final class AuraCdsScreenQueryNavigator {
    public static final AuraCdsScreenQueryNavigator INSTANCE = new AuraCdsScreenQueryNavigator();

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void openScreen(android.content.Context r12, X.C7933FLf r13, X.C7727FCd r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.screenquery.navigator.AuraCdsScreenQueryNavigator.openScreen(android.content.Context, X.FLf, X.FCd, boolean):void");
    }

    public final boolean supportsCustomScreenTransitions(C1mB c1mB) {
        return true;
    }

    public final void close(Context context, FDD fdd, C7727FCd c7727FCd) {
        HiG hiGA00;
        AnonymousClass003.A0u(context, fdd);
        boolean z = fdd instanceof FDC;
        FDW fdw = z ? ((FDC) fdd).A00 : ((FDB) fdd).A00;
        if (fdw == null || fdw.A05 != 16962) {
            hiGA00 = null;
        } else {
            String strA0o = AbstractC7608F5v.A0o(fdw);
            hiGA00 = HiG.A00(strA0o != null ? strA0o : "default");
        }
        if (fdd instanceof FDB) {
            C7967FMy c7967FMyA02 = FN3.A00.A02(context);
            if (c7967FMyA02 == null) {
                FFI.A01(null, "Cannot dismiss without an existing bottom sheet.", null);
                return;
            } else {
                C7967FMy.A00(c7967FMyA02, null, null);
                return;
            }
        }
        if (!z) {
            throw C3cG.A0q();
        }
        F0C f0cA02 = AbstractC5321DgF.A02(C79.A0C, new C8632Fhj(3));
        C7384Etj.A0U(f0cA02);
        AbstractC7965FMw.A04(context, hiGA00, f0cA02);
    }

    public final C7727FCd createObjectSetForNavigation(Context context, C7727FCd c7727FCd) {
        return new C7727FCd(BV4.A0B());
    }

    public final void onStaticTemplateFetchStatus(Context context, boolean z) {
    }
}
