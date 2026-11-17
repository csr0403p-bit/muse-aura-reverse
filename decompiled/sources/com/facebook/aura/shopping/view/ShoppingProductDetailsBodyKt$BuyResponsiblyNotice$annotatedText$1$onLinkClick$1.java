package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.C1BO;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$BuyResponsiblyNotice$annotatedText$1$onLinkClick$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BO6<String, String> $analyticsMetadata;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClick$delegate;
    public final /* synthetic */ String $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$BuyResponsiblyNotice$annotatedText$1$onLinkClick$1(String str, BO6<String, String> bo6, C1BO<? extends Function0<Unit>> c1bo) {
        super(0);
        this.$productId = str;
        this.$analyticsMetadata = bo6;
        this.$currentOnClick$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, HatchComponent.BUY_RESPONSIBLY_LINK, this.$productId, this.$analyticsMetadata, null);
        C1BO.A0D(this.$currentOnClick$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
