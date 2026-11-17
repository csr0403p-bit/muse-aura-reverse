package com.facebook.aura.partners.wearables.linking;

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
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C78N;
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
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.ext.AuraDrawableSourceKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class WearablesLinkingFullScreenKt {

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$ConsentMascot$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $imageResId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$imageResId = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.ConsentMascot(this.$imageResId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$FullScreenCommsConsentDisclosures$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.FullScreenCommsConsentDisclosures(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$FullScreenCommsConsentFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C133822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C133822(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$isLoading = z;
            this.$onDecision = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.FullScreenCommsConsentFooter(this.$isLoading, this.$onDecision, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesExitSetupDialog$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C133831 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onExit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133831(Function0<Unit> function0, Function0<Unit> function02) {
            super(2);
            this.$onExit = function0;
            this.$onCancel = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onCancel, bfm.A65(this.$onExit));
                Function0<Unit> function0 = this.$onExit;
                Function0<Unit> function02 = this.$onCancel;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new WearablesLinkingFullScreenKt$WearablesExitSetupDialog$1$1$1(function0, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesExitSetupDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C133842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onExit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133842(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onCancel = function0;
            this.$onExit = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.WearablesExitSetupDialog(this.$onCancel, this.$onExit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesLinkingFullScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C133852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $dismissIfAlreadyLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onLinked;
        public final /* synthetic */ Function0<Unit> $onSkip;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ boolean $phoneProviderLinked;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ String $wakeWordOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133852(WearablesLinkingOrigin wearablesLinkingOrigin, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, Function0<Unit> function03, boolean z, String str, String str2, boolean z2, String str3, int i, int i2) {
            super(2);
            this.$origin = wearablesLinkingOrigin;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$onLinked = function02;
            this.$onSkip = function03;
            this.$dismissIfAlreadyLinked = z;
            this.$wakeWordOverride = str;
            this.$utmMedium = str2;
            this.$phoneProviderLinked = z2;
            this.$setupSessionId = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.WearablesLinkingFullScreen(this.$origin, this.$onDismiss, this.$modifier, this.$onLinked, this.$onSkip, this.$dismissIfAlreadyLinked, this.$wakeWordOverride, this.$utmMedium, this.$phoneProviderLinked, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesLinkingFullScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $dismissIfAlreadyLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onLinked;
        public final /* synthetic */ Function0<Unit> $onSkip;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ boolean $phoneProviderLinked;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ String $wakeWordOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WearablesLinkingOrigin wearablesLinkingOrigin, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, Function0<Unit> function03, boolean z, String str, String str2, boolean z2, String str3, int i, int i2) {
            super(2);
            this.$origin = wearablesLinkingOrigin;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$onLinked = function02;
            this.$onSkip = function03;
            this.$dismissIfAlreadyLinked = z;
            this.$wakeWordOverride = str;
            this.$utmMedium = str2;
            this.$phoneProviderLinked = z2;
            this.$setupSessionId = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.WearablesLinkingFullScreen(this.$origin, this.$onDismiss, this.$modifier, this.$onLinked, this.$onSkip, this.$dismissIfAlreadyLinked, this.$wakeWordOverride, this.$utmMedium, this.$phoneProviderLinked, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesLinkingScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C133861 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ boolean $showNavigationButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133861(boolean z, Function0<Unit> function0) {
            super(2);
            this.$showNavigationButton = z;
            this.$onBack = function0;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                B81.A00(this.$showNavigationButton, this.$onBack, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesLinkingScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C133872 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ Function0<Unit> $requestConsentExit;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ C1BO<WearablesLinkingUiState> $uiState$delegate;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ WearablesLinkingViewModel $viewModel;

        /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesLinkingScreen$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WearablesLinkingState.values().length];
                try {
                    AnonymousClass002.A13(WearablesLinkingState.CONSENT, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(WearablesLinkingState.COMMS_CONSENT, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(WearablesLinkingState.FAILURE, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133872(WearablesLinkingOrigin wearablesLinkingOrigin, WearablesLinkingViewModel wearablesLinkingViewModel, Function0<Unit> function0, String str, String str2, Function0<Unit> function02, C1BO<WearablesLinkingUiState> c1bo) {
            super(4);
            this.$origin = wearablesLinkingOrigin;
            this.$viewModel = wearablesLinkingViewModel;
            this.$requestConsentExit = function0;
            this.$utmMedium = str;
            this.$setupSessionId = str2;
            this.$onDismiss = function02;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1830invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1830invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            int iOrdinal = C60Q.A0N(this.$uiState$delegate).sheetState.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(1019388690);
                WearablesLinkingOrigin wearablesLinkingOrigin = this.$origin;
                boolean z = C60Q.A0N(this.$uiState$delegate).isLoading;
                boolean zA67 = bfm.A67(this.$viewModel);
                WearablesLinkingViewModel wearablesLinkingViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new WearablesLinkingFullScreenKt$WearablesLinkingScreen$2$1$1(wearablesLinkingViewModel);
                    bfm.Ai0(objAaT);
                }
                WearablesLinkingFullScreenKt.m1825FullScreenConsentContentKlbNRUg(wearablesLinkingOrigin, z, f, f2, (Function0) objAaT, null, this.$requestConsentExit, this.$utmMedium, this.$setupSessionId, bfm, (iA04 << 6) & 8064, 32);
            } else if (iOrdinal == 1) {
                bfm.AgE(1019402518);
                boolean z2 = C60Q.A0N(this.$uiState$delegate).isLoading;
                boolean zA672 = bfm.A67(this.$viewModel);
                WearablesLinkingViewModel wearablesLinkingViewModel2 = this.$viewModel;
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new WearablesLinkingFullScreenKt$WearablesLinkingScreen$2$2$1(wearablesLinkingViewModel2);
                    bfm.Ai0(objAaT2);
                }
                WearablesLinkingFullScreenKt.m1824FullScreenCommsConsentContento3XDK20(z2, f, f2, (G0U) objAaT2, null, bfm, (iA04 << 3) & 1008, 16);
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass005.A0k(bfm, 1019386934);
                }
                bfm.AgE(1019412317);
                boolean z3 = C60Q.A0N(this.$uiState$delegate).isLoading;
                boolean zA673 = bfm.A67(this.$viewModel);
                WearablesLinkingViewModel wearablesLinkingViewModel3 = this.$viewModel;
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new WearablesLinkingFullScreenKt$WearablesLinkingScreen$2$3$1(wearablesLinkingViewModel3);
                    bfm.Ai0(objAaT3);
                }
                WearablesLinkingFullScreenKt.m1826FullScreenFailureContentZUYZQmM(z3, f, f2, (Function0) objAaT3, this.$onDismiss, null, bfm, (iA04 << 3) & 1008, 32);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt$WearablesLinkingScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onLinked;
        public final /* synthetic */ Function0<Unit> $onSkip;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ WearablesLinkingViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(WearablesLinkingViewModel wearablesLinkingViewModel, WearablesLinkingOrigin wearablesLinkingOrigin, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Unit> function03, String str, String str2, int i, int i2) {
            super(2);
            this.$viewModel = wearablesLinkingViewModel;
            this.$origin = wearablesLinkingOrigin;
            this.$onDismiss = function0;
            this.$onLinked = function02;
            this.$modifier = bRg;
            this.$onSkip = function03;
            this.$utmMedium = str;
            this.$setupSessionId = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingFullScreenKt.WearablesLinkingScreen(this.$viewModel, this.$origin, this.$onDismiss, this.$onLinked, this.$modifier, this.$onSkip, this.$utmMedium, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ConsentMascot(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-69334591);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraImageKt.AuraImage(AuraDrawableSourceKt.auraDrawableSource(i, bfm, iA0D & 14), bRg2, null, null, false, false, null, false, null, bfm, (iA0D & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 196992, 472);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i, bRg2, i2, i3);
        }
    }

    /* renamed from: FullScreenCommsConsentContent-o3XDK20, reason: not valid java name */
    public static final void m1824FullScreenCommsConsentContento3XDK20(boolean z, float f, float f2, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(119511279);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0n |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0T(bRg2), 0.0f, 0.0f, 0.0f, f2);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0B = C3U4.A0B(AnonymousClass005.A0T(bfm, c90l.AiP(bs0, 1.0f, true)), AuraDimensKt.SpacingMedium, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C01N.A08(bfm, bs0, f);
            BRg bRgA07 = C10G.A07(bs0, 72.0f);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgA07, c1d3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            ConsentMascot(R.drawable.hatch_wearables_jollybot, C1DI.A02(bRgA03, c1d3, 1.0f, auraTheme.getColors(bfm, 6).fillDivider), bfm, 0, 0);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120bf7);
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title1Medium, null, null, null, null, null, null, null, null, 0, 0, 131587, 14680063, 0L, 0L, 0L, 0L);
            long jA06 = C3cH.A06(bfm, auraTheme);
            C1062ATq c1062ATq = C10G.A02;
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0C2 = C3U4.A0C(c1062ATq, 0.0f, f3, 0.0f, 0.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = WearablesLinkingFullScreenKt$FullScreenCommsConsentContent$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(bRgA0C2, objAaT, false), jA06, c1822ArmA00, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            FullScreenCommsConsentDisclosures(C3U4.A0C(bs0, 0.0f, f3, 0.0f, f3), bfm, 0, 0);
            BBI.A0R(bbi, true);
            FullScreenCommsConsentFooter(z, g0u, null, bfm, (iA0n & 14) | ((iA0n >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WearablesLinkingFullScreenKt$FullScreenCommsConsentContent$2(z, f, f2, g0u, bRg2, i, i2);
        }
    }

    public static final void FullScreenCommsConsentDisclosures(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1772303181);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingSmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingXsmall;
            BRg bRgA0B = C3U4.A0B(bs0, 0.0f, f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(R.drawable.speechbubbleellipsisstack_outline_24_wght500, AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120bfe), bRgA0B, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bff), 0L, 24.0f, C60Q.A0D(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, bfm, 196608, 0, 1808);
            WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(R.drawable.meta_brand_design_system_icons_vector_meta_ai_outline_24, AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120bf6), C3U4.A0B(bs0, 0.0f, f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bf9), 0L, 24.0f, C60Q.A0D(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, bfm, 196608, 0, 1808);
            WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(R.drawable.aura_switch_toggles_outline_24, AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120bfa), C3U4.A0B(bs0, 0.0f, f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bfb), 0L, 24.0f, C60Q.A0D(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, bfm, 196608, 0, 1808);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg2, i, i2);
        }
    }

    public static final void FullScreenCommsConsentFooter(boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1534027337);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120bfc);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).caption1Regular;
            long jA07 = C3cH.A07(bfm, auraTheme);
            float f = AuraDimensKt.SpacingLargePlusMicro;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, C3U4.A0B(c1062ATq, f, AuraDimensKt.SpacingSmall), jA07, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BRg bRgA0C = C3U4.A0C(c1062ATq, f, 0.0f, f, f);
            boolean z2 = ((iA0n & 14) == 4) | ((iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingFullScreenKt$FullScreenCommsConsentFooter$1$1$1(z, g0u);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582912, 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C133822(z, g0u, bRg2, i, i2);
        }
    }

    /* renamed from: FullScreenConsentContent-KlbNRUg, reason: not valid java name */
    public static final void m1825FullScreenConsentContentKlbNRUg(WearablesLinkingOrigin wearablesLinkingOrigin, boolean z, float f, float f2, Function0<Unit> function0, BRg bRg, Function0<Unit> function02, String str, String str2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        Function0<Unit> function03 = function02;
        String str3 = str;
        String str4 = str2;
        bfm.AgG(1202503221);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, wearablesLinkingOrigin) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A07(bfm, f2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA08 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA08 |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0Z = 1572864;
        if (i4 != 0) {
            iA08 |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, function03);
            iA08 |= iA0Z;
        }
        int i5 = i2 & 128;
        int iA0k = 12582912;
        if (i5 != 0) {
            iA08 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, str3);
            iA08 |= iA0k;
        }
        int i6 = i2 & 256;
        int iA0l = 100663296;
        if (i6 != 0) {
            iA08 |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, str4);
            iA08 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                function03 = null;
            }
            if (i5 != 0) {
                str3 = null;
            }
            if (i6 != 0) {
                str4 = null;
            }
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(C3U4.A0C(AnonymousClass001.A0T(bRg2), 16.0f, 0.0f, 16.0f, f2), wearablesLinkingOrigin.getOrigin(), wearablesLinkingOrigin.getSurface(), wearablesLinkingOrigin.getSubsurface(), HatchScreen.WEARABLES_LINKING, HatchComponent.WEARABLES_CONSENT, null, WearablesLinkingOriginKt.wearablesLinkingMetadata(str3, str4), null, 500L, 0.0f, null, null, null);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, c90l.AiP(bs0, 1.0f, true));
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0T);
            AnonymousClass005.A0n(bfm, bbi, function04);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C01N.A08(bfm, bs0, f);
            BRg bRgA07 = C10G.A07(bs0, 72.0f);
            C1D3 c1d3 = C1D8.A00;
            BRg bRgA03 = C11U.A03(bRgA07, c1d3);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            ConsentMascot(R.drawable.hatch_wearables_jollybot, C1DI.A02(bRgA03, c1d3, 1.0f, auraTheme.getColors(bfm, 6).fillDivider), bfm, 0, 0);
            String strA0t = AnonymousClass001.A0t(bfm, HatchAppName.value, R.string._name_removed__res_0x7f120c07);
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title1Medium, null, null, null, null, null, null, null, null, 0, 0, 131587, 14680063, 0L, 0L, 0L, 0L);
            long jA06 = C3cH.A06(bfm, auraTheme);
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0D = C10G.A0D(C3U4.A0C(bs0, 0.0f, f3, 0.0f, 0.0f), Float.NaN, 280.0f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = WearablesLinkingFullScreenKt$FullScreenConsentContent$1$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bRgA0D, objAaT, false), jA06, c1822ArmA00, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            WearablesLinkingSharedKt.m1832FullScreenWearablesConsentDisclosures3IgeMak(HatchAppName.value, C3cH.A06(bfm, auraTheme), C3U4.A0C(bs0, 0.0f, f3, 0.0f, 0.0f), bfm, 6, 0);
            BBI.A0R(bbi, true);
            BRg bRgA0B = C3U4.A0B(C10G.A02, 8.0f, 24.0f);
            boolean zA1F = AnonymousClass004.A1F(iA08) | AnonymousClass003.A1C(iA08) | AnonymousClass005.A1K(iA08) | AnonymousClass005.A1F(iA08) | AnonymousClass005.A1M(iA08) | AnonymousClass005.A1C(iA08);
            Object objAaT2 = bfm.AaT();
            if (zA1F || objAaT2 == obj) {
                objAaT2 = new WearablesLinkingFullScreenKt$FullScreenConsentContent$1$2$1(z, function03, wearablesLinkingOrigin, str3, str4, function0);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0B, null, null, null, null, null, null, true, (G0U) objAaT2, bfm, 12582918, 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WearablesLinkingFullScreenKt$FullScreenConsentContent$2(wearablesLinkingOrigin, z, f, f2, function0, bRg2, function03, str3, str4, i, i2);
        }
    }

    /* renamed from: FullScreenFailureContent-ZUYZQmM, reason: not valid java name */
    public static final void m1826FullScreenFailureContentZUYZQmM(boolean z, float f, float f2, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1682074379);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function02);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0n |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0n |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTypography typography = AuraTheme.INSTANCE.getTypography(bfm, 6);
            BRg bRgA0C = C3U4.A0C(AnonymousClass001.A0T(bRg2), 20.0f, f, 20.0f, f2);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0J);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90l.A00.AiP(BRg.A00, 1.0f, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgAiP, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            WearablesLinkingSharedKt.WearablesFailureHeader(null, typography.title2Emphasized, bfm, 0, 1);
            BBI.A0R(bbi, true);
            BRg bRgA06 = C3U4.A06(c1062ATq, 24.0f);
            boolean zA1F = AnonymousClass004.A1F(iA0n) | AnonymousClass004.A1M(iA0n) | AnonymousClass005.A1M(iA0n);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingFullScreenKt$FullScreenFailureContent$1$2$1(z, function0, function02);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA06, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582918, 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new WearablesLinkingFullScreenKt$FullScreenFailureContent$2(z, f, f2, function0, function02, bRg2, i, i2);
        }
    }

    public static final void WearablesExitSetupDialog(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1860523876);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c0b), AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120c09), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C133831(function02, function0), 2051592875), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass001.A05(iA0T << 18, ((iA0T >> 6) & 14) | 196608), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C133842(function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WearablesLinkingScreen(com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel r57, com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, kotlin.jvm.functions.Function0<kotlin.Unit> r60, X.BRg r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, java.lang.String r63, java.lang.String r64, X.BFM r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt.WearablesLinkingScreen(com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel, com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void WearablesLinkingFullScreen(com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, X.BRg r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, boolean r35, java.lang.String r36, java.lang.String r37, boolean r38, java.lang.String r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.linking.WearablesLinkingFullScreenKt.WearablesLinkingFullScreen(com.facebook.aura.partners.wearables.linking.WearablesLinkingOrigin, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, X.BFM, int, int):void");
    }
}
