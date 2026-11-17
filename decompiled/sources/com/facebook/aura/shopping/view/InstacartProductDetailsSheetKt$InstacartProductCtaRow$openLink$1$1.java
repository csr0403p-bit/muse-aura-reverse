package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.BO6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.viewmodel.InstacartProductAction;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKt$InstacartProductCtaRow$openLink$1$1 extends AbstractC7559F3s implements G0U<InstacartProductAction.OpenLink, Unit> {
    public final /* synthetic */ ProductActionHandler $actionHandler;
    public final /* synthetic */ BO6<String, String> $analyticsMetadata;
    public final /* synthetic */ InstacartProductDetailsSheetKey $productKey;
    public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InstacartProductAction.OpenLink openLink) {
        C7384Etj.A0Y(openLink, 0);
        String str = openLink.url;
        ShoppingSecondaryAction shoppingSecondaryAction = this.$productKey.secondaryAction;
        ProductDetailsSectionsKt.logPdpLinkClick(str, shoppingSecondaryAction != null ? shoppingSecondaryAction.url : null, this.$viewModel.analytics.productId, this.$analyticsMetadata);
        this.$actionHandler.openUrl(openLink.url);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstacartProductDetailsSheetKt$InstacartProductCtaRow$openLink$1$1(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsViewModel instacartProductDetailsViewModel, BO6<String, String> bo6, ProductActionHandler productActionHandler) {
        super(1);
        this.$productKey = instacartProductDetailsSheetKey;
        this.$viewModel = instacartProductDetailsViewModel;
        this.$analyticsMetadata = bo6;
        this.$actionHandler = productActionHandler;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InstacartProductAction.OpenLink openLink) {
        invoke2(openLink);
        return Unit.INSTANCE;
    }
}
