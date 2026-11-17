package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HotelSelectionContentKt$HotelSelectionPriceLabel$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $note;
    public final /* synthetic */ Function0<Unit> $onShowTaxes;
    public final /* synthetic */ C1822Arm $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContentKt$HotelSelectionPriceLabel$3(String str, String str2, C1822Arm c1822Arm, long j, Function0<Unit> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$label = str;
        this.$note = str2;
        this.$style = c1822Arm;
        this.$color = j;
        this.$onShowTaxes = function0;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        HotelSelectionContentKt.m1085HotelSelectionPriceLabelfWhpE4E(this.$label, this.$note, this.$style, this.$color, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
