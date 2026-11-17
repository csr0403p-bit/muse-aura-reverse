package com.facebook.aura.ageverification;

import X.AHI;
import X.AKH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B6A;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C1062ATq;
import X.C10G;
import X.C1334AhL;
import X.C1b8;
import X.C78N;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.ageverification.ComposableSingletons$SelfieAgeStepReviewingKt$lambda$-594716220$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SelfieAgeStepReviewingKt$lambda$594716220$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public static final ComposableSingletons$SelfieAgeStepReviewingKt$lambda$594716220$1 INSTANCE = new ComposableSingletons$SelfieAgeStepReviewingKt$lambda$594716220$1();

    public ComposableSingletons$SelfieAgeStepReviewingKt$lambda$594716220$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            C1b8.A05(bfm, c1062ATq, new C1334AhL(AnonymousClass004.A17(new B6A(AnonymousClass001.A0f(bfm, akh).secondaryElevated), AnonymousClass001.A0f(bfm, akh).elevatedBorder), null, Float.POSITIVE_INFINITY, 0, 9205357640488583168L));
            long j = AnonymousClass001.A0f(bfm, akh).accent;
            BRg bRgA07 = C10G.A07(bs0, 52.0f / 0.6f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ComposableSingletons$SelfieAgeStepReviewingKt$lambda$594716220$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            HatchPullToRefreshKt.m2320HatchPTRLoaderRingiJQMabo(AnonymousClass001.A0Y(bRgA07, objAaT, false), j, bfm, 0, 0);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = ComposableSingletons$SelfieAgeStepReviewingKt$lambda$594716220$1$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            SelfieOverlayKt.SelfieMovementOverlay(null, (Function0) objAaT2, AHI.A01, c1062ATq, bfm, (CompletionFlash.$stable << 6) | 3510, 0);
            return;
        }
        bfm.Afo();
    }
}
