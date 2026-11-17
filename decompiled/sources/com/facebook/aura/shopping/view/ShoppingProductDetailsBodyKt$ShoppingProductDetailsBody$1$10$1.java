package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$10$1 extends AbstractC7559F3s implements G0U<ShoppingResultProduct, Unit> {
    public final /* synthetic */ G0V<ShoppingResultProduct, ShoppingFormat, Unit> $onRelatedProductClick;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        this.$onRelatedProductClick.invoke(shoppingResultProduct, ShoppingFormat.SELLER_RAIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$10$1(G0V<? super ShoppingResultProduct, ? super ShoppingFormat, Unit> g0v) {
        super(1);
        this.$onRelatedProductClick = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ShoppingResultProduct shoppingResultProduct) {
        invoke2(shoppingResultProduct);
        return Unit.INSTANCE;
    }
}
