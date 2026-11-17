package com.facebook.aura.agentpermission;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.gateway.WalletPaymentOption;
import com.facebook.aura.ui.HatchSectionScope;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ WalletOptionKey $currentSelectionKey;
    public final /* synthetic */ WalletPaymentMethodGroup $group;
    public final /* synthetic */ G0U<WalletOptionKey, Unit> $onSelect;
    public final /* synthetic */ WalletOptionKey $requestedKey;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AHD<WalletPaymentOption> ahd = this.$group.paymentOptions;
        WalletOptionKey walletOptionKey = this.$currentSelectionKey;
        WalletOptionKey walletOptionKey2 = this.$requestedKey;
        G0U<WalletOptionKey, Unit> g0u = this.$onSelect;
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass006.A1E(hatchSectionScope, new CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1$1$1((WalletPaymentOption) it.next(), walletOptionKey, walletOptionKey2, g0u), -2121894425);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutWalletSheetKt$WalletCardSelectionContent$1$1$1(WalletPaymentMethodGroup walletPaymentMethodGroup, WalletOptionKey walletOptionKey, WalletOptionKey walletOptionKey2, G0U<? super WalletOptionKey, Unit> g0u) {
        super(1);
        this.$group = walletPaymentMethodGroup;
        this.$currentSelectionKey = walletOptionKey;
        this.$requestedKey = walletOptionKey2;
        this.$onSelect = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
