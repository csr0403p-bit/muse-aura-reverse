package com.facebook.aura.devices.pairing;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AuJ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C07C;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C19h;
import X.C19i;
import X.C1YD;
import X.C1YP;
import X.C2VU;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ HatchDevicePairingActions $actions;
    public final /* synthetic */ boolean $connecting;
    public final /* synthetic */ MutableState<Boolean> $passwordVisible;
    public final /* synthetic */ HatchDeviceWiFiNetwork $selectedNetwork;
    public final /* synthetic */ boolean $showPassword;
    public final /* synthetic */ String $ssid;
    public final /* synthetic */ HatchDevicePairingUiState $state;

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $connecting;
        public final /* synthetic */ HatchDeviceWiFiNetwork $selectedNetwork;
        public final /* synthetic */ String $ssid;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ HatchDeviceWiFiNetwork $selectedNetwork;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork) {
                super(2);
                this.$selectedNetwork = hatchDeviceWiFiNetwork;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                boolean z = true;
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    BRg bRgA07 = C10G.A07(BRg.A00, 32.0f);
                    Alignment alignment = C2VU.A09;
                    HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork = this.$selectedNetwork;
                    InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA07);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                    if (hatchDeviceWiFiNetwork == null || !hatchDeviceWiFiNetwork.isOpen()) {
                        z = false;
                    }
                    AnonymousClass007.A0x(bfm, BOf.A00(bfm, HatchDevicePairingBottomSheetsKt.wifiSignalIcon(z), 0), AuraIconSize.X_SMALL);
                    BBI.A0R(bbi, true);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HatchDevicePairingActions hatchDevicePairingActions, boolean z, HatchDevicePairingUiState hatchDevicePairingUiState, HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork) {
            super(3);
            this.$ssid = str;
            this.$actions = hatchDevicePairingActions;
            this.$connecting = z;
            this.$state = hatchDevicePairingUiState;
            this.$selectedNetwork = hatchDeviceWiFiNetwork;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            boolean z = false;
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                String str = this.$ssid;
                boolean zA67 = bfm.A67(this.$actions);
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$1$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) objAaT;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_wifi_ssid_label);
                if (this.$connecting || !this.$state.isManualWifiEntry()) {
                    z = true;
                }
                HatchDevicePairingBottomSheetsKt.PairingCredentialRow(str, g0u, strA01, null, z, null, new AuJ(false, -1, 0, -1), B1V.A00(bfm, new AnonymousClass2(this.$selectedNetwork), 347287128), bfm, 14155776, 40);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchDevicePairingActions $actions;
        public final /* synthetic */ boolean $connecting;
        public final /* synthetic */ MutableState<Boolean> $passwordVisible;
        public final /* synthetic */ HatchDevicePairingUiState $state;

        /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$2$2, reason: invalid class name and collision with other inner class name */
        public final class C01382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ MutableState<Boolean> $passwordVisible;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01382(MutableState<Boolean> mutableState) {
                super(2);
                this.$passwordVisible = mutableState;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                String strA0s;
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    BRg bRgA07 = C10G.A07(BRg.A00, 32.0f);
                    C1YD c1yd = new C1YD(0);
                    MutableState<Boolean> mutableState = this.$passwordVisible;
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = new HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$2$2$1$1(mutableState);
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgA04 = C0v5.A04(bRgA07, c1yd, null, (Function0) objAaT, true);
                    Alignment alignment = C2VU.A09;
                    MutableState<Boolean> mutableState2 = this.$passwordVisible;
                    InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA04);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
                    boolean zA0A = MutableState.A0A((MutableState) mutableState2);
                    int i2 = R.drawable.aura_icon_eye;
                    if (zA0A) {
                        i2 = R.drawable.ic_eye_off;
                    }
                    AVy aVyA00 = BOf.A00(bfm, i2, 0);
                    if (MutableState.A0A((MutableState) mutableState2)) {
                        bfm.AgE(1343841684);
                        strA0s = AnonymousClass001.A0s(bfm, bbi, R.string.device_pairing_password_hide);
                    } else {
                        bfm.AgE(1343965684);
                        strA0s = AnonymousClass001.A0s(bfm, bbi, R.string.device_pairing_password_show);
                    }
                    AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, AuraIconSize.X_SMALL, strA0s, 0L, null, bfm, AnonymousClass001.A03(), 49);
                    BBI.A0R(bbi, true);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchDevicePairingUiState hatchDevicePairingUiState, HatchDevicePairingActions hatchDevicePairingActions, boolean z, MutableState<Boolean> mutableState) {
            super(3);
            this.$state = hatchDevicePairingUiState;
            this.$actions = hatchDevicePairingActions;
            this.$connecting = z;
            this.$passwordVisible = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C19h c1yp;
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                String wifiPassword = this.$state.getWifiPassword();
                boolean zA67 = bfm.A67(this.$actions);
                HatchDevicePairingActions hatchDevicePairingActions = this.$actions;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1$2$1$1(hatchDevicePairingActions);
                    bfm.Ai0(objAaT);
                }
                G0U g0u = (G0U) objAaT;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string.device_pairing_password_label);
                boolean z = this.$connecting;
                if (MutableState.A0A((MutableState) this.$passwordVisible)) {
                    c1yp = C19i.A00;
                } else {
                    c1yp = new C1YP();
                }
                HatchDevicePairingBottomSheetsKt.PairingCredentialRow(wifiPassword, g0u, strA01, null, z, c1yp, new AuJ(null, -1, 7, -1), B1V.A00(bfm, new C01382(this.$passwordVisible), -1874724899), bfm, 14155776, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$ssid, this.$actions, this.$connecting, this.$state, this.$selectedNetwork), 649474983);
        if (this.$showPassword) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$state, this.$actions, this.$connecting, this.$passwordVisible), -1533680020);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingBottomSheetsKt$EnterPasswordBottomSheet$4$1$1$1(boolean z, String str, HatchDevicePairingActions hatchDevicePairingActions, boolean z2, HatchDevicePairingUiState hatchDevicePairingUiState, HatchDeviceWiFiNetwork hatchDeviceWiFiNetwork, MutableState<Boolean> mutableState) {
        super(1);
        this.$showPassword = z;
        this.$ssid = str;
        this.$actions = hatchDevicePairingActions;
        this.$connecting = z2;
        this.$state = hatchDevicePairingUiState;
        this.$selectedNetwork = hatchDeviceWiFiNetwork;
        this.$passwordVisible = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
