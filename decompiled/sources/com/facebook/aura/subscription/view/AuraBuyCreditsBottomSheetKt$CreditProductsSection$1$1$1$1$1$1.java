package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.status.viewmodel.CreditProduct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<CreditProduct, Unit> $onProductSelected;
    public final /* synthetic */ CreditProduct $product;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraBuyCreditsBottomSheetKt$CreditProductsSection$1$1$1$1$1$1(G0U<? super CreditProduct, Unit> g0u, CreditProduct creditProduct) {
        super(0);
        this.$onProductSelected = g0u;
        this.$product = creditProduct;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onProductSelected.invoke(this.$product);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
