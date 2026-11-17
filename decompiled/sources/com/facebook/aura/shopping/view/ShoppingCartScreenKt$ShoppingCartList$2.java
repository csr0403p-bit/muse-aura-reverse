package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchShoppingDataState;
import com.facebook.aura.shopping.model.ShoppingCart;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenKt$ShoppingCartList$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ ShoppingCart $cart;
    public final /* synthetic */ HatchShoppingDataState $dataState;
    public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ boolean $showSubtotal;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $staleNotice;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingCartScreenKt$ShoppingCartList$2(ShoppingCart shoppingCart, float f, float f2, ShoppingCheckoutLogContext shoppingCheckoutLogContext, HatchShoppingDataState hatchShoppingDataState, BRg bRg, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
        super(2);
        this.$cart = shoppingCart;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$logContext = shoppingCheckoutLogContext;
        this.$dataState = hatchShoppingDataState;
        this.$modifier = bRg;
        this.$showSubtotal = z;
        this.$staleNotice = g0v;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingCartScreenKt.m2062ShoppingCartListeWuZFaY(this.$cart, this.$topPadding, this.$bottomPadding, this.$logContext, this.$dataState, this.$modifier, this.$showSubtotal, this.$staleNotice, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
