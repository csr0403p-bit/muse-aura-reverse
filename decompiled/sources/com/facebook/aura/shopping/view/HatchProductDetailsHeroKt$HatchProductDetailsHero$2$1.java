package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import X.G0V;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$HatchProductDetailsHero$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ G0V<List<String>, Integer, Unit> $onSelectHeroImage;
    public final /* synthetic */ ProductImageResolution $resolution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$HatchProductDetailsHero$2$1(G0V<? super List<String>, ? super Integer, Unit> g0v, ProductImageResolution productImageResolution) {
        super(1);
        this.$onSelectHeroImage = g0v;
        this.$resolution = productImageResolution;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AnonymousClass001.A1H(this.$resolution.imageUrls, this.$onSelectHeroImage, i);
    }
}
