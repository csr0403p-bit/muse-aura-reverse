package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AHI;
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
import X.AnonymousClass006;
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
import X.C7384Etj;
import X.C90l;
import X.F60;
import X.FXS;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginNtpUpsellChoiceScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellChoiceScreenKt$NativeLoginNtpUpsellChoiceCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRowClick;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ NtpUpsellChoiceRowUiState $row;
        public final /* synthetic */ String $selectedRowId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiState, G0U<? super String, Unit> g0u, Function0<Unit> function0, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$row = ntpUpsellChoiceRowUiState;
            this.$onRowClick = g0u;
            this.$onUseAnotherAccount = function0;
            this.$isLoading = z;
            this.$selectedRowId = str;
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
            NativeLoginNtpUpsellChoiceScreenKt.NativeLoginNtpUpsellChoiceCard(this.$row, this.$onRowClick, this.$onUseAnotherAccount, this.$isLoading, this.$selectedRowId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellChoiceScreenKt$NativeLoginNtpUpsellChoiceScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ String $destination;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $neutral;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ Function0<Unit> $onNeutralUseAnotherAccount;
        public final /* synthetic */ G0U<String, Unit> $onRowClick;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ AHD<NtpUpsellChoiceRowUiState> $rows;
        public final /* synthetic */ String $selectedRowId;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, HatchTosDisclosure hatchTosDisclosure, G0U<? super String, Unit> g0u, String str, AHD<NtpUpsellChoiceRowUiState> ahd, G0U<? super String, Unit> g0u2, Function0<Unit> function03, String str2) {
            super(4);
            this.$isLoading = z;
            this.$neutral = z2;
            this.$onNeutralUseAnotherAccount = function0;
            this.$onDecline = function02;
            this.$tos = hatchTosDisclosure;
            this.$onTosTokenTap = g0u;
            this.$destination = str;
            this.$rows = ahd;
            this.$onRowClick = g0u2;
            this.$onUseAnotherAccount = function03;
            this.$selectedRowId = str2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1297invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1297invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            String strA0s;
            ApQ apQA0X;
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
            HatchTosDisclosure hatchTosDisclosure = this.$tos;
            G0U<String, Unit> g0u = this.$onTosTokenTap;
            String str = this.$destination;
            AHD<NtpUpsellChoiceRowUiState> ahd = this.$rows;
            G0U<String, Unit> g0u2 = this.$onRowClick;
            Function0<Unit> function03 = this.$onUseAnotherAccount;
            String str2 = this.$selectedRowId;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u3 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u3);
            BRg bRgAiP = C90l.A00.AiP(bs0, 1.0f, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgAiP, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u3, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            if (z2) {
                bfm.AgE(460456047);
                strA0s = AnonymousClass003.A0f(bfm, bbi, HatchAppName.value, R.string._name_removed__res_0x7f120442);
            } else {
                bfm.AgE(460564330);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12048f);
            }
            BRg bRgA00 = AbstractC07539Wl.A00(bs0, "native-login-ntp-upsell-choice-screen");
            if (z2) {
                bfm.AgE(460805076);
                apQA0X = NativeLoginNeutralLandingKt.nativeLoginNeutralSubtitle(bfm, 0);
            } else {
                bfm.AgE(460885242);
                String strA04 = FXS.A03().A04(str);
                C7384Etj.A0U(strA04);
                apQA0X = AnonymousClass005.A0X(AnonymousClass006.A0w(bfm, strA04, HatchAppName.value, R.string._name_removed__res_0x7f12048e));
            }
            BBI.A0R(bbi, false);
            NativeLoginCommonKt.NativeLoginHero(strA0s, bRgA00, apQA0X, false, false, null, bfm, 48, 56);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1924781902);
            while (itA0w.hasNext()) {
                NativeLoginNtpUpsellChoiceScreenKt.NativeLoginNtpUpsellChoiceCard((NtpUpsellChoiceRowUiState) itA0w.next(), g0u2, function03, z, str2, c1062ATq, bfm, NtpUpsellChoiceRowUiState.$stable | 196608, 0);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            }
            BBI.A0R(bbi, false);
            if (z2) {
                bfm.AgE(461702774);
                NativeLoginNeutralLandingKt.NativeLoginCreateNewAccountCard(function02, !z, null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(461795030);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            float f3 = AuraDimensKt.SpacingLargePlusMicro;
            C01N.A08(bfm, bs0, f3);
            if (z) {
                bfm.AgE(-231349711);
                C01N.A04(bfm, bbi, bs0, NativeLoginCommonKt.MIN_TOUCH_TARGET, false);
            } else if (z2) {
                bfm.AgE(-231266786);
                C06G.A0n(function0, bfm, R.string._name_removed__res_0x7f120544);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-231024955);
                C06G.A0n(function02, bfm, R.string._name_removed__res_0x7f1204e0);
                BBI.A0R(bbi, false);
            }
            if (hatchTosDisclosure != null) {
                bfm.AgE(-230770879);
                C01N.A08(bfm, bs0, f3);
                NativeLoginTosDisclosureKt.m1307NativeLoginTosDisclosuregm0gx_Q(hatchTosDisclosure, c1062ATq, 5, false, g0u, null, bfm, 48, 40);
            } else {
                bfm.AgE(-230514292);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f3 + f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellChoiceScreenKt$NativeLoginNtpUpsellChoiceScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ HatchLandingPresentation $landingPresentation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onDecline;
        public final /* synthetic */ Function0<Unit> $onNeutralUseAnotherAccount;
        public final /* synthetic */ G0U<String, Unit> $onRowClick;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ AHD<NtpUpsellChoiceRowUiState> $rows;
        public final /* synthetic */ String $selectedRowId;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<NtpUpsellChoiceRowUiState> ahd, String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, HatchTosDisclosure hatchTosDisclosure, G0U<? super String, Unit> g0u2, boolean z, String str2, HatchLandingPresentation hatchLandingPresentation, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$rows = ahd;
            this.$destination = str;
            this.$onRowClick = g0u;
            this.$onDecline = function0;
            this.$onUseAnotherAccount = function02;
            this.$onNeutralUseAnotherAccount = function03;
            this.$onBack = function04;
            this.$tos = hatchTosDisclosure;
            this.$onTosTokenTap = g0u2;
            this.$isLoading = z;
            this.$selectedRowId = str2;
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
            NativeLoginNtpUpsellChoiceScreenKt.NativeLoginNtpUpsellChoiceScreen(this.$rows, this.$destination, this.$onRowClick, this.$onDecline, this.$onUseAnotherAccount, this.$onNeutralUseAnotherAccount, this.$onBack, this.$tos, this.$onTosTokenTap, this.$isLoading, this.$selectedRowId, this.$landingPresentation, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginNtpUpsellChoiceCard(com.facebook.aura.login.nativeflow.NtpUpsellChoiceRowUiState r25, X.G0U<? super java.lang.String, kotlin.Unit> r26, kotlin.jvm.functions.Function0<kotlin.Unit> r27, boolean r28, java.lang.String r29, X.BRg r30, X.BFM r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellChoiceScreenKt.NativeLoginNtpUpsellChoiceCard(com.facebook.aura.login.nativeflow.NtpUpsellChoiceRowUiState, X.G0U, kotlin.jvm.functions.Function0, boolean, java.lang.String, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginNtpUpsellChoiceScreen(X.AHD<com.facebook.aura.login.nativeflow.NtpUpsellChoiceRowUiState> r59, java.lang.String r60, X.G0U<? super java.lang.String, kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, kotlin.jvm.functions.Function0<kotlin.Unit> r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, com.facebook.aura.login.nativeflow.HatchTosDisclosure r66, X.G0U<? super java.lang.String, kotlin.Unit> r67, boolean r68, java.lang.String r69, com.facebook.aura.login.nativeflow.HatchLandingPresentation r70, X.BRg r71, X.BFM r72, int r73, int r74, int r75) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginNtpUpsellChoiceScreenKt.NativeLoginNtpUpsellChoiceScreen(X.AHD, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.facebook.aura.login.nativeflow.HatchTosDisclosure, X.G0U, boolean, java.lang.String, com.facebook.aura.login.nativeflow.HatchLandingPresentation, X.BRg, X.BFM, int, int, int):void");
    }

    public static final NativeLoginAccountUiModel sourceAppOnlyAccount(NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiState, BFM bfm, int i) {
        String str = ntpUpsellChoiceRowUiState.id;
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp = ntpUpsellChoiceRowUiState.sourceApp;
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp2 = HatchTwoFactorSourceApp.Instagram;
        int i2 = R.string._name_removed__res_0x7f1204de;
        if (hatchTwoFactorSourceApp == hatchTwoFactorSourceApp2) {
            i2 = R.string._name_removed__res_0x7f1204df;
        }
        String strA01 = AbstractC2271BQs.A01(bfm, i2);
        HatchTwoFactorSourceApp hatchTwoFactorSourceApp3 = ntpUpsellChoiceRowUiState.sourceApp;
        String wireValue = hatchTwoFactorSourceApp3 != null ? hatchTwoFactorSourceApp3.getWireValue() : null;
        AHI ahi = AHI.A01;
        return new NativeLoginAccountUiModel(str, strA01, null, null, ahi, 0, ahi, false, false, false, false, wireValue, null, null, false, HatchDisclosurePresentation.INLINE, HatchAccountStatus.ACTIVE);
    }

    public static final String spokenSourceApp(NtpUpsellChoiceRowUiState ntpUpsellChoiceRowUiState, BFM bfm, int i) {
        NativeLoginAccountUiModel nativeLoginAccountUiModel = ntpUpsellChoiceRowUiState.account;
        if (nativeLoginAccountUiModel == null || nativeLoginAccountUiModel.isF3 || ntpUpsellChoiceRowUiState.sourceApp == null) {
            AnonymousClass004.A1A(bfm, -340069470);
            return null;
        }
        bfm.AgE(-340122108);
        String str = sourceAppOnlyAccount(ntpUpsellChoiceRowUiState, bfm, (i & 14) | NtpUpsellChoiceRowUiState.$stable).displayName;
        AnonymousClass002.A19(bfm);
        return str;
    }
}
