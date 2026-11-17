package com.facebook.aura.main;

import X.AGI;
import X.AHH;
import X.AKQ;
import X.ARD;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
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
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchVmState;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.main.VmAccessGate;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.overlay.HatchOverlayFrameworkKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenErrorStateKt;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchVmAccessHostKt {
    public static final String TAG = "HatchVmAccessHost";

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$GateSettingsEscapeScaffold$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(4);
            this.$content = g0v;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1346invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1346invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$content, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$GateSettingsEscapeScaffold$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$content = g0v;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVmAccessHostKt.GateSettingsEscapeScaffold(this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$HardReplacementCopy$3, reason: invalid class name and case insensitive filesystem */
    public final class C126593 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126593(BRg bRg, int i, int i2) {
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
            HatchVmAccessHostKt.HardReplacementCopy(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$HatchVmAccessErrorScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $message;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, Function0<Unit> function0) {
            super(2);
            this.$message = str;
            this.$onRetry = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String str = this.$message;
                Function0<Unit> function0 = this.$onRetry;
                C1062ATq c1062ATq = C10G.A01;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchVmAccessHostKt$HatchVmAccessErrorScreen$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                HatchScreenErrorStateKt.HatchScreenErrorState(str, function0, ARD.A01(c1062ATq, (G0U) objAaT, false), null, null, null, null, bfm, 0, 120);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$HatchVmAccessErrorScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C126602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $message;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126602(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$message = str;
            this.$onRetry = function0;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVmAccessHostKt.HatchVmAccessErrorScreen(this.$message, this.$onRetry, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$HatchVmAccessHost$2, reason: invalid class name and case insensitive filesystem */
    public final class C126612 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ VmAccessGate $gate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126612(VmAccessGate vmAccessGate) {
            super(2);
            this.$gate = vmAccessGate;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner(AnonymousClass007.A0a("CVM hard replacement: ", ((VmAccessGate.Maintenance) this.$gate).state), C10G.A01, ComposableSingletons$HatchVmAccessHostKt.f80lambda$970273591, bfm, 432, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.main.HatchVmAccessHostKt$HatchVmAccessHost$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<Boolean, BFM, Integer, Unit> $content;
        public final /* synthetic */ AuraNavKey $currentDestination;
        public final /* synthetic */ boolean $isBlockingOverlayOnBackStack;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AbstractC3358CGz abstractC3358CGz, AuraNavKey auraNavKey, boolean z, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$userSession = abstractC3358CGz;
            this.$currentDestination = auraNavKey;
            this.$isBlockingOverlayOnBackStack = z;
            this.$content = g0w;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVmAccessHostKt.HatchVmAccessHost(this.$userSession, this.$currentDestination, this.$isBlockingOverlayOnBackStack, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchVmAccessHost(AbstractC3358CGz abstractC3358CGz, AuraNavKey auraNavKey, boolean z, G0W<? super Boolean, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        BBI bbiA0M;
        VmAccessGate vmAccessGate;
        AnonymousClass002.A1B(abstractC3358CGz, 0, g0w);
        bfm.AgG(1426159025);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, abstractC3358CGz) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraNavKey, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (HatchOverlayFrameworkKt.hasBlockingOverlay(abstractC3358CGz, bfm, iA0T & 14, 0) || z) {
                bbiA0M = AnonymousClass002.A0M(bfm, 887369503);
                vmAccessGate = VmAccessGate.ShowBlockingOverlay.INSTANCE;
            } else {
                bfm.AgE(887425458);
                vmAccessGate = vmAccessGate(abstractC3358CGz, auraNavKey, bfm, iA0T & 126);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            String strForLog = forLog(vmAccessGate);
            boolean zA65 = bfm.A65(strForLog);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchVmAccessHostKt$HatchVmAccessHost$1$1(strForLog);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, strForLog);
            if (C7384Etj.areEqual(vmAccessGate, VmAccessGate.ShowContent.INSTANCE) || C7384Etj.areEqual(vmAccessGate, VmAccessGate.ShowBlockingOverlay.INSTANCE)) {
                bfm.AgE(444277794);
                AnonymousClass001.A1G(Boolean.valueOf(C7384Etj.areEqual(vmAccessGate, VmAccessGate.ShowBlockingOverlay.INSTANCE)), bfm, g0w, (iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            } else if (vmAccessGate instanceof VmAccessGate.Spinner) {
                bfm.AgE(887798388);
                B1U b1uA00 = B1V.A00(bfm, new HatchVmAccessHostKt$HatchVmAccessHost$spinner$1(vmAccessGate), 1198670511);
                if (((VmAccessGate.Spinner) vmAccessGate).escapable) {
                    bfm.AgE(888013404);
                    GateSettingsEscapeScaffold(b1uA00, bfm, 6);
                } else {
                    bfm.AgE(888071126);
                    AnonymousClass001.A1B(b1uA00, bfm, 6);
                }
                BBI.A0R(bbiA0M, false);
            } else if (vmAccessGate instanceof VmAccessGate.Maintenance) {
                bfm.AgE(444292158);
                GateSettingsEscapeScaffold(B1V.A00(bfm, new C126612(vmAccessGate), 1861781599), bfm, 6);
            } else {
                if (!(vmAccessGate instanceof VmAccessGate.ErrorScreen)) {
                    throw AnonymousClass003.A0k(bfm, bbiA0M, 444276078);
                }
                bfm.AgE(444302083);
                String strA01 = AbstractC2271BQs.A01(bfm, ((VmAccessGate.ErrorScreen) vmAccessGate).messageRes);
                boolean zA67 = bfm.A67(abstractC3358CGz);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchVmAccessHostKt$HatchVmAccessHost$3$1(abstractC3358CGz);
                    bfm.Ai0(objAaT2);
                }
                HatchVmAccessErrorScreen(strA01, (Function0) objAaT2, bfm, 0);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(abstractC3358CGz, auraNavKey, z, g0w, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.main.VmAccessGate vmAccessGate(X.AbstractC3358CGz r14, com.facebook.aura.navigation.AuraNavKey r15, X.BFM r16, int r17) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchVmAccessHostKt.vmAccessGate(X.CGz, com.facebook.aura.navigation.AuraNavKey, X.BFM, int):com.facebook.aura.main.VmAccessGate");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RegisterPinEntryPoint.values().length];
            try {
                AnonymousClass002.A13(RegisterPinEntryPoint.SETTINGS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(RegisterPinEntryPoint.INTERNAL_SETTINGS, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(RegisterPinEntryPoint.SVM_TO_CVM_SWITCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(RegisterPinEntryPoint.SVM_TO_CVM_DATA_TRANSFER, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(RegisterPinEntryPoint.ONBOARDING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(RegisterPinEntryPoint.ACTIVATION, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(RegisterPinEntryPoint.CVM_ENROLLMENT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HardReplacementCopy(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1016344877);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C3TH c3th = C2VU.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRg2.then(c1062ATq), AuraDimensKt.SpacingXlarge);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchVmAccessHostKt$HardReplacementCopy$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA07, objAaT, false);
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207a2);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchVmAccessHostKt$HardReplacementCopy$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT2, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A05(bfm, bs0);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207a1), c1062ATq, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126593(bRg2, i, i2);
        }
    }

    public static final String forLog(VmAccessGate vmAccessGate) {
        StringBuilder sb;
        if (C7384Etj.areEqual(vmAccessGate, VmAccessGate.ShowContent.INSTANCE)) {
            return "content";
        }
        if (C7384Etj.areEqual(vmAccessGate, VmAccessGate.ShowBlockingOverlay.INSTANCE)) {
            return "blocking_overlay";
        }
        if (vmAccessGate instanceof VmAccessGate.Spinner) {
            String str = ((VmAccessGate.Spinner) vmAccessGate).debugCaption;
            sb = new StringBuilder("spinner(");
            sb.append(str);
        } else {
            if (!(vmAccessGate instanceof VmAccessGate.Maintenance)) {
                if (vmAccessGate instanceof VmAccessGate.ErrorScreen) {
                    return "error_screen";
                }
                throw new NoWhenBranchMatchedException();
            }
            HatchVmState hatchVmState = ((VmAccessGate.Maintenance) vmAccessGate).state;
            sb = new StringBuilder("maintenance(");
            sb.append(hatchVmState);
        }
        return AnonymousClass001.A0v(")", sb);
    }

    public static final void GateSettingsEscapeScaffold(G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        bfm.AgG(-584044296);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0v) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 3, 2), bfm, iA0T)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AuraContainer.PrimaryScreen primaryScreen = AuraContainer.PrimaryScreen.INSTANCE;
            AHH ahhA0E = AGI.A0E(HeaderButton.Settings);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchVmAccessHostKt$GateSettingsEscapeScaffold$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(primaryScreen, null, null, 0L, "", null, null, null, false, false, 0, null, null, ahhA0E, (G0U) objAaT, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass2(g0v), -923159171), bfm, 805330950, 3072, 805306416, 534748654);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(g0v, i);
        }
    }

    public static final void HatchVmAccessErrorScreen(String str, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-666854368);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            GateSettingsEscapeScaffold(B1V.A00(bfm, new AnonymousClass1(str, function0), 1544458226), bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126602(str, function0, i);
        }
    }
}
