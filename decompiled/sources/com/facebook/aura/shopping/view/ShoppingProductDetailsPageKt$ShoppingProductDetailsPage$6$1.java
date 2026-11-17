package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.shopping.model.PdpActionIntent;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$6$1 extends AbstractC7559F3s implements G0U<PdpActionIntent, Unit> {
    public final /* synthetic */ ProductActionHandler $actionHandler;
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpActionIntent pdpActionIntent) {
        ProductActionHandler productActionHandler;
        String str;
        C7384Etj.A0Y(pdpActionIntent, 0);
        if (pdpActionIntent instanceof PdpActionIntent.BuyNow) {
            this.$viewModel.onBuyTapped();
            return;
        }
        if (pdpActionIntent instanceof PdpActionIntent.AddToCart) {
            this.$viewModel.onAddToCartTapped();
            return;
        }
        if (pdpActionIntent instanceof PdpActionIntent.OpenUrl) {
            productActionHandler = this.$actionHandler;
            str = ((PdpActionIntent.OpenUrl) pdpActionIntent).url;
        } else {
            if (!(pdpActionIntent instanceof PdpActionIntent.Deeplink)) {
                throw C3cG.A0q();
            }
            productActionHandler = this.$actionHandler;
            str = ((PdpActionIntent.Deeplink) pdpActionIntent).uri;
        }
        productActionHandler.openUrl(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$6$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, ProductActionHandler productActionHandler) {
        super(1);
        this.$viewModel = shoppingProductDetailsViewModel;
        this.$actionHandler = productActionHandler;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PdpActionIntent pdpActionIntent) {
        invoke2(pdpActionIntent);
        return Unit.INSTANCE;
    }
}
