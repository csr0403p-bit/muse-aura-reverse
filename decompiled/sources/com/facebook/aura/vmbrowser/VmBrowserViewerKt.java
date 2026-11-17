package com.facebook.aura.vmbrowser;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class VmBrowserViewerKt {
    public static final void VmBrowserScreen(final boolean z, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2133482176);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0w);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = VmBrowserViewer.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            ((VmBrowserViewer) objAaT).Screen(z, g0w, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.CHAT, HatchSurface.CHAT, null, HatchScreen.BROWSER_OVERLAY, HatchComponent.BROWSER_LIVE_VIEW, null, null, null, 0L, 0.0f, null, null, null), bfm, iA0n & 126);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.vmbrowser.VmBrowserViewerKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    G0W g0w2 = g0w;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    VmBrowserViewerKt.VmBrowserScreen(z2, g0w2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit VmBrowserScreen$lambda$1(boolean z, G0W g0w, BRg bRg, int i, int i2, BFM bfm, int i3) {
        VmBrowserScreen(z, g0w, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
