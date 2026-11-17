package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.G0V;
import com.facebook.aura.shopping.viewmodel.ShoppingCartNavTitle;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenKt$ShoppingCartScreen$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ ShoppingCartNavTitle $navTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartScreenKt$ShoppingCartScreen$1$1(ShoppingCartNavTitle shoppingCartNavTitle) {
        super(2);
        this.$navTitle = shoppingCartNavTitle;
    }

    public final void invoke(BFM bfm, int i) {
        if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            bfm.Afo();
        } else {
            ShoppingCartNavTitle shoppingCartNavTitle = this.$navTitle;
            ShoppingMerchantLogoKt.ShoppingMerchantNavTitle(shoppingCartNavTitle.merchant, shoppingCartNavTitle.detail, shoppingCartNavTitle.iconUrl, null, bfm, 0, 8);
        }
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
