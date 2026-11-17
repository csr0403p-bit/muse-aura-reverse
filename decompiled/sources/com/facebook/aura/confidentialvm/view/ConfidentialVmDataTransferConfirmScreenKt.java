package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AQC;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmDataTransferConfirmScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataTransferConfirmScreenKt$ConfidentialVmDataTransferConfirmScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, C1BO<ConfidentialVmSwitchUiState> c1bo) {
            super(4);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m462invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m462invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
            C1BO<ConfidentialVmSwitchUiState> c1bo = this.$uiState$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0B = C3U4.A0B(AnonymousClass005.A0T(bfm, AnonymousClass001.A0N(C90l.A00, bs0, true)), AuraDimensKt.SpacingLarge, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A02, bfm, c3th, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            ConfidentialVmDataTransferConfirmScreenKt.DataTransferConfirmHeading(c1bo.getValue().isSwitchingBack(), null, bfm, 0, 2);
            if (c1bo.getValue().hasError) {
                bfm.AgE(-1685603000);
                ConfidentialVmDataChoiceScreenKt.ConfidentialVmSwitchErrorText(C3U4.A0C(new AQC(C2VU.A00), 0.0f, AuraDimensKt.SpacingSmall, 0.0f, 0.0f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1685446357);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f2);
            boolean zA1J = AnonymousClass003.A1J(bfm, c1bo, confidentialVmSwitchViewModel);
            Object objAaT = bfm.AaT();
            if (zA1J || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmDataTransferConfirmScreenKt$ConfidentialVmDataTransferConfirmScreen$2$1$2$1(confidentialVmSwitchViewModel, c1bo);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0C, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataTransferConfirmScreenKt$ConfidentialVmDataTransferConfirmScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmDataTransferConfirmScreenKt.ConfidentialVmDataTransferConfirmScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataTransferConfirmScreenKt$DataTransferConfirmHeading$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isSwitchingBack;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$isSwitchingBack = z;
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
            ConfidentialVmDataTransferConfirmScreenKt.DataTransferConfirmHeading(this.$isSwitchingBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmDataTransferConfirmScreen(X.BRg r44, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmDataTransferConfirmScreenKt.ConfidentialVmDataTransferConfirmScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }

    public static final void DataTransferConfirmHeading(boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2064516540);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle = AuraHeadlineAndBodyStyle.TITLE2_MEDIUM_SUBHEADLINE_REGULAR;
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingLargePlusMicro);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120737);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            int i4 = R.string._name_removed__res_0x7f120735;
            if (z) {
                i4 = R.string._name_removed__res_0x7f120762;
            }
            AuraHeadlineAndBodyKt.AuraHeadlineAndBody(auraHeadlineAndBodyStyle, bRgA07, strA01, null, null, AnonymousClass005.A0X(AnonymousClass006.A0v(bfm, i4)), null, null, 0, ComposableSingletons$ConfidentialVmDataTransferConfirmScreenKt.f20lambda$1516153386, null, null, null, null, c1822Arm, null, bfm, 805306374, 0, 48600);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConfidentialVmSwitchUiState access$ConfidentialVmDataTransferConfirmScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSwitchUiState) c1bo.getValue();
    }
}
