package com.facebook.aura.shopping.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ProductItemsViewModel$uiState$1", f = "ProductItemsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductItemsViewModel$uiState$1 extends AbstractC07127nr implements G0W<ProductItemsUiState, ShoppingCouponPrices, HtJ<? super ProductItemsUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public ProductItemsViewModel$uiState$1(HtJ<? super ProductItemsViewModel$uiState$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(ProductItemsUiState productItemsUiState, ShoppingCouponPrices shoppingCouponPrices, HtJ<? super ProductItemsUiState> htJ) {
        ProductItemsViewModel$uiState$1 productItemsViewModel$uiState$1 = new ProductItemsViewModel$uiState$1(htJ);
        productItemsViewModel$uiState$1.L$0 = productItemsUiState;
        productItemsViewModel$uiState$1.L$1 = shoppingCouponPrices;
        return productItemsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ProductItemsUiState productItemsUiState = (ProductItemsUiState) this.L$0;
        ShoppingCouponPrices shoppingCouponPrices = (ShoppingCouponPrices) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return ProductItemsViewModelKt.withCouponPrices(productItemsUiState, shoppingCouponPrices);
    }
}
