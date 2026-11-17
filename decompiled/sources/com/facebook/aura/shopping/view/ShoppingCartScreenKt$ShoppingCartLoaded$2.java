package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.shopping.model.CurrentShoppingCart;
import com.facebook.aura.shopping.viewmodel.ShoppingCheckoutLogContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ShoppingCartScreenKt$ShoppingCartLoaded$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $checkoutFailed;
    public final /* synthetic */ CurrentShoppingCart $current;
    public final /* synthetic */ boolean $isCheckingOut;
    public final /* synthetic */ ShoppingCheckoutLogContext $logContext;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onCheckout;
    public final /* synthetic */ G0U<String, Unit> $onOpenProviderCart;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingCartScreenKt$ShoppingCartLoaded$2(CurrentShoppingCart currentShoppingCart, boolean z, boolean z2, float f, float f2, Function0<Unit> function0, G0U<? super String, Unit> g0u, ShoppingCheckoutLogContext shoppingCheckoutLogContext, BRg bRg, int i, int i2) {
        super(2);
        this.$current = currentShoppingCart;
        this.$isCheckingOut = z;
        this.$checkoutFailed = z2;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$onCheckout = function0;
        this.$onOpenProviderCart = g0u;
        this.$logContext = shoppingCheckoutLogContext;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingCartScreenKt.m2063ShoppingCartLoadedikN4xI4(this.$current, this.$isCheckingOut, this.$checkoutFailed, this.$topPadding, this.$bottomPadding, this.$onCheckout, this.$onOpenProviderCart, this.$logContext, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
