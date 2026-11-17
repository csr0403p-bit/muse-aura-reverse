package com.facebook.aura.activation.view;

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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AuJ;
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
import X.C01N;
import X.C06G;
import X.C06I;
import X.C10472Hkj;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DM;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.Hw8;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.activation.data.HatchActivationWaitlistInviteCopy;
import com.facebook.aura.activation.model.AuraConfirmNameViewModel;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.login.nativeflow.NativeLoginCommonKt;
import com.facebook.aura.login.nativeflow.NativeLoginTitleStyle;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraConfirmNameScreenKt {

    /* renamed from: com.facebook.aura.activation.view.AuraConfirmNameScreenKt$AuraConfirmNameScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;
        public final /* synthetic */ C1BO<AuraConfirmNameViewModel.UiState> $uiState$delegate;
        public final /* synthetic */ AuraConfirmNameViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraConfirmNameViewModel auraConfirmNameViewModel, Function0<Unit> function0, HatchActivationWaitlistInviteCopy.Screen screen, C1BO<AuraConfirmNameViewModel.UiState> c1bo) {
            super(4);
            this.$viewModel = auraConfirmNameViewModel;
            this.$onLogOut = function0;
            this.$screenCopy = screen;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m115invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m115invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = i;
            if ((i & 6) == 0) {
                iA04 = i | AnonymousClass004.A04(bfm, f);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 131, 130), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(AbstractC1754Apr.A00(AbstractC1754Apr.A01(C10G.A01)), AuraDimensKt.SpacingMedium);
            C3TH c3th = C2VU.A00;
            AuraConfirmNameViewModel auraConfirmNameViewModel = this.$viewModel;
            Function0<Unit> function0 = this.$onLogOut;
            HatchActivationWaitlistInviteCopy.Screen screen = this.$screenCopy;
            C1BO<AuraConfirmNameViewModel.UiState> c1bo = this.$uiState$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0H = AnonymousClass007.A0H(bfm, AnonymousClass001.A0N(C90l.A00, bs0, true), C10G.A02);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            AuraConfirmNameViewModel.UiState value = c1bo.getValue();
            boolean zA67 = bfm.A67(auraConfirmNameViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$1$1$1(auraConfirmNameViewModel);
                bfm.Ai0(objAaT);
            }
            G0U g0u2 = (G0U) ((InterfaceC7353EnQ) objAaT);
            boolean zA672 = bfm.A67(auraConfirmNameViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$1$2$1(auraConfirmNameViewModel);
                bfm.Ai0(objAaT2);
            }
            AuraConfirmNameScreenKt.ConfirmNameForm(screen, value, g0u2, (G0U) ((InterfaceC7353EnQ) objAaT2), null, bfm, 0, 16);
            BBI.A0R(bbi, true);
            float f3 = AuraDimensKt.SpacingLargePlusMicro;
            C01N.A08(bfm, bs0, f3);
            AuraConfirmNameViewModel.UiState value2 = c1bo.getValue();
            boolean zA673 = bfm.A67(auraConfirmNameViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new AuraConfirmNameScreenKt$AuraConfirmNameScreen$1$1$2$1(auraConfirmNameViewModel);
                bfm.Ai0(objAaT3);
            }
            AuraConfirmNameScreenKt.ConfirmNameBottomButtons(value2, (Function0) ((InterfaceC7353EnQ) objAaT3), function0, null, bfm, 0, 8);
            C01N.A04(bfm, bbi, bs0, f3, true);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraConfirmNameScreenKt$AuraConfirmNameScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchActivationWaitlistInviteCopy.Screen screen, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$screenCopy = screen;
            this.$onLogOut = function0;
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
            AuraConfirmNameScreenKt.AuraConfirmNameScreen(this.$screenCopy, this.$onLogOut, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraConfirmNameScreenKt$ConfirmNameBottomButtons$2, reason: invalid class name and case insensitive filesystem */
    public final class C106992 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ AuraConfirmNameViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106992(AuraConfirmNameViewModel.UiState uiState, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = uiState;
            this.$onContinue = function0;
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
            AuraConfirmNameScreenKt.ConfirmNameBottomButtons(this.$uiState, this.$onContinue, this.$onLogOut, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.activation.view.AuraConfirmNameScreenKt$ConfirmNameForm$2, reason: invalid class name and case insensitive filesystem */
    public final class C107002 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onFirstNameChange;
        public final /* synthetic */ G0U<String, Unit> $onLastNameChange;
        public final /* synthetic */ HatchActivationWaitlistInviteCopy.Screen $screenCopy;
        public final /* synthetic */ AuraConfirmNameViewModel.UiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107002(HatchActivationWaitlistInviteCopy.Screen screen, AuraConfirmNameViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$screenCopy = screen;
            this.$uiState = uiState;
            this.$onFirstNameChange = g0u;
            this.$onLastNameChange = g0u2;
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
            AuraConfirmNameScreenKt.ConfirmNameForm(this.$screenCopy, this.$uiState, this.$onFirstNameChange, this.$onLastNameChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraConfirmNameScreen(HatchActivationWaitlistInviteCopy.Screen screen, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(screen, function0);
        bfm.AgG(1772373126);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, screen) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(AuraConfirmNameViewModel.class, ((Number) bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration)).longValue());
            AuraConfirmNameViewModel.Factory factory = new AuraConfirmNameViewModel.Factory(AnonymousClass002.A0h(bfm));
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            AuraConfirmNameViewModel auraConfirmNameViewModel = (AuraConfirmNameViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), AuraConfirmNameViewModel.class, strActivityViewModelKey);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, AuraContentRole.Focused, 0L, null, null, null, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, AuraDimensKt.SpacingLarge, null, null, null, zA1b ? 1 : 0, ComposableSingletons$AuraConfirmNameScreenKt.lambda$268752177, null, null, zA1b, B1V.A00(bfm, new AnonymousClass1(auraConfirmNameViewModel, function0, screen, C2CK.A02(bfm, auraConfirmNameViewModel.uiState)), 572923659), bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805306758, zA1b ? 1 : 0, 805502976, 502267384);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(screen, function0, bRg2, i, i2);
        }
    }

    public static final void ConfirmNameBottomButtons(AuraConfirmNameViewModel.UiState uiState, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(422546994);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA07 = C3U4.A07(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingXsmall);
            boolean zA67 = bfm.A67(uiState) | AnonymousClass003.A1C(iA0T) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new AuraConfirmNameScreenKt$ConfirmNameBottomButtons$1$1(uiState, function0, function02);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA07, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 126);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C106992(uiState, function0, function02, bRg2, i, i2);
        }
    }

    /* renamed from: ConfirmNameField-X0zcS7w, reason: not valid java name */
    public static final void m113ConfirmNameFieldX0zcS7w(String str, G0U<? super String, Unit> g0u, String str2, Hw8 hw8, int i, boolean z, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-997131826);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(hw8, bfm, i2) ? 1 : 0);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, i);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        int i4 = i3 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuJ auJ = new AuJ(null, 2, 0, i);
            long jA08 = C06G.A08(bfm);
            C1DM c1dm = AnonymousClass002.A0e(bfm).large;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean z2 = (iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(hw8));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new AuraConfirmNameScreenKt$ConfirmNameField$1$1(hw8);
                bfm.Ai0(objAaT);
            }
            NativeLoginCommonKt.m1282NativeLoginTextFieldWHTdp1U(str, g0u, str2, AnonymousClass001.A0Y(bRgA0R, objAaT, false), z, false, auJ, null, false, null, null, 0, null, null, jA08, c1dm, bfm, AnonymousClass001.A0B(iA0d >> 3, iA0d & 1022), 0, 16288);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraConfirmNameScreenKt$ConfirmNameField$2(str, g0u, str2, hw8, i, z, bRg2, i2, i3);
        }
    }

    public static final void ConfirmNameForm(HatchActivationWaitlistInviteCopy.Screen screen, AuraConfirmNameViewModel.UiState uiState, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        String strA0s;
        BRg bRgA0P = bRg;
        bfm.AgG(-1483695926);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, screen) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, uiState);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String str = screen.title;
            BS0 bs0 = BRg.A00;
            NativeLoginCommonKt.NativeLoginHero(str, C3U4.A07(bs0, AuraDimensKt.SpacingXsmall), AnonymousClass005.A0X(screen.subtitle), false, false, NativeLoginTitleStyle.TEXT_MEDIUM, bfm, 221184, 8);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            m113ConfirmNameFieldX0zcS7w(uiState.firstName, g0u, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204cf), C10472Hkj.A0A, 6, !uiState.isSaving, null, bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 64);
            C01N.A05(bfm, bs0);
            m113ConfirmNameFieldX0zcS7w(uiState.lastName, g0u2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d3), C10472Hkj.A0C, 7, !uiState.isSaving, null, bfm, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 64);
            AuraConfirmNameViewModel.ConfirmNameError confirmNameError = uiState.error;
            if (confirmNameError instanceof AuraConfirmNameViewModel.ConfirmNameError.Server) {
                bfm.AgE(2023376314);
                BBI.A0R(bbi, false);
                strA0s = ((AuraConfirmNameViewModel.ConfirmNameError.Server) confirmNameError).detail;
            } else if (C7384Etj.areEqual(confirmNameError, AuraConfirmNameViewModel.ConfirmNameError.Generic.INSTANCE)) {
                bfm.AgE(2023377934);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120b19);
            } else {
                if (confirmNameError != null) {
                    throw AnonymousClass003.A0k(bfm, bbi, 2023373821);
                }
                bfm.AgE(-1699714807);
                BBI.A0R(bbi, false);
                strA0s = null;
            }
            NativeLoginCommonKt.NativeLoginFieldErrorSlot(strA0s, null, bfm, 0, 2);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107002(screen, uiState, g0u, g0u2, bRgA0P, i, i2);
        }
    }

    public static final void logConfirmNameClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_NAME_CONFIRMATION, hatchComponent, null, null, null);
    }

    public static final /* synthetic */ AuraConfirmNameViewModel.UiState access$AuraConfirmNameScreen$lambda$0(C1BO c1bo) {
        return (AuraConfirmNameViewModel.UiState) c1bo.getValue();
    }
}
