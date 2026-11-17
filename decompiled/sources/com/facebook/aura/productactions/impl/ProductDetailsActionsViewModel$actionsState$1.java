package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2k;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.model.ReplyElementSupport;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$actionsState$1", f = "ProductDetailsActionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductDetailsActionsViewModel$actionsState$1 extends AbstractC07127nr implements G2k<ProductDetailsHeaderContext, ShoppingResultProduct, ReplyElementSupport, HatchGatewayConnectionState, HtJ<? super ProductDetailsActionsUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ ProductDetailsActionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsActionsViewModel$actionsState$1(ProductDetailsActionsViewModel productDetailsActionsViewModel, HtJ<? super ProductDetailsActionsViewModel$actionsState$1> htJ) {
        super(5, htJ);
        this.this$0 = productDetailsActionsViewModel;
    }

    @Override // X.G2k
    public final Object invoke(ProductDetailsHeaderContext productDetailsHeaderContext, ShoppingResultProduct shoppingResultProduct, ReplyElementSupport replyElementSupport, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super ProductDetailsActionsUiState> htJ) {
        ProductDetailsActionsViewModel$actionsState$1 productDetailsActionsViewModel$actionsState$1 = new ProductDetailsActionsViewModel$actionsState$1(this.this$0, htJ);
        productDetailsActionsViewModel$actionsState$1.L$0 = productDetailsHeaderContext;
        productDetailsActionsViewModel$actionsState$1.L$1 = shoppingResultProduct;
        return productDetailsActionsViewModel$actionsState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ProductDetailsHeaderContext productDetailsHeaderContext = (ProductDetailsHeaderContext) this.L$0;
        ShoppingResultProduct shoppingResultProduct = (ShoppingResultProduct) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return ProductDetailsActionsViewModelKt.productDetailsActionsState(productDetailsHeaderContext, shoppingResultProduct, this.this$0.gateway.getCurrentReplyElementSupport());
    }
}
