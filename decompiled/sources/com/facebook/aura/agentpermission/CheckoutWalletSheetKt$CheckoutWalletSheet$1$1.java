package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C3cH;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraNavigator;

/* loaded from: classes2.dex */
public final class CheckoutWalletSheetKt$CheckoutWalletSheet$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<WalletSheetUiState> $uiState$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutWalletSheetKt$CheckoutWalletSheet$1$1(AuraNavigator auraNavigator, C1BO<WalletSheetUiState> c1bo) {
        super(1);
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (C3cH.A0K(this.$uiState$delegate).dismissed) {
            CheckoutWalletSheetKt.dismissWalletSheets(this.$navigator);
        }
        return new C78g() { // from class: com.facebook.aura.agentpermission.CheckoutWalletSheetKt$CheckoutWalletSheet$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
