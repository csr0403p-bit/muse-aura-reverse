package com.facebook.aura.ui;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C02i;
import X.C06G;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1YL;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3O5;
import X.C3TH;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class OnboardingAndActivationSpinnerKt {
    public static final float LOGIN_SCREEN_LOGO_SIZE = 83.0f;

    /* renamed from: com.facebook.aura.ui.OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $contentBelowLogo;
        public final /* synthetic */ String $debugCaption;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$debugCaption = str;
            this.$modifier = bRg;
            this.$contentBelowLogo = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner(this.$debugCaption, this.$modifier, this.$contentBelowLogo, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void OnboardingAndActivationSpinner(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        long j;
        BBI bbiA0M;
        BS0 bs0;
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(979044777);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0v2 = null;
            }
            Unit unit = Unit.INSTANCE;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            C78e.A05(bfm, unit, (G0U) objAaT);
            C1BO c1boA02 = C2CK.A02(bfm, HatchSetupAnimationState.isHostRendering);
            if (C3O5.A00(bfm)) {
                bbiA0M = AnonymousClass002.A0M(bfm, 264207150);
                j = B6A.A01;
            } else {
                j = AnonymousClass003.A0c(bfm, 264208051).background;
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205f4);
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(bRg2), j);
            if (g0v2 == null) {
                boolean zA1Y = AnonymousClass001.A1Y(strA01, bfm, -399242806);
                Object objAaT2 = bfm.AaT();
                if (zA1Y || objAaT2 == obj) {
                    objAaT2 = new OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$semanticsModifier$1$1(strA01);
                    bfm.Ai0(objAaT2);
                }
                bRgA01 = AnonymousClass001.A0Y(bRgA01, objAaT2, true);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-399067656);
                BBI.A0R(bbiA0M, false);
            }
            C02i c02i = AcQ.A02;
            C3TH c3th = C2VU.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c02i, bfm, c3th, 54);
            long j2 = bbiA0M.A06;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
            if (C1BO.A0F(c1boA02)) {
                bfm.AgE(1523327613);
                bs0 = BRg.A00;
                BRg bRgA07 = C10G.A07(bs0, LOGIN_SCREEN_LOGO_SIZE);
                Object objAaT3 = bfm.AaT();
                if (objAaT3 == obj) {
                    objAaT3 = OnboardingAndActivationSpinnerKt$OnboardingAndActivationSpinner$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT3);
                }
                C01N.A07(bfm, AnonymousClass005.A0W(bRgA07, objAaT3));
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(1523558563);
                bs0 = BRg.A00;
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A02(C2VU.A09, C10G.A07(bs0, LOGIN_SCREEN_LOGO_SIZE), false), null, 0L, bfm, 6, 6);
                BBI.A0R(bbiA0M, false);
            }
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA013, g0vA0u);
            if (g0v2 == null) {
                bfm.AgE(-1949023235);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205b9), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title2Medium, null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                bfm.AgE(-1948400755);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-1948385751);
                AnonymousClass003.A13(bfm, g0v2, iA0d >> 6);
            }
            AnonymousClass002.A10(bbiA0M, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, g0v2, i, i2);
        }
    }

    public static final float getLOGIN_SCREEN_LOGO_SIZE() {
        return LOGIN_SCREEN_LOGO_SIZE;
    }
}
