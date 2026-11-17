package com.facebook.aura.storagerecovery.content;

import X.AHD;
import X.AKQ;
import X.ARD;
import X.ATD;
import X.AVy;
import X.Ab3;
import X.AbstractC1754Apr;
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
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0zJ;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1SA;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.activity.ComponentActivity;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchHeaderKt;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.SettingsHeaderButtonKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.storagerecovery.StorageRecoveryDialog;
import com.facebook.aura.storagerecovery.StorageRecoveryPhase;
import com.facebook.aura.storagerecovery.StorageRecoveryUiState;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import com.facebook.aura.ui.OnboardingAndActivationSpinnerKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class StorageRecoveryOverlayContentKt {
    public static final float COPY_BLOCK_TOP_OFFSET = 177.0f;
    public static final float LOGO_TO_COPY_SPACING = AuraDimensKt.SpacingXlarge;
    public static final float USAGE_BAR_HEIGHT = 8.0f;

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryOverlayContentKt$StorageRecoveryBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDeleteSelected;
        public final /* synthetic */ G0U<String, Unit> $onEntryTap;
        public final /* synthetic */ Function0<Unit> $onNavigateBack;
        public final /* synthetic */ Function0<Unit> $onPrimaryAction;
        public final /* synthetic */ Function0<Unit> $onToggleSelectionMode;
        public final /* synthetic */ StorageRecoveryUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super String, Unit> g0u, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = storageRecoveryUiState;
            this.$onPrimaryAction = function0;
            this.$onNavigateBack = function02;
            this.$onToggleSelectionMode = function03;
            this.$onEntryTap = g0u;
            this.$onDeleteSelected = function04;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryOverlayContentKt.StorageRecoveryBody(this.$uiState, this.$onPrimaryAction, this.$onNavigateBack, this.$onToggleSelectionMode, this.$onEntryTap, this.$onDeleteSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryOverlayContentKt$StorageRecoveryIntro$2, reason: invalid class name and case insensitive filesystem */
    public final class C141282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ StorageRecoveryUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141282(StorageRecoveryUiState storageRecoveryUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = storageRecoveryUiState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryOverlayContentKt.StorageRecoveryIntro(this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryOverlayContentKt.StorageRecoveryOverlayContent(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StorageRecoveryPhase.values().length];
            try {
                AnonymousClass002.A13(StorageRecoveryPhase.RECONNECTING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(StorageRecoveryPhase.RECONNECT_FAILED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(StorageRecoveryPhase.LOADING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(StorageRecoveryPhase.READY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(StorageRecoveryPhase.DELETING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(StorageRecoveryPhase.AVAILABLE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void StorageRecoveryBody(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0U<? super String, Unit> g0u, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(-370235789);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, storageRecoveryUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function03);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, function04);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRgA0Q);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA01 = AbstractC1754Apr.A01(AnonymousClass001.A0T(bRgA0Q));
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA012, iA0J);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            int i4 = iA0T & 14;
            StorageRecoveryIntro(storageRecoveryUiState, C3U4.A0B(bs0, f, 0.0f), bfm, i4, 0);
            C01N.A08(bfm, bs0, f);
            String strPrimaryActionLabel = primaryActionLabel(storageRecoveryUiState.phase, bfm, 0);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.MEDIUM;
            boolean zIsPrimaryActionEnabled = storageRecoveryUiState.isPrimaryActionEnabled();
            boolean zA1Z = AnonymousClass002.A1Z(storageRecoveryUiState.phase, StorageRecoveryPhase.RECONNECTING);
            C1062ATq c1062ATq = C10G.A02;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strPrimaryActionLabel, null, C3U4.A0B(c1062ATq, f, 0.0f), auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, zIsPrimaryActionEnabled, zA1Z, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 9) & 57344, 0, 134199749);
            if (storageRecoveryUiState.isFileListVisible) {
                bfm.AgE(-1453049293);
                C01N.A08(bfm, bs0, f);
                int i5 = iA0T >> 3;
                StorageRecoveryFileListKt.StorageRecoveryFileList(storageRecoveryUiState, function02, function03, g0u, function04, c90l.AiP(c1062ATq, 1.0f, true), bfm, (i5 & 57344) | AnonymousClass003.A06(i5, i4), 0);
            } else {
                bfm.AgE(-1452693723);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(storageRecoveryUiState, function0, function02, function03, g0u, function04, bRgA0Q, i, i2);
        }
    }

    public static final void StorageRecoveryIntro(StorageRecoveryUiState storageRecoveryUiState, BRg bRg, BFM bfm, int i, int i2) {
        long j;
        BRg bRg2 = bRg;
        bfm.AgG(-1994276368);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, storageRecoveryUiState) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1Z = AnonymousClass002.A1Z(storageRecoveryUiState.phase, StorageRecoveryPhase.AVAILABLE);
            float f = COPY_BLOCK_TOP_OFFSET - OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE;
            float f2 = LOGO_TO_COPY_SPACING;
            C1DG c1dg = new C1DG(f - f2);
            C1DG c1dg2 = new C1DG(0.0f);
            if (c1dg.compareTo(c1dg2) < 0) {
                c1dg = c1dg2;
            }
            float f3 = c1dg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, f3);
            C1SA.A00(bfm, null, C10G.A07(bs0, OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE), null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48, 120);
            int iA00 = C01N.A00(bfm, bs0, f2);
            int i4 = R.string._name_removed__res_0x7f121082;
            if (zA1Z) {
                i4 = R.string._name_removed__res_0x7f121078;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, iA00).title1Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = StorageRecoveryOverlayContentKt$StorageRecoveryIntro$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
            int i5 = R.string._name_removed__res_0x7f121081;
            if (zA1Z) {
                i5 = R.string._name_removed__res_0x7f121077;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i5), c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
            Double d = storageRecoveryUiState.usagePercentage;
            if (d == null) {
                bfm.AgE(1040431382);
            } else {
                bfm.AgE(1040431383);
                double dDoubleValue = d.doubleValue();
                C01N.A05(bfm, bs0);
                if (zA1Z) {
                    bfm.AgE(1328525294);
                    j = auraTheme.getColors(bfm, iA00).accent;
                } else {
                    bfm.AgE(1328526231);
                    j = auraTheme.getColors(bfm, iA00).destructiveText;
                }
                BBI.A0R(bbi, false);
                m2255StorageUsageBar3IgeMak(dDoubleValue, j, null, bfm, 0, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141282(storageRecoveryUiState, bRg2, i, i2);
        }
    }

    public static final void StorageRecoveryOverlayContent(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1764752492);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            long jA05 = C3cG.A05(bfm.A6v(LocalUserSessionKt.LocalUserSessionGeneration));
            StorageRecoveryViewModel.Factory factory = new StorageRecoveryViewModel.Factory(abstractC3358CGzA0h);
            String strActivityViewModelKey = LocalUserSessionKt.activityViewModelKey(StorageRecoveryViewModel.class, jA05);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            StorageRecoveryViewModel storageRecoveryViewModel = (StorageRecoveryViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), StorageRecoveryViewModel.class, strActivityViewModelKey);
            C1BO c1boA02 = C2CK.A02(bfm, storageRecoveryViewModel.uiState);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA67 = bfm.A67(storageRecoveryViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$1$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) ((InterfaceC7353EnQ) objAaT), bfm, 0, 1);
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(bRg2), C3cH.A0W(bfm).background);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            StorageRecoveryUiState storageRecoveryUiState = (StorageRecoveryUiState) c1boA02.getValue();
            boolean zA672 = bfm.A67(storageRecoveryViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$1$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT2);
            boolean zA673 = bfm.A67(storageRecoveryViewModel);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$2$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT3);
            }
            Function0 function03 = (Function0) ((InterfaceC7353EnQ) objAaT3);
            boolean zA674 = bfm.A67(storageRecoveryViewModel);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$3$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT4);
            }
            Function0 function04 = (Function0) ((InterfaceC7353EnQ) objAaT4);
            boolean zA675 = bfm.A67(storageRecoveryViewModel);
            Object objAaT5 = bfm.AaT();
            if (zA675 || objAaT5 == C78N.A00) {
                objAaT5 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$4$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT5);
            }
            G0U g0u = (G0U) ((InterfaceC7353EnQ) objAaT5);
            boolean zA676 = bfm.A67(storageRecoveryViewModel);
            Object objAaT6 = bfm.AaT();
            if (zA676 || objAaT6 == C78N.A00) {
                objAaT6 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$5$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT6);
            }
            StorageRecoveryBody(storageRecoveryUiState, function02, function03, function04, g0u, (Function0) ((InterfaceC7353EnQ) objAaT6), null, bfm, 0, 64);
            HatchHeaderTitleAlignment hatchHeaderTitleAlignment = HatchHeaderTitleAlignment.HIDDEN;
            AHD<HeaderButton> ahd = SettingsHeaderButtonKt.SettingsHeaderButtons;
            boolean zA677 = bfm.A67(auraNavigatorA0b);
            Object objAaT7 = bfm.AaT();
            if (zA677 || objAaT7 == C78N.A00) {
                objAaT7 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$6$1(auraNavigatorA0b);
                bfm.Ai0(objAaT7);
            }
            HatchHeaderKt.m994HatchPageHeaderOT94q8g(null, null, null, null, hatchHeaderTitleAlignment, false, 0, null, null, false, ahd, (G0U) objAaT7, null, null, 0L, 0L, null, null, 0, null, null, false, bfm, 221184, 0, 0, 4191183);
            BBI.A0R(bbi, true);
            StorageRecoveryDialog storageRecoveryDialog = ((StorageRecoveryUiState) c1boA02.getValue()).dialog;
            boolean zA678 = bfm.A67(storageRecoveryViewModel);
            Object objAaT8 = bfm.AaT();
            if (zA678 || objAaT8 == C78N.A00) {
                objAaT8 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$3$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT8);
            }
            Function0 function05 = (Function0) ((InterfaceC7353EnQ) objAaT8);
            boolean zA679 = bfm.A67(storageRecoveryViewModel);
            Object objAaT9 = bfm.AaT();
            if (zA679 || objAaT9 == C78N.A00) {
                objAaT9 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$4$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT9);
            }
            Function0 function06 = (Function0) ((InterfaceC7353EnQ) objAaT9);
            boolean zA6710 = bfm.A67(storageRecoveryViewModel);
            Object objAaT10 = bfm.AaT();
            if (zA6710 || objAaT10 == C78N.A00) {
                objAaT10 = new StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$5$1(storageRecoveryViewModel);
                bfm.Ai0(objAaT10);
            }
            StorageRecoveryDialogsKt.StorageRecoveryDialogs(storageRecoveryDialog, function05, function06, (Function0) ((InterfaceC7353EnQ) objAaT10), null, bfm, 0, 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(bRg2, i, i2);
        }
    }

    /* renamed from: StorageUsageBar-3IgeMak, reason: not valid java name */
    public static final void m2255StorageUsageBar3IgeMak(double d, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1450625130);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(bfm.A61(d) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float fA00 = (float) ATD.A00(d / 100.0d, 0.0d, 1.0d);
            long j2 = C3cH.A0W(bfm).secondaryButtonBackground;
            String strA0t = AnonymousClass001.A0t(bfm, Integer.valueOf(Ab3.A00(d)), R.string._name_removed__res_0x7f121099);
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg2), USAGE_BAR_HEIGHT);
            boolean zA65 = bfm.A65(strA0t);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new StorageRecoveryOverlayContentKt$StorageUsageBar$1$1(strA0t);
                bfm.Ai0(objAaT);
            }
            BRg bRgA01 = ARD.A01(bRgA04, (G0U) objAaT, false);
            boolean zA64 = bfm.A64(j2) | bfm.A62(fA00) | ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT2 = bfm.AaT();
            if (zA64 || objAaT2 == C78N.A00) {
                objAaT2 = new StorageRecoveryOverlayContentKt$StorageUsageBar$2$1(j2, fA00, j);
                bfm.Ai0(objAaT2);
            }
            C0zJ.A00(bRgA01, (G0U) objAaT2, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new StorageRecoveryOverlayContentKt$StorageUsageBar$3(d, j, bRg2, i, i2);
        }
    }

    public static final String primaryActionLabel(StorageRecoveryPhase storageRecoveryPhase, BFM bfm, int i) {
        int i2;
        switch (storageRecoveryPhase.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 5:
                bfm.AgE(-674340222);
                i2 = R.string._name_removed__res_0x7f12108a;
                break;
            case 3:
                bfm.AgE(-674350426);
                i2 = R.string._name_removed__res_0x7f12108f;
                break;
            case 4:
                bfm.AgE(-674346717);
                i2 = R.string._name_removed__res_0x7f12108e;
                break;
            default:
                throw AnonymousClass005.A0k(bfm, -674352213);
        }
        return AnonymousClass003.A0e(bfm, i2);
    }
}
