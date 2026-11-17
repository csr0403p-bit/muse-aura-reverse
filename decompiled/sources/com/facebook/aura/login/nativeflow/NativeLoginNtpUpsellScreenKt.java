package com.facebook.aura.login.nativeflow;

import X.AKQ;
import X.AbstractC07539Wl;
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
import X.ApQ;
import X.AxM;
import X.BBI;
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
import X.C2VU;
import X.C3TH;
import X.C3U4;
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
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginNtpUpsellScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellScreenKt$NativeLoginNtpUpsellScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $drawsTosClause;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $neutral;
        public final /* synthetic */ Function0<Unit> $onAccept;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ Function0<Unit> $onNeutralUseAnotherAccount;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, boolean z3, HatchTosDisclosure hatchTosDisclosure, G0U<? super String, Unit> g0u, NativeLoginAccountUiModel nativeLoginAccountUiModel, Function0<Unit> function03, Function0<Unit> function04) {
            super(4);
            this.$isLoading = z;
            this.$neutral = z2;
            this.$onNeutralUseAnotherAccount = function0;
            this.$onDecline = function02;
            this.$drawsTosClause = z3;
            this.$tos = hatchTosDisclosure;
            this.$onTosTokenTap = g0u;
            this.$account = nativeLoginAccountUiModel;
            this.$onAccept = function03;
            this.$onUseAnotherAccount = function04;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1298invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1298invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            String strA01;
            ApQ apQA0X;
            String strA0s;
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
            boolean z2 = this.$neutral;
            Function0<Unit> function0 = this.$onNeutralUseAnotherAccount;
            Function0<Unit> function02 = this.$onDecline;
            boolean z3 = this.$drawsTosClause;
            HatchTosDisclosure hatchTosDisclosure = this.$tos;
            G0U<String, Unit> g0u = this.$onTosTokenTap;
            NativeLoginAccountUiModel nativeLoginAccountUiModel = this.$account;
            Function0<Unit> function03 = this.$onAccept;
            Function0<Unit> function04 = this.$onUseAnotherAccount;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            BRg bRgA0N = AnonymousClass001.A0N(C90l.A00, bs0, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgA0N, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function05);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            if (z2) {
                bfm.AgE(106595818);
                strA01 = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120442);
            } else {
                bfm.AgE(106703884);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204e2);
            }
            BBI.A0R(bbi, false);
            BRg bRgA00 = AbstractC07539Wl.A00(bs0, "native-login-ntp-upsell-screen");
            if (z2) {
                bfm.AgE(106930959);
                apQA0X = NativeLoginNeutralLandingKt.nativeLoginNeutralSubtitle(bfm, 0);
            } else {
                bfm.AgE(107008428);
                apQA0X = AnonymousClass005.A0X(AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f1204e1));
            }
            BBI.A0R(bbi, false);
            NativeLoginCommonKt.NativeLoginHero(strA01, bRgA00, apQA0X, false, false, null, bfm, 48, 56);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            boolean z4 = !z;
            boolean z5 = !z2;
            boolean z6 = nativeLoginAccountUiModel.showMuseTransparency;
            if (z2) {
                bfm.AgE(107756364);
                BBI.A0R(bbi, false);
                strA0s = null;
            } else {
                bfm.AgE(1388949704);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f1204a5);
            }
            NativeLoginLandingAccountCardKt.NativeLoginLandingAccountCard(nativeLoginAccountUiModel, function03, function04, c1062ATq, z, z4, false, z5, false, z6, strA0s, bfm, NativeLoginAccountUiModel.$stable | 3072, 0, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH);
            if (z2) {
                bfm.AgE(107857921);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
                NativeLoginNeutralLandingKt.NativeLoginCreateNewAccountCard(function02, z4, null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(107996305);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            float f3 = AuraDimensKt.SpacingLargePlusMicro;
            C01N.A08(bfm, bs0, f3);
            if (z) {
                bfm.AgE(1756297324);
                C01N.A04(bfm, bbi, bs0, NativeLoginCommonKt.MIN_TOUCH_TARGET, false);
            } else if (z2) {
                bfm.AgE(1756380249);
                C06G.A0n(function0, bfm, R.string._name_removed__res_0x7f120544);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1756622080);
                C06G.A0n(function02, bfm, R.string._name_removed__res_0x7f1204e0);
                BBI.A0R(bbi, false);
            }
            if (z3) {
                bfm.AgE(1756879132);
                C01N.A08(bfm, bs0, f3);
                NativeLoginTosDisclosureKt.m1307NativeLoginTosDisclosuregm0gx_Q(hatchTosDisclosure, c1062ATq, 5, false, g0u, null, bfm, 48, 40);
            } else {
                bfm.AgE(1757135719);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f3 + f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellScreenKt$NativeLoginNtpUpsellScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NativeLoginAccountUiModel $account;
        public final /* synthetic */ boolean $drawsTosClause;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ HatchLandingPresentation $landingPresentation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAccept;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ Function0<Unit> $onNeutralUseAnotherAccount;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(NativeLoginAccountUiModel nativeLoginAccountUiModel, HatchTosDisclosure hatchTosDisclosure, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, G0U<? super String, Unit> g0u, boolean z2, HatchLandingPresentation hatchLandingPresentation, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$account = nativeLoginAccountUiModel;
            this.$tos = hatchTosDisclosure;
            this.$drawsTosClause = z;
            this.$onAccept = function0;
            this.$onDecline = function02;
            this.$onUseAnotherAccount = function03;
            this.$onNeutralUseAnotherAccount = function04;
            this.$onBack = function05;
            this.$onTosTokenTap = g0u;
            this.$isLoading = z2;
            this.$landingPresentation = hatchLandingPresentation;
            this.$modifier = bRg;
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
            NativeLoginNtpUpsellScreenKt.NativeLoginNtpUpsellScreen(this.$account, this.$tos, this.$drawsTosClause, this.$onAccept, this.$onDecline, this.$onUseAnotherAccount, this.$onNeutralUseAnotherAccount, this.$onBack, this.$onTosTokenTap, this.$isLoading, this.$landingPresentation, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginNtpUpsellScreen(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel r59, com.facebook.aura.login.nativeflow.HatchTosDisclosure r60, boolean r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, X.G0U<? super java.lang.String, kotlin.Unit> r67, boolean r68, com.facebook.aura.login.nativeflow.HatchLandingPresentation r69, X.BRg r70, X.BFM r71, int r72, int r73, int r74) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellScreenKt.NativeLoginNtpUpsellScreen(com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel, com.facebook.aura.login.nativeflow.HatchTosDisclosure, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, boolean, com.facebook.aura.login.nativeflow.HatchLandingPresentation, X.BRg, X.BFM, int, int, int):void");
    }
}
