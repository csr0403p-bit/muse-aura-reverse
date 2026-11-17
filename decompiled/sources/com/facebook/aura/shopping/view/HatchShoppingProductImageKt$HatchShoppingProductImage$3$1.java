package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShoppingProductImageKt$HatchShoppingProductImage$3$1 extends AbstractC7559F3s implements G0V<Integer, Integer, Unit> {
    public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShoppingProductImageKt$HatchShoppingProductImage$3$1(String str, G0V<? super Integer, ? super Integer, Unit> g0v) {
        super(2);
        this.$uri = str;
        this.$onImageSizeDecoded = g0v;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        ProductImageAspectRatios.INSTANCE.put(this.$uri, i, i2);
        G0V<Integer, Integer, Unit> g0v = this.$onImageSizeDecoded;
        if (g0v != null) {
            AnonymousClass001.A1H(Integer.valueOf(i), g0v, i2);
        }
    }
}
