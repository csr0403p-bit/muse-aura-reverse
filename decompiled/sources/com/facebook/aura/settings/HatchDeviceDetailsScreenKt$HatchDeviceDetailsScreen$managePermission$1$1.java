package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$managePermission$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$managePermission$1$1(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel) {
        super(0);
        this.$viewModel = hatchConnectedDevicesViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.refreshPermissionStates();
    }
}
