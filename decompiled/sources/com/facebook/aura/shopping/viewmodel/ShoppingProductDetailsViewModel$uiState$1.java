package com.facebook.aura.shopping.viewmodel;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$uiState$1", f = "ShoppingProductDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel$uiState$1 extends AbstractC07127nr implements G0W<ShoppingProductDetailsUiState, ShoppingCouponPrices, HtJ<? super ShoppingProductDetailsUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsViewModel$uiState$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, HtJ<? super ShoppingProductDetailsViewModel$uiState$1> htJ) {
        super(3, htJ);
        this.this$0 = shoppingProductDetailsViewModel;
    }

    @Override // X.G0W
    public final Object invoke(ShoppingProductDetailsUiState shoppingProductDetailsUiState, ShoppingCouponPrices shoppingCouponPrices, HtJ<? super ShoppingProductDetailsUiState> htJ) {
        ShoppingProductDetailsViewModel$uiState$1 shoppingProductDetailsViewModel$uiState$1 = new ShoppingProductDetailsViewModel$uiState$1(this.this$0, htJ);
        shoppingProductDetailsViewModel$uiState$1.L$0 = shoppingProductDetailsUiState;
        shoppingProductDetailsViewModel$uiState$1.L$1 = shoppingCouponPrices;
        return shoppingProductDetailsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ShoppingProductDetailsUiState shoppingProductDetailsUiState = (ShoppingProductDetailsUiState) this.L$0;
        ShoppingCouponPrices shoppingCouponPrices = (ShoppingCouponPrices) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.this$0.hydrationTarget;
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateWithVariants$default = ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, null, null, false, false, false, null, null, null, false, shoppingCouponPrices, productDetailsHydrationTarget != null ? productDetailsHydrationTarget.priceCurrency : null, 511, null);
        return ShoppingProductDetailsUiState.copy$default(shoppingProductDetailsUiStateWithVariants$default, null, ShoppingProductDetailsDisplayState.copy$default(shoppingProductDetailsUiStateWithVariants$default.display, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, false, this.this$0.railModels.related(shoppingProductDetailsUiState.presentation.relatedProducts, shoppingCouponPrices), this.this$0.railModels.seller(shoppingProductDetailsUiState.presentation.sellerOtherListings), null, 327679, null), null, null, false, false, false, false, false, false, false, null, false, false, null, null, null, 131069, null);
    }
}
