package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.C07C;
import X.C78N;
import X.G0U;
import X.G0W;
import com.facebook.aura.gateway.WalletPaymentOption;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1$1$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ WalletOptionKey $currentSelectionKey;
    public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelect;
    public final /* synthetic */ WalletPaymentOption $option;
    public final /* synthetic */ WalletOptionKey $requestedKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1$1$1(WalletPaymentOption walletPaymentOption, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u) {
        super(3);
        this.$option = walletPaymentOption;
        this.$currentSelectionKey = walletOptionKey;
        this.$requestedKey = walletOptionKey2;
        this.$onSelect = g0u;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            bfm.Afo();
            return;
        }
        WalletPaymentOption walletPaymentOption = this.$option;
        boolean zEquals = CheckoutWalletSheetViewModelKt.getKey(walletPaymentOption).equals(this.$currentSelectionKey);
        boolean zEquals2 = CheckoutWalletSheetViewModelKt.getKey(this.$option).equals(this.$requestedKey);
        boolean zA1T = AnonymousClass001.A1T(bfm, this.$option, bfm.A65(this.$onSelect));
        G0U<WalletOptionKey, Unit> g0u = this.$onSelect;
        WalletPaymentOption walletPaymentOption2 = this.$option;
        Object objAaT = bfm.AaT();
        if (zA1T || objAaT == C78N.A00) {
            objAaT = new CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1$1$1$1$1(g0u, walletPaymentOption2);
            bfm.Ai0(objAaT);
        }
        CheckoutWalletSheetKt.WalletOptionRow(walletPaymentOption, zEquals, zEquals2, (Function0) objAaT, null, bfm, WalletPaymentOption.$stable, 16);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
