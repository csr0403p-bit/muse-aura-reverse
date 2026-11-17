package com.facebook.aura.shopping.view;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.shopping.model.PdpSeller;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsSellerSectionKt$HatchProductDetailsSellerSection$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ProductDetailsAnalytics $analytics;
    public final /* synthetic */ G0U<String, Unit> $onOpenUrl;
    public final /* synthetic */ String $productId;
    public final /* synthetic */ String $productUrl;
    public final /* synthetic */ String $profileUrl;
    public final /* synthetic */ PdpSeller $seller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsSellerSectionKt$HatchProductDetailsSellerSection$1$2$1(String str, ProductDetailsAnalytics productDetailsAnalytics, String str2, PdpSeller pdpSeller, G0U<? super String, Unit> g0u, String str3) {
        super(0);
        this.$productId = str;
        this.$analytics = productDetailsAnalytics;
        this.$productUrl = str2;
        this.$seller = pdpSeller;
        this.$onOpenUrl = g0u;
        this.$profileUrl = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<String, String> mapA0E;
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        HatchComponent hatchComponent = HatchComponent.SELLER_PROFILE_LINK;
        String str = this.$productId;
        ProductDetailsAnalytics productDetailsAnalytics = this.$analytics;
        String str2 = this.$productUrl;
        String str3 = this.$seller.sellerId;
        if (str3 == null || (mapA0E = AnonymousClass007.A0c(HatchMetadataKey.SELLER_ID, str3)) == null) {
            mapA0E = AGH.A0E();
        }
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str, productDetailsAnalytics.metadata(str2, null, mapA0E), null);
        this.$onOpenUrl.invoke(this.$profileUrl);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
