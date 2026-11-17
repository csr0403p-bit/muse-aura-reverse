package com.facebook.aura.confidentialvm.view.setup;

import X.AKQ;
import X.ARD;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmProgressLayoutKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmProgressLayoutKt$ConfidentialVmActivationProgress$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            ConfidentialVmProgressLayoutKt.ConfidentialVmActivationProgress(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmProgressLayoutKt$ConfidentialVmProgressCopy$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $description;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$description = str2;
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
            ConfidentialVmProgressLayoutKt.ConfidentialVmProgressCopy(this.$title, this.$description, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.setup.ConfidentialVmProgressLayoutKt$ConfidentialVmProgressLayout$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $debugCaption;
        public final /* synthetic */ String $description;
        public final /* synthetic */ String $footnote;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, String str3, String str4, BRg bRg, int i, int i2) {
            super(2);
            this.$debugCaption = str;
            this.$title = str2;
            this.$description = str3;
            this.$footnote = str4;
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
            ConfidentialVmProgressLayoutKt.ConfidentialVmProgressLayout(this.$debugCaption, this.$title, this.$description, this.$footnote, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ConfidentialVmActivationProgress(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(868089470);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchOrigin hatchOrigin = HatchOrigin.ONBOARDING;
            HatchSurface hatchSurface = HatchSurface.ONBOARDING;
            HatchSubsurface hatchSubsurface = HatchSubsurface.ONBOARDING_POST_AUTH;
            HatchScreen hatchScreen = HatchScreen.ONBOARDING_VM_PROVISIONING;
            HatchComponent hatchComponent = HatchComponent.CVM_SCREEN_VIEW;
            ConfidentialVmProgressLayout("activation: confidential VM provisioning", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12072b), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12073f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12073a), HatchImpressionModifierKt.hatchImpression(bRg2, hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, null, null, 500L, 0.0f, null, FGI.A0U(hatchScreen.getValue(), ":", hatchComponent.getValue()), null), bfm, 6, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmProgressCopy(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(-30690721);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            C3TH c3th = C2VU.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA07 = C3U4.A07(bRgA0P.then(c1062ATq), AuraDimensKt.SpacingLarge);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ConfidentialVmProgressLayoutKt$ConfidentialVmProgressCopy$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRgA07, (G0U) objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA012, iA0J);
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title2Medium;
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = ConfidentialVmProgressLayoutKt$ConfidentialVmProgressCopy$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(c1062ATq, (G0U) objAaT2, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, c1062ATq, C06G.A0C(bfm), C01N.A01(bfm, bs0, AuraDimensKt.SpacingXsmallPlusNano).subheadlineRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, ((iA0d >> 3) & 14) | 48, 0, 16304);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, str2, bRgA0P, i, i2);
        }
    }

    public static final void ConfidentialVmProgressLayout(String str, String str2, String str3, String str4, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, str3);
        bfm.AgG(-1448341910);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str4);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A01;
            BRg bRgThen = bRgA0Q.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            OnboardingAndActivationSpinnerKt.OnboardingAndActivationSpinner(str, c1062ATq, B1V.A00(bfm, new ConfidentialVmProgressLayoutKt$ConfidentialVmProgressLayout$1$1(str2, str3), 103630790), bfm, (iA0d & 14) | 432, 0);
            if (str4 == null) {
                bfm.AgE(-1659819615);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str4, C3U4.A0B(AbstractC1754Apr.A01(c0z7.A4C(C2VU.A06, bs0)), AuraDimensKt.SpacingXlarge, AuraDimensKt.SpacingLarge), C06G.A08(bfm), AnonymousClass006.A0k(bfm, -1659819614).footnoteRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, zA1Z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, str3, str4, bRgA0Q, i, i2);
        }
    }
}
