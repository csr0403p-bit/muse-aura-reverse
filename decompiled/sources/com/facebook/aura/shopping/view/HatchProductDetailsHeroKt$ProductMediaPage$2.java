package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C1Ny;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaPage$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $imageDecodeSize;
    public final /* synthetic */ Function0<Boolean> $isCurrentPage;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ String $morphSeedUrl;
    public final /* synthetic */ C1Ny $notchInsets;
    public final /* synthetic */ G0U<Integer, Unit> $onImageClick;
    public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
    public final /* synthetic */ G0U<String, Unit> $onLoadFailed;
    public final /* synthetic */ int $page;
    public final /* synthetic */ int $pageCount;
    public final /* synthetic */ float $pageHeight;
    public final /* synthetic */ String $productName;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ String $viewerSharedElementProductKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$ProductMediaPage$2(String str, int i, int i2, String str2, float f, float f2, G0U<? super Integer, Unit> g0u, Function0<String> function0, String str3, C1DG c1dg, String str4, Function0<Boolean> function02, C1Ny c1Ny, G0V<? super Integer, ? super Integer, Unit> g0v, G0U<? super String, Unit> g0u2, BRg bRg, int i3, int i4, int i5) {
        super(2);
        this.$uri = str;
        this.$page = i;
        this.$pageCount = i2;
        this.$productName = str2;
        this.$pageHeight = f;
        this.$imageDecodeSize = f2;
        this.$onImageClick = g0u;
        this.$sharedElementKey = function0;
        this.$morphSeedUrl = str3;
        this.$morphSeedDecodeSize = c1dg;
        this.$viewerSharedElementProductKey = str4;
        this.$isCurrentPage = function02;
        this.$notchInsets = c1Ny;
        this.$onImageSizeDecoded = g0v;
        this.$onLoadFailed = g0u2;
        this.$modifier = bRg;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchProductDetailsHeroKt.m2023ProductMediaPage5hmBmr4(this.$uri, this.$page, this.$pageCount, this.$productName, this.$pageHeight, this.$imageDecodeSize, this.$onImageClick, this.$sharedElementKey, this.$morphSeedUrl, this.$morphSeedDecodeSize, this.$viewerSharedElementProductKey, this.$isCurrentPage, this.$notchInsets, this.$onImageSizeDecoded, this.$onLoadFailed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
