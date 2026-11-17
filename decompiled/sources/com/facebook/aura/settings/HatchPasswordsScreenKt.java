package com.facebook.aura.settings;

import X.AKH;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BQN;
import X.BRg;
import X.C06G;
import X.C06H;
import X.C0861A6i;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1DP;
import X.C1YL;
import X.C1YY;
import X.C2CK;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.settings.HatchCredentialsViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPasswordsScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchOnePasswordLoginsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
        public final /* synthetic */ C1BO<SecureStorageCatalogUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super CredentialCandidate, Unit> g0u, C1BO<SecureStorageCatalogUiState> c1bo) {
            super(4);
            this.$onCredentialClick = g0u;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1959invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1959invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                HatchPasswordsScreenKt.m1957OnePasswordLoginsListo3XDK20(this.$uiState$delegate.getValue().onePasswordLogins, f, f2, this.$onCredentialClick, null, bfm, (iA04 << 3) & 1008, 16);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchOnePasswordLoginsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
        public final /* synthetic */ HatchCredentialsViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, G0U<? super CredentialCandidate, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchCredentialsViewModel;
            this.$onBack = function0;
            this.$onCredentialClick = g0u;
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
            HatchPasswordsScreenKt.HatchOnePasswordLoginsScreen(this.$viewModel, this.$onBack, this.$onCredentialClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchPasswordsScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onOnePasswordClick;
        public final /* synthetic */ Function0<Unit> $onSecureStoreClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function02) {
            super(4);
            this.$onSecureStoreClick = function0;
            this.$onOnePasswordClick = function02;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1960invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1960invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            C1062ATq c1062ATq = C10G.A01;
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            C1DP c1dp = new C1DP(C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), f2 + C06G.A01(bfm, akh));
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onOnePasswordClick, bfm.A65(this.$onSecureStoreClick) | AnonymousClass001.A1M(iA04));
            Function0<Unit> function0 = this.$onSecureStoreClick;
            Function0<Unit> function02 = this.$onOnePasswordClick;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1(f, function0, function02);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, c1062ATq, (G0U) objAaT, 6, 506, false, false);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchPasswordsScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C135602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onOnePasswordClick;
        public final /* synthetic */ Function0<Unit> $onSecureStoreClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135602(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onSecureStoreClick = function02;
            this.$onOnePasswordClick = function03;
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
            HatchPasswordsScreenKt.HatchPasswordsScreen(this.$onBack, this.$onSecureStoreClick, this.$onOnePasswordClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$PasswordManagerRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C135611 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C135611(String str, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
            this.$leading = g0v;
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
            HatchPasswordsScreenKt.PasswordManagerRow(this.$title, this.$onClick, this.$leading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$PasswordsSettingsRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C135623 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135623(BRg bRg, int i, int i2) {
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
            HatchPasswordsScreenKt.PasswordsSettingsRow(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchOnePasswordLoginsScreen(HatchCredentialsViewModel hatchCredentialsViewModel, Function0<Unit> function0, G0U<? super CredentialCandidate, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(hatchCredentialsViewModel, function0, g0u);
        bfm.AgG(-1969512778);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchCredentialsViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchCredentialsViewModel.catalogState);
            boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchCredentialsViewModel));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchPasswordsScreenKt$HatchOnePasswordLoginsScreen$1$1(hatchCredentialsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, hatchCredentialsViewModel);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea6), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass2(g0u, c1boA02), -424398917), bfm, AnonymousClass001.A05(iA05 << 15, ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchCredentialsViewModel, function0, g0u, bRg2, i, i2);
        }
    }

    public static final void HatchPasswordsScreen(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(function0, function02, function03);
        bfm.AgG(2029663442);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function03);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eae), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(function02, function03), 273761495), bfm, AnonymousClass007.A03(iA0T >> 6, iA0T), 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135602(function0, function02, function03, bRg2, i, i2);
        }
    }

    /* renamed from: OnePasswordLoginsList-o3XDK20, reason: not valid java name */
    public static final void m1957OnePasswordLoginsListo3XDK20(List<CredentialCandidate> list, float f, float f2, G0U<? super CredentialCandidate, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1007535344);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            C1DP c1dp = new C1DP(C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh) + f2);
            boolean zA1C = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(list))) | AnonymousClass003.A1C(iA05) | ((iA05 & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new HatchPasswordsScreenKt$OnePasswordLoginsList$1$1(f, list, g0u);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA0T, (G0U) objAaT, 0, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchPasswordsScreenKt$OnePasswordLoginsList$2(list, f, f2, g0u, bRg2, i, i2);
        }
    }

    public static final void PasswordManagerRow(String str, Function0<Unit> function0, G0V<? super BFM, ? super Integer, Unit> g0v, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-889669402);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraCardKt.m2484AuraCardjQVUvHA(AnonymousClass001.A0R(bRg2), SettingsKt.cardStyleForSettings(null, bfm, 0, 1), new AuraCardContent(AnonymousClass005.A0X(str), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null), new AuraCardType.ChevronNavigation(null), g0v, null, function0, null, null, null, false, false, null, null, 0L, false, null, null, bfm, AnonymousClass001.A05(iA0d << 15, (57344 & (iA0d << 6)) | 3072), 0, 262048);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135611(str, function0, g0v, bRg2, i, i2);
        }
    }

    public static final void PasswordsSettingsRow(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(625671401);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            HatchCredentialsViewModel.Factory factory = new HatchCredentialsViewModel.Factory(abstractC3358CGzA0h);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchCredentialsViewModel hatchCredentialsViewModel = (HatchCredentialsViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchCredentialsViewModel.class));
            C1BO c1boA02 = C2CK.A02(bfm, hatchCredentialsViewModel.catalogState);
            boolean zA67 = bfm.A67(hatchCredentialsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchPasswordsScreenKt$PasswordsSettingsRow$1$1(hatchCredentialsViewModel);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, hatchCredentialsViewModel);
            PasswordsEntryPoint passwordsEntryPoint = ((SecureStorageCatalogUiState) c1boA02.getValue()).passwordsEntryPoint;
            AuraCardType.ChevronNavigation chevronNavigation = new AuraCardType.ChevronNavigation(null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            AuraCardContent auraCardContent = new AuraCardContent(AnonymousClass006.A0Y(bfm, passwordsEntryPoint.getTitleRes()), AuraIconAndHeadlineStyle.BODY_REGULAR, (BO6) null, (B6A) null, (ApQ) null, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097148, (C06H) null);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchPasswordsScreenKt.f244lambda$683748667;
            boolean zA1H = AnonymousClass003.A1H(bfm, passwordsEntryPoint, bfm.A67(auraNavigatorA0b));
            Object objAaT2 = bfm.AaT();
            if (zA1H || objAaT2 == C78N.A00) {
                objAaT2 = new HatchPasswordsScreenKt$PasswordsSettingsRow$2$1(auraNavigatorA0b, passwordsEntryPoint);
                bfm.Ai0(objAaT2);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0R, auraCardStyleCardStyleForSettings, auraCardContent, chevronNavigation, g0v, null, (Function0) objAaT2, null, null, null, false, false, null, null, 0L, false, null, null, bfm, 27648, 0, 262048);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C135623(bRg2, i, i2);
        }
    }

    public static final /* synthetic */ SecureStorageCatalogUiState access$HatchOnePasswordLoginsScreen$lambda$0(C1BO c1bo) {
        return (SecureStorageCatalogUiState) c1bo.getValue();
    }
}
