package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1731ApS;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1D3;
import X.C1D8;
import X.C1OR;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class StripeLinkCheckoutApprovalCardKt {
    public static final String STRIPE_LINK_SEE_DETAILS_ANNOTATION = "stripe_link_see_details";
    public static final C1D3 StripeLinkCheckoutPaymentRowShape = C1D8.A00(22.0f);

    /* renamed from: com.facebook.aura.agentpermission.StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.StripeLinkCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ String $reviewText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, ApQ apQ, String str, Function0<Unit> function0, String str2) {
            super(3);
            this.$checkout = stripeLinkCheckoutApproval;
            this.$headline = apQ;
            this.$narrative = str;
            this.$onShowDetails = function0;
            this.$reviewText = str2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
            } else {
                StripeLinkCheckoutApprovalCardKt.StripeLinkCheckoutHeader(this.$checkout, this.$headline, this.$narrative, this.$onShowDetails, null, bfm, HatchAgentPermissionsRepository.StripeLinkCheckoutApproval.$stable, 16);
                AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$reviewText, null, false, bfm, 0, 6);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.StripeLinkCheckoutApproval $checkout;
        public final /* synthetic */ Function0<Unit> $onShowPayment;
        public final /* synthetic */ String $totalPromoCaption;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval = this.$checkout;
            String str = stripeLinkCheckoutApproval.cardBrand;
            String str2 = stripeLinkCheckoutApproval.cardLast4;
            String str3 = stripeLinkCheckoutApproval.paymentMethodLabel;
            HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = stripeLinkCheckoutApproval.getPaymentSelection();
            CheckoutApprovalSharedKt.CheckoutPaymentRow(str, str2, str3, paymentSelection != null ? paymentSelection.paymentMethod : null, C3U4.A09(C0v5.A04(C1b8.A01(C11U.A03(BRg.A00, StripeLinkCheckoutApprovalCardKt.StripeLinkCheckoutPaymentRowShape), AuraTheme.INSTANCE.getColors(bfm, 6).secondaryButtonBackground), C3cG.A0A(0), null, this.$onShowPayment, true), AuraDimensKt.SpacingMedium), false, bfm, 0, 32);
            HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval2 = this.$checkout;
            CheckoutApprovalSharedKt.CheckoutMaxTotal(CheckoutApprovalSharedKt.checkoutFormattedAmount(stripeLinkCheckoutApproval2.amount, stripeLinkCheckoutApproval2.currency), null, null, CheckoutApprovalSharedKt.gatedTotalPromoCaption(this.$totalPromoCaption), bfm, 0, 6);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, Function0<Unit> function0, String str) {
            super(3);
            this.$checkout = stripeLinkCheckoutApproval;
            this.$onShowPayment = function0;
            this.$totalPromoCaption = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.StripeLinkCheckoutApproval $checkout;
        public final /* synthetic */ List<AgentPermissionDecisionOption> $decisionOptions;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ Function0<Unit> $onShowPayment;
        public final /* synthetic */ String $reviewText;
        public final /* synthetic */ RichApprovalSurface $surface;
        public final /* synthetic */ String $totalPromoCaption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, ApQ apQ, String str, String str2, String str3, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = stripeLinkCheckoutApproval;
            this.$headline = apQ;
            this.$narrative = str;
            this.$reviewText = str2;
            this.$totalPromoCaption = str3;
            this.$decisionOptions = list;
            this.$surface = richApprovalSurface;
            this.$onShowDetails = function0;
            this.$onShowPayment = function02;
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
            StripeLinkCheckoutApprovalCardKt.StripeLinkCheckoutApprovalCard(this.$checkout, this.$headline, this.$narrative, this.$reviewText, this.$totalPromoCaption, this.$decisionOptions, this.$surface, this.$onShowDetails, this.$onShowPayment, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C108562 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.StripeLinkCheckoutApproval $checkout;
        public final /* synthetic */ ApQ $headline;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $narrative;
        public final /* synthetic */ Function0<Unit> $onShowDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108562(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, ApQ apQ, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = stripeLinkCheckoutApproval;
            this.$headline = apQ;
            this.$narrative = str;
            this.$onShowDetails = function0;
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
            StripeLinkCheckoutApprovalCardKt.StripeLinkCheckoutHeader(this.$checkout, this.$headline, this.$narrative, this.$onShowDetails, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutSubtitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C108572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowDetails;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108572(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$subtitle = str;
            this.$onShowDetails = function0;
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
            StripeLinkCheckoutApprovalCardKt.StripeLinkCheckoutSubtitle(this.$subtitle, this.$onShowDetails, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final String stripeLinkCheckoutSubtitle(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, BFM bfm, int i) {
        String strA0l;
        String strA0l2;
        int i2;
        Object[] objArr;
        C7384Etj.A0Y(stripeLinkCheckoutApproval, 0);
        String str = stripeLinkCheckoutApproval.paymentMethodLabel;
        String strA02 = null;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            strA0l = null;
        }
        String str2 = stripeLinkCheckoutApproval.cardLast4;
        if (str2 == null || (strA0l2 = AnonymousClass002.A0l(str2)) == null || C7BY.A0j(strA0l2)) {
            strA0l2 = null;
        }
        if (strA0l != null) {
            if (strA0l2 != null) {
                bfm.AgE(-1681976155);
                i2 = R.string._name_removed__res_0x7f120146;
                objArr = new Object[]{strA0l, strA0l2};
            } else {
                bfm.AgE(-1681972308);
                i2 = R.string._name_removed__res_0x7f120147;
                objArr = new Object[]{strA0l};
            }
        } else {
            if (strA0l2 == null) {
                bfm.AgE(-601241231);
                AnonymousClass001.A1D(bfm);
                return strA02;
            }
            bfm.AgE(-1681967252);
            i2 = R.string._name_removed__res_0x7f120148;
            objArr = new Object[]{strA0l2};
        }
        strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }

    public static final void StripeLinkCheckoutHeader(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, ApQ apQ, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(860287227);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(stripeLinkCheckoutApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, apQ);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, c1062ATq);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutHeader$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA06, c1822ArmA0B, null, null, null, 0L, false, 0, 0, 0, null, null, null, bfm, (iA05 >> 3) & 14, 0, 32752);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            CheckoutApprovalSharedKt.CheckoutMerchantFavicon(CheckoutApprovalSharedKt.checkoutFaviconUri(stripeLinkCheckoutApproval.merchantUrl, null), null, bfm, 0, 2);
            BBI.A0R(bbi, true);
            StripeLinkCheckoutSubtitle(str, function0, null, bfm, (iA05 >> 6) & 126, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108562(stripeLinkCheckoutApproval, apQ, str, function0, bRg2, i, i2);
        }
    }

    public static final void StripeLinkCheckoutSubtitle(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0l;
        BRg bRg2 = bRg;
        bfm.AgG(705847589);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120127);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).link;
            boolean zA1R = AnonymousClass001.A1R(bfm, strA01, AnonymousClass003.A1B(iA0d)) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                C1731ApS c1731ApS = new C1731ApS(16);
                if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && !C7BY.A0j(strA0l)) {
                    c1731ApS.A0E(strA0l);
                    c1731ApS.A0E(InviteCodeScratcherKt.CODE_SEPARATOR);
                }
                StringBuilder sb = c1731ApS.A00;
                int length = sb.length();
                c1731ApS.A0E(strA01);
                C1736ApY c1736ApY = C1736ApY.A01;
                long j2 = C1809ArT.A01;
                c1731ApS.A0A(new C1824Aro(null, null, null, null, null, c1736ApY, null, null, null, null, null, j, j2, j2, B6A.A07), length, sb.length());
                c1731ApS.A0B(new C1OR(STRIPE_LINK_SEE_DETAILS_ANNOTATION), length, sb.length());
                objAaT = c1731ApS.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA65 = bfm.A65(apQ) | AnonymousClass006.A1V(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new StripeLinkCheckoutApprovalCardKt$StripeLinkCheckoutSubtitle$1$1(apQ, function0);
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2638AuraClickableTextZsD2BWI(apQ, bRgA0R, (G0U) objAaT2, null, null, null, false, jA07, c1822ArmA0E, null, null, C3cH.A0F(5), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 1046136);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108572(str, function0, bRg2, i, i2);
        }
    }

    public static final void StripeLinkCheckoutApprovalCard(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, ApQ apQ, String str, String str2, String str3, List<AgentPermissionDecisionOption> list, RichApprovalSurface richApprovalSurface, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        int iA0b;
        BRg bRg2 = bRg;
        AnonymousClass003.A0u(stripeLinkCheckoutApproval, apQ);
        AnonymousClass005.A0z(list, richApprovalSurface, function0);
        C7384Etj.A0Y(function02, 8);
        bfm.AgG(80101321);
        if ((i & 6) == 0) {
            iA0b = AnonymousClass002.A05(AnonymousClass004.A1X(stripeLinkCheckoutApproval, bfm, i) ? 1 : 0) | i;
        } else {
            iA0b = i;
        }
        if ((i & 48) == 0) {
            iA0b |= AnonymousClass004.A0e(bfm, apQ);
        }
        if ((i & 384) == 0) {
            iA0b |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0b |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0b |= AnonymousClass004.A0h(bfm, str3);
        }
        if ((196608 & i) == 0) {
            iA0b |= AnonymousClass002.A02(AnonymousClass004.A1R(bfm, list, 262144, i) ? 1 : 0);
        }
        if ((1572864 & i) == 0) {
            iA0b |= AnonymousClass002.A01(AnonymousClass004.A1R(bfm, richApprovalSurface, 2097152, i) ? 1 : 0);
        }
        if ((12582912 & i) == 0) {
            iA0b |= AnonymousClass004.A0a(bfm, function0);
        }
        if ((100663296 & i) == 0) {
            iA0b |= AnonymousClass004.A0b(bfm, function02);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0b |= iA0m;
        } else if ((805306368 & i) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0b |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0b), bfm, iA0b)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0b >> 15;
            BRg bRg3 = bRg2;
            ApprovalCardScaffoldKt.ApprovalCardScaffold(list, richApprovalSurface, B1V.A00(bfm, new AnonymousClass1(stripeLinkCheckoutApproval, apQ, str, function0, str2), -60171487), bRg3, null, null, B1V.A00(bfm, new AnonymousClass2(stripeLinkCheckoutApproval, function02, str3), 1878375837), bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 1573248 | (RichApprovalSurface.$stable << 3) | ((iA0b >> 18) & 7168), 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(stripeLinkCheckoutApproval, apQ, str, str2, str3, list, richApprovalSurface, function0, function02, bRg2, i, i2);
        }
    }
}
