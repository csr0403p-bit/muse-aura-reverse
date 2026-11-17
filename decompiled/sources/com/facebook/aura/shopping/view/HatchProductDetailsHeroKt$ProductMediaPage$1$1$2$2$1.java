package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaPage$1$1$2$2$1 extends AbstractC7559F3s implements G0V<Integer, Integer, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isImageLoaded$delegate;
    public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$ProductMediaPage$1$1$2$2$1(G0V<? super Integer, ? super Integer, Unit> g0v, MutableState<Boolean> mutableState) {
        super(2);
        this.$onImageSizeDecoded = g0v;
        this.$isImageLoaded$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
        invoke(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        MutableState.A09(true, this.$isImageLoaded$delegate);
        AnonymousClass001.A1H(Integer.valueOf(i), this.$onImageSizeDecoded, i2);
    }
}
