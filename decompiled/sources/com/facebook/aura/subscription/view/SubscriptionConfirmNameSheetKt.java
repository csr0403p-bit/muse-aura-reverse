package com.facebook.aura.subscription.view;

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
import X.AnonymousClass011;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1DI;
import X.C1OM;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.Hw8;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel;
import com.facebook.aura.subscription.repo.SubscriptionNameDialog;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class SubscriptionConfirmNameSheetKt {

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$NameSubmissionError$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel.NameSubmission $submission;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraSubscriptionNameGateViewModel.NameSubmission nameSubmission, BRg bRg, int i, int i2) {
            super(2);
            this.$submission = nameSubmission;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionConfirmNameSheetKt.NameSubmissionError(this.$submission, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, G0U<? super Boolean, Unit> g0u, int i, int i2) {
            super(2);
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$onDismiss = function02;
            this.$onPurchaseFinished = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionConfirmNameSheetKt.SubscriptionConfirmNameSheet(this.$entryPoint, this.$onBack, this.$modifier, this.$onDismiss, this.$onPurchaseFinished, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $firstName$delegate;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel.HeldPurchase $held;
        public final /* synthetic */ boolean $isCommitting;
        public final /* synthetic */ MutableState<String> $lastName$delegate;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
        public final /* synthetic */ HatchSubsurface $originSubsurface;
        public final /* synthetic */ Map<String, String> $tapMetadata;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(AuraSubscriptionNameGateViewModel.HeldPurchase heldPurchase, boolean z, HatchSubsurface hatchSubsurface, Map<String, String> map, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, MutableState<String> mutableState, MutableState<String> mutableState2) {
            super(2);
            this.$held = heldPurchase;
            this.$isCommitting = z;
            this.$originSubsurface = hatchSubsurface;
            this.$tapMetadata = map;
            this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
            this.$firstName$delegate = mutableState;
            this.$lastName$delegate = mutableState2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r47, int r48) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt.AnonymousClass7.invoke(X.BFM, int):void");
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ SubscriptionNameDialog $dialog;
        public final /* synthetic */ MutableState<String> $firstName$delegate;
        public final /* synthetic */ boolean $isCommitting;
        public final /* synthetic */ MutableState<String> $lastName$delegate;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel $nameGateViewModel;
        public final /* synthetic */ AuraSubscriptionNameGateViewModel.NameSubmission $submission;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            String str = this.$dialog.subtitle;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).caption1Regular;
            long jA07 = C3cH.A07(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingLarge;
            float f2 = AuraDimensKt.SpacingMedium;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(c1062ATq, f, 0.0f, f, f2), jA07, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BRg bRgA0B = C3U4.A0B(bs0, f2, 0.0f);
            AuraSubscriptionNameGateViewModel.NameSubmission nameSubmission = this.$submission;
            MutableState<String> mutableState = this.$firstName$delegate;
            boolean z = this.$isCommitting;
            AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel = this.$nameGateViewModel;
            MutableState<String> mutableState2 = this.$lastName$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgFieldErrorBorder = SubscriptionConfirmNameSheetKt.fieldErrorBorder(nameSubmission, bfm, 0);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgFieldErrorBorder);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90l c90l = C90l.A00;
            boolean zA1O = AnonymousClass003.A1O(bfm, auraSubscriptionNameGateViewModel, mutableState2, AnonymousClass003.A1T(bfm, mutableState, z));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$8$1$1$1$1(z, mutableState, auraSubscriptionNameGateViewModel, mutableState2);
                BBI.A0O(bbi, objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
            BBI.A0R(bbi, true);
            SubscriptionConfirmNameSheetKt.NameSubmissionError(nameSubmission, null, bfm, 0, 2);
            BBI.A0R(bbi, true);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(SubscriptionNameDialog subscriptionNameDialog, AuraSubscriptionNameGateViewModel.NameSubmission nameSubmission, MutableState<String> mutableState, boolean z, AuraSubscriptionNameGateViewModel auraSubscriptionNameGateViewModel, MutableState<String> mutableState2) {
            super(3);
            this.$dialog = subscriptionNameDialog;
            this.$submission = nameSubmission;
            this.$firstName$delegate = mutableState;
            this.$isCommitting = z;
            this.$nameGateViewModel = auraSubscriptionNameGateViewModel;
            this.$lastName$delegate = mutableState2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt$SubscriptionConfirmNameSheet$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ SubscriptionPaywallEntryPoint $entryPoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<Boolean, Unit> $onPurchaseFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, G0U<? super Boolean, Unit> g0u, int i, int i2) {
            super(2);
            this.$entryPoint = subscriptionPaywallEntryPoint;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$onDismiss = function02;
            this.$onPurchaseFinished = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SubscriptionConfirmNameSheetKt.SubscriptionConfirmNameSheet(this.$entryPoint, this.$onBack, this.$modifier, this.$onDismiss, this.$onPurchaseFinished, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: NameField-vbMXUkU, reason: not valid java name */
    public static final void m2281NameFieldvbMXUkU(String str, String str2, int i, Hw8 hw8, boolean z, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1657095388);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, i);
        }
        if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(hw8, bfm, i2) ? 1 : 0);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z);
        }
        if ((196608 & i2) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0u);
        }
        int i4 = i3 & 64;
        int iA0j = 1572864;
        if (i4 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i2) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColorsTextInput auraColorsTextInput = C3cH.A0W(bfm).textInput;
            boolean zA65 = bfm.A65(auraColorsTextInput);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                long j = auraColorsTextInput.textColor;
                long j2 = auraColorsTextInput.cursorColor;
                long j3 = auraColorsTextInput.placeholderColor;
                long j4 = B6A.A06;
                objAaT = new AuraColorsTextInput(j, j2, j3, j4, j4, j4, C60P.A04(j4));
                BBI.A0T(bfm, objAaT);
            }
            AuraColorsTextInput auraColorsTextInput2 = (AuraColorsTextInput) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean z2 = (iA0d & 7168) == 2048 || ((iA0d & 4096) != 0 && bfm.A67(hw8));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = new SubscriptionConfirmNameSheetKt$NameField$1$1(hw8);
                BBI.A0T(bfm, objAaT2);
            }
            AuraTextInputKt.AuraTextInput(str, null, ARD.A01(bRgA0R, (G0U) objAaT2, false), B1V.A00(bfm, new SubscriptionConfirmNameSheetKt$NameField$2(str2), 702853176), new AuJ(null, 2, 0, i), null, null, null, true, 0, 0, null, null, auraColorsTextInput2, null, z, false, false, false, C1OM.A00, g0u, bfm, (iA0d & 14) | 100666368, ((iA0d << 3) & 458752) | 805306368, (iA0d >> 15) & 14, 483042);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SubscriptionConfirmNameSheetKt$NameField$3(str, str2, i, hw8, z, g0u, bRg2, i2, i3);
        }
    }

    public static final void NameSubmissionError(AuraSubscriptionNameGateViewModel.NameSubmission nameSubmission, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(-716570744);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, nameSubmission) | i : i;
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
            if (nameSubmission instanceof AuraSubscriptionNameGateViewModel.NameSubmission.Invalid) {
                strA01 = ((AuraSubscriptionNameGateViewModel.NameSubmission.Invalid) nameSubmission).detail;
            } else {
                if (!(nameSubmission instanceof AuraSubscriptionNameGateViewModel.NameSubmission.Failed)) {
                    if (!C7384Etj.areEqual(nameSubmission, AuraSubscriptionNameGateViewModel.NameSubmission.Idle.INSTANCE) && !C7384Etj.areEqual(nameSubmission, AuraSubscriptionNameGateViewModel.NameSubmission.Submitting.INSTANCE) && !C7384Etj.areEqual(nameSubmission, AuraSubscriptionNameGateViewModel.NameSubmission.Saved.INSTANCE)) {
                        throw C3cG.A0q();
                    }
                    bBbAAc = bfm.AAc();
                    if (bBbAAc != null) {
                        anonymousClass2 = new SubscriptionConfirmNameSheetKt$NameSubmissionError$detail$1(nameSubmission, bRg2, i, i2);
                        C3cG.A1D(bBbAAc, anonymousClass2);
                    }
                    return;
                }
                strA01 = ((AuraSubscriptionNameGateViewModel.NameSubmission.Failed) nameSubmission).detail;
            }
            if (strA01 == null) {
                bfm.AgE(-1429705662);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b19);
            } else {
                bfm.AgE(-1429705972);
            }
            AnonymousClass001.A1D(bfm);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).caption1Emphasized;
            long j = auraTheme.getColors(bfm, 6).destructiveText;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingLarge;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f2, f, f2, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SubscriptionConfirmNameSheetKt$NameSubmissionError$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA0C, objAaT, false), j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(nameSubmission, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Type inference failed for: r4v45, types: [com.facebook.aura.subscription.model.AuraSubscriptionNameGateViewModel$NameSubmission] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SubscriptionConfirmNameSheet(com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, X.BRg r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, X.G0U<? super java.lang.Boolean, kotlin.Unit> r70, X.BFM r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.SubscriptionConfirmNameSheetKt.SubscriptionConfirmNameSheet(com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, X.G0U, X.BFM, int, int):void");
    }

    public static final BRg fieldErrorBorder(AuraSubscriptionNameGateViewModel.NameSubmission nameSubmission, BFM bfm, int i) {
        if (!(nameSubmission instanceof AuraSubscriptionNameGateViewModel.NameSubmission.Invalid) && !(nameSubmission instanceof AuraSubscriptionNameGateViewModel.NameSubmission.Failed)) {
            AnonymousClass004.A1A(bfm, 1825882215);
            return BRg.A00;
        }
        BS0 bs0A09 = C3cG.A09(bfm, 1825689147);
        AuraTheme auraTheme = AuraTheme.INSTANCE;
        BRg bRgA02 = C1DI.A02(bs0A09, C1D8.A00(auraTheme.getDimensions(bfm, 6).sectionCornerRadius), 1.0f, auraTheme.getColors(bfm, 6).destructiveText);
        AnonymousClass002.A19(bfm);
        return bRgA02;
    }
}
