package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$ShoppingResultProductCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShoppingCardClickLogging $clickLogging;
    public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
    public final /* synthetic */ ShoppingResultProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShoppingResultsCardKt$ShoppingResultProductCard$1$1(ShoppingCardClickLogging shoppingCardClickLogging, ShoppingResultProduct shoppingResultProduct, G0U<? super ShoppingResultProduct, Unit> g0u) {
        super(0);
        this.$clickLogging = shoppingCardClickLogging;
        this.$product = shoppingResultProduct;
        this.$onProductClick = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        ShoppingCardClickLogging shoppingCardClickLogging = this.$clickLogging;
        hatchInteractionLogger.logClick(hatchSurface, null, shoppingCardClickLogging.screen, shoppingCardClickLogging.component, this.$product.productId, shoppingCardClickLogging.metadata, null);
        this.$onProductClick.invoke(this.$product);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
