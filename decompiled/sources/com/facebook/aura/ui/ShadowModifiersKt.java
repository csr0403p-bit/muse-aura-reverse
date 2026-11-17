package com.facebook.aura.ui;

import X.AEk;
import X.AbstractC2139Az7;
import X.AnonymousClass003;
import X.AxM;
import X.BRg;
import X.C1DM;
import X.C1OM;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class ShadowModifiersKt {
    /* renamed from: elevationShadow-6ILLrsY, reason: not valid java name */
    public static final BRg m2345elevationShadow6ILLrsY(BRg bRg, float f, C1DM c1dm, long j, float f2) {
        AnonymousClass003.A0v(bRg, c1dm);
        return AEk.A02(bRg, new ShadowModifiersKt$elevationShadow$1(j, f, f2, c1dm));
    }

    /* renamed from: multiLayerShadow-knJZjKc, reason: not valid java name */
    public static final BRg m2347multiLayerShadowknJZjKc(BRg bRg, long j, float f, float f2, float f3, int i) {
        C7384Etj.A0Y(bRg, 0);
        return AxM.A02(bRg, AbstractC2139Az7.A00, new ShadowModifiersKt$multiLayerShadow$1(i, j, f, f3, f2));
    }

    /* renamed from: elevationShadow-6ILLrsY$default, reason: not valid java name */
    public static /* synthetic */ BRg m2346elevationShadow6ILLrsY$default(BRg bRg, float f, C1DM c1dm, long j, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            c1dm = C1OM.A00;
        }
        return m2345elevationShadow6ILLrsY(bRg, f, c1dm, j, f2);
    }
}
