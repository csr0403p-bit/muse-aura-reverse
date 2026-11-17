package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C1Ny;
import X.G0V;
import X.G0W;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$HatchProductDetailsHero$5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AHD<String> $imageUrls;
    public final /* synthetic */ boolean $isBrowserProduct;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ G0V<List<String>, Integer, Unit> $onSelectHeroImage;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $overlay;
    public final /* synthetic */ String $pageUrl;
    public final /* synthetic */ String $productKey;
    public final /* synthetic */ String $productName;
    public final /* synthetic */ String $seedImageUrl;
    public final /* synthetic */ boolean $shareImagesWithViewer;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ C1Ny $topInsets;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$HatchProductDetailsHero$5(String str, String str2, boolean z, AHD<String> ahd, String str3, String str4, G0V<? super List<String>, ? super Integer, Unit> g0v, Function0<String> function0, float f, C1Ny c1Ny, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, C1DG c1dg, boolean z2, int i, int i2, int i3) {
        super(2);
        this.$productKey = str;
        this.$pageUrl = str2;
        this.$isBrowserProduct = z;
        this.$imageUrls = ahd;
        this.$seedImageUrl = str3;
        this.$productName = str4;
        this.$onSelectHeroImage = g0v;
        this.$sharedElementKey = function0;
        this.$topPadding = f;
        this.$topInsets = c1Ny;
        this.$overlay = g0w;
        this.$modifier = bRg;
        this.$morphSeedDecodeSize = c1dg;
        this.$shareImagesWithViewer = z2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchProductDetailsHeroKt.m2021HatchProductDetailsHeroiAN7k5M(this.$productKey, this.$pageUrl, this.$isBrowserProduct, this.$imageUrls, this.$seedImageUrl, this.$productName, this.$onSelectHeroImage, this.$sharedElementKey, this.$topPadding, this.$topInsets, this.$overlay, this.$modifier, this.$morphSeedDecodeSize, this.$shareImagesWithViewer, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
