package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class RentalCarImageKt$RentalCarImage$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $cornerRadius;
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $sharedKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarImageKt$RentalCarImage$2(String str, String str2, BRg bRg, float f, float f2, int i, int i2) {
        super(2);
        this.$imageUrl = str;
        this.$sharedKey = str2;
        this.$modifier = bRg;
        this.$cornerRadius = f;
        this.$decodeAtSize = f2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        RentalCarImageKt.m1882RentalCarImage6PoWaU8(this.$imageUrl, this.$sharedKey, this.$modifier, this.$cornerRadius, this.$decodeAtSize, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
