package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$ShoppingResultListItem$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
    public final /* synthetic */ ShoppingResultProduct $product;
    public final /* synthetic */ BO6<String, String> $rowMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShoppingResultsCardKt$ShoppingResultListItem$1$1(ShoppingResultProduct shoppingResultProduct, BO6<String, String> bo6, G0U<? super ShoppingResultProduct, Unit> g0u) {
        super(0);
        this.$product = shoppingResultProduct;
        this.$rowMetadata = bo6;
        this.$onProductClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_LIST, HatchComponent.PRODUCT_CARD, this.$product.productId, this.$rowMetadata, null);
        this.$onProductClick.invoke(this.$product);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
