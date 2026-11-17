package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsVariantRowKt$VariantOptionChip$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $isAvailable;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductDetailsVariantRowKt$VariantOptionChip$2(String str, float f, boolean z, boolean z2, BRg bRg, int i, int i2) {
        super(2);
        this.$label = str;
        this.$width = f;
        this.$isSelected = z;
        this.$isAvailable = z2;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        ShoppingProductDetailsVariantRowKt.m2079VariantOptionChipEUb7tLY(this.$label, this.$width, this.$isSelected, this.$isAvailable, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
