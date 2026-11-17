package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductItemsScreenKt$ProductItemsScreen$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ShoppingResultsAttribution $it;
    public final /* synthetic */ ProductItemsUiState.Loaded $loaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductItemsScreenKt$ProductItemsScreen$1$1(ShoppingResultsAttribution shoppingResultsAttribution, ProductItemsUiState.Loaded loaded) {
        super(2);
        this.$it = shoppingResultsAttribution;
        this.$loaded = loaded;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            ShoppingMerchantLogoKt.ShoppingMerchantNavTitle(this.$it.title, ProductItemsScreenKt.text(this.$loaded.merchantDetail, bfm, 0), this.$it.iconUrl, null, bfm, 0, 8);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
