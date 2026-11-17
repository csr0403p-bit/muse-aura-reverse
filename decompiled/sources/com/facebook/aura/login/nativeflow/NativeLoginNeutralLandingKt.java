package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C08R;
import X.C1515AkP;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginNeutralLandingKt {
    public static final int NATIVE_LOGIN_NEUTRAL_COLLAPSES_FROM = 3;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt$NativeLoginChoiceCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C08R, BFM, Integer, Unit> {
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2) {
            super(3);
            this.$title = str;
            this.$subtitle = str2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C08R c08r, BFM bfm, Integer num) {
            invoke(c08r, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C08R c08r, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c08r, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c08r);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                BRg bRgAiP = c08r.AiP(BRg.A00, 1.0f, true);
                String str = this.$title;
                String str2 = this.$subtitle;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgAiP);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0W(bfm), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                if (str2 != null) {
                    AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 348234235).subheadlineRegular, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
                } else {
                    bfm.AgE(348466084);
                }
                BBI.A0R(bbi, false);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt$NativeLoginChoiceCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, boolean z, BRg bRg, String str2, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
            this.$enabled = z;
            this.$modifier = bRg;
            this.$subtitle = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginNeutralLandingKt.NativeLoginChoiceCard(this.$title, this.$onClick, this.$enabled, this.$modifier, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt$NativeLoginCreateNewAccountCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C125441 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125441(Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
            this.$enabled = z;
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
            NativeLoginNeutralLandingKt.NativeLoginCreateNewAccountCard(this.$onClick, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt$NativeLoginMoreAccountsCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C125451 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125451(int i, Function0<Unit> function0, boolean z, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$onClick = function0;
            this.$enabled = z;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginNeutralLandingKt.NativeLoginMoreAccountsCard(this.$count, this.$onClick, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt$NativeLoginMoreAccountsSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C125461 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $disclosedAccounts;
        public final /* synthetic */ Map<String, String> $impressionMetadata;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onAccountClick;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125461(Map<String, String> map, AHD<NativeLoginAccountUiModel> ahd, Function0<Unit> function0, HatchTosDisclosure hatchTosDisclosure, AHD<NativeLoginAccountUiModel> ahd2, G0U<? super String, Unit> g0u, G0U<? super NativeLoginAccountUiModel, Unit> g0u2) {
            super(3);
            this.$impressionMetadata = map;
            this.$accounts = ahd;
            this.$onUseAnotherAccount = function0;
            this.$tos = hatchTosDisclosure;
            this.$disclosedAccounts = ahd2;
            this.$onTosTokenTap = g0u;
            this.$onAccountClick = g0u2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r37, X.BFM r38, int r39) {
            /*
                Method dump skipped, instructions count: 359
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt.C125461.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginNeutralLandingKt$NativeLoginMoreAccountsSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C125472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $disclosedAccounts;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onAccountClick;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseAnotherAccount;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C125472(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u2, HatchTosDisclosure hatchTosDisclosure, AHD<NativeLoginAccountUiModel> ahd2, BRg bRg, int i, int i2) {
            super(2);
            this.$accounts = ahd;
            this.$onAccountClick = g0u;
            this.$onUseAnotherAccount = function0;
            this.$onDismiss = function02;
            this.$onTosTokenTap = g0u2;
            this.$tos = hatchTosDisclosure;
            this.$disclosedAccounts = ahd2;
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
            NativeLoginNeutralLandingKt.NativeLoginMoreAccountsSheet(this.$accounts, this.$onAccountClick, this.$onUseAnotherAccount, this.$onDismiss, this.$onTosTokenTap, this.$tos, this.$disclosedAccounts, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginCreateNewAccountCard(Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(567377614);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            NativeLoginChoiceCard(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204e0), function0, z, AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg), "lobster-native-auth-create-new-account"), null, bfm, (iA0T << 3) & 1008, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125441(function0, z, bRg, i, i2);
        }
    }

    public static final void NativeLoginMoreAccountsCard(int i, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i2, int i3) {
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(161769209);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0p(bfm, z);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg = BRg.A00;
            }
            NativeLoginChoiceCard(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120544), function0, z, AbstractC07539Wl.A00(AnonymousClass001.A0R(bRg), "lobster-native-auth-more-accounts"), AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f10000f), bfm, iA0D & 1008, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125451(i, function0, z, bRg, i2, i3);
        }
    }

    public static final void NativeLoginChoiceCard(String str, Function0<Unit> function0, boolean z, BRg bRg, String str2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str3 = str2;
        bfm.AgG(-282904806);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = null;
            }
            int i5 = iA0d >> 3;
            NativeLoginLandingAccountCardKt.NativeLoginChevronCard(function0, z, bRg2, false, B1V.A00(bfm, new AnonymousClass1(str, str3), 1609402920), bfm, AnonymousClass002.A07(i5, (i5 & 14) | RuntimeInternals.IOPRIO_BACKGROUND), 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, z, bRg2, str3, i, i2);
        }
    }

    public static final void NativeLoginMoreAccountsSheet(AHD<NativeLoginAccountUiModel> ahd, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u2, HatchTosDisclosure hatchTosDisclosure, AHD<NativeLoginAccountUiModel> ahd2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(ahd, 0);
        AnonymousClass005.A11(g0u, function0, function02, 1);
        AnonymousClass002.A1E(g0u2, 4, ahd2);
        bfm.AgG(49368924);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0u2);
        }
        if ((196608 & i) == 0) {
            iA05 |= AnonymousClass004.A0Y(bfm, hatchTosDisclosure);
        }
        if ((1572864 & i) == 0) {
            iA05 |= AnonymousClass002.A01(AnonymousClass004.A1R(bfm, ahd2, 2097152, i) ? 1 : 0);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA05 |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA05 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA63 = bfm.A63(ahd.size());
            Object objAaT = bfm.AaT();
            if (zA63 || objAaT == C78N.A00) {
                objAaT = AnonymousClass006.A10(HatchMetadataKey.TOTAL_COUNT.getValue(), String.valueOf(ahd.size()));
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204d8), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, function02, false, false, false, null, B1V.A00(bfm, new C125461((Map) objAaT, ahd, function0, hatchTosDisclosure, ahd2, g0u2, g0u), -1135101505), bfm, AnonymousClass001.A05(iA05 << 9, (iA05 >> 18) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 48, 1973);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C125472(ahd, g0u, function0, function02, g0u2, hatchTosDisclosure, ahd2, bRg2, i, i2);
        }
    }

    public static final ApQ nativeLoginNeutralSubtitle(BFM bfm, int i) {
        return AnonymousClass005.A0X(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1204dc));
    }
}
