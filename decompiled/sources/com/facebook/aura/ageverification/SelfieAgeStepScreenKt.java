package com.facebook.aura.ageverification;

import X.AHD;
import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C10G;
import X.C1BO;
import X.C1DG;
import X.C1er;
import X.C2CK;
import X.C3U4;
import X.C3cG;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7bA;
import X.CH0;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC7353EnQ;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ageverification.SelfieAgeStepViewModel;
import com.facebook.aura.header.api.HeaderAction;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTerminalBackHandlerKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SelfieAgeStepScreenKt {

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ SelfieAgeStepState $current;
        public final /* synthetic */ boolean $picked;
        public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(SelfieAgeStepState selfieAgeStepState, SelfieAgeStepViewModel selfieAgeStepViewModel, boolean z) {
            super(4);
            this.$current = selfieAgeStepState;
            this.$viewModel = selfieAgeStepViewModel;
            this.$picked = z;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m227invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m227invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                SelfieAgeStepScreenKt.SelfieAgeStepContent(this.$current, this.$viewModel, this.$picked, C3U4.A0A(C10G.A01, f, f2), bfm, SelfieAgeStepViewModel.$stable << 3, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStep$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $failedRefreshes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onOtherMethods;
        public final /* synthetic */ Function0<Unit> $onResolved;
        public final /* synthetic */ Function0<Unit> $onSelfieUnavailable;
        public final /* synthetic */ boolean $picked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, Function0<Unit> function04, BRg bRg, int i2, int i3) {
            super(2);
            this.$picked = z;
            this.$onOtherMethods = function0;
            this.$onSelfieUnavailable = function02;
            this.$onResolved = function03;
            this.$failedRefreshes = i;
            this.$onBack = function04;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieAgeStepScreenKt.SelfieAgeStep(this.$picked, this.$onOtherMethods, this.$onSelfieUnavailable, this.$onResolved, this.$failedRefreshes, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepScreenKt$SelfieAgeStepContent$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $picked;
        public final /* synthetic */ SelfieAgeStepState $state;
        public final /* synthetic */ SelfieAgeStepViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(SelfieAgeStepState selfieAgeStepState, SelfieAgeStepViewModel selfieAgeStepViewModel, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = selfieAgeStepState;
            this.$viewModel = selfieAgeStepViewModel;
            this.$picked = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieAgeStepScreenKt.SelfieAgeStepContent(this.$state, this.$viewModel, this.$picked, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SelfieAgeStep(boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, Function0<Unit> function04, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        AnonymousClass002.A1B(function02, 2, function03);
        C7384Etj.A0Y(function04, 5);
        bfm.AgG(-1810536202);
        int iA0n = (i2 & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i2 & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0G(bfm, i);
        }
        if ((196608 & i2) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function04);
        }
        int i4 = i3 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0n |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0n |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0n), bfm, iA0n)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            SelfieAgeStepViewModel.Factory factory = new SelfieAgeStepViewModel.Factory(AnonymousClass001.A0I(AnonymousClass002.A0H(bfm)), ((CH0) AnonymousClass002.A0h(bfm)).A01);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SelfieAgeStepViewModel selfieAgeStepViewModel = (SelfieAgeStepViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(SelfieAgeStepViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, selfieAgeStepViewModel.state);
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            MutableState mutableStateA002 = C1er.A00(bfm, function02);
            MutableState mutableStateA003 = C1er.A00(bfm, function03);
            int i5 = iA0n >> 15;
            MutableState mutableStateA004 = C1er.A00(bfm, function04);
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA004, AnonymousClass005.A1T(bfm, mutableStateA00, mutableStateA002, mutableStateA003, bfm.A67(selfieAgeStepViewModel)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new SelfieAgeStepScreenKt$SelfieAgeStep$1$1(selfieAgeStepViewModel, mutableStateA00, mutableStateA002, mutableStateA003, mutableStateA004, null);
                bfm.Ai0(objAaT);
            }
            int i6 = SelfieAgeStepViewModel.$stable;
            C78e.A06(bfm, selfieAgeStepViewModel, (G0V) objAaT);
            Activity activity = (Activity) bfm.A6v(AKL.A00);
            boolean zA1M = AnonymousClass003.A1M(bfm, selfieAgeStepViewModel, activity);
            Object objAaT2 = bfm.AaT();
            if (zA1M || objAaT2 == C78N.A00) {
                objAaT2 = new SelfieAgeStepScreenKt$SelfieAgeStep$2$1(selfieAgeStepViewModel, activity);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, selfieAgeStepViewModel);
            Integer numValueOf = Integer.valueOf(i);
            boolean zA67 = bfm.A67(selfieAgeStepViewModel) | AnonymousClass005.A1M(iA0n);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new SelfieAgeStepScreenKt$SelfieAgeStep$3$1(selfieAgeStepViewModel, i);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A19(bfm, objAaT3, selfieAgeStepViewModel, numValueOf);
            boolean zA672 = bfm.A67(selfieAgeStepViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == C78N.A00) {
                objAaT4 = new SelfieAgeStepScreenKt$SelfieAgeStep$4$1(selfieAgeStepViewModel);
                bfm.Ai0(objAaT4);
            }
            C7bA.A05(bfm, null, selfieAgeStepViewModel, (G0U) objAaT4, i6, 2);
            boolean zA673 = bfm.A67(selfieAgeStepViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == C78N.A00) {
                objAaT5 = new SelfieAgeStepScreenKt$SelfieAgeStep$5$1(selfieAgeStepViewModel);
                bfm.Ai0(objAaT5);
            }
            AuraTerminalBackHandlerKt.AuraTerminalBackHandler(false, (Function0) ((InterfaceC7353EnQ) objAaT5), bfm, 0, 1);
            SelfieAgeStepState selfieAgeStepState = (SelfieAgeStepState) c1boA02.getValue();
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean showsHelp = SelfieAgeStepViewModelKt.getShowsHelp(selfieAgeStepState);
            boolean zA1M2 = AnonymousClass003.A1M(bfm, selfieAgeStepViewModel, auraNavigatorA0b);
            Object objAaT6 = bfm.AaT();
            if (zA1M2 || objAaT6 == C78N.A00) {
                objAaT6 = new SelfieAgeStepScreenKt$SelfieAgeStep$headerActions$1$1(selfieAgeStepViewModel, auraNavigatorA0b);
                bfm.Ai0(objAaT6);
            }
            AHD<HeaderAction> ahdRememberAgeStepHeaderActions = rememberAgeStepHeaderActions(showsHelp, (Function0) objAaT6, bfm, 0);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            boolean zA674 = bfm.A67(selfieAgeStepViewModel);
            Object objAaT7 = bfm.AaT();
            if (zA674 || objAaT7 == C78N.A00) {
                objAaT7 = new SelfieAgeStepScreenKt$SelfieAgeStep$6$1(selfieAgeStepViewModel);
                bfm.Ai0(objAaT7);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, bRg2, null, 0L, null, null, (Function0) ((InterfaceC7353EnQ) objAaT7), null, false, SelfieAgeStepViewModelKt.getShowsBack(selfieAgeStepState), 0, null, null, null, null, ahdRememberAgeStepHeaderActions, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass7(selfieAgeStepState, selfieAgeStepViewModel, z), -983237103), bfm, (i5 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6, 0, 805306374, 535788988);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass8(z, function0, function02, function03, i, function04, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0114 A[PHI: r7
  0x0114: PHI (r7v21 int) = (r7v18 int), (r7v22 int) binds: [B:42:0x00f8, B:29:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SelfieAgeStepContent(com.facebook.aura.ageverification.SelfieAgeStepState r20, com.facebook.aura.ageverification.SelfieAgeStepViewModel r21, boolean r22, X.BRg r23, X.BFM r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepScreenKt.SelfieAgeStepContent(com.facebook.aura.ageverification.SelfieAgeStepState, com.facebook.aura.ageverification.SelfieAgeStepViewModel, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AHD<com.facebook.aura.header.api.HeaderAction> rememberAgeStepHeaderActions(boolean r11, kotlin.jvm.functions.Function0<kotlin.Unit> r12, X.BFM r13, int r14) {
        /*
            androidx.compose.runtime.MutableState r2 = X.C1er.A00(r13, r12)
            r0 = r14 & 14
            r0 = r0 ^ 6
            r3 = 0
            r9 = 1
            r4 = 4
            if (r0 <= r4) goto L13
            boolean r0 = r13.A66(r11)
            if (r0 != 0) goto L18
        L13:
            r0 = r14 & 6
            r1 = 0
            if (r0 != r4) goto L19
        L18:
            r1 = 1
        L19:
            java.lang.Object r0 = r13.AaT()
            if (r1 != 0) goto L23
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L2a
        L23:
            if (r11 != 0) goto L2d
            X.AHI r0 = X.AHI.A01
        L27:
            r13.Ai0(r0)
        L2a:
            X.AHD r0 = (X.AHD) r0
            return r0
        L2d:
            com.facebook.aura.navigation.key.AgeVerificationWhyConfirmSheetKey r4 = com.facebook.aura.navigation.key.AgeVerificationWhyConfirmSheetKey.INSTANCE
            r10 = 0
            r1 = 2131230964(0x7f0800f4, float:1.8077996E38)
            r0 = 2131886202(0x7f12007a, float:1.9406976E38)
            com.facebook.aura.header.api.HeaderActionIcon r5 = new com.facebook.aura.header.api.HeaderActionIcon
            r5.<init>(r1, r0, r3, r9)
            com.facebook.aura.ageverification.SelfieAgeStepScreenKt$rememberAgeStepHeaderActions$1$1 r7 = new com.facebook.aura.ageverification.SelfieAgeStepScreenKt$rememberAgeStepHeaderActions$1$1
            r7.<init>(r2)
            java.lang.String r6 = "age-verification-help-button"
            X.BS0 r8 = X.BRg.A00
            com.facebook.aura.header.api.HeaderAction r3 = new com.facebook.aura.header.api.HeaderAction
            r11 = r10
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.facebook.aura.header.api.HeaderAction[] r0 = new com.facebook.aura.header.api.HeaderAction[]{r3}
            X.AHH r0 = X.AGI.A0E(r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieAgeStepScreenKt.rememberAgeStepHeaderActions(boolean, kotlin.jvm.functions.Function0, X.BFM, int):X.AHD");
    }
}
