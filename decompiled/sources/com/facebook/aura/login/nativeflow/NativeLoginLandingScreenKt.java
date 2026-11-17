package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C1DG;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginLandingScreenKt {

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt$NativeLoginLandingHeaderButtons$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onMoreOptions;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ boolean $showsMoreOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$showsMoreOptions = z;
            this.$onOpenSettings = function0;
            this.$onMoreOptions = function02;
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
            NativeLoginLandingScreenKt.NativeLoginLandingHeaderButtons(this.$showsMoreOptions, this.$onOpenSettings, this.$onMoreOptions, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt$NativeLoginLandingScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C125432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $isRemoveProfilesSheetOpen$delegate;
        public final /* synthetic */ boolean $offersRemoveProfiles;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ Function0<Unit> $onRemoveProfilesOpen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125432(boolean z, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
            super(2);
            this.$offersRemoveProfiles = z;
            this.$onOpenSettings = function0;
            this.$onRemoveProfilesOpen = function02;
            this.$isRemoveProfilesSheetOpen$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean z = this.$offersRemoveProfiles;
                Function0<Unit> function0 = this.$onOpenSettings;
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$isRemoveProfilesSheetOpen$delegate, bfm.A65(this.$onRemoveProfilesOpen));
                Function0<Unit> function02 = this.$onRemoveProfilesOpen;
                MutableState<Boolean> mutableState = this.$isRemoveProfilesSheetOpen$delegate;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new NativeLoginLandingScreenKt$NativeLoginLandingScreen$2$1$1(function02, mutableState);
                    bfm.Ai0(objAaT);
                }
                NativeLoginLandingScreenKt.NativeLoginLandingHeaderButtons(z, function0, (Function0) objAaT, null, bfm, 0, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt$NativeLoginLandingScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ boolean $animatedLogo;
        public final /* synthetic */ boolean $busy;
        public final /* synthetic */ int $collapsedCount;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $disclosedAccounts;
        public final /* synthetic */ String $loadingDescription;
        public final /* synthetic */ boolean $neutral;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onAccountClick;
        public final /* synthetic */ Function0<Unit> $onCreateNewAccountClick;
        public final /* synthetic */ Function0<Unit> $onMoreAccountsClick;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseEmailOrPhoneClick;
        public final /* synthetic */ String $removingProfileDescription;
        public final /* synthetic */ NativeLoginResolveState $resolveState;
        public final /* synthetic */ String $selectedAccountId;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $shownAccounts;
        public final /* synthetic */ boolean $signingIn;
        public final /* synthetic */ String $signingInDescription;
        public final /* synthetic */ boolean $singleMuseAccountTreatment;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(NativeLoginResolveState nativeLoginResolveState, boolean z, boolean z2, AHD<NativeLoginAccountUiModel> ahd, String str, String str2, int i, Function0<Unit> function0, HatchTosDisclosure hatchTosDisclosure, AHD<NativeLoginAccountUiModel> ahd2, G0U<? super String, Unit> g0u, boolean z3, boolean z4, AHD<NativeLoginAccountUiModel> ahd3, boolean z5, String str3, Function0<Unit> function02, Function0<Unit> function03, String str4, G0U<? super NativeLoginAccountUiModel, Unit> g0u2) {
            super(4);
            this.$resolveState = nativeLoginResolveState;
            this.$busy = z;
            this.$signingIn = z2;
            this.$shownAccounts = ahd;
            this.$signingInDescription = str;
            this.$removingProfileDescription = str2;
            this.$collapsedCount = i;
            this.$onUseEmailOrPhoneClick = function0;
            this.$tos = hatchTosDisclosure;
            this.$disclosedAccounts = ahd2;
            this.$onTosTokenTap = g0u;
            this.$neutral = z3;
            this.$singleMuseAccountTreatment = z4;
            this.$accounts = ahd3;
            this.$animatedLogo = z5;
            this.$loadingDescription = str3;
            this.$onMoreAccountsClick = function02;
            this.$onCreateNewAccountClick = function03;
            this.$selectedAccountId = str4;
            this.$onAccountClick = g0u2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1295invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x0399  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x025d  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02c6  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x02dc  */
        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1295invokei1RSzL4(float r48, float r49, X.BFM r50, int r51) {
            /*
                Method dump skipped, instructions count: 1003
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt.AnonymousClass3.m1295invokei1RSzL4(float, float, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt$NativeLoginLandingScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $accountOptions;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $accounts;
        public final /* synthetic */ boolean $animatedLogo;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $disclosedAccounts;
        public final /* synthetic */ HatchLandingPresentation $landingPresentation;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $neutralCollapsedAccounts;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onAccountClick;
        public final /* synthetic */ Function0<Unit> $onCreateNewAccountClick;
        public final /* synthetic */ Function0<Unit> $onMoreAccountsClick;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ G0U<NativeLoginAccountUiModel, Unit> $onRemoveProfile;
        public final /* synthetic */ Function0<Unit> $onRemoveProfilesDismiss;
        public final /* synthetic */ Function0<Unit> $onRemoveProfilesOpen;
        public final /* synthetic */ G0U<String, Unit> $onTosTokenTap;
        public final /* synthetic */ Function0<Unit> $onUseEmailOrPhoneClick;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $removableAccounts;
        public final /* synthetic */ NativeLoginResolveState $resolveState;
        public final /* synthetic */ String $selectedAccountId;
        public final /* synthetic */ AHD<NativeLoginAccountUiModel> $shownAccounts;
        public final /* synthetic */ NativeLoginLandingStatus $status;
        public final /* synthetic */ HatchTosDisclosure $tos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AHD<NativeLoginAccountUiModel> ahd, NativeLoginResolveState nativeLoginResolveState, G0U<? super NativeLoginAccountUiModel, Unit> g0u, Function0<Unit> function0, G0U<? super NativeLoginAccountUiModel, Unit> g0u2, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, G0U<? super String, Unit> g0u3, String str, NativeLoginLandingStatus nativeLoginLandingStatus, HatchLandingPresentation hatchLandingPresentation, AHD<NativeLoginAccountUiModel> ahd2, AHD<NativeLoginAccountUiModel> ahd3, BRg bRg, String str2, HatchTosDisclosure hatchTosDisclosure, AHD<NativeLoginAccountUiModel> ahd4, AHD<NativeLoginAccountUiModel> ahd5, boolean z, int i, int i2, int i3, int i4) {
            super(2);
            this.$accounts = ahd;
            this.$resolveState = nativeLoginResolveState;
            this.$onAccountClick = g0u;
            this.$onRemoveProfilesOpen = function0;
            this.$onRemoveProfile = g0u2;
            this.$onRemoveProfilesDismiss = function02;
            this.$onUseEmailOrPhoneClick = function03;
            this.$onCreateNewAccountClick = function04;
            this.$onMoreAccountsClick = function05;
            this.$onOpenSettings = function06;
            this.$onTosTokenTap = g0u3;
            this.$accountOptions = str;
            this.$status = nativeLoginLandingStatus;
            this.$landingPresentation = hatchLandingPresentation;
            this.$shownAccounts = ahd2;
            this.$neutralCollapsedAccounts = ahd3;
            this.$modifier = bRg;
            this.$selectedAccountId = str2;
            this.$tos = hatchTosDisclosure;
            this.$disclosedAccounts = ahd4;
            this.$removableAccounts = ahd5;
            this.$animatedLogo = z;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginLandingScreenKt.NativeLoginLandingScreen(this.$accounts, this.$resolveState, this.$onAccountClick, this.$onRemoveProfilesOpen, this.$onRemoveProfile, this.$onRemoveProfilesDismiss, this.$onUseEmailOrPhoneClick, this.$onCreateNewAccountClick, this.$onMoreAccountsClick, this.$onOpenSettings, this.$onTosTokenTap, this.$accountOptions, this.$status, this.$landingPresentation, this.$shownAccounts, this.$neutralCollapsedAccounts, this.$modifier, this.$selectedAccountId, this.$tos, this.$disclosedAccounts, this.$removableAccounts, this.$animatedLogo, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt$NativeLoginPickerFooterLink$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onUseEmailOrPhoneClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onUseEmailOrPhoneClick = function0;
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
            NativeLoginLandingScreenKt.NativeLoginPickerFooterLink(this.$onUseEmailOrPhoneClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginLandingHeaderButtons(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(1711341149);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgTrackFloatingChromeObstacle = HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(bRgA0Q, false, bfm, (iA0n >> 9) & 14, 1);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgTrackFloatingChromeObstacle);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(null, 0.0f, null, B1V.A00(bfm, new NativeLoginLandingScreenKt$NativeLoginLandingHeaderButtons$1$1(function0), -1248301501), bfm, 3072, 7);
            if (z) {
                bfm.AgE(-1324273844);
                AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(null, 0.0f, null, B1V.A00(bfm, new NativeLoginLandingScreenKt$NativeLoginLandingHeaderButtons$1$2(function02), -813039394), bfm, 3072, 7);
            } else {
                bfm.AgE(-1323915391);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, function0, function02, bRgA0Q, i, i2);
        }
    }

    public static final void NativeLoginPickerFooterLink(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-108984389);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            NativeLoginCommonKt.m1283NativeLoginTextLinkfWhpE4E(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120544), function0, bRg2, 0L, C06G.A0W(bfm), false, bfm, (iA0T << 3) & 1008, 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NativeLoginLandingScreen(X.AHD<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r80, com.facebook.aura.login.nativeflow.NativeLoginResolveState r81, X.G0U<? super com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel, kotlin.Unit> r82, kotlin.jvm.functions.Function0<kotlin.Unit> r83, X.G0U<? super com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel, kotlin.Unit> r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, X.G0U<? super java.lang.String, kotlin.Unit> r90, java.lang.String r91, com.facebook.aura.login.nativeflow.NativeLoginLandingStatus r92, com.facebook.aura.login.nativeflow.HatchLandingPresentation r93, X.AHD<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r94, X.AHD<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r95, X.BRg r96, java.lang.String r97, com.facebook.aura.login.nativeflow.HatchTosDisclosure r98, X.AHD<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r99, X.AHD<com.facebook.aura.login.nativeflow.NativeLoginAccountUiModel> r100, boolean r101, X.BFM r102, int r103, int r104, int r105, int r106) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginLandingScreenKt.NativeLoginLandingScreen(X.AHD, com.facebook.aura.login.nativeflow.NativeLoginResolveState, X.G0U, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, java.lang.String, com.facebook.aura.login.nativeflow.NativeLoginLandingStatus, com.facebook.aura.login.nativeflow.HatchLandingPresentation, X.AHD, X.AHD, X.BRg, java.lang.String, com.facebook.aura.login.nativeflow.HatchTosDisclosure, X.AHD, X.AHD, boolean, X.BFM, int, int, int, int):void");
    }
}
