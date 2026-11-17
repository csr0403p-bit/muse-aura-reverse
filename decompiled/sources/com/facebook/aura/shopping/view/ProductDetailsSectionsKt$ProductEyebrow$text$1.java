package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.shopping.model.PdpEyebrowState;
import com.facebook.aura.shopping.model.ShoppingProductType;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductDetailsSectionsKt$ProductEyebrow$text$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ PdpEyebrowState $eyebrow;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ShoppingProductType $productType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsSectionsKt$ProductEyebrow$text$1(PdpEyebrowState pdpEyebrowState, ShoppingProductType shoppingProductType, BRg bRg, int i, int i2) {
        super(2);
        this.$eyebrow = pdpEyebrowState;
        this.$productType = shoppingProductType;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ProductDetailsSectionsKt.ProductEyebrow(this.$eyebrow, this.$productType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
