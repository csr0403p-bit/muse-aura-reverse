package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMorphSeedImage$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsHeroKt$ProductMorphSeedImage$1(String str, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$uri = str;
        this.$decodeAtSize = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchProductDetailsHeroKt.m2024ProductMorphSeedImageuFdPcIQ(this.$uri, this.$decodeAtSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
