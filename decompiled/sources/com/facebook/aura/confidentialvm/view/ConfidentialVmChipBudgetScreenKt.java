package com.facebook.aura.confidentialvm.view;

import X.AGI;
import X.AHH;
import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1SA;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmChipBudgetViewModelKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmChipBudgetScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Boolean> $isRetrying$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ ConfidentialVmChipBudgetViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C1BO<Boolean> c1bo, ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel, AuraNavigator auraNavigator) {
            super(4);
            this.$isRetrying$delegate = c1bo;
            this.$viewModel = confidentialVmChipBudgetViewModel;
            this.$navigator = auraNavigator;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m459invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m459invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 = i | AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 131, 130), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            C1BO<Boolean> c1bo = this.$isRetrying$delegate;
            ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel = this.$viewModel;
            AuraNavigator auraNavigator = this.$navigator;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            ConfidentialVmChipBudgetScreenKt.m457ChipBudgetMessageorJrPs(f, AnonymousClass007.A0H(bfm, AnonymousClass001.A0N(C90l.A00, bs0, true), C10G.A02), bfm, iA04 & 14, 0);
            boolean zA1T = AnonymousClass004.A1T(bfm, confidentialVmChipBudgetViewModel, auraNavigator, bfm.A65(c1bo));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$3$1$1$1(confidentialVmChipBudgetViewModel, c1bo, auraNavigator);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BRg bRg, int i, int i2) {
            super(2);
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
            ConfidentialVmChipBudgetScreenKt.ConfidentialVmChipBudgetScreen(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: ChipBudgetMessage--orJrPs, reason: not valid java name */
    public static final void m457ChipBudgetMessageorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-566899057);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C3TH c3th = C2VU.A00;
            BRg bRgA0B = C3U4.A0B(bRg2, AuraDimensKt.SpacingXlarge, 0.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConfidentialVmChipBudgetScreenKt$ChipBudgetMessage$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f);
            C1SA.A00(bfm, null, C10G.A07(bs0, OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48, 120);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12077e);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            long jA0C = C06G.A0C(bfm);
            C1062ATq c1062ATq = C10G.A02;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = ConfidentialVmChipBudgetScreenKt$ChipBudgetMessage$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12077c), c1062ATq, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConfidentialVmChipBudgetScreenKt$ChipBudgetMessage$3(f, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmChipBudgetScreen(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1757502643);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            ConfidentialVmChipBudgetViewModel confidentialVmChipBudgetViewModel = ConfidentialVmChipBudgetViewModelKt.confidentialVmChipBudgetViewModel(bfm, 0);
            C1BO c1boA02 = C2CK.A02(bfm, confidentialVmChipBudgetViewModel.isRetrying);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass001.A0j(bfm, AnonymousClass002.A1Y(confidentialVmChipBudgetViewModel.stopped.getValue()));
            }
            if (AnonymousClass001.A1X(objAaT)) {
                bfm.AgE(-2109558960);
                Unit unit = Unit.INSTANCE;
                boolean zA67 = bfm.A67(auraNavigatorA0b);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == obj) {
                    objAaT2 = new ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$1$1(auraNavigatorA0b);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A17(bfm, objAaT2, unit);
            } else {
                bfm.AgE(-2109431147);
            }
            AnonymousClass001.A1D(bfm);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AHH ahhA0E = AGI.A0E(HeaderButton.Settings);
            boolean zA1M = AnonymousClass003.A1M(bfm, confidentialVmChipBudgetViewModel, auraNavigatorA0b);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == obj) {
                objAaT3 = new ConfidentialVmChipBudgetScreenKt$ConfidentialVmChipBudgetScreen$2$1(confidentialVmChipBudgetViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT3);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRg2, null, 0L, null, null, null, null, false, false, 0, null, null, ahhA0E, (G0U) objAaT3, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass3(c1boA02, confidentialVmChipBudgetViewModel, auraNavigatorA0b), -355888152), bfm, ((iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805306374, 3072, 805306416, 534748668);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(bRg2, i, i2);
        }
    }
}
