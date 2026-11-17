package com.facebook.aura.partners.wearables.linking;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
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
import X.BOD;
import X.BOf;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1SA;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60Q;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.partners.wearables.linking.WearablesLinkingViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class WearablesLinkingBottomSheetKt {

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $appName;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onDecision;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$appName = str;
            this.$isLoading = z;
            this.$onDecision = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingBottomSheetKt.BottomSheetCommsConsentContent(this.$appName, this.$isLoading, this.$onDecision, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$BottomSheetConsentContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C133792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $appName;
        public final /* synthetic */ String $botName;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onEnable;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133792(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, String str3, String str4, int i, int i2) {
            super(2);
            this.$origin = wearablesLinkingOrigin;
            this.$botName = str;
            this.$appName = str2;
            this.$isLoading = z;
            this.$onEnable = function0;
            this.$onCancel = function02;
            this.$modifier = bRg;
            this.$utmMedium = str3;
            this.$setupSessionId = str4;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingBottomSheetKt.BottomSheetConsentContent(this.$origin, this.$botName, this.$appName, this.$isLoading, this.$onEnable, this.$onCancel, this.$modifier, this.$utmMedium, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$BottomSheetFailureContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C133802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onTryAgain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133802(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isLoading = z;
            this.$onTryAgain = function0;
            this.$onCancel = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingBottomSheetKt.BottomSheetFailureContent(this.$isLoading, this.$onTryAgain, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C133812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $dismissIfAlreadyLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ boolean $phoneProviderLinked;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ String $wakeWordOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133812(WearablesLinkingOrigin wearablesLinkingOrigin, Function0<Unit> function0, BRg bRg, boolean z, String str, String str2, boolean z2, String str3, int i, int i2) {
            super(2);
            this.$origin = wearablesLinkingOrigin;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$dismissIfAlreadyLinked = z;
            this.$wakeWordOverride = str;
            this.$utmMedium = str2;
            this.$phoneProviderLinked = z2;
            this.$setupSessionId = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingBottomSheetKt.WearablesLinkingBottomSheet(this.$origin, this.$onDismiss, this.$modifier, this.$dismissIfAlreadyLinked, this.$wakeWordOverride, this.$utmMedium, this.$phoneProviderLinked, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $appName;
        public final /* synthetic */ String $botName;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ C1BO<WearablesLinkingUiState> $uiState$delegate;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ WearablesLinkingViewModel $viewModel;

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                bfm.Afo();
                return;
            }
            BRg bRgA07 = C3U4.A07(C10G.A02, 20.0f);
            C3TH c3th = C2VU.A00;
            WearablesLinkingOrigin wearablesLinkingOrigin = this.$origin;
            String str = this.$botName;
            String str2 = this.$appName;
            WearablesLinkingViewModel wearablesLinkingViewModel = this.$viewModel;
            Function0<Unit> function0 = this.$onDismiss;
            String str3 = this.$utmMedium;
            String str4 = this.$setupSessionId;
            C1BO<WearablesLinkingUiState> c1bo = this.$uiState$delegate;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            int iOrdinal = C60Q.A0N(c1bo).sheetState.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(1371380854);
                boolean z = C60Q.A0N(c1bo).isLoading;
                boolean zA67 = bfm.A67(wearablesLinkingViewModel);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4$1$1$1(wearablesLinkingViewModel);
                    bfm.Ai0(objAaT);
                }
                WearablesLinkingBottomSheetKt.BottomSheetConsentContent(wearablesLinkingOrigin, str, str2, z, (Function0) objAaT, function0, null, str3, str4, bfm, 384, 64);
            } else if (iOrdinal == 1) {
                bfm.AgE(1371394520);
                boolean z2 = C60Q.A0N(c1bo).isLoading;
                boolean zA672 = bfm.A67(wearablesLinkingViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4$1$2$1(wearablesLinkingViewModel);
                    bfm.Ai0(objAaT2);
                }
                WearablesLinkingBottomSheetKt.BottomSheetCommsConsentContent(str2, z2, (G0U) objAaT2, null, bfm, 6, 8);
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass003.A0k(bfm, bbi, 1371378867);
                }
                bfm.AgE(1371403070);
                boolean z3 = C60Q.A0N(c1bo).isLoading;
                boolean zA673 = bfm.A67(wearablesLinkingViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4$1$3$1(wearablesLinkingViewModel);
                    bfm.Ai0(objAaT3);
                }
                WearablesLinkingBottomSheetKt.BottomSheetFailureContent(z3, (Function0) objAaT3, function0, null, bfm, 0, 8);
            }
            AnonymousClass003.A0q(bbi);
        }

        /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$4$WhenMappings */
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
        public AnonymousClass4(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, WearablesLinkingViewModel wearablesLinkingViewModel, Function0<Unit> function0, String str3, String str4, C1BO<WearablesLinkingUiState> c1bo) {
            super(3);
            this.$origin = wearablesLinkingOrigin;
            this.$botName = str;
            this.$appName = str2;
            this.$viewModel = wearablesLinkingViewModel;
            this.$onDismiss = function0;
            this.$utmMedium = str3;
            this.$setupSessionId = str4;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.wearables.linking.WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $dismissIfAlreadyLinked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ WearablesLinkingOrigin $origin;
        public final /* synthetic */ boolean $phoneProviderLinked;
        public final /* synthetic */ String $setupSessionId;
        public final /* synthetic */ String $utmMedium;
        public final /* synthetic */ String $wakeWordOverride;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(WearablesLinkingOrigin wearablesLinkingOrigin, Function0<Unit> function0, BRg bRg, boolean z, String str, String str2, boolean z2, String str3, int i, int i2) {
            super(2);
            this.$origin = wearablesLinkingOrigin;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$dismissIfAlreadyLinked = z;
            this.$wakeWordOverride = str;
            this.$utmMedium = str2;
            this.$phoneProviderLinked = z2;
            this.$setupSessionId = str3;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            WearablesLinkingBottomSheetKt.WearablesLinkingBottomSheet(this.$origin, this.$onDismiss, this.$modifier, this.$dismissIfAlreadyLinked, this.$wakeWordOverride, this.$utmMedium, this.$phoneProviderLinked, this.$setupSessionId, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void BottomSheetCommsConsentContent(String str, boolean z, G0U<? super Boolean, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-364625608);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A07(C3U4.A0C(bs0, 0.0f, 10.0f, 0.0f, 0.0f), 40.0f), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120bf7), C3U4.A0C(bs0, 0.0f, 12.0f, 0.0f, 0.0f), colors.primaryText, typography.title3Emphasized, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(R.drawable.speechbubbleellipsisstack_outline_24_wght500, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120bfe), C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bff), colors.secondaryText, 0.0f, null, null, null, null, null, bfm, 384, 0, 2016);
            WearablesLinkingSharedKt.m1831BulletSectionFc49KdA(R.drawable.agentic_outline_24_wght500, AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120bf8), C3U4.A0C(bs0, 0.0f, 12.0f, 0.0f, 0.0f), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bf9), colors.secondaryText, 0.0f, null, null, null, null, null, bfm, 384, 0, 2016);
            WearablesLinkingSharedKt.CommsConsentDisclaimer(str, C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), bfm, (iA0d & 14) | 48, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120bfd);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 16.0f, 0.0f, 0.0f);
            boolean z2 = !z;
            int i4 = iA0d & 896;
            boolean zA19 = AnonymousClass003.A19(i4);
            Object objAaT = bfm.AaT();
            if (zA19 || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$1$1(g0u);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0C, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z2, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d >> 3) & 14, 0, 134199749);
            BRg bRgA0C2 = C3U4.A0C(c1062ATq, 0.0f, 8.0f, 0.0f, 0.0f);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | (i4 == 256);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new WearablesLinkingBottomSheetKt$BottomSheetCommsConsentContent$1$2$1(z, g0u);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C2, null, null, null, null, null, null, true, (G0U) objAaT2, bfm, 12582918, 126);
            C01N.A04(bfm, bbi, bs0, 8.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, z, g0u, bRg2, i, i2);
        }
    }

    public static final void BottomSheetConsentContent(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, String str3, String str4, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str5 = str3;
        String str6 = str4;
        bfm.AgG(-1843277521);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, wearablesLinkingOrigin) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, str2);
        }
        if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA08 |= AnonymousClass004.A0Y(bfm, function02);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA08 |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA08 |= iA0j;
        }
        int i4 = i2 & 128;
        int iA0k = 12582912;
        if (i4 != 0) {
            iA08 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, str5);
            iA08 |= iA0k;
        }
        int i5 = i2 & 256;
        int iA0l = 100663296;
        if (i5 != 0) {
            iA08 |= iA0l;
        } else if ((i & 100663296) == 0) {
            iA0l = AnonymousClass004.A0l(bfm, str6);
            iA08 |= iA0l;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1G(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str5 = null;
            }
            if (i5 != 0) {
                str6 = null;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg2.then(c1062ATq), wearablesLinkingOrigin.getOrigin(), wearablesLinkingOrigin.getSurface(), wearablesLinkingOrigin.getSubsurface(), HatchScreen.WEARABLES_LINKING, HatchComponent.WEARABLES_CONSENT, null, WearablesLinkingOriginKt.wearablesLinkingMetadata(str5, str6), null, 500L, 0.0f, null, null, null);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgHatchImpression);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A07(C3U4.A0C(bs0, 0.0f, 10.0f, 0.0f, 0.0f), 40.0f), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f120c08), C3U4.A0C(bs0, 0.0f, 12.0f, 0.0f, 0.0f), colors.primaryText, typography.title3Emphasized, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            WearablesLinkingSharedKt.m1833WearablesConsentDisclosuresN8B1yIo(str2, colors.secondaryText, C3U4.A0C(bs0, 0.0f, 16.0f, 0.0f, 0.0f), 12.0f, bfm, ((iA08 >> 6) & 14) | 3456, 0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c05);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 24.0f, 0.0f, 0.0f);
            boolean z2 = !z;
            int i6 = iA08 & 14;
            int i7 = iA08 & 29360128;
            int i8 = iA08 & 234881024;
            boolean zA17 = AnonymousClass003.A17(i6) | AnonymousClass002.A1Q(i7, 8388608) | AnonymousClass002.A1Q(i8, 67108864) | AnonymousClass005.A1M(iA08);
            Object objAaT = bfm.AaT();
            if (zA17 || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$1$1(wearablesLinkingOrigin, str5, str6, function0);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0C, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z2, z, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA08 >> 9) & 14, 0, 134199749);
            BRg bRgA0C2 = C3U4.A0C(c1062ATq, 0.0f, 8.0f, 0.0f, 0.0f);
            boolean zA172 = AnonymousClass003.A17(i6) | AnonymousClass004.A1M(iA08) | AnonymousClass002.A1Q(i7, 8388608) | AnonymousClass002.A1Q(i8, 67108864) | AnonymousClass007.A1H(iA08);
            Object objAaT2 = bfm.AaT();
            if (zA172 || objAaT2 == C78N.A00) {
                objAaT2 = new WearablesLinkingBottomSheetKt$BottomSheetConsentContent$1$2$1(z, wearablesLinkingOrigin, str5, str6, function02);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C2, null, null, null, null, null, null, true, (G0U) objAaT2, bfm, 12582918, 126);
            C01N.A04(bfm, bbi, bs0, 8.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C133792(wearablesLinkingOrigin, str, str2, z, function0, function02, bRg2, str5, str6, i, i2);
        }
    }

    public static final void BottomSheetFailureContent(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(500741837);
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
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C1822Arm c1822Arm = AuraTheme.INSTANCE.getTypography(bfm, 6).title3Emphasized;
            BS0 bs0 = BRg.A00;
            WearablesLinkingSharedKt.WearablesFailureHeader(C3U4.A0C(bs0, 0.0f, 8.0f, 0.0f, 0.0f), c1822Arm, bfm, 6, 0);
            int i4 = iA0n & 14;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c19), null, C3U4.A0C(c1062ATq, 0.0f, 32.0f, 0.0f, 0.0f), AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, !z, z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, AnonymousClass001.A0B(iA0n << 9, i4), 0, 134199749);
            BRg bRgA0C = C3U4.A0C(c1062ATq, 0.0f, 8.0f, 0.0f, 0.0f);
            boolean zA17 = AnonymousClass003.A17(i4) | ((iA0n & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA17 || objAaT == C78N.A00) {
                objAaT = new WearablesLinkingBottomSheetKt$BottomSheetFailureContent$1$1$1(z, function02);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(bRgA0C, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582918, 126);
            C01N.A04(bfm, bbi, bs0, 8.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C133802(z, function0, function02, bRg2, i, i2);
        }
    }

    public static final void WearablesLinkingBottomSheet(WearablesLinkingOrigin wearablesLinkingOrigin, Function0<Unit> function0, BRg bRg, boolean z, String str, String str2, boolean z2, String str3, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass5;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        String strA0e = str;
        String str4 = str2;
        boolean zA1K2 = z2;
        String strA0e2 = str3;
        boolean zA1a = AnonymousClass002.A1a(wearablesLinkingOrigin, function0);
        bfm.AgG(1809184073);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, wearablesLinkingOrigin) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0q(bfm, zA1K);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA08 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA08 |= AnonymousClass004.A0h(bfm, strA0e);
        }
        int i6 = i2 & 32;
        int iA0i = 196608;
        if (i6 != 0) {
            iA08 |= iA0i;
        } else if ((i & 196608) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, str4);
            iA08 |= iA0i;
        }
        int i7 = i2 & 64;
        int iA0t = 1572864;
        if (i7 != 0) {
            iA08 |= iA0t;
        } else if ((i & 1572864) == 0) {
            iA0t = AnonymousClass004.A0t(bfm, zA1K2);
            iA08 |= iA0t;
        }
        int i8 = i2 & 128;
        int iA0k = 12582912;
        if (i8 != 0) {
            iA08 |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, strA0e2);
            iA08 |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 4793491, 4793490), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            strA0e = C3cG.A0e(strA0e, i5);
            if (i6 != 0) {
                str4 = null;
            }
            zA1K2 = C3cG.A1K(i7, zA1K2);
            strA0e2 = C3cG.A0e(strA0e2, i8);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AuraViewerDataProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            C1BO c1boA02 = C2CK.A02(bfm, ((AuraViewerDataProvider) objAaT).userData);
            boolean zA1C = AnonymousClass005.A1C(iA08) | bfm.A65(abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass001.A0j(bfm, WearablesCommsConsentStoreKt.isCommsConsentPending(abstractC3358CGzA0h, zA1K2));
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT2);
            if (zA1K) {
                AuraUserData auraUserData = (AuraUserData) c1boA02.getValue();
                if (auraUserData != null && auraUserData.hasLinkedWearables == zA1a && !zA1X) {
                    bfm.AgE(-140652089);
                    Unit unit = Unit.INSTANCE;
                    boolean z3 = (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
                    Object objAaT3 = bfm.AaT();
                    if (z3 || objAaT3 == C78N.A00) {
                        objAaT3 = new WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$1$1(function0);
                        bfm.Ai0(objAaT3);
                    }
                    AnonymousClass001.A17(bfm, objAaT3, unit);
                    bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                    if (bBbAAc != null) {
                        anonymousClass5 = new C133812(wearablesLinkingOrigin, function0, bRg2, zA1K, strA0e, str4, zA1K2, strA0e2, i, i2);
                        bBbAAc.A06 = anonymousClass5;
                    }
                    return;
                }
            } else {
                zA1K = false;
            }
            AnonymousClass003.A0l(bfm, -140296519);
            String selectedAssistantName = (strA0e == null || C7BY.A0j(strA0e)) ? JarvisUtils.INSTANCE.getSelectedAssistantName(abstractC3358CGzA0h) : strA0e;
            WearablesLinkingViewModel.Factory factory = new WearablesLinkingViewModel.Factory(abstractC3358CGzA0h, strA0e, wearablesLinkingOrigin, zA1K2, strA0e2);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            WearablesLinkingViewModel wearablesLinkingViewModel = (WearablesLinkingViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), null, C3cG.A0x(WearablesLinkingViewModel.class));
            C1BO c1boA022 = C2CK.A02(bfm, wearablesLinkingViewModel.uiState);
            int i9 = WearablesLinkingViewModel.$stable;
            int i10 = iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            WearablesLinkingSharedKt.WearablesLinkingViewEffects(wearablesLinkingViewModel, function0, bfm, i9 | i10);
            boolean zA652 = bfm.A65(c1boA022) | AnonymousClass004.A1F(iA08) | AnonymousClass007.A1H(iA08) | AnonymousClass003.A1F(29360128, iA08, 8388608) | (i10 == 32);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == C78N.A00) {
                objAaT4 = new WearablesLinkingBottomSheetKt$WearablesLinkingBottomSheet$3$1(wearablesLinkingOrigin, str4, strA0e2, function0, c1boA022);
                bfm.Ai0(objAaT4);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, null, null, null, (Function0) objAaT4, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(wearablesLinkingOrigin, selectedAssistantName, HatchAppName.value, wearablesLinkingViewModel, function0, str4, strA0e2, c1boA022), -1553422868), bfm, (iA08 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 48, 1981);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(wearablesLinkingOrigin, function0, bRg2, zA1K, strA0e, str4, zA1K2, strA0e2, i, i2);
            bBbAAc.A06 = anonymousClass5;
        }
    }
}
