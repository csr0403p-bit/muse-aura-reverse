package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.CheckoutWalletCardSelectionSheetKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$CheckoutWalletSheet$2$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $approvalId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ CheckoutWalletSheetViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.onChooseDifferentCardTapped();
        this.$navigator.navigate((AuraNavKey) new CheckoutWalletCardSelectionSheetKey(this.$approvalId, str), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutWalletSheetKt$CheckoutWalletSheet$2$3$1(CheckoutWalletSheetViewModel checkoutWalletSheetViewModel, AuraNavigator auraNavigator, String str) {
        super(1);
        this.$viewModel = checkoutWalletSheetViewModel;
        this.$navigator = auraNavigator;
        this.$approvalId = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
