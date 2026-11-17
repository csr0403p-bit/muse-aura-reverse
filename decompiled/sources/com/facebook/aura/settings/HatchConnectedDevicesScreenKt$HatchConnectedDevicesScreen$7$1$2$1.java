package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$2$1 extends C7438Evz implements G0U<NodeListEntry, Unit> {
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$2$1(Object obj) {
        super(1, obj, HatchConnectedDevicesViewModel.class, "dismissDevice", "dismissDevice(Lcom/facebook/aura/nodes/json/NodeListEntry;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NodeListEntry nodeListEntry) {
        ((HatchConnectedDevicesViewModel) AnonymousClass006.A0o(nodeListEntry, this)).dismissDevice(nodeListEntry);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NodeListEntry nodeListEntry) {
        invoke2(nodeListEntry);
        return Unit.INSTANCE;
    }
}
