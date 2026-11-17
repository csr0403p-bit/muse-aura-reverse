package com.facebook.aura.devices.link;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C1BO;
import X.C3cG;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.devices.pairing.HatchDevicePairingSuccessAction;
import com.facebook.aura.devices.pairing.HatchDevicePairingSuccessHandler;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.settings.HatchConnectedDevicesViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchConnectedDevicesViewModel $devicesViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C1BO<HatchDevicePairingViewState> $state$delegate;
    public final /* synthetic */ HatchDevicePairingSuccessHandler $successHandler;
    public final /* synthetic */ MutableState<Boolean> $terminalNavigationHandled$delegate;
    public final /* synthetic */ HatchDevicePairingViewModel $viewModel;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchDevicePairingSuccessAction.values().length];
            try {
                AnonymousClass002.A13(HatchDevicePairingSuccessAction.OPEN_SUCCESS_DESTINATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchDevicePairingSuccessAction.RETURN_TO_CALLER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$7$1(HatchDevicePairingSuccessHandler hatchDevicePairingSuccessHandler, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, HatchDevicePairingViewModel hatchDevicePairingViewModel, AuraNavigator auraNavigator, C1BO<HatchDevicePairingViewState> c1bo, MutableState<Boolean> mutableState) {
        super(0);
        this.$successHandler = hatchDevicePairingSuccessHandler;
        this.$devicesViewModel = hatchConnectedDevicesViewModel;
        this.$viewModel = hatchDevicePairingViewModel;
        this.$navigator = auraNavigator;
        this.$state$delegate = c1bo;
        this.$terminalNavigationHandled$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchDevicePairingSuccessAction hatchDevicePairingSuccessActionConsume = this.$successHandler.consume(this.$state$delegate.getValue().provisionedCommunityDevice);
        if (hatchDevicePairingSuccessActionConsume != null) {
            MutableState.A09(true, this.$terminalNavigationHandled$delegate);
            this.$devicesViewModel.refreshDevicesAfterPairing();
            this.$viewModel.dismissPairingFlow();
            int iOrdinal = hatchDevicePairingSuccessActionConsume.ordinal();
            if (iOrdinal == 0) {
                this.$navigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                this.$navigator.dismissBottomSheetStack(Integer.MAX_VALUE);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
