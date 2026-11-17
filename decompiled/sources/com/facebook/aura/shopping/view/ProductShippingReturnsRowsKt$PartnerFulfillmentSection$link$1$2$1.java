package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.G0U;
import com.facebook.aura.shopping.model.PdpActionIntent;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductShippingReturnsRowsKt$PartnerFulfillmentSection$link$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ProductDetailsAnalytics $analytics;
    public final /* synthetic */ BO6<String, String> $analyticsMetadata;
    public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
    public final /* synthetic */ String $secondaryActionUrl;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductShippingReturnsRowsKt$PartnerFulfillmentSection$link$1$2$1(String str, String str2, ProductDetailsAnalytics productDetailsAnalytics, BO6<String, String> bo6, G0U<? super PdpActionIntent, Unit> g0u) {
        super(0);
        this.$url = str;
        this.$secondaryActionUrl = str2;
        this.$analytics = productDetailsAnalytics;
        this.$analyticsMetadata = bo6;
        this.$onAction = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ProductDetailsSectionsKt.logPdpLinkClick(this.$url, this.$secondaryActionUrl, this.$analytics.productId, this.$analyticsMetadata);
        this.$onAction.invoke(new PdpActionIntent.OpenUrl(this.$url));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
