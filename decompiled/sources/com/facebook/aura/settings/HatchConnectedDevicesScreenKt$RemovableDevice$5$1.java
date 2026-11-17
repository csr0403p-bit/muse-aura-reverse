package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$RemovableDevice$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRemoveConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$RemovableDevice$5$1(NodeListEntry nodeListEntry, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$device = nodeListEntry;
        this.$showMenu$delegate = mutableState;
        this.$showRemoveConfirmation$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchConnectedDevicesScreenKt.logRemoveDeviceClick(this.$device.nodeId);
        MutableState.A09(false, this.$showMenu$delegate);
        MutableState.A09(true, this.$showRemoveConfirmation$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
