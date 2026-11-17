package com.facebook.aura.ui.adaptive;

import X.AKH;
import X.AKT;
import X.AXN;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C1DG;
import X.C60K;
import X.C60Q;
import X.C7384Etj;
import X.C73O;
import X.G0V;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class AuraLayoutSizeKt {
    public static final AKH<C73O> LocalAuraLayoutSize = AnonymousClass002.A0L(AuraLayoutSizeKt$LocalAuraLayoutSize$1.INSTANCE);

    /* renamed from: ProvideAuraLayoutSize-UBP6k7g, reason: not valid java name */
    public static final void m2363ProvideAuraLayoutSizeUBP6k7g(long j, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(1543229917);
        int iA0M = (i & 6) == 0 ? AnonymousClass004.A0M(bfm, j) | i : i;
        if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0M), bfm, iA0M)) {
            AKT.A01(bfm, LocalAuraLayoutSize.A04(new C73O(j)), g0v, (iA0M & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraLayoutSizeKt$ProvideAuraLayoutSize$1(j, g0v, i);
        }
    }

    public static final long auraHeadlessContainerSize(Context context) {
        C7384Etj.A0Y(context, 0);
        DisplayMetrics displayMetricsA0B = C60Q.A0B(context);
        return (displayMetricsA0B.widthPixels << 32) | (displayMetricsA0B.heightPixels & 4294967295L);
    }

    public static final long auraLayoutDpSize(BFM bfm, int i) {
        C73O c73o = (C73O) bfm.A6v(LocalAuraLayoutSize);
        if (c73o != null) {
            bfm.AgE(-460350305);
            AnonymousClass002.A19(bfm);
            return c73o.A00;
        }
        bfm.AgE(-460349096);
        long jWindowDpSize = AuraAdaptiveInfoKt.windowDpSize((C60K) bfm.A6v(Am0.A0I), (Configuration) bfm.A6v(AndroidCompositionLocals_androidKt.A00), AnonymousClass002.A0Y(bfm));
        AnonymousClass002.A19(bfm);
        return jWindowDpSize;
    }

    public static final float auraLayoutHeight(BFM bfm, int i) {
        float fIntBitsToFloat;
        if (((AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo)).isCompact()) {
            bfm.AgE(-909831616);
            fIntBitsToFloat = ((Configuration) bfm.A6v(AndroidCompositionLocals_androidKt.A00)).screenHeightDp;
        } else {
            bfm.AgE(-909768717);
            fIntBitsToFloat = Float.intBitsToFloat(AnonymousClass002.A09(auraLayoutDpSize(bfm, 0)));
        }
        BBI.A0R((BBI) bfm, false);
        return fIntBitsToFloat;
    }

    public static final float auraLayoutWidth(BFM bfm, int i) {
        float fIntBitsToFloat;
        if (((AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo)).isCompact()) {
            bfm.AgE(-377236278);
            fIntBitsToFloat = ((Configuration) bfm.A6v(AndroidCompositionLocals_androidKt.A00)).screenWidthDp;
        } else {
            bfm.AgE(-377174371);
            fIntBitsToFloat = Float.intBitsToFloat((int) (auraLayoutDpSize(bfm, 0) >> 32));
        }
        BBI.A0R((BBI) bfm, false);
        return fIntBitsToFloat;
    }

    public static final long auraWindowContainerSize(BFM bfm, int i) {
        return ((C60K) bfm.A6v(Am0.A0I)).AE1();
    }

    /* renamed from: cappedOnLargeWindows-i1RSzL4, reason: not valid java name */
    public static final float m2364cappedOnLargeWindowsi1RSzL4(float f, float f2, BFM bfm, int i) {
        if (((AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo)).isCompact()) {
            return f;
        }
        C1DG c1dg = new C1DG(f);
        C1DG c1dg2 = new C1DG(f2);
        if (c1dg.compareTo(c1dg2) > 0) {
            c1dg = c1dg2;
        }
        return c1dg.A00;
    }

    public static final long auraLayoutContainerSize(BFM bfm, int i) {
        BBI bbi;
        long jAbr;
        bfm.AgE(-1210892977);
        if (((AuraAdaptiveInfo) bfm.A6v(AuraAdaptiveInfoKt.LocalAuraAdaptiveInfo)).isCompact()) {
            bfm.AgE(-282269731);
            jAbr = ((C60K) bfm.A6v(Am0.A0I)).AE1();
            BBI bbi2 = (BBI) bfm;
            bbi = bbi2;
            BBI.A0R(bbi2, false);
        } else {
            bfm.AgE(-282217837);
            bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            long jAuraLayoutDpSize = auraLayoutDpSize(bfm, 0);
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            jAbr = (axnA0Y.Abr(Float.intBitsToFloat((int) (jAuraLayoutDpSize >> 32))) << 32) | (axnA0Y.Abr(Float.intBitsToFloat(AnonymousClass002.A09(jAuraLayoutDpSize))) & 4294967295L);
        }
        BBI.A0R(bbi, false);
        return jAbr;
    }
}
