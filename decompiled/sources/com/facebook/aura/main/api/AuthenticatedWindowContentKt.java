package com.facebook.aura.main.api;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.HxE;
import com.facebook.aura.localbrowser.LocalBrowserWindowContentProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuthenticatedWindowContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AuthenticatedWindowUnderlay(final boolean z, final BRg bRg, BFM bfm, final int i, final int i2) {
        bfm.AgG(-1380867107);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = objAaT;
            if (objAaT == C78N.A00) {
                ArrayList arrayList = new ArrayList(1);
                int i4 = new int[]{0}[0];
                Integer numValueOf = Integer.valueOf(i4);
                if (i4 != 0) {
                    throw new IllegalArgumentException(String.format("No implementation bound to key: %s", numValueOf));
                }
                AnonymousClass002.A1J(numValueOf, LocalBrowserWindowContentProvider.INSTANCE.content(), arrayList);
                bfm.Ai0(arrayList);
                obj = arrayList;
            }
            for (HxE hxE : (List) obj) {
                int iIntValue = ((Number) hxE.first).intValue();
                B b = hxE.second;
                C7384Etj.A0U(b);
                bfm.Ag8(-1603974358, Integer.valueOf(iIntValue));
                ((AuthenticatedWindowContent) b).Underlay(z, bRg, bfm, iA0n & 126);
                BBI.A0R((BBI) bfm, false);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.main.api.AuthenticatedWindowContentKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z2 = z;
                    BRg bRg2 = bRg;
                    int i5 = i;
                    AuthenticatedWindowContentKt.AuthenticatedWindowUnderlay(z2, bRg2, (BFM) obj2, AnonymousClass011.A00(i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit AuthenticatedWindowUnderlay$lambda$2(boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        AuthenticatedWindowUnderlay(z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
