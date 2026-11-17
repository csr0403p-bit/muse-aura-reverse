package com.facebook.aura.vds.compose.theme;

import X.AKH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B6A;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraContentColorKt {
    public static final AKH<B6A> LocalAuraContentColor = AnonymousClass002.A0L(AuraContentColorKt$LocalAuraContentColor$1.INSTANCE);

    /* renamed from: ProvideAuraContentColor-Iv8Zu3U, reason: not valid java name */
    public static final void m2857ProvideAuraContentColorIv8Zu3U(long j, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(-926535599);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0M), bfm, iA0M)) {
            AnonymousClass001.A14(bfm, AnonymousClass003.A0T(LocalAuraContentColor, j), g0v, iA0M);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraContentColorKt$ProvideAuraContentColor$1(j, g0v, i);
        }
    }

    public static final AKH<B6A> getLocalAuraContentColor() {
        return LocalAuraContentColor;
    }
}
