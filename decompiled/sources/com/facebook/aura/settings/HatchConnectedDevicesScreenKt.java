package com.facebook.aura.settings;

import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.ARD;
import X.ASZ;
import X.AVy;
import X.AXN;
import X.AaC;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C0lh;
import X.C0n6;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1YD;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.C90l;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.os.Build;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.settings.ConnectedDevicesUiState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.common.AuraClickableCardKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchConnectedDevicesScreenKt {
    public static final float DeviceOverlayMenuGap = 8.0f;
    public static final float DeviceOverlaySafePadding = 16.0f;

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$DeveloperModeSection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirmTurnOff;
        public final /* synthetic */ Function0<Unit> $onDismissTurnOff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirmTurnOff = function0;
            this.$cancelText = str2;
            this.$onDismissTurnOff = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismissTurnOff, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirmTurnOff, bfm.A65(this.$confirmText))));
                String str = this.$confirmText;
                Function0<Unit> function0 = this.$onConfirmTurnOff;
                String str2 = this.$cancelText;
                Function0<Unit> function02 = this.$onDismissTurnOff;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchConnectedDevicesScreenKt$DeveloperModeSection$2$1$1(str, function0, str2, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$DeveloperModeSection$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $isDeveloperModeEnabled;
        public final /* synthetic */ Function0<Unit> $onConfirmTurnOff;
        public final /* synthetic */ Function0<Unit> $onDismissTurnOff;
        public final /* synthetic */ G0U<Boolean, Unit> $onToggle;
        public final /* synthetic */ C07C $this_DeveloperModeSection;
        public final /* synthetic */ ConnectedDevicesUiState.DeveloperModeTurnOff $turnOff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C07C c07c, boolean z, ConnectedDevicesUiState.DeveloperModeTurnOff developerModeTurnOff, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$this_DeveloperModeSection = c07c;
            this.$isDeveloperModeEnabled = z;
            this.$turnOff = developerModeTurnOff;
            this.$onToggle = g0u;
            this.$onConfirmTurnOff = function0;
            this.$onDismissTurnOff = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectedDevicesScreenKt.DeveloperModeSection(this.$this_DeveloperModeSection, this.$isDeveloperModeEnabled, this.$turnOff, this.$onToggle, this.$onConfirmTurnOff, this.$onDismissTurnOff, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$DeviceActionMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C134792 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ String $settingsLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134792(String str, Function0<Unit> function0, Function0<Unit> function02) {
            super(3);
            this.$settingsLabel = str;
            this.$onOpenSettings = function0;
            this.$onRemove = function02;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA01 = BGR.A01(C0lh.A02, C3U4.A09(BRg.A00, 10.0f));
                String str = this.$settingsLabel;
                Function0<Unit> function0 = this.$onOpenSettings;
                Function0<Unit> function02 = this.$onRemove;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function03);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                HatchConnectedDevicesScreenKt.m1936DeviceActionMenuRowT042LqI(R.drawable.settings_gear_android_wght400_outline_24, str, C06G.A0L(bfm, akh), function0, null, bfm, 0, 16);
                HatchConnectedDevicesScreenKt.m1936DeviceActionMenuRowT042LqI(R.drawable.trash_wght400_outline_24, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207b4), AnonymousClass001.A0f(bfm, akh).destructiveIcon.enabled, function02, null, bfm, 0, 16);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$DeviceActionMenu$3, reason: invalid class name and case insensitive filesystem */
    public final class C134803 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isWearable;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ Function0<Unit> $onRemove;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134803(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$isWearable = z;
            this.$onOpenSettings = function0;
            this.$onRemove = function02;
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
            HatchConnectedDevicesScreenKt.DeviceActionMenu(this.$isWearable, this.$onOpenSettings, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$DeviceActionOverlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Integer> $blockHeightPx$delegate;
        public final /* synthetic */ AaC $bounds;
        public final /* synthetic */ MutableState<Integer> $containerHeightPx$delegate;
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ boolean $isWearable;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AXN axn, AaC aaC, BRg bRg, MutableState<Integer> mutableState, MutableState<Integer> mutableState2, Function0<Unit> function0, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, boolean z, Function0<Unit> function02, Function0<Unit> function03) {
            super(2);
            this.$density = axn;
            this.$bounds = aaC;
            this.$modifier = bRg;
            this.$containerHeightPx$delegate = mutableState;
            this.$blockHeightPx$delegate = mutableState2;
            this.$onDismiss = function0;
            this.$preview = g0w;
            this.$isWearable = z;
            this.$onOpenSettings = function02;
            this.$onRemove = function03;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r29, int r30) {
            /*
                Method dump skipped, instructions count: 460
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesScreenKt.AnonymousClass1.invoke(X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$DeviceActionOverlay$2, reason: invalid class name and case insensitive filesystem */
    public final class C134812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AaC $bounds;
        public final /* synthetic */ boolean $isWearable;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onOpenSettings;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C134812(AaC aaC, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, int i, int i2) {
            super(2);
            this.$bounds = aaC;
            this.$isWearable = z;
            this.$onDismiss = function0;
            this.$onOpenSettings = function02;
            this.$onRemove = function03;
            this.$preview = g0w;
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
            HatchConnectedDevicesScreenKt.DeviceActionOverlay(this.$bounds, this.$isWearable, this.$onDismiss, this.$onOpenSettings, this.$onRemove, this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $openPairingSheet;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(G0U<? super Boolean, Unit> g0u) {
            super(2);
            this.$openPairingSheet = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                AVy aVyA00 = BOf.A00(bfm, R.drawable.plus_wght400_outline_24, 0);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b22);
                boolean zA65 = bfm.A65(this.$openPairingSheet);
                G0U<Boolean, Unit> g0u = this.$openPairingSheet;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$6$1$1(g0u);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass005.A0o(bfm, aVyA00, strA01, (Function0) objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<NodeListEntry, Unit> $openDevice;
        public final /* synthetic */ C1BO<ConnectedDevicesScreenState> $screenState$delegate;
        public final /* synthetic */ ConnectedDevicesUiState $uiState;
        public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(ConnectedDevicesUiState connectedDevicesUiState, G0U<? super NodeListEntry, Unit> g0u, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, C1BO<ConnectedDevicesScreenState> c1bo) {
            super(4);
            this.$uiState = connectedDevicesUiState;
            this.$openDevice = g0u;
            this.$viewModel = hatchConnectedDevicesViewModel;
            this.$screenState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1939invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1939invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0M = AnonymousClass006.A0M(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(bRgA0M, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), C06G.A01(bfm, akh));
            ConnectedDevicesUiState connectedDevicesUiState = this.$uiState;
            G0U<NodeListEntry, Unit> g0u = this.$openDevice;
            HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = this.$viewModel;
            C1BO<ConnectedDevicesScreenState> c1bo = this.$screenState$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = HatchConnectedDevicesScreenKt.createLocalDeviceEntry();
                bfm.Ai0(objAaT);
            }
            boolean z = connectedDevicesUiState instanceof ConnectedDevicesUiState.Loaded;
            ConnectedDevicesUiState.Loaded loaded = z ? (ConnectedDevicesUiState.Loaded) connectedDevicesUiState : null;
            AHD ahdA0E = c1bo.getValue().sections.thisDevice;
            if (ahdA0E.isEmpty()) {
                ahdA0E = AGI.A0E((NodeListEntry) objAaT);
            }
            HatchAppsSectionKt.ThisDeviceSection(ahdA0E, g0u, null, bfm, 0, 4);
            AHD<NodeListEntry> ahd = c1bo.getValue().sections.glasses;
            boolean zA67 = bfm.A67(hatchConnectedDevicesViewModel);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$2$1(hatchConnectedDevicesViewModel);
                bfm.Ai0(objAaT2);
            }
            G0U g0u3 = (G0U) ((InterfaceC7353EnQ) objAaT2);
            boolean zA65 = bfm.A65(c1bo);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == obj) {
                objAaT3 = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$3$1(c1bo);
                bfm.Ai0(objAaT3);
            }
            HatchGadgetsSectionKt.MetaDevicesSection(ahd, g0u, g0u3, (G0U) objAaT3, null, bfm, 0, 16);
            if (connectedDevicesUiState instanceof ConnectedDevicesUiState.Loading) {
                bfm.AgE(1734302398);
                BRg bRgA0B = C3U4.A0B(C10G.A02, 0.0f, 48.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 32.0f), null, 0L, bfm, 6, 6);
                BBI.A0R(bbi, true);
                BBI.A0R(bbi, false);
            } else if (connectedDevicesUiState instanceof ConnectedDevicesUiState.Error) {
                bfm.AgE(1734635865);
                boolean zA1M = AnonymousClass003.A1M(bfm, connectedDevicesUiState, hatchConnectedDevicesViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA1M || objAaT4 == obj) {
                    objAaT4 = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$5$1(connectedDevicesUiState, hatchConnectedDevicesViewModel);
                    bfm.Ai0(objAaT4);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT4, bfm, 6, 7);
                BBI.A0R(bbi, false);
            } else {
                if (!z) {
                    throw AnonymousClass003.A0k(bfm, bbi, 1579965671);
                }
                bfm.AgE(1580040156);
                BBI.A0R(bbi, false);
            }
            ConnectedDeviceSections connectedDeviceSections = c1bo.getValue().sections;
            int i3 = ConnectedDeviceSections.$stable;
            HatchAppsSectionKt.AppsSection(connectedDeviceSections, g0u, null, bfm, i3, 4);
            HatchGadgetsSectionKt.GadgetsSection(c1bo.getValue().sections, c1bo.getValue().homeLinkOffer, g0u, null, bfm, i3 | (HomeLinkOffer.$stable << 3), 8);
            if (loaded != null && loaded.hasServerDevices && loaded.isDeveloperModeAvailable) {
                bfm.AgE(1736943257);
                boolean z2 = loaded.isDeveloperModeEnabled;
                ConnectedDevicesUiState.DeveloperModeTurnOff developerModeTurnOff = loaded.developerModeTurnOff;
                boolean zA672 = bfm.A67(hatchConnectedDevicesViewModel);
                Object objAaT5 = bfm.AaT();
                if (zA672 || objAaT5 == obj) {
                    objAaT5 = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$6$1(hatchConnectedDevicesViewModel);
                    bfm.Ai0(objAaT5);
                }
                G0U g0u4 = (G0U) ((InterfaceC7353EnQ) objAaT5);
                boolean zA673 = bfm.A67(hatchConnectedDevicesViewModel);
                Object objAaT6 = bfm.AaT();
                if (zA673 || objAaT6 == obj) {
                    objAaT6 = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$7$1(hatchConnectedDevicesViewModel);
                    bfm.Ai0(objAaT6);
                }
                Function0 function02 = (Function0) ((InterfaceC7353EnQ) objAaT6);
                boolean zA674 = bfm.A67(hatchConnectedDevicesViewModel);
                Object objAaT7 = bfm.AaT();
                if (zA674 || objAaT7 == obj) {
                    objAaT7 = new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$8$1(hatchConnectedDevicesViewModel);
                    bfm.Ai0(objAaT7);
                }
                HatchConnectedDevicesScreenKt.DeveloperModeSection(c90l, z2, developerModeTurnOff, g0u4, function02, (Function0) ((InterfaceC7353EnQ) objAaT7), bfm, (ConnectedDevicesUiState.DeveloperModeTurnOff.$stable << 6) | 6);
            } else {
                bfm.AgE(1737297866);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $autoStartSetup;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onDeviceClick;
        public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function0<Unit> function0, G0U<? super NodeListEntry, Unit> g0u, boolean z, BRg bRg, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$onDeviceClick = g0u;
            this.$autoStartSetup = z;
            this.$modifier = bRg;
            this.$viewModel = hatchConnectedDevicesViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectedDevicesScreenKt.HatchConnectedDevicesScreen(this.$onBack, this.$onDeviceClick, this.$autoStartSetup, this.$modifier, this.$viewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$RemovableDevice$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ NodeListEntry $device;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onOpen;
        public final /* synthetic */ G0U<NodeListEntry, Unit> $onRemoveDevice;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(NodeListEntry nodeListEntry, Function0<Unit> function0, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$device = nodeListEntry;
            this.$onOpen = function0;
            this.$onRemoveDevice = g0u;
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectedDevicesScreenKt.RemovableDevice(this.$device, this.$onOpen, this.$onRemoveDevice, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$RemoveDeviceConfirmationDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C134821 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelLabel;
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ String $removeLabel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134821(String str, Function0<Unit> function0, String str2, String str3, Function0<Unit> function02) {
            super(2);
            this.$removeLabel = str;
            this.$onConfirm = function0;
            this.$cancelLabel = str2;
            this.$nodeId = str3;
            this.$onDismiss = function02;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$nodeId, AnonymousClass001.A1R(bfm, this.$cancelLabel, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$removeLabel)))));
                String str = this.$removeLabel;
                Function0<Unit> function0 = this.$onConfirm;
                String str2 = this.$cancelLabel;
                String str3 = this.$nodeId;
                Function0<Unit> function02 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchConnectedDevicesScreenKt$RemoveDeviceConfirmationDialog$1$1$1(str, function0, str2, str3, function02);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$RemoveDeviceConfirmationDialog$3, reason: invalid class name and case insensitive filesystem */
    public final class C134833 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $deviceName;
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134833(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$deviceName = str;
            this.$nodeId = str2;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchConnectedDevicesScreenKt.RemoveDeviceConfirmationDialog(this.$deviceName, this.$nodeId, this.$onConfirm, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void DeviceActionMenu(boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(14870497);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function02);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(1405651813);
                i3 = R.string._name_removed__res_0x7f1207b3;
            } else {
                bfm.AgE(1405654372);
                i3 = R.string._name_removed__res_0x7f1207b2;
            }
            String strA0e = AnonymousClass003.A0e(bfm, i3);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchConnectedDevicesScreenKt$DeviceActionMenu$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(bRg2, 0.0f, (Function0) objAaT, B1V.A00(bfm, new C134792(strA0e, function0, function02), 1550722531), bfm, ((iA0n >> 9) & 14) | 3456, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134803(z, function0, function02, bRg2, i, i2);
        }
    }

    /* renamed from: DeviceActionMenuRow-T042LqI, reason: not valid java name */
    public static final void m1936DeviceActionMenuRowT042LqI(int i, String str, long j, Function0<Unit> function0, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1916020410);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function0);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(C10G.A0F(C0v5.A04(AnonymousClass001.A0R(bRg2), new C1YD(0), null, function0, true), 128.0f, 44.0f, Float.NaN, Float.NaN), 16.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, i5);
            AuraIconKt.m2567AuraIconFHprtrg(C3U4.A0C(BRg.A00, 0.0f, 0.0f, 16.0f, 0.0f), BOf.A00(bfm, i, iA0D & 14), AuraIconSize.X_SMALL, null, j, null, bfm, AnonymousClass001.A0B(iA0D << 6, (AVy.$stable << 3) | 3462), 32);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, j, C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0D >> 3) & 14) | (iA0D & 896), 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchConnectedDevicesScreenKt$DeviceActionMenuRow$2(i, str, j, function0, bRg2, i2, i3);
        }
    }

    public static final void DeviceActionOverlay(AaC aaC, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-483624964);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, aaC) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function03);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, g0w);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0d, 599186), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AXN axn = (AXN) bfm.A6v(Am0.A04);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, 0);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, 0);
            }
            C0n6.A00(bfm, new BA2(C79.A00, true, true, false, false), function0, B1V.A00(bfm, new AnonymousClass1(axn, aaC, bRg2, mutableState, (MutableState) objAaT2, function0, g0w, z, function02, function03), 89973203), ((iA0d >> 6) & 14) | 432, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134812(aaC, z, function0, function02, function03, g0w, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchConnectedDevicesScreen(kotlin.jvm.functions.Function0<kotlin.Unit> r52, X.G0U<? super com.facebook.aura.nodes.json.NodeListEntry, kotlin.Unit> r53, boolean r54, X.BRg r55, com.facebook.aura.settings.HatchConnectedDevicesViewModel r56, X.BFM r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesScreenKt.HatchConnectedDevicesScreen(kotlin.jvm.functions.Function0, X.G0U, boolean, X.BRg, com.facebook.aura.settings.HatchConnectedDevicesViewModel, X.BFM, int, int):void");
    }

    public static final void RemovableDevice(NodeListEntry nodeListEntry, Function0<Unit> function0, G0U<? super NodeListEntry, Unit> g0u, BRg bRg, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(nodeListEntry, function0, g0u);
        C7384Etj.A0Y(g0w, 4);
        bfm.AgG(-1820723572);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, nodeListEntry) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, AaC.A04);
            }
            MutableState mutableState3 = (MutableState) objAaT2;
            boolean zA67 = bfm.A67(nodeListEntry);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchConnectedDevicesScreenKt$RemovableDevice$onLongPress$1$1(nodeListEntry, mutableState);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207bc);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new HatchConnectedDevicesScreenKt$RemovableDevice$1$1(mutableState3);
                bfm.Ai0(objAaT4);
            }
            BRg bRgA00 = ASZ.A00(bRg2, (G0U) objAaT4);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT5 = bfm.AaT();
            if (zA65 || objAaT5 == obj) {
                objAaT5 = new HatchConnectedDevicesScreenKt$RemovableDevice$2$1(strA01, mutableState2);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A1G(AuraClickableCardKt.m2509auraClickableCardYQRRFTQ(ARD.A01(bRgA00, (G0U) objAaT5, false), function0, function02, 0, null), bfm, g0w, (iA0T >> 9) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-32707833);
                AaC aaC = (AaC) mutableState3.getValue();
                boolean zIsWearable = nodeListEntry.isWearable();
                boolean zA672 = bfm.A67(nodeListEntry);
                Object objAaT6 = bfm.AaT();
                if (zA672 || objAaT6 == obj) {
                    objAaT6 = new HatchConnectedDevicesScreenKt$RemovableDevice$3$1(nodeListEntry, mutableState);
                    bfm.Ai0(objAaT6);
                }
                Function0 function03 = (Function0) objAaT6;
                boolean zA1I = AnonymousClass004.A1I(iA0T);
                Object objAaT7 = bfm.AaT();
                if (zA1I || objAaT7 == obj) {
                    objAaT7 = new HatchConnectedDevicesScreenKt$RemovableDevice$4$1(function0, mutableState);
                    bfm.Ai0(objAaT7);
                }
                Function0 function04 = (Function0) objAaT7;
                boolean zA673 = bfm.A67(nodeListEntry);
                Object objAaT8 = bfm.AaT();
                if (zA673 || objAaT8 == obj) {
                    objAaT8 = new HatchConnectedDevicesScreenKt$RemovableDevice$5$1(nodeListEntry, mutableState, mutableState2);
                    bfm.Ai0(objAaT8);
                }
                DeviceActionOverlay(aaC, zIsWearable, function03, function04, (Function0) objAaT8, g0w, null, bfm, (iA0T << 3) & 458752, 64);
            } else {
                bfm.AgE(-32262890);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (MutableState.A0A(mutableState2)) {
                bfm.AgE(-32211957);
                String str = nodeListEntry.displayName;
                if (str.length() == 0) {
                    str = nodeListEntry.nodeId;
                }
                String str2 = nodeListEntry.nodeId;
                boolean zA674 = bfm.A67(nodeListEntry) | AnonymousClass004.A1K(iA0T);
                Object objAaT9 = bfm.AaT();
                if (zA674 || objAaT9 == obj) {
                    objAaT9 = new HatchConnectedDevicesScreenKt$RemovableDevice$7$1(nodeListEntry, g0u, mutableState2);
                    bfm.Ai0(objAaT9);
                }
                Function0 function05 = (Function0) objAaT9;
                Object objAaT10 = bfm.AaT();
                if (objAaT10 == obj) {
                    objAaT10 = new HatchConnectedDevicesScreenKt$RemovableDevice$8$1(mutableState2);
                    bfm.Ai0(objAaT10);
                }
                RemoveDeviceConfirmationDialog(str, str2, function05, (Function0) objAaT10, bfm, 3072);
            } else {
                bfm.AgE(-31617098);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(nodeListEntry, function0, g0u, bRg2, g0w, i, i2);
        }
    }

    public static final NodeListEntry createLocalDeviceEntry() {
        String nodeId = AuraDeviceId.INSTANCE.getNodeId();
        String strA0l = AnonymousClass002.A0l(FGI.A0U(Build.MANUFACTURER, InviteCodeScratcherKt.CODE_SEPARATOR, Build.MODEL));
        String str = Build.VERSION.RELEASE;
        if (str == null) {
            str = "";
        }
        return new NodeListEntry(nodeId, strA0l, "android", str, null, null, AnonymousClass001.A0i(), null, null, null, null, null);
    }

    public static final void logDeviceMenuDismiss(String str) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.DEVICE_ROW, str, null);
    }

    public static final void logRemoveDeviceCancelClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.DELETE_CANCEL_BUTTON, str, null, null);
    }

    public static final void logRemoveDeviceClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.DELETE_BUTTON, str, null, null);
    }

    public static final void DeveloperModeSection(C07C c07c, boolean z, ConnectedDevicesUiState.DeveloperModeTurnOff developerModeTurnOff, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-1205094865);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(developerModeTurnOff, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0d, 74898), bfm, iA0d)) {
            AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eee), null, null, bfm, 48, 4);
            boolean zA1E = AnonymousClass003.A1E(iA0d) | AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1E || objAaT == C78N.A00) {
                objAaT = new HatchConnectedDevicesScreenKt$DeveloperModeSection$1$1(z, g0u);
                bfm.Ai0(objAaT);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c07c, false, null, 0L, (G0U) objAaT, bfm, iA0d & 14, 7);
            C01N.A05(bfm, BRg.A00);
            HatchSettingsDescriptionKt.HatchSettingsDescription(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eec), null, bfm, 0, 2);
            if (developerModeTurnOff != null) {
                bfm.AgE(651572466);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ef2);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ef1);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ef3);
                String strA014 = developerModeTurnOff.assistantName;
                if (strA014 == null) {
                    bfm.AgE(1545053134);
                    strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121199);
                } else {
                    bfm.AgE(1545051739);
                }
                AnonymousClass001.A1D(bfm);
                AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA013, AnonymousClass001.A0t(bfm, strA014, R.string._name_removed__res_0x7f120ef0), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new AnonymousClass2(strA01, function0, strA012, function02), 1737768411), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, ((iA0d << 3) & 3670016) | 196608, 0, 1945);
            } else {
                bfm.AgE(652372979);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c07c, z, developerModeTurnOff, g0u, function0, function02, i);
        }
    }

    public static final void RemoveDeviceConfirmationDialog(String str, String str2, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(1818088912);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207b4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed6);
            String strA0t = AnonymousClass001.A0t(bfm, str, R.string._name_removed__res_0x7f1207be);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1207bd);
            B1U b1uA00 = B1V.A00(bfm, new C134821(strA01, function0, strA012, str2, function02), 901543711);
            boolean z = (iA0d & 7168) == 2048;
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new HatchConnectedDevicesScreenKt$RemoveDeviceConfirmationDialog$2$1(function02);
                bfm.Ai0(objAaT);
            }
            AuraAlertDialogKt.AuraAlertDialog((BRg) null, strA0t, strA013, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) b1uA00, (Function0<Unit>) objAaT, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, 196608, 0, 1945);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134833(str, str2, function0, function02, i);
        }
    }

    public static final /* synthetic */ ConnectedDevicesScreenState access$HatchConnectedDevicesScreen$lambda$1(C1BO c1bo) {
        return (ConnectedDevicesScreenState) c1bo.getValue();
    }
}
