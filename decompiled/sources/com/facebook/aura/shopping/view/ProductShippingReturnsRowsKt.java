package com.facebook.aura.shopping.view;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C1515AkP;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.shopping.model.PdpAction;
import com.facebook.aura.shopping.model.PdpActionIntent;
import com.facebook.aura.shopping.model.PdpPrice;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ProductShippingReturns;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class ProductShippingReturnsRowsKt {

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$PartnerFulfillmentSection$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ProductDetailsAnalytics $analytics;
        public final /* synthetic */ ShoppingProductDetailsCtaState $cta;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
        public final /* synthetic */ ShoppingProductType $productType;
        public final /* synthetic */ String $productUrl;
        public final /* synthetic */ String $secondaryActionUrl;
        public final /* synthetic */ ProductShippingReturns $signals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ProductShippingReturns productShippingReturns, ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, String str, ShoppingProductType shoppingProductType, String str2, ProductDetailsAnalytics productDetailsAnalytics, G0U<? super PdpActionIntent, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$signals = productShippingReturns;
            this.$cta = shoppingProductDetailsCtaState;
            this.$productUrl = str;
            this.$productType = shoppingProductType;
            this.$secondaryActionUrl = str2;
            this.$analytics = productDetailsAnalytics;
            this.$onAction = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            ProductShippingReturnsRowsKt.PartnerFulfillmentSection(this.$signals, this.$cta, this.$productUrl, this.$productType, this.$secondaryActionUrl, this.$analytics, this.$onAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$PartnerFulfillmentSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ProductDetailsAnalytics $analytics;
        public final /* synthetic */ ShoppingProductDetailsCtaState $cta;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<PdpActionIntent, Unit> $onAction;
        public final /* synthetic */ ShoppingProductType $productType;
        public final /* synthetic */ String $productUrl;
        public final /* synthetic */ String $secondaryActionUrl;
        public final /* synthetic */ ProductShippingReturns $signals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ProductShippingReturns productShippingReturns, ShoppingProductDetailsCtaState shoppingProductDetailsCtaState, String str, ShoppingProductType shoppingProductType, String str2, ProductDetailsAnalytics productDetailsAnalytics, G0U<? super PdpActionIntent, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$signals = productShippingReturns;
            this.$cta = shoppingProductDetailsCtaState;
            this.$productUrl = str;
            this.$productType = shoppingProductType;
            this.$secondaryActionUrl = str2;
            this.$analytics = productDetailsAnalytics;
            this.$onAction = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            ProductShippingReturnsRowsKt.PartnerFulfillmentSection(this.$signals, this.$cta, this.$productUrl, this.$productType, this.$secondaryActionUrl, this.$analytics, this.$onAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$PartnerShippingSummary$1, reason: invalid class name and case insensitive filesystem */
    public final class C137531 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ProductShippingReturns $signals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137531(ProductShippingReturns productShippingReturns, BRg bRg, int i, int i2) {
            super(2);
            this.$signals = productShippingReturns;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductShippingReturnsRowsKt.PartnerShippingSummary(this.$signals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$ProductShippingReturnsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C137541 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ProductShippingReturns $signals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137541(ProductShippingReturns productShippingReturns, BRg bRg, int i, int i2) {
            super(2);
            this.$signals = productShippingReturns;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            ProductShippingReturnsRowsKt.ProductShippingReturnsSection(this.$signals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$ProductShippingReturnsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C137552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ProductShippingReturns $signals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137552(ProductShippingReturns productShippingReturns, BRg bRg, int i, int i2) {
            super(2);
            this.$signals = productShippingReturns;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            ProductShippingReturnsRowsKt.ProductShippingReturnsSection(this.$signals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$ProductShippingReturnsSection$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ProductShippingReturns $signals;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ProductShippingReturns productShippingReturns, BRg bRg, int i, int i2) {
            super(2);
            this.$signals = productShippingReturns;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) throws Resources.NotFoundException {
            ProductShippingReturnsRowsKt.ProductShippingReturnsSection(this.$signals, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$ShippingInfoDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C137561 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137561(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductShippingReturnsRowsKt.ShippingInfoDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt$ShippingInfoRowList$2, reason: invalid class name and case insensitive filesystem */
    public final class C137572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ShippingInfoLink $link;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<ShippingInfoRow> $rows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137572(List<ShippingInfoRow> list, ShippingInfoLink shippingInfoLink, BRg bRg, int i, int i2) {
            super(2);
            this.$rows = list;
            this.$link = shippingInfoLink;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ProductShippingReturnsRowsKt.ShippingInfoRowList(this.$rows, this.$link, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final ShippingInfoRow returnsRow(String str) {
        return new ShippingInfoRow(R.drawable.cubeshipping_outline_24_wght400, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PartnerFulfillmentSection(com.facebook.aura.shopping.model.ProductShippingReturns r30, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState r31, java.lang.String r32, com.facebook.aura.shopping.model.ShoppingProductType r33, java.lang.String r34, com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics r35, X.G0U<? super com.facebook.aura.shopping.model.PdpActionIntent, kotlin.Unit> r36, X.BRg r37, X.BFM r38, int r39, int r40) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt.PartnerFulfillmentSection(com.facebook.aura.shopping.model.ProductShippingReturns, com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsCtaState, java.lang.String, com.facebook.aura.shopping.model.ShoppingProductType, java.lang.String, com.facebook.aura.shopping.viewmodel.ProductDetailsAnalytics, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void PartnerShippingSummary(ProductShippingReturns productShippingReturns, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c137531;
        BRg bRg2 = bRg;
        bfm.AgG(1675008721);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(productShippingReturns, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (productShippingReturns == null) {
                AnonymousClass004.A1A(bfm, 1254892398);
            } else {
                bfm.AgE(1254892399);
                String strPartnerShippingSummary = partnerShippingSummary(productShippingReturns, bfm, ProductShippingReturns.$stable);
                boolean zA1V = AnonymousClass001.A1V(bfm);
                if (strPartnerShippingSummary != null) {
                    BRg bRgA04 = C3U4.A04(bRg2, AuraDimensKt.SpacingNano);
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    AuraTextKt.m2639AuraTextUY9GdpU(strPartnerShippingSummary, bRgA04, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, zA1V, zA1V ? 1 : 0, zA1V ? 1 : 0, zA1V ? 1 : 0, null, null, null, bfm, zA1V ? 1 : 0, zA1V ? 1 : 0, 16368);
                }
            }
            bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                c137531 = new ProductShippingReturnsRowsKt$PartnerShippingSummary$summary$2(productShippingReturns, bRg2, i, i2);
                C3cG.A1D(bBbAAc, c137531);
            }
            return;
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c137531 = new C137531(productShippingReturns, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c137531);
        }
    }

    public static final void ProductShippingReturnsSection(ProductShippingReturns productShippingReturns, BRg bRg, BFM bfm, int i, int i2) throws Resources.NotFoundException {
        BBb bBbAAc;
        Object anonymousClass4;
        BRg bRg2 = bRg;
        bfm.AgG(-880568508);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(productShippingReturns, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (productShippingReturns == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc == null) {
                    return;
                } else {
                    anonymousClass4 = new C137541(productShippingReturns, bRg2, i, i2);
                }
            } else {
                int i4 = ProductShippingReturns.$stable;
                int i5 = iA05 & 14;
                ShippingInfoRow shippingInfoRowFreeShippingRow = freeShippingRow(productShippingReturns, bfm, i4 | i5);
                String strReturnsRowTitle = returnsRowTitle(productShippingReturns, bfm, i5 | i4);
                List listA0F = BFI.A0F(new ShippingInfoRow[]{shippingInfoRowFreeShippingRow, strReturnsRowTitle != null ? returnsRow(strReturnsRowTitle) : null});
                if (listA0F.isEmpty()) {
                    bBbAAc = bfm.AAc();
                    if (bBbAAc == null) {
                        return;
                    } else {
                        anonymousClass4 = new C137552(productShippingReturns, bRg2, i, i2);
                    }
                } else {
                    BRg bRgA0C = C3U4.A0C(bRg2, 0.0f, ProductDetailsSectionsKt.PdpSectionSpacing, 0.0f, 0.0f);
                    InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120de5);
                    BRg bRgA0B = C3U4.A0B(BRg.A00, 0.0f, AuraDimensKt.SpacingXsmall);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = ProductShippingReturnsRowsKt$ProductShippingReturnsSection$3$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, false);
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRgA0Y, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).footnoteMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                    ShippingInfoRowList(listA0F, null, null, bfm, 48, 4);
                    BBI.A0R(bbi, true);
                }
            }
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(productShippingReturns, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void ShippingInfoRowList(List<ShippingInfoRow> list, ShippingInfoLink shippingInfoLink, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-1782154825);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, shippingInfoLink);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 576606924);
                int i4 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        ShippingInfoRow shippingInfoRow = (ShippingInfoRow) next;
                        if (i4 > 0) {
                            bfm.AgE(876398861);
                            ShippingInfoDivider(null, bfm, 0, 1);
                        } else {
                            bfm.AgE(1398581098);
                        }
                        BBI.A0R(bbi, false);
                        m2060ShippingReturnsRowyrwZFoE(shippingInfoRow.iconRes, shippingInfoRow.title, shippingInfoRow.subtitle, null, 0L, bfm, 0, 24);
                        i4 = i5;
                    }
                }
                BBI.A0R(bbi, false);
                if (shippingInfoLink == null) {
                    bfm.AgE(695131368);
                } else {
                    bfm.AgE(695131369);
                    if (list.isEmpty()) {
                        bfm.AgE(1814796456);
                    } else {
                        bfm.AgE(1028372495);
                        ShippingInfoDivider(null, bfm, 0, 1);
                    }
                    BBI.A0R(bbi, false);
                    m2060ShippingReturnsRowyrwZFoE(R.drawable.arrowupright_outline_24_wght500, shippingInfoLink.title, null, C0v5.A04(BRg.A00, C3cG.A0A(0), null, shippingInfoLink.onClick, true), C3cH.A0W(bfm).link, bfm, 384, 0);
                }
                bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137572(list, shippingInfoLink, bRgA0Q, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e4  */
    /* renamed from: ShippingReturnsRow-yrwZFoE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2060ShippingReturnsRowyrwZFoE(int r36, java.lang.String r37, java.lang.String r38, X.BRg r39, long r40, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.ProductShippingReturnsRowsKt.m2060ShippingReturnsRowyrwZFoE(int, java.lang.String, java.lang.String, X.BRg, long, X.BFM, int, int):void");
    }

    public static final List<ShippingInfoRow> partnerFulfillmentRows(ProductShippingReturns productShippingReturns, BFM bfm, int i) throws Resources.NotFoundException {
        ShippingInfoRow shippingInfoRow;
        BBI bbiA07;
        ShippingInfoRow shippingInfoRow2;
        ProductShippingReturns productShippingReturns2 = null;
        if (productShippingReturns.fulfillmentMethods.contains(ProductShippingReturns.FulfillmentMethod.DELIVERY)) {
            productShippingReturns2 = productShippingReturns;
        }
        if (productShippingReturns2 == null) {
            bbiA07 = AnonymousClass002.A0M(bfm, -1473754371);
            shippingInfoRow = null;
        } else {
            bfm.AgE(-1473754370);
            shippingInfoRow = new ShippingInfoRow(R.drawable.shopping_bag_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dc0), null);
            bbiA07 = C3cG.A07(bfm);
        }
        String str = productShippingReturns.membershipFreeShipping;
        if (str != null) {
            bfm.AgE(-463171922);
            shippingInfoRow2 = new ShippingInfoRow(R.drawable.truck_outline_24, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120de4), null);
            BBI.A0R(bbiA07, false);
        } else if (productShippingReturns.freeShipping != null) {
            bfm.AgE(-463164851);
            shippingInfoRow2 = freeShippingRow(productShippingReturns, bfm, ProductShippingReturns.$stable | (i & 14));
            BBI.A0R(bbiA07, false);
        } else if (productShippingReturns.fulfillmentMethods.contains(ProductShippingReturns.FulfillmentMethod.SHIPPING)) {
            bfm.AgE(-463161353);
            shippingInfoRow2 = new ShippingInfoRow(R.drawable.truck_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120de1), null);
            BBI.A0R(bbiA07, false);
        } else {
            bfm.AgE(-1472927384);
            BBI.A0R(bbiA07, false);
            shippingInfoRow2 = null;
        }
        String strPartnerReturnsRowTitle = partnerReturnsRowTitle(productShippingReturns, bfm, (i & 14) | ProductShippingReturns.$stable);
        return BFI.A0F(new ShippingInfoRow[]{shippingInfoRow, shippingInfoRow2, strPartnerReturnsRowTitle != null ? returnsRow(strPartnerReturnsRowTitle) : null});
    }

    public static final HxE<String, String> productWebsite(ShoppingProductDetailsCtaState shoppingProductDetailsCtaState) {
        Object next;
        PdpActionIntent.OpenUrl openUrl;
        String str;
        String str2 = shoppingProductDetailsCtaState.websiteArrowUrl;
        if (str2 != null) {
            return C3cG.A0r(str2, shoppingProductDetailsCtaState.websiteArrowLabel);
        }
        Iterator it = shoppingProductDetailsCtaState.others.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PdpAction) next).followsProductWebsite) {
                break;
            }
        }
        PdpAction pdpAction = (PdpAction) next;
        if (pdpAction == null) {
            return null;
        }
        PdpActionIntent pdpActionIntent = pdpAction.intent;
        if (!(pdpActionIntent instanceof PdpActionIntent.OpenUrl) || (openUrl = (PdpActionIntent.OpenUrl) pdpActionIntent) == null || (str = openUrl.url) == null) {
            return null;
        }
        return C3cG.A0r(str, pdpAction.label);
    }

    public static final void ShippingInfoDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1452776818);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraDividerKt.AuraRowDivider(C3U4.A0C(bRg, AuraDimensKt.SpacingXlarge + AuraDimensKt.SpacingSmall, 0.0f, 0.0f, 0.0f), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C137561(bRg, i, i2);
        }
    }

    public static final ShippingInfoRow freeShippingRow(ProductShippingReturns productShippingReturns, BFM bfm, int i) {
        bfm.AgE(1706005178);
        ProductShippingReturns.FreeShipping freeShipping = productShippingReturns.freeShipping;
        String strA0t = null;
        if (freeShipping == null) {
            AnonymousClass002.A19(bfm);
            return null;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120de2);
        PdpPrice pdpPrice = freeShipping.orderMinimum;
        if (pdpPrice == null) {
            bfm.AgE(1252562229);
        } else {
            bfm.AgE(1252562230);
            strA0t = AnonymousClass001.A0t(bfm, ProductDetailsPresentationKt.formatPrice(pdpPrice, C60Q.A0w()), R.string._name_removed__res_0x7f120de3);
        }
        BBI bbiA07 = C3cG.A07(bfm);
        ShippingInfoRow shippingInfoRow = new ShippingInfoRow(R.drawable.truck_outline_24, strA01, strA0t);
        BBI.A0R(bbiA07, false);
        return shippingInfoRow;
    }

    public static final String partnerReturnsRowTitle(ProductShippingReturns productShippingReturns, BFM bfm, int i) throws Resources.NotFoundException {
        String strReturnsRowTitle;
        bfm.AgE(-1836420104);
        if (AnonymousClass002.A1b(productShippingReturns.notReturnable, true)) {
            bfm.AgE(502206996);
            strReturnsRowTitle = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dce);
        } else {
            AnonymousClass004.A1A(bfm, 502258890);
            strReturnsRowTitle = productShippingReturns.returnPolicyText;
            if (strReturnsRowTitle == null) {
                bfm.AgE(431845136);
                strReturnsRowTitle = returnsRowTitle(productShippingReturns, bfm, (i & 14) | ProductShippingReturns.$stable);
            } else {
                bfm.AgE(431844268);
            }
        }
        AnonymousClass006.A1M(bfm);
        return strReturnsRowTitle;
    }

    public static final String partnerShippingSummary(ProductShippingReturns productShippingReturns, BFM bfm, int i) {
        String strA0t;
        BBI bbiA07;
        bfm.AgE(-2056042687);
        String str = productShippingReturns.membershipFreeShipping;
        if (str == null) {
            bbiA07 = AnonymousClass002.A0M(bfm, -1038973303);
            ProductShippingReturns.FreeShipping freeShipping = productShippingReturns.freeShipping;
            strA0t = null;
            if (freeShipping != null && freeShipping.orderMinimum == null) {
                strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120de2);
            }
        } else {
            bfm.AgE(-1038973302);
            strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120de4);
            bbiA07 = C3cG.A07(bfm);
        }
        BBI.A0R(bbiA07, false);
        return strA0t;
    }

    public static final String returnsRowTitle(ProductShippingReturns productShippingReturns, BFM bfm, int i) throws Resources.NotFoundException {
        BBI bbiA0M;
        bfm.AgE(41337324);
        Integer num = productShippingReturns.returnWindowDays;
        String strA00 = null;
        if (num == null || num.intValue() <= 0) {
            num = null;
        }
        if (AnonymousClass002.A1b(productShippingReturns.freeReturns, true)) {
            bfm.AgE(-1175232939);
            if (num == null) {
                bfm.AgE(-1175220446);
                strA00 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120dd4);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1070468010);
                strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100034, new Object[]{num}, bfm, num.intValue());
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.AgE(-1175078218);
            bbiA0M = (BBI) bfm;
            BBI.A0R(bbiA0M, false);
            if (num != null) {
                strA00 = AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100035, new Object[]{num}, bfm, num.intValue());
            }
        }
        BBI.A0R(bbiA0M, false);
        return strA00;
    }
}
