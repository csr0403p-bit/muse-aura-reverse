package com.facebook.aura.checkpoint.view;

import X.AKQ;
import X.AbstractC1532Ako;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3U4;
import X.C6t6;
import X.C78N;
import X.F60;
import X.G0U;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.webkit.WebView;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchTabBarPaddingKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchCheckpointWebContentKt {
    /* renamed from: HatchCheckpointWebContent-1yyLQnY, reason: not valid java name */
    public static final void m349HatchCheckpointWebContent1yyLQnY(C6t6 c6t6, boolean z, float f, float f2, G0U<? super WebView, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        int iA0D = AnonymousClass002.A0D(c6t6, g0u, 0);
        bfm.AgG(319551235);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6t6) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0u);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12049f);
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgM2329hatchTabImePaddingziNgDLE = HatchTabBarPaddingKt.m2329hatchTabImePaddingziNgDLE(bRg2.then(c1062ATq), f2, bfm, (iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgM2329hatchTabImePaddingziNgDLE);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            boolean zA67 = bfm.A67(c6t6);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchCheckpointWebContentKt$HatchCheckpointWebContent$1$1$1(c6t6);
                bfm.Ai0(objAaT);
            }
            BS0 bs0 = BRg.A00;
            AbstractC1532Ako.A03(bfm, C3U4.A0A(c1062ATq, f, f2), (G0U) objAaT, null, g0u, null, (iA0T >> 3) & 7168, 20);
            if (z) {
                bfm.AgE(1964079263);
                BRg bRgA4C = c0z7.A4C(C2VU.A09, bs0);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchCheckpointWebContentKt$HatchCheckpointWebContent$1$2$1(strA01);
                    bfm.Ai0(objAaT2);
                }
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bRgA4C, objAaT2, false), AuraSpinnerStyle.Companion.large(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, iA0D);
            } else {
                bfm.AgE(1964350265);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchCheckpointWebContentKt$HatchCheckpointWebContent$2(c6t6, z, f, f2, g0u, bRg2, i, i2);
        }
    }
}
