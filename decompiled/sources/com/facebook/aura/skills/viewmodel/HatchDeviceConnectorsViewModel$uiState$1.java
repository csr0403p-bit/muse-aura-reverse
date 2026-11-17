package com.facebook.aura.skills.viewmodel;

import X.F2X;
import X.G0W;
import X.HtJ;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchDeviceConnectorsViewModel$uiState$1 extends F2X implements G0W {
    public HatchDeviceConnectorsViewModel$uiState$1(Object obj) {
        super(3, obj, HatchDeviceConnectorsViewModel.class, "present", "present(Ljava/util/List;Ljava/util/Set;)Lcom/facebook/aura/skills/viewmodel/DeviceConnectorsUiState;", 4);
    }

    public final Object invoke(List<LocalDeviceConnector> list, Set<String> set, HtJ<? super DeviceConnectorsUiState> htJ) {
        return ((HatchDeviceConnectorsViewModel) this.receiver).present(list, set);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return ((HatchDeviceConnectorsViewModel) this.receiver).present((List) obj, (Set) obj2);
    }
}
