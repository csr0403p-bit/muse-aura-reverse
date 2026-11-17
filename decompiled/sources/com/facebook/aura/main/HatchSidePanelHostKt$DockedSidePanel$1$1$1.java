package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSidePanelHostKt$DockedSidePanel$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $panelProgress;
    public final /* synthetic */ float $railWidth;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        float f = this.$panelProgress;
        c2av.Acj(1.0f - f);
        c2av.Af5((-f) * c2av.Ah4(this.$railWidth));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSidePanelHostKt$DockedSidePanel$1$1$1(float f, float f2) {
        super(1);
        this.$panelProgress = f;
        this.$railWidth = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
