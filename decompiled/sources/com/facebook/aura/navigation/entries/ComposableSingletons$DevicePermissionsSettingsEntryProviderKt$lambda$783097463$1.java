package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BQN;
import X.C0861A6i;
import X.C1BO;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0W;
import android.os.Build;
import androidx.activity.ComponentActivity;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.DevicePermissionsSettingsScreenKey;
import com.facebook.aura.settings.ConnectedDevicesUiState;
import com.facebook.aura.settings.HatchConnectedDevicesViewModel;
import com.facebook.aura.settings.HatchDeviceDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$DevicePermissionsSettingsEntryProviderKt$lambda$783097463$1 extends AbstractC7559F3s implements G0W<DevicePermissionsSettingsScreenKey, BFM, Integer, Unit> {
    public static final ComposableSingletons$DevicePermissionsSettingsEntryProviderKt$lambda$783097463$1 INSTANCE = new ComposableSingletons$DevicePermissionsSettingsEntryProviderKt$lambda$783097463$1();

    public ComposableSingletons$DevicePermissionsSettingsEntryProviderKt$lambda$783097463$1() {
        super(3);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey, BFM bfm, Integer num) {
        invoke(devicePermissionsSettingsScreenKey, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(DevicePermissionsSettingsScreenKey devicePermissionsSettingsScreenKey, BFM bfm, int i) {
        ConnectedDevicesUiState.Loaded loaded;
        String str;
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        HatchConnectedDevicesViewModel.Factory factory = new HatchConnectedDevicesViewModel.Factory(AnonymousClass002.A0H(bfm), AnonymousClass002.A0h(bfm));
        ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
        HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = (HatchConnectedDevicesViewModel) BQN.A00(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchConnectedDevicesViewModel.class));
        ConnectedDevicesUiState connectedDevicesUiState = (ConnectedDevicesUiState) C1BO.A07(bfm, hatchConnectedDevicesViewModel.uiState);
        if ((connectedDevicesUiState instanceof ConnectedDevicesUiState.Loaded) && (loaded = (ConnectedDevicesUiState.Loaded) connectedDevicesUiState) != null && (str = loaded.localNodeId) != null) {
            bfm.AgE(-1005340659);
            String strA0U = FGI.A0U(Build.MANUFACTURER, InviteCodeScratcherKt.CODE_SEPARATOR, Build.MODEL);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ComposableSingletons$DevicePermissionsSettingsEntryProviderKt$lambda$783097463$1$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA672 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new ComposableSingletons$DevicePermissionsSettingsEntryProviderKt$lambda$783097463$1$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            HatchDeviceDetailsScreenKt.HatchDeviceDetailsScreen(str, strA0U, function0, (G0U) objAaT2, null, null, hatchConnectedDevicesViewModel, bfm, HatchConnectedDevicesViewModel.$stable << 18, 48);
        } else {
            bfm.AgE(-1004973557);
        }
        AnonymousClass001.A1D(bfm);
    }
}
