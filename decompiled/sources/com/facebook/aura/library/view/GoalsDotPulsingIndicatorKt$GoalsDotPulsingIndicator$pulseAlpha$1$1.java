package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C1115Aae;
import X.C2HU;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$pulseAlpha$1$1 extends AbstractC7559F3s implements G0U<C1115Aae<Float>, Unit> {
    public static final GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$pulseAlpha$1$1 INSTANCE = new GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$pulseAlpha$1$1();

    public GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$pulseAlpha$1$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1115Aae<Float> c1115Aae) {
        C7384Etj.A0Y(c1115Aae, 0);
        c1115Aae.A00 = GoalsDotPulsingIndicatorKt.PulseCycleMillis;
        Float fA0t = C8j3.A0t();
        c1115Aae.A00(fA0t, 0);
        c1115Aae.A00(fA0t, 2400).A00 = C2HU.A00;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1115Aae<Float> c1115Aae) {
        invoke2(c1115Aae);
        return Unit.INSTANCE;
    }
}
