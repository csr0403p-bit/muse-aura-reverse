package com.facebook.aura.shopping.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.viewmodel.HatchConversationScrollController;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.shopping.view.ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$2$1", f = "ShoppingProductDetailsPage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchConversationScrollController $scrollController;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C1BO<ShoppingProductDetailsUiState> $uiState$delegate;
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$2$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, HatchConversationScrollController hatchConversationScrollController, String str, AuraNavigator auraNavigator, C1BO<ShoppingProductDetailsUiState> c1bo, HtJ<? super ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = shoppingProductDetailsViewModel;
        this.$scrollController = hatchConversationScrollController;
        this.$sessionId = str;
        this.$navigator = auraNavigator;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$2$1(this.$viewModel, this.$scrollController, this.$sessionId, this.$navigator, this.$uiState$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$uiState$delegate.getValue().buySucceeded) {
            this.$viewModel.onBuyDismissHandled();
            HatchConversationScrollController hatchConversationScrollController = this.$scrollController;
            String str = this.$sessionId;
            if (str == null) {
                str = "primary_session_id";
            }
            hatchConversationScrollController.requestScrollToBottom(str);
            boolean zIsProductDetailsFromLightbox = ProductDetailsNavigationKt.isProductDetailsFromLightbox(this.$navigator);
            this.$navigator.back();
            ProductDetailsNavigationKt.popLightboxUnder(this.$navigator, zIsProductDetailsFromLightbox);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
