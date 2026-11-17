package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$3$2$1 extends C7438Evz implements G0U<WalletOptionKey, Unit> {
    public CheckoutWalletSheetKt$CheckoutWalletCardSelectionSheet$3$2$1(Object obj) {
        super(1, obj, CheckoutWalletSheetViewModel.class, "onSelectCard", "onSelectCard(Lcom/facebook/aura/agentpermission/WalletOptionKey;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WalletOptionKey walletOptionKey) {
        ((CheckoutWalletSheetViewModel) AnonymousClass006.A0o(walletOptionKey, this)).onSelectCard(walletOptionKey);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WalletOptionKey walletOptionKey) {
        invoke2(walletOptionKey);
        return Unit.INSTANCE;
    }
}
