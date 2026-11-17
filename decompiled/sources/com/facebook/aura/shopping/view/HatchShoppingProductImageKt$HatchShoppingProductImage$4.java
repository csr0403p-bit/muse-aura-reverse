package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchShoppingProductImageKt$HatchShoppingProductImage$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $allowsLinkPreview;
    public final /* synthetic */ float $decodeAtSize;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
    public final /* synthetic */ String $pageUrl;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $placeholder;
    public final /* synthetic */ String $productKey;
    public final /* synthetic */ boolean $showShimmeringState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchShoppingProductImageKt$HatchShoppingProductImage$4(String str, String str2, String str3, boolean z, float f, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, boolean z2, G0V<? super Integer, ? super Integer, Unit> g0v2, int i, int i2) {
        super(2);
        this.$productKey = str;
        this.$imageUrl = str2;
        this.$pageUrl = str3;
        this.$allowsLinkPreview = z;
        this.$decodeAtSize = f;
        this.$placeholder = g0v;
        this.$modifier = bRg;
        this.$showShimmeringState = z2;
        this.$onImageSizeDecoded = g0v2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchShoppingProductImageKt.m2038HatchShoppingProductImagegNPyAyM(this.$productKey, this.$imageUrl, this.$pageUrl, this.$allowsLinkPreview, this.$decodeAtSize, this.$placeholder, this.$modifier, this.$showShimmeringState, this.$onImageSizeDecoded, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
