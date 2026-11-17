package com.facebook.aura.vds.compose.theme;

import X.AKH;
import X.AKJ;
import X.AKT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraContentAlphaKt {
    public static final AKH<Float> LocalAuraContentAlpha = AnonymousClass002.A0L(AuraContentAlphaKt$LocalAuraContentAlpha$1.INSTANCE);

    /* renamed from: ProvideAuraContentColorAndAlpha-3J-VO9M, reason: not valid java name */
    public static final void m2856ProvideAuraContentColorAndAlpha3JVO9M(long j, float f, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 2);
        bfm.AgG(-406053267);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0M |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0M), bfm, iA0M)) {
            AKT.A02(bfm, g0v, new AKJ[]{AnonymousClass003.A0T(AuraContentColorKt.LocalAuraContentColor, j), LocalAuraContentAlpha.A04(Float.valueOf(f))}, (iA0M >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraContentAlphaKt$ProvideAuraContentColorAndAlpha$1(j, f, g0v, i);
        }
    }

    public static final AKH<Float> getLocalAuraContentAlpha() {
        return LocalAuraContentAlpha;
    }
}
