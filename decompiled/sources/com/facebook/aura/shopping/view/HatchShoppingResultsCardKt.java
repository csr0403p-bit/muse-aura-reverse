package com.facebook.aura.shopping.view;

import X.AHD;
import X.AKO;
import X.AKQ;
import X.ARK;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BO6;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.productactions.impl.ConversationItemActionContext;
import com.facebook.aura.productactions.impl.ShoppingConversationItemActionsKt;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.shopping.model.ShoppingDisplayPrices;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingProductPriceKt;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingProductSubtitle;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.navigation.ShoppingProductDetailsNavigationKt;
import com.facebook.aura.shopping.repo.HatchProductDetailsHydrationKt;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import com.facebook.aura.shopping.viewmodel.ShoppingAnalyticsMetadataKt;
import com.facebook.aura.shopping.viewmodel.ShoppingResultsCardDisplayState;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchShoppingResultsCardKt {
    public static final ShoppingCardClickLogging DefaultShoppingCardClickLogging = new ShoppingCardClickLogging(HatchScreen.PRODUCT_LIST, HatchComponent.PRODUCT_CARD, null);
    public static final float ProductCardCornerRadius = 8.0f;
    public static final float ProductCardImageInfoSpacing = 8.0f;
    public static final float ProductImageBorderWidth = 1.0f;
    public static final float ProductImageCornerRadius = 12.0f;
    public static final float ProductImageDecodeSize = 187.0f;
    public static final float ProductImageFallbackAlpha = 0.04f;
    public static final float ProductThumbnailBorderWidth = 0.5f;
    public static final float ProductThumbnailDecodeSize = 80.0f;
    public static final float ProductThumbnailInfoSpacing = 10.0f;
    public static final float ProductThumbnailSize = 80.0f;
    public static final float ShoppingResultsListItemSpacing = 16.0f;
    public static final int ShoppingResultsMaxVisible = 5;

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ProductImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $aspectRatio;
        public final /* synthetic */ boolean $imageBorder;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ShoppingResultProduct $product;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ String $sharedElementKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShoppingResultProduct shoppingResultProduct, String str, C1DM c1dm, float f, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$product = shoppingResultProduct;
            this.$sharedElementKey = str;
            this.$shape = c1dm;
            this.$aspectRatio = f;
            this.$modifier = bRg;
            this.$imageBorder = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ProductImage(this.$product, this.$sharedElementKey, this.$shape, this.$aspectRatio, this.$modifier, this.$imageBorder, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ProductImageFallback$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C137302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraIconSize $iconSize;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137302(AuraIconSize auraIconSize, BRg bRg, int i, int i2) {
            super(2);
            this.$iconSize = auraIconSize;
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
            HatchShoppingResultsCardKt.ProductImageFallback(this.$iconSize, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ProductThumbnail$2, reason: invalid class name and case insensitive filesystem */
    public final class C137312 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ShoppingResultProduct $product;
        public final /* synthetic */ String $sharedElementKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137312(ShoppingResultProduct shoppingResultProduct, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$product = shoppingResultProduct;
            this.$sharedElementKey = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ProductThumbnail(this.$product, this.$sharedElementKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingProductHighlight$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingProductHighlight(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingProductSharedElement$1, reason: invalid class name and case insensitive filesystem */
    public final class C137321 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C1DM $shape;
        public final /* synthetic */ String $sharedElementKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137321(String str, C1DM c1dm, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$sharedElementKey = str;
            this.$shape = c1dm;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingProductSharedElement(this.$sharedElementKey, this.$shape, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultListItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C137332 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ ShoppingDisplayPrices $displayPrices;
        public final /* synthetic */ int $nameMaxLines;
        public final /* synthetic */ ShoppingResultProduct $product;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ ShoppingProductSubtitle $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137332(ShoppingResultProduct shoppingResultProduct, String str, int i, ShoppingProductSubtitle shoppingProductSubtitle, ShoppingDisplayPrices shoppingDisplayPrices) {
            super(3);
            this.$product = shoppingResultProduct;
            this.$sharedElementKey = str;
            this.$nameMaxLines = i;
            this.$subtitle = shoppingProductSubtitle;
            this.$displayPrices = shoppingDisplayPrices;
        }

        public final void invoke(BRg bRg, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(bRg, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, bRg);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchShoppingResultsCardKt$ShoppingResultListItem$2$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg, objAaT, true);
            C9m9 c9m9A00 = AcQ.A00(HatchShoppingResultsCardKt.ProductThumbnailInfoSpacing);
            C1AC c1ac = C2VU.A04;
            ShoppingResultProduct shoppingResultProduct = this.$product;
            String str = this.$sharedElementKey;
            int i2 = this.$nameMaxLines;
            ShoppingProductSubtitle shoppingProductSubtitle = this.$subtitle;
            ShoppingDisplayPrices shoppingDisplayPrices = this.$displayPrices;
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(c9m9A00, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            HatchShoppingResultsCardKt.ProductThumbnail(shoppingResultProduct, str, null, bfm, ShoppingResultProduct.$stable, 4);
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = ARK.A00(bs0);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str2 = shoppingResultProduct.highlightedAttribute;
            if (str2 == null) {
                bfm.AgE(782413141);
            } else {
                bfm.AgE(782413142);
                HatchShoppingResultsCardKt.ShoppingProductHighlight(str2, C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingNano), bfm, 0, 0);
            }
            BBI.A0R(bbi, false);
            String str3 = shoppingResultProduct.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, i2, 2, null, null, null, bfm, 0, 6, 14834);
            HatchShoppingResultsCardKt.m2041ShoppingProductSubtitleLine1yyLQnY(shoppingProductSubtitle, C3cH.A0E(bfm, auraTheme), 16.0f, AuraDimensKt.SpacingMicroPlusNano, AuraIconSize.X_TINY, null, bfm, 24960, 32);
            ShoppingProductPriceKt.m2012ShoppingProductPricecf5BqRc(shoppingDisplayPrices, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), bfm, 0, 2);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultListItem$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConversationItemActionContext $actionContext;
        public final /* synthetic */ ShoppingDisplayPrices $displayPrices;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $nameMaxLines;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
        public final /* synthetic */ ShoppingResultProduct $product;
        public final /* synthetic */ BO6<String, String> $rowMetadata;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ ShoppingProductSubtitle $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ShoppingResultProduct shoppingResultProduct, ShoppingProductSubtitle shoppingProductSubtitle, int i, ShoppingDisplayPrices shoppingDisplayPrices, G0U<? super ShoppingResultProduct, Unit> g0u, String str, BRg bRg, BO6<String, String> bo6, ConversationItemActionContext conversationItemActionContext, int i2, int i3) {
            super(2);
            this.$product = shoppingResultProduct;
            this.$subtitle = shoppingProductSubtitle;
            this.$nameMaxLines = i;
            this.$displayPrices = shoppingDisplayPrices;
            this.$onProductClick = g0u;
            this.$sharedElementKey = str;
            this.$modifier = bRg;
            this.$rowMetadata = bo6;
            this.$actionContext = conversationItemActionContext;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultListItem(this.$product, this.$subtitle, this.$nameMaxLines, this.$displayPrices, this.$onProductClick, this.$sharedElementKey, this.$modifier, this.$rowMetadata, this.$actionContext, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultProductCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C137342 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ ShoppingResultProductUiModel $displayProduct;
        public final /* synthetic */ boolean $imageBorder;
        public final /* synthetic */ boolean $isPartner;
        public final /* synthetic */ boolean $prefetchOnImpression;
        public final /* synthetic */ ShoppingResultProduct $product;
        public final /* synthetic */ C1D3 $shape;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ String $titleFallback;
        public final /* synthetic */ int $titleMaxLines;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137342(boolean z, C1D3 c1d3, ShoppingResultProduct shoppingResultProduct, boolean z2, String str, boolean z3, String str2, int i, ShoppingResultProductUiModel shoppingResultProductUiModel) {
            super(3);
            this.$prefetchOnImpression = z;
            this.$shape = c1d3;
            this.$product = shoppingResultProduct;
            this.$isPartner = z2;
            this.$sharedElementKey = str;
            this.$imageBorder = z3;
            this.$titleFallback = str2;
            this.$titleMaxLines = i;
            this.$displayProduct = shoppingResultProductUiModel;
        }

        public final void invoke(BRg bRg, BFM bfm, int i) {
            C1DM c1dmA00;
            float f;
            AuraTheme auraTheme;
            C1822Arm c1822Arm;
            BRg bRgThen = bRg;
            int iA0d = i;
            C7384Etj.A0Y(bRgThen, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, bRgThen);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            bfm.AgE(2130056157);
            boolean z = this.$prefetchOnImpression;
            ShoppingResultProduct shoppingResultProduct = this.$product;
            if (z) {
                BS0 bs0 = BRg.A00;
                boolean zA65 = bfm.A65(shoppingResultProduct);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = HatchProductDetailsHydrationKt.getPrefetchTarget(shoppingResultProduct);
                    bfm.Ai0(objAaT);
                }
                bRgThen = bRgThen.then(HatchProductDetailsPrefetchModifierKt.prefetchProductDetailsOnImpression(bs0, (ProductDetailsHydrationTarget) objAaT, bfm, 6));
            }
            BBI bbiA07 = C3cG.A07(bfm);
            BRg bRgA03 = C11U.A03(bRgThen, this.$shape);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchShoppingResultsCardKt$ShoppingResultProductCard$2$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0Y(bRgA03, objAaT2, true), 0.0f, 0.0f, 0.0f, 4.0f);
            boolean z2 = this.$isPartner;
            ShoppingResultProduct shoppingResultProduct2 = this.$product;
            String str = this.$sharedElementKey;
            boolean z3 = this.$imageBorder;
            String str2 = this.$titleFallback;
            int i2 = this.$titleMaxLines;
            ShoppingResultProductUiModel shoppingResultProductUiModel = this.$displayProduct;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA02 = C3cG.A02(bbiA07.A06);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (z2) {
                bfm.AgE(-1959123695);
                c1dmA00 = AuraTheme.INSTANCE.getShapes(bfm, 6).large;
                BBI.A0R(bbiA07, false);
                f = 0.8625f;
            } else {
                bfm.AgE(-1959122856);
                BBI.A0R(bbiA07, false);
                c1dmA00 = C1D8.A00(HatchShoppingResultsCardKt.ProductImageCornerRadius);
                f = 0.8019324f;
            }
            HatchShoppingResultsCardKt.ProductImage(shoppingResultProduct2, str, c1dmA00, f, null, z3, bfm, ShoppingResultProduct.$stable, 16);
            String str3 = shoppingResultProduct2.name;
            if (C7BY.A0j(str3)) {
                if (str2 == null) {
                    str2 = "";
                }
                str3 = str2;
            }
            BS0 bs02 = BRg.A00;
            BRg bRgA0C2 = C3U4.A0C(bs02, 0.0f, HatchShoppingResultsCardKt.ProductCardImageInfoSpacing, 0.0f, 0.0f);
            if (z2) {
                bRgA0C2 = bRgA0C2.then(C3U4.A0B(bs02, AuraDimensKt.SpacingMicro, 0.0f));
            }
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbiA07);
            AKQ akqA042 = BBI.A04(bbiA07);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C2);
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str4 = shoppingResultProduct2.highlightedAttribute;
            if (str4 == null || !z2) {
                bfm.AgE(1990917204);
            } else {
                bfm.AgE(1990917205);
                HatchShoppingResultsCardKt.ShoppingProductHighlight(str4, null, bfm, 0, 2);
            }
            BBI.A0R(bbiA07, false);
            if (str3.length() > 0) {
                bfm.AgE(1991013832);
                if (z2) {
                    bfm.AgE(1588250224);
                    auraTheme = AuraTheme.INSTANCE;
                    c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
                } else {
                    bfm.AgE(1588252116);
                    auraTheme = AuraTheme.INSTANCE;
                    c1822Arm = auraTheme.getTypography(bfm, 6).footnoteEmphasized;
                }
                BBI.A0R(bbiA07, false);
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C3cH.A06(bfm, auraTheme), c1822Arm, null, null, null, false, 0, i2, 2, null, null, null, bfm, 0, 6, 14834);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(1991354336);
                BBI.A0R(bbiA07, false);
            }
            ShoppingProductSubtitle shoppingProductSubtitle = shoppingResultProductUiModel.subtitle;
            AuraTheme auraTheme2 = AuraTheme.INSTANCE;
            HatchShoppingResultsCardKt.m2041ShoppingProductSubtitleLine1yyLQnY(shoppingProductSubtitle, auraTheme2.getTypography(bfm, 6).caption1Regular, 12.0f, AuraDimensKt.SpacingMicro, AuraIconSize.XX_TINY, null, bfm, 24960, 32);
            ShoppingProductPriceKt.m2012ShoppingProductPricecf5BqRc(shoppingResultProductUiModel.displayPrices, null, C3cH.A07(bfm, auraTheme2), auraTheme2.getTypography(bfm, 6).caption1Regular, bfm, 0, 2);
            BBI.A0R(bbiA07, true);
            BBI.A0R(bbiA07, true);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultProductCard$3, reason: invalid class name and case insensitive filesystem */
    public final class C137353 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConversationItemActionContext $actionContext;
        public final /* synthetic */ ShoppingCardClickLogging $clickLogging;
        public final /* synthetic */ ShoppingResultProductUiModel $displayProduct;
        public final /* synthetic */ boolean $imageBorder;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ShoppingResultProduct, Unit> $onProductClick;
        public final /* synthetic */ boolean $prefetchOnImpression;
        public final /* synthetic */ String $sharedElementKey;
        public final /* synthetic */ ShoppingProductCardStyle $style;
        public final /* synthetic */ String $titleFallback;
        public final /* synthetic */ int $titleMaxLines;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137353(ShoppingResultProductUiModel shoppingResultProductUiModel, G0U<? super ShoppingResultProduct, Unit> g0u, BRg bRg, boolean z, String str, int i, boolean z2, ShoppingCardClickLogging shoppingCardClickLogging, ConversationItemActionContext conversationItemActionContext, String str2, ShoppingProductCardStyle shoppingProductCardStyle, int i2, int i3, int i4) {
            super(2);
            this.$displayProduct = shoppingResultProductUiModel;
            this.$onProductClick = g0u;
            this.$modifier = bRg;
            this.$imageBorder = z;
            this.$titleFallback = str;
            this.$titleMaxLines = i;
            this.$prefetchOnImpression = z2;
            this.$clickLogging = shoppingCardClickLogging;
            this.$actionContext = conversationItemActionContext;
            this.$sharedElementKey = str2;
            this.$style = shoppingProductCardStyle;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultProductCard(this.$displayProduct, this.$onProductClick, this.$modifier, this.$imageBorder, this.$titleFallback, this.$titleMaxLines, this.$prefetchOnImpression, this.$clickLogging, this.$actionContext, this.$sharedElementKey, this.$style, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultsAttributionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C137362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingResultsAttribution $attribution;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137362(ShoppingResultsAttribution shoppingResultsAttribution, BRg bRg, int i, int i2) {
            super(2);
            this.$attribution = shoppingResultsAttribution;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultsAttributionHeader(this.$attribution, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultsHeading$1, reason: invalid class name and case insensitive filesystem */
    public final class C137371 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingResultsAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137371(ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$attribution = shoppingResultsAttribution;
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultsHeading(this.$attribution, this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultsHeading$3, reason: invalid class name and case insensitive filesystem */
    public final class C137383 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShoppingResultsAttribution $attribution;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137383(ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$attribution = shoppingResultsAttribution;
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultsHeading(this.$attribution, this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultsTitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C137392 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137392(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultsTitle(this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingResultsViewMoreButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C137401 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137401(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchShoppingResultsCardKt.ShoppingResultsViewMoreButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: ProductImageOrFallback-942rkJo, reason: not valid java name */
    public static final void m2040ProductImageOrFallback942rkJo(ShoppingResultProduct shoppingResultProduct, AuraIconSize auraIconSize, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(shoppingResultProduct, auraIconSize);
        bfm.AgG(-492972046);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass005.A09(bfm, auraIconSize);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String resolvedProductId = ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProduct);
            String str = shoppingResultProduct.imageUrl;
            if (str == null || !ShoppingResultsPresentationKt.getCanAttemptImage(shoppingResultProduct)) {
                str = null;
            }
            HatchShoppingProductImageKt.m2038HatchShoppingProductImagegNPyAyM(resolvedProductId, str, shoppingResultProduct.url, ShoppingResultsPresentationKt.getAllowsLinkPreviewImage(shoppingResultProduct), f, B1V.A00(bfm, new HatchShoppingResultsCardKt$ProductImageOrFallback$2(auraIconSize, bRg2), 1917109430), AnonymousClass001.A0T(bRg2), zA1b, null, bfm, ((iA05 << 6) & 57344) | 196608, 384);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchShoppingResultsCardKt$ProductImageOrFallback$3(shoppingResultProduct, auraIconSize, f, bRg2, i, i2);
        }
    }

    public static final void ProductThumbnail(ShoppingResultProduct shoppingResultProduct, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-699586350);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(ProductCardCornerRadius);
            BRg bRgA03 = C11U.A03(C10G.A07(bRg2, ProductThumbnailSize), c1d3A00);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA02 = C1DI.A02(C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).elevated), c1d3A00, ProductThumbnailBorderWidth, auraTheme.getColors(bfm, 6).border);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA02);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            ShoppingProductSharedElement(str, c1d3A00, C10G.A01, B1V.A00(bfm, new HatchShoppingResultsCardKt$ProductThumbnail$1$1(shoppingResultProduct), -1955487860), bfm, ((iA05 >> 3) & 14) | 3456, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137312(shoppingResultProduct, str, bRg2, i, i2);
        }
    }

    public static final void ShoppingProductSharedElement(String str, C1DM c1dm, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1227929327);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1dm);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchSharedElementKt.HatchSharedElement(str, c1dm, bRg2, null, null, 350, g0v, bfm, AnonymousClass001.A05(iA0d << 9, AnonymousClass002.A07(iA0d, (iA0d & 14) | 196608)), 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137321(str, c1dm, bRg2, g0v, i, i2);
        }
    }

    public static final C1DG getCardImageDecodeSize(ShoppingFormat shoppingFormat) {
        float f;
        C7384Etj.A0Y(shoppingFormat, 0);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingFormat.ordinal();
        if (iOrdinal == 1) {
            f = ProductThumbnailDecodeSize;
        } else {
            if (iOrdinal != 2) {
                return null;
            }
            f = ProductImageDecodeSize;
        }
        return C8j3.A0k(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberShoppingTileImpression(com.facebook.aura.analytics.hatch.HatchComponent r15, com.facebook.aura.shopping.model.ShoppingResultProduct r16, int r17, java.lang.String r18, X.BO6<java.lang.String, java.lang.String> r19, X.BFM r20, int r21) {
        /*
            r12 = r15
            r6 = r16
            r4 = r18
            X.AnonymousClass005.A0y(r15, r6, r4)
            java.lang.String r3 = com.facebook.aura.shopping.model.ShoppingResultsPresentationKt.getResolvedProductId(r6)
            r8 = r21
            r0 = r21 & 14
            r0 = r0 ^ 6
            r5 = 4
            r10 = 0
            r1 = r20
            if (r0 <= r5) goto L1e
            boolean r0 = X.AnonymousClass002.A1U(r1, r15)
            if (r0 != 0) goto L23
        L1e:
            r2 = r21 & 6
            r0 = 0
            if (r2 != r5) goto L24
        L23:
            r0 = 1
        L24:
            boolean r9 = X.AnonymousClass001.A1R(r1, r3, r0)
            r0 = r8 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r5 = r17
            if (r0 <= r7) goto L38
            boolean r0 = r1.A63(r5)
            if (r0 != 0) goto L3d
        L38:
            r2 = r8 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r2 != r7) goto L3e
        L3d:
            r0 = 1
        L3e:
            r9 = r9 | r0
            r0 = r8 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r0 <= r7) goto L4d
            boolean r0 = r1.A65(r4)
            if (r0 != 0) goto L52
        L4d:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r2 != r7) goto L53
        L52:
            r0 = 1
        L53:
            r9 = r9 | r0
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r21
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r2 = 16384(0x4000, float:2.2959E-41)
            r14 = r19
            if (r0 <= r2) goto L67
            boolean r0 = r1.A65(r14)
            if (r0 != 0) goto L6b
        L67:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != r2) goto L6c
        L6b:
            r10 = 1
        L6c:
            r9 = r9 | r10
            java.lang.Object r0 = r1.AaT()
            if (r9 != 0) goto L77
            java.lang.Object r2 = X.C78N.A00
            if (r0 != r2) goto La9
        L77:
            X.BS0 r7 = X.BRg.A00
            com.facebook.aura.analytics.hatch.HatchOrigin r8 = com.facebook.aura.analytics.hatch.HatchOrigin.SHOPPING
            com.facebook.aura.analytics.hatch.HatchSurface r9 = com.facebook.aura.analytics.hatch.HatchSurface.SHOPPING
            com.facebook.aura.analytics.hatch.HatchScreen r11 = com.facebook.aura.analytics.hatch.HatchScreen.PRODUCT_LIST
            java.lang.String r13 = r6.productId
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            java.lang.String r0 = r12.getValue()
            java.lang.StringBuilder r2 = X.C3cG.A0g(r0)
            java.lang.String r0 = ":"
            X.C60O.A1R(r0, r4, r2)
            r2.append(r5)
            java.lang.String r19 = X.C60P.A1M(r0, r3, r2)
            r10 = 0
            r16 = 500(0x1f4, double:2.47E-321)
            r18 = 0
            r20 = r10
            r21 = r10
            X.BRg r0 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.hatchImpression(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21)
            r1.Ai0(r0)
        La9:
            X.BRg r0 = (X.BRg) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt.rememberShoppingTileImpression(com.facebook.aura.analytics.hatch.HatchComponent, com.facebook.aura.shopping.model.ShoppingResultProduct, int, java.lang.String, X.BO6, X.BFM, int):X.BRg");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingFormat.values().length];
            try {
                AnonymousClass002.A13(ShoppingFormat.LIST, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShoppingFormat.GRID, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: HatchShoppingResultsCard-Ccamzx0, reason: not valid java name */
    public static final void m2039HatchShoppingResultsCardCcamzx0(ShoppingResultsPresentation shoppingResultsPresentation, G0W<? super Integer, ? super ShoppingResultProduct, ? super List<ShoppingResultProduct>, Unit> g0w, String str, String str2, BRg bRg, long j, C1D3 c1d3, String str3, String str4, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String strA0e = str3;
        String str5 = str4;
        boolean zA1Z = AnonymousClass005.A1Z(shoppingResultsPresentation, g0w, str);
        C7384Etj.A0Y(c1d3, 6);
        bfm.AgG(-895273909);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingResultsPresentation) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0R(bfm, j);
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, c1d3);
        }
        int i4 = i2 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, strA0e);
            iA0d |= iA0k;
        }
        int i5 = i2 & 256;
        int iA0l = 100663296;
        if (i5 != 0) {
            iA0d |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, str5);
            iA0d |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            strA0e = C3cG.A0e(strA0e, i4);
            String strA0e2 = C3cG.A0e(str5, i5);
            List<ShoppingResultProduct> list = shoppingResultsPresentation.products;
            str5 = strA0e2;
            if (strA0e2 == null) {
                strA0e2 = str;
            }
            ShoppingResultsCardDisplayState shoppingResultsCardDisplayState = ShoppingResultsCardPresenterKt.shoppingResultsCardDisplayState(strA0e2, list, shoppingResultsPresentation.attribution, 5, bfm, 3072);
            AHD<ShoppingResultProductUiModel> ahd = shoppingResultsCardDisplayState.products;
            AHD<ShoppingResultProduct> ahd2 = shoppingResultsCardDisplayState.sourceProducts;
            boolean z = shoppingResultsCardDisplayState.hasMore;
            BBI bbi = (BBI) bfm;
            AuraNavigator auraNavigatorA05 = AKO.A05(AuraNavigatorKt.LocalNavigator, bbi);
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            AHD<ProductDetailsHydrationTarget> ahd3 = shoppingResultsCardDisplayState.prefetchTargets;
            String str6 = str5;
            if (str5 == null) {
                str6 = str;
            }
            boolean zA65 = bfm.A65(list);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ShoppingMerchantRanking(list);
                BBI.A0O(bbi, objAaT);
            }
            ShoppingMerchantRanking shoppingMerchantRanking = (ShoppingMerchantRanking) objAaT;
            int i6 = iA0d & 896;
            boolean zA1W = AnonymousClass002.A1W(bfm, shoppingMerchantRanking, AnonymousClass001.A1R(bfm, str6, AnonymousClass003.A19(i6)), bfm.A63(list.size()));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = shoppingResultsCardImpression(str, str6, list.size(), shoppingMerchantRanking);
                bfm.Ai0(objAaT2);
            }
            BRg bRg3 = (BRg) objAaT2;
            int size = list.size();
            boolean zA63 = bfm.A63(ahd.size()) | bfm.A63(size) | bfm.A65(str6);
            Object objAaT3 = bfm.AaT();
            if (zA63 || objAaT3 == C78N.A00) {
                objAaT3 = C3cH.A0m(HatchMetadataKey.TOTAL_COUNT.getValue(), String.valueOf(ahd.size()), C3cG.A0r(HatchMetadataKey.PRESENTATION_ID.getValue(), str6), C3cG.A0r(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(list.size())));
                bfm.Ai0(objAaT3);
            }
            Map map = (Map) objAaT3;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A03(HatchProductDetailsPrefetchModifierKt.prefetchProductDetailsOnImpression(bRg2.then(bRg3), ahd3, bfm, 0), c1d3), j), AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, ShoppingResultsListItemSpacing, 6);
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA02);
                ShoppingResultsAttribution shoppingResultsAttribution = shoppingResultsPresentation.attribution;
                String str7 = shoppingResultsPresentation.label;
                String str8 = shoppingResultsPresentation.subtitle;
                C1062ATq c1062ATq = C10G.A02;
                ShoppingResultsHeading(shoppingResultsAttribution, str7, str8, c1062ATq, bfm, 3072, 0);
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1053611788);
                int i7 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        ShoppingResultProductUiModel shoppingResultProductUiModel = (ShoppingResultProductUiModel) next;
                        ShoppingResultProduct shoppingResultProduct = shoppingResultProductUiModel.product;
                        Object resolvedProductId = ShoppingResultsPresentationKt.getResolvedProductId(shoppingResultProduct);
                        Number number = (Number) linkedHashMapA0j.get(resolvedProductId);
                        int iIntValue = number != null ? number.intValue() : 0;
                        C8j4.A1O(resolvedProductId, linkedHashMapA0j, iIntValue + 1);
                        bfm.Ag8(-2039011128, bfm.APR(resolvedProductId, Integer.valueOf(iIntValue)));
                        HatchComponent hatchComponent = HatchComponent.PRODUCT_CARD;
                        boolean zA1T = AnonymousClass005.A1T(bfm, str6, shoppingMerchantRanking, map, bfm.A65(shoppingResultProduct) | AnonymousClass003.A19(i6));
                        Object objAaT4 = bfm.AaT();
                        if (zA1T || objAaT4 == C78N.A00) {
                            objAaT4 = ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, str, ShoppingFormat.LIST, str6, shoppingMerchantRanking, map);
                            bfm.Ai0(objAaT4);
                        }
                        int i9 = ShoppingResultProduct.$stable;
                        BRg bRgRememberShoppingTileImpression = rememberShoppingTileImpression(hatchComponent, shoppingResultProduct, i7, str6, (BO6) objAaT4, bfm, (i9 << 3) | 6);
                        ShoppingFormat shoppingFormat = ShoppingFormat.LIST;
                        String strShoppingProductSharedElementKey = ShoppingProductDetailsNavigationKt.shoppingProductSharedElementKey(shoppingFormat, str5, i7);
                        int i10 = ConversationItemActionContext.$stable;
                        ConversationItemActionContext conversationItemActionContext = new ConversationItemActionContext(shoppingResultProduct, new ShoppingProductSource(str5, str2, i7, shoppingResultsPresentation.widgetId, shoppingResultProduct.wireIndex, shoppingResultsPresentation.kind, null, null), strA0e, str, false, false, Integer.valueOf(i7));
                        ShoppingProductSubtitle shoppingProductSubtitle = shoppingResultProductUiModel.subtitle;
                        int i11 = shoppingResultsCardDisplayState.nameMaxLines;
                        ShoppingDisplayPrices shoppingDisplayPrices = shoppingResultProductUiModel.displayPrices;
                        boolean zA1W2 = AnonymousClass002.A1W(bfm, ahd2, bfm.A63(i7), AnonymousClass003.A1C(iA0d));
                        Object objAaT5 = bfm.AaT();
                        if (zA1W2 || objAaT5 == C78N.A00) {
                            objAaT5 = new HatchShoppingResultsCardKt$HatchShoppingResultsCard$1$1$1$1(g0w, i7, ahd2);
                            BBI.A0O(bbi, objAaT5);
                        }
                        G0U g0u = (G0U) objAaT5;
                        BRg bRgThen = c1062ATq.then(bRgRememberShoppingTileImpression);
                        boolean zA1P = AnonymousClass003.A1P(bfm, str6, shoppingMerchantRanking, AnonymousClass001.A1a(bfm.A65(shoppingResultProduct), bfm, i7) | AnonymousClass003.A19(i6));
                        Object objAaT6 = bfm.AaT();
                        if (zA1P || objAaT6 == C78N.A00) {
                            objAaT6 = ShoppingAnalyticsMetadataKt.shoppingAnalyticsMetadata(shoppingResultProduct, str, shoppingFormat, str6, shoppingMerchantRanking, AnonymousClass006.A10(HatchMetadataKey.ABSOLUTE_POSITION.getValue(), String.valueOf(i7)));
                            bfm.Ai0(objAaT6);
                        }
                        ShoppingResultListItem(shoppingResultProduct, shoppingProductSubtitle, i11, shoppingDisplayPrices, g0u, strShoppingProductSharedElementKey, bRgThen, (BO6) objAaT6, conversationItemActionContext, bfm, i9 | (ConversationItemActionContext.$stable << 24), 0);
                        BBI.A0R(bbi, false);
                        i7 = i8;
                    }
                }
                BBI.A0R(bbi, false);
                if (z) {
                    bfm.AgE(1700349476);
                    boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA05, AnonymousClass001.A1T(bfm, abstractC3358CGzA06, AnonymousClass005.A1X(bfm, shoppingMerchantRanking, list, bfm.A65(str6), AnonymousClass002.A1Q(i6, 256))) | AnonymousClass005.A1F(iA0d), AnonymousClass004.A1F(iA0d)) | AnonymousClass005.A1K(iA0d) | AnonymousClass004.A1M(iA0d);
                    Object objAaT7 = bfm.AaT();
                    if (zA1V || objAaT7 == C78N.A00) {
                        objAaT7 = new HatchShoppingResultsCardKt$HatchShoppingResultsCard$1$2$1(str, str6, shoppingMerchantRanking, list, abstractC3358CGzA06, str5, shoppingResultsPresentation, auraNavigatorA05, strA0e, str2);
                        BBI.A0O(bbi, objAaT7);
                    }
                    ShoppingResultsViewMoreButton((Function0) objAaT7, c1062ATq, bfm, 48, 0);
                } else {
                    bfm.AgE(1701526701);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, zA1Z);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchShoppingResultsCardKt$HatchShoppingResultsCard$2(shoppingResultsPresentation, g0w, str, str2, bRg2, j, c1d3, strA0e, str5, i, i2);
        }
    }

    public static final void ProductImage(ShoppingResultProduct shoppingResultProduct, String str, C1DM c1dm, float f, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        BRg bRgA02;
        BRg bRg2 = bRg;
        boolean z2 = z;
        bfm.AgG(-1846969896);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1dm);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A07(bfm, f);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0s = 196608;
        if (i4 != 0) {
            iA05 |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, z2);
            iA05 |= iA0s;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            BRg bRgA03 = C11U.A03(BJe.A00(AnonymousClass001.A0R(bRg2), f, false), c1dm);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(bRgA03, auraTheme.getColors(bfm, 6).background);
            if (z2) {
                bRgA02 = C1DI.A02(C3cG.A09(bfm, -253691752), c1dm, ProductImageBorderWidth, auraTheme.getColors(bfm, 6).border);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -253574696);
                bRgA02 = BRg.A00;
            }
            BRg bRgThen = bRgA01.then(bRgA02);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            int i5 = iA05 >> 3;
            ShoppingProductSharedElement(str, c1dm, C10G.A01, B1V.A00(bfm, new HatchShoppingResultsCardKt$ProductImage$1$1(shoppingResultProduct), 1724726418), bfm, (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i5 & 14) | 3456, 0);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(shoppingResultProduct, str, c1dm, f, bRg2, z2, i, i2);
        }
    }

    public static final void ProductImageFallback(AuraIconSize auraIconSize, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(auraIconSize, 0);
        bfm.AgG(-453366919);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, auraIconSize) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA01 = C1b8.A01(bRgA0T, HxS.A04(HDi.A0O[(int) (jA06 & 63)], B6A.A03(jA06), B6A.A02(jA06), B6A.A01(jA06), 0.04f));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.shopping_bag_wght400_outline_24, 0), auraIconSize, null, C3cH.A07(bfm, auraTheme), null, bfm, (AVy.$stable << 3) | 3072 | ((iA08 << 6) & 896), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137302(auraIconSize, bRg2, i, i2);
        }
    }

    public static final void ShoppingProductHighlight(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1325336028);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg2, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption2Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d) | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[PHI: r5
  0x008d: PHI (r5v2 boolean) = (r5v0 boolean), (r5v3 boolean) binds: [B:40:0x008b, B:38:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ShoppingProductSubtitleLine-1yyLQnY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2041ShoppingProductSubtitleLine1yyLQnY(com.facebook.aura.shopping.model.ShoppingProductSubtitle r14, X.C1822Arm r15, float r16, float r17, com.facebook.aura.vds.compose.icons.AuraIconSize r18, X.BRg r19, X.BFM r20, int r21, int r22) {
        /*
            r10 = r19
            r0 = -1042755731(0xffffffffc1d8cf6d, float:-27.101282)
            r11 = r20
            r11.AgG(r0)
            r1 = r21
            r0 = r21 & 6
            if (r0 != 0) goto Lb3
            int r2 = X.AnonymousClass004.A0d(r11, r14)
            r2 = r2 | r21
        L16:
            r0 = r21 & 48
            r4 = r15
            if (r0 != 0) goto L20
            int r0 = X.AnonymousClass004.A0e(r11, r15)
            r2 = r2 | r0
        L20:
            r0 = r1 & 384(0x180, float:5.38E-43)
            r7 = r16
            if (r0 != 0) goto L2b
            int r0 = X.AnonymousClass004.A06(r11, r7)
            r2 = r2 | r0
        L2b:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            r8 = r17
            if (r0 != 0) goto L36
            int r0 = X.AnonymousClass004.A07(r11, r8)
            r2 = r2 | r0
        L36:
            r0 = r1 & 24576(0x6000, float:3.4438E-41)
            r9 = r18
            if (r0 != 0) goto L45
            int r0 = r9.ordinal()
            int r0 = X.AnonymousClass004.A0G(r11, r0)
            r2 = r2 | r0
        L45:
            r21 = r22
            r3 = r22 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L54
            r0 = r0 & r1
            if (r0 != 0) goto L55
            int r0 = X.AnonymousClass004.A0i(r11, r10)
        L54:
            r2 = r2 | r0
        L55:
            boolean r0 = X.AnonymousClass005.A1A(r2)
            boolean r0 = X.AnonymousClass001.A1b(r0, r11, r2)
            if (r0 == 0) goto L7e
            if (r3 == 0) goto L63
            X.BS0 r10 = X.BRg.A00
        L63:
            r0 = r2 & 14
            java.lang.String r3 = com.facebook.aura.shopping.model.ShoppingEyebrowTextKt.shoppingSubtitleText(r14, r11, r0)
            if (r3 != 0) goto L82
            X.BBb r0 = r11.AAc()
            if (r0 == 0) goto L7d
            com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingProductSubtitleLine$text$1 r13 = new com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingProductSubtitleLine$text$1
            r19 = r10
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
        L7a:
            X.C3cG.A1D(r0, r13)
        L7d:
            return
        L7e:
            r11.Afo()
            goto La3
        L82:
            r6 = 0
            if (r14 == 0) goto L8a
            com.facebook.aura.shopping.model.ShoppingConnector r0 = r14.connector
            r5 = 1
            if (r0 != 0) goto L8d
        L8a:
            r5 = 0
            if (r14 == 0) goto L93
        L8d:
            com.facebook.aura.shopping.model.ShoppingConnector r0 = r14.connector
            if (r0 == 0) goto L93
            java.lang.String r6 = r0.iconUrl
        L93:
            r0 = r2 & 112(0x70, float:1.57E-43)
            int r2 = r2 << 6
            int r0 = X.AnonymousClass004.A02(r2, r0)
            int r12 = X.AnonymousClass005.A05(r2, r0)
            r13 = 0
            com.facebook.aura.shopping.view.ShoppingMerchantLogoKt.m2069ShoppingMerchantLabeltOXsyB8(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        La3:
            X.BBb r0 = r11.AAc()
            if (r0 == 0) goto L7d
            com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingProductSubtitleLine$1 r13 = new com.facebook.aura.shopping.view.HatchShoppingResultsCardKt$ShoppingProductSubtitleLine$1
            r19 = r10
            r20 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L7a
        Lb3:
            r2 = r1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt.m2041ShoppingProductSubtitleLine1yyLQnY(com.facebook.aura.shopping.model.ShoppingProductSubtitle, X.Arm, float, float, com.facebook.aura.vds.compose.icons.AuraIconSize, X.BRg, X.BFM, int, int):void");
    }

    public static final void ShoppingResultListItem(ShoppingResultProduct shoppingResultProduct, ShoppingProductSubtitle shoppingProductSubtitle, int i, ShoppingDisplayPrices shoppingDisplayPrices, G0U<? super ShoppingResultProduct, Unit> g0u, String str, BRg bRg, BO6<String, String> bo6, ConversationItemActionContext conversationItemActionContext, BFM bfm, int i2, int i3) {
        BO6<String, String> bo62 = bo6;
        BRg bRg2 = bRg;
        bfm.AgG(-1335640427);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shoppingResultProduct, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, shoppingProductSubtitle);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, shoppingDisplayPrices);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i2) == 0) {
            iA05 |= AnonymousClass004.A0i(bfm, str);
        }
        int i4 = i3 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        int i5 = i3 & 128;
        int iA0k = 12582912;
        if (i5 != 0) {
            iA05 |= iA0k;
        } else if ((i2 & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bo62);
            iA05 |= iA0k;
        }
        if ((i2 & 100663296) == 0) {
            iA05 |= AnonymousClass002.A03(AnonymousClass004.A1R(bfm, conversationItemActionContext, i2, 134217728) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 38347923, 38347922), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (i5 != 0) {
                bo62 = null;
            }
            boolean zA1J = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(shoppingResultProduct))) | AnonymousClass005.A1J(iA05) | ((57344 & iA05) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new HatchShoppingResultsCardKt$ShoppingResultListItem$1$1(shoppingResultProduct, bo62, g0u);
                BBI.A0T(bfm, objAaT);
            }
            ShoppingConversationItemActionsKt.ConversationItemActionHost(conversationItemActionContext, (Function0) objAaT, bRg2, B1V.A00(bfm, new C137332(shoppingResultProduct, str, i, shoppingProductSubtitle, shoppingDisplayPrices), -1420035742), bfm, ConversationItemActionContext.$stable | 3072 | ((iA05 >> 24) & 14) | ((iA05 >> 12) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(shoppingResultProduct, shoppingProductSubtitle, i, shoppingDisplayPrices, g0u, str, bRg2, bo62, conversationItemActionContext, i2, i3);
        }
    }

    public static final void ShoppingResultsAttributionHeader(ShoppingResultsAttribution shoppingResultsAttribution, BRg bRg, BFM bfm, int i, int i2) {
        String strA0w;
        BRg bRg2 = bRg;
        bfm.AgG(-535804203);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingResultsAttribution) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingMicroPlusNano);
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
            ShoppingMerchantLogoKt.m2070ShoppingMerchantLogoDzVHIIc(shoppingResultsAttribution.iconUrl, 16.0f, AuraIconSize.X_TINY, null, bfm, 432, 8);
            String str = shoppingResultsAttribution.subtitle;
            if (str == null) {
                bfm.AgE(894856950);
                BBI.A0R(bbi, false);
                strA0w = shoppingResultsAttribution.title;
            } else {
                bfm.AgE(894858377);
                strA0w = AnonymousClass006.A0w(bfm, shoppingResultsAttribution.title, str, R.string._name_removed__res_0x7f120602);
                BBI.A0R(bbi, false);
            }
            BRg bRgA00 = ARK.A00(BRg.A00);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchShoppingResultsCardKt$ShoppingResultsAttributionHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA00, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0w, bRgA0Y, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137362(shoppingResultsAttribution, bRg2, i, i2);
        }
    }

    public static final void ShoppingResultsHeading(ShoppingResultsAttribution shoppingResultsAttribution, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c137383;
        BRg bRg2 = bRg;
        bfm.AgG(-188558005);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, shoppingResultsAttribution) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
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
            if (shoppingResultsAttribution == null && str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c137383 = new C137371(shoppingResultsAttribution, str, str2, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c137383);
                }
                return;
            }
            BRg bRgA0U = AnonymousClass001.A0U(bRg2, AuraDimensKt.SpacingLargePlusMicro);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A02, 6);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0U);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            if (shoppingResultsAttribution == null) {
                bfm.AgE(-916828942);
            } else {
                bfm.AgE(-916828941);
                ShoppingResultsAttributionHeader(shoppingResultsAttribution, null, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            if (str == null) {
                bfm.AgE(-916755069);
            } else {
                BRg bRgA09 = C3cG.A09(bfm, -916755068);
                if (shoppingResultsAttribution != null) {
                    bRgA09 = C3U4.A04(bRgA09, AuraDimensKt.SpacingXsmall);
                }
                ShoppingResultsTitle(str, str2, bRgA09, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c137383 = new C137383(shoppingResultsAttribution, str, str2, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c137383);
        }
    }

    public static final void ShoppingResultsTitle(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1129933178);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(bRgA0Q, AuraDimensKt.SpacingMicro);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchShoppingResultsCardKt$ShoppingResultsTitle$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bs0, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA0Y, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368, 6, 14832);
            if (str2 == null) {
                bfm.AgE(307016639);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 307016640).footnoteRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137392(str, str2, bRgA0Q, i, i2);
        }
    }

    public static final void ShoppingResultsViewMoreButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1637845766);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120603), null, bRg2, AuraButtonStyles.INSTANCE.secondary(AuraButtonCorner.PILL, bfm, 54, 0), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0T << 6) & 7168) | 196608, (iA0T << 12) & 57344, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137401(function0, bRg2, i, i2);
        }
    }

    public static final BRg shoppingResultsCardImpression(String str, String str2, int i, ShoppingMerchantRanking shoppingMerchantRanking) {
        AnonymousClass005.A0y(str, str2, shoppingMerchantRanking);
        return HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.SHOPPING, HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_LIST, HatchComponent.SHOPPING_RESULTS_CARD, str2, ShoppingAnalyticsMetadataKt.shoppingWidgetMetadata(str, ShoppingFormat.LIST, str2, shoppingMerchantRanking, AnonymousClass006.A10(HatchMetadataKey.PRODUCT_COUNT.getValue(), String.valueOf(i))), null, 500L, 0.0f, FGI.A0M("shopping_results_card:", str2), null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ShoppingResultProductCard(com.facebook.aura.shopping.model.ShoppingResultProductUiModel r39, X.G0U<? super com.facebook.aura.shopping.model.ShoppingResultProduct, kotlin.Unit> r40, X.BRg r41, boolean r42, java.lang.String r43, int r44, boolean r45, com.facebook.aura.shopping.view.ShoppingCardClickLogging r46, com.facebook.aura.productactions.impl.ConversationItemActionContext r47, java.lang.String r48, com.facebook.aura.shopping.view.ShoppingProductCardStyle r49, X.BFM r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchShoppingResultsCardKt.ShoppingResultProductCard(com.facebook.aura.shopping.model.ShoppingResultProductUiModel, X.G0U, X.BRg, boolean, java.lang.String, int, boolean, com.facebook.aura.shopping.view.ShoppingCardClickLogging, com.facebook.aura.productactions.impl.ConversationItemActionContext, java.lang.String, com.facebook.aura.shopping.view.ShoppingProductCardStyle, X.BFM, int, int, int):void");
    }
}
