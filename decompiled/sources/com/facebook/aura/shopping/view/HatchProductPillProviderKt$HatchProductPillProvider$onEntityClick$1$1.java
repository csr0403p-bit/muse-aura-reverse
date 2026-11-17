package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.BO6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchProductPillProviderKt$HatchProductPillProvider$onEntityClick$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ ShoppingMerchantRanking $merchantRanking;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ BO6<String, ShoppingResultProduct> $productsByPillId;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        ShoppingResultProduct shoppingResultProduct = this.$productsByPillId.get(str);
        if (shoppingResultProduct != null) {
            String str2 = this.$messageId;
            ShoppingMerchantRanking shoppingMerchantRanking = this.$merchantRanking;
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            String str3 = this.$sessionId;
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSurface hatchSurface = HatchSurface.SHOPPING;
            HatchScreen hatchScreen = HatchScreen.MAIN_CHAT;
            HatchComponent hatchComponent = HatchComponent.SHOPPING_PRODUCT_ENTITY;
            String str4 = shoppingResultProduct.productId;
            ShoppingFormat shoppingFormat = ShoppingFormat.CHIP;
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str4, ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, str2, shoppingFormat, null, shoppingMerchantRanking, HatchProductPillProviderKt.chipPositionMetadata(str)), null);
            ProductDetailsNavigationKt.navigateToProductDetails(auraNavigator, abstractC3358CGz, shoppingResultProduct, str3, str2, shoppingFormat, null, new ShoppingProductSource(null, null, 0, null, null, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS, str2, shoppingResultProduct.citationId), null, null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductPillProviderKt$HatchProductPillProvider$onEntityClick$1$1(BO6<String, ShoppingResultProduct> bo6, String str, ShoppingMerchantRanking shoppingMerchantRanking, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, String str2) {
        super(1);
        this.$productsByPillId = bo6;
        this.$messageId = str;
        this.$merchantRanking = shoppingMerchantRanking;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$sessionId = str2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
