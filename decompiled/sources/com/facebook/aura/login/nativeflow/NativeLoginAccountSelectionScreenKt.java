package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKQ;
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
import X.AxM;
import X.B1V;
import X.B81;
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
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
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
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginAccountSelectionScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountSelectionScreenKt$NativeLoginAccountSelectionScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ G0U<String, Unit> $onAccountClick;
        public final /* synthetic */ Function0<Unit> $onCreateNewAccount;
        public final /* synthetic */ String $selectedAccountId;
        public final /* synthetic */ boolean $singleCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, Function0<Unit> function0, boolean z, String str2, AHD<NativeLoginAccountUiModel> ahd, G0U<? super String, Unit> g0u) {
            super(4);
            this.$selectedAccountId = str;
            this.$onCreateNewAccount = function0;
            this.$singleCard = z;
            this.$destination = str2;
            this.$accounts = ahd;
            this.$onAccountClick = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1273invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1273invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            String strA0s;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C10G.A01, NativeLoginCommonKt.NATIVE_LOGIN_PAGE_GUTTER);
            C3TH c3th = C2VU.A00;
            String str = this.$selectedAccountId;
            Function0<Unit> function0 = this.$onCreateNewAccount;
            boolean z = this.$singleCard;
            String str2 = this.$destination;
            AHD<NativeLoginAccountUiModel> ahd = this.$accounts;
            G0U<String, Unit> g0u = this.$onAccountClick;
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
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            BRg bRgAiP = C90l.A00.AiP(bs0, 1.0f, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgAiP, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            int i3 = R.string._name_removed__res_0x7f12048f;
            if (z) {
                i3 = R.string._name_removed__res_0x7f120490;
            }
            NativeLoginCommonKt.NativeLoginHero(AbstractC2271BQs.A01(bfm, i3), null, AnonymousClass005.A0X(NativeLoginAccountSelectionScreenKt.accountSelectionSubtitle(z, str2, bfm, 0)), false, false, null, bfm, 0, 58);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -87133382);
            while (itA0w.hasNext()) {
                NativeLoginAccountUiModel nativeLoginAccountUiModel = (NativeLoginAccountUiModel) itA0w.next();
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, nativeLoginAccountUiModel);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new NativeLoginAccountSelectionScreenKt$NativeLoginAccountSelectionScreen$1$1$1$1$1$1(g0u, nativeLoginAccountUiModel);
                    bfm.Ai0(objAaT);
                }
                Function0 function03 = (Function0) objAaT;
                boolean zAreEqual = C7384Etj.areEqual(nativeLoginAccountUiModel.id, str);
                boolean zA1Y = AnonymousClass002.A1Y(str);
                boolean z2 = nativeLoginAccountUiModel.showMuseTransparency;
                if (z) {
                    bfm.AgE(40892319);
                    strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f1204a5);
                } else {
                    bfm.AgE(1267720821);
                    BBI.A0R(bbi, false);
                    strA0s = null;
                }
                NativeLoginLandingAccountCardKt.NativeLoginLandingAccountCard(nativeLoginAccountUiModel, function03, function0, c1062ATq, zAreEqual, zA1Y, false, z, false, z2, strA0s, bfm, NativeLoginAccountUiModel.$stable | 3072, 0, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH);
                C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            if (str == null) {
                bfm.AgE(-776852797);
                C06G.A0n(function0, bfm, R.string._name_removed__res_0x7f1204e0);
            } else {
                bfm.AgE(-776614376);
                C01N.A08(bfm, bs0, NativeLoginCommonKt.MIN_TOUCH_TARGET);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingLargePlusMicro + f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginAccountSelectionScreenKt$NativeLoginAccountSelectionScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ String $destination;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onAccountClick;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onCreateNewAccount;
        public final /* synthetic */ String $selectedAccountId;
        public final /* synthetic */ boolean $singleCard;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AHD<NativeLoginAccountUiModel> ahd, boolean z, String str, String str2, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$accounts = ahd;
            this.$singleCard = z;
            this.$destination = str;
            this.$selectedAccountId = str2;
            this.$onAccountClick = g0u;
            this.$onCreateNewAccount = function0;
            this.$onBack = function02;
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
            NativeLoginAccountSelectionScreenKt.NativeLoginAccountSelectionScreen(this.$accounts, this.$singleCard, this.$destination, this.$selectedAccountId, this.$onAccountClick, this.$onCreateNewAccount, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginAccountSelectionScreen(AHD<NativeLoginAccountUiModel> ahd, boolean z, String str, String str2, G0U<? super String, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(ahd, 0, str);
        AnonymousClass003.A0y(g0u, function0);
        C7384Etj.A0Y(function02, 6);
        bfm.AgG(514184020);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, function0);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, function02);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA05 |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(4793491 & iA05, 4793490), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            B81.A00(false, function02, bfm, (iA05 >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 1);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_PRE_AUTH, HatchScreen.LOGIN_ACCOUNT_SELECTION, HatchComponent.LOGIN_ACCOUNT_SELECTION_LIST, null, AnonymousClass006.A10(HatchMetadataKey.TOTAL_COUNT.getValue(), String.valueOf(ahd.size())), null, 500L, 0.0f, null, null, null), AuraContentRole.Focused, 0L, null, null, function02, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, NativeLoginCommonKt.NATIVE_LOGIN_CONTENT_TOP_SPACING, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(str2, function0, z, str, ahd, g0u), -1949604967), bfm, (3670016 & iA05) | 12583302, 0, 805306368, 535822136);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ahd, z, str, str2, g0u, function0, function02, bRg2, i, i2);
        }
    }

    public static final String accountSelectionSubtitle(boolean z, String str, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        if (z) {
            bfm.AgE(1540387194);
            i2 = R.string._name_removed__res_0x7f1204e1;
            objArr = new Object[]{HatchAppName.value};
        } else {
            bfm.AgE(1540495446);
            i2 = R.string._name_removed__res_0x7f12048e;
            String strA04 = FXS.A03().A04(str);
            C7384Etj.A0U(strA04);
            objArr = new Object[]{strA04, HatchAppName.value};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA02;
    }
}
