package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsVariantGroupState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $contentInset;
    public final /* synthetic */ AHD<ShoppingProductDetailsVariantGroupState> $groups;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<String, String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShoppingProductDetailsVariantRowKt$ShoppingProductDetailsVariantSelector$1(AHD<ShoppingProductDetailsVariantGroupState> ahd, G0V<? super String, ? super String, Unit> g0v, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$groups = ahd;
        this.$onSelect = g0v;
        this.$modifier = bRg;
        this.$contentInset = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingProductDetailsVariantRowKt.m2078ShoppingProductDetailsVariantSelectorjt2gSs(this.$groups, this.$onSelect, this.$modifier, this.$contentInset, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
