package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.AgentPermissionDecisionOption;
import com.facebook.aura.gateway.AgentPermissionHeadlineKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.PurchasePreapproval;
import com.facebook.aura.gateway.PurchasePreapprovalRow;
import com.facebook.aura.gateway.PurchasePreapprovalRowKind;
import com.facebook.aura.gateway.PurchasePreapprovalTotal;
import com.facebook.aura.skills.view.common.HatchConnectorIconKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class PurchasePreapprovalCardKt {

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchaseApprovalHeading$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
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
            PurchasePreapprovalCardKt.PurchaseApprovalHeading(this.$approval, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchaseDisclosureRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C108512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PurchasePreapprovalRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108512(PurchasePreapprovalRow purchasePreapprovalRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = purchasePreapprovalRow;
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
            PurchasePreapprovalCardKt.PurchaseDisclosureRow(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchaseMaxTotal$2, reason: invalid class name and case insensitive filesystem */
    public final class C108522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PurchasePreapprovalTotal $total;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108522(PurchasePreapprovalTotal purchasePreapprovalTotal, BRg bRg, int i, int i2) {
            super(2);
            this.$total = purchasePreapprovalTotal;
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
            PurchasePreapprovalCardKt.PurchaseMaxTotal(this.$total, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchasePreapprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(3);
            this.$approval = agentPermissionApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                PurchasePreapprovalCardKt.PurchaseApprovalHeading(this.$approval, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchasePreapprovalCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C108532 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108532(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(3);
            this.$approval = agentPermissionApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            String strPermissionCaptionText = AgentPermissionHeadlineKt.permissionCaptionText(this.$approval);
            if (strPermissionCaptionText == null) {
                bfm.AgE(-718441119);
            } else {
                bfm.AgE(-718441118);
                CheckoutRowPrimitivesKt.CheckoutLegalFooter(AgentPermissionCaptionKt.rememberPermissionCaptionText(AbstractC2159Azp.A0z(strPermissionCaptionText, AgentPermissionHeadlineKt.APPROVAL_ASSISTANT_PLACEHOLDER, AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0)), bfm, 0), null, bfm, 0, 2);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchasePreapprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ PurchasePreapproval $purchase;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$approval.reviewText, null, false, bfm, 0, 6);
            String strAgentPermissionNarrative = AgentPermissionTitleKt.agentPermissionNarrative(this.$approval, null, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 6);
            if (strAgentPermissionNarrative == null) {
                bfm.AgE(-1145664472);
            } else {
                bfm.AgE(-1145664471);
                AuraTextKt.m2639AuraTextUY9GdpU(strAgentPermissionNarrative, C10G.A02, 0L, C3cH.A0C(bfm, AuraTheme.INSTANCE), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16372);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (this.$purchase.rows.isEmpty()) {
                bfm.AgE(-1145151421);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(-1145469512);
                BRg bRgA06 = C3U4.A06(C1b8.A01(C11U.A03(C10G.A02, CheckoutRowPrimitivesKt.CheckoutSectionShape), AuraTheme.INSTANCE.getColors(bfm, 6).secondaryButtonBackground), AuraDimensKt.SpacingSmall);
                PurchasePreapproval purchasePreapproval = this.$purchase;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                int iA0J = AnonymousClass003.A0J(bbiA07);
                AKQ akqA04 = BBI.A04(bbiA07);
                BRg bRgA01 = AxM.A01(bfm, bRgA06);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbiA07.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbiA07, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                bfm.AgE(-1449051275);
                Iterator<PurchasePreapprovalRow> it = purchasePreapproval.rows.iterator();
                while (it.hasNext()) {
                    PurchasePreapprovalCardKt.PurchaseDisclosureRow(it.next(), null, bfm, PurchasePreapprovalRow.$stable, 2);
                }
                AnonymousClass003.A0q(bbiA07);
                BBI.A0R(bbiA07, false);
            }
            PurchasePreapprovalCardKt.PurchaseMaxTotal(this.$purchase.maxTotal, null, bfm, PurchasePreapprovalTotal.$stable, 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, PurchasePreapproval purchasePreapproval) {
            super(3);
            this.$approval = agentPermissionApproval;
            this.$purchase = purchasePreapproval;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.PurchasePreapprovalCardKt$PurchasePreapprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ PurchasePreapproval $purchase;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, PurchasePreapproval purchasePreapproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$purchase = purchasePreapproval;
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
            PurchasePreapprovalCardKt.PurchasePreapprovalCard(this.$approval, this.$purchase, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void PurchasePreapprovalCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, PurchasePreapproval purchasePreapproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass003.A0u(agentPermissionApproval, purchasePreapproval);
        C7384Etj.A0Y(richApprovalSurface, 2);
        bfm.AgG(82772947);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(purchasePreapproval, bfm, i) ? 1 : 0);
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
            List<AgentPermissionDecisionOption> listA0V = agentPermissionApproval.decisionOptions;
            if (listA0V.size() == 2) {
                listA0V = AbstractC0878AGe.A0V(listA0V);
            }
            ApprovalCardScaffoldKt.ApprovalCardScaffold(listA0V, richApprovalSurface, B1V.A00(bfm, new AnonymousClass1(agentPermissionApproval), -1339031685), bRg2, null, B1V.A00(bfm, new C108532(agentPermissionApproval), -1103933506), B1V.A00(bfm, new AnonymousClass3(agentPermissionApproval, purchasePreapproval), 406088319), bfm, C3cJ.A01(iA05), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, purchasePreapproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasePreapprovalRowKind.values().length];
            try {
                AnonymousClass002.A13(PurchasePreapprovalRowKind.SIGN_IN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PurchasePreapprovalRowKind.PAYMENT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PurchasePreapprovalRowKind.EXPIRY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PurchasePreapprovalRowKind.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void PurchaseApprovalHeading(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1942777729);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            HatchConnectorIconKt.m2169ConnectorIconVRRgpyE(agentPermissionApproval.iconUrl, agentPermissionApproval.iconRes, null, AgentPermissionIconsKt.ApprovalIconSize, AgentPermissionIconsKt.ApprovalIconCornerRadius, AgentPermissionIconsKt.approvalGlyphRes(agentPermissionApproval), AgentPermissionIconsKt.ApprovalIconGlyphSize, null, null, bfm, 0, 388);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingMedium);
            String strAgentPermissionHeadline = AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, null, bfm, (iA05 & 14) | HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 6);
            C1822Arm c1822Arm = AuraTheme.INSTANCE.getTypography(bfm, 6).bodyMedium;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = PurchasePreapprovalCardKt$PurchaseApprovalHeading$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strAgentPermissionHeadline, AnonymousClass001.A0Y(bRgAiP, objAaT, false), 0L, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(agentPermissionApproval, bRg2, i, i2);
        }
    }

    public static final void PurchaseDisclosureRow(PurchasePreapprovalRow purchasePreapprovalRow, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-653755935);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(purchasePreapprovalRow, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRgA0R, f);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            int iOrdinal = purchasePreapprovalRow.kind.ordinal();
            if (iOrdinal == 0) {
                i3 = R.drawable.key_outline_24_wght400;
            } else if (iOrdinal == 1) {
                i3 = R.drawable.credit_card_outline_24;
            } else if (iOrdinal == 2) {
                i3 = R.drawable.clock_semi_circle_dashed_wght400_outline_24;
            } else {
                if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                i3 = R.drawable.circle_info_wght400_outline_24;
            }
            AVy aVyA00 = BOf.A00(bfm, i3, 0);
            AuraIconSize auraIconSize = AuraIconSize.SMALL;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, C3cH.A07(bfm, auraTheme), null, bfm, (AVy.$stable << 3) | 3456, 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2159Azp.A0z(purchasePreapprovalRow.text, AgentPermissionHeadlineKt.APPROVAL_ASSISTANT_PLACEHOLDER, AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0)), AnonymousClass001.A0O(c90m, BRg.A00, true), 0L, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16372);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108512(purchasePreapprovalRow, bRg2, i, i2);
        }
    }

    public static final void PurchaseMaxTotal(PurchasePreapprovalTotal purchasePreapprovalTotal, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2046031654);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(purchasePreapprovalTotal, bfm, i) ? 1 : 0) | i : i;
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
            String strAgentPermissionAgentName = AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0S);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90m.A00.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingMicro, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String strA0z = AbstractC2159Azp.A0z(purchasePreapprovalTotal.label, AgentPermissionHeadlineKt.APPROVAL_ASSISTANT_PLACEHOLDER, strAgentPermissionAgentName);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0z, null, 0L, C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2159Azp.A0z(purchasePreapprovalTotal.caption, AgentPermissionHeadlineKt.APPROVAL_ASSISTANT_PLACEHOLDER, strAgentPermissionAgentName), null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2159Azp.A0z(purchasePreapprovalTotal.value, AgentPermissionHeadlineKt.APPROVAL_ASSISTANT_PLACEHOLDER, strAgentPermissionAgentName), null, 0L, auraTheme.getTypography(bfm, 6).bodyMedium, null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16310);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108522(purchasePreapprovalTotal, bRg2, i, i2);
        }
    }
}
