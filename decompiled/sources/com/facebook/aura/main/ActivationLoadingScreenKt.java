package com.facebook.aura.main;

import X.AKQ;
import X.AbstractC04661Bq;
import X.AbstractC1011APs;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C1515AkP;
import X.C1Cd;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.bugreport.AuraBugReportScreenKt;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ActivationLoadingScreenKt {
    public static final long STUCK_REPORT_DELAY_MS = 5000;

    /* renamed from: com.facebook.aura.main.ActivationLoadingScreenKt$ActivationLoadingScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraRageShakeManager $rageShakeManager;
        public final /* synthetic */ AbstractC3358CGz $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbstractC3358CGz abstractC3358CGz, AuraRageShakeManager auraRageShakeManager, BRg bRg, int i, int i2) {
            super(2);
            this.$session = abstractC3358CGz;
            this.$rageShakeManager = auraRageShakeManager;
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
            ActivationLoadingScreenKt.ActivationLoadingScreen(this.$session, this.$rageShakeManager, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.ActivationLoadingScreenKt$ActivationLoadingScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraRageShakeManager $rageShakeManager;
        public final /* synthetic */ AbstractC3358CGz $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(AbstractC3358CGz abstractC3358CGz, AuraRageShakeManager auraRageShakeManager, BRg bRg, int i, int i2) {
            super(2);
            this.$session = abstractC3358CGz;
            this.$rageShakeManager = auraRageShakeManager;
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
            ActivationLoadingScreenKt.ActivationLoadingScreen(this.$session, this.$rageShakeManager, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.ActivationLoadingScreenKt$StuckReportButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0) {
            super(3);
            this.$onClick = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
            invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
                AnonymousClass005.A0o(bfm, BOf.A00(bfm, R.drawable.circle_alert_wght400_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c21), this.$onClick);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.main.ActivationLoadingScreenKt$StuckReportButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C126503 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126503(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            ActivationLoadingScreenKt.StuckReportButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ActivationLoadingScreen(AbstractC3358CGz abstractC3358CGz, AuraRageShakeManager auraRageShakeManager, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, auraRageShakeManager);
        bfm.AgG(-598764518);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, abstractC3358CGz) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraRageShakeManager, bfm, i) ? 1 : 0);
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
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ActivationLoadingScreenKt$ActivationLoadingScreen$showBugReport$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            Object[] objArr2 = new Object[0];
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = ActivationLoadingScreenKt$ActivationLoadingScreen$submissionId$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT2, objArr2);
            Object[] objArr3 = new Object[0];
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = ActivationLoadingScreenKt$ActivationLoadingScreen$screenshotUri$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA0K2 = AnonymousClass006.A0K(bfm, objAaT3, objArr3);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new ActivationLoadingScreenKt$ActivationLoadingScreen$rageShakeHandler$1$1(mutableStateA0N, mutableStateA0K, mutableStateA0K2);
                bfm.Ai0(objAaT4);
            }
            G0V g0v = (G0V) objAaT4;
            boolean z = (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(auraRageShakeManager));
            Object objAaT5 = bfm.AaT();
            if (z || objAaT5 == obj) {
                objAaT5 = new ActivationLoadingScreenKt$ActivationLoadingScreen$1$1(auraRageShakeManager, g0v);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A19(bfm, objAaT5, auraRageShakeManager, g0v);
            if (MutableState.A0A(mutableStateA0N)) {
                boolean zA1Y = AnonymousClass001.A1Y(mutableStateA0N, bfm, -793739099);
                Object objAaT6 = bfm.AaT();
                if (zA1Y || objAaT6 == obj) {
                    objAaT6 = new ActivationLoadingScreenKt$ActivationLoadingScreen$2$1(mutableStateA0N);
                    bfm.Ai0(objAaT6);
                }
                AuraBugReportScreenKt.AuraBugReportScreen((Function0) objAaT6, MutableState.A05(mutableStateA0K), MutableState.A05(mutableStateA0K2), null, abstractC3358CGz, null, bRg2, bfm, (iA0T << 12) & 3727360, 40);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass3(abstractC3358CGz, auraRageShakeManager, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass5;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -793520952);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0D);
            C0z7 c0z7 = C0z7.A00;
            OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner("session: activating", null, null, bfm, 6, 6);
            boolean zA1R = AnonymousClass005.A1R(bfm, mutableStateA0K, mutableStateA0K2, mutableStateA0N);
            Object objAaT7 = bfm.AaT();
            if (zA1R || objAaT7 == obj) {
                objAaT7 = new ActivationLoadingScreenKt$ActivationLoadingScreen$4$1$1(mutableStateA0K, mutableStateA0K2, mutableStateA0N);
                bfm.Ai0(objAaT7);
            }
            StuckReportButton((Function0) objAaT7, C3U4.A09(AbstractC1754Apr.A02(c0z7.A4C(C2VU.A0D, BRg.A00)), AuraDimensKt.SpacingMedium), bfm, 0, 0);
            BBI.A0R(bbiA0M, zA1a);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(abstractC3358CGz, auraRageShakeManager, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }

    public static final void StuckReportButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2078267982);
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Unit unit = Unit.INSTANCE;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new ActivationLoadingScreenKt$StuckReportButton$1$1(mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            AbstractC04661Bq.A08(AbstractC1011APs.A03(0.0f, 3), null, bfm, bRg2, null, B1V.A00(bfm, new AnonymousClass2(function0), -1459946022), (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196992, 24, MutableState.A0A(mutableState));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126503(function0, bRg2, i, i2);
        }
    }
}
