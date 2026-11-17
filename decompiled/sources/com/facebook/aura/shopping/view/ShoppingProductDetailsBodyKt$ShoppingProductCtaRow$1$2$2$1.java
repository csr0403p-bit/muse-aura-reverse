package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.G0U;
import com.facebook.aura.shopping.model.PdpActionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsBodyKt$ShoppingProductCtaRow$1$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BO6<String, String> $analyticsMetadata;
    public final /* synthetic */ PdpActionIntent $intent;
    public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
    public final /* synthetic */ String $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsBodyKt$ShoppingProductCtaRow$1$2$2$1(String str, BO6<String, String> bo6, G0U<? super PdpActionIntent, Unit> g0u, PdpActionIntent pdpActionIntent) {
        super(0);
        this.$productId = str;
        this.$analyticsMetadata = bo6;
        this.$onAction = g0u;
        this.$intent = pdpActionIntent;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ShoppingProductDetailsBodyKt.logPdpDeeplinkClick(this.$productId, this.$analyticsMetadata);
        this.$onAction.invoke(this.$intent);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
