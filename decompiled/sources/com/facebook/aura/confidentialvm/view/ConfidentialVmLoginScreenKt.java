package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.ARD;
import X.AbstractC1103AYp;
import X.AbstractC1742Apf;
import X.AbstractC2271BQs;
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
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0v5;
import X.C10G;
import X.C1110AYw;
import X.C1515AkP;
import X.C15z;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.confidentialvm.model.ConfidentialVmLoginError;
import com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmLoginScreenKt {
    public static final int LOW_ATTEMPTS_THRESHOLD = 5;

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isMandatoryEnrollment;
        public final /* synthetic */ RegisterPinEntryPoint $setupEntryPoint;
        public final /* synthetic */ C1BO<ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RegisterPinEntryPoint registerPinEntryPoint, boolean z, C1BO<ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState> c1bo) {
            super(2);
            this.$setupEntryPoint = registerPinEntryPoint;
            this.$isMandatoryEnrollment = z;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            boolean z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (this.$setupEntryPoint != null && !this.$isMandatoryEnrollment && !this.$uiState$delegate.getValue().isSubmitting) {
                    z = false;
                }
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$3$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                B81.A00(z, (Function0) objAaT, bfm, 48, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RegisterPinEntryPoint $setupEntryPoint;
        public final /* synthetic */ ConfidentialVmLoginViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(BRg bRg, RegisterPinEntryPoint registerPinEntryPoint, ConfidentialVmLoginViewModel confidentialVmLoginViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$setupEntryPoint = registerPinEntryPoint;
            this.$viewModel = confidentialVmLoginViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmLoginScreenKt.ConfidentialVmLoginScreen(this.$modifier, this.$setupEntryPoint, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<Integer> $cooldownSecondsRemaining$delegate;
        public final /* synthetic */ Function0<Unit> $onHelpClick;
        public final /* synthetic */ C1BO<ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmLoginViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(Function0<Unit> function0, ConfidentialVmLoginViewModel confidentialVmLoginViewModel, C1BO<ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState> c1bo, C1BO<Integer> c1bo2) {
            super(4);
            this.$onHelpClick = function0;
            this.$viewModel = confidentialVmLoginViewModel;
            this.$uiState$delegate = c1bo;
            this.$cooldownSecondsRemaining$delegate = c1bo2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m465invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m465invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (this.$uiState$delegate.getValue().isPermanentlyLocked) {
                bfm.AgE(-502560466);
                ConfidentialVmLoginScreenKt.LockedContent(this.$onHelpClick, null, bfm, 0, 2);
            } else {
                bfm.AgE(-502486810);
                String str = this.$uiState$delegate.getValue().pin;
                ConfidentialVmLoginViewModel confidentialVmLoginViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(confidentialVmLoginViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$8$1$1(confidentialVmLoginViewModel);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT);
                ConfidentialVmLoginViewModel confidentialVmLoginViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(confidentialVmLoginViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$8$2$1(confidentialVmLoginViewModel2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                Function0<Unit> function02 = this.$onHelpClick;
                if (this.$uiState$delegate.getValue().isPinComplete() && !this.$uiState$delegate.getValue().isSubmitting && this.$cooldownSecondsRemaining$delegate.getValue() == null) {
                    z = true;
                }
                ConfidentialVmLoginScreenKt.LoginContent(str, g0u, function0, function02, z, this.$uiState$delegate.getValue().isSubmitting, this.$uiState$delegate.getValue().error, this.$uiState$delegate.getValue().attemptsRemaining, this.$cooldownSecondsRemaining$delegate.getValue(), null, bfm, 0, 512);
            }
            AnonymousClass002.A19(bfm);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RegisterPinEntryPoint $setupEntryPoint;
        public final /* synthetic */ ConfidentialVmLoginViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(BRg bRg, RegisterPinEntryPoint registerPinEntryPoint, ConfidentialVmLoginViewModel confidentialVmLoginViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$setupEntryPoint = registerPinEntryPoint;
            this.$viewModel = confidentialVmLoginViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmLoginScreenKt.ConfidentialVmLoginScreen(this.$modifier, this.$setupEntryPoint, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$LockedContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onHelpClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onHelpClick = function0;
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
            ConfidentialVmLoginScreenKt.LockedContent(this.$onHelpClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$LoginContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C112632 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Integer $attemptsRemaining;
        public final /* synthetic */ Integer $cooldownSecondsRemaining;
        public final /* synthetic */ ConfidentialVmLoginError $error;
        public final /* synthetic */ Function0<Unit> $onHelpClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112632(ConfidentialVmLoginError confidentialVmLoginError, Integer num, Integer num2, Function0<Unit> function0) {
            super(2);
            this.$error = confidentialVmLoginError;
            this.$cooldownSecondsRemaining = num;
            this.$attemptsRemaining = num2;
            this.$onHelpClick = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) throws Resources.NotFoundException {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x016a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r26, int r27) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 462
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt.C112632.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt$LoginContent$3, reason: invalid class name and case insensitive filesystem */
    public final class C112643 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $attemptsRemaining;
        public final /* synthetic */ Integer $cooldownSecondsRemaining;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ ConfidentialVmLoginError $error;
        public final /* synthetic */ boolean $loading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onHelpClick;
        public final /* synthetic */ G0U<String, Unit> $onPinChange;
        public final /* synthetic */ Function0<Unit> $onPrimaryClick;
        public final /* synthetic */ String $pin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C112643(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, ConfidentialVmLoginError confidentialVmLoginError, Integer num, Integer num2, BRg bRg, int i, int i2) {
            super(2);
            this.$pin = str;
            this.$onPinChange = g0u;
            this.$onPrimaryClick = function0;
            this.$onHelpClick = function02;
            this.$enabled = z;
            this.$loading = z2;
            this.$error = confidentialVmLoginError;
            this.$attemptsRemaining = num;
            this.$cooldownSecondsRemaining = num2;
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
            ConfidentialVmLoginScreenKt.LoginContent(this.$pin, this.$onPinChange, this.$onPrimaryClick, this.$onHelpClick, this.$enabled, this.$loading, this.$error, this.$attemptsRemaining, this.$cooldownSecondsRemaining, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0253 A[PHI: r6
  0x0253: PHI (r6v8 boolean) = (r6v3 boolean), (r6v9 boolean) binds: [B:31:0x0083, B:29:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[PHI: r6
  0x007e: PHI (r6v3 boolean) = (r6v2 boolean), (r6v9 boolean) binds: [B:27:0x0079, B:29:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmLoginScreen(X.BRg r55, com.facebook.aura.navigation.key.RegisterPinEntryPoint r56, com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel r57, X.BFM r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmLoginScreenKt.ConfidentialVmLoginScreen(X.BRg, com.facebook.aura.navigation.key.RegisterPinEntryPoint, com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel, X.BFM, int, int):void");
    }

    public static final void LockedContent(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1005384082);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(C15z.A00(bfm, AnonymousClass001.A0T(bRg2)), AuraDimensKt.SpacingLarge, 0.0f);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgA0B, 0.0f, f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0J, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            ConfidentialVmPinEntryContentKt.m467ConfidentialVmHeaderGh5yOYU(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f12078d), AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f12078c), null, false, 0.0f, 0.0f, null, f, true, null, bfm, 100663296, 636);
            C01N.A08(bfm, BRg.A00, AuraDimensKt.SpacingLargePlusMicro);
            BRg bRgA05 = C0v5.A05(AnonymousClass006.A0O(C10G.A02), null, function0, true);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA05);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120781), null, C06G.A07(bfm), C06G.A0V(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void LoginContent(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, ConfidentialVmLoginError confidentialVmLoginError, Integer num, Integer num2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1518648857);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z2);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0I(bfm, AnonymousClass003.A0K(confidentialVmLoginError));
        }
        if ((12582912 & i) == 0) {
            iA0d |= AnonymousClass004.A0k(bfm, num);
        }
        if ((100663296 & i) == 0) {
            iA0d |= AnonymousClass004.A0l(bfm, num2);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0d |= iA0m;
        } else if ((805306368 & i) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0d |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 306783379, 306783378), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            boolean zA01 = AbstractC1742Apf.A01(bfm);
            Boolean boolValueOf = Boolean.valueOf(zA01);
            Integer numValueOf = Integer.valueOf(c1110AYwA00.A01.AGd());
            boolean zA1S = AnonymousClass003.A1S(bfm, c1110AYwA00, zA01);
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmLoginScreenKt$LoginContent$1$1(zA01, c1110AYwA00, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A1A(bfm, objAaT, boolValueOf, numValueOf);
            ConfidentialVmPinEntryContentKt.m468ConfidentialVmPinEntryContentn87flQE(str, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12078f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12078e), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120797), g0u, function0, z, bRg2, false, z2, false, AnonymousClass002.A1Y(num2), null, c1110AYwA00, null, B1V.A00(bfm, new C112632(confidentialVmLoginError, num2, num, function02), -380991645), bfm, AnonymousClass001.A06(iA0d << 12, AnonymousClass001.A0C(iA0d >> 6, AnonymousClass001.A05(iA0d << 6, AnonymousClass004.A03(iA0d << 9, iA0d & 14)))), 196608, 21760);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112643(str, g0u, function0, function02, z, z2, confidentialVmLoginError, num, num2, bRg2, i, i2);
        }
    }

    /* renamed from: PinCaptionText-8V94_ZQ, reason: not valid java name */
    public static final void m463PinCaptionText8V94_ZQ(String str, long j, BRg bRg, boolean z, String str2, BFM bfm, int i, int i2) {
        String str3;
        BRg bRg2 = bRg;
        boolean z2 = z;
        bfm.AgG(-111945534);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            str3 = i5 == 0 ? str2 : null;
            C1822Arm c1822ArmA0S = C06G.A0S(bfm);
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium);
            boolean zA1L = AnonymousClass005.A1L(iA0d) | AnonymousClass004.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1L || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmLoginScreenKt$PinCaptionText$1$1(str3, z2);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA07, (G0U) objAaT, false), j, c1822ArmA0S, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0, 16304);
        } else {
            bfm.Afo();
            str3 = str2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConfidentialVmLoginScreenKt$PinCaptionText$2(str, j, bRg2, z2, str3, i, i2);
        }
    }

    public static final /* synthetic */ ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState access$ConfidentialVmLoginScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState) c1bo.getValue();
    }

    public static final /* synthetic */ Integer access$ConfidentialVmLoginScreen$lambda$1(C1BO c1bo) {
        return (Integer) c1bo.getValue();
    }

    public static final String formatCooldown(int i) {
        return AnonymousClass007.A0X(i);
    }
}
