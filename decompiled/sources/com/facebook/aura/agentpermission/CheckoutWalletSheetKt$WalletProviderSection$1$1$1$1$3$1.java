package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.gateway.WalletPaymentOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$WalletProviderSection$1$1$1$1$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelectCard;
    public final /* synthetic */ WalletPaymentOption $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutWalletSheetKt$WalletProviderSection$1$1$1$1$3$1(WalletPaymentOption walletPaymentOption, G0U<? super WalletOptionKey, Unit> g0u) {
        super(0);
        this.$option = walletPaymentOption;
        this.$onSelectCard = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        WalletPaymentOption walletPaymentOption = this.$option;
        if (walletPaymentOption != null) {
            this.$onSelectCard.invoke(CheckoutWalletSheetViewModelKt.getKey(walletPaymentOption));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
