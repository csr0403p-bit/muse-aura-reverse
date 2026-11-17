package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass037;
import X.BFM;
import X.C0981AMm;
import X.C0CD;
import X.C0Ig;
import X.C1BO;
import X.C1DG;
import X.C1Ny;
import X.C7384Etj;
import X.G0U;
import X.G2j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ C1BO<Integer> $currentPage$delegate;
    public final /* synthetic */ C0981AMm<String, Float> $decodedAspectRatios;
    public final /* synthetic */ float $maxPageWidth;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ String $morphSeedUrl;
    public final /* synthetic */ C1Ny $notchInsets;
    public final /* synthetic */ G0U<Integer, Unit> $onImageClick;
    public final /* synthetic */ G0U<String, Unit> $onLoadFailed;
    public final /* synthetic */ float $pageHeight;
    public final /* synthetic */ String $productName;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ AHD<String> $shownImageUrls;
    public final /* synthetic */ C0Ig $this_BoxWithConstraints;
    public final /* synthetic */ String $viewerSharedElementProductKey;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<String> ahd = this.$shownImageUrls;
        final C0981AMm<String, Float> c0981AMm = this.$decodedAspectRatios;
        final C0Ig c0Ig = this.$this_BoxWithConstraints;
        final String str = this.$productName;
        final float f = this.$pageHeight;
        final float f2 = this.$maxPageWidth;
        final G0U<Integer, Unit> g0u = this.$onImageClick;
        final Function0<String> function0 = this.$sharedElementKey;
        final String str2 = this.$morphSeedUrl;
        final C1DG c1dg = this.$morphSeedDecodeSize;
        final String str3 = this.$viewerSharedElementProductKey;
        final C1BO<Integer> c1bo = this.$currentPage$delegate;
        final C1Ny c1Ny = this.$notchInsets;
        final G0U<String, Unit> g0u2 = this.$onLoadFailed;
        c0cd.APL(null, new G0U<Integer, Object>() { // from class: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$invoke$$inlined$itemsIndexed$default$2
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                ahd.get(AnonymousClass001.A0F(num));
                return null;
            }

            public final Object invoke(int i) {
                ahd.get(i);
                return null;
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$invoke$$inlined$itemsIndexed$default$3
            /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void invoke(X.AnonymousClass037 r31, int r32, X.BFM r33, int r34) {
                /*
                    Method dump skipped, instructions count: 290
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1$invoke$$inlined$itemsIndexed$default$3.invoke(X.037, int, X.BFM, int):void");
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 2039820996), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1(AHD<String> ahd, C0981AMm<String, Float> c0981AMm, C0Ig c0Ig, String str, float f, float f2, G0U<? super Integer, Unit> g0u, Function0<String> function0, String str2, C1DG c1dg, String str3, C1BO<Integer> c1bo, C1Ny c1Ny, G0U<? super String, Unit> g0u2) {
        super(1);
        this.$shownImageUrls = ahd;
        this.$decodedAspectRatios = c0981AMm;
        this.$this_BoxWithConstraints = c0Ig;
        this.$productName = str;
        this.$pageHeight = f;
        this.$maxPageWidth = f2;
        this.$onImageClick = g0u;
        this.$sharedElementKey = function0;
        this.$morphSeedUrl = str2;
        this.$morphSeedDecodeSize = c1dg;
        this.$viewerSharedElementProductKey = str3;
        this.$currentPage$delegate = c1bo;
        this.$notchInsets = c1Ny;
        this.$onLoadFailed = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
