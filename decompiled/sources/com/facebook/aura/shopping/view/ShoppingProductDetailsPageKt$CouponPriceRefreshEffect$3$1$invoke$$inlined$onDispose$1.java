package com.facebook.aura.shopping.view;

import X.C78g;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$3$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel$inlined;

    public ShoppingProductDetailsPageKt$CouponPriceRefreshEffect$3$1$invoke$$inlined$onDispose$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel) {
        this.$viewModel$inlined = shoppingProductDetailsViewModel;
    }

    @Override // X.C78g
    public void dispose() {
        this.$viewModel$inlined.onPageDisposed();
    }
}
