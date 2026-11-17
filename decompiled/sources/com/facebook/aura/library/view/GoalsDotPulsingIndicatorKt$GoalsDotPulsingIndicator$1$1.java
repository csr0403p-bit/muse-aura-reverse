package com.facebook.aura.library.view;

import X.AT3;
import X.AWA;
import X.AbstractC7559F3s;
import X.C16a;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ C1BO<Float> $pulseAlpha;
    public final /* synthetic */ C1BO<Float> $scale;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        float fA01 = AWA.A01(at3.AKb()) / 2.0f;
        long j = this.$color;
        float fA012 = fA01 * C1BO.A01(this.$scale);
        float fA013 = C1BO.A01(this.$pulseAlpha) * 0.2f;
        long jADU = at3.ADU();
        C16a c16a = C16a.A00;
        at3.A9N(null, c16a, fA012, fA013, 3, j, jADU);
        at3.A9N(null, c16a, at3.Ah4(GoalsDotPulsingIndicatorKt.InnerDotSize) / 2.0f, 1.0f, 3, this.$color, at3.ADU());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalsDotPulsingIndicatorKt$GoalsDotPulsingIndicator$1$1(long j, C1BO<Float> c1bo, C1BO<Float> c1bo2) {
        super(1);
        this.$color = j;
        this.$scale = c1bo;
        this.$pulseAlpha = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
