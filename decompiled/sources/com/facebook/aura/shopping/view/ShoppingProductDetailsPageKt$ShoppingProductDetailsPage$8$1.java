package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$8$1 extends AbstractC7559F3s implements G0V<ShoppingResultProduct, ShoppingFormat, Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShoppingResultProduct shoppingResultProduct, ShoppingFormat shoppingFormat) {
        AnonymousClass003.A0u(shoppingResultProduct, shoppingFormat);
        ProductDetailsNavigationKt.navigateToProductDetails(this.$navigator, this.$userSession, shoppingResultProduct, this.$sessionId, this.$hostMessageId, shoppingFormat, null, null, null, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$8$1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        super(2);
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$sessionId = str;
        this.$hostMessageId = str2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(ShoppingResultProduct shoppingResultProduct, ShoppingFormat shoppingFormat) {
        invoke2(shoppingResultProduct, shoppingFormat);
        return Unit.INSTANCE;
    }
}
