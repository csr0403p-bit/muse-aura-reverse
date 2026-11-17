package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C1DG;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<C1DG, Unit> $onCarouselSectionHeightChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapAgenticSceneOverlayKt$HatchMapAgenticSceneOverlay$2$1(G0U<? super C1DG, Unit> g0u) {
        super(0);
        this.$onCarouselSectionHeightChanged = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCarouselSectionHeightChanged.invoke(C1DG.A03());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
