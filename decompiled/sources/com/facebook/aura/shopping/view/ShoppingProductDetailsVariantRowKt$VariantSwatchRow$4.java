package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantRowKt$VariantSwatchRow$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $contentInset;
    public final /* synthetic */ ShoppingProductDetailsVariantGroupState $group;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsVariantRowKt$VariantSwatchRow$4(ShoppingProductDetailsVariantGroupState shoppingProductDetailsVariantGroupState, G0V<? super String, ? super String, Unit> g0v, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$group = shoppingProductDetailsVariantGroupState;
        this.$onSelect = g0v;
        this.$contentInset = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingProductDetailsVariantRowKt.m2080VariantSwatchRow942rkJo(this.$group, this.$onSelect, this.$contentInset, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
