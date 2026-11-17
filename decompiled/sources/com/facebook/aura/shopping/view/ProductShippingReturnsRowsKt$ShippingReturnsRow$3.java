package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class ProductShippingReturnsRowsKt$ShippingReturnsRow$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $iconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ long $titleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductShippingReturnsRowsKt$ShippingReturnsRow$3(int i, String str, String str2, BRg bRg, long j, int i2, int i3) {
        super(2);
        this.$iconRes = i;
        this.$title = str;
        this.$subtitle = str2;
        this.$modifier = bRg;
        this.$titleColor = j;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public final void invoke(BFM bfm, int i) {
        ProductShippingReturnsRowsKt.m2060ShippingReturnsRowyrwZFoE(this.$iconRes, this.$title, this.$subtitle, this.$modifier, this.$titleColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
