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
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.icu.text.ListFormatter;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.ConnectorOrderCheckout;
import com.facebook.aura.gateway.ConnectorOrderItem;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ConnectorOrderCheckoutApprovalCardKt {

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $chargeNotice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$chargeNotice = str;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                CheckoutRowPrimitivesKt.CheckoutLegalFooter(AnonymousClass005.A0X(this.$chargeNotice), null, bfm, 0, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ String $merchant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$merchant = str;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderCheckoutHeader(this.$approval, this.$merchant, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 4);
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

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ ConnectorOrderCheckout $checkout;
        public final /* synthetic */ Function0<Unit> $onShowOrderDetails;
        public final /* synthetic */ G0V<HatchComponent, AuraNavKey, Unit> $tap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ConnectorOrderCheckout connectorOrderCheckout, Function0<Unit> function0, G0V<? super HatchComponent, ? super AuraNavKey, Unit> g0v, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(3);
            this.$checkout = connectorOrderCheckout;
            this.$onShowOrderDetails = function0;
            this.$tap = g0v;
            this.$approval = agentPermissionApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderItemsSection(this.$checkout.items, this.$onShowOrderDetails, null, bfm, 0, 4);
            ConnectorOrderAddressRow connectorOrderAddressRowAddressRow = ConnectorOrderCheckoutRowsKt.addressRow(this.$checkout);
            if (connectorOrderAddressRowAddressRow == null) {
                bfm.AgE(812960451);
            } else {
                bfm.AgE(812960452);
                CheckoutRowPrimitivesKt.CheckoutIconRow(R.drawable.truck_outline_24, connectorOrderAddressRowAddressRow.title, connectorOrderAddressRowAddressRow.subtitle, C1b8.A01(C11U.A03(BRg.A00, CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground), null, null, bfm, 0, 48);
            }
            AnonymousClass001.A1D(bfm);
            ConnectorOrderCheckout connectorOrderCheckout = this.$checkout;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$approval, bfm.A65(this.$tap));
            G0V<HatchComponent, AuraNavKey, Unit> g0v = this.$tap;
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$3$2$1(g0v, agentPermissionApproval);
                bfm.Ai0(objAaT);
            }
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderTotal(connectorOrderCheckout, (Function0) objAaT, null, bfm, ConnectorOrderCheckout.$stable, 4);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ ConnectorOrderCheckout $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ConnectorOrderCheckout connectorOrderCheckout, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = connectorOrderCheckout;
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
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderCheckoutApprovalCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C108241 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ String $merchant;

        /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutHeader$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00241 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $monogram;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00241(String str) {
                super(2);
                this.$monogram = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderLogoMonogram(this.$monogram, null, bfm, 0, 2);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108241(String str, HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(2);
            this.$merchant = str;
            this.$approval = agentPermissionApproval;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String strMerchantMonogram = ConnectorOrderCheckoutRowsKt.merchantMonogram(this.$merchant);
                B1U b1uA00 = null;
                String strA0a = C3cI.A0a(this.$approval.iconUrl);
                HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = this.$approval;
                C7384Etj.A0Y(agentPermissionApproval, 0);
                Integer num = agentPermissionApproval.iconRes;
                int iApprovalGlyphRes = AgentPermissionIconsKt.approvalGlyphRes(this.$approval);
                if (strMerchantMonogram != null) {
                    bfm.AgE(663647258);
                    b1uA00 = B1V.A00(bfm, new C00241(strMerchantMonogram), 893937263);
                } else {
                    bfm.AgE(663731174);
                }
                AnonymousClass001.A1D(bfm);
                HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(strA0a, num, null, 36.0f, 8.0f, iApprovalGlyphRes, 0.0f, null, b1uA00, bfm, 27648, 196);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C108252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ String $merchant;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108252(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$merchant = str;
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
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderCheckoutHeader(this.$approval, this.$merchant, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderItemsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C108261 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<ConnectorOrderItem> $items;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowOrderDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108261(List<ConnectorOrderItem> list, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$items = list;
            this.$onShowOrderDetails = function0;
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
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderItemsSection(this.$items, this.$onShowOrderDetails, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderLogoMonogram$2, reason: invalid class name and case insensitive filesystem */
    public final class C108272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $monogram;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108272(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$monogram = str;
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
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderLogoMonogram(this.$monogram, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderTotal$2, reason: invalid class name and case insensitive filesystem */
    public final class C108282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConnectorOrderCheckout $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShowPriceDetails;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108282(ConnectorOrderCheckout connectorOrderCheckout, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = connectorOrderCheckout;
            this.$onShowPriceDetails = function0;
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
            ConnectorOrderCheckoutApprovalCardKt.ConnectorOrderTotal(this.$checkout, this.$onShowPriceDetails, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConnectorOrderCheckoutApprovalCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, ConnectorOrderCheckout connectorOrderCheckout, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(agentPermissionApproval, connectorOrderCheckout, richApprovalSurface);
        bfm.AgG(566362655);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(connectorOrderCheckout, bfm, i) ? 1 : 0);
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
            String strRequestDisplayName = AgentPermissionTitleKt.requestDisplayName(agentPermissionApproval);
            String str = connectorOrderCheckout.chargeNotice;
            int i4 = iA05 & 14;
            G0V<HatchComponent, AuraNavKey, Unit> g0vRememberRichApprovalTap = RichApprovalCardKt.rememberRichApprovalTap(agentPermissionApproval, richApprovalSurface.screen, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable | i4);
            boolean zA65 = (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(agentPermissionApproval))) | bfm.A65(g0vRememberRichApprovalTap) | ((iA05 & 896) == 256 || ((iA05 & 512) != 0 && bfm.A67(richApprovalSurface)));
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderCheckoutApprovalCard$onShowOrderDetails$1$1(g0vRememberRichApprovalTap, agentPermissionApproval, richApprovalSurface);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            List<AgentPermissionDecisionOption> list = agentPermissionApproval.decisionOptions;
            if (str != null) {
                bfm.AgE(1879340659);
                b1uA00 = B1V.A00(bfm, new AnonymousClass1(str), -1484512036);
                AnonymousClass002.A19(bfm);
            } else {
                AnonymousClass004.A1A(bfm, 1879424421);
                b1uA00 = null;
            }
            ApprovalCardScaffoldKt.ApprovalCardScaffold(list, richApprovalSurface, B1V.A00(bfm, new AnonymousClass2(agentPermissionApproval, strRequestDisplayName), -375393417), bRg2, null, b1uA00, B1V.A00(bfm, new AnonymousClass3(connectorOrderCheckout, function0, g0vRememberRichApprovalTap, agentPermissionApproval), -1421921037), bfm, (RichApprovalSurface.$stable << 3) | 1573248 | ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA05 & 7168), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, connectorOrderCheckout, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void ConnectorOrderCheckoutHeader(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(246027761);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
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
            int i4 = iA05 >> 3;
            String strCheckoutApprovalTitleSentenceForMerchant = CheckoutApprovalSharedKt.checkoutApprovalTitleSentenceForMerchant(str, bfm, i4 & 14);
            int i5 = HatchAgentPermissionsRepository.AgentPermissionApproval.$stable;
            int i6 = iA05 & 14;
            CheckoutApprovalSharedKt.CheckoutHeaderRow(CheckoutApprovalSharedKt.checkoutHeadline(agentPermissionApproval, AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, strCheckoutApprovalTitleSentenceForMerchant, bfm, i5 | i6, 2), bfm, i6 | i5), bRg2, B1V.A00(bfm, new C108241(str, agentPermissionApproval), -840200265), bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108252(agentPermissionApproval, str, bRg2, i, i2);
        }
    }

    public static final void ConnectorOrderItemsSection(List<ConnectorOrderItem> list, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0I;
        BRg bRg2 = bRg;
        bfm.AgG(-263299073);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ConnectorOrderItem connectorOrderItem = (ConnectorOrderItem) AbstractC0878AGe.A0K(list);
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<ConnectorOrderItem> it = list.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().name);
            }
            boolean zA1K = AnonymousClass003.A1K(bfm, arrayListA0i, localeA0b);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = ListFormatter.getInstance(localeA0b).format(arrayListA0i);
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            if (connectorOrderItem == null || (strA0I = connectorOrderItem.name) == null) {
                bfm.AgE(372677285);
                strA0I = C3cJ.A0I(bfm, list, R.plurals._name_removed__res_0x7f10000a, list.size());
            } else {
                bfm.AgE(372676417);
            }
            AnonymousClass001.A1D(bfm);
            if (connectorOrderItem != null) {
                str = null;
            }
            CheckoutRowPrimitivesKt.CheckoutIconRow(R.drawable.shopping_bag_wght400_outline_24, strA0I, str, C1b8.A01(C11U.A03(bRg2, CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground), function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12009c), bfm, (iA05 << 9) & 57344, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108261(list, function0, bRg2, i, i2);
        }
    }

    public static final void ConnectorOrderLogoMonogram(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-501012936);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
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
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(bRgA0T, auraTheme.getColors(bfm, 6).elevated);
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
            C1822Arm c1822ArmA0D = C3cH.A0D(bfm, auraTheme);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConnectorOrderCheckoutApprovalCardKt$ConnectorOrderLogoMonogram$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0X(bs0, objAaT), jA06, c1822ArmA0D, null, null, null, false, 0, 1, 0, null, null, null, bfm, AnonymousClass005.A01(iA0d), 0, 15856);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108272(str, bRg2, i, i2);
        }
    }

    public static final void ConnectorOrderTotal(ConnectorOrderCheckout connectorOrderCheckout, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1324943831);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(connectorOrderCheckout, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(connectorOrderCheckout.total.label);
            if (strTrimToNonEmpty == null) {
                bfm.AgE(1960709619);
                strTrimToNonEmpty = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120099);
            } else {
                bfm.AgE(1960707914);
            }
            AnonymousClass001.A1D(bfm);
            String str = connectorOrderCheckout.total.value;
            Function0<Unit> function02 = function0;
            if (connectorOrderCheckout.priceDetails.isEmpty()) {
                function02 = null;
            }
            CheckoutRowPrimitivesKt.CheckoutTotalRow(strTrimToNonEmpty, str, C1b8.A01(C11U.A03(bRg, CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground), function02, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f5), null, bfm, 0, 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108282(connectorOrderCheckout, function0, bRg, i, i2);
        }
    }
}
