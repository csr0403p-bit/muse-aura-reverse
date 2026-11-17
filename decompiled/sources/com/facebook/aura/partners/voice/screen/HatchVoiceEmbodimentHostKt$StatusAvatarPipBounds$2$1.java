package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchSystemPipState $systemPip;
    public final /* synthetic */ long $windowSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$2$1(long j, HatchSystemPipState hatchSystemPipState) {
        super(0);
        this.$windowSize = j;
        this.$systemPip = hatchSystemPipState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<HatchSystemPipGeometry, Unit> g0u;
        HatchSystemPipGeometry hatchSystemPipGeometryM1735centeredPipGeometryozmzZPI = HatchSystemPipGeometryKt.m1735centeredPipGeometryozmzZPI(this.$windowSize);
        if (hatchSystemPipGeometryM1735centeredPipGeometryozmzZPI == null || (g0u = this.$systemPip.onSourceChanged) == null) {
            return;
        }
        g0u.invoke(hatchSystemPipGeometryM1735centeredPipGeometryozmzZPI);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
