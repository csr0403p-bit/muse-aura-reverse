package com.facebook.aura.shopping.view;

import X.AHD;
import X.AKQ;
import X.ATD;
import X.AZ1;
import X.AbstractC05081Yo;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0861A6i;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C9kj;
import X.F60;
import X.FGI;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.components.pagerindicator.AuraPagerIndicatorKt;
import com.facebook.aura.header.view.HatchBackClickAnalytics;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.ScrimConfig;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerViewModel;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ShoppingProductDetailsPagerKt {
    public static final float PageDotsHeight = 48.0f;

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt$ProductDetailsPageDots$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ int $pageCount;
        public final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, PagerState pagerState) {
            super(3);
            this.$pageCount = i;
            this.$pagerState = pagerState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                AuraPagerIndicatorKt.AuraPagerIndicator(this.$pageCount, this.$pagerState, C3U4.A0B(BRg.A00, AuraDimensKt.SpacingLargePlusMicro, AuraDimensKt.SpacingLarge), 8, bfm, 3072, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt$ProductDetailsPageDots$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $pageCount;
        public final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, PagerState pagerState, BRg bRg, int i2, int i3) {
            super(2);
            this.$pageCount = i;
            this.$pagerState = pagerState;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsPagerKt.ProductDetailsPageDots(this.$pageCount, this.$pagerState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$2, reason: invalid class name and case insensitive filesystem */
    public final class C137672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingProductDetailsPageKey $entryKey;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137672(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, BRg bRg, int i, int i2) {
            super(2);
            this.$entryKey = shoppingProductDetailsPageKey;
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
            ShoppingProductDetailsPagerKt.ShoppingProductDetailsPager(this.$entryKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ AHD<ShoppingProductDetailsPagerItem> $pages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(PagerState pagerState, AHD<ShoppingProductDetailsPagerItem> ahd) {
            super(2);
            this.$pagerState = pagerState;
            this.$pages = ahd;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            int iA06 = ATD.A06(AbstractC0885AGm.A12(this.$pages), this.$pagerState.A07());
            ShoppingProductDetailsPageKt.ShoppingProductDetailsHeaderActions(((ShoppingProductDetailsPagerItem) this.$pages.get(iA06)).key, ((ShoppingProductDetailsPagerItem) this.$pages.get(iA06)).seededProduct, FGI.A0H("product_details_page_", iA06), null, bfm, ShoppingResultProduct.$stable << 3, 8);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ AHD<ShoppingProductDetailsPagerItem> $pages;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AHD<ShoppingProductDetailsPagerItem> ahd, PagerState pagerState) {
            super(4);
            this.$pages = ahd;
            this.$pagerState = pagerState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m2075invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m2075invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            boolean z;
            float f3;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$pages.size() > 1) {
                z = true;
                f3 = ShoppingProductDetailsPagerKt.PageDotsHeight + f2 + (AuraDimensKt.SpacingMedium * 2.0f);
            } else {
                z = false;
                f3 = f2;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            PagerState pagerState = this.$pagerState;
            AHD<ShoppingProductDetailsPagerItem> ahd = this.$pages;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            AbstractC05081Yo.A00(null, null, null, null, null, pagerState, bfm, null, c1062ATq, null, null, B1V.A00(bfm, new ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$5$1$1(ahd, f, f3, pagerState), -847150367), 0.0f, 0, 48, RuntimeInternals.IOPRIO_BACKGROUND, 16380, false, false);
            if (z) {
                bfm.AgE(-646199952);
                ShoppingProductDetailsPagerKt.ProductDetailsPageDots(ahd.size(), pagerState, C3U4.A0C(c0z7.A4C(C2VU.A06, bs0), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium + f2), bfm, 0, 0);
            } else {
                bfm.AgE(-645938560);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingProductDetailsPageKey $entryKey;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, BRg bRg, int i, int i2) {
            super(2);
            this.$entryKey = shoppingProductDetailsPageKey;
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
            ShoppingProductDetailsPagerKt.ShoppingProductDetailsPager(this.$entryKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ProductDetailsPageDots(int i, PagerState pagerState, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-2051527809);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, pagerState);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(bRg2, PageDotsHeight / 2.0f, null, B1V.A00(bfm, new AnonymousClass1(i, pagerState), -1080098303), bfm, ((iA0D >> 6) & 14) | 3120, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, pagerState, bRg2, i2, i3);
        }
    }

    public static final void ShoppingProductDetailsPager(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        BRg bRgRenderAboveHatchSharedElements;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(shoppingProductDetailsPageKey, 0);
        bfm.AgG(-987134483);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, shoppingProductDetailsPageKey) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            ShoppingProductDetailsPagerViewModel.Factory factory = new ShoppingProductDetailsPagerViewModel.Factory(shoppingProductDetailsPageKey, abstractC3358CGzA0h);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            ShoppingProductDetailsPagerViewModel shoppingProductDetailsPagerViewModel = (ShoppingProductDetailsPagerViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, new C0861A6i(ShoppingProductDetailsPagerViewModel.class));
            if (!shoppingProductDetailsPagerViewModel.getHasSeededProducts()) {
                bfm.AgE(-81907656);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, unit);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass6 = new C137672(shoppingProductDetailsPageKey, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -81818283);
            AHD<ShoppingProductDetailsPagerItem> ahd = shoppingProductDetailsPagerViewModel.pages;
            int i4 = shoppingProductDetailsPagerViewModel.initialPage;
            boolean zA65 = bfm.A65(ahd);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$pagerState$1$1(ahd);
                bfm.Ai0(objAaT2);
            }
            C9kj c9kjA01 = AZ1.A01(bfm, (Function0) objAaT2, i4, 0, 2);
            HatchBackClickAnalytics hatchBackClickAnalytics = new HatchBackClickAnalytics(HatchSurface.SHOPPING, HatchScreen.PRODUCT_DETAIL);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new ShoppingProductDetailsPagerKt$ShoppingProductDetailsPager$3$1(auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            Function0 function0 = (Function0) objAaT3;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206ed);
            if (shoppingProductDetailsPageKey.sharedElementKey != null) {
                bfm.AgE(-81265770);
                bRgRenderAboveHatchSharedElements = HatchSharedElementKt.renderAboveHatchSharedElements(BRg.A00, 350, bfm, 54);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-81167469);
                BBI.A0R(bbiA0M, false);
                bRgRenderAboveHatchSharedElements = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRgA0T, null, 0L, null, null, function0, null, false, false, R.drawable.x_wght400_outline_24, strA01, null, null, null, null, B1V.A00(bfm, new AnonymousClass4(c9kjA01, ahd), 1745963840), 0L, 0L, null, 0.0f, new ScrimConfig.ScrollAware(C06G.A0B(bfm), ScrimConfig.ScrollAware.Variant.HEAVY, 240.0f), bRgRenderAboveHatchSharedElements, null, 0, null, null, hatchBackClickAnalytics, false, B1V.A00(bfm, new AnonymousClass5(ahd, c9kjA01), 1275176392), bfm, 6, 1572864, (HatchBackClickAnalytics.$stable << 21) | 805306374, 395244476);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(shoppingProductDetailsPageKey, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final String productDetailsPageViewModelKey(int i) {
        return FGI.A0H("product_details_page_", i);
    }
}
