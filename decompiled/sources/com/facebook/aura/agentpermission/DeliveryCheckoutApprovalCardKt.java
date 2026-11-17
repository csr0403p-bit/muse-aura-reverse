package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C3cJ;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.DeliveryCheckoutApproval;
import com.facebook.aura.gateway.DeliveryCheckoutPayment;
import com.facebook.aura.gateway.DeliveryCheckoutStop;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class DeliveryCheckoutApprovalCardKt {

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutApprovalCardKt$DeliveryCheckoutApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, DeliveryCheckoutApproval deliveryCheckoutApproval) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$checkout = deliveryCheckoutApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            CheckoutApprovalSharedKt.CheckoutFaviconHeader(this.$approval.iconUrl, CheckoutApprovalSharedKt.checkoutApprovalTitleWithLabel(AnonymousClass006.A0w(bfm, AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0), this.$checkout.providerName, R.string._name_removed__res_0x7f1200a8), bfm, 0), null, bfm, 0, 4);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
            AgentPermissionPendingCardKt.AgentPermissionAttentionBanner(agentPermissionApproval.attentionLabel, AgentPermissionHeadlineKt.attentionExplanation(agentPermissionApproval), null, bfm, 0, 4);
            AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$approval.reviewText, null, false, bfm, 0, 6);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutApprovalCardKt$DeliveryCheckoutApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DeliveryCheckoutApproval deliveryCheckoutApproval) {
            super(3);
            this.$checkout = deliveryCheckoutApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                DeliveryCheckoutLegalFooterKt.DeliveryCheckoutLegalFooter(this.$checkout, null, bfm, DeliveryCheckoutApproval.$stable, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutApprovalCardKt$DeliveryCheckoutApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, DeliveryCheckoutApproval deliveryCheckoutApproval, RichApprovalSurface richApprovalSurface) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$checkout = deliveryCheckoutApproval;
            this.$surface = richApprovalSurface;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
            List<DeliveryCheckoutStop> list = this.$checkout.stops;
            HatchScreen hatchScreen = this.$surface.screen;
            int i2 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            DeliveryCheckoutStopsKt.DeliveryCheckoutStops(agentPermissionApproval, list, hatchScreen, null, bfm, i2, 8);
            DeliveryCheckoutPayment deliveryCheckoutPayment = this.$checkout.payment;
            if (deliveryCheckoutPayment == null) {
                bfm.AgE(1761598336);
            } else {
                bfm.AgE(1761598337);
                DeliveryCheckoutPaymentSectionKt.DeliveryCheckoutPaymentSection(deliveryCheckoutPayment, this.$checkout.providerName, null, bfm, DeliveryCheckoutPayment.$stable, 4);
            }
            AnonymousClass002.A19(bfm);
            DeliveryCheckoutTotalKt.DeliveryCheckoutTotal(this.$approval, this.$checkout, this.$surface.screen, null, bfm, i2 | (DeliveryCheckoutApproval.$stable << 3), 8);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.DeliveryCheckoutApprovalCardKt$DeliveryCheckoutApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ DeliveryCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, DeliveryCheckoutApproval deliveryCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = deliveryCheckoutApproval;
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
            DeliveryCheckoutApprovalCardKt.DeliveryCheckoutApprovalCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DeliveryCheckoutApprovalCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, DeliveryCheckoutApproval deliveryCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(agentPermissionApproval, deliveryCheckoutApproval, richApprovalSurface);
        bfm.AgG(-1364760407);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(deliveryCheckoutApproval, bfm, i) ? 1 : 0);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ApprovalCardScaffoldKt.ApprovalCardScaffold(agentPermissionApproval.decisionOptions, richApprovalSurface, B1V.A00(bfm, new AnonymousClass1(agentPermissionApproval, deliveryCheckoutApproval), 665495553), bRg2, null, B1V.A00(bfm, new AnonymousClass2(deliveryCheckoutApproval), -1849005730), B1V.A00(bfm, new AnonymousClass3(agentPermissionApproval, deliveryCheckoutApproval, richApprovalSurface), -1255517059), bfm, C3cJ.A01(iA05), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, deliveryCheckoutApproval, richApprovalSurface, bRg2, i, i2);
        }
    }
}
