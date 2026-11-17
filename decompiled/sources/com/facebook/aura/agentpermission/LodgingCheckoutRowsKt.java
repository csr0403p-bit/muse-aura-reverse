package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.text.BidiFormatter;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.HotelCheckoutRefundability;
import com.facebook.aura.agentpermission.LodgingPriceLabel;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.hotels.policy.HotelTaxesInfoLabelKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class LodgingCheckoutRowsKt {

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$CheckoutFactRow$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<String> $subtitles;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, List<String> list, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitles = list;
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
            LodgingCheckoutRowsKt.CheckoutFactRow(this.$title, this.$subtitles, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$CheckoutFactRow$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<String> $subtitles;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, List<String> list, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitles = list;
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
            LodgingCheckoutRowsKt.CheckoutFactRow(this.$title, this.$subtitles, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$LodgingCheckoutBookingTerms$2, reason: invalid class name and case insensitive filesystem */
    public final class C108462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108462(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = shopifyCheckoutApproval;
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
            LodgingCheckoutRowsKt.LodgingCheckoutBookingTerms(this.$checkout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$LodgingCheckoutCancellation$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ CheckoutLodgingCancellation $cancellation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowPolicy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheckoutLodgingCancellation checkoutLodgingCancellation, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$cancellation = checkoutLodgingCancellation;
            this.$onShowPolicy = function0;
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
            LodgingCheckoutRowsKt.LodgingCheckoutCancellation(this.$cancellation, this.$onShowPolicy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$LodgingCheckoutPriceLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C108472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ LodgingPriceLine $line;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108472(LodgingPriceLine lodgingPriceLine, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$line = lodgingPriceLine;
            this.$onShowTaxes = function0;
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
            LodgingCheckoutRowsKt.LodgingCheckoutPriceLine(this.$line, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$LodgingCheckoutPriceLines$2, reason: invalid class name and case insensitive filesystem */
    public final class C108482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<LodgingPriceLine> $lines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowTaxes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108482(List<LodgingPriceLine> list, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$lines = list;
            this.$onShowTaxes = function0;
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
            LodgingCheckoutRowsKt.LodgingCheckoutPriceLines(this.$lines, this.$onShowTaxes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.LodgingCheckoutRowsKt$LodgingCheckoutRefundPolicyLine$1, reason: invalid class name and case insensitive filesystem */
    public final class C108491 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowPolicy;
        public final /* synthetic */ String $refundTerms;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108491(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$refundTerms = str;
            this.$onShowPolicy = function0;
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
            LodgingCheckoutRowsKt.LodgingCheckoutRefundPolicyLine(this.$refundTerms, this.$onShowPolicy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void LodgingCheckoutPriceLines(List<LodgingPriceLine> list, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(list, function0);
        bfm.AgG(146679556);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1558757379);
            while (itA0w.hasNext()) {
                LodgingCheckoutPriceLine((LodgingPriceLine) itA0w.next(), function0, null, bfm, LodgingPriceLine.$stable | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108482(list, function0, bRg2, i, i2);
        }
    }

    public static final String lodgingCheckoutTitle(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, BFM bfm, int i) {
        HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem;
        String str;
        String strTrimToNonEmpty;
        int i2;
        Object[] objArr;
        String str2;
        String strTrimToNonEmpty2;
        C7384Etj.A0Y(shopifyCheckoutApproval, 0);
        bfm.AgE(-759209247);
        if (CheckoutApprovalPresentationKt.presentationKind(shopifyCheckoutApproval) != CheckoutPresentationKind.LODGING || (shopifyCheckoutItem = (HatchAgentPermissionsRepository.ShopifyCheckoutItem) AbstractC0878AGe.A0K(shopifyCheckoutApproval.items)) == null || (str = shopifyCheckoutItem.name) == null || (strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str)) == null) {
            AnonymousClass001.A1D(bfm);
            return null;
        }
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant = shopifyCheckoutApproval.merchant;
        if (checkoutMerchant == null || (str2 = checkoutMerchant.name) == null || (strTrimToNonEmpty2 = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) == null) {
            bfm.AgE(544366007);
            i2 = R.string._name_removed__res_0x7f1200ff;
            String strUnicodeWrap = bidiFormatter.unicodeWrap(strTrimToNonEmpty);
            C7384Etj.A0U(strUnicodeWrap);
            objArr = new Object[]{strUnicodeWrap};
        } else {
            bfm.AgE(544369288);
            i2 = R.string._name_removed__res_0x7f120100;
            String strUnicodeWrap2 = bidiFormatter.unicodeWrap(strTrimToNonEmpty);
            C7384Etj.A0U(strUnicodeWrap2);
            String strUnicodeWrap3 = bidiFormatter.unicodeWrap(strTrimToNonEmpty2);
            C7384Etj.A0U(strUnicodeWrap3);
            objArr = new Object[]{strUnicodeWrap2, strUnicodeWrap3};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass006.A1N(bfm);
        return strA02;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LodgingPriceStyle.values().length];
            try {
                AnonymousClass002.A13(LodgingPriceStyle.ITEM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LodgingPriceStyle.TOTAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LodgingPriceStyle.PAYMENT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CheckoutFactRow(String str, List<String> list, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(list, 1);
        bfm.AgG(-510231321);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
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
            if (str == null || C7BY.A0j(str)) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        if (!C7BY.A0j(AnonymousClass005.A0j(it))) {
                        }
                    }
                }
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass2(str, list, bRgA0Q, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRgA0Q), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            if (str == null || C7BY.A0j(str)) {
                bfm.AgE(2093800710);
            } else {
                bfm.AgE(2093800711);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, C3cH.A0B(bfm, AuraTheme.INSTANCE), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(760283643);
            ArrayList arrayListA0h = C3cG.A0h();
            for (String str2 : list) {
                AnonymousClass006.A1F(str2, str2, arrayListA0h);
            }
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it2);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0j, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, list, bRgA0Q, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }

    public static final void LodgingCheckoutBookingTerms(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(shopifyCheckoutApproval, 0);
        bfm.AgG(1896252389);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(shopifyCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
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
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            bfm.AgE(-1892046872);
            for (HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem : shopifyCheckoutApproval.items) {
                String str = shopifyCheckoutItem.name;
                if (str == null) {
                    bfm.AgE(918190067);
                } else {
                    bfm.AgE(918190068);
                    AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AuraTheme.INSTANCE.getTypography(bfm, 6).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                }
                BBI.A0R(bbi, false);
                bfm.AgE(-1892041112);
                List<String> list = shopifyCheckoutItem.variantOptions;
                ArrayList arrayListA0h = C3cG.A0h();
                for (String str2 : list) {
                    AnonymousClass006.A1F(str2, str2, arrayListA0h);
                }
                Iterator it = arrayListA0h.iterator();
                while (it.hasNext()) {
                    AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass005.A0j(it), null, 0L, C3cH.A0E(bfm, AuraTheme.INSTANCE), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                }
                BBI.A0R(bbi, false);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108462(shopifyCheckoutApproval, bRg2, i, i2);
        }
    }

    public static final void LodgingCheckoutCancellation(CheckoutLodgingCancellation checkoutLodgingCancellation, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass1;
        String strA01;
        BBI bbiA07;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(checkoutLodgingCancellation, 0);
        bfm.AgG(1688331536);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(checkoutLodgingCancellation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HotelCheckoutRefundability refundability = HotelCheckoutFormattingKt.getRefundability(checkoutLodgingCancellation);
            if (refundability instanceof HotelCheckoutRefundability.FullyRefundable) {
                bfm.AgE(-1276912135);
                String str = ((HotelCheckoutRefundability.FullyRefundable) refundability).until;
                if (str == null) {
                    bbiA07 = AnonymousClass002.A0M(bfm, -1276894187);
                } else {
                    bfm.AgE(-1276894186);
                    Locale locale = Locale.getDefault();
                    C7384Etj.A0U(locale);
                    strA01 = AnonymousClass001.A0t(bfm, HotelCheckoutFormattingKt.hotelCheckoutDeadline(str, locale), R.string._name_removed__res_0x7f120108);
                    bbiA07 = C3cG.A07(bfm);
                    if (strA01 != null) {
                        bfm.AgE(-1011022039);
                    }
                    BBI.A0R(bbiA07, false);
                }
                bfm.AgE(-1011015436);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120107);
                BBI.A0R(bbiA07, false);
            } else if (refundability instanceof HotelCheckoutRefundability.FullRefundBefore) {
                bfm.AgE(-1011010892);
                String str2 = ((HotelCheckoutRefundability.FullRefundBefore) refundability).deadline;
                Locale locale2 = Locale.getDefault();
                C7384Etj.A0U(locale2);
                strA01 = AnonymousClass001.A0t(bfm, HotelCheckoutFormattingKt.hotelCheckoutDeadline(str2, locale2), R.string._name_removed__res_0x7f120106);
            } else {
                if (!C7384Etj.areEqual(refundability, HotelCheckoutRefundability.NonRefundable.INSTANCE)) {
                    if (refundability != null) {
                        throw AnonymousClass005.A0k(bfm, -1011025517);
                    }
                    AnonymousClass003.A0l(bfm, -1276261972);
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        anonymousClass1 = new LodgingCheckoutRowsKt$LodgingCheckoutCancellation$text$2(checkoutLodgingCancellation, function0, bRg2, i, i2);
                        C3cG.A1D(bBbAAc, anonymousClass1);
                    }
                    return;
                }
                bfm.AgE(-1011003662);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120109);
            }
            BBI bbiA072 = C3cG.A07(bfm);
            if (HotelCheckoutFormattingKt.getPartialRefundPolicy(checkoutLodgingCancellation) == null || function0 == null) {
                bfm.AgE(-1276163950);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0R(bRg2), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(-1010991635);
                LodgingCheckoutRefundPolicyLine(strA01, function0, bRg2, bfm, iA05 & 1008, 0);
            }
            BBI.A0R(bbiA072, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(checkoutLodgingCancellation, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [X.B0A] */
    /* JADX WARN: Type inference failed for: r22v1, types: [X.ApY] */
    /* JADX WARN: Type inference failed for: r28v1, types: [X.G0U] */
    /* JADX WARN: Type inference failed for: r29v1, types: [X.ArU] */
    /* JADX WARN: Type inference failed for: r30v1, types: [X.013] */
    public static final void LodgingCheckoutPriceLine(LodgingPriceLine lodgingPriceLine, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822ArmA0B;
        long jA07;
        BRg bRg2;
        BRg bRg3 = bRg;
        bfm.AgG(-393664408);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(lodgingPriceLine, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            int iOrdinal = lodgingPriceLine.style.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-354366950);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            } else if (iOrdinal == 1) {
                bfm.AgE(-354364547);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = auraTheme.getTypography(bfm, 6).subheadlineEmphasized;
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass005.A0k(bfm, -354369115);
                }
                bfm.AgE(-354361993);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C3cH.A0E(bfm, auraTheme);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (lodgingPriceLine.style == LodgingPriceStyle.TOTAL) {
                bfm.AgE(-354358669);
                jA07 = C3cH.A06(bfm, auraTheme);
            } else {
                bfm.AgE(-354357387);
                jA07 = C3cH.A07(bfm, auraTheme);
            }
            BBI.A0R(bbiA07, false);
            BRg bRgA0R = AnonymousClass001.A0R(bRg3);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strLodgingPriceLabel = lodgingPriceLabel(lodgingPriceLine.label, bfm, 0);
            if (lodgingPriceLine.taxesInfo) {
                bRg2 = null;
                HotelTaxesInfoLabelKt.m1099HotelTaxesInfoLabelT042LqI(strLodgingPriceLabel, c1822ArmA0B, jA07, function0, AnonymousClass001.A0O(c90m, C3cG.A09(bfm, -1395988458), true), bfm, (iA05 << 6) & 7168, 0);
                BBI.A0R(bbiA07, false);
            } else {
                bRg2 = null;
                AuraTextKt.m2639AuraTextUY9GdpU(strLodgingPriceLabel, AnonymousClass001.A0O(c90m, C3cG.A09(bfm, -325885598), true), jA07, c1822ArmA0B, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbiA07, false);
            }
            String strA01 = lodgingPriceLine.amount;
            if (strA01 == null) {
                bfm.AgE(-1395981650);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200fd);
            } else {
                bfm.AgE(-1395982115);
            }
            BBI.A0R(bbiA07, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, bRg2, jA07, c1822ArmA0B, bRg2, bRg2, C3cH.A0F(6), false, 0, 0, 0, bRg2, bRg2, bRg2, bfm, 0, 0, 16306);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108472(lodgingPriceLine, function0, bRg3, i, i2);
        }
    }

    public static final void LodgingCheckoutRefundPolicyLine(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-604434801);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12010f);
            String strA0w = AnonymousClass006.A0w(bfm, str, strA01, R.string._name_removed__res_0x7f12010e);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).accent;
            boolean zA1K = AnonymousClass003.A1K(bfm, strA0w, strA01) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0X = AnonymousClass006.A0X(strA0w);
                C7384Etj.A0Y(strA0w, 0);
                int iA0C = C7BY.A0C(strA0w, strA01, strA0w.length() - 1, false);
                if (iA0C >= 0) {
                    long j2 = C1809ArT.A01;
                    c1731ApSA0X.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07), iA0C, strA01.length() + iA0C);
                }
                objAaT = c1731ApSA0X.A04();
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, C0v5.A05(AnonymousClass001.A0R(bRg2), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120110), function0, true), C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32752);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108491(str, function0, bRg2, i, i2);
        }
    }

    public static final String lodgingPriceLabel(LodgingPriceLabel lodgingPriceLabel, BFM bfm, int i) {
        int i2;
        String strA0t;
        BBI bbiA07;
        if (lodgingPriceLabel instanceof LodgingPriceLabel.Provided) {
            AnonymousClass004.A1A(bfm, -2106111144);
            return ((LodgingPriceLabel.Provided) lodgingPriceLabel).text;
        }
        if (lodgingPriceLabel instanceof LodgingPriceLabel.Nights) {
            bfm.AgE(-2106109338);
            strA0t = AnonymousClass007.A0Y(((LodgingPriceLabel.Nights) lodgingPriceLabel).count, bfm, R.plurals._name_removed__res_0x7f100005);
        } else {
            if (C7384Etj.areEqual(lodgingPriceLabel, LodgingPriceLabel.BaseRate.INSTANCE)) {
                bfm.AgE(-2106103567);
                i2 = R.string._name_removed__res_0x7f1200fe;
            } else if (C7384Etj.areEqual(lodgingPriceLabel, LodgingPriceLabel.TaxesAndFees.INSTANCE)) {
                bfm.AgE(-2106099978);
                i2 = R.string._name_removed__res_0x7f120111;
            } else if (C7384Etj.areEqual(lodgingPriceLabel, LodgingPriceLabel.PropertyFees.INSTANCE)) {
                bfm.AgE(-2106096235);
                i2 = R.string._name_removed__res_0x7f12010d;
            } else if (lodgingPriceLabel instanceof LodgingPriceLabel.Total) {
                bfm.AgE(-864359019);
                String str = ((LodgingPriceLabel.Total) lodgingPriceLabel).currency;
                if (str == null) {
                    bbiA07 = AnonymousClass002.A0M(bfm, -864345628);
                } else {
                    bfm.AgE(-864345627);
                    strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120112);
                    bbiA07 = C3cG.A07(bfm);
                    if (strA0t != null) {
                        bfm.AgE(-2106092531);
                    }
                    BBI.A0R(bbiA07, false);
                }
                bfm.AgE(-2106088656);
                strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120099);
                BBI.A0R(bbiA07, false);
            } else if (C7384Etj.areEqual(lodgingPriceLabel, LodgingPriceLabel.PayNow.INSTANCE)) {
                bfm.AgE(-2106085617);
                i2 = R.string._name_removed__res_0x7f12010a;
            } else {
                if (!C7384Etj.areEqual(lodgingPriceLabel, LodgingPriceLabel.DueAtProperty.INSTANCE)) {
                    throw AnonymousClass005.A0k(bfm, -2106112020);
                }
                bfm.AgE(-2106082049);
                i2 = R.string._name_removed__res_0x7f12010b;
            }
            strA0t = AbstractC2271BQs.A01(bfm, i2);
        }
        AnonymousClass001.A1D(bfm);
        return strA0t;
    }
}
