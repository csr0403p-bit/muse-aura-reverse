package com.facebook.aura.devices.pairing;

import X.AKH;
import X.AKQ;
import X.AbstractC04540eo;
import X.AbstractC1874Aso;
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
import X.AuJ;
import X.AxM;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BG3;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C07C;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1697Aoc;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C19h;
import X.C19i;
import X.C1D8;
import X.C1DG;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C1j7;
import X.C1ji;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3Ue;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C90l;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.net.Uri;
import com.facebook.aura.R;
import com.facebook.aura.common.ui.KeepScreenOnKt;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.devices.intf.ClaimedDeviceRow;
import com.facebook.aura.devices.intf.DeviceRowBadge;
import com.facebook.aura.devices.intf.DiscoveredDeviceClassifierKt;
import com.facebook.aura.devices.pairing.remote.RemoteFiles;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchDevicePairingBottomSheetsKt {
    public static final String TOS_LINK_FALLBACK_URL = "https://www.facebook.com/legal/ai-terms";

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$AvailableNetworksHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRefresh;
        public final /* synthetic */ int $titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$onRefresh = function0;
            this.$modifier = bRg;
            this.$titleRes = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.AvailableNetworksHeader(this.$onRefresh, this.$modifier, this.$titleRes, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C116202 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116202(HatchDevicePairingActions hatchDevicePairingActions) {
            super(2);
            this.$actions = hatchDevicePairingActions;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                boolean zA67 = bfm.A67(hatchDevicePairingActions);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$2$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                HatchDevicePairingBottomSheetsKt.HatchDeviceSkipWifiButton((Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(C10G.A02, 24.0f, 8.0f);
                HatchDevicePairingUiState hatchDevicePairingUiState = this.$state;
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                if (hatchDevicePairingUiState.isWaitingForWifiScan()) {
                    bfm.AgE(1751755799);
                    HatchDevicePairingBottomSheetsKt.PairingStatusCard(c90l, AbstractC2271BQs.A01(bfm, R.string.device_pairing_searching), null, ComposableSingletons$HatchDevicePairingBottomSheetsKt.f39lambda$1786354519, bfm, 3078, 2);
                } else if (hatchDevicePairingUiState.getWifiNetworks().isEmpty()) {
                    boolean zA1Z = AnonymousClass001.A1Z(hatchDevicePairingActions, bfm, 1752028692);
                    Object objAaT = bfm.AaT();
                    if (zA1Z || objAaT == C78N.A00) {
                        objAaT = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$1$1(hatchDevicePairingActions);
                        bfm.Ai0(objAaT);
                    }
                    HatchDevicePairingBottomSheetsKt.AvailableNetworksHeader((Function0) objAaT, null, 0, bfm, 0, 6);
                    C01N.A08(bfm, bs0, 8.0f);
                    boolean zA67 = bfm.A67(hatchDevicePairingActions);
                    Object objAaT2 = bfm.AaT();
                    if (zA67 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$2$1(hatchDevicePairingActions);
                        bfm.Ai0(objAaT2);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
                    if (hatchDevicePairingUiState.getWifiScanFailed()) {
                        bfm.AgE(1752426887);
                        C01N.A08(bfm, bs0, 8.0f);
                        String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_wifi_scan_failed);
                        C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                        AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A07(bs0, 16.0f), C06G.A08(bfm), c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                    } else {
                        bfm.AgE(1752771886);
                    }
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(1752888973);
                    List<HatchDeviceWiFiNetwork> savedWifiNetworks = hatchDevicePairingUiState.getSavedWifiNetworks();
                    if (!savedWifiNetworks.isEmpty()) {
                        bfm.AgE(1752953763);
                        HatchDevicePairingBottomSheetsKt.SavedNetworksHeader(null, bfm, 0, 1);
                        C01N.A08(bfm, bs0, 8.0f);
                        boolean zA1M = AnonymousClass003.A1M(bfm, savedWifiNetworks, hatchDevicePairingActions);
                        Object objAaT3 = bfm.AaT();
                        if (zA1M || objAaT3 == C78N.A00) {
                            objAaT3 = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$3$1(savedWifiNetworks, hatchDevicePairingActions);
                            bfm.Ai0(objAaT3);
                        }
                        HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT3, bfm, 6, 7);
                        C01N.A04(bfm, bbi, bs0, 16.0f, false);
                    } else {
                        bfm.AgE(1753456366);
                        BBI.A0R(bbi, false);
                    }
                    boolean zA672 = bfm.A67(hatchDevicePairingActions);
                    Object objAaT4 = bfm.AaT();
                    if (zA672 || objAaT4 == C78N.A00) {
                        objAaT4 = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$4$1(hatchDevicePairingActions);
                        bfm.Ai0(objAaT4);
                    }
                    Function0 function02 = (Function0) objAaT4;
                    boolean zIsEmpty = savedWifiNetworks.isEmpty();
                    int i2 = R.string.device_pairing_wifi_other_networks;
                    if (zIsEmpty) {
                        i2 = R.string.device_pairing_wifi_available;
                    }
                    HatchDevicePairingBottomSheetsKt.AvailableNetworksHeader(function02, null, i2, bfm, 0, 2);
                    C01N.A08(bfm, bs0, 8.0f);
                    boolean zA1M2 = AnonymousClass003.A1M(bfm, hatchDevicePairingUiState, hatchDevicePairingActions);
                    Object objAaT5 = bfm.AaT();
                    if (zA1M2 || objAaT5 == C78N.A00) {
                        objAaT5 = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$4$1$5$1(hatchDevicePairingUiState, hatchDevicePairingActions);
                        bfm.Ai0(objAaT5);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT5, bfm, 6, 7);
                }
                C01N.A07(bfm, C10G.A04(bs0, 16.0f));
                AnonymousClass003.A0q(bbi);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$onBack = function0;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.ChooseWiFiBottomSheet(this.$state, this.$actions, this.$strings, this.$onBack, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$DeviceFoundContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C116212 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116212(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
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
            HatchDevicePairingBottomSheetsKt.DeviceFoundContent(this.$state, this.$actions, this.$strings, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$DevicePairingRetryMessage$2, reason: invalid class name and case insensitive filesystem */
    public final class C116222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $message;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onScanAgain;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116222(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$message = str;
            this.$onScanAgain = function0;
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
            HatchDevicePairingBottomSheetsKt.DevicePairingRetryMessage(this.$message, this.$onScanAgain, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$DeviceScanningContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C116232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116232(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$onRetryBeforeScan = function0;
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
            HatchDevicePairingBottomSheetsKt.DeviceScanningContent(this.$state, this.$actions, this.$strings, this.$onRetryBeforeScan, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C116242 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $connecting;
        public final /* synthetic */ boolean $credentialsComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116242(boolean z, boolean z2, HatchDevicePairingActions hatchDevicePairingActions) {
            super(2);
            this.$connecting = z;
            this.$credentialsComplete = z2;
            this.$actions = hatchDevicePairingActions;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            int i2;
            boolean z = true;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 18.0f);
                boolean z2 = this.$connecting;
                boolean z3 = this.$credentialsComplete;
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                if (z2) {
                    bfm.AgE(641641867);
                    i2 = R.string.device_pairing_connecting;
                } else {
                    bfm.AgE(641644360);
                    i2 = R.string.device_pairing_connect;
                }
                String strA0s = AnonymousClass001.A0s(bfm, bbi, i2);
                AuraLabelButtonStyle style = AuraButtonKt.toStyle(AuraButtonStyle.PRIMARY, null, bfm, 6, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                if (z2 || !z3) {
                    z = false;
                }
                boolean zA67 = bfm.A67(hatchDevicePairingActions);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$2$1$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA0s, null, c1062ATq, style, auraButtonSize, null, false, false, z, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200773);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4, reason: invalid class name and case insensitive filesystem */
    public final class C116254 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $connecting;
        public final /* synthetic */ boolean $connectionFailed;
        public final /* synthetic */ HatchDeviceWiFiNetwork $selectedNetwork;
        public final /* synthetic */ String $ssid;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116254(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork, String str, HatchDevicePairingActions hatchDevicePairingActions, boolean z, boolean z2) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$selectedNetwork = hatchDeviceWiFiNetwork;
            this.$ssid = str;
            this.$actions = hatchDevicePairingActions;
            this.$connecting = z;
            this.$connectionFailed = z2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.C07C r50, X.BFM r51, int r52) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.C116254.invoke(X.07C, X.BFM, int):void");
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$5, reason: invalid class name and case insensitive filesystem */
    public final class C116265 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116265(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$onBack = function0;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.EnterPasswordBottomSheet(this.$state, this.$actions, this.$strings, this.$onBack, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C116272 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $isDeveloperModeEnabled;
        public final /* synthetic */ long $secondaryButtonFill;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116272(HatchDevicePairingActions hatchDevicePairingActions, boolean z, HatchDevicePairingUiState hatchDevicePairingUiState, long j) {
            super(2);
            this.$actions = hatchDevicePairingActions;
            this.$isDeveloperModeEnabled = z;
            this.$state = hatchDevicePairingUiState;
            this.$secondaryButtonFill = j;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0C = C3U4.A0C(C3U4.A0B(c1062ATq, 34.0f, 0.0f), 0.0f, 12.0f, 0.0f, 18.0f);
                C9m9 c9m9A00 = AcQ.A00(12.0f);
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                boolean z = this.$isDeveloperModeEnabled;
                HatchDevicePairingUiState hatchDevicePairingUiState = this.$state;
                long j = this.$secondaryButtonFill;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 6);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_community_warning_exit);
                AuraLabelButtonStyle style = AuraButtonKt.toStyle(AuraButtonStyle.PRIMARY, null, bfm, 6, 1);
                AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
                boolean zA67 = bfm.A67(hatchDevicePairingActions);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$2$1$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq, style, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                int i2 = R.string.device_pairing_community_warning_enable_developer_mode;
                if (z) {
                    i2 = R.string.device_pairing_community_warning_continue;
                }
                String strA012 = AbstractC2271BQs.A01(bfm, i2);
                AuraLabelButtonStyle style2 = AuraButtonKt.toStyle(AuraButtonStyle.SECONDARY, null, bfm, 6, 1);
                boolean z2 = !hatchDevicePairingUiState.isInitialConnectionInProgress();
                boolean zA1M = AnonymousClass003.A1M(bfm, hatchDevicePairingActions, hatchDevicePairingUiState);
                Object objAaT2 = bfm.AaT();
                if (zA1M || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$2$1$2$1(hatchDevicePairingActions, hatchDevicePairingUiState);
                    bfm.Ai0(objAaT2);
                }
                Function0 function02 = (Function0) objAaT2;
                boolean zA64 = bfm.A64(j);
                Object objAaT3 = bfm.AaT();
                if (zA64 || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$2$1$3$1(j);
                    bfm.Ai0(objAaT3);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, c1062ATq, style2, auraButtonSize, null, false, false, z2, false, false, null, null, function02, null, null, null, (Function0) objAaT3, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 133938629);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$4, reason: invalid class name and case insensitive filesystem */
    public final class C116284 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isDeveloperModeEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116284(boolean z) {
            super(3);
            this.$isDeveloperModeEnabled = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA0C = C3U4.A0C(c1062ATq, 34.0f, 0.0f, 34.0f, 16.0f);
                C3TH c3th = C2VU.A00;
                boolean z = this.$isDeveloperModeEnabled;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                HatchDevicePairingBottomSheetsKt.HatchDeviceCommunityWarningVideo(BJe.A00(C10G.A0A(bs0, Float.NaN, 260.0f), 1.0f, false), bfm, 6, 0);
                C01N.A08(bfm, bs0, 20.0f);
                String selectedAssistantNameOrNull = JarvisUtils.INSTANCE.getSelectedAssistantNameOrNull(AnonymousClass002.A0h(bfm));
                if (selectedAssistantNameOrNull == null) {
                    bfm.AgE(883875154);
                    selectedAssistantNameOrNull = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121199);
                } else {
                    bfm.AgE(883872240);
                }
                BBI.A0R(bbi, false);
                String strA0t = AnonymousClass001.A0t(bfm, selectedAssistantNameOrNull, R.string.device_pairing_community_warning_title);
                C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Emphasized;
                long jA0C = C06G.A0C(bfm);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$4$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, AnonymousClass001.A0Y(bs0, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A08(bfm, bs0, 16.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string.device_pairing_community_warning_body), c1062ATq, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                C01N.A08(bfm, bs0, 16.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string.device_pairing_community_warning_closing), c1062ATq, C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                if (z) {
                    bfm.AgE(1631240996);
                    C01N.A08(bfm, bs0, 16.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string.device_pairing_community_warning_already_developer), c1062ATq, C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                } else {
                    bfm.AgE(1631559087);
                }
                BBI.A0R(bbi, false);
                C01N.A04(bfm, bbi, bs0, 16.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$5, reason: invalid class name and case insensitive filesystem */
    public final class C116295 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116295(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceCommunityWarningBottomSheet(this.$state, this.$actions, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningVideo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceCommunityWarningVideo(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C116302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116302(HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingUiState hatchDevicePairingUiState) {
            super(2);
            this.$actions = hatchDevicePairingActions;
            this.$state = hatchDevicePairingUiState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$state, bfm.A67(this.$actions));
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                HatchDevicePairingUiState hatchDevicePairingUiState = this.$state;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingBottomSheet$2$1$1(hatchDevicePairingActions, hatchDevicePairingUiState);
                    bfm.Ai0(objAaT);
                }
                HatchDevicePairingBottomSheetsKt.HatchDevicePairingFooter((Function0) objAaT, !this.$state.isInitialConnectionInProgress(), true, null, bfm, 384, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingBottomSheet$4, reason: invalid class name and case insensitive filesystem */
    public final class C116314 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116314(HatchDevicePairingStrings hatchDevicePairingStrings) {
            super(3);
            this.$strings = hatchDevicePairingStrings;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(C10G.A02, 34.0f, 16.0f);
                C3TH c3th = C2VU.A00;
                HatchDevicePairingStrings hatchDevicePairingStrings = this.$strings;
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
                BBI bbi = (BBI) bfm;
                long j = bbi.A06;
                int i2 = (int) (j ^ (j >>> 32));
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                int i3 = hatchDevicePairingStrings.fallbackDeviceNameRes;
                bfm.AgE(2138870651);
                String strA01 = AbstractC2271BQs.A01(bfm, i3);
                AnonymousClass002.A19(bfm);
                AuraImageKt.AuraImage(new AuraDrawableSourceResource(R.drawable.hatch_logo), C10G.A07(bs0, 104.0f), null, null, false, false, null, false, null, bfm, 432, 504);
                int iA00 = C01N.A00(bfm, bs0, 28.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, strA01, R.string.device_pairing_connecting_intro_title), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                C01N.A08(bfm, bs0, 36.0f);
                InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 24.0f, iA00);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                HatchDevicePairingBottomSheetsKt.HatchDeviceConnectingInfoRow(R.drawable.meta_icons_2_0_vector_signalfanhi_outline_24_wght400, AnonymousClass006.A0v(bfm, R.string.device_pairing_connecting_intro_network_body), null, null, bfm, 0, 12);
                HatchDevicePairingBottomSheetsKt.HatchDeviceConnectingInfoRow(R.drawable.meta_icons_2_0_vector_power_outline_24_wght500, AnonymousClass001.A0t(bfm, strA01, R.string.device_pairing_connecting_intro_power_body), null, null, bfm, 0, 12);
                BBI.A0R(bbi, true);
                C01N.A04(bfm, bbi, bs0, 32.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingBottomSheet$5, reason: invalid class name and case insensitive filesystem */
    public final class C116325 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116325(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceConnectingBottomSheet(this.$state, this.$actions, this.$strings, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingInfoRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C116332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $iconRes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116332(int i, String str, BRg bRg, String str2, int i2, int i3) {
            super(2);
            this.$iconRes = i;
            this.$text = str;
            this.$modifier = bRg;
            this.$title = str2;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.HatchDeviceConnectingInfoRow(this.$iconRes, this.$text, this.$modifier, this.$title, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceDiscoveryBottomSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C116342 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116342(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$onRetryBeforeScan = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                if (this.$state.getPairingStep() != HatchDevicePairingStep.DEVICE_FOUND && this.$state.getPairingStep() != HatchDevicePairingStep.CONNECTING_DEVICE) {
                    bfm.AgE(181207110);
                    HatchDevicePairingBottomSheetsKt.DeviceScanningContent(this.$state, this.$actions, this.$strings, this.$onRetryBeforeScan, null, bfm, 0, 16);
                } else {
                    bfm.AgE(181114017);
                    HatchDevicePairingBottomSheetsKt.DeviceFoundContent(this.$state, this.$actions, this.$strings, null, bfm, 0, 8);
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                if (this.$state.getPairingTargetName() == null) {
                    bfm.AgE(181431643);
                    BS0 bs0 = BRg.A00;
                    DiscoveredDeviceClassifierKt.DiscoveredDeviceScanStatus(C3U4.A0B(bs0, 40.0f, 0.0f), bfm, 6, 0);
                    if (this.$state.getShowsDeveloperModeHint()) {
                        bfm.AgE(181549412);
                        String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_developer_mode_hint);
                        C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                        AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(C3U4.A0B(bs0, 40.0f, 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium), C06G.A08(bfm), c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                    } else {
                        bfm.AgE(181851414);
                    }
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(181857366);
                }
                BBI.A0R(bbi, false);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceDiscoveryBottomSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$onRetryBeforeScan = function0;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceDiscoveryBottomSheet(this.$state, this.$actions, this.$strings, this.$onRetryBeforeScan, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceLinkTermsOfServiceLine$1, reason: invalid class name and case insensitive filesystem */
    public final class C116351 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116351(BRg bRg, int i, int i2) {
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceLinkTermsOfServiceLine(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingAgenticIcon$1, reason: invalid class name and case insensitive filesystem */
    public final class C116361 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116361(BRg bRg, int i, int i2) {
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
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingAgenticIcon(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingBottomSheets$1, reason: invalid class name and case insensitive filesystem */
    public final class C116371 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onPairingSucceeded;
        public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116371(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, BRg bRg, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$modifier = bRg;
            this.$dismissible = z;
            this.$onBack = function0;
            this.$onRetryBeforeScan = function02;
            this.$onPairingSucceeded = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingBottomSheets(this.$state, this.$actions, this.$strings, this.$modifier, this.$dismissible, this.$onBack, this.$onRetryBeforeScan, this.$onPairingSucceeded, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingBottomSheets$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onPairingSucceeded;
        public final /* synthetic */ Function0<Unit> $onRetryBeforeScan;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, BRg bRg, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$modifier = bRg;
            this.$dismissible = z;
            this.$onBack = function0;
            this.$onRetryBeforeScan = function02;
            this.$onPairingSucceeded = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingBottomSheets(this.$state, this.$actions, this.$strings, this.$modifier, this.$dismissible, this.$onBack, this.$onRetryBeforeScan, this.$onPairingSucceeded, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingContinueButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C116381 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116381(Function0<Unit> function0, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$onContinue = function0;
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
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingContinueButton(this.$onContinue, this.$enabled, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingFailureDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C116391 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $okText;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116391(String str, Function0<Unit> function0) {
            super(2);
            this.$okText = str;
            this.$onDismiss = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A65(this.$okText));
                String str = this.$okText;
                Function0<Unit> function0 = this.$onDismiss;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$HatchDevicePairingFailureDialog$1$1$1(str, function0);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A14(bfm, objAaT);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingFailureDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C116402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $deviceName;
        public final /* synthetic */ HatchDevicePairingDialog $dialog;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116402(HatchDevicePairingDialog hatchDevicePairingDialog, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$dialog = hatchDevicePairingDialog;
            this.$deviceName = str;
            this.$onDismiss = function0;
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
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingFailureDialog(this.$dialog, this.$deviceName, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDevicePairingFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C116412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ boolean $showTermsOfService;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116412(Function0<Unit> function0, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$onContinue = function0;
            this.$enabled = z;
            this.$showTermsOfService = z2;
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
            HatchDevicePairingBottomSheetsKt.HatchDevicePairingFooter(this.$onContinue, this.$enabled, this.$showTermsOfService, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceProvisioningConnectingSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C116422 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116422(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingStrings hatchDevicePairingStrings) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$strings = hatchDevicePairingStrings;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                boolean zIsOtaInProgress = this.$state.getPairingProvisioningStatus().isOtaInProgress();
                KeepScreenOnKt.KeepScreenOn(zIsOtaInProgress, bfm, 0);
                BS0 bs0 = BRg.A00;
                BRg bRgA08 = C3U4.A08(C10G.A02, 24.0f);
                HatchDevicePairingUiState hatchDevicePairingUiState = this.$state;
                HatchDevicePairingStrings hatchDevicePairingStrings = this.$strings;
                InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA08);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                C90l c90l = C90l.A00;
                boolean zA1U = AnonymousClass001.A1U(bfm, zIsOtaInProgress, AnonymousClass003.A1N(bfm, hatchDevicePairingUiState, hatchDevicePairingStrings));
                Object objAaT = bfm.AaT();
                if (zA1U || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceProvisioningConnectingSheet$2$1$1$1(hatchDevicePairingUiState, hatchDevicePairingStrings, zIsOtaInProgress);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass007.A0o(c90l, bfm, objAaT);
                C01N.A08(bfm, bs0, 12.0f);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_connecting_hint);
                C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
                long jA08 = C06G.A08(bfm);
                BRg bRgA07 = C3U4.A07(bs0, 16.0f);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HatchDevicePairingBottomSheetsKt$HatchDeviceProvisioningConnectingSheet$2$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bRgA07, objAaT2, false), jA08, c1822ArmA0Y, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                C01N.A03(bfm, bbi, bs0, 16.0f);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceProvisioningConnectingSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C116433 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116433(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceProvisioningConnectingSheet(this.$state, this.$actions, this.$strings, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$HatchDeviceSkipWifiButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C116441 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSkip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116441(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onSkip = function0;
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
            HatchDevicePairingBottomSheetsKt.HatchDeviceSkipWifiButton(this.$onSkip, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C116453 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116453(HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingUiState hatchDevicePairingUiState) {
            super(2);
            this.$actions = hatchDevicePairingActions;
            this.$state = hatchDevicePairingUiState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$state, bfm.A67(this.$actions));
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                HatchDevicePairingUiState hatchDevicePairingUiState = this.$state;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$3$1$1(hatchDevicePairingActions, hatchDevicePairingUiState);
                    bfm.Ai0(objAaT);
                }
                HatchDevicePairingBottomSheetsKt.HatchDevicePairingFooter((Function0) objAaT, AnonymousClass002.A1Z(this.$state.getLinkAppConfirmation(), LinkAppConfirmationState.REQUIRED), false, null, bfm, 0, 12);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$5, reason: invalid class name and case insensitive filesystem */
    public final class C116465 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $confirmationTitle;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116465(HatchDevicePairingUiState hatchDevicePairingUiState, String str) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$confirmationTitle = str;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BS0 bs0 = BRg.A00;
                BRg bRgA0B = C3U4.A0B(C10G.A02, 34.0f, 16.0f);
                C3TH c3th = C2VU.A00;
                HatchDevicePairingUiState hatchDevicePairingUiState = this.$state;
                String str = this.$confirmationTitle;
                InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass002.A0V(bfm, c3th);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0V, akqA04, bRgA01, iA0J);
                HatchDevicePairingBottomSheetsKt.HatchDevicePairingAgenticIcon(null, bfm, 0, 1);
                if (hatchDevicePairingUiState.getLinkDeviceVerification() == LinkDeviceVerification.VERIFIED_META) {
                    bfm.AgE(476875768);
                    C01N.A08(bfm, bs0, 12.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string.device_pairing_verified_meta_device), null, C06G.A08(bfm), C06G.A0T(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
                } else {
                    bfm.AgE(477172717);
                }
                BBI.A0R(bbi, false);
                C01N.A08(bfm, bs0, 28.0f);
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$5$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title3Emphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A08(bfm, bs0, 12.0f);
                LinkAppConfirmationState linkAppConfirmation = hatchDevicePairingUiState.getLinkAppConfirmation();
                int i2 = R.string.device_pairing_link_button_confirm_body;
                if (linkAppConfirmation != null) {
                    i2 = R.string.device_pairing_link_app_confirm_body;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i2);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$5$1$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT2, false), C06G.A08(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
                C01N.A04(bfm, bbi, bs0, 104.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchDevicePairingUiState $state;
        public final /* synthetic */ HatchDevicePairingStrings $strings;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$strings = hatchDevicePairingStrings;
            this.$dismissible = z;
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
            HatchDevicePairingBottomSheetsKt.LinkButtonConfirmationBottomSheet(this.$state, this.$actions, this.$strings, this.$dismissible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$PairingCredentialRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C116472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuJ $keyboardOptions;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onValueChange;
        public final /* synthetic */ String $placeholder;
        public final /* synthetic */ boolean $readOnly;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
        public final /* synthetic */ String $value;
        public final /* synthetic */ C19h $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C116472(String str, G0U<? super String, Unit> g0u, String str2, BRg bRg, boolean z, C19h c19h, AuJ auJ, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$value = str;
            this.$onValueChange = g0u;
            this.$placeholder = str2;
            this.$modifier = bRg;
            this.$readOnly = z;
            this.$visualTransformation = c19h;
            this.$keyboardOptions = auJ;
            this.$trailingIcon = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.PairingCredentialRow(this.$value, this.$onValueChange, this.$placeholder, this.$modifier, this.$readOnly, this.$visualTransformation, this.$keyboardOptions, this.$trailingIcon, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$PairingDeviceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C116482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ DeviceRowBadge $badge;
        public final /* synthetic */ ClaimedDeviceRow $claim;
        public final /* synthetic */ boolean $connecting;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ Function0<Unit> $onConnect;
        public final /* synthetic */ boolean $updating;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116482(String str, Function0<Unit> function0, BRg bRg, boolean z, boolean z2, ClaimedDeviceRow claimedDeviceRow, DeviceRowBadge deviceRowBadge, int i, int i2) {
            super(2);
            this.$name = str;
            this.$onConnect = function0;
            this.$modifier = bRg;
            this.$connecting = z;
            this.$updating = z2;
            this.$claim = claimedDeviceRow;
            this.$badge = deviceRowBadge;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.PairingDeviceRow(this.$name, this.$onConnect, this.$modifier, this.$connecting, this.$updating, this.$claim, this.$badge, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$PairingScanAgainLink$1, reason: invalid class name and case insensitive filesystem */
    public final class C116491 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116491(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onClick = function0;
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
            HatchDevicePairingBottomSheetsKt.PairingScanAgainLink(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$PairingStatusCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C116502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C07C $this_PairingStatusCard;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C116502(C07C c07c, String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$this_PairingStatusCard = c07c;
            this.$label = str;
            this.$modifier = bRg;
            this.$trailing = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.PairingStatusCard(this.$this_PairingStatusCard, this.$label, this.$modifier, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$SavedNetworksHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C116511 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116511(BRg bRg, int i, int i2) {
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
            HatchDevicePairingBottomSheetsKt.SavedNetworksHeader(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$WifiListRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C116522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;
        public final /* synthetic */ Integer $trailingIconRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116522(String str, Function0<Unit> function0, BRg bRg, Integer num, int i, int i2) {
            super(2);
            this.$title = str;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$trailingIconRes = num;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchDevicePairingBottomSheetsKt.WifiListRow(this.$title, this.$onClick, this.$modifier, this.$trailingIconRes, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final float halfLayoutHeight(BFM bfm, int i) {
        return ((int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)) / 2;
    }

    public static final String pairingStringResource(int i, Object[] objArr, BFM bfm, int i2) {
        String strA02;
        int length = objArr.length;
        if (length == 0) {
            bfm.AgE(2138870651);
            strA02 = AbstractC2271BQs.A01(bfm, i);
        } else {
            bfm.AgE(2138813518);
            strA02 = AbstractC2271BQs.A02(bfm, Arrays.copyOf(objArr, length), i);
        }
        AnonymousClass002.A19(bfm);
        return strA02;
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchDevicePairingDialog.values().length];
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.CONNECTION_FAILED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.PROVISIONING_FAILED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.SETUP_HANDOFF_FAILED, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.SDK_TOKEN_MISSING, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.SDK_TOKEN_INVALID, iArr, 5);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.SDK_TOKEN_DEVICE_LIMIT_REACHED, iArr, 6);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.GADGET_FIRMWARE_UPDATE_REQUIRED, iArr, 7);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.BUTTON_PRESS_TIMED_OUT, iArr, 8);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchDevicePairingDialog.FIRMWARE_UPDATE_REQUIRED, iArr, 9);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchDevicePairingDialog.CVM_UNSUPPORTED, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchDevicePairingDialog.DEVICE_ID_IN_USE, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchDevicePairingDialog.DEVICE_BUSY, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchDeviceBleState.values().length];
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.IDLE, iArr2, 1);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.SCANNING, iArr2, 2);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.FOUND, iArr2, 3);
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.CONNECTING, iArr2, 4);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.DISCOVERING_SERVICES, iArr2, 5);
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.READY, iArr2, 6);
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.CONNECTION_FAILED, iArr2, 7);
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.NOT_FOUND, iArr2, 8);
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AnonymousClass005.A0v(HatchDeviceBleState.BLUETOOTH_OFF, iArr2, 9);
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AvailableNetworksHeader(kotlin.jvm.functions.Function0<kotlin.Unit> r27, X.BRg r28, int r29, X.BFM r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.AvailableNetworksHeader(kotlin.jvm.functions.Function0, X.BRg, int, X.BFM, int, int):void");
    }

    public static final void ChooseWiFiBottomSheet(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        B1U b1uA00;
        BRg bRg2 = bRg;
        bfm.AgG(-1359999685);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDevicePairingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDevicePairingActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, hatchDevicePairingStrings);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            int i4 = hatchDevicePairingStrings.setupTitleRes;
            bfm.AgE(2138870651);
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            AnonymousClass002.A19(bfm);
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(strA01, null, function0 != null ? AuraBottomSheetHeaderConfig.AccessoryButton.Companion.back(function0) : null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            if (hatchDevicePairingUiState.getLinkWifiRequirement() == LinkWifiRequirement.OPTIONAL) {
                bfm.AgE(-1323351212);
                b1uA00 = B1V.A00(bfm, new C116202(hatchDevicePairingActions), -646421766);
                AnonymousClass001.A1D(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -1323264567);
                b1uA00 = null;
            }
            boolean z2 = (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$ChooseWiFiBottomSheet$3$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRg2, null, auraBottomSheetHeaderConfig, b1uA00, null, (Function0) objAaT, z, false, true, null, B1V.A00(bfm, new AnonymousClass4(hatchDevicePairingUiState, hatchDevicePairingActions), 224911710), bfm, AnonymousClass001.A0C(iA05 << 9, ((iA05 >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 805306374), 48, 1316);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(hatchDevicePairingUiState, hatchDevicePairingActions, hatchDevicePairingStrings, function0, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DeviceFoundContent(com.facebook.aura.devices.pairing.HatchDevicePairingUiState r38, com.facebook.aura.devices.pairing.HatchDevicePairingActions r39, com.facebook.aura.devices.pairing.HatchDevicePairingStrings r40, X.BRg r41, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.DeviceFoundContent(com.facebook.aura.devices.pairing.HatchDevicePairingUiState, com.facebook.aura.devices.pairing.HatchDevicePairingActions, com.facebook.aura.devices.pairing.HatchDevicePairingStrings, X.BRg, X.BFM, int, int):void");
    }

    public static final void DevicePairingRetryMessage(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2045508321);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            int iA00 = C01N.A00(bfm, bs0, 24.0f);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA08 = C06G.A08(bfm);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = HatchDevicePairingBottomSheetsKt$DevicePairingRetryMessage$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(c1062ATq, objAaT, false), jA08, c1822ArmA0T, null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            C01N.A08(bfm, bs0, 16.0f);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string.device_pairing_scan_again), null, c1062ATq, AuraButtonKt.toStyle(AuraButtonStyle.SECONDARY, null, bfm, iA00, 1), AuraButtonSize.MEDIUM, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0d << 9) & 57344, 0, 134201285);
            C01N.A04(bfm, bbi, bs0, 24.0f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116222(str, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DeviceScanningContent(com.facebook.aura.devices.pairing.HatchDevicePairingUiState r30, com.facebook.aura.devices.pairing.HatchDevicePairingActions r31, com.facebook.aura.devices.pairing.HatchDevicePairingStrings r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, X.BRg r34, X.BFM r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.DeviceScanningContent(com.facebook.aura.devices.pairing.HatchDevicePairingUiState, com.facebook.aura.devices.pairing.HatchDevicePairingActions, com.facebook.aura.devices.pairing.HatchDevicePairingStrings, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc A[PHI: r5
  0x00dc: PHI (r5v4 boolean) = (r5v3 boolean), (r5v10 boolean), (r5v10 boolean) binds: [B:41:0x00c7, B:43:0x00ce, B:45:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EnterPasswordBottomSheet(com.facebook.aura.devices.pairing.HatchDevicePairingUiState r25, com.facebook.aura.devices.pairing.HatchDevicePairingActions r26, com.facebook.aura.devices.pairing.HatchDevicePairingStrings r27, kotlin.jvm.functions.Function0<kotlin.Unit> r28, boolean r29, X.BRg r30, X.BFM r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.EnterPasswordBottomSheet(com.facebook.aura.devices.pairing.HatchDevicePairingUiState, com.facebook.aura.devices.pairing.HatchDevicePairingActions, com.facebook.aura.devices.pairing.HatchDevicePairingStrings, kotlin.jvm.functions.Function0, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void HatchDeviceCommunityWarningBottomSheet(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(295210092);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDevicePairingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDevicePairingActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
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
            boolean zIsDeveloperModeEnabled = hatchDevicePairingUiState.isDeveloperModeEnabled();
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            boolean z2 = AnonymousClass001.A0f(bfm, akh).isLight;
            long j = AnonymousClass001.A0f(bfm, akh).secondaryElevated;
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgA0U = AnonymousClass001.A0U(bRg2, ((int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)) / 2);
            G0W<C1DG, BFM, Integer, Unit> g0w = z2 ? ComposableSingletons$HatchDevicePairingBottomSheetsKt.lambda$551692629 : null;
            AuraBottomSheetHeaderConfig.AccessoryButton.Companion companion = AuraBottomSheetHeaderConfig.AccessoryButton.Companion;
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z3 = i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT = bfm.AaT();
            if (z3 || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$1$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig("", null, companion.back((Function0) objAaT), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            B1U b1uA00 = B1V.A00(bfm, new C116272(hatchDevicePairingActions, zIsDeveloperModeEnabled, hatchDevicePairingUiState, j), 1963456869);
            boolean z4 = i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT2 = bfm.AaT();
            if (z4 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchDevicePairingBottomSheetsKt$HatchDeviceCommunityWarningBottomSheet$3$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA0U, null, auraBottomSheetHeaderConfig, b1uA00, g0w, (Function0) objAaT2, z, false, false, null, B1V.A00(bfm, new C116284(zIsDeveloperModeEnabled), 1648753961), bfm, ((iA05 << 15) & 29360128) | 24582, 48, 1796);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116295(hatchDevicePairingUiState, hatchDevicePairingActions, z, bRg2, i, i2);
        }
    }

    public static final void HatchDeviceCommunityWarningVideo(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-296708417);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object obj = AnonymousClass002.A0c(bfm).isLight ? RemoteFiles.COMMUNITY_DEVICE_WARNING_LIGHT : RemoteFiles.COMMUNITY_DEVICE_WARNING_DARK;
            boolean zA65 = bfm.A65(obj);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                C7384Etj.A0Y(obj, 0);
                objAaT = C7Je.A01(((C1j7) obj).A00.A02);
                C7384Etj.A0U(objAaT);
                bfm.Ai0(objAaT);
            }
            Uri uri = (Uri) objAaT;
            bfm.Ag8(-1668938065, uri);
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(C11U.A01(bRg2, 24.0f), uri, RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, true, true, bfm, 438, 0), uri.toString(), null, null, false, true, false, false, false, false, HatchVideoPlayer.ResizeMode.FIT, 0.0f, "hatch_device_community_warning", null, false, false, true, null, false, null, null, null, null, null, null, bfm, 113246208, 102261174, 0, 133866096);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }

    public static final void HatchDeviceConnectingBottomSheet(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-890806963);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDevicePairingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDevicePairingActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, hatchDevicePairingStrings);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgA0U = AnonymousClass001.A0U(bRg2, ((int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)) / 2);
            AuraBottomSheetHeaderConfig.AccessoryButton.Companion companion = AuraBottomSheetHeaderConfig.AccessoryButton.Companion;
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z2 = i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingBottomSheet$1$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig("", null, companion.back((Function0) objAaT), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            B1U b1uA00 = B1V.A00(bfm, new C116302(hatchDevicePairingActions, hatchDevicePairingUiState), -382757946);
            boolean z3 = i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT2 = bfm.AaT();
            if (z3 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchDevicePairingBottomSheetsKt$HatchDeviceConnectingBottomSheet$3$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA0U, null, auraBottomSheetHeaderConfig, b1uA00, null, (Function0) objAaT2, z, false, false, null, B1V.A00(bfm, new C116314(hatchDevicePairingStrings), 996806026), bfm, ((iA05 << 12) & 29360128) | 24582, 48, 1828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116325(hatchDevicePairingUiState, hatchDevicePairingActions, hatchDevicePairingStrings, z, bRg2, i, i2);
        }
    }

    public static final void HatchDeviceConnectingInfoRow(int i, String str, BRg bRg, String str2, BFM bfm, int i2, int i3) {
        String str3;
        BRg bRg2 = bRg;
        bfm.AgG(946249444);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            str3 = i5 == 0 ? str2 : null;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i, iA0D & 14), AuraIconSize.MEDIUM, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A04(), 33);
            BS0 bs0 = BRg.A00;
            C01N.A09(bfm, bs0, 18.0f);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (str3 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A0C(bfm), AnonymousClass006.A0k(bfm, 2071664596).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 9) & 14, 0, 16370);
                C01N.A04(bfm, bbi, bs0, 8.0f, false);
            } else {
                bfm.AgE(2071864484);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            str3 = str2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116332(i, str, bRg2, str3, i2, i3);
        }
    }

    public static final void HatchDeviceDiscoveryBottomSheet(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(531178217);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDevicePairingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDevicePairingActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, hatchDevicePairingStrings);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        boolean z2 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgA0U = AnonymousClass001.A0U(bRg2, ((int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)) / 2);
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string.device_pairing_connect_a_device), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions))) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceDiscoveryBottomSheet$1$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA0U, null, auraBottomSheetHeaderConfig, null, null, (Function0) objAaT, z, false, false, null, B1V.A00(bfm, new C116342(hatchDevicePairingUiState, hatchDevicePairingActions, hatchDevicePairingStrings, function0), -726898868), bfm, ((iA05 << 9) & 29360128) | 6, 48, 1844);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchDevicePairingUiState, hatchDevicePairingActions, hatchDevicePairingStrings, function0, z, bRg2, i, i2);
        }
    }

    public static final void HatchDeviceLinkTermsOfServiceLine(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1424407982);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String linkTosUrl = HatchUtil.INSTANCE.getLinkTosUrl();
            if (linkTosUrl.length() == 0) {
                linkTosUrl = TOS_LINK_FALLBACK_URL;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_link_tos_link);
            C7384Etj.A0Y(strA01, 0);
            String strReplace = strA01.replace(' ', '\u00a0');
            String strA0t = AnonymousClass001.A0t(bfm, strReplace, R.string.device_pairing_link_tos);
            long jA07 = C06G.A07(bfm);
            boolean zA1R = AnonymousClass005.A1R(bfm, strA0t, strReplace, linkTosUrl) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                BG3 bg3 = BG3.A02;
                long j = C1809ArT.A01;
                C1697Aoc c1697Aoc = new C1697Aoc(new C1824Aro(null, null, null, null, null, null, null, null, bg3, null, null, jA07, j, j, B6A.A07), null, null, null);
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                int iA0B = C7BY.A0B(strA0t, strReplace, 0, false);
                if (iA0B < 0) {
                    c1731ApSA0W.A0E(strA0t);
                } else {
                    AnonymousClass005.A0s(c1731ApSA0W, strA0t, 0, iA0B);
                    int iA01 = c1731ApSA0W.A01(new C1ji(c1697Aoc, linkTosUrl));
                    try {
                        c1731ApSA0W.A0E(strReplace);
                        c1731ApSA0W.A06(iA01);
                        c1731ApSA0W.A0E(strA0t.substring(iA0B + strReplace.length()));
                    } catch (Throwable th) {
                        c1731ApSA0W.A06(iA01);
                        throw th;
                    }
                }
                objAaT = c1731ApSA0W.A04();
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0((ApQ) objAaT, C3U4.A07(AnonymousClass001.A0R(bRg2), 34.0f), C06G.A08(bfm), C06G.A0S(bfm), null, null, new C1YL(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116351(bRg2, i, i2);
        }
    }

    public static final void HatchDevicePairingAgenticIcon(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(58575015);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0G = C06G.A0G(bfm, akh);
            boolean zA64 = bfm.A64(jA0G);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
                AuraImageKt.m2576auraTintColor4WTKRHQ(c7196Ei8, jA0G);
                objAaT = new C7197Ei9(c7196Ei8);
                bfm.Ai0(objAaT);
            }
            AuraDrawableSourceResource auraDrawableSourceResource = new AuraDrawableSourceResource(R.drawable.meta_icons_2_0_vector_nodecentralhub_outline_24_wght500);
            long jA0F = C06G.A0F(bfm, akh);
            long jA04 = HxS.A04(HDi.A0O[(int) (jA0F & 63)], B6A.A03(jA0F), B6A.A02(jA0F), B6A.A01(jA0F), 0.1f);
            long jA0F2 = C06G.A0F(bfm, akh);
            BRg bRgA00 = AbstractC04540eo.A00(bRg2, null, 50.0f, 6, HxS.A04(HDi.A0O[(int) (jA0F2 & 63)], B6A.A03(jA0F2), B6A.A02(jA0F2), B6A.A01(jA0F2), 0.1f), jA04);
            long jA0F3 = C06G.A0F(bfm, akh);
            long jA042 = HxS.A04(HDi.A0O[(int) (jA0F3 & 63)], B6A.A03(jA0F3), B6A.A02(jA0F3), B6A.A01(jA0F3), 0.02f);
            long jA0F4 = C06G.A0F(bfm, akh);
            AuraImageKt.AuraImage(auraDrawableSourceResource, C3U4.A09(C1b8.A03(C10G.A07(AbstractC04540eo.A00(bRgA00, null, 9.0f, 6, HxS.A04(HDi.A0O[(int) (jA0F4 & 63)], B6A.A03(jA0F4), B6A.A02(jA0F4), B6A.A01(jA0F4), 0.02f), jA042), 60.0f), C1D8.A00(22.0f), AnonymousClass001.A0f(bfm, akh).card), 10.0f), null, (C7197Ei9) objAaT, false, false, null, false, null, bfm, 384, 496);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116361(bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchDevicePairingBottomSheets(com.facebook.aura.devices.pairing.HatchDevicePairingUiState r26, com.facebook.aura.devices.pairing.HatchDevicePairingActions r27, com.facebook.aura.devices.pairing.HatchDevicePairingStrings r28, X.BRg r29, boolean r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, X.BFM r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.HatchDevicePairingBottomSheets(com.facebook.aura.devices.pairing.HatchDevicePairingUiState, com.facebook.aura.devices.pairing.HatchDevicePairingActions, com.facebook.aura.devices.pairing.HatchDevicePairingStrings, X.BRg, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void HatchDevicePairingContinueButton(Function0<Unit> function0, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(1819108766);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                z2 = true;
            }
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string.device_pairing_continue), null, C3U4.A0C(C3U4.A0B(AnonymousClass001.A0R(bRg2), 34.0f, 0.0f), 0.0f, 12.0f, 0.0f, 18.0f), AuraButtonKt.toStyle(AuraButtonStyle.PRIMARY, null, bfm, 6, 1), AuraButtonSize.LARGE, null, false, false, z2, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, ((iA0T << 24) & 1879048192) | 196608, (iA0T << 12) & 57344, 0, 134200773);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116381(function0, z2, bRg2, i, i2);
        }
    }

    public static final void HatchDevicePairingFailureDialog(HatchDevicePairingDialog hatchDevicePairingDialog, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-306872950);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, hatchDevicePairingDialog) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AnonymousClass001.A0t(bfm, str, getTitleRes(hatchDevicePairingDialog)), AbstractC2271BQs.A01(bfm, getBodyRes(hatchDevicePairingDialog)), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C116391(AbstractC2271BQs.A01(bfm, R.string.device_pairing_ok), function0), 477110873), function0, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass001.A05(iA08 << 12, ((iA08 >> 9) & 14) | 196608), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116402(hatchDevicePairingDialog, str, function0, bRg2, i, i2);
        }
    }

    public static final void HatchDevicePairingFooter(Function0<Unit> function0, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        boolean z3 = z;
        boolean z4 = z2;
        BRg bRgA0P = bRg;
        bfm.AgG(-253718240);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z3);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z4);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                z3 = true;
            }
            if (i4 != 0) {
                z4 = false;
            }
            if (i5 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0P);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (z4) {
                bfm.AgE(866218271);
                AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
                HatchDeviceLinkTermsOfServiceLine(C3U4.A04(BRg.A00, 12.0f), bfm, 6, 0);
            } else {
                bfm.AgE(866323020);
            }
            BBI.A0R(bbi, false);
            HatchDevicePairingContinueButton(function0, z3, null, bfm, iA0T & 126, 4);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116412(function0, z3, z4, bRgA0P, i, i2);
        }
    }

    public static final void HatchDeviceProvisioningConnectingSheet(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1945397327);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDevicePairingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDevicePairingActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, hatchDevicePairingStrings);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        boolean z2 = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            BRg bRgA0U = AnonymousClass001.A0U(bRg2, ((int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)) / 2);
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig(AbstractC2271BQs.A01(bfm, R.string.device_pairing_connect_a_device), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            if ((iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions))) {
                z2 = true;
            }
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$HatchDeviceProvisioningConnectingSheet$1$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, bRgA0U, null, auraBottomSheetHeaderConfig, null, null, (Function0) objAaT, z, false, false, null, B1V.A00(bfm, new C116422(hatchDevicePairingUiState, hatchDevicePairingStrings), -561039668), bfm, ((iA05 << 12) & 29360128) | 6, 48, 1844);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116433(hatchDevicePairingUiState, hatchDevicePairingActions, hatchDevicePairingStrings, z, bRg2, i, i2);
        }
    }

    public static final void HatchDeviceSkipWifiButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(361602021);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
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
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string.device_pairing_wifi_skip), null, C3U4.A0C(C3U4.A0B(AnonymousClass001.A0R(bRg2), 34.0f, 0.0f), 0.0f, 12.0f, 0.0f, 18.0f), AuraButtonKt.toStyle(AuraButtonStyle.SECONDARY, null, bfm, 6, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116441(function0, bRg2, i, i2);
        }
    }

    public static final void LinkButtonConfirmationBottomSheet(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, HatchDevicePairingStrings hatchDevicePairingStrings, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(576520956);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchDevicePairingUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchDevicePairingActions, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, hatchDevicePairingStrings);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
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
            String pairingTargetName = hatchDevicePairingUiState.getPairingTargetName();
            if (pairingTargetName == null) {
                bfm.AgE(-14133840);
                int i4 = hatchDevicePairingStrings.fallbackDeviceNameRes;
                bfm.AgE(2138870651);
                pairingTargetName = AbstractC2271BQs.A01(bfm, i4);
                AnonymousClass002.A19(bfm);
            } else {
                bfm.AgE(-14134677);
            }
            AnonymousClass001.A1D(bfm);
            String strA0t = AnonymousClass001.A0t(bfm, pairingTargetName, R.string.device_pairing_link_button_confirm_title);
            BRg bRgA0U = AnonymousClass001.A0U(bRg2, ((int) AuraLayoutSizeKt.auraLayoutHeight(bfm, 0)) / 2);
            boolean zA65 = bfm.A65(strA0t);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$1$1(strA0t);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0U, objAaT, false);
            AuraBottomSheetHeaderConfig.AccessoryButton.Companion companion = AuraBottomSheetHeaderConfig.AccessoryButton.Companion;
            int i5 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z2 = i5 == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT2 = bfm.AaT();
            if (z2 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$2$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT2);
            }
            AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = new AuraBottomSheetHeaderConfig("", null, companion.back((Function0) objAaT2), null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null);
            B1U b1uA00 = B1V.A00(bfm, new C116453(hatchDevicePairingActions, hatchDevicePairingUiState), -853828701);
            boolean z3 = i5 == 32 || ((iA05 & 64) != 0 && bfm.A67(hatchDevicePairingActions));
            Object objAaT3 = bfm.AaT();
            if (z3 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchDevicePairingBottomSheetsKt$LinkButtonConfirmationBottomSheet$4$1(hatchDevicePairingActions);
                bfm.Ai0(objAaT3);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRgA0Y, null, auraBottomSheetHeaderConfig, b1uA00, null, (Function0) objAaT3, z, false, false, null, B1V.A00(bfm, new C116465(hatchDevicePairingUiState, strA0t), -1037018529), bfm, ((iA05 << 12) & 29360128) | RuntimeInternals.IOPRIO_BACKGROUND, 48, 1829);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(hatchDevicePairingUiState, hatchDevicePairingActions, hatchDevicePairingStrings, z, bRg2, i, i2);
        }
    }

    public static final void PairingCredentialRow(String str, G0U<? super String, Unit> g0u, String str2, BRg bRg, boolean z, C19h c19h, AuJ auJ, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean z2 = z;
        C19h c19h2 = c19h;
        AuJ auJ2 = auJ;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        bfm.AgG(-942317952);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str2);
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
            iA0d |= AnonymousClass004.A0r(bfm, z2);
        }
        int i5 = i2 & 32;
        int iA0i = 196608;
        if (i5 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, c19h2);
            iA0d |= iA0i;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, auJ2);
            iA0d |= iA0j;
        }
        int i7 = i2 & 128;
        int iA0a = 12582912;
        if (i7 != 0) {
            iA0d |= iA0a;
        } else if ((12582912 & i) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0v2);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = false;
            }
            if (i5 != 0) {
                c19h2 = C19i.A00;
            }
            if (i6 != 0) {
                auJ2 = AuJ.A04;
            }
            if (i7 != 0) {
                g0v2 = null;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0V = AnonymousClass001.A0V(C3U4.A02(bRg2.then(c1062ATq)), 32.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i8 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0V);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i8);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            BRg bRgAiP = C90m.A00.AiP(BRg.A00, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A0B, false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA01, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (str.length() == 0) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), AnonymousClass006.A0k(bfm, 956662543).bodyRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 6) & 14, 0, 16370);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(956821356);
                BBI.A0R(bbi, false);
            }
            boolean zA1K = AnonymousClass004.A1K(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$PairingCredentialRow$1$1$1$1(str2);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq, objAaT, false);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AbstractC1874Aso.A03(null, null, auJ2, bfm, bRgA0Y, new C1326AhD(AnonymousClass001.A0f(bfm, akh).textInput.cursorColor), C1822Arm.A00(null, c1822ArmA0T, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C06G.A0L(bfm, akh), 0L, 0L, 0L), c19h2, str, g0u, null, null, 0, 0, AnonymousClass001.A0A(iA0d, (iA0d & 14) | 100663296 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)) | (3670016 & iA0d), (iA0d >> 12) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 46728, false, z2, true);
            BBI.A0R(bbi, true);
            if (g0v2 != null) {
                bfm.AgE(-1608134998);
                AnonymousClass003.A13(bfm, g0v2, iA0d >> 21);
            } else {
                bfm.AgE(-1608108090);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116472(str, g0u, str2, bRg2, z2, c19h2, auJ2, g0v2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PairingDeviceRow(java.lang.String r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.BRg r35, boolean r36, boolean r37, com.facebook.aura.devices.intf.ClaimedDeviceRow r38, com.facebook.aura.devices.intf.DeviceRowBadge r39, X.BFM r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt.PairingDeviceRow(java.lang.String, kotlin.jvm.functions.Function0, X.BRg, boolean, boolean, com.facebook.aura.devices.intf.ClaimedDeviceRow, com.facebook.aura.devices.intf.DeviceRowBadge, X.BFM, int, int):void");
    }

    public static final void PairingScanAgainLink(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1382455472);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string.device_pairing_scan_again), C0v5.A04(bRg2, new C1YD(0), null, function0, true), C06G.A07(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116491(function0, bRg2, i, i2);
        }
    }

    public static final void SavedNetworksHeader(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(840470100);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string.device_pairing_wifi_saved), C3U4.A07(AnonymousClass001.A0R(bRg2), 16.0f), C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116511(bRg2, i, i2);
        }
    }

    public static final void WifiListRow(String str, Function0<Unit> function0, BRg bRg, Integer num, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        Integer num2 = num;
        bfm.AgG(-921146918);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, num2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            if (i4 != 0) {
                num2 = null;
            }
            BRg bRgA0V = AnonymousClass001.A0V(C3U4.A02(C0v5.A05(AnonymousClass001.A0R(bRgA0Q), null, function0, true)), 32.0f);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0V);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            long jA0C = C06G.A0C(bfm);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, true), jA0C, c1822ArmA0T, null, null, null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            if (num2 != null) {
                bfm.AgE(-886957701);
                BRg bRgA07 = C10G.A07(bs0, 32.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA07);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, num2.intValue(), (iA0d >> 9) & 14), AuraIconSize.X_SMALL, null, 0L, null, bfm, AnonymousClass001.A04(), 49);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-886703036);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116522(str, function0, bRgA0Q, num2, i, i2);
        }
    }

    public static final int getTitleRes(HatchDevicePairingDialog hatchDevicePairingDialog) {
        return hatchDevicePairingDialog == HatchDevicePairingDialog.BUTTON_PRESS_TIMED_OUT ? R.string.device_pairing_no_button_press_title : R.string.device_pairing_couldnt_connect_title;
    }

    public static final void PairingStatusCard(C07C c07c, String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(-534286059);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            boolean zA1D = AnonymousClass003.A1D(iA0d) | AnonymousClass003.A1C(iA0d) | ((iA0d & 7168) == 2048);
            Object objAaT = bfm.AaT();
            if (zA1D || objAaT == C78N.A00) {
                objAaT = new HatchDevicePairingBottomSheetsKt$PairingStatusCard$1$1(bRg, str, g0v);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0p(c07c, bfm, objAaT, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C116502(c07c, str, bRg, g0v, i, i2);
        }
    }

    public static final int getBodyRes(HatchDevicePairingDialog hatchDevicePairingDialog) {
        switch (hatchDevicePairingDialog.ordinal()) {
            case 0:
            case 1:
                return R.string.device_pairing_try_again_later;
            case 2:
                return R.string.device_pairing_setup_handoff_failed;
            case 3:
                return R.string.device_pairing_sdk_token_missing;
            case 4:
                return R.string.device_pairing_sdk_token_invalid;
            case 5:
                return R.string.device_pairing_sdk_token_device_limit_reached;
            case 6:
                return R.string.device_pairing_gadget_firmware_update_required;
            case 7:
                return R.string.device_pairing_no_button_press_body;
            case 8:
                return R.string.device_pairing_link_firmware_update_required;
            case 9:
                return R.string.device_pairing_link_cvm_unsupported;
            case 10:
                return R.string.device_pairing_link_device_id_in_use;
            case 11:
                return R.string.device_pairing_link_device_busy;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String pairingDisplayLabel(HatchDeviceBleState hatchDeviceBleState, BFM bfm, int i) {
        int i2;
        switch (hatchDeviceBleState.ordinal()) {
            case 0:
                bfm.AgE(1860264136);
                i2 = R.string.device_pairing_status_idle;
                break;
            case 1:
                bfm.AgE(1860267148);
                i2 = R.string.device_pairing_status_scanning;
                break;
            case 2:
                bfm.AgE(1860270185);
                i2 = R.string.device_pairing_status_found;
                break;
            case 3:
                bfm.AgE(1860273614);
                i2 = R.string.device_pairing_status_connecting;
                break;
            case 4:
                bfm.AgE(1860277528);
                i2 = R.string.device_pairing_status_discovering_services;
                break;
            case 5:
                bfm.AgE(1860280941);
                i2 = R.string.device_pairing_status_connected;
                break;
            case 6:
                bfm.AgE(1860284718);
                i2 = R.string.device_pairing_connection_failed;
                break;
            case 7:
                bfm.AgE(1860288276);
                i2 = R.string.device_pairing_status_no_devices_found;
                break;
            case 8:
                bfm.AgE(1860292145);
                i2 = R.string.device_pairing_status_bluetooth_off;
                break;
            default:
                throw AnonymousClass005.A0k(bfm, 1860263538);
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    public static final int wifiSignalIcon(boolean z) {
        return z ? R.drawable.meta_icons_2_0_vector_signalfanhi_outline_24_wght400 : R.drawable.meta_icons_2_0_vector_signalfanbadgelock_outline_24_wght400;
    }
}
