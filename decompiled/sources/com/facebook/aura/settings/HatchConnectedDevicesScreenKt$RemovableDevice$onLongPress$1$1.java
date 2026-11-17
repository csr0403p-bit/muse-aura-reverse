package com.facebook.aura.settings;

import X.AbstractC7559F3s;
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
public final class HatchConnectedDevicesScreenKt$RemovableDevice$onLongPress$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$RemovableDevice$onLongPress$1$1(NodeListEntry nodeListEntry, MutableState<Boolean> mutableState) {
        super(0);
        this.$device = nodeListEntry;
        this.$showMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logLongPress(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICES, HatchComponent.DEVICE_ROW, this.$device.nodeId, null);
        MutableState.A09(true, this.$showMenu$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
