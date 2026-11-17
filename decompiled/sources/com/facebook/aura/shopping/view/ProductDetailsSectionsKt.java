package com.facebook.aura.shopping.view;

import X.AGI;
import X.AKO;
import X.AKQ;
import X.ARK;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC1979Avk;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C0A3;
import X.C1515AkP;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.F60;
import X.FGI;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.PdpEyebrowState;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.ShoppingEyebrowTextKt;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ProductDetailsSectionsKt {
    public static final float PdpSectionSpacing = 24.0f;

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$AddToCartDismissEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onHandled;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ boolean $succeeded;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, String str, Function0<Unit> function0, int i) {
            super(2);
            this.$succeeded = z;
            this.$sessionId = str;
            this.$onHandled = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.AddToCartDismissEffect(this.$succeeded, this.$sessionId, this.$onHandled, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$MarketplaceEyebrow$2, reason: invalid class name and case insensitive filesystem */
    public final class C137432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137432(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.MarketplaceEyebrow(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$PdpLinkButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C137442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $emphasized;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137442(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$emphasized = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.PdpLinkButton(this.$text, this.$emphasized, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductCtaError$2, reason: invalid class name and case insensitive filesystem */
    public final class C137452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137452(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductCtaError(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductCtaWithWebsiteArrow$2, reason: invalid class name and case insensitive filesystem */
    public final class C137462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenWebsite;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $primary;
        public final /* synthetic */ String $websiteLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137462(String str, Function0<Unit> function0, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$websiteLabel = str;
            this.$onOpenWebsite = function0;
            this.$modifier = bRg;
            this.$primary = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductCtaWithWebsiteArrow(this.$websiteLabel, this.$onOpenWebsite, this.$modifier, this.$primary, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductEyebrow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PdpEyebrowState $eyebrow;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ShoppingProductType $productType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PdpEyebrowState pdpEyebrowState, ShoppingProductType shoppingProductType, BRg bRg, int i, int i2) {
            super(2);
            this.$eyebrow = pdpEyebrowState;
            this.$productType = shoppingProductType;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductEyebrow(this.$eyebrow, this.$productType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductEyebrow$2, reason: invalid class name and case insensitive filesystem */
    public final class C137472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PdpEyebrowState $eyebrow;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ShoppingProductType $productType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137472(PdpEyebrowState pdpEyebrowState, ShoppingProductType shoppingProductType, BRg bRg, int i, int i2) {
            super(2);
            this.$eyebrow = pdpEyebrowState;
            this.$productType = shoppingProductType;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductEyebrow(this.$eyebrow, this.$productType, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductName$2, reason: invalid class name and case insensitive filesystem */
    public final class C137482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137482(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$name = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductName(this.$name, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductPriceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C137492 extends AbstractC7559F3s implements G0W<C0A3, BFM, Integer, Unit> {
        public final /* synthetic */ String $couponLabel;
        public final /* synthetic */ PdpPrice $currentPrice;
        public final /* synthetic */ PdpPrice $originalPrice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137492(PdpPrice pdpPrice, PdpPrice pdpPrice2, String str) {
            super(3);
            this.$currentPrice = pdpPrice;
            this.$originalPrice = pdpPrice2;
            this.$couponLabel = str;
        }

        public final void invoke(C0A3 c0a3, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            PdpPrice pdpPrice = this.$currentPrice;
            PdpPrice pdpPrice2 = this.$originalPrice;
            String str = this.$couponLabel;
            int i2 = PdpPrice.$stable;
            ProductDetailsSectionsKt.ProductPriceValues(pdpPrice, pdpPrice2, null, str, bfm, i2 | 384 | (i2 << 3));
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0A3 c0a3, BFM bfm, Integer num) {
            invoke(c0a3, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductPriceRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $couponLabel;
        public final /* synthetic */ PdpPrice $currentPrice;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PdpPrice $originalPrice;
        public final /* synthetic */ Integer $percentOff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$currentPrice = pdpPrice;
            this.$originalPrice = pdpPrice2;
            this.$percentOff = num;
            this.$couponLabel = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductPriceRow(this.$currentPrice, this.$originalPrice, this.$percentOff, this.$couponLabel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$ProductPriceValues$3, reason: invalid class name and case insensitive filesystem */
    public final class C137503 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $couponLabel;
        public final /* synthetic */ PdpPrice $currentPrice;
        public final /* synthetic */ PdpPrice $originalPrice;
        public final /* synthetic */ Integer $percentOff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137503(PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, String str, int i) {
            super(2);
            this.$currentPrice = pdpPrice;
            this.$originalPrice = pdpPrice2;
            this.$percentOff = num;
            this.$couponLabel = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ProductDetailsSectionsKt.ProductPriceValues(this.$currentPrice, this.$originalPrice, this.$percentOff, this.$couponLabel, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AddToCartDismissEffect(boolean z, String str, Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(125005912);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA05, AnonymousClass002.A1V(bfm, abstractC3358CGzA06, AnonymousClass003.A1B(iA0n), AnonymousClass003.A1D(iA0n)), AnonymousClass001.A1O(iA0n));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new ProductDetailsSectionsKt$AddToCartDismissEffect$1$1(z, function0, abstractC3358CGzA06, str, auraNavigatorA05);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, str, function0, i);
        }
    }

    public static final void logPdpLinkClick(String str, String str2, String str3, BO6<String, String> bo6) {
        AnonymousClass003.A0w(str, bo6);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, str.equals(str2) ? HatchComponent.SECONDARY_ACTION_BUTTON : HatchComponent.VISIT_WEBSITE_BUTTON, str3, bo6, null);
    }

    public static final String productImageSharedElementKey(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0V("pdp_image_", str, "_", i);
    }

    public static final void MarketplaceEyebrow(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(642470991);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingMicro);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.facebook_outline_24_wght400, 0);
            AuraIconSize auraIconSize = AuraIconSize.TINY;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, C3cH.A07(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc3), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137432(bRg2, i, i2);
        }
    }

    public static final void PdpLinkButton(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, function0);
        bfm.AgG(-376802632);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(1717456338);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, AnonymousClass001.A0R(bRg2), pdpPrimaryCtaStyle(bfm, 0), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608, (iA0d << 6) & 57344, 0, 134201285);
            } else {
                bfm.AgE(1717656722);
                BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStyleTertiary = AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ProductDetailsSectionsKt$PdpLinkButton$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, bRgA0R, auraLabelButtonStyleTertiary, auraButtonSize, null, false, false, false, false, false, null, null, function0, null, null, null, (Function0) objAaT, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196608, ((iA0d << 6) & 57344) | 100663296, 0, 133939141);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137442(str, z, function0, bRg2, i, i2);
        }
    }

    public static final void ProductCtaError(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(1799117919);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA04 = C3U4.A04(bRg2, AuraDimensKt.SpacingSmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ProductDetailsSectionsKt$ProductCtaError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0Y, auraTheme.getColors(bfm, 6).errorText, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137452(str, bRg2, i, i2);
        }
    }

    public static final void ProductCtaWithWebsiteArrow(String str, Function0<Unit> function0, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        String strA0s;
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(g0w, 3);
        bfm.AgG(-37208099);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AnonymousClass001.A1G(ARK.A01(BRg.A00, 1.0f, true), bfm, g0w, (iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            if (function0 == null) {
                bfm.AgE(1212976043);
            } else {
                bfm.AgE(1212976044);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.arrowexport_outline_24_wght600, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.FLAT;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
                if (str == null) {
                    bfm.AgE(471661782);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120dee);
                } else {
                    bfm.AgE(471661286);
                    BBI.A0R(bbi, false);
                    strA0s = str;
                }
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA0s, function0, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 16161);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137462(str, function0, bRgA0Q, g0w, i, i2);
        }
    }

    public static final void ProductEyebrow(PdpEyebrowState pdpEyebrowState, ShoppingProductType shoppingProductType, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c137472;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(pdpEyebrowState, shoppingProductType);
        bfm.AgG(925326246);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, pdpEyebrowState) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, shoppingProductType);
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
            if (shoppingProductType == ShoppingProductType.MARKETPLACE) {
                bfm.AgE(1294270272);
                MarketplaceEyebrow(bRg2, bfm, (iA0d >> 6) & 14, zA1b ? 1 : 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc == null) {
                    return;
                } else {
                    c137472 = new AnonymousClass1(pdpEyebrowState, shoppingProductType, bRg2, i, i2);
                }
            } else {
                AnonymousClass003.A0l(bfm, 1294327932);
                String strShoppingSubtitleText = ShoppingEyebrowTextKt.shoppingSubtitleText(pdpEyebrowState.parts, bfm, zA1b ? 1 : 0);
                if (strShoppingSubtitleText == null) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        c137472 = new ProductDetailsSectionsKt$ProductEyebrow$text$1(pdpEyebrowState, shoppingProductType, bRg2, i, i2);
                    }
                } else {
                    ShoppingMerchantLogoKt.m2069ShoppingMerchantLabeltOXsyB8(strShoppingSubtitleText, C3cH.A0B(bfm, AuraTheme.INSTANCE), pdpEyebrowState.showsLogo, pdpEyebrowState.logoUrl, 16.0f, AuraDimensKt.SpacingMicroPlusNano, AuraIconSize.X_TINY, bRg2, bfm, ((iA0d << 15) & 29360128) | 1597440, zA1b ? 1 : 0);
                }
            }
            C3cG.A1D(bBbAAc, c137472);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c137472 = new C137472(pdpEyebrowState, shoppingProductType, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c137472);
        }
    }

    public static final void ProductName(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(273802386);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ProductDetailsSectionsKt$ProductName$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0Y, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title2Medium, null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137482(str, bRg2, i, i2);
        }
    }

    public static final void ProductPriceRow(PdpPrice pdpPrice, PdpPrice pdpPrice2, Integer num, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(pdpPrice, 0);
        bfm.AgG(548747803);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pdpPrice, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(pdpPrice2, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, num);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null) {
                bfm.AgE(1100477927);
                InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, C2VU.A04);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
                int i4 = PdpPrice.$stable;
                ProductPriceValues(pdpPrice, pdpPrice2, num, null, bfm, AnonymousClass002.A07(iA05, i4 | 3072 | (iA05 & 14) | (i4 << 3)));
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(1100811704);
                AbstractC1979Avk.A02(AcQ.A00(AuraDimensKt.SpacingXsmall), AcQ.A00(AuraDimensKt.SpacingMicro), bfm, null, bRg2, B1V.A00(bfm, new C137492(pdpPrice, pdpPrice2, str), -113550172), 0, 0, ((iA05 >> 12) & 14) | 1572864, 56);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(pdpPrice, pdpPrice2, num, str, bRg2, i, i2);
        }
    }

    public static final float getPdpSectionSpacing() {
        return PdpSectionSpacing;
    }

    public static final void openProductImages(AuraNavigator auraNavigator, List<String> list, int i, String str, ContentViewerBottomActions contentViewerBottomActions, String str2) {
        boolean zA1b = AnonymousClass004.A1b(auraNavigator, list);
        C7384Etj.A0Y(str, 3);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        int i2 = 0;
        for (String str3 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0i.add(new ContentItem(str, ContentType.Image.INSTANCE, null, str3, null, str2 != null ? productImageSharedElementKey(str2, i2) : null, null, null, null, zA1b, null, null, null, null, null));
            i2 = i3;
        }
        ContentViewerDataHolderKt.navigateToContentViewer(auraNavigator, AGI.A07(arrayListA0i), i, zA1b, zA1b, contentViewerBottomActions, zA1b);
    }

    public static /* synthetic */ void openProductImages$default(AuraNavigator auraNavigator, List list, int i, String str, ContentViewerBottomActions contentViewerBottomActions, String str2, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            contentViewerBottomActions = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        openProductImages(auraNavigator, list, i, str, contentViewerBottomActions, str2);
    }

    public static final AuraLabelButtonStyle pdpPrimaryCtaStyle(BFM bfm, int i) {
        long j;
        long j2;
        BBI bbi = (BBI) bfm;
        AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
        boolean zA65 = bfm.A65(abstractC3358CGzA06);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA06);
            bfm.Ai0(objAaT);
        }
        C1BO c1boA02 = C2CK.A02(bfm, ((HatchIdentityProvider) objAaT).conversationTheme);
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        boolean z = !auraTheme.getColors(bfm, 6).isLight;
        AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
        B6A b6aM1136primaryActionBackgroundColorijrfgN4 = ((HatchConversationTheme) c1boA02.getValue()).m1136primaryActionBackgroundColorijrfgN4(z);
        if (b6aM1136primaryActionBackgroundColorijrfgN4 == null) {
            bfm.AgE(458492715);
            j = auraTheme.getColors(bfm, 6).accent;
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(458490390);
            BBI.A0R(bbi, false);
            j = b6aM1136primaryActionBackgroundColorijrfgN4.A00;
        }
        B6A b6aM1137primaryActionForegroundColorijrfgN4 = ((HatchConversationTheme) c1boA02.getValue()).m1137primaryActionForegroundColorijrfgN4(z);
        if (b6aM1137primaryActionForegroundColorijrfgN4 == null) {
            bfm.AgE(458496364);
            j2 = auraTheme.getColors(bfm, 6).onMedia;
            BBI.A0R(bbi, false);
        } else {
            bfm.AgE(458494039);
            BBI.A0R(bbi, false);
            j2 = b6aM1137primaryActionForegroundColorijrfgN4.A00;
        }
        List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
        AuraButtonCorner auraButtonCorner = AuraButtonCorner.PILL;
        long j3 = B6A.A07;
        return auraButtonStyles.m2416toLabelButtonStyle31qCuKU(j, j2, auraButtonCorner, list, null, false, j3, j3, j3, j2, j2, 0.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberProductDetailsImpression(com.facebook.aura.shopping.model.ProductDetailsPresentation r19, com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics r20, X.BFM r21, int r22) {
        /*
            r5 = r19
            r6 = r20
            X.AnonymousClass003.A0u(r5, r6)
            r2 = r21
            java.lang.Object r0 = r2.AaT()
            java.lang.Object r9 = X.C78N.A00
            if (r0 != r9) goto L1c
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.Ai0(r0)
        L1c:
            long r0 = X.C3cG.A05(r0)
            java.lang.String r7 = r5.productId
            com.facebook.aura.shopping.model.PdpProductInfo r3 = r5.product
            java.lang.String r3 = r3.url
            com.facebook.aura.shopping.model.ShoppingProductType r4 = r5.productType
            boolean r3 = X.AnonymousClass003.A1K(r2, r7, r3)
            boolean r8 = X.AnonymousClass003.A1H(r2, r4, r3)
            r3 = r22 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r7 = 32
            if (r3 <= r7) goto L3e
            boolean r3 = r2.A65(r6)
            if (r3 != 0) goto L43
        L3e:
            r3 = r22 & 48
            r4 = 0
            if (r3 != r7) goto L44
        L43:
            r4 = 1
        L44:
            r4 = r4 | r8
            java.lang.Object r3 = r2.AaT()
            if (r4 != 0) goto L4d
            if (r3 != r9) goto L81
        L4d:
            X.BS0 r8 = X.BRg.A00
            com.facebook.aura.analytics.hatch.HatchOrigin r9 = com.facebook.aura.analytics.hatch.HatchOrigin.SHOPPING
            com.facebook.aura.analytics.hatch.HatchSurface r10 = com.facebook.aura.analytics.hatch.HatchSurface.SHOPPING
            com.facebook.aura.analytics.hatch.HatchScreen r12 = com.facebook.aura.analytics.hatch.HatchScreen.PRODUCT_DETAIL
            com.facebook.aura.analytics.hatch.HatchComponent r13 = com.facebook.aura.analytics.hatch.HatchComponent.PRODUCT_DETAIL_SHEET
            java.lang.String r14 = r6.productId
            com.facebook.aura.shopping.model.PdpProductInfo r3 = r5.product
            java.lang.String r7 = r3.url
            com.facebook.aura.shopping.model.ShoppingProductType r4 = r5.productType
            r11 = 0
            X.9jH r3 = X.C9jH.A00
            X.BO6 r15 = r6.metadata(r7, r4, r3)
            java.lang.String r5 = r5.productId
            java.lang.String r4 = "pdp_sheet:"
            java.lang.String r3 = ":"
            java.lang.String r20 = X.FGI.A0a(r4, r5, r3, r0)
            r17 = 500(0x1f4, double:2.47E-321)
            r19 = 0
            r16 = r11
            r21 = r11
            r22 = r11
            X.BRg r3 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.hatchImpression(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22)
            r2.Ai0(r3)
        L81:
            X.BRg r3 = (X.BRg) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ProductDetailsSectionsKt.rememberProductDetailsImpression(com.facebook.aura.shopping.model.ProductDetailsPresentation, com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics, X.BFM, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ProductPriceValues(com.facebook.aura.shopping.model.PdpPrice r45, com.facebook.aura.shopping.model.PdpPrice r46, java.lang.Integer r47, java.lang.String r48, X.BFM r49, int r50) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ProductDetailsSectionsKt.ProductPriceValues(com.facebook.aura.shopping.model.PdpPrice, com.facebook.aura.shopping.model.PdpPrice, java.lang.Integer, java.lang.String, X.BFM, int):void");
    }
}
