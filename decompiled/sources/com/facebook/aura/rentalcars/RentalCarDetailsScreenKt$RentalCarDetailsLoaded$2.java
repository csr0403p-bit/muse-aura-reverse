package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RentalCarDetailsScreenKt$RentalCarDetailsLoaded$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $imageSharedKey;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onBook;
    public final /* synthetic */ RentalCarRate $rate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarDetailsScreenKt$RentalCarDetailsLoaded$2(RentalCarRate rentalCarRate, String str, Function0<Unit> function0, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$rate = rentalCarRate;
        this.$imageSharedKey = str;
        this.$onBook = function0;
        this.$bottomPadding = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        RentalCarDetailsScreenKt.m1877RentalCarDetailsLoadedhGBTI10(this.$rate, this.$imageSharedKey, this.$onBook, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
