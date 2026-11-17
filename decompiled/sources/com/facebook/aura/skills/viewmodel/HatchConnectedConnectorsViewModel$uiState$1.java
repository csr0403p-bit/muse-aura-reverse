package com.facebook.aura.skills.viewmodel;

import X.AHD;
import X.F2X;
import X.G2j;
import X.HtJ;
import com.facebook.aura.agentpermission.LocalDeviceConnector;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.viewmodel.HatchConnectedConnectorsViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectedConnectorsViewModel$uiState$1 extends F2X implements G2j {
    public HatchConnectedConnectorsViewModel$uiState$1(Object obj) {
        super(4, obj, HatchConnectedConnectorsViewModel.class, "present", "present(Lcom/facebook/aura/skills/viewmodel/HatchConnectedConnectorsViewModel$LoadState;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)Lcom/facebook/aura/skills/viewmodel/ConnectedConnectorsUiState;", 4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((HatchConnectedConnectorsViewModel) this.receiver).present((HatchConnectedConnectorsViewModel.LoadState) obj, (AHD) obj2, (AHD) obj3);
    }

    public final Object invoke(HatchConnectedConnectorsViewModel.LoadState loadState, AHD<Skill> ahd, AHD<LocalDeviceConnector> ahd2, HtJ<? super ConnectedConnectorsUiState> htJ) {
        return ((HatchConnectedConnectorsViewModel) this.receiver).present(loadState, ahd, ahd2);
    }
}
