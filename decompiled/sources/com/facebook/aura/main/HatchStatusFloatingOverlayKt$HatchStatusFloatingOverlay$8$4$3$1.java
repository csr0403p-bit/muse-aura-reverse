package com.facebook.aura.main;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C1BO;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4$3$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ AT5<Float, AOW> $hostAlpha;
    public final /* synthetic */ C1BO<Float> $revealAlpha;
    public final /* synthetic */ C1BO<Float> $sidePanelAlpha$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        c2av.Acj(MutableState.A00(this.$hostAlpha) * C1BO.A01(this.$sidePanelAlpha$delegate) * C1BO.A01(this.$revealAlpha));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$8$4$3$1(AT5<Float, AOW> at5, C1BO<Float> c1bo, C1BO<Float> c1bo2) {
        super(1);
        this.$hostAlpha = at5;
        this.$revealAlpha = c1bo;
        this.$sidePanelAlpha$delegate = c1bo2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
