package com.facebook.aura.login.nativeflow;

import X.AKQ;
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
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.LocalDate;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginReactivationScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginReactivationScreenKt$NativeLoginReactivationScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $body;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onReactivate;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Unit> function0, Function0<Unit> function02, String str, String str2) {
            super(4);
            this.$isLoading = z;
            this.$onReactivate = function0;
            this.$onCancel = function02;
            this.$title = str;
            this.$body = str2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1306invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1306invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C10G.A01, NativeLoginCommonKt.NATIVE_LOGIN_PAGE_GUTTER);
            C3TH c3th = C2VU.A00;
            boolean z = this.$isLoading;
            Function0<Unit> function0 = this.$onReactivate;
            Function0<Unit> function02 = this.$onCancel;
            String str = this.$title;
            String str2 = this.$body;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0N = AnonymousClass001.A0N(C90l.A00, bs0, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgA0N, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            NativeLoginCommonKt.NativeLoginHero(str, null, null, false, false, null, bfm, 0, 62);
            float f3 = AuraDimensKt.SpacingLargePlusMicro;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, NativeLoginCommonKt.nativeLoginTextInset(c1062ATq), C06G.A08(bfm), C01N.A01(bfm, bs0, f3).subheadlineRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, f3);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12050f);
            String strA0r = AnonymousClass001.A0r(bfm);
            boolean zA1T = AnonymousClass005.A1T(bfm, function0, strA0r, function02, AnonymousClass003.A1T(bfm, strA01, z));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new NativeLoginReactivationScreenKt$NativeLoginReactivationScreen$1$1$2$1(strA01, z, function0, strA0r, function02);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(c1062ATq, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582918, 126);
            C01N.A04(bfm, bbi, bs0, f3 + f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginReactivationScreenKt$NativeLoginReactivationScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onReactivate;
        public final /* synthetic */ HatchReactivationChallenge $reactivation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchReactivationChallenge hatchReactivationChallenge, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$reactivation = hatchReactivationChallenge;
            this.$isLoading = z;
            this.$onReactivate = function0;
            this.$onCancel = function02;
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
            NativeLoginReactivationScreenKt.NativeLoginReactivationScreen(this.$reactivation, this.$isLoading, this.$onReactivate, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginReactivationScreen(HatchReactivationChallenge hatchReactivationChallenge, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        int i3;
        Object[] objArr;
        String strA02;
        BRg bRg2 = bRg;
        AnonymousClass005.A11(hatchReactivationChallenge, function0, function02, 0);
        bfm.AgG(1600900821);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchReactivationChallenge) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            if (C7BY.A0j(hatchReactivationChallenge.accountName)) {
                bfm.AgE(1119934002);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120511);
            } else {
                bfm.AgE(1119820480);
                strA01 = AnonymousClass001.A0t(bfm, hatchReactivationChallenge.accountName, R.string._name_removed__res_0x7f120510);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            LocalDate localDate = hatchReactivationChallenge.scheduledDeletionOn;
            if (localDate == null) {
                bfm.AgE(867417661);
                strA02 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12050d);
            } else {
                if (C7BY.A0j(hatchReactivationChallenge.accountName)) {
                    bfm.AgE(867428975);
                    i3 = R.string._name_removed__res_0x7f12050e;
                    C7384Etj.A0X(localeA0b);
                    objArr = new Object[]{NativeLoginCheckpointScreenKt.formatLongDate(localDate, localeA0b)};
                } else {
                    bfm.AgE(867422065);
                    i3 = R.string._name_removed__res_0x7f12050c;
                    String str = hatchReactivationChallenge.accountName;
                    C7384Etj.A0X(localeA0b);
                    objArr = new Object[]{str, NativeLoginCheckpointScreenKt.formatLongDate(localDate, localeA0b)};
                }
                strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            }
            BBI.A0R(bbi, false);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_PRE_AUTH, HatchScreen.LOGIN_REACTIVATION, HatchComponent.LOGIN_REACTIVATION_NOTICE, null, null, null, 500L, 0.0f, null, null, null), null, 0L, null, null, null, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(z, function0, function02, strA01, strA02), 1301660336), bfm, 817889286, 0, 805306368, 536870268);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchReactivationChallenge, z, function0, function02, bRg2, i, i2);
        }
    }
}
