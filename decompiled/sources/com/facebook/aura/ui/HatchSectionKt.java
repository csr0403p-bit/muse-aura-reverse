package com.facebook.aura.ui;

import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.B1V;
import X.B6A;
import X.BFM;
import X.C06G;
import X.C0CD;
import X.C1D8;
import X.C1DM;
import X.C1OM;
import X.F60;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchSectionKt {
    /* renamed from: HatchSection-lMAxDYE, reason: not valid java name */
    public static final void m2324HatchSectionlMAxDYE(C0CD c0cd, boolean z, Object obj, Object obj2, G0V<? super BFM, ? super Integer, Unit> g0v, B6A b6a, G0U<? super HatchLazySectionScope, Unit> g0u) {
        AnonymousClass002.A1E(c0cd, 0, g0u);
        if (z) {
            c0cd.APJ(null, null, ComposableSingletons$HatchSectionKt.lambda$653875523);
        }
        if (g0v != null) {
            c0cd.APJ(obj, obj2, B1V.A01(new HatchSectionKt$HatchSection$3(g0v), 1079321722, true));
        }
        HatchLazySectionScopeImpl hatchLazySectionScopeImpl = new HatchLazySectionScopeImpl();
        g0u.invoke(hatchLazySectionScopeImpl);
        int i = 0;
        for (HatchLazySectionItem hatchLazySectionItem : hatchLazySectionScopeImpl.items) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchLazySectionItem hatchLazySectionItem2 = hatchLazySectionItem;
            c0cd.APJ(hatchLazySectionItem2.key, hatchLazySectionItem2.contentType, B1V.A01(new HatchSectionKt$HatchSection$4$1(i, hatchLazySectionScopeImpl, b6a, hatchLazySectionItem2), -2100018597, true));
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0128  */
    /* renamed from: HatchSection-uDo3WH8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2326HatchSectionuDo3WH8(X.C07C r19, boolean r20, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r21, long r22, X.G0U<? super com.facebook.aura.ui.HatchSectionScope, kotlin.Unit> r24, X.BFM r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchSectionKt.m2326HatchSectionuDo3WH8(X.07C, boolean, X.G0V, long, X.G0U, X.BFM, int, int):void");
    }

    public static final long sectionBackground(BFM bfm, int i) {
        return C06G.A0J(bfm, AuraColorsKt.LocalAuraColors);
    }

    /* renamed from: HatchSection-lMAxDYE$default, reason: not valid java name */
    public static /* synthetic */ void m2325HatchSectionlMAxDYE$default(C0CD c0cd, boolean z, Object obj, Object obj2, G0V g0v, B6A b6a, G0U g0u, int i, Object obj3) {
        boolean zA1P = AnonymousClass001.A1P(i, z);
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            obj2 = null;
        }
        if ((i & 8) != 0) {
            g0v = null;
        }
        if ((i & 16) != 0) {
            b6a = null;
        }
        m2324HatchSectionlMAxDYE(c0cd, zA1P, obj, obj2, g0v, b6a, g0u);
    }

    public static final C1DM hatchSectionRowShape(int i, int i2, BFM bfm, int i3) {
        char c;
        float f;
        float f2 = AnonymousClass002.A0d(bfm).sectionCornerRadius;
        boolean zA1M = AnonymousClass002.A1M(i);
        boolean z = i == i2 - 1;
        if (zA1M) {
            if (z) {
                return C1D8.A00(f2);
            }
            c = '\f';
            f = 0.0f;
        } else {
            if (!z) {
                return C1OM.A00;
            }
            c = 3;
            f = f2;
            f2 = 0.0f;
        }
        float f3 = f2;
        float f4 = f;
        if ((c & 1) != 0) {
            f2 = 0.0f;
        }
        if ((c & 2) != 0) {
            f3 = 0.0f;
        }
        if ((c & 4) != 0) {
            f = 0.0f;
        }
        if ((c & '\b') != 0) {
            f4 = 0.0f;
        }
        return C1D8.A01(f2, f3, f, f4);
    }
}
