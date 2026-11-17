package com.facebook.aura.conversation.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.C0wg;
import X.C10G;
import X.C1EQ;
import X.C1b8;
import X.C2VU;
import X.C7384Etj;
import X.HxE;
import X.InterfaceC05151eP;
import com.facebook.aura.header.view.ScrimGradientKt;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class HatchComposerScrimKt {
    public static final float ComposerScrimHoldPower = 2.0f;
    public static final float ComposerScrimTopExtension = 16.0f;

    /* renamed from: HatchComposerScrim-XO-JAsU, reason: not valid java name */
    public static final void m542HatchComposerScrimXOJAsU(InterfaceC05151eP interfaceC05151eP, int i, long j, BFM bfm, int i2) {
        C7384Etj.A0Y(interfaceC05151eP, 0);
        bfm.AgG(-1407599283);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, interfaceC05151eP) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0O(bfm, j);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            float fA00 = C0wg.A00(bfm, i) + ComposerScrimTopExtension;
            C1b8.A05(bfm, C10G.A04(interfaceC05151eP.A4C(C2VU.A06, C10G.A02), fA00), C1EQ.A02((HxE[]) Arrays.copyOf(ScrimGradientKt.m1052scrimFadeInStopsDxMtmZc(j, 2.0f), 16), AnonymousClass002.A0Y(bfm).Ah4(fA00)));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchComposerScrimKt$HatchComposerScrim$1(interfaceC05151eP, i, j, i2);
        }
    }
}
