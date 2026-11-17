package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class PairsComponentsKt$PairsPersonPhoto$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ PairsImageRef $photo;
    public final /* synthetic */ long $placeholderColor;
    public final /* synthetic */ float $size;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsComponentsKt$PairsPersonPhoto$1(PairsImageRef pairsImageRef, float f, BRg bRg, long j, int i, int i2) {
        super(2);
        this.$photo = pairsImageRef;
        this.$size = f;
        this.$modifier = bRg;
        this.$placeholderColor = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        PairsComponentsKt.m1664PairsPersonPhotovlEVYhg(this.$photo, this.$size, this.$modifier, this.$placeholderColor, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
