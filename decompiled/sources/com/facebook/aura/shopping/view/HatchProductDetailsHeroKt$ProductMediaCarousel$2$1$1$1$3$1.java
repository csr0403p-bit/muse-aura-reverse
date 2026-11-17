package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0981AMm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$1$3$1 extends AbstractC7559F3s implements G0V<Integer, Integer, Unit> {
    public final /* synthetic */ C0981AMm<String, Float> $decodedAspectRatios;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$1$3$1(String str, C0981AMm<String, Float> c0981AMm) {
        super(2);
        this.$uri = str;
        this.$decodedAspectRatios = c0981AMm;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        Float fPut = ProductImageAspectRatios.INSTANCE.put(this.$uri, i, i2);
        if (fPut != null) {
            this.$decodedAspectRatios.put(this.$uri, Float.valueOf(fPut.floatValue()));
        }
    }
}
