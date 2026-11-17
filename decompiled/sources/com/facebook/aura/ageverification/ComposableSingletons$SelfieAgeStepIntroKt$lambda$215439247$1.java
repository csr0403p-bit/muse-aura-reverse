package com.facebook.aura.ageverification;

import X.AHI;
import X.ARL;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.B18;
import X.BFM;
import X.BOf;
import X.C1062ATq;
import X.C10G;
import X.C1SA;
import X.C1b8;
import X.C78N;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.ageverification.ComposableSingletons$SelfieAgeStepIntroKt$lambda$-215439247$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$SelfieAgeStepIntroKt$lambda$215439247$1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public static final ComposableSingletons$SelfieAgeStepIntroKt$lambda$215439247$1 INSTANCE = new ComposableSingletons$SelfieAgeStepIntroKt$lambda$215439247$1();

    public ComposableSingletons$SelfieAgeStepIntroKt$lambda$215439247$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            AVy aVyA00 = BOf.A00(bfm, R.drawable.age_verification_selfie_mascot, 0);
            ARL arl = B18.A00;
            C1062ATq c1062ATq = C10G.A01;
            C1SA.A00(bfm, null, C1b8.A01(c1062ATq, AnonymousClass002.A0c(bfm).secondaryElevated), null, aVyA00, arl, null, 0.0f, AVy.$stable | 24624, 104);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ComposableSingletons$SelfieAgeStepIntroKt$lambda$215439247$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            SelfieOverlayKt.SelfieMovementOverlay(null, (Function0) objAaT, AHI.A01, c1062ATq, bfm, (CompletionFlash.$stable << 6) | 3510, 0);
            return;
        }
        bfm.Afo();
    }
}
