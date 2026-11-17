package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsSheetKt$InstacartProductHero$1$1$1 extends AbstractC7559F3s implements G0V<List<? extends String>, Integer, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ProductDetailsPresentation $presentation;
    public final /* synthetic */ InstacartProductDetailsViewModel $viewModel;

    public final void invoke(List<String> list, int i) {
        C7384Etj.A0Y(list, 0);
        this.$viewModel.onHeroImageTapped();
        ProductDetailsSectionsKt.openProductImages(this.$navigator, list, i, this.$presentation.product.name, null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstacartProductDetailsSheetKt$InstacartProductHero$1$1$1(InstacartProductDetailsViewModel instacartProductDetailsViewModel, AuraNavigator auraNavigator, ProductDetailsPresentation productDetailsPresentation) {
        super(2);
        this.$viewModel = instacartProductDetailsViewModel;
        this.$navigator = auraNavigator;
        this.$presentation = productDetailsPresentation;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list, Integer num) {
        invoke((List<String>) list, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
