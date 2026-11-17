package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C3cG;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionEnumsKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchShoppingControl;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ShoppingCartScreenKey;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLoggingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchShoppingCartCardKt$ShoppingCartViewCartButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShoppingCartPresentation $cart;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingCartCardKt$ShoppingCartViewCartButton$1$1(String str, String str2, ShoppingCartPresentation shoppingCartPresentation, ShoppingCheckoutLogContext shoppingCheckoutLogContext, AuraNavigator auraNavigator, String str3) {
        super(0);
        this.$sessionId = str;
        this.$hostMessageId = str2;
        this.$cart = shoppingCartPresentation;
        this.$logContext = shoppingCheckoutLogContext;
        this.$navigator = auraNavigator;
        this.$presentationId = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchInteractionEnumsKt.chatScreen(AnonymousClass002.A1Y(this.$sessionId)), HatchComponent.VIEW_CART_BUTTON, null, AnonymousClass007.A0d(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(this.$cart.cart.items.size()), C3cG.A0r(HatchMetadataKey.HOST_MESSAGE_ID.getValue(), this.$hostMessageId)), null);
        ShoppingCheckoutLoggingKt.logActionClick(this.$logContext, HatchShoppingControl.CART_OPEN, AnonymousClass002.A0k(), null);
        this.$navigator.navigate((AuraNavKey) new ShoppingCartScreenKey(this.$hostMessageId, this.$presentationId, this.$cart.widgetId, this.$sessionId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
