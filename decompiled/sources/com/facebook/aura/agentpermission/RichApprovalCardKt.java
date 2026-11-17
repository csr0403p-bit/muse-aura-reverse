package com.facebook.aura.agentpermission;

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
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.ConnectorOrderCheckout;
import com.facebook.aura.gateway.DeliveryCheckoutApproval;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.PurchasePreapproval;
import com.facebook.aura.model.HatchUrlHostKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class RichApprovalCardKt {

    /* renamed from: com.facebook.aura.agentpermission.RichApprovalCardKt$BrowserCheckoutRichCard$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = browserCheckoutApproval;
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
            RichApprovalCardKt.BrowserCheckoutRichCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.RichApprovalCardKt$BrowserTaskConfirmationRichCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = browserTaskConfirmationApproval;
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
            RichApprovalCardKt.BrowserTaskConfirmationRichCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.RichApprovalCardKt$FlightRichCard$5, reason: invalid class name and case insensitive filesystem */
    public final class C108555 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108555(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = flightCheckoutApproval;
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
            RichApprovalCardKt.FlightRichCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.RichApprovalCardKt$RichApprovalCard$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
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
            RichApprovalCardKt.RichApprovalCard(this.$approval, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.RichApprovalCardKt$ShopifyRichCard$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = shopifyCheckoutApproval;
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
            RichApprovalCardKt.ShopifyRichCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.RichApprovalCardKt$StripeLinkRichCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.StripeLinkCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = stripeLinkCheckoutApproval;
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
            RichApprovalCardKt.StripeLinkRichCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void RichApprovalCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(agentPermissionApproval, richApprovalSurface);
        bfm.AgG(189635834);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, richApprovalSurface);
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
            HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
            if (agentPermissionRichPayload instanceof PurchasePreapproval) {
                bfm.AgE(1851416856);
                PurchasePreapprovalCardKt.PurchasePreapprovalCard(agentPermissionApproval, (PurchasePreapproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(PurchasePreapproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval) {
                bfm.AgE(1851420480);
                BrowserTaskConfirmationRichCard(agentPermissionApproval, (HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.BrowserCheckoutApproval) {
                bfm.AgE(1851423832);
                BrowserCheckoutRichCard(agentPermissionApproval, (HatchAgentPermissionsRepository.BrowserCheckoutApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.BrowserCheckoutApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) {
                bfm.AgE(1851427027);
                StripeLinkRichCard(agentPermissionApproval, (HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ShopifyCheckoutApproval) {
                bfm.AgE(1851429968);
                ShopifyRichCard(agentPermissionApproval, (HatchAgentPermissionsRepository.ShopifyCheckoutApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.ShopifyCheckoutApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ReservationCheckoutApproval) {
                bfm.AgE(1851433318);
                ReservationCheckoutApprovalCardKt.ReservationCheckoutApprovalCard(agentPermissionApproval, (HatchAgentPermissionsRepository.ReservationCheckoutApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.ReservationCheckoutApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.FlightCheckoutApproval) {
                bfm.AgE(1851439791);
                FlightRichCard(agentPermissionApproval, (HatchAgentPermissionsRepository.FlightCheckoutApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.FlightCheckoutApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof DeliveryCheckoutApproval) {
                bfm.AgE(1851443011);
                DeliveryCheckoutApprovalCardKt.DeliveryCheckoutApprovalCard(agentPermissionApproval, (DeliveryCheckoutApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(DeliveryCheckoutApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.CarRentalReservationApproval) {
                bfm.AgE(1851449959);
                CarRentalReservationApprovalCardKt.CarRentalReservationApprovalCard(agentPermissionApproval, (HatchAgentPermissionsRepository.CarRentalReservationApproval) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(HatchAgentPermissionsRepository.CarRentalReservationApproval.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else if (agentPermissionRichPayload instanceof ConnectorOrderCheckout) {
                bfm.AgE(1851456841);
                ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderCheckoutApprovalCard(agentPermissionApproval, (ConnectorOrderCheckout) agentPermissionRichPayload, richApprovalSurface, bRg2, bfm, C3cJ.A02(ConnectorOrderCheckout.$stable, C3cH.A01(iA05), iA05), zA1b ? 1 : 0);
            } else {
                bfm.AgE(1851462686);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(agentPermissionApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final boolean richActionsInSheetFooter(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
        return (agentPermissionRichPayload instanceof DeliveryCheckoutApproval) || (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ReservationCheckoutApproval);
    }

    public static final void BrowserCheckoutRichCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-168624730);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(browserCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, richApprovalSurface);
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
            HatchScreen hatchScreen = richApprovalSurface.screen;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            int i5 = iA05 & 14;
            G0V<HatchComponent, AuraNavKey, Unit> g0vRememberRichApprovalTap = rememberRichApprovalTap(agentPermissionApproval, hatchScreen, bfm, i4 | i5);
            String str = agentPermissionApproval.approvalId;
            int i6 = i4 | i5;
            ApQ apQCheckoutHeadline = CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, CheckoutApprovalSharedKt.checkoutApprovalTitleSentenceForMerchant(HatchUrlHostKt.toDisplayHost(browserCheckoutApproval.merchantUrl), bfm, 0), bfm, i6, 2), bfm, i6);
            String strAgentPermissionNarrative = AgentPermissionTitleKt.agentPermissionNarrative(agentPermissionApproval, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12009a), bfm, i6, 2);
            String str2 = agentPermissionApproval.reviewText;
            String str3 = agentPermissionApproval.totalPromoCaption;
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            boolean zA65 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            int i7 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = (i7 == 32 || ((iA05 & 64) != 0 && bfm.A67(browserCheckoutApproval))) | zA65;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new RichApprovalCardKt$BrowserCheckoutRichCard$1$1(g0vRememberRichApprovalTap, agentPermissionApproval, browserCheckoutApproval);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA652 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new RichApprovalCardKt$BrowserCheckoutRichCard$2$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            boolean z2 = i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval));
            Object objAaT3 = bfm.AaT();
            if (z2 || objAaT3 == C78N.A00) {
                objAaT3 = new RichApprovalCardKt$BrowserCheckoutRichCard$3$1(agentPermissionApproval);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            boolean zA1K = AnonymousClass004.A1K(iA05) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT4 = bfm.AaT();
            if (zA1K || objAaT4 == C78N.A00) {
                objAaT4 = new RichApprovalCardKt$BrowserCheckoutRichCard$4$1(richApprovalSurface, agentPermissionApproval);
                bfm.Ai0(objAaT4);
            }
            CheckoutApprovalCardKt.CheckoutApprovalCard(str, browserCheckoutApproval, apQCheckoutHeadline, strAgentPermissionNarrative, str2, str3, list, richApprovalSurface, function0, function02, function03, (Function0) objAaT4, bRg2, bfm, AnonymousClass001.A0C(iA05 << 15, (HatchAgentPermissionsRepository.BrowserCheckoutApproval.$stable << 3) | i7), (iA05 >> 3) & 896, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(agentPermissionApproval, browserCheckoutApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void BrowserTaskConfirmationRichCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval browserTaskConfirmationApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(335160702);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(browserTaskConfirmationApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, richApprovalSurface);
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
            String str = browserTaskConfirmationApproval.title;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            int i5 = iA05 & 14;
            String strAgentPermissionHeadline = AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, str, null, bfm, i4 | i5, 4);
            int i6 = i4 | i5;
            ApQ apQCheckoutHeadline = CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, strAgentPermissionHeadline, bfm, i6);
            String strAgentPermissionNarrative = AgentPermissionTitleKt.agentPermissionNarrative(agentPermissionApproval, browserTaskConfirmationApproval.body, null, bfm, i6, 4);
            String str2 = agentPermissionApproval.attentionLabel;
            String str3 = agentPermissionApproval.reviewText;
            BrowserTaskConfirmationTreatment browserTaskConfirmationTreatmentForApproval = BrowserTaskConfirmationTreatment.Companion.forApproval(agentPermissionApproval);
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            boolean zA1D = AnonymousClass003.A1D(iA05) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new RichApprovalCardKt$BrowserTaskConfirmationRichCard$1$1(richApprovalSurface, agentPermissionApproval);
                bfm.Ai0(objAaT);
            }
            BrowserTaskConfirmationApprovalCardKt.BrowserTaskConfirmationApprovalCard(browserTaskConfirmationApproval, apQCheckoutHeadline, strAgentPermissionNarrative, str2, str3, browserTaskConfirmationTreatmentForApproval, list, richApprovalSurface, (Function0) objAaT, bRg2, bfm, AnonymousClass001.A06(iA05 << 18, AnonymousClass001.A0C(iA05 << 15, HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval.$stable | ((iA05 >> 3) & 14))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, browserTaskConfirmationApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void FlightRichCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-594697062);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(flightCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, richApprovalSurface);
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
            HatchScreen hatchScreen = richApprovalSurface.screen;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            int i5 = iA05 & 14;
            G0V<HatchComponent, AuraNavKey, Unit> g0vRememberRichApprovalTap = rememberRichApprovalTap(agentPermissionApproval, hatchScreen, bfm, i4 | i5);
            int i6 = i4 | i5;
            ApQ apQCheckoutHeadline = CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, FlightCheckoutApprovalCardKt.flightApprovalTitleSentence(flightCheckoutApproval.getMerchantDisplayName(), bfm, 0), bfm, i6, 2), bfm, i6);
            String str = agentPermissionApproval.reviewText;
            String str2 = agentPermissionApproval.iconUrl;
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            boolean zA65 = ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(flightCheckoutApproval))) | bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new RichApprovalCardKt$FlightRichCard$1$1(g0vRememberRichApprovalTap, agentPermissionApproval, flightCheckoutApproval);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA652 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new RichApprovalCardKt$FlightRichCard$2$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            boolean zA653 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = new RichApprovalCardKt$FlightRichCard$3$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT3);
            }
            G0U g0u = (G0U) objAaT3;
            boolean zA654 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT4 = bfm.AaT();
            if (zA654 || objAaT4 == C78N.A00) {
                objAaT4 = new RichApprovalCardKt$FlightRichCard$4$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT4);
            }
            FlightCheckoutApprovalCardKt.FlightCheckoutApprovalCard(flightCheckoutApproval, apQCheckoutHeadline, str, str2, list, richApprovalSurface, function0, function02, g0u, (Function0) objAaT4, bRg2, bfm, AnonymousClass001.A08(iA05 << 9, HatchAgentPermissionsRepository.FlightCheckoutApproval.$stable | ((iA05 >> 3) & 14)), (iA05 >> 9) & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108555(agentPermissionApproval, flightCheckoutApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void ShopifyRichCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1305022064);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(shopifyCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, richApprovalSurface);
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
            HatchScreen hatchScreen = richApprovalSurface.screen;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            int i5 = iA05 & 14;
            G0V<HatchComponent, AuraNavKey, Unit> g0vRememberRichApprovalTap = rememberRichApprovalTap(agentPermissionApproval, hatchScreen, bfm, i4 | i5);
            int i6 = i4 | i5;
            ApQ apQCheckoutHeadline = CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, CheckoutApprovalSharedKt.checkoutApprovalTitleSentenceForMerchant(shopifyCheckoutApproval.getMerchantDisplayName(), bfm, 0), bfm, i6, 2), bfm, i6);
            String strPurposeSummaryText = agentPermissionApproval.reviewText;
            if (strPurposeSummaryText == null) {
                strPurposeSummaryText = AgentPermissionHeadlineKt.purposeSummaryText(agentPermissionApproval);
                if (CheckoutApprovalPresentationKt.presentationKind(shopifyCheckoutApproval) != CheckoutPresentationKind.LODGING) {
                    strPurposeSummaryText = null;
                }
            }
            String str = agentPermissionApproval.totalPromoCaption;
            String str2 = agentPermissionApproval.iconUrl;
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            boolean zA65 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new RichApprovalCardKt$ShopifyRichCard$2$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA652 = (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))) | bfm.A65(g0vRememberRichApprovalTap);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new RichApprovalCardKt$ShopifyRichCard$3$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            boolean zA653 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(shopifyCheckoutApproval)));
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = new RichApprovalCardKt$ShopifyRichCard$4$1(g0vRememberRichApprovalTap, agentPermissionApproval, shopifyCheckoutApproval);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) objAaT3;
            boolean zA654 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT4 = bfm.AaT();
            if (zA654 || objAaT4 == C78N.A00) {
                objAaT4 = new RichApprovalCardKt$ShopifyRichCard$5$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT4);
            }
            String str3 = strPurposeSummaryText;
            StructuredCheckoutApprovalCardKt.StructuredCheckoutApprovalCard(shopifyCheckoutApproval, apQCheckoutHeadline, str3, str, str2, list, richApprovalSurface, function0, function02, function03, (G0U) objAaT4, bRg2, bfm, AnonymousClass001.A05(iA05 << 12, HatchAgentPermissionsRepository.ShopifyCheckoutApproval.$stable | ((iA05 >> 3) & 14)), (iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(agentPermissionApproval, shopifyCheckoutApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void StripeLinkRichCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1492875398);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(stripeLinkCheckoutApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, richApprovalSurface);
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
            HatchScreen hatchScreen = richApprovalSurface.screen;
            int i4 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            int i5 = iA05 & 14;
            G0V<HatchComponent, AuraNavKey, Unit> g0vRememberRichApprovalTap = rememberRichApprovalTap(agentPermissionApproval, hatchScreen, bfm, i4 | i5);
            int i6 = i4 | i5;
            ApQ apQCheckoutHeadline = CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, CheckoutApprovalSharedKt.checkoutApprovalTitleSentenceForMerchant(HatchUrlHostKt.toDisplayHost(stripeLinkCheckoutApproval.merchantUrl), bfm, 0), bfm, i6, 2), bfm, i6);
            int i7 = (iA05 >> 3) & 14;
            String strAgentPermissionNarrative = AgentPermissionTitleKt.agentPermissionNarrative(agentPermissionApproval, null, StripeLinkCheckoutApprovalCardKt.stripeLinkCheckoutSubtitle(stripeLinkCheckoutApproval, bfm, HatchAgentPermissionsRepository.StripeLinkCheckoutApproval.$stable | i7), bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i5, 2);
            String str = agentPermissionApproval.reviewText;
            String str2 = agentPermissionApproval.totalPromoCaption;
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            boolean zA65 = bfm.A65(g0vRememberRichApprovalTap) | (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new RichApprovalCardKt$StripeLinkRichCard$1$1(g0vRememberRichApprovalTap, agentPermissionApproval);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA652 = (i5 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))) | bfm.A65(g0vRememberRichApprovalTap) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(stripeLinkCheckoutApproval)));
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = new RichApprovalCardKt$StripeLinkRichCard$2$1(g0vRememberRichApprovalTap, agentPermissionApproval, stripeLinkCheckoutApproval);
                bfm.Ai0(objAaT2);
            }
            BRg bRg3 = bRg2;
            StripeLinkCheckoutApprovalCardKt.StripeLinkCheckoutApprovalCard(stripeLinkCheckoutApproval, apQCheckoutHeadline, strAgentPermissionNarrative, str, str2, list, richApprovalSurface, function0, (Function0) objAaT2, bRg3, bfm, AnonymousClass001.A06(iA05 << 18, AnonymousClass001.A05(iA05 << 12, HatchAgentPermissionsRepository.StripeLinkCheckoutApproval.$stable | i7)), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(agentPermissionApproval, stripeLinkCheckoutApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0V<com.facebook.aura.analytics.hatch.HatchComponent, com.facebook.aura.navigation.AuraNavKey, kotlin.Unit> rememberRichApprovalTap(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r5, com.facebook.aura.analytics.hatch.HatchScreen r6, X.BFM r7, int r8) {
        /*
            X.AnonymousClass003.A0u(r5, r6)
            com.facebook.aura.navigation.AuraNavigator r3 = X.AnonymousClass002.A0b(r7)
            r0 = r8 & 14
            r0 = r0 ^ 6
            r4 = 0
            r1 = 4
            if (r0 <= r1) goto L15
            boolean r0 = r7.A65(r5)
            if (r0 != 0) goto L1a
        L15:
            r0 = r8 & 6
            r2 = 0
            if (r0 != r1) goto L1b
        L1a:
            r2 = 1
        L1b:
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L29
            boolean r0 = X.AnonymousClass002.A1U(r7, r6)
            if (r0 != 0) goto L2d
        L29:
            r0 = r8 & 48
            if (r0 != r1) goto L2e
        L2d:
            r4 = 1
        L2e:
            boolean r1 = X.AnonymousClass002.A1W(r7, r3, r2, r4)
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L3c
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L44
        L3c:
            com.facebook.aura.agentpermission.RichApprovalCardKt$rememberRichApprovalTap$1$1 r0 = new com.facebook.aura.agentpermission.RichApprovalCardKt$rememberRichApprovalTap$1$1
            r0.<init>(r3, r6, r5)
            r7.Ai0(r0)
        L44:
            X.G0V r0 = (X.G0V) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.RichApprovalCardKt.rememberRichApprovalTap(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, com.facebook.aura.analytics.hatch.HatchScreen, X.BFM, int):X.G0V");
    }
}
