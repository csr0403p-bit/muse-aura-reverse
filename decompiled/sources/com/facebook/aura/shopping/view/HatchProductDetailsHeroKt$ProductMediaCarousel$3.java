package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C1Ny;
import X.G0U;
import X.G0V;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AHD<String> $imageUrls;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ C1Ny $notchInsets;
    public final /* synthetic */ G0U<Integer, Unit> $onImageClick;
    public final /* synthetic */ G0U<String, Unit> $onLoadFailed;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $overlay;
    public final /* synthetic */ String $productName;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ String $viewerSharedElementProductKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$3(AHD<String> ahd, String str, G0U<? super Integer, Unit> g0u, Function0<String> function0, C1DG c1dg, String str2, C1Ny c1Ny, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, G0U<? super String, Unit> g0u2, int i, int i2) {
        super(2);
        this.$imageUrls = ahd;
        this.$productName = str;
        this.$onImageClick = g0u;
        this.$sharedElementKey = function0;
        this.$morphSeedDecodeSize = c1dg;
        this.$viewerSharedElementProductKey = str2;
        this.$notchInsets = c1Ny;
        this.$overlay = g0w;
        this.$modifier = bRg;
        this.$onLoadFailed = g0u2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchProductDetailsHeroKt.m2022ProductMediaCarouselMJVLIH4(this.$imageUrls, this.$productName, this.$onImageClick, this.$sharedElementKey, this.$morphSeedDecodeSize, this.$viewerSharedElementProductKey, this.$notchInsets, this.$overlay, this.$modifier, this.$onLoadFailed, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
