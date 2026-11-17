package com.facebook.aura.shopping.view;

import X.AKO;
import X.AKQ;
import X.ARK;
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
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0A8;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1824Aro;
import X.C1AC;
import X.C1BO;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3UC;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.shopping.model.PdpAction;
import com.facebook.aura.shopping.model.PdpActionIntent;
import com.facebook.aura.shopping.model.PdpRating;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCouponTag;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPriceIssue;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonCorner;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.button.LabelButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ShoppingProductDetailsBodyKt {
    public static final String BUY_RESPONSIBLY_LINK_TAG = "buy_responsibly";
    public static final String BUY_RESPONSIBLY_URL = "https://www.facebook.com/help/1156544111079919";
    public static final int DESCRIPTION_COLLAPSED_LINES = 3;
    public static final float ReviewsThumbnailBorderWidth = 1.0f;
    public static final float ReviewsThumbnailCorner = 8.0f;
    public static final float ReviewsThumbnailSize = 56.0f;
    public static final float StarToLabelSpacing = 2.0f;

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$BuyResponsiblyNotice$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BO6<String, String> $analyticsMetadata;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BO6<String, String> bo6, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$productId = str;
            this.$analyticsMetadata = bo6;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.BuyResponsiblyNotice(this.$productId, this.$analyticsMetadata, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$PdpBuyButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $buyButtonColor;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $label;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, boolean z, boolean z2, Integer num, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$enabled = z;
            this.$loading = z2;
            this.$buyButtonColor = num;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.PdpBuyButton(this.$label, this.$enabled, this.$loading, this.$buyButtonColor, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$ProductListingDuration$1, reason: invalid class name and case insensitive filesystem */
    public final class C137621 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137621(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.ProductListingDuration(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$ProductPriceLoadError$2, reason: invalid class name and case insensitive filesystem */
    public final class C137632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onReload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137632(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onReload = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.ProductPriceLoadError(this.$onReload, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$ProductReviewsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C137642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $productName;
        public final /* synthetic */ PdpRating $rating;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137642(PdpRating pdpRating, String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$rating = pdpRating;
            this.$productName = str;
            this.$imageUrl = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.ProductReviewsSection(this.$rating, this.$productName, this.$imageUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$ProductSelectedSize$1, reason: invalid class name and case insensitive filesystem */
    public final class C137651 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137651(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.ProductSelectedSize(this.$label, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$ShoppingPrimaryCta$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PdpAction $action;
        public final /* synthetic */ Integer $buyButtonColor;
        public final /* synthetic */ boolean $isAddingToCart;
        public final /* synthetic */ boolean $isBuyEnabled;
        public final /* synthetic */ boolean $isBuying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(PdpAction pdpAction, boolean z, boolean z2, boolean z3, Integer num, G0U<? super PdpActionIntent, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$action = pdpAction;
            this.$isBuyEnabled = z;
            this.$isBuying = z2;
            this.$isAddingToCart = z3;
            this.$buyButtonColor = num;
            this.$onAction = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.ShoppingPrimaryCta(this.$action, this.$isBuyEnabled, this.$isBuying, this.$isAddingToCart, this.$buyButtonColor, this.$onAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt$ShoppingProductCtaRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C137662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $addToCartFailed;
        public final /* synthetic */ BO6<String, String> $analyticsMetadata;
        public final /* synthetic */ Integer $buyButtonColor;
        public final /* synthetic */ boolean $buyFailed;
        public final /* synthetic */ ShoppingProductDetailsCtaState $cta;
        public final /* synthetic */ boolean $isAddingToCart;
        public final /* synthetic */ boolean $isBuyEnabled;
        public final /* synthetic */ boolean $isBuying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
        public final /* synthetic */ Function0<Unit> $onReload;
        public final /* synthetic */ ShoppingProductDetailsPriceIssue $priceIssue;
        public final /* synthetic */ String $productId;
        public final /* synthetic */ ShoppingProductType $productType;
        public final /* synthetic */ String $secondaryActionUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137662(ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, String str, ShoppingProductType shoppingProductType, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, ShoppingProductDetailsPriceIssue shoppingProductDetailsPriceIssue, G0U<? super PdpActionIntent, Unit> g0u, Function0<Unit> function0, BO6<String, String> bo6, String str2, Integer num, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$cta = shoppingProductDetailsCtaState;
            this.$productId = str;
            this.$productType = shoppingProductType;
            this.$isBuyEnabled = z;
            this.$isBuying = z2;
            this.$buyFailed = z3;
            this.$isAddingToCart = z4;
            this.$addToCartFailed = z5;
            this.$priceIssue = shoppingProductDetailsPriceIssue;
            this.$onAction = g0u;
            this.$onReload = function0;
            this.$analyticsMetadata = bo6;
            this.$secondaryActionUrl = str2;
            this.$buyButtonColor = num;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            ShoppingProductDetailsBodyKt.ShoppingProductCtaRow(this.$cta, this.$productId, this.$productType, this.$isBuyEnabled, this.$isBuying, this.$buyFailed, this.$isAddingToCart, this.$addToCartFailed, this.$priceIssue, this.$onAction, this.$onReload, this.$analyticsMetadata, this.$secondaryActionUrl, this.$buyButtonColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingProductDetailsPriceIssue.values().length];
            try {
                AnonymousClass002.A13(ShoppingProductDetailsPriceIssue.LOAD_FAILED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShoppingProductDetailsPriceIssue.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.BO6] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v10, types: [X.ApQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.Aro, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BuyResponsiblyNotice(java.lang.String r34, X.BO6<java.lang.String, java.lang.String> r35, kotlin.jvm.functions.Function0<kotlin.Unit> r36, X.BRg r37, X.BFM r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt.BuyResponsiblyNotice(java.lang.String, X.BO6, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final void PdpBuyButton(String str, boolean z, boolean z2, Integer num, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BRg bRg2 = bRg;
        bfm.AgG(1559292749);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, num);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AbstractC3358CGz abstractC3358CGzA06 = AKO.A06(LocalUserSessionKt.LocalUserSession, bbi);
            boolean zA65 = bfm.A65(abstractC3358CGzA06);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA06);
                bfm.Ai0(objAaT);
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((HatchIdentityProvider) objAaT).aiIdentityName);
            AuraLabelButtonStyle auraLabelButtonStylePdpPrimaryCtaStyle = ProductDetailsSectionsKt.pdpPrimaryCtaStyle(bfm, 0);
            if (str == null) {
                bfm.AgE(-463239265);
                strA0t = AnonymousClass001.A0t(bfm, c1boA02.getValue(), R.string._name_removed__res_0x7f120dbe);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-463239544);
                BBI.A0R(bbi, false);
                strA0t = str;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            if (num == null) {
                bfm.AgE(-1475342160);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1475342159);
                int iIntValue = num.intValue();
                AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
                long jA0U = C8j3.A0U(iIntValue);
                long j = AuraTheme.INSTANCE.getColors(bfm, 6).onMedia;
                List<AuraButtonSize> list = AuraButtonKt.SIZES_REGULAR;
                AuraButtonCorner auraButtonCorner = AuraButtonCorner.PILL;
                long j2 = B6A.A07;
                LabelButtonStyle labelButtonStyleM2416toLabelButtonStyle31qCuKU = auraButtonStyles.m2416toLabelButtonStyle31qCuKU(jA0U, j, auraButtonCorner, list, null, false, j2, j2, j2, j, j, 0.0f, null);
                BBI.A0R(bbi, false);
                if (labelButtonStyleM2416toLabelButtonStyle31qCuKU != null) {
                    auraLabelButtonStylePdpPrimaryCtaStyle = labelButtonStyleM2416toLabelButtonStyle31qCuKU;
                }
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0t, null, bRgA0R, auraLabelButtonStylePdpPrimaryCtaStyle, auraButtonSize, null, false, false, z, z2, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0d << 24) & 1879048192) | 196608, AnonymousClass001.A0B(iA0d, (iA0d >> 6) & 14), 0, 134199749);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, z2, num, function0, bRg2, i, i2);
        }
    }

    public static final void ProductListingDuration(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1021741281);
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
            BRg bRgA04 = C3U4.A04(bRg2, AuraDimensKt.SpacingNano);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA04, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137621(str, bRg2, i, i2);
        }
    }

    public static final void ProductPriceLoadError(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1358247673);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA04 = C3U4.A04(bRgA0R, f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc8);
            BRg bRgA00 = ARK.A00(BRg.A00);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ShoppingProductDetailsBodyKt$ProductPriceLoadError$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA00, objAaT, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA0Y, auraTheme.getColors(bfm, 6).errorText, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dd3), null, null, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137632(function0, bRg2, i, i2);
        }
    }

    public static final void ProductReviewsSection(PdpRating pdpRating, String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1879865319);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pdpRating, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            String str3 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(pdpRating.value)}, 1));
            String strA0w = AnonymousClass006.A0w(bfm, str3, Integer.valueOf(pdpRating.reviewCount), R.string._name_removed__res_0x7f120dd1);
            String strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(pdpRating.reviewCount), R.string._name_removed__res_0x7f120dd2);
            C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
            long j = colors.secondaryText;
            long j2 = C1809ArT.A01;
            long j3 = B6A.A07;
            int iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, j3));
            try {
                c1731ApSA0W.A0E(str3);
                c1731ApSA0W.A06(iA00);
                c1731ApSA0W.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                iA00 = C1731ApS.A00(c1731ApSA0W, new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, colors.tertiaryText, j2, j2, j3));
                c1731ApSA0W.A0E(strA0t);
                c1731ApSA0W.A06(iA00);
                ApQ apQA04 = c1731ApSA0W.A04();
                float f = AuraDimensKt.SpacingSmall;
                C9m9 c9m9A00 = AcQ.A00(f);
                C3TH c3th = C2VU.A02;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
                BBI bbi = (BBI) bfm;
                int iA02 = C3cG.A02(bbi.A06);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRg2);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dd5);
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = ShoppingProductDetailsBodyKt$ProductReviewsSection$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT, false), colors.primaryText, C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                C9m9 c9m9A002 = AcQ.A00(f);
                C1AC c1ac = C2VU.A04;
                InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(c9m9A002, bfm, c1ac);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0b, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                BRg bRgA07 = C10G.A07(bs0, ReviewsThumbnailSize);
                float f2 = ReviewsThumbnailCorner;
                BRg bRgA02 = C1DI.A02(C1b8.A01(C11U.A01(bRgA07, f2), colors.background), C1D8.A00(f2), ReviewsThumbnailBorderWidth, colors.border);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA02);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                if (str2 != null) {
                    bfm.AgE(-554492003);
                    AuraImageKt.m2573AuraImageXRP3Ue8(str2, C10G.A01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, ((iA05 >> 6) & 14) | 3504, 0, 32752);
                } else {
                    bfm.AgE(-554299493);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingMicro, 0);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA014 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
                BPg.A02(bfm, akqA044, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA014, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, colors.primaryText, auraTheme.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 2, 2, null, null, null, bfm, AnonymousClass005.A01(iA05 >> 3), 6, 14834);
                boolean zA65 = bfm.A65(strA0w);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == obj) {
                    objAaT2 = new ShoppingProductDetailsBodyKt$ProductReviewsSection$1$2$2$1$1(strA0w);
                    BBI.A0O(bbi, objAaT2);
                }
                BRg bRgA0X = AnonymousClass001.A0X(bs0, objAaT2);
                InterfaceC1380AiA interfaceC1380AiAA0b2 = AnonymousClass001.A0b(AcQ.A00(StarToLabelSpacing), bfm, c1ac);
                int iA0D4 = AnonymousClass001.A0D(bbi);
                AKQ akqA045 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA0X);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0b2, g0vA0v);
                BPg.A02(bfm, akqA045, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                BPg.A02(bfm, bRgA015, g0vA0u);
                HatchStarRatingKt.m2044StarRatingRow6a0pyJM(pdpRating.value, null, 0.0f, bfm, 0, 6);
                AuraTextKt.m2640AuraTextVmYn7U0(apQA04, null, 0L, C3cH.A0E(bfm, auraTheme), null, null, null, 0L, false, 0, 1, 0, null, null, null, bfm, 0, 6, 31734);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, true);
            } catch (Throwable th) {
                c1731ApSA0W.A06(iA00);
                throw th;
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137642(pdpRating, str, str2, bRg2, i, i2);
        }
    }

    public static final void ProductSelectedSize(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1247420103);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120dd6);
            BRg bRgA04 = C3U4.A04(bRg2, AuraDimensKt.SpacingSmall);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, bRgA04, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137651(str, bRg2, i, i2);
        }
    }

    public static final void ShoppingPrimaryCta(PdpAction pdpAction, boolean z, boolean z2, boolean z3, Integer num, G0U<? super PdpActionIntent, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1329020401);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(pdpAction, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, num);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, g0u);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (C7384Etj.areEqual(pdpAction.intent, PdpActionIntent.AddToCart.INSTANCE)) {
                bfm.AgE(1838533915);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120db9);
                BRg bRgA0R = AnonymousClass001.A0R(bRg2);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                AuraLabelButtonStyle auraLabelButtonStylePdpPrimaryCtaStyle = ProductDetailsSectionsKt.pdpPrimaryCtaStyle(bfm, 0);
                boolean zA1Q = AnonymousClass002.A1Q(iA05 & 458752, 131072) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(pdpAction)));
                Object objAaT = bfm.AaT();
                if (zA1Q || objAaT == C78N.A00) {
                    objAaT = new ShoppingProductDetailsBodyKt$ShoppingPrimaryCta$1$1(g0u, pdpAction);
                    BBI.A0T(bfm, objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0R, auraLabelButtonStylePdpPrimaryCtaStyle, auraButtonSize, null, false, false, false, z3, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA05 >> 9) & 14, 0, 134200261);
            } else {
                bfm.AgE(1838818309);
                String str = pdpAction.label;
                boolean zA1Q2 = AnonymousClass002.A1Q(iA05 & 458752, 131072) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(pdpAction)));
                Object objAaT2 = bfm.AaT();
                if (zA1Q2 || objAaT2 == C78N.A00) {
                    objAaT2 = new ShoppingProductDetailsBodyKt$ShoppingPrimaryCta$2$1(g0u, pdpAction);
                    BBI.A0T(bfm, objAaT2);
                }
                int i4 = iA05 & 1008;
                int i5 = iA05 >> 3;
                PdpBuyButton(str, z, z2, num, (Function0) objAaT2, bRg2, bfm, i4 | (i5 & 7168) | (i5 & 458752), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(pdpAction, z, z2, z3, num, g0u, bRg2, i, i2);
        }
    }

    public static final String couponTagLabel(ShoppingProductDetailsCouponTag shoppingProductDetailsCouponTag, BFM bfm, int i) {
        if (!(shoppingProductDetailsCouponTag instanceof ShoppingProductDetailsCouponTag.Discount)) {
            AnonymousClass004.A1A(bfm, -955892162);
            throw C3cG.A0q();
        }
        bfm.AgE(-955889812);
        String strA0t = AnonymousClass001.A0t(bfm, ((ShoppingProductDetailsCouponTag.Discount) shoppingProductDetailsCouponTag).text, R.string._name_removed__res_0x7f120dbf);
        AnonymousClass001.A1D(bfm);
        return strA0t;
    }

    /* renamed from: horizontalBleed-3ABfNKs, reason: not valid java name */
    public static final BRg m2072horizontalBleed3ABfNKs(BRg bRg, float f) {
        return C3UC.A00(bRg, new ShoppingProductDetailsBodyKt$horizontalBleed$1(f));
    }

    public static final void logDescriptionSeeMoreClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, HatchComponent.SEE_MORE_BUTTON, str, null, null);
    }

    public static final void logPdpDeeplinkClick(String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, HatchComponent.VISIT_WEBSITE_BUTTON, str, map, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARN: Type inference failed for: r6v17, types: [X.BRg, com.facebook.aura.vds.compose.button.AuraButtonCorner] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ShoppingProductCtaRow(com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState r63, java.lang.String r64, com.facebook.aura.shopping.model.ShoppingProductType r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPriceIssue r71, X.G0U<? super com.facebook.aura.shopping.model.PdpActionIntent, kotlin.Unit> r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, X.BO6<java.lang.String, java.lang.String> r74, java.lang.String r75, java.lang.Integer r76, X.BRg r77, X.BFM r78, int r79, int r80, int r81) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt.ShoppingProductCtaRow(com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState, java.lang.String, com.facebook.aura.shopping.model.ShoppingProductType, boolean, boolean, boolean, boolean, boolean, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPriceIssue, X.G0U, kotlin.jvm.functions.Function0, X.BO6, java.lang.String, java.lang.Integer, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* renamed from: ShoppingProductDetailsBody-nywSH8E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2071ShoppingProductDetailsBodynywSH8E(com.facebook.aura.shopping.model.ProductDetailsPresentation r76, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsDisplayState r77, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState r78, boolean r79, boolean r80, boolean r81, boolean r82, boolean r83, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r84, X.G0U<? super com.facebook.aura.shopping.model.PdpActionIntent, kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, X.G0V<? super com.facebook.aura.shopping.model.ShoppingResultProduct, ? super com.facebook.aura.shopping.model.ShoppingFormat, kotlin.Unit> r87, X.G0V<? super java.util.List<java.lang.String>, ? super java.lang.Integer, kotlin.Unit> r88, java.lang.String r89, com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics r90, float r91, float r92, java.lang.Integer r93, kotlin.jvm.functions.Function0<java.lang.String> r94, X.C1DG r95, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r96, X.BRg r97, X.BFM r98, int r99, int r100, int r101, int r102) {
        /*
            Method dump skipped, instructions count: 2461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ShoppingProductDetailsBodyKt.m2071ShoppingProductDetailsBodynywSH8E(com.facebook.aura.shopping.model.ProductDetailsPresentation, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsDisplayState, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState, boolean, boolean, boolean, boolean, boolean, X.G0V, X.G0U, kotlin.jvm.functions.Function0, X.G0V, X.G0V, java.lang.String, com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics, float, float, java.lang.Integer, kotlin.jvm.functions.Function0, X.1DG, X.G0W, X.BRg, X.BFM, int, int, int, int):void");
    }
}
