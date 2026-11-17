package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.ApQ;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C0v5;
import X.C11U;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightCheckoutApprovalCardKt {

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ String $recordIconUrl;
        public final /* synthetic */ String $reviewText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, ApQ apQ, String str, String str2) {
            super(3);
            this.$checkout = flightCheckoutApproval;
            this.$headline = apQ;
            this.$recordIconUrl = str;
            this.$reviewText = str2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
            } else {
                FlightCheckoutApprovalCardKt.FlightCheckoutHeader(this.$checkout, this.$headline, this.$recordIconUrl, null, bfm, HatchAgentPermissionsRepository.FlightCheckoutApproval.$stable, 8);
                AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$reviewText, null, false, bfm, 0, 6);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval) {
            super(3);
            this.$checkout = flightCheckoutApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                FlightCheckoutApprovalCardKt.FlightCheckoutLegalFooter(this.$checkout, null, bfm, HatchAgentPermissionsRepository.FlightCheckoutApproval.$stable, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ G0U<Integer, Unit> $onShowLeg;
        public final /* synthetic */ Function0<Unit> $onShowPassengers;
        public final /* synthetic */ Function0<Unit> $onShowSummary;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            FlightCheckoutApprovalCardKt.FlightCheckoutDetails(this.$checkout, this.$onShowSummary, this.$onShowLeg, this.$onShowPassengers, null, bfm, HatchAgentPermissionsRepository.FlightCheckoutApproval.$stable, 16);
            HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval = this.$checkout;
            String str = flightCheckoutApproval.cardBrand;
            String str2 = flightCheckoutApproval.cardLast4;
            String str3 = flightCheckoutApproval.paymentMethodLabel;
            HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = flightCheckoutApproval.getPaymentSelection();
            CheckoutApprovalSharedKt.CheckoutPaymentRow(str, str2, str3, paymentSelection != null ? paymentSelection.paymentMethod : null, C3U4.A09(C0v5.A04(C1b8.A01(C11U.A03(BRg.A00, CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground), C3cG.A0A(0), null, this.$onShowDetails, true), AuraDimensKt.SpacingMedium), false, bfm, 0, 32);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, Function0<Unit> function0, G0U<? super Integer, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03) {
            super(3);
            this.$checkout = flightCheckoutApproval;
            this.$onShowSummary = function0;
            this.$onShowLeg = g0u;
            this.$onShowPassengers = function02;
            this.$onShowDetails = function03;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $decisionOptions;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ G0U<Integer, Unit> $onShowLeg;
        public final /* synthetic */ Function0<Unit> $onShowPassengers;
        public final /* synthetic */ Function0<Unit> $onShowSummary;
        public final /* synthetic */ String $recordIconUrl;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, ApQ apQ, String str, String str2, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, Function0<Unit> function02, G0U<? super Integer, Unit> g0u, Function0<Unit> function03, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$checkout = flightCheckoutApproval;
            this.$headline = apQ;
            this.$reviewText = str;
            this.$recordIconUrl = str2;
            this.$decisionOptions = list;
            this.$surface = richApprovalSurface;
            this.$onShowDetails = function0;
            this.$onShowSummary = function02;
            this.$onShowLeg = g0u;
            this.$onShowPassengers = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutApprovalCardKt.FlightCheckoutApprovalCard(this.$checkout, this.$headline, this.$reviewText, this.$recordIconUrl, this.$decisionOptions, this.$surface, this.$onShowDetails, this.$onShowSummary, this.$onShowLeg, this.$onShowPassengers, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutDetails$2, reason: invalid class name and case insensitive filesystem */
    public final class C108292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Integer, Unit> $onShowLeg;
        public final /* synthetic */ Function0<Unit> $onShowPassengers;
        public final /* synthetic */ Function0<Unit> $onShowSummary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108292(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, Function0<Unit> function0, G0U<? super Integer, Unit> g0u, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = flightCheckoutApproval;
            this.$onShowSummary = function0;
            this.$onShowLeg = g0u;
            this.$onShowPassengers = function02;
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
            FlightCheckoutApprovalCardKt.FlightCheckoutDetails(this.$checkout, this.$onShowSummary, this.$onShowLeg, this.$onShowPassengers, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C108301 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $recordIconUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108301(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, ApQ apQ, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = flightCheckoutApproval;
            this.$headline = apQ;
            this.$recordIconUrl = str;
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
            FlightCheckoutApprovalCardKt.FlightCheckoutHeader(this.$checkout, this.$headline, this.$recordIconUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt$FlightCheckoutLegalFooter$1, reason: invalid class name and case insensitive filesystem */
    public final class C108311 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108311(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = flightCheckoutApproval;
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
            FlightCheckoutApprovalCardKt.FlightCheckoutLegalFooter(this.$checkout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightCheckoutHeader(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, ApQ apQ, String str, BRg bRg, BFM bfm, int i, int i2) {
        String str2;
        String strCheckoutFaviconUri;
        String str3;
        BRg bRg2 = bRg;
        bfm.AgG(2030978302);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(flightCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, apQ);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant = flightCheckoutApproval.merchant;
            if (checkoutMerchant == null || (str3 = checkoutMerchant.iconUrl) == null || (strCheckoutFaviconUri = CheckoutRowPrimitivesKt.trimToNonEmpty(str3)) == null) {
                String str4 = null;
                if (str == null || (strCheckoutFaviconUri = CheckoutRowPrimitivesKt.trimToNonEmpty(str)) == null) {
                    HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant2 = flightCheckoutApproval.merchant;
                    if (checkoutMerchant2 != null) {
                        str2 = checkoutMerchant2.url;
                        str4 = checkoutMerchant2.name;
                    } else {
                        str2 = null;
                    }
                    strCheckoutFaviconUri = CheckoutApprovalSharedKt.checkoutFaviconUri(str2, str4);
                }
            }
            CheckoutApprovalSharedKt.CheckoutFaviconHeader(strCheckoutFaviconUri, apQ, bRg2, bfm, (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA05 >> 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108301(flightCheckoutApproval, apQ, str, bRg2, i, i2);
        }
    }

    public static final String flightApprovalTitleSentence(String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        String strAgentPermissionAgentName = AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0);
        if (str != null) {
            bfm.AgE(1916978188);
            i2 = R.string._name_removed__res_0x7f1200f1;
            objArr = new Object[]{strAgentPermissionAgentName, str};
        } else {
            bfm.AgE(1916980970);
            i2 = R.string._name_removed__res_0x7f1200f2;
            objArr = new Object[]{strAgentPermissionAgentName};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }

    /* renamed from: flightLegalText-XO-JAsU, reason: not valid java name */
    public static final ApQ m192flightLegalTextXOJAsU(List<LegalLink> list, String str, long j, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        List listA0a = AbstractC0878AGe.A0a(list, 3);
        int size = listA0a.size();
        if (size == 0) {
            bfm.AgE(1844429235);
            i2 = R.string._name_removed__res_0x7f1200e0;
            objArr = new Object[]{HatchAppName.value, str};
        } else if (size == 1) {
            bfm.AgE(1844434738);
            i2 = R.string._name_removed__res_0x7f1200e1;
            objArr = new Object[]{HatchAppName.value, str, C3cI.A0d(listA0a, 0)};
        } else if (size != 2) {
            bfm.AgE(1844448852);
            i2 = R.string._name_removed__res_0x7f1200e2;
            objArr = new Object[]{HatchAppName.value, str, C3cI.A0d(listA0a, 0), C3cI.A0d(listA0a, 1), C3cI.A0d(listA0a, 2)};
        } else {
            bfm.AgE(1844441234);
            i2 = R.string._name_removed__res_0x7f1200e3;
            objArr = new Object[]{HatchAppName.value, str, C3cI.A0d(listA0a, 0), C3cI.A0d(listA0a, 1)};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(strA02, listA0a, j, bfm, i & 896);
    }

    public static final String flightSliceSubtitle(HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightCheckoutSlice, 0);
        String strA0a = C3cI.A0a(flightCheckoutSlice.departureDisplay);
        String str = flightCheckoutSlice.stopsDisplay;
        String strTrimToNonEmpty = str != null ? CheckoutRowPrimitivesKt.trimToNonEmpty(str) : null;
        if (strA0a == null || strTrimToNonEmpty == null) {
            AnonymousClass003.A0l(bfm, 713850386);
            return strA0a == null ? strTrimToNonEmpty : strA0a;
        }
        bfm.AgE(300119089);
        return C3cJ.A0H(bfm, strA0a, strTrimToNonEmpty, R.string._name_removed__res_0x7f1200de);
    }

    public static final String flightSliceTitle(HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, BFM bfm, int i) {
        C7384Etj.A0Y(flightCheckoutSlice, 0);
        String strA0a = C3cI.A0a(flightCheckoutSlice.originDisplayName);
        String strA0a2 = C3cI.A0a(flightCheckoutSlice.destinationDisplayName);
        if (strA0a != null && strA0a2 != null) {
            bfm.AgE(1584724741);
            return C3cJ.A0H(bfm, strA0a, strA0a2, R.string._name_removed__res_0x7f1200ed);
        }
        AnonymousClass003.A0l(bfm, 1881928924);
        String str = flightCheckoutSlice.title;
        if (str != null) {
            return CheckoutRowPrimitivesKt.trimToNonEmpty(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlightCheckoutDetails(com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutApproval r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.G0U<? super java.lang.Integer, kotlin.Unit> r20, kotlin.jvm.functions.Function0<kotlin.Unit> r21, X.BRg r22, X.BFM r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt.FlightCheckoutDetails(com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutApproval, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    public static final String flightDisclosureMerchantName(String str, BFM bfm, int i) {
        if (str == null) {
            bfm.AgE(-2030631803);
            str = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200df);
        } else {
            bfm.AgE(-2030632764);
        }
        AnonymousClass002.A19(bfm);
        return str;
    }

    public static final void FlightCheckoutLegalFooter(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1750148995);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(flightCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            List<HatchAgentPermissionsRepository.CheckoutLegalLink> list = flightCheckoutApproval.legalLinks;
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchAgentPermissionsRepository.CheckoutLegalLink checkoutLegalLink : list) {
                String strA0a = C3cI.A0a(checkoutLegalLink.label);
                String strA0a2 = C3cI.A0a(checkoutLegalLink.url);
                if (strA0a != null && strA0a2 != null) {
                    arrayListA0h.add(new LegalLink(strA0a, strA0a2));
                }
            }
            CheckoutRowPrimitivesKt.CheckoutLegalFooter(m192flightLegalTextXOJAsU(arrayListA0h, flightDisclosureMerchantName(flightCheckoutApproval.getMerchantDisplayName(), bfm, 0), C3cH.A0W(bfm).accent, bfm, 0), bRg, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108311(flightCheckoutApproval, bRg, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void FlightCheckoutApprovalCard(com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutApproval r23, X.ApQ r24, java.lang.String r25, java.lang.String r26, java.util.List<com.facebook.aura.gateway.AgentPermissionDecisionOption> r27, com.facebook.aura.agentpermission.RichApprovalSurface r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, X.G0U<? super java.lang.Integer, kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, X.BRg r33, X.BFM r34, int r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.FlightCheckoutApprovalCardKt.FlightCheckoutApprovalCard(com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutApproval, X.ApQ, java.lang.String, java.lang.String, java.util.List, com.facebook.aura.agentpermission.RichApprovalSurface, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }
}
