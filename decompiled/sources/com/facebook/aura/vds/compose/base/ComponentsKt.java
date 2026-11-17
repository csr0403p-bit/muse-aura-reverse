package com.facebook.aura.vds.compose.base;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C01N;

/* loaded from: classes.dex */
public abstract class ComponentsKt {
    /* renamed from: AuraHorizontalSpacer-8Feqmps, reason: not valid java name */
    public static final void m2402AuraHorizontalSpacer8Feqmps(float f, BFM bfm, int i) {
        bfm.AgG(1379504451);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA04), bfm, iA04)) {
            C01N.A09(bfm, BRg.A00, f);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ComponentsKt$AuraHorizontalSpacer$1(f, i);
        }
    }

    /* renamed from: AuraVerticalSpacer-8Feqmps, reason: not valid java name */
    public static final void m2403AuraVerticalSpacer8Feqmps(float f, BFM bfm, int i) {
        bfm.AgG(-575769899);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA04), bfm, iA04)) {
            C01N.A08(bfm, BRg.A00, f);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ComponentsKt$AuraVerticalSpacer$1(f, i);
        }
    }
}
