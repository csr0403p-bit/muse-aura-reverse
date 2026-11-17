package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass105;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C0981AMm;
import X.C0Ig;
import X.C10G;
import X.C1BO;
import X.C1DG;
import X.C1Ny;
import X.C1Y7;
import X.C1YY;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C8jn;
import X.C9m9;
import X.G0U;
import X.G0W;
import X.InterfaceC05343Un;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaCarousel$2 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ HatchProductDetailsHeroKt$ProductMediaCarousel$consumeHorizontalLeftover$1$1 $consumeHorizontalLeftover;
    public final /* synthetic */ C1BO<Integer> $currentPage$delegate;
    public final /* synthetic */ C0981AMm<String, Float> $decodedAspectRatios;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ String $morphSeedUrl;
    public final /* synthetic */ C1Ny $notchInsets;
    public final /* synthetic */ G0U<Integer, Unit> $onImageClick;
    public final /* synthetic */ G0U<String, Unit> $onLoadFailed;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $overlay;
    public final /* synthetic */ String $productName;
    public final /* synthetic */ Function0<String> $sharedElementKey;
    public final /* synthetic */ AHD<String> $shownImageUrls;
    public final /* synthetic */ String $viewerSharedElementProductKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$ProductMediaCarousel$2(LazyListState lazyListState, HatchProductDetailsHeroKt$ProductMediaCarousel$consumeHorizontalLeftover$1$1 hatchProductDetailsHeroKt$ProductMediaCarousel$consumeHorizontalLeftover$1$1, AHD<String> ahd, String str, G0U<? super Integer, Unit> g0u, Function0<String> function0, C1DG c1dg, String str2, C1BO<Integer> c1bo, C1Ny c1Ny, G0U<? super String, Unit> g0u2, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, C0981AMm<String, Float> c0981AMm, String str3) {
        super(3);
        this.$listState = lazyListState;
        this.$consumeHorizontalLeftover = hatchProductDetailsHeroKt$ProductMediaCarousel$consumeHorizontalLeftover$1$1;
        this.$shownImageUrls = ahd;
        this.$productName = str;
        this.$onImageClick = g0u;
        this.$sharedElementKey = function0;
        this.$morphSeedDecodeSize = c1dg;
        this.$viewerSharedElementProductKey = str2;
        this.$currentPage$delegate = c1bo;
        this.$notchInsets = c1Ny;
        this.$onLoadFailed = g0u2;
        this.$overlay = g0w;
        this.$decodedAspectRatios = c0981AMm;
        this.$morphSeedUrl = str3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            float fAHT = (c0Ig.AHT() * 0.7f) / HatchProductDetailsHeroKt.MediaAspectRatio;
            float fAHT2 = c0Ig.AHT();
            InterfaceC05343Un interfaceC05343UnA00 = C1Y7.A00(AnonymousClass105.A00, this.$listState, bfm, 48, 0);
            C9m9 c9m9A01 = AcQ.A01(C2VU.A00, AuraDimensKt.SpacingXsmall);
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = C8jn.A00(C10G.A02, this.$consumeHorizontalLeftover, null);
            LazyListState lazyListState = this.$listState;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onLoadFailed, AnonymousClass001.A1R(bfm, this.$notchInsets, AnonymousClass001.A1R(bfm, this.$currentPage$delegate, AnonymousClass001.A1R(bfm, this.$viewerSharedElementProductKey, AnonymousClass001.A1R(bfm, this.$morphSeedDecodeSize, AnonymousClass001.A1R(bfm, this.$sharedElementKey, AnonymousClass001.A1R(bfm, this.$onImageClick, AnonymousClass001.A1R(bfm, this.$productName, AnonymousClass003.A1I(bfm, this.$shownImageUrls, fAHT) | bfm.A62(fAHT2) | AnonymousClass001.A1L(iA0d)))))))));
            AHD<String> ahd = this.$shownImageUrls;
            C0981AMm<String, Float> c0981AMm = this.$decodedAspectRatios;
            String str = this.$productName;
            G0U<Integer, Unit> g0u = this.$onImageClick;
            Function0<String> function0 = this.$sharedElementKey;
            String str2 = this.$morphSeedUrl;
            C1DG c1dg = this.$morphSeedDecodeSize;
            String str3 = this.$viewerSharedElementProductKey;
            C1BO<Integer> c1bo = this.$currentPage$delegate;
            C1Ny c1Ny = this.$notchInsets;
            G0U<String, Unit> g0u2 = this.$onLoadFailed;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchProductDetailsHeroKt$ProductMediaCarousel$2$1$1(ahd, c0981AMm, c0Ig, str, fAHT, fAHT2, g0u, function0, str2, c1dg, str3, c1bo, c1Ny, g0u2);
                bfm.Ai0(objAaT);
            }
            C1YY.A00(null, interfaceC05343UnA00, c9m9A01, null, lazyListState, bfm, null, bRgA00, (G0U) objAaT, 0, 428, false, false);
            AnonymousClass001.A1G(C3U4.A09(c0Ig.A4C(C2VU.A08, bs0), AuraDimensKt.SpacingMedium), bfm, this.$overlay, 0);
            return;
        }
        bfm.Afo();
    }
}
