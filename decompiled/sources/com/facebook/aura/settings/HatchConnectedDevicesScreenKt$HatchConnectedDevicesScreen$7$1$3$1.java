package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.nodes.json.NodeListEntry;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$3$1 extends AbstractC7559F3s implements G0U<NodeListEntry, Boolean> {
    public final /* synthetic */ C1BO<ConnectedDevicesScreenState> $screenState$delegate;

    @Override // X.G0U
    public final Boolean invoke(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        return Boolean.valueOf(this.$screenState$delegate.getValue().removableDeviceNodeIds.contains(nodeListEntry.nodeId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$3$1(C1BO<ConnectedDevicesScreenState> c1bo) {
        super(1);
        this.$screenState$delegate = c1bo;
    }
}
