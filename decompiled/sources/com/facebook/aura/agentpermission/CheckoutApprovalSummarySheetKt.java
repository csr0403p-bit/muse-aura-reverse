package com.facebook.aura.agentpermission;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.C07C;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsViewModel;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutApprovalSummarySheetKt {

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSummarySheetKt$CheckoutApprovalSummarySheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ CheckoutSummaryPresentation $presentation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(CheckoutSummaryPresentation checkoutSummaryPresentation) {
            super(3);
            this.$presentation = checkoutSummaryPresentation;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                CheckoutApprovalSummaryBodyKt.CheckoutSummaryGroups(this.$presentation, null, bfm, CheckoutSummaryPresentation.$stable, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.CheckoutApprovalSummarySheetKt$CheckoutApprovalSummarySheet$5, reason: invalid class name */
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
            CheckoutApprovalSummarySheetKt.CheckoutApprovalSummarySheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void CheckoutApprovalSummarySheet(String str, BFM bfm, int i) {
        BBb bBbAAc;
        Object anonymousClass5;
        CheckoutSummaryPresentation checkoutSummaryPresentation;
        BBI bbiA07;
        AuraContainer.AuraBottomSheet auraBottomSheet;
        int i2;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-132292197);
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
            AuraBottomSheetHeaderConfig.AccessoryButton accessoryButtonBack = null;
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new CheckoutApprovalSummarySheetKt$CheckoutApprovalSummarySheet$1$1(auraNavigatorA0b, c1boA02, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, value);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApprovalA0N = C3cH.A0N(c1boA02);
            HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApprovalA0N != null ? agentPermissionApprovalA0N.richPayload : null;
            if (agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ShopifyCheckoutApproval) {
                bfm.AgE(1663817384);
                HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval = (HatchAgentPermissionsRepository.ShopifyCheckoutApproval) agentPermissionRichPayload;
                boolean zA65 = bfm.A65(shopifyCheckoutApproval);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = CheckoutApprovalPresentationKt.toCheckoutSummaryPresentation(shopifyCheckoutApproval);
                    bfm.Ai0(objAaT2);
                }
                checkoutSummaryPresentation = (CheckoutSummaryPresentation) objAaT2;
                bbiA07 = C3cG.A07(bfm);
            } else {
                if (!(agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ReservationCheckoutApproval)) {
                    AnonymousClass003.A0l(bfm, 1664096353);
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        anonymousClass5 = new CheckoutApprovalSummarySheetKt$CheckoutApprovalSummarySheet$presentation$3(str, i);
                        C3cG.A1D(bBbAAc, anonymousClass5);
                    }
                    return;
                }
                bfm.AgE(1663925543);
                Locale localeA0b = AnonymousClass007.A0b(bfm);
                HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval = (HatchAgentPermissionsRepository.ReservationCheckoutApproval) agentPermissionRichPayload;
                boolean zA1K = AnonymousClass003.A1K(bfm, reservationCheckoutApproval, localeA0b);
                Object objAaT3 = bfm.AaT();
                if (zA1K || objAaT3 == C78N.A00) {
                    C7384Etj.A0X(localeA0b);
                    objAaT3 = ReservationCheckoutFormattingKt.toCheckoutSummaryPresentation(reservationCheckoutApproval, localeA0b);
                    bfm.Ai0(objAaT3);
                }
                checkoutSummaryPresentation = (CheckoutSummaryPresentation) objAaT3;
                bbiA07 = C3cG.A07(bfm);
            }
            CheckoutPresentationKind checkoutPresentationKind = checkoutSummaryPresentation.kind;
            CheckoutPresentationKind checkoutPresentationKind2 = CheckoutPresentationKind.LODGING;
            if (checkoutPresentationKind == checkoutPresentationKind2) {
                auraBottomSheet = AuraContainer.PrimaryBottomSheet.INSTANCE;
                i2 = R.string._name_removed__res_0x7f12010c;
            } else {
                auraBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
                i2 = R.string._name_removed__res_0x7f120142;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i2);
            if (checkoutSummaryPresentation.kind == checkoutPresentationKind2) {
                bfm.AgE(1716271472);
                AuraBottomSheetHeaderConfig.AccessoryButton.Companion companion = AuraBottomSheetHeaderConfig.AccessoryButton.Companion;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT4 = bfm.AaT();
                if (zA67 || objAaT4 == C78N.A00) {
                    objAaT4 = new CheckoutApprovalSummarySheetKt$CheckoutApprovalSummarySheet$2$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT4);
                }
                accessoryButtonBack = companion.back((Function0) objAaT4);
            } else {
                bfm.AgE(1664852194);
            }
            BBI.A0R(bbiA07, false);
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(strA01, null, accessoryButtonBack, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            boolean zA1J2 = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT5 = bfm.AaT();
            if (zA1J2 || objAaT5 == C78N.A00) {
                objAaT5 = new CheckoutApprovalSummarySheetKt$CheckoutApprovalSummarySheet$3$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT5);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(auraBottomSheet, null, null, auraBottomSheetHeaderConfig, null, null, (Function0) objAaT5, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(checkoutSummaryPresentation), -51998056), bfm, 0, 48, 1974);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, i);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }
}
