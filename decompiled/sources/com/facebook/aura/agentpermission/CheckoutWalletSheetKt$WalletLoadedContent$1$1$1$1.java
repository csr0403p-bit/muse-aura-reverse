package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$WalletLoadedContent$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WalletPaymentMethodGroup $group;
    public final /* synthetic */ G0U<String, Unit> $onChooseDifferentCard;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutWalletSheetKt$WalletLoadedContent$1$1$1$1(G0U<? super String, Unit> g0u, WalletPaymentMethodGroup walletPaymentMethodGroup) {
        super(0);
        this.$onChooseDifferentCard = g0u;
        this.$group = walletPaymentMethodGroup;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onChooseDifferentCard.invoke(this.$group.paymentMethod);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
