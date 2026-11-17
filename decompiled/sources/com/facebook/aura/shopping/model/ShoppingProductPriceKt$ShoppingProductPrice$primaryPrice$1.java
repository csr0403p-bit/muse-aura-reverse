package com.facebook.aura.shopping.model;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class ShoppingProductPriceKt$ShoppingProductPrice$primaryPrice$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ShoppingDisplayPrices $prices;
    public final /* synthetic */ C1822Arm $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductPriceKt$ShoppingProductPrice$primaryPrice$1(ShoppingDisplayPrices shoppingDisplayPrices, BRg bRg, long j, C1822Arm c1822Arm, int i, int i2) {
        super(2);
        this.$prices = shoppingDisplayPrices;
        this.$modifier = bRg;
        this.$color = j;
        this.$style = c1822Arm;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingProductPriceKt.m2012ShoppingProductPricecf5BqRc(this.$prices, this.$modifier, this.$color, this.$style, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
