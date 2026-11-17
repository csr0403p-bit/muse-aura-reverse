package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$HatchProductEntityPicture$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Float, Unit> $onAspectRatio;
    public final /* synthetic */ ShoppingResultProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductPillProviderKt$HatchProductEntityPicture$3(ShoppingResultProduct shoppingResultProduct, float f, G0U<? super Float, Unit> g0u, BRg bRg, int i, int i2) {
        super(2);
        this.$product = shoppingResultProduct;
        this.$decodeAtSize = f;
        this.$onAspectRatio = g0u;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchProductPillProviderKt.m2031HatchProductEntityPictureDzVHIIc(this.$product, this.$decodeAtSize, this.$onAspectRatio, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
