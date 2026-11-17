package com.facebook.aura.shopping.view;

import X.AHD;
import X.AKQ;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C1515AkP;
import X.C1DP;
import X.C1YY;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchPdpProductRailKt {
    public static final float RailCardWidth = 166.0f;

    /* renamed from: com.facebook.aura.shopping.view.HatchPdpProductRailKt$HatchPdpProductRail$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchComponent $cardComponent;
        public final /* synthetic */ ShoppingFormat $format;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
        public final /* synthetic */ AHD<ShoppingResultProductUiModel> $products;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $titleFallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, HatchComponent hatchComponent, ShoppingFormat shoppingFormat, String str2, BRg bRg, String str3, int i, int i2) {
            super(2);
            this.$products = ahd;
            this.$onProductClick = g0u;
            this.$title = str;
            this.$cardComponent = hatchComponent;
            this.$format = shoppingFormat;
            this.$hostMessageId = str2;
            this.$modifier = bRg;
            this.$titleFallback = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPdpProductRailKt.HatchPdpProductRail(this.$products, this.$onProductClick, this.$title, this.$cardComponent, this.$format, this.$hostMessageId, this.$modifier, this.$titleFallback, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchPdpProductRailKt$HatchPdpProductRail$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchComponent $cardComponent;
        public final /* synthetic */ ShoppingFormat $format;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
        public final /* synthetic */ AHD<ShoppingResultProductUiModel> $products;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $titleFallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, HatchComponent hatchComponent, ShoppingFormat shoppingFormat, String str2, BRg bRg, String str3, int i, int i2) {
            super(2);
            this.$products = ahd;
            this.$onProductClick = g0u;
            this.$title = str;
            this.$cardComponent = hatchComponent;
            this.$format = shoppingFormat;
            this.$hostMessageId = str2;
            this.$modifier = bRg;
            this.$titleFallback = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPdpProductRailKt.HatchPdpProductRail(this.$products, this.$onProductClick, this.$title, this.$cardComponent, this.$format, this.$hostMessageId, this.$modifier, this.$titleFallback, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchPdpProductRail(AHD<ShoppingResultProductUiModel> ahd, G0U<? super ShoppingResultProduct, Unit> g0u, String str, HatchComponent hatchComponent, ShoppingFormat shoppingFormat, String str2, BRg bRg, String str3, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass3;
        String str4 = str3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(ahd, 0);
        AnonymousClass005.A11(g0u, str, hatchComponent, 1);
        C7384Etj.A0Y(shoppingFormat, 4);
        bfm.AgG(-112732872);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, hatchComponent.ordinal());
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, shoppingFormat.ordinal());
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str2);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        int i4 = i2 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, str4);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str4 = null;
            }
            if (ahd.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass3 = new AnonymousClass1(ahd, g0u, str, hatchComponent, shoppingFormat, str2, bRg2, str4, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass3);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingSmall;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA02);
            BS0 bs0 = BRg.A00;
            float f2 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bs0, f2, 0.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchPdpProductRailKt$HatchPdpProductRail$2$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0Y, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d >> 6), 6, 14832);
            C9m9 c9m9A00 = AcQ.A00(f);
            C1DP c1dp = new C1DP(f2, 0.0f, f2, 0.0f);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | AnonymousClass003.A1B(iA0d) | AnonymousClass005.A1J(iA0d) | AnonymousClass004.A1M(iA0d) | AnonymousClass007.A1H(iA0d) | AnonymousClass005.A1L(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new HatchPdpProductRailKt$HatchPdpProductRail$2$2$1(ahd, g0u, str4, hatchComponent, str2, shoppingFormat);
                bfm.Ai0(objAaT2);
            }
            C1YY.A00(null, null, c9m9A00, c1dp, null, bfm, null, null, (G0U) objAaT2, 0, 491, false, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass3 = new AnonymousClass3(ahd, g0u, str, hatchComponent, shoppingFormat, str2, bRg2, str4, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass3);
        }
    }
}
