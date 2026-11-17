package com.facebook.aura.agentpermission;

import X.AKQ;
import X.ARD;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsViewModel;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutApprovalCartSheetKt {
    public static final C1D3 CheckoutCartCardShape = C1D8.A00(22.0f);

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval $checkout;
        public final /* synthetic */ CheckoutPresentationKind $kind;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheckoutPresentationKind checkoutPresentationKind, HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval) {
            super(3);
            this.$kind = checkoutPresentationKind;
            this.$checkout = shopifyCheckoutApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$kind == CheckoutPresentationKind.LODGING) {
                bfm.AgE(-788320555);
                LodgingCheckoutRowsKt.LodgingCheckoutBookingTerms(this.$checkout, null, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutApproval.$stable, 2);
            } else {
                bfm.AgE(-788319051);
                CheckoutApprovalCartSheetKt.CheckoutCartBody(this.$checkout, null, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutApproval.$stable, 2);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, int i) {
            super(2);
            this.$approvalId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutApprovalCartSheetKt.CheckoutApprovalCartSheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalCartSheetKt$CheckoutCartBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.ShopifyCheckoutApproval $checkout;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, BRg bRg, int i, int i2) {
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
            CheckoutApprovalCartSheetKt.CheckoutCartBody(this.$checkout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CheckoutApprovalCartSheet(String str, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass5;
        HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval;
        G0V<BFM, Integer, Unit> g0v;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-79527565);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AgentPermissionTaskDetailsViewModel.Factory factory = new AgentPermissionTaskDetailsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((AgentPermissionTaskDetailsViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AgentPermissionTaskDetailsViewModel.class))).approval);
            Object value = c1boA02.getValue();
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$1$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, value);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApprovalA0N = C3cH.A0N(c1boA02);
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = null;
            HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApprovalA0N != null ? agentPermissionApprovalA0N.richPayload : null;
            if (!(agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ShopifyCheckoutApproval) || (shopifyCheckoutApproval = (HatchAgentPermissionsRepository.ShopifyCheckoutApproval) agentPermissionRichPayload) == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$checkout$1(str, i);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            CheckoutPresentationKind checkoutPresentationKindPresentationKind = CheckoutApprovalPresentationKt.presentationKind(shopifyCheckoutApproval);
            BRg bRgA0U = AnonymousClass001.A0U(BRg.A00, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.5f);
            if (checkoutPresentationKindPresentationKind == CheckoutPresentationKind.LODGING) {
                g0v = null;
                bfm.AgE(883455105);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120101);
                AuraBottomSheetHeaderConfig.AccessoryButton.Companion companion = AuraBottomSheetHeaderConfig.AccessoryButton.Companion;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$2$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(strA01, null, companion.back((Function0) objAaT2), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
                AnonymousClass001.A1D(bfm);
            } else {
                g0v = ComposableSingletons$CheckoutApprovalCartSheetKt.lambda$1615887261;
                AnonymousClass003.A0l(bfm, 1617549194);
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            boolean zA1J2 = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA1J2 || objAaT3 == C78N.A00) {
                objAaT3 = new CheckoutApprovalCartSheetKt$CheckoutApprovalCartSheet$3$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT3);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA0U, null, auraBottomSheetHeaderConfig, g0v, null, (Function0) objAaT3, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(checkoutPresentationKindPresentationKind, shopifyCheckoutApproval), 1460630576), bfm, 6, 48, 1956);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, i);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void CheckoutCartBody(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1146100898);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(shopifyCheckoutApproval, bfm, i) ? 1 : 0) : i;
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
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                BS0 bs0 = BRg.A00;
                float f = AuraDimensKt.SpacingLarge;
                BRg bRgA0B = C3U4.A0B(c1062ATq, f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120138);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
                long jA06 = C3cH.A06(bfm, auraTheme);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = CheckoutApprovalCartSheetKt$CheckoutCartBody$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bs0, (G0U) objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                String merchantDisplayName = shopifyCheckoutApproval.getMerchantDisplayName();
                if (merchantDisplayName == null) {
                    bfm.AgE(1931598111);
                } else {
                    AuraTextKt.m2639AuraTextUY9GdpU(merchantDisplayName, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1931598112).caption1Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
                }
                boolean zA1V = AnonymousClass003.A1V(bbi);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
                BRg bRgA0B2 = C3U4.A0B(c1062ATq, f, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0B2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                String strA0I = C3cJ.A0I(bfm, shopifyCheckoutApproval.items, R.plurals._name_removed__res_0x7f10000a, shopifyCheckoutApproval.items.size());
                C1822Arm c1822Arm2 = auraTheme.getTypography(bfm, 6).caption1Regular;
                long jA07 = C3cH.A07(bfm, auraTheme);
                float f2 = AuraDimensKt.SpacingMedium;
                AuraTextKt.m2639AuraTextUY9GdpU(strA0I, C3U4.A0B(bs0, f2, 0.0f), jA07, c1822Arm2, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingSmall, bfm, 0);
                BRg bRgA014 = C1b8.A01(C11U.A03(c1062ATq, CheckoutCartCardShape), auraTheme.getColors(bfm, 6).highlight);
                InterfaceC1380AiA interfaceC1380AiAA004 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA014);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA004, g0vA0v);
                BPg.A02(bfm, akqA044, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA015, g0vA0u);
                bfm.AgE(-509121807);
                int i4 = 0;
                for (HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem : shopifyCheckoutApproval.items) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        HatchAgentPermissionsRepository.ShopifyCheckoutItem shopifyCheckoutItem2 = shopifyCheckoutItem;
                        if (i4 > 0) {
                            bfm.AgE(560943300);
                            AuraDividerKt.AuraRowDivider(C3U4.A0B(bs0, f2, 0.0f), bfm, 0, 0);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(561036517);
                            BBI.A0R(bbi, false);
                        }
                        StructuredCheckoutApprovalCardKt.m193CheckoutItemRow3IgeMak(shopifyCheckoutItem2, auraTheme.getColors(bfm, 6).background, null, bfm, HatchAgentPermissionsRepository.ShopifyCheckoutItem.$stable, 4);
                        i4 = i5;
                    }
                }
                AnonymousClass002.A10(bbi, false, zA1V);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
                BBI.A0R(bbi, zA1V);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(shopifyCheckoutApproval, bRg2, i, i2);
        }
    }
}
