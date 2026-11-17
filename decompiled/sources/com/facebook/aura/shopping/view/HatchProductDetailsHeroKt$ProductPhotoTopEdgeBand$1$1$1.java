package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.C15k;
import X.C2av;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$1$1$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $bandHeightPx;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2av c2av) {
        C7384Etj.A0Y(c2av, 0);
        long jA0J = AnonymousClass005.A0J(0.5f, 0.0f);
        long j = C15k.A01;
        c2av.Af4(jA0J);
        c2av.AeX(1.0629921f);
        c2av.AeY(this.$bandHeightPx / c2av.Ah4(HatchProductDetailsHeroKt.TopEdgeSampleHeight));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$1$1$1(float f) {
        super(1);
        this.$bandHeightPx = f;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
