package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
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
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
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
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsViewModel;
import com.facebook.aura.flight.ui.FlightSegmentCardKt;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightCheckoutLegSheetKt {

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutLegSheetKt$FlightCheckoutLegBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, BRg bRg, int i, int i2) {
            super(2);
            this.$slice = flightCheckoutSlice;
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
            FlightCheckoutLegSheetKt.FlightCheckoutLegBody(this.$slice, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutLegSheetKt$FlightCheckoutLegSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C108322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ int $sliceIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108322(String str, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$sliceIndex = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutLegSheetKt.FlightCheckoutLegSheet(this.$approvalId, this.$sliceIndex, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutLegSheetKt$FlightCheckoutLegSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutSlice $slice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice) {
            super(3);
            this.$slice = flightCheckoutSlice;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                FlightCheckoutLegSheetKt.FlightCheckoutLegBody(this.$slice, null, bfm, HatchAgentPermissionsRepository.FlightCheckoutSlice.$stable, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutLegSheetKt$FlightCheckoutLegSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ int $sliceIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$sliceIndex = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutLegSheetKt.FlightCheckoutLegSheet(this.$approvalId, this.$sliceIndex, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void FlightCheckoutLegSheet(String str, int i, BFM bfm, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval;
        List<HatchAgentPermissionsRepository.FlightCheckoutSlice> list;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1126611468);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AgentPermissionTaskDetailsViewModel.Factory factory = new AgentPermissionTaskDetailsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice = null;
            C1BO c1boA02 = C2CK.A02(bfm, ((AgentPermissionTaskDetailsViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(AgentPermissionTaskDetailsViewModel.class))).approval);
            HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApprovalA0N = C3cH.A0N(c1boA02);
            HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApprovalA0N != null ? agentPermissionApprovalA0N.richPayload : null;
            if ((agentPermissionRichPayload instanceof HatchAgentPermissionsRepository.FlightCheckoutApproval) && (flightCheckoutApproval = (HatchAgentPermissionsRepository.FlightCheckoutApproval) agentPermissionRichPayload) != null && (list = flightCheckoutApproval.slices) != null) {
                flightCheckoutSlice = (HatchAgentPermissionsRepository.FlightCheckoutSlice) AbstractC0878AGe.A0A(i, list);
            }
            boolean zA1M = AnonymousClass003.A1M(bfm, flightCheckoutSlice, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new FlightCheckoutLegSheetKt$FlightCheckoutLegSheet$1$1(flightCheckoutSlice, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, flightCheckoutSlice);
            if (flightCheckoutSlice == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new C108322(str, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            BRg bRgA0U = AnonymousClass001.A0U(BRg.A00, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.5f);
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            boolean zA1J = AnonymousClass003.A1J(bfm, c1boA02, auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == C78N.A00) {
                objAaT2 = new FlightCheckoutLegSheetKt$FlightCheckoutLegSheet$3$1(auraNavigatorA0b, c1boA02);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA0U, null, null, null, null, (Function0) objAaT2, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(flightCheckoutSlice), 63816689), bfm, 6, 48, 1980);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void FlightCheckoutLegBody(HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice, BRg bRg, BFM bfm, int i, int i2) {
        String strFlightSliceTitle;
        boolean z;
        String strFlightSliceSubtitle;
        BRg bRg2 = bRg;
        bfm.AgG(1331576080);
        int iA05 = (i & 6) == 0 ? i | AnonymousClass002.A05(AnonymousClass004.A1X(flightCheckoutSlice, bfm, i) ? 1 : 0) : i;
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
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgThen, 0.0f, f, 0.0f, 0.0f);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
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
                float f2 = AuraDimensKt.SpacingLarge;
                BRg bRgA0B = C3U4.A0B(c1062ATq, f2, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                String str = flightCheckoutSlice.title;
                if (str == null || (strFlightSliceTitle = CheckoutRowPrimitivesKt.trimToNonEmpty(str)) == null) {
                    bfm.AgE(217396219);
                    strFlightSliceTitle = FlightCheckoutApprovalCardKt.flightSliceTitle(flightCheckoutSlice, bfm, HatchAgentPermissionsRepository.FlightCheckoutSlice.$stable | (iA05 & 14));
                } else {
                    bfm.AgE(217395196);
                }
                BBI.A0R(bbi, false);
                if (strFlightSliceTitle == null) {
                    bfm.AgE(-1850615346);
                    BBI.A0R(bbi, false);
                    z = true;
                } else {
                    bfm.AgE(-1850615345);
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
                    long jA06 = C3cH.A06(bfm, auraTheme);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = FlightCheckoutLegSheetKt$FlightCheckoutLegBody$1$1$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    z = true;
                    AuraTextKt.m2639AuraTextUY9GdpU(strFlightSliceTitle, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14768);
                    BBI.A0R(bbi, false);
                }
                String str2 = flightCheckoutSlice.subtitle;
                if (str2 == null || (strFlightSliceSubtitle = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) == null) {
                    bfm.AgE(217410206);
                    strFlightSliceSubtitle = FlightCheckoutApprovalCardKt.flightSliceSubtitle(flightCheckoutSlice, bfm, HatchAgentPermissionsRepository.FlightCheckoutSlice.$stable | (iA05 & 14));
                } else {
                    bfm.AgE(217409090);
                }
                BBI.A0R(bbi, false);
                if (strFlightSliceSubtitle == null) {
                    bfm.AgE(-1850179269);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(-1850179268);
                    AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                    AuraTextKt.m2639AuraTextUY9GdpU(strFlightSliceSubtitle, c1062ATq, C3cH.A07(bfm, auraTheme2), auraTheme2.getTypography(bfm, 6).caption1Regular, null, null, C3cH.A0F(3), false, 0, z ? 1 : 0, 2, null, null, null, bfm, 805306416, 6, 14768);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, z);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f2, bfm, 0);
                BRg bRgA0B2 = C3U4.A0B(c1062ATq, f2, 0.0f);
                InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0B2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                bfm.AgE(-1582291495);
                List<HatchAgentPermissionsRepository.FlightCheckoutSegment> list = flightCheckoutSlice.segments;
                ArrayList arrayListA0h = C3cG.A0h();
                for (HatchAgentPermissionsRepository.FlightCheckoutSegment flightCheckoutSegment : list) {
                    if (FlightSegmentUiMapperKt.hasRenderableContent(flightCheckoutSegment)) {
                        arrayListA0h.add(flightCheckoutSegment);
                    }
                }
                int i4 = 0;
                for (Object obj : arrayListA0h) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        HatchAgentPermissionsRepository.FlightCheckoutSegment flightCheckoutSegment2 = (HatchAgentPermissionsRepository.FlightCheckoutSegment) obj;
                        if (i4 > 0) {
                            bfm.AgE(-1882584576);
                            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingMedium, bfm, 0);
                        } else {
                            bfm.AgE(-1882524033);
                        }
                        BBI.A0R(bbi, false);
                        FlightSegmentCardKt.FlightSegmentCard(FlightSegmentUiMapperKt.rememberUiModel(flightCheckoutSegment2, bfm, HatchAgentPermissionsRepository.FlightCheckoutSegment.$stable), null, bfm, 0, 2);
                        i4 = i5;
                    }
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, z);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
                BBI.A0R(bbi, z);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(flightCheckoutSlice, bRg2, i, i2);
        }
    }
}
