package com.facebook.aura.shopping.view;

import X.AHD;
import X.AKH;
import X.AKQ;
import X.AZ3;
import X.AbstractC0878AGe;
import X.AbstractC2139Az7;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BNH;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0981AMm;
import X.C10G;
import X.C1160Acs;
import X.C1161Act;
import X.C11U;
import X.C1251Afj;
import X.C1515AkP;
import X.C15V;
import X.C16C;
import X.C1749Apm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1Ny;
import X.C1OQ;
import X.C1b8;
import X.C2VU;
import X.C3IL;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchProductDetailsHeroKt {
    public static final float MediaAspectRatio = 0.7987421f;
    public static final float MediaPageWidthFraction = 0.7f;
    public static final float TopEdgeBandOverscan = 1.0629921f;
    public static final float TopEdgeSampleHeight = 2.0f;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductHeroFallback$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$productName = str;
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
            HatchProductDetailsHeroKt.ProductHeroFallback(this.$productName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductHeroGalleryLoading$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1Ny $topInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C1Ny c1Ny, BRg bRg, int i, int i2) {
            super(2);
            this.$topInsets = c1Ny;
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
            HatchProductDetailsHeroKt.ProductHeroGalleryLoading(this.$topInsets, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductHeroSkeleton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, int i, int i2) {
            super(2);
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
            HatchProductDetailsHeroKt.ProductHeroSkeleton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ProductHeroGalleryLoading(C1Ny c1Ny, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(c1Ny, 0);
        bfm.AgG(-215659222);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1Ny) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            ProductHeroSkeleton(BNH.A00(new C1OQ(c1Ny, 16), C3U4.A03(AnonymousClass001.A0R(bRg), 16.0f)), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(c1Ny, bRg, i, i2);
        }
    }

    /* renamed from: ProductPhotoTopEdgeBand-o3XDK20, reason: not valid java name */
    public static final void m2025ProductPhotoTopEdgeBando3XDK20(String str, float f, float f2, C1Ny c1Ny, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1900216240);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1Ny);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C3IL.A00(bfm, null, C11U.A00(bRg2.then(new C1749Apm(c1Ny, C15V.A00, AbstractC2139Az7.A00))), B1V.A00(bfm, new HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$1(f, str, f2), -1175197562), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchProductDetailsHeroKt$ProductPhotoTopEdgeBand$2(str, f, f2, c1Ny, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* renamed from: HatchProductDetailsHero-iAN7k5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2021HatchProductDetailsHeroiAN7k5M(java.lang.String r41, java.lang.String r42, boolean r43, X.AHD<java.lang.String> r44, java.lang.String r45, java.lang.String r46, X.G0V<? super java.util.List<java.lang.String>, ? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function0<java.lang.String> r48, float r49, X.C1Ny r50, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r51, X.BRg r52, X.C1DG r53, boolean r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt.m2021HatchProductDetailsHeroiAN7k5M(java.lang.String, java.lang.String, boolean, X.AHD, java.lang.String, java.lang.String, X.G0V, kotlin.jvm.functions.Function0, float, X.1Ny, X.G0W, X.BRg, X.1DG, boolean, X.BFM, int, int, int):void");
    }

    /* renamed from: ProductMediaCarousel-MJVLIH4, reason: not valid java name */
    public static final void m2022ProductMediaCarouselMJVLIH4(AHD<String> ahd, String str, G0U<? super Integer, Unit> g0u, Function0<String> function0, C1DG c1dg, String str2, C1Ny c1Ny, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, G0U<? super String, Unit> g0u2, BFM bfm, int i, int i2) {
        boolean zIsHatchSharedTransitionActive;
        G0U<? super String, Unit> g0u3 = g0u2;
        BRg bRg2 = bRg;
        bfm.AgG(-214726618);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, c1dg);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1Ny);
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0w);
        }
        int i3 = i2 & 256;
        int iA0l = 100663296;
        if (i3 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, bRg2);
            iA0d |= iA0l;
        }
        int i4 = i2 & 512;
        int iA0c = 805306368;
        if (i4 != 0) {
            iA0d |= iA0c;
        } else if ((i & 805306368) == 0) {
            iA0c = AnonymousClass004.A0c(bfm, g0u3);
            iA0d |= iA0c;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 306783379, 306783378), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u3 = null;
            }
            LazyListState lazyListStateA00 = AZ3.A00(0, 0, bfm, 0, 3);
            boolean zA65 = bfm.A65(lazyListStateA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new HatchProductDetailsHeroKt$ProductMediaCarousel$currentPage$2$1(lazyListStateA00));
            }
            C1BO c1bo = (C1BO) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = new C0981AMm();
                bfm.Ai0(objAaT2);
            }
            C0981AMm c0981AMm = (C0981AMm) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = (String) AbstractC0878AGe.A0G(ahd);
                bfm.Ai0(objAaT3);
            }
            String str3 = (String) objAaT3;
            if (c1dg != null) {
                bfm.AgE(-193826715);
                zIsHatchSharedTransitionActive = HatchSharedElementKt.isHatchSharedTransitionActive(bfm, 0);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -1713659632);
                zIsHatchSharedTransitionActive = false;
            }
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass004.A12(bfm, ahd);
            }
            MutableState mutableState = (MutableState) objAaT4;
            Boolean boolValueOf = Boolean.valueOf(zIsHatchSharedTransitionActive);
            boolean zA66 = bfm.A66(zIsHatchSharedTransitionActive) | AnonymousClass004.A1F(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA66 || objAaT5 == obj) {
                objAaT5 = new HatchProductDetailsHeroKt$ProductMediaCarousel$1$1(zIsHatchSharedTransitionActive, ahd, mutableState, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A1A(bfm, objAaT5, ahd, boolValueOf);
            AHD<String> ahd2 = zIsHatchSharedTransitionActive ? (AHD) mutableState.getValue() : ahd;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = new Akx() { // from class: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaCarousel$consumeHorizontalLeftover$1$1
                    @Override // X.Akx
                    /* renamed from: onPostFling-RZ2iAVY */
                    public Object mo3onPostFlingRZ2iAVY(long j, long j2, HtJ<? super C1251Afj> htJ) {
                        return new C1251Afj(AnonymousClass007.A0A(AnonymousClass003.A03(j2), 0.0f));
                    }

                    @Override // X.Akx
                    /* renamed from: onPostScroll-DzOQY0M */
                    public long mo4onPostScrollDzOQY0M(long j, long j2, int i5) {
                        return AnonymousClass007.A0A(AnonymousClass003.A03(j2), 0.0f);
                    }

                    @Override // X.Akx
                    /* renamed from: onPreFling-QWom1Mo */
                    public /* bridge */ Object mo5onPreFlingQWom1Mo(long j, HtJ<? super C1251Afj> htJ) {
                        return AnonymousClass006.A0a();
                    }

                    @Override // X.Akx
                    /* renamed from: onPreScroll-OzD1aCk */
                    public /* bridge */ long mo6onPreScrollOzD1aCk(long j, int i5) {
                        return 0L;
                    }
                };
                bfm.Ai0(objAaT6);
            }
            C3IL.A00(bfm, null, AnonymousClass001.A0R(bRg2), B1V.A00(bfm, new HatchProductDetailsHeroKt$ProductMediaCarousel$2(lazyListStateA00, (HatchProductDetailsHeroKt$ProductMediaCarousel$consumeHorizontalLeftover$1$1) objAaT6, ahd2, str, g0u, function0, c1dg, str2, c1bo, c1Ny, g0u3, g0w, c0981AMm, str3), 396061200), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchProductDetailsHeroKt$ProductMediaCarousel$3(ahd, str, g0u, function0, c1dg, str2, c1Ny, g0w, bRg2, g0u3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0156  */
    /* renamed from: ProductMediaPage-5hmBmr4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2023ProductMediaPage5hmBmr4(java.lang.String r32, int r33, int r34, java.lang.String r35, float r36, float r37, X.G0U<? super java.lang.Integer, kotlin.Unit> r38, kotlin.jvm.functions.Function0<java.lang.String> r39, java.lang.String r40, X.C1DG r41, java.lang.String r42, kotlin.jvm.functions.Function0<java.lang.Boolean> r43, X.C1Ny r44, X.G0V<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r45, X.G0U<? super java.lang.String, kotlin.Unit> r46, X.BRg r47, X.BFM r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt.m2023ProductMediaPage5hmBmr4(java.lang.String, int, int, java.lang.String, float, float, X.G0U, kotlin.jvm.functions.Function0, java.lang.String, X.1DG, java.lang.String, kotlin.jvm.functions.Function0, X.1Ny, X.G0V, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }

    /* renamed from: ProductMorphSeedImage-uFdPcIQ, reason: not valid java name */
    public static final void m2024ProductMorphSeedImageuFdPcIQ(String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(284031299);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str, bRg2, B18.A02, null, null, false, new C1DG(f), 0L, false, false, false, null, null, null, null, bfm, AnonymousClass006.A04((iA0d & 14) | 805306752, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, iA0d), 48, 30136);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchProductDetailsHeroKt$ProductMorphSeedImage$1(str, f, bRg2, i, i2);
        }
    }

    public static final void ProductHeroFallback(String str, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-255834851);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(8.0f);
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0C, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            AuraIconSize auraIconSize = AuraIconSize.LARGE;
            BRg bRgA03 = C11U.A03(BJe.A00(C10G.A03(BRg.A00, 0.7f), MediaAspectRatio, false), c1d3A00);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA02 = C1DI.A02(C1b8.A01(bRgA03, AnonymousClass001.A0f(bfm, akh).elevated), c1d3A00, 0.5f, C06G.A0E(bfm, akh));
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new HatchProductDetailsHeroKt$ProductHeroFallback$1$1$1(str);
                bfm.Ai0(objAaT);
            }
            HatchShoppingResultsCardKt.ProductImageFallback(auraIconSize, AnonymousClass001.A0Y(bRgA02, objAaT, false), bfm, 6, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg, i, i2);
        }
    }

    public static final void ProductHeroSkeleton(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1520268403);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc5);
            C1D3 c1d3A00 = C1D8.A00(8.0f);
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchProductDetailsHeroKt$ProductHeroSkeleton$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0R, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0C, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            HatchShoppingProductImageKt.HatchProductImagePlaceholder(C1DI.A02(BJe.A00(C10G.A03(BRg.A00, 0.7f), MediaAspectRatio, false), c1d3A00, 0.5f, AnonymousClass002.A0c(bfm).border), bfm, 0, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg, i, i2);
        }
    }

    public static final int mostVisibleItemIndex(LazyListState lazyListState) {
        Object next;
        int i = ((C1161Act) lazyListState.A04()).A07;
        int i2 = ((C1161Act) lazyListState.A04()).A06;
        Iterator it = AnonymousClass003.A0j(lazyListState).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                C1160Acs c1160Acs = (C1160Acs) ((C16C) next);
                int i3 = c1160Acs.A02;
                int iMin = Math.min(c1160Acs.A09 + i3, i2) - Math.max(i3, i);
                do {
                    Object next2 = it.next();
                    C1160Acs c1160Acs2 = (C1160Acs) ((C16C) next2);
                    int i4 = c1160Acs2.A02;
                    int iMin2 = Math.min(c1160Acs2.A09 + i4, i2) - Math.max(i4, i);
                    if (iMin < iMin2) {
                        next = next2;
                        iMin = iMin2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C16C c16c = (C16C) next;
        if (c16c != null) {
            return ((C1160Acs) c16c).A07;
        }
        return 0;
    }
}
