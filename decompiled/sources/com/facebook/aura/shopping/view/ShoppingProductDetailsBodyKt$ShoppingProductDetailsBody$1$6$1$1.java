package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$6$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ProductDetailsAnalytics $analytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsBodyKt$ShoppingProductDetailsBody$1$6$1$1(ProductDetailsAnalytics productDetailsAnalytics) {
        super(0);
        this.$analytics = productDetailsAnalytics;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShoppingProductDetailsBodyKt.logDescriptionSeeMoreClick(this.$analytics.productId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
