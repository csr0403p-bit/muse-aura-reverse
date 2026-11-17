package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AbstractC1754Apr;
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
import X.B1V;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmRegisterPinScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(RegisterPinEntryPoint registerPinEntryPoint, BRg bRg, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmRegisterPinViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmRegisterPinScreenKt.ConfidentialVmRegisterPinScreen(this.$entryPoint, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $buttonText;
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ boolean $isFromSettings;
        public final /* synthetic */ String $title;
        public final /* synthetic */ C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(String str, String str2, String str3, String str4, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, boolean z, C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> c1bo) {
            super(4);
            this.$title = str;
            this.$description = str2;
            this.$buttonText = str3;
            this.$errorMessage = str4;
            this.$viewModel = confidentialVmRegisterPinViewModel;
            this.$isFromSettings = z;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m471invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m471invokei1RSzL4(float r19, float r20, X.BFM r21, int r22) {
            /*
                r18 = this;
                r4 = r22
                r0 = r22 & 6
                r3 = r19
                r1 = r21
                if (r0 != 0) goto L10
                int r0 = X.AnonymousClass004.A04(r1, r3)
                r4 = r22 | r0
            L10:
                r2 = r4 & 131(0x83, float:1.84E-43)
                r0 = 130(0x82, float:1.82E-43)
                boolean r0 = X.AnonymousClass002.A1P(r2, r0)
                boolean r0 = X.AnonymousClass001.A1b(r0, r1, r4)
                if (r0 == 0) goto Ld2
                r0 = r18
                X.1BO<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r0.$uiState$delegate
                java.lang.Object r2 = r2.getValue()
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r2 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r2
                java.lang.String r5 = r2.pin
                java.lang.String r6 = r0.$title
                java.lang.String r7 = r0.$description
                java.lang.String r8 = r0.$buttonText
                X.1BO<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r0.$uiState$delegate
                java.lang.Object r2 = r2.getValue()
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r2 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r2
                boolean r9 = r2.isPinMismatch
                java.lang.String r10 = r0.$errorMessage
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel r4 = r0.$viewModel
                boolean r2 = r1.A67(r4)
                java.lang.Object r11 = r1.AaT()
                if (r2 != 0) goto L4c
                java.lang.Object r2 = X.C78N.A00
                if (r11 != r2) goto L54
            L4c:
                com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12$1$1 r11 = new com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12$1$1
                r11.<init>(r4)
                r1.Ai0(r11)
            L54:
                X.EnQ r11 = (X.InterfaceC7353EnQ) r11
                X.G0U r11 = (X.G0U) r11
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel r4 = r0.$viewModel
                boolean r2 = r1.A67(r4)
                java.lang.Object r12 = r1.AaT()
                if (r2 != 0) goto L68
                java.lang.Object r2 = X.C78N.A00
                if (r12 != r2) goto L70
            L68:
                com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12$2$1 r12 = new com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12$2$1
                r12.<init>(r4)
                r1.Ai0(r12)
            L70:
                X.EnQ r12 = (X.InterfaceC7353EnQ) r12
                kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
                X.1BO<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r0.$uiState$delegate
                java.lang.Object r2 = r2.getValue()
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r2 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r2
                boolean r2 = r2.isPinComplete()
                if (r2 == 0) goto L8f
                X.1BO<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r0.$uiState$delegate
                java.lang.Object r2 = r2.getValue()
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r2 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r2
                boolean r2 = r2.isSubmitting
                r13 = 1
                if (r2 == 0) goto L90
            L8f:
                r13 = 0
            L90:
                X.1BO<com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState> r2 = r0.$uiState$delegate
                java.lang.Object r2 = r2.getValue()
                com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel$ConfidentialVmRegisterPinUiState r2 = (com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) r2
                boolean r14 = r2.isSubmitting
                boolean r2 = r0.$isFromSettings
                r15 = r2 ^ 1
                if (r2 == 0) goto Lc8
                r2 = 136020694(0x81b82d6, float:4.6797413E-34)
                com.facebook.aura.vds.compose.theme.AuraTypography r2 = X.AnonymousClass006.A0k(r1, r2)
                X.Arm r2 = r2.title2Medium
            La9:
                boolean r20 = X.AnonymousClass001.A1V(r1)
                boolean r0 = r0.$isFromSettings
                if (r0 == 0) goto Lc6
                X.1DG r0 = new X.1DG
                r0.<init>(r3)
            Lb6:
                r17 = 0
                r22 = 4096(0x1000, float:5.74E-42)
                r19 = r1
                r21 = r20
                r18 = r0
                r16 = r2
                com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt.m469RegisterPinContentjjJOJwI(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return
            Lc6:
                r0 = 0
                goto Lb6
            Lc8:
                r2 = 136089142(0x81c8e36, float:4.711171E-34)
                com.facebook.aura.vds.compose.theme.AuraTypography r2 = X.AnonymousClass006.A0k(r1, r2)
                X.Arm r2 = r2.title1Medium
                goto La9
            Ld2:
                r1.Afo()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt.AnonymousClass12.m471invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(RegisterPinEntryPoint registerPinEntryPoint, BRg bRg, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmRegisterPinViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmRegisterPinScreenKt.ConfidentialVmRegisterPinScreen(this.$entryPoint, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isConfirmStep;
        public final /* synthetic */ boolean $isCvmEnrollment;
        public final /* synthetic */ C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> c1bo) {
            super(2);
            this.$isCvmEnrollment = z;
            this.$isConfirmStep = z2;
            this.$viewModel = confidentialVmRegisterPinViewModel;
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
                if (!this.$isCvmEnrollment && !this.$isConfirmStep && !this.$uiState$delegate.getValue().isSubmitting) {
                    z = false;
                }
                boolean zA1S = AnonymousClass001.A1S(bfm, this.$viewModel, AnonymousClass001.A1U(bfm, this.$isConfirmStep, bfm.A65(this.$uiState$delegate)));
                boolean z2 = this.$isConfirmStep;
                ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel = this.$viewModel;
                C1BO<ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState> c1bo = this.$uiState$delegate;
                Object objAaT = bfm.AaT();
                if (zA1S || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$2$1$1(z2, confidentialVmRegisterPinViewModel, c1bo);
                    bfm.Ai0(objAaT);
                }
                B81.A00(z, (Function0) objAaT, bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(RegisterPinEntryPoint registerPinEntryPoint, BRg bRg, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmRegisterPinViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmRegisterPinScreenKt.ConfidentialVmRegisterPinScreen(this.$entryPoint, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RegisterPinEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmRegisterPinViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(RegisterPinEntryPoint registerPinEntryPoint, BRg bRg, ConfidentialVmRegisterPinViewModel confidentialVmRegisterPinViewModel, int i, int i2) {
            super(2);
            this.$entryPoint = registerPinEntryPoint;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmRegisterPinViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmRegisterPinScreenKt.ConfidentialVmRegisterPinScreen(this.$entryPoint, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$RegistrationLookupFailureContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isRetrying;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Unit> function0, Function0<Unit> function02) {
            super(4);
            this.$isRetrying = z;
            this.$onRetry = function0;
            this.$onLogOut = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m472invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m472invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA01 = AbstractC1754Apr.A01(C10G.A01);
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA01, f3, f3);
            C3TH c3th = C2VU.A00;
            boolean z = this.$isRetrying;
            Function0<Unit> function0 = this.$onRetry;
            Function0<Unit> function02 = this.$onLogOut;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA012, iA0J);
            C90l c90l = C90l.A00;
            C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
            ConfidentialVmPinEntryContentKt.m467ConfidentialVmHeaderGh5yOYU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207a0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120784), null, false, 0.0f, 0.0f, null, 0.0f, true, null, bfm, 100663296, 764);
            C01N.A07(bfm, c90l.AiP(bs0, 1.0f, true));
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStylePrimary = auraButtonStyles.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            C1062ATq c1062ATq = C10G.A02;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12079f), null, c1062ATq, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, !z, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134199749);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702), null, C3U4.A0C(c1062ATq, 0.0f, AuraDimensKt.SpacingSmall, 0.0f, 0.0f), auraButtonStyles.secondary(null, bfm, 48, 1), auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingLargePlusMicro, true);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt$RegistrationLookupFailureContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C112732 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isRetrying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112732(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isRetrying = z;
            this.$onRetry = function0;
            this.$onLogOut = function02;
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
            ConfidentialVmRegisterPinScreenKt.RegistrationLookupFailureContent(this.$isRetrying, this.$onRetry, this.$onLogOut, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegisterPinEntryPoint.values().length];
            try {
                AnonymousClass002.A13(RegisterPinEntryPoint.INTERNAL_SETTINGS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RegisterPinEntryPoint.SETTINGS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(RegisterPinEntryPoint.ONBOARDING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(RegisterPinEntryPoint.ACTIVATION, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(RegisterPinEntryPoint.SVM_TO_CVM_SWITCH, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(RegisterPinEntryPoint.SVM_TO_CVM_DATA_TRANSFER, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(RegisterPinEntryPoint.CVM_ENROLLMENT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmRegisterPinScreen(com.facebook.aura.navigation.key.RegisterPinEntryPoint r57, X.BRg r58, com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel r59, X.BFM r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt.ConfidentialVmRegisterPinScreen(com.facebook.aura.navigation.key.RegisterPinEntryPoint, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* renamed from: RegisterPinContent-jjJOJwI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m469RegisterPinContentjjJOJwI(java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, java.lang.String r44, X.G0U<? super java.lang.String, kotlin.Unit> r45, kotlin.jvm.functions.Function0<kotlin.Unit> r46, boolean r47, boolean r48, boolean r49, X.C1822Arm r50, X.BRg r51, X.C1DG r52, X.BFM r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmRegisterPinScreenKt.m469RegisterPinContentjjJOJwI(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, boolean, boolean, boolean, X.Arm, X.BRg, X.1DG, X.BFM, int, int, int):void");
    }

    public static final void RegistrationLookupFailureContent(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-987876384);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, AuraContentRole.Focused, 0L, "", null, null, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(z, function0, function02), 829157349), bfm, ((iA0n >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805331334, 0, 805306416, 534773224);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C112732(z, function0, function02, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState access$ConfidentialVmRegisterPinScreen$lambda$0(C1BO c1bo) {
        return (ConfidentialVmRegisterPinViewModel.ConfidentialVmRegisterPinUiState) c1bo.getValue();
    }
}
