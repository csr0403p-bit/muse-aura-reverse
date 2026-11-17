package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2k;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$screenState$1", f = "HatchConnectedDevicesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectedDevicesViewModel$screenState$1 extends AbstractC07127nr implements G2k<ConnectedDevicesUiState, List<? extends ConnectedDeviceRow>, Integer, HomeLinkOffer, HtJ<? super ConnectedDevicesScreenState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ HatchConnectedDevicesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesViewModel$screenState$1(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, HtJ<? super HatchConnectedDevicesViewModel$screenState$1> htJ) {
        super(5, htJ);
        this.this$0 = hatchConnectedDevicesViewModel;
    }

    public final Object invoke(ConnectedDevicesUiState connectedDevicesUiState, List<ConnectedDeviceRow> list, int i, HomeLinkOffer homeLinkOffer, HtJ<? super ConnectedDevicesScreenState> htJ) {
        HatchConnectedDevicesViewModel$screenState$1 hatchConnectedDevicesViewModel$screenState$1 = new HatchConnectedDevicesViewModel$screenState$1(this.this$0, htJ);
        hatchConnectedDevicesViewModel$screenState$1.L$0 = connectedDevicesUiState;
        hatchConnectedDevicesViewModel$screenState$1.L$1 = list;
        hatchConnectedDevicesViewModel$screenState$1.L$2 = homeLinkOffer;
        return hatchConnectedDevicesViewModel$screenState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ConnectedDevicesUiState connectedDevicesUiState = (ConnectedDevicesUiState) this.L$0;
        List list = (List) this.L$1;
        HomeLinkOffer homeLinkOffer = (HomeLinkOffer) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = this.this$0;
        return hatchConnectedDevicesViewModel.screenStateOf(connectedDevicesUiState, hatchConnectedDevicesViewModel.visibleConnectedDeviceRows(list), homeLinkOffer);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Object invoke(ConnectedDevicesUiState connectedDevicesUiState, List<? extends ConnectedDeviceRow> list, Integer num, HomeLinkOffer homeLinkOffer, HtJ<? super ConnectedDevicesScreenState> htJ) {
        return invoke(connectedDevicesUiState, (List<ConnectedDeviceRow>) list, AnonymousClass001.A0F(num), homeLinkOffer, htJ);
    }
}
