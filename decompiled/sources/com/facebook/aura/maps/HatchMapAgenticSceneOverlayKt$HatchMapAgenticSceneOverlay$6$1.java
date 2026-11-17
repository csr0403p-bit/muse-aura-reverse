package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9Tm;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$6$1 extends AbstractC7559F3s implements G0U<C9Tm, Unit> {
    public final /* synthetic */ HatchMapAgenticScenePresentation $presentation;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C9Tm c9Tm) {
        C7384Etj.A0Y(c9Tm, 0);
        this.$presentation.onCarouselPageChanged.invoke(c9Tm.A09);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$6$1(HatchMapAgenticScenePresentation hatchMapAgenticScenePresentation) {
        super(1);
        this.$presentation = hatchMapAgenticScenePresentation;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C9Tm c9Tm) {
        invoke2(c9Tm);
        return Unit.INSTANCE;
    }
}
