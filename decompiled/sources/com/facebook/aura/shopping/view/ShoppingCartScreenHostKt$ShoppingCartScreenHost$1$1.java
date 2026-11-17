package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationScrollController;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.viewmodel.ShoppingCartUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenHostKt$ShoppingCartScreenHost$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C1BO<ShoppingCartUiState> $uiState$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ ShoppingCartViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartScreenHostKt$ShoppingCartScreenHost$1$1(ShoppingCartViewModel shoppingCartViewModel, AbstractC3358CGz abstractC3358CGz, String str, AuraNavigator auraNavigator, C1BO<ShoppingCartUiState> c1bo) {
        super(1);
        this.$viewModel = shoppingCartViewModel;
        this.$userSession = abstractC3358CGz;
        this.$sessionId = str;
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$uiState$delegate.getValue().checkoutSucceeded) {
            this.$viewModel.onCheckoutDismissHandled();
            HatchConversationScrollController companion = HatchConversationScrollController.Companion.getInstance(this.$userSession);
            String str = this.$sessionId;
            if (str == null) {
                str = "primary_session_id";
            }
            companion.requestScrollToBottom(str);
            this.$navigator.back();
        }
        return new C78g() { // from class: com.facebook.aura.shopping.view.ShoppingCartScreenHostKt$ShoppingCartScreenHost$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
