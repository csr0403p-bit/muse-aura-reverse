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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C0881AGi;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1YD;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ReservationCheckoutApprovalCardKt {

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutApprovalCardKt$ReservationCheckoutApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.ReservationCheckoutApproval $checkout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$checkout = reservationCheckoutApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            String strTrimToNonEmpty;
            String str;
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String str2 = this.$approval.iconUrl;
            if (str2 == null || (strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) == null) {
                HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant = this.$checkout.merchant;
                strTrimToNonEmpty = (checkoutMerchant == null || (str = checkoutMerchant.iconUrl) == null) ? null : CheckoutRowPrimitivesKt.trimToNonEmpty(str);
            }
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
            int i2 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            CheckoutApprovalSharedKt.CheckoutFaviconHeader(strTrimToNonEmpty, CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, null, bfm, i2, 6), bfm, i2), null, bfm, 0, 4);
            AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$approval.reviewText, null, false, bfm, 384, 2);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutApprovalCardKt$ReservationCheckoutApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ CheckoutLegalPresentation $legal;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CheckoutLegalPresentation checkoutLegalPresentation) {
            super(3);
            this.$legal = checkoutLegalPresentation;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                CheckoutApprovalLegalTextKt.CheckoutApprovalLegalFooter(this.$legal, null, bfm, 0, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutApprovalCardKt$ReservationCheckoutApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.ReservationCheckoutApproval $checkout;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, RichApprovalSurface richApprovalSurface) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$checkout = reservationCheckoutApproval;
            this.$surface = richApprovalSurface;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ReservationCheckoutApprovalCardKt.ReservationCheckoutReceipt(this.$approval, this.$checkout, this.$surface.screen, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | (HatchAgentPermissionsRepository.ReservationCheckoutApproval.$stable << 3), 8);
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

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutApprovalCardKt$ReservationCheckoutApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.ReservationCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = reservationCheckoutApproval;
            this.$surface = richApprovalSurface;
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
            ReservationCheckoutApprovalCardKt.ReservationCheckoutApprovalCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$2, reason: invalid class name and case insensitive filesystem */
    public final class C108542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.ReservationCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchScreen $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108542(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, HatchScreen hatchScreen, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = reservationCheckoutApproval;
            this.$screen = hatchScreen;
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
            ReservationCheckoutApprovalCardKt.ReservationCheckoutReceipt(this.$approval, this.$checkout, this.$screen, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ReservationCheckoutApprovalCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(agentPermissionApproval, reservationCheckoutApproval, richApprovalSurface);
        bfm.AgG(160689219);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(reservationCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(richApprovalSurface, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A65(reservationCheckoutApproval))) {
                z = true;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                HatchAgentPermissionsRepository.CheckoutMerchant checkoutMerchant = reservationCheckoutApproval.merchant;
                objAaT = CheckoutApprovalPresentationKt.merchantCheckoutLegalPresentation(checkoutMerchant != null ? checkoutMerchant.name : null, reservationCheckoutApproval.legalLinks);
                bfm.Ai0(objAaT);
            }
            ApprovalCardScaffoldKt.ApprovalCardScaffold(agentPermissionApproval.decisionOptions, richApprovalSurface, B1V.A00(bfm, new AnonymousClass1(agentPermissionApproval, reservationCheckoutApproval), 268857323), bRg2, null, B1V.A00(bfm, new AnonymousClass2((CheckoutLegalPresentation) objAaT), -1245845714), B1V.A00(bfm, new AnonymousClass3(agentPermissionApproval, reservationCheckoutApproval, richApprovalSurface), -319090961), bfm, C3cJ.A01(iA05), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, reservationCheckoutApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void ReservationCheckoutReceipt(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, HatchScreen hatchScreen, BRg bRg, BFM bfm, int i, int i2) {
        Function0 function0;
        Function0 function02;
        BRg bRg2 = bRg;
        bfm.AgG(-1419621090);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(reservationCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass005.A0A(bfm, hatchScreen);
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1R = AnonymousClass001.A1R(bfm, localeA0b, i4 == 32 || ((iA05 & 64) != 0 && bfm.A65(reservationCheckoutApproval)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                CheckoutAmountLabel checkoutAmountLabel = CheckoutAmountLabel.PROVIDED;
                String str = ((HatchAgentPermissionsRepository.ReservationCheckoutTotal) AbstractC0878AGe.A0H(reservationCheckoutApproval.totals)).displayText;
                C7384Etj.A0X(localeA0b);
                objAaT = new CheckoutAmountPresentation(checkoutAmountLabel, str, ReservationCheckoutFormattingKt.formattedAmount(reservationCheckoutApproval, localeA0b), reservationCheckoutApproval.currency.getCurrencyCode(), false, CheckoutAmountLayout.WRAPPING, true, false, C0881AGi.A00);
                bfm.Ai0(objAaT);
            }
            CheckoutAmountPresentation checkoutAmountPresentation = (CheckoutAmountPresentation) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = C1b8.A01(C11U.A03(bRg2.then(c1062ATq), CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0D);
            String str2 = reservationCheckoutApproval.title;
            String str3 = reservationCheckoutApproval.subtitle;
            if (reservationCheckoutApproval.hasDetails) {
                bfm.AgE(1735989486);
                boolean zA1V = AnonymousClass002.A1V(bfm, auraNavigatorA0b, AnonymousClass004.A1K(iA05), (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
                Object objAaT2 = bfm.AaT();
                if (zA1V || objAaT2 == C78N.A00) {
                    objAaT2 = new ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$1$1(hatchScreen, agentPermissionApproval, auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                function0 = (Function0) objAaT2;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1736345365);
                BBI.A0R(bbi, false);
                function0 = null;
            }
            CheckoutRowPrimitivesKt.CheckoutTextRow(str2, str3, null, Integer.MAX_VALUE, function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120127), bfm, 3072, 4);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            AuraDividerKt.AuraRowDivider(C3U4.A0B(bs0, f, 0.0f), bfm, 0, 0);
            if (reservationCheckoutApproval.hasPriceBreakdown) {
                boolean zA1Z = AnonymousClass001.A1Z(auraNavigatorA0b, bfm, 1736624273) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
                Object objAaT3 = bfm.AaT();
                if (zA1Z || objAaT3 == C78N.A00) {
                    objAaT3 = new ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$2$1(auraNavigatorA0b, agentPermissionApproval);
                    bfm.Ai0(objAaT3);
                }
                function02 = (Function0) objAaT3;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1736731253);
                BBI.A0R(bbi, false);
                function02 = null;
            }
            CheckoutAmountRowKt.CheckoutAmountRow(checkoutAmountPresentation, null, function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f5), null, bfm, CheckoutAmountPresentation.$stable, 18);
            AuraDividerKt.AuraRowDivider(C3U4.A0B(bs0, f, 0.0f), bfm, 0, 0);
            String str4 = reservationCheckoutApproval.cardBrand;
            String str5 = reservationCheckoutApproval.cardLast4;
            String str6 = reservationCheckoutApproval.paymentMethodLabel;
            HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = reservationCheckoutApproval.getPaymentSelection();
            String str7 = paymentSelection != null ? paymentSelection.paymentMethod : null;
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1V2 = AnonymousClass002.A1V(bfm, auraNavigatorA0b, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)), AnonymousClass004.A1K(iA05)) | (i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(reservationCheckoutApproval)));
            Object objAaT4 = bfm.AaT();
            if (zA1V2 || objAaT4 == C78N.A00) {
                objAaT4 = new ReservationCheckoutApprovalCardKt$ReservationCheckoutReceipt$1$3$1(hatchScreen, agentPermissionApproval, auraNavigatorA0b, reservationCheckoutApproval);
                bfm.Ai0(objAaT4);
            }
            CheckoutApprovalSharedKt.CheckoutPaymentRow(str4, str5, str6, str7, C3U4.A0B(C0v5.A04(c1062ATq, c1ydA0A, null, (Function0) objAaT4, true), f, AuraDimensKt.SpacingSmall), false, bfm, 0, 32);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108542(agentPermissionApproval, reservationCheckoutApproval, hatchScreen, bRg2, i, i2);
        }
    }
}
