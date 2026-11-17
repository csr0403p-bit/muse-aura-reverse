package com.facebook.aura.confidentialvm.view;

import X.AHD;
import X.AKQ;
import X.ARD;
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
import X.ApQ;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
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
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
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
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropBullet;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariant;
import com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmWaitlistJoinFailure;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.settings.AuraExternalUriRegistry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.tag.AuraStatusTagKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyKt;
import com.facebook.aura.vds.compose.typegroup.AuraHeadlineAndBodyStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmSwitchIntroScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroError$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $textRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$textRes = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchIntroScreenKt.ConfidentialVmSwitchIntroError(this.$textRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C112782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSecondaryClick;
        public final /* synthetic */ Function0<Unit> $onSwitchClick;
        public final /* synthetic */ ConfidentialVmSwitchUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112782(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = confidentialVmSwitchUiState;
            this.$onSwitchClick = function0;
            this.$onSecondaryClick = function02;
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
            ConfidentialVmSwitchIntroScreenKt.ConfidentialVmSwitchIntroFooter(this.$uiState, this.$onSwitchClick, this.$onSecondaryClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroHeading$2, reason: invalid class name and case insensitive filesystem */
    public final class C112792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isWaitlist;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmValuePropsVariant $serverCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112792(boolean z, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant, BRg bRg, int i, int i2) {
            super(2);
            this.$isWaitlist = z;
            this.$serverCopy = confidentialVmValuePropsVariant;
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
            ConfidentialVmSwitchIntroScreenKt.ConfidentialVmSwitchIntroHeading(this.$isWaitlist, this.$serverCopy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<ConfidentialVmSwitchUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, AuraNavigator auraNavigator, C1BO<ConfidentialVmSwitchUiState> c1bo) {
            super(4);
            this.$viewModel = confidentialVmSwitchViewModel;
            this.$navigator = auraNavigator;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m477invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m477invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$uiState$delegate.getValue().isLoading()) {
                bfm.AgE(274424283);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
                BRg bRgA02 = C10G.A02(C2VU.A09, C10G.A01, false);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$4$1$1(strA01);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
                AnonymousClass001.A1D(bfm);
                return;
            }
            AnonymousClass003.A0l(bfm, 274780814);
            ConfidentialVmSwitchUiState value = this.$uiState$delegate.getValue();
            Object obj = this.$viewModel;
            boolean zA67 = bfm.A67(obj);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$4$2$1(obj);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A67(this.$viewModel));
            ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel = this.$viewModel;
            AuraNavigator auraNavigator = this.$navigator;
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == C78N.A00) {
                objAaT3 = new ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$4$3$1(confidentialVmSwitchViewModel, auraNavigator);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            Object obj2 = this.$viewModel;
            boolean zA672 = bfm.A67(obj2);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == C78N.A00) {
                objAaT4 = new ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$4$4$1(obj2);
                bfm.Ai0(objAaT4);
            }
            int i2 = iA04 << 12;
            ConfidentialVmSwitchIntroScreenKt.m475ConfidentialVmSwitchIntroContent3GLzNTs(value, function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT4), f, f2, null, bfm, (i2 & 458752) | AnonymousClass001.A0A(i2, ConfidentialVmSwitchUiState.$stable), 64);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmSwitchEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint, BRg bRg, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = confidentialVmSwitchEntryPoint;
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
            ConfidentialVmSwitchIntroScreenKt.ConfidentialVmSwitchIntroScreen(this.$entryPoint, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: ConfidentialVmSwitchIntroContent-3GLzNTs, reason: not valid java name */
    public static final void m475ConfidentialVmSwitchIntroContent3GLzNTs(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(812275526);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(confidentialVmSwitchUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A08(bfm, f);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A09(bfm, f2);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA05 |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA05 |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA05, 599186), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0T2 = AnonymousClass005.A0T(bfm, AnonymousClass001.A0N(c90l, bs0, true));
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(bRgA0T2, f3, 0.0f, f3, AuraDimensKt.SpacingXlarge);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            ConfidentialVmSwitchIntroHeading(confidentialVmSwitchUiState.isWaitlist(), confidentialVmSwitchUiState.getIntroCopy(), null, bfm, 0, 4);
            AHD<ConfidentialVmValuePropBullet> valuePropBullets = confidentialVmSwitchUiState.getValuePropBullets();
            String string = AuraExternalUriRegistry.confidentialVmLearnMoreUri.uri.toString();
            C7384Etj.A0U(string);
            ConfidentialVmBenefitsKt.ConfidentialVmBenefits(valuePropBullets, string, function03, C3U4.A0C(bs0, 0.0f, f3, 0.0f, 0.0f), bfm, (iA05 >> 3) & 896, 0);
            int i5 = ConfidentialVmSwitchUiState.$stable;
            int i6 = iA05 & 14;
            String strAvailabilityBannerText = availabilityBannerText(confidentialVmSwitchUiState, bfm, i5 | i6);
            if (strAvailabilityBannerText == null) {
                bfm.AgE(-1482106980);
            } else {
                bfm.AgE(-1482106979);
                ConfidentialVmBenefitsKt.ConfidentialVmAvailabilityNotice(strAvailabilityBannerText, C3U4.A0C(bs0, 0.0f, f3, 0.0f, 0.0f), bfm, 0, 0);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            ConfidentialVmSwitchIntroFooter(confidentialVmSwitchUiState, function0, function02, C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f2), bfm, AnonymousClass002.A07(iA05, i5 | i6), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroContent$2(confidentialVmSwitchUiState, function0, function02, function03, f, f2, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmSwitchIntroError(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1734492810);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i);
            C1822Arm c1822ArmA0S = C06G.A0S(bfm);
            long j = AnonymousClass002.A0c(bfm).destructiveText;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmSwitchIntroScreenKt$ConfidentialVmSwitchIntroError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, ARD.A01(bRgA0R, (G0U) objAaT, false), j, c1822ArmA0S, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i, bRg2, i2, i3);
        }
    }

    public static final void ConfidentialVmSwitchIntroFooter(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(1727769554);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(confidentialVmSwitchUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
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
            ConfidentialVmValuePropsVariant introCopy = confidentialVmSwitchUiState.getIntroCopy();
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingLargePlusMicro;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bs0, f, f2, f, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, f2, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            ConfidentialVmDisclosure introDisclosure = confidentialVmSwitchUiState.getIntroDisclosure();
            if (introDisclosure == null) {
                bfm.AgE(683705736);
            } else {
                bfm.AgE(683705737);
                ConfidentialVmSwitchIntroLegalTextKt.ConfidentialVmSwitchIntroLegalText(introDisclosure, null, null, bfm, 0, 6);
            }
            BBI.A0R(bbi, false);
            Integer numErrorRes = errorRes(confidentialVmSwitchUiState);
            if (numErrorRes == null) {
                bfm.AgE(683790521);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(683790522);
                ConfidentialVmSwitchIntroError(numErrorRes.intValue(), null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            String strServerContinueLabel = serverContinueLabel(confidentialVmSwitchUiState);
            if (strServerContinueLabel == null) {
                bfm.AgE(1407534636);
                strServerContinueLabel = AbstractC2271BQs.A01(bfm, continueLabelRes(confidentialVmSwitchUiState));
            } else {
                bfm.AgE(1407533613);
            }
            BBI.A0R(bbi, false);
            C1062ATq c1062ATq = C10G.A02;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strServerContinueLabel, null, c1062ATq, null, null, null, false, false, !confidentialVmSwitchUiState.isOnWaitlist(), confidentialVmSwitchUiState.isJoiningWaitlist, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, (iA05 << 9) & 57344, 0, 134199797);
            if (introCopy == null || (str = introCopy.secondaryButtonText) == null) {
                bfm.AgE(684170364);
            } else {
                bfm.AgE(684170365);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, str, null, c1062ATq, AuraButtonStyles.INSTANCE.tertiary(null, bfm, 48, 1), null, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, (iA05 << 6) & 57344, 0, 134201317);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112782(confidentialVmSwitchUiState, function0, function02, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmSwitchIntroHeading(boolean z, ConfidentialVmValuePropsVariant confidentialVmValuePropsVariant, BRg bRg, BFM bfm, int i, int i2) {
        String strA0s;
        ApQ apQA0X;
        String str;
        BRg bRg2 = bRg;
        bfm.AgG(1803506308);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, confidentialVmValuePropsVariant);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), AuraDimensKt.SpacingMicro);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingMedium), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraStatusTagKt.m2637AuraStatusTagRWsq2U(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12072c), C06G.A08(bfm), null, 0L, bfm, 0, 12);
            AuraHeadlineAndBodyStyle auraHeadlineAndBodyStyle = AuraHeadlineAndBodyStyle.TITLE2_MEDIUM_SUBHEADLINE_REGULAR;
            if (confidentialVmValuePropsVariant == null || (strA0s = confidentialVmValuePropsVariant.title) == null) {
                bfm.AgE(354663700);
                int i4 = R.string._name_removed__res_0x7f12076c;
                if (z) {
                    i4 = R.string._name_removed__res_0x7f120773;
                }
                strA0s = AnonymousClass001.A0s(bfm, bbi, i4);
            } else {
                bfm.AgE(354662553);
                BBI.A0R(bbi, false);
            }
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            if (confidentialVmValuePropsVariant != null && (str = confidentialVmValuePropsVariant.subtitle) != null) {
                apQA0X = AnonymousClass005.A0X(str);
            } else if (z) {
                bfm.AgE(-1889892752);
                apQA0X = AnonymousClass005.A0X(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120772));
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1889635638);
                BBI.A0R(bbi, false);
                apQA0X = null;
            }
            AuraHeadlineAndBodyKt.AuraHeadlineAndBody(auraHeadlineAndBodyStyle, c1062ATq, strA0s, null, null, apQA0X, null, null, 0, null, null, null, null, null, c1822Arm, null, bfm, 54, 0, 49112);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112792(z, confidentialVmValuePropsVariant, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSwitchIntroScreen(com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint r48, X.BRg r49, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel r50, X.BFM r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchIntroScreenKt.ConfidentialVmSwitchIntroScreen(com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel, X.BFM, int, int):void");
    }

    public static final Integer errorRes(ConfidentialVmSwitchUiState confidentialVmSwitchUiState) {
        int i;
        ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure = confidentialVmSwitchUiState.joinWaitlistFailure;
        if (confidentialVmWaitlistJoinFailure == ConfidentialVmWaitlistJoinFailure.NOT_ELIGIBLE) {
            i = R.string._name_removed__res_0x7f120776;
        } else {
            if (!confidentialVmSwitchUiState.isUnavailable() && confidentialVmWaitlistJoinFailure == null) {
                return null;
            }
            i = R.string._name_removed__res_0x7f120b19;
        }
        return Integer.valueOf(i);
    }

    public static final /* synthetic */ ConfidentialVmSwitchUiState access$ConfidentialVmSwitchIntroScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmSwitchUiState) c1bo.getValue();
    }

    public static final String availabilityBannerText(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, BFM bfm, int i) {
        ConfidentialVmValuePropsVariant introCopy = confidentialVmSwitchUiState.getIntroCopy();
        if (introCopy != null) {
            AnonymousClass004.A1A(bfm, -1094740408);
            return introCopy.bannerText;
        }
        if (confidentialVmSwitchUiState.isWaitlist()) {
            AnonymousClass004.A1A(bfm, 422822239);
            return null;
        }
        bfm.AgE(-1094738620);
        return AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120769);
    }

    public static final int continueLabelRes(ConfidentialVmSwitchUiState confidentialVmSwitchUiState) {
        return confidentialVmSwitchUiState.isUnavailable() ? R.string._name_removed__res_0x7f120234 : confidentialVmSwitchUiState.isOnWaitlist() ? R.string._name_removed__res_0x7f120775 : confidentialVmSwitchUiState.isWaitlist() ? R.string._name_removed__res_0x7f120774 : confidentialVmSwitchUiState.isSubscriptionRequired() ? R.string._name_removed__res_0x7f12076f : R.string._name_removed__res_0x7f120770;
    }

    public static final String serverContinueLabel(ConfidentialVmSwitchUiState confidentialVmSwitchUiState) {
        boolean zIsOnWaitlist = confidentialVmSwitchUiState.isOnWaitlist();
        ConfidentialVmValuePropsVariant introCopy = confidentialVmSwitchUiState.getIntroCopy();
        if (zIsOnWaitlist) {
            if (introCopy != null) {
                return introCopy.joinedButtonText;
            }
            return null;
        }
        if (introCopy != null) {
            return introCopy.primaryButtonText;
        }
        return null;
    }
}
