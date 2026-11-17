package com.facebook.aura.confidentialvm.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel;
import com.facebook.aura.confidentialvm.view.setup.ConfidentialVmProgressLayoutKt;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ConfidentialVmSwitchProgressScreenKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<ConfidentialVmDataTransferUiState> $uiState$delegate;
        public final /* synthetic */ ConfidentialVmDataTransferProgressViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, C1BO<ConfidentialVmDataTransferUiState> c1bo) {
            super(2);
            this.$viewModel = confidentialVmDataTransferProgressViewModel;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                if (!this.$uiState$delegate.getValue().isLeaving) {
                    bfm.AgE(-1599430169);
                    ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel = this.$viewModel;
                    boolean zA67 = bfm.A67(confidentialVmDataTransferProgressViewModel);
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$7$1$1(confidentialVmDataTransferProgressViewModel);
                        bfm.Ai0(objAaT);
                    }
                    Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                    ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel2 = this.$viewModel;
                    boolean zA672 = bfm.A67(confidentialVmDataTransferProgressViewModel2);
                    Object objAaT2 = bfm.AaT();
                    if (zA672 || objAaT2 == C78N.A00) {
                        objAaT2 = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$7$2$1(confidentialVmDataTransferProgressViewModel2);
                        bfm.Ai0(objAaT2);
                    }
                    Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                    ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel3 = this.$viewModel;
                    boolean zA673 = bfm.A67(confidentialVmDataTransferProgressViewModel3);
                    Object objAaT3 = bfm.AaT();
                    if (zA673 || objAaT3 == C78N.A00) {
                        objAaT3 = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$7$3$1(confidentialVmDataTransferProgressViewModel3);
                        bfm.Ai0(objAaT3);
                    }
                    ConfidentialVmOverflowMenuKt.ConfidentialVmOverflowMenu(function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
                    AnonymousClass001.A1D(bfm);
                    return;
                }
                AnonymousClass004.A1A(bfm, -1599204334);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferContent$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmSwitchDirection $direction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLeft;
        public final /* synthetic */ ConfidentialVmDataTransferProgressViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, Function0<Unit> function0, BRg bRg, ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, int i, int i2) {
            super(2);
            this.$direction = confidentialVmSwitchDirection;
            this.$onLeft = function0;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmDataTransferProgressViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferContent(this.$direction, this.$onLeft, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferProgressScreen$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmSwitchDirection $direction;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, BRg bRg, int i, int i2) {
            super(2);
            this.$direction = confidentialVmSwitchDirection;
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
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferProgressScreen(this.$direction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferResumeScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmSwitchDirection $direction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, BRg bRg, ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel, int i, int i2) {
            super(2);
            this.$direction = confidentialVmSwitchDirection;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmDataTransferResumeViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferResumeScreen(this.$direction, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferResumeScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmSwitchDirection $direction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmDataTransferResumeViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, BRg bRg, ConfidentialVmDataTransferResumeViewModel confidentialVmDataTransferResumeViewModel, int i, int i2) {
            super(2);
            this.$direction = confidentialVmSwitchDirection;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmDataTransferResumeViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferResumeScreen(this.$direction, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C112822 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $footnote;
        public final /* synthetic */ boolean $isFailed;
        public final /* synthetic */ boolean $isLeaving;
        public final /* synthetic */ Function0<Unit> $onLeave;
        public final /* synthetic */ Function0<Unit> $onTryAgain;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ HatchSurface $surface;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112822(boolean z, String str, String str2, String str3, String str4, Function0<Unit> function0, HatchSurface hatchSurface, HatchScreen hatchScreen, Function0<Unit> function02, boolean z2) {
            super(4);
            this.$isFailed = z;
            this.$title = str;
            this.$description = str2;
            this.$footnote = str3;
            this.$errorMessage = str4;
            this.$onTryAgain = function0;
            this.$surface = hatchSurface;
            this.$screen = hatchScreen;
            this.$onLeave = function02;
            this.$isLeaving = z2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m478invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m478invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 = i | AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 131, 130), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$isFailed) {
                bfm.AgE(-1802383957);
                BS0 bs0 = BRg.A00;
                BRg bRgA04 = C3U4.A04(C10G.A01, f);
                String str = this.$errorMessage;
                Function0<Unit> function0 = this.$onTryAgain;
                HatchSurface hatchSurface = this.$surface;
                HatchScreen hatchScreen = this.$screen;
                Function0<Unit> function02 = this.$onLeave;
                boolean z = this.$isLeaving;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA04);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                HatchScreenErrorStateKt.HatchScreenErrorState(str, function0, AnonymousClass001.A0R(C90l.A00.AiP(bs0, 1.0f, true)), hatchSurface, null, hatchScreen, null, bfm, 0, 80);
                if (function02 == null) {
                    bfm.AgE(-886627666);
                } else {
                    boolean zA1W = AnonymousClass004.A1W(bfm, function02, z, AnonymousClass001.A1Y(function0, bfm, -886627665));
                    Object objAaT = bfm.AaT();
                    if (zA1W || objAaT == C78N.A00) {
                        objAaT = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$2$1$1$1$1(function0, z, function02);
                        bfm.Ai0(objAaT);
                    }
                    AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(null, null, null, null, null, null, null, false, (G0U) objAaT, bfm, 0, 255);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-1801757943);
                ConfidentialVmProgressLayoutKt.ConfidentialVmProgressLayout("VM switch: switching", this.$title, this.$description, this.$footnote, null, bfm, 6, 16);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressContent$3, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C112833 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $errorMessage;
        public final /* synthetic */ String $footnote;
        public final /* synthetic */ boolean $isFailed;
        public final /* synthetic */ boolean $isLeaving;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $menu;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLeave;
        public final /* synthetic */ G0U<Boolean, Unit> $onShown;
        public final /* synthetic */ Function0<Unit> $onTryAgain;
        public final /* synthetic */ HatchScreen $screen;
        public final /* synthetic */ HatchSurface $surface;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C112833(boolean z, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, HatchScreen hatchScreen, HatchSurface hatchSurface, String str, String str2, BRg bRg, String str3, String str4, Function0<Unit> function02, boolean z2, int i, int i2, int i3) {
            super(2);
            this.$isFailed = z;
            this.$onShown = g0u;
            this.$onTryAgain = function0;
            this.$menu = g0v;
            this.$screen = hatchScreen;
            this.$surface = hatchSurface;
            this.$title = str;
            this.$description = str2;
            this.$modifier = bRg;
            this.$errorMessage = str3;
            this.$footnote = str4;
            this.$onLeave = function02;
            this.$isLeaving = z2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchProgressContent(this.$isFailed, this.$onShown, this.$onTryAgain, this.$menu, this.$screen, this.$surface, this.$title, this.$description, this.$modifier, this.$errorMessage, this.$footnote, this.$onLeave, this.$isLeaving, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmSwitchProgressViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel) {
            super(2);
            this.$viewModel = confidentialVmSwitchProgressViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(confidentialVmSwitchProgressViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$4$1$1(confidentialVmSwitchProgressViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(confidentialVmSwitchProgressViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$4$2$1(confidentialVmSwitchProgressViewModel2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel3 = this.$viewModel;
                boolean zA673 = bfm.A67(confidentialVmSwitchProgressViewModel3);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$4$3$1(confidentialVmSwitchProgressViewModel3);
                    bfm.Ai0(objAaT3);
                }
                ConfidentialVmOverflowMenuKt.ConfidentialVmOverflowMenu(function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ConfidentialVmSwitchDirection $direction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchProgressViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, BRg bRg, ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel, int i, int i2) {
            super(2);
            this.$direction = confidentialVmSwitchDirection;
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchProgressViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchProgressScreen(this.$direction, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$4, reason: invalid class name and case insensitive filesystem */
    public final class C112844 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ ConfidentialVmSwitchResumeViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112844(ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel) {
            super(2);
            this.$viewModel = confidentialVmSwitchResumeViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel = this.$viewModel;
                boolean zA67 = bfm.A67(confidentialVmSwitchResumeViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$4$1$1(confidentialVmSwitchResumeViewModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function0 = (Function0) ((InterfaceC7353EnQ) objAaT);
                ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel2 = this.$viewModel;
                boolean zA672 = bfm.A67(confidentialVmSwitchResumeViewModel2);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$4$2$1(confidentialVmSwitchResumeViewModel2);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
                ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel3 = this.$viewModel;
                boolean zA673 = bfm.A67(confidentialVmSwitchResumeViewModel3);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$4$3$1(confidentialVmSwitchResumeViewModel3);
                    bfm.Ai0(objAaT3);
                }
                ConfidentialVmOverflowMenuKt.ConfidentialVmOverflowMenu(function0, function02, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchResumeScreen$5, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C112855 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ConfidentialVmSwitchResumeViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112855(BRg bRg, ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$viewModel = confidentialVmSwitchResumeViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchResumeScreen(this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConfidentialVmDataTransferProgressScreen(ConfidentialVmSwitchDirection confidentialVmSwitchDirection, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(confidentialVmSwitchDirection, 0);
        bfm.AgG(1757371084);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, confidentialVmSwitchDirection) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmSwitchProgressScreenKt$ConfidentialVmDataTransferProgressScreen$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            ConfidentialVmDataTransferContent(confidentialVmSwitchDirection, (Function0) objAaT, bRg2, null, bfm, (iA08 & 14) | ((iA08 << 3) & 896), 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(confidentialVmSwitchDirection, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmDataTransferResumeScreen(com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r12, X.BRg r13, com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel r14, X.BFM r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferResumeScreen(com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferResumeViewModel, X.BFM, int, int):void");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ConfidentialVmSwitchDirection.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmSwitchDirection.TO_SECURE_VM, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ConfidentialVmDataTransferOperation.ProgressStep.values().length];
            try {
                AnonymousClass005.A0v(ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ConfidentialVmDataTransferOperation.ProgressStep.EXPORTING, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmDataTransferOperation.ProgressStep.IMPORTING, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmDataTransferOperation.ProgressStep.FINALIZING, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(ConfidentialVmDataTransferOperation.ProgressStep.SWITCHING, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01aa  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmDataTransferContent(com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, X.BRg r31, com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt.ConfidentialVmDataTransferContent(com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection, kotlin.jvm.functions.Function0, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSwitchProgressContent(boolean r45, X.G0U<? super java.lang.Boolean, kotlin.Unit> r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r48, com.facebook.aura.analytics.hatch.HatchScreen r49, com.facebook.aura.analytics.hatch.HatchSurface r50, java.lang.String r51, java.lang.String r52, X.BRg r53, java.lang.String r54, java.lang.String r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, boolean r57, X.BFM r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchProgressContent(boolean, X.G0U, kotlin.jvm.functions.Function0, X.G0V, com.facebook.aura.analytics.hatch.HatchScreen, com.facebook.aura.analytics.hatch.HatchSurface, java.lang.String, java.lang.String, X.BRg, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, boolean, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSwitchProgressScreen(com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r25, X.BRg r26, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel r27, X.BFM r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchProgressScreen(com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection, X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConfidentialVmSwitchResumeScreen(X.BRg r25, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r26, X.BFM r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.view.ConfidentialVmSwitchProgressScreenKt.ConfidentialVmSwitchResumeScreen(X.BRg, com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel, X.BFM, int, int):void");
    }

    public static final String errorMessage(String str, String str2) {
        return str2 != null ? FGI.A0U(str, PairsDiscretionDocument.OWNER_SEPARATOR, str2) : str;
    }

    public static final int getSwitchProgressTitle(ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = confidentialVmSwitchDirection.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f120771;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120764;
        }
        throw C3cG.A0q();
    }

    public static final String label(ConfidentialVmDataTransferOperation.ProgressStep progressStep, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, BFM bfm, int i) {
        int i2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = progressStep.ordinal();
        if (iOrdinal == 0) {
            i2 = R.string._name_removed__res_0x7f12073f;
        } else if (iOrdinal == 1) {
            i2 = R.string._name_removed__res_0x7f12073c;
        } else if (iOrdinal == 2) {
            i2 = R.string._name_removed__res_0x7f12073e;
        } else if (iOrdinal == 3) {
            i2 = R.string._name_removed__res_0x7f12073d;
        } else {
            if (iOrdinal != 4) {
                throw C3cG.A0q();
            }
            int iOrdinal2 = confidentialVmSwitchDirection.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    throw C3cG.A0q();
                }
                i2 = R.string._name_removed__res_0x7f12073d;
            } else {
                i2 = R.string._name_removed__res_0x7f1207a1;
            }
        }
        return AbstractC2271BQs.A01(bfm, i2);
    }

    public static final /* synthetic */ ConfidentialVmDataTransferUiState access$ConfidentialVmDataTransferContent$lambda$0(C1BO c1bo) {
        return (ConfidentialVmDataTransferUiState) c1bo.getValue();
    }
}
