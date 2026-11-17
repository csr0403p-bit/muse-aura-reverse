package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import com.facebook.aura.analytics.hatch.HatchShoppingControl;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLoggingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ShoppingPresentationCardRendererKt$CheckoutOfferLinkCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShoppingCheckoutLogContext $logContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingPresentationCardRendererKt$CheckoutOfferLinkCard$1$1(ShoppingCheckoutLogContext shoppingCheckoutLogContext) {
        super(0);
        this.$logContext = shoppingCheckoutLogContext;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShoppingCheckoutLogContext shoppingCheckoutLogContext = this.$logContext;
        if (shoppingCheckoutLogContext != null) {
            ShoppingCheckoutLoggingKt.logActionClick(shoppingCheckoutLogContext, HatchShoppingControl.CHECKOUT_OFFER_LINK, AnonymousClass002.A0k(), null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
