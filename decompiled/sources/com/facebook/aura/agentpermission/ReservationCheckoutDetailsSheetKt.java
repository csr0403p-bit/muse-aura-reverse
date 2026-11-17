package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C1515AkP;
import X.C1BN;
import X.C1BO;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsViewModel;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ReservationCheckoutDetailsSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutDetailsSheetKt$ReservationCheckoutDetailsSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            ReservationCheckoutDetailsSheetKt.ReservationCheckoutDetailsSheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutDetailsSheetKt$ReservationCheckoutDetailsSheet$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ List<HatchAgentPermissionsRepository.AgentPermissionDetailRow> $detailRows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(List<HatchAgentPermissionsRepository.AgentPermissionDetailRow> list) {
            super(3);
            this.$detailRows = list;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                List<HatchAgentPermissionsRepository.AgentPermissionDetailRow> list = this.$detailRows;
                BS0 bs0 = BRg.A00;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                } else {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, list, -1412985367);
                    int i2 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            HatchAgentPermissionsRepository.AgentPermissionDetailRow agentPermissionDetailRow = (HatchAgentPermissionsRepository.AgentPermissionDetailRow) next;
                            if (i2 > 0) {
                                bfm.AgE(1262551671);
                                AuraDividerKt.AuraRowDivider(C3U4.A07(bs0, AuraDimensKt.SpacingMedium), bfm, 0, 0);
                            } else {
                                bfm.AgE(484453799);
                            }
                            BBI.A0R(bbi, false);
                            LodgingCheckoutRowsKt.CheckoutFactRow(agentPermissionDetailRow.label, Collections.singletonList(agentPermissionDetailRow.value), null, bfm, 0, 4);
                            i2 = i3;
                        }
                    }
                    AnonymousClass003.A0q(bbi);
                    return;
                }
                throw F60.createAndThrow();
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.ReservationCheckoutDetailsSheetKt$ReservationCheckoutDetailsSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$approvalId = str;
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
            ReservationCheckoutDetailsSheetKt.ReservationCheckoutDetailsSheet(this.$approvalId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ReservationCheckoutDetailsSheet(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-778631232);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AgentPermissionTaskDetailsViewModel.Factory factory = new AgentPermissionTaskDetailsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            C1BN<HatchAgentPermissionsRepository.AgentPermissionApproval> c1bn = ((AgentPermissionTaskDetailsViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AgentPermissionTaskDetailsViewModel.class))).approval;
            List<HatchAgentPermissionsRepository.AgentPermissionDetailRow> list = null;
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) C1BO.A07(bfm, c1bn);
            if (agentPermissionApproval != null) {
                HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
                if ((agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.ReservationCheckoutApproval) && (reservationCheckoutApproval = (HatchAgentPermissionsRepository.ReservationCheckoutApproval) agentPermissionRichPayload) != null && reservationCheckoutApproval.hasDetails) {
                    list = agentPermissionApproval.detailRows;
                }
            }
            boolean zA1M = AnonymousClass003.A1M(bfm, list, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new ReservationCheckoutDetailsSheetKt$ReservationCheckoutDetailsSheet$1$1(list, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, list);
            if (list == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass2(str, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, bRg2, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120120), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(list), -932176605), bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 48, 2036);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(str, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }
}
