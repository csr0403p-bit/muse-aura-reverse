package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.productactions.api.ProductMediaActionInput;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$mediaActionInputs$1", f = "ProductDetailsActionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductDetailsActionsViewModel$mediaActionInputs$1 extends AbstractC07127nr implements G0W<ProductDetailsPresentation, ShoppingResultProduct, HtJ<? super ProductMediaActionInput>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public ProductDetailsActionsViewModel$mediaActionInputs$1(HtJ<? super ProductDetailsActionsViewModel$mediaActionInputs$1> htJ) {
        super(3, htJ);
    }

    @Override // X.G0W
    public final Object invoke(ProductDetailsPresentation productDetailsPresentation, ShoppingResultProduct shoppingResultProduct, HtJ<? super ProductMediaActionInput> htJ) {
        ProductDetailsActionsViewModel$mediaActionInputs$1 productDetailsActionsViewModel$mediaActionInputs$1 = new ProductDetailsActionsViewModel$mediaActionInputs$1(htJ);
        productDetailsActionsViewModel$mediaActionInputs$1.L$0 = productDetailsPresentation;
        productDetailsActionsViewModel$mediaActionInputs$1.L$1 = shoppingResultProduct;
        return productDetailsActionsViewModel$mediaActionInputs$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ProductDetailsPresentation productDetailsPresentation = (ProductDetailsPresentation) this.L$0;
        ShoppingResultProduct shoppingResultProduct = (ShoppingResultProduct) this.L$1;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return new ProductMediaActionInput(shoppingResultProduct, productDetailsPresentation);
    }
}
