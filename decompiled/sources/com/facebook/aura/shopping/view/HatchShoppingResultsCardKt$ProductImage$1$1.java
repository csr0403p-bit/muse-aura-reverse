package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$ProductImage$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ShoppingResultProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingResultsCardKt$ProductImage$1$1(ShoppingResultProduct shoppingResultProduct) {
        super(2);
        this.$product = shoppingResultProduct;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            HatchShoppingResultsCardKt.m2040ProductImageOrFallback942rkJo(this.$product, AuraIconSize.LARGE, HatchShoppingResultsCardKt.ProductImageDecodeSize, null, bfm, ShoppingResultProduct.$stable | 432, 8);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
