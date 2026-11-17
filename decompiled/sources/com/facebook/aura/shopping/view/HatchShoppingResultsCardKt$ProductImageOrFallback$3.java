package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$ProductImageOrFallback$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ AuraIconSize $iconSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ShoppingResultProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingResultsCardKt$ProductImageOrFallback$3(ShoppingResultProduct shoppingResultProduct, AuraIconSize auraIconSize, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$product = shoppingResultProduct;
        this.$iconSize = auraIconSize;
        this.$decodeAtSize = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HatchShoppingResultsCardKt.m2040ProductImageOrFallback942rkJo(this.$product, this.$iconSize, this.$decodeAtSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
