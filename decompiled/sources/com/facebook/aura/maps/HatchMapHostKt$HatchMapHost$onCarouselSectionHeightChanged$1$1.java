package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C1DG;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapHostKt$HatchMapHost$onCarouselSectionHeightChanged$1$1 extends AbstractC7559F3s implements G0U<C1DG, Unit> {
    public final /* synthetic */ MutableState<C1DG> $measuredCarouselSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapHostKt$HatchMapHost$onCarouselSectionHeightChanged$1$1(MutableState<C1DG> mutableState) {
        super(1);
        this.$measuredCarouselSection = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg) {
        m1355invoke0680j_4(c1dg.A00);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-0680j_4, reason: not valid java name */
    public final void m1355invoke0680j_4(float f) {
        C1DG.A06(f, this.$measuredCarouselSection);
    }
}
