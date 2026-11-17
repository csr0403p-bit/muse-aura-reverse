package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.nodes.json.NodeListEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$7$1$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ NodeListEntry $device;
    public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$7$1$2$1$1(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, NodeListEntry nodeListEntry) {
        super(0);
        this.$viewModel = hatchConnectedDevicesViewModel;
        this.$device = nodeListEntry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.initiateUnpair(this.$device);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
