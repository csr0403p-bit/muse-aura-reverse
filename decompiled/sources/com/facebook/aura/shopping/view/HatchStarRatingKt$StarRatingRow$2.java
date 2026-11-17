package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchStarRatingKt$StarRatingRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ double $rating;
    public final /* synthetic */ float $starSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchStarRatingKt$StarRatingRow$2(double d, BRg bRg, float f, int i, int i2) {
        super(2);
        this.$rating = d;
        this.$modifier = bRg;
        this.$starSize = f;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchStarRatingKt.m2044StarRatingRow6a0pyJM(this.$rating, this.$modifier, this.$starSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
