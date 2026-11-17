package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$RemovableDevice$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ G0U<NodeListEntry, Unit> $onRemoveDevice;
    public final /* synthetic */ MutableState<Boolean> $showRemoveConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConnectedDevicesScreenKt$RemovableDevice$7$1(NodeListEntry nodeListEntry, G0U<? super NodeListEntry, Unit> g0u, MutableState<Boolean> mutableState) {
        super(0);
        this.$device = nodeListEntry;
        this.$onRemoveDevice = g0u;
        this.$showRemoveConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showRemoveConfirmation$delegate);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.SETTINGS_DEVICE_UNREGISTER, this.$device.nodeId, null, null);
        this.$onRemoveDevice.invoke(this.$device);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
