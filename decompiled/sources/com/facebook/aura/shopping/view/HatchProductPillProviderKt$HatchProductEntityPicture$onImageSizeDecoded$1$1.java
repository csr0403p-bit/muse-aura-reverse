package com.facebook.aura.shopping.view;

import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductPillProviderKt$HatchProductEntityPicture$onImageSizeDecoded$1$1 extends AbstractC7559F3s implements G0V<Integer, Integer, Unit> {
    public final /* synthetic */ G0U<Float, Unit> $onAspectRatio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductPillProviderKt$HatchProductEntityPicture$onImageSizeDecoded$1$1(G0U<? super Float, Unit> g0u) {
        super(2);
        this.$onAspectRatio = g0u;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        float f = i / i2;
        if (i > 0 && i2 > 0 && Math.abs(f) <= Float.MAX_VALUE) {
            this.$onAspectRatio.invoke(Float.valueOf(ATD.A03(f, 0.75f, 1.3333334f)));
        }
    }
}
