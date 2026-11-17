package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.conversation.view.HatchUrlClickHandlerKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import com.facebook.aura.shopping.navigation.ShoppingProductDetailsNavigationKt;
import com.facebook.aura.shopping.viewmodel.ProductItemsSection;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductItemsScreenKt$ProductItemsTile$1$1 extends AbstractC7559F3s implements G0U<ShoppingResultProduct, Unit> {
    public final /* synthetic */ String $cardWidgetId;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $index;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationEventId;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ AHD<ShoppingResultProduct> $rawProducts;
    public final /* synthetic */ ProductItemsSection $section;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ShoppingResultProduct shoppingResultProduct) {
        C7384Etj.A0Y(shoppingResultProduct, 0);
        if (!ProductItemsScreenKt.getShoppingResultPdpEnabled()) {
            String str = shoppingResultProduct.url;
            if (str != null) {
                HatchUrlClickHandlerKt.handleUrlClick(this.$userSession, str, this.$context, this.$navigator, null, null);
                return;
            }
            return;
        }
        AuraNavigator auraNavigator = this.$navigator;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        String str2 = this.$sessionId;
        String str3 = this.$messageId;
        ShoppingFormat shoppingFormat = ShoppingFormat.GRID;
        String str4 = this.$cardWidgetId;
        String strShoppingReplyPresentationEventId = ShoppingResultsPresentationKt.shoppingReplyPresentationEventId(this.$presentationEventId);
        Integer num = shoppingResultProduct.wireIndex;
        ProductItemsSection productItemsSection = this.$section;
        String str5 = productItemsSection.kind;
        ProductDetailsNavigationKt.navigateToProductDetails(auraNavigator, abstractC3358CGz, shoppingResultProduct, str2, str3, shoppingFormat, str4, new ShoppingProductSource(this.$presentationId, strShoppingReplyPresentationEventId, this.$index, productItemsSection.widgetId, num, str5, null, null), ShoppingProductDetailsNavigationKt.shoppingProductSharedElementKey(shoppingFormat, this.$presentationId, this.$index), this.$rawProducts, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductItemsScreenKt$ProductItemsTile$1$1(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str, String str2, String str3, String str4, ProductItemsSection productItemsSection, String str5, int i, AHD<ShoppingResultProduct> ahd, Context context) {
        super(1);
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$sessionId = str;
        this.$messageId = str2;
        this.$cardWidgetId = str3;
        this.$presentationEventId = str4;
        this.$section = productItemsSection;
        this.$presentationId = str5;
        this.$index = i;
        this.$rawProducts = ahd;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ShoppingResultProduct shoppingResultProduct) {
        invoke2(shoppingResultProduct);
        return Unit.INSTANCE;
    }
}
