package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchShoppingResultsCardKt$HatchShoppingResultsCard$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ShoppingMerchantRanking $merchantRanking;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationEventId;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ List<ShoppingResultProduct> $products;
    public final /* synthetic */ ShoppingResultsPresentation $results;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ String $widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingResultsCardKt$HatchShoppingResultsCard$1$2$1(String str, String str2, ShoppingMerchantRanking shoppingMerchantRanking, List<ShoppingResultProduct> list, AbstractC3358CGz abstractC3358CGz, String str3, ShoppingResultsPresentation shoppingResultsPresentation, AuraNavigator auraNavigator, String str4, String str5) {
        super(0);
        this.$messageId = str;
        this.$widgetId = str2;
        this.$merchantRanking = shoppingMerchantRanking;
        this.$products = list;
        this.$userSession = abstractC3358CGz;
        this.$presentationId = str3;
        this.$results = shoppingResultsPresentation;
        this.$navigator = auraNavigator;
        this.$sessionId = str4;
        this.$presentationEventId = str5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_LIST, HatchComponent.VIEW_ALL_PRODUCTS_BUTTON, null, ShoppingAnalyticsMetadataKt.shoppingWidgetMetadata(this.$messageId, ShoppingFormat.LIST, this.$widgetId, this.$merchantRanking, AnonymousClass006.A10(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(this.$products.size()))), null);
        HatchShoppingSeedStore.Companion.getInstance(this.$userSession).rememberResults(this.$messageId, this.$presentationId, this.$results);
        this.$navigator.navigate((AuraNavKey) new ProductItemsScreenKey(this.$messageId, this.$sessionId, this.$presentationId, this.$presentationEventId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
