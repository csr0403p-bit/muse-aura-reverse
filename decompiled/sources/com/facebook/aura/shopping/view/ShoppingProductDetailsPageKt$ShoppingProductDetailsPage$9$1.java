package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$9$1 extends AbstractC7559F3s implements G0V<List<? extends String>, Integer, Unit> {
    public final /* synthetic */ ContentViewerBottomActions $lightboxActions;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<ShoppingProductDetailsUiState> $uiState$delegate;
    public final /* synthetic */ ShoppingProductDetailsViewModel $viewModel;

    public final void invoke(List<String> list, int i) {
        C7384Etj.A0Y(list, 0);
        this.$viewModel.onHeroImageTapped();
        ProductDetailsSectionsKt.openProductImages(this.$navigator, list, i, this.$uiState$delegate.getValue().display.productName, this.$lightboxActions, this.$uiState$delegate.getValue().presentation.productId);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsPageKt$ShoppingProductDetailsPage$9$1(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, AuraNavigator auraNavigator, ContentViewerBottomActions contentViewerBottomActions, C1BO<ShoppingProductDetailsUiState> c1bo) {
        super(2);
        this.$viewModel = shoppingProductDetailsViewModel;
        this.$navigator = auraNavigator;
        this.$lightboxActions = contentViewerBottomActions;
        this.$uiState$delegate = c1bo;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list, Integer num) {
        invoke((List<String>) list, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
