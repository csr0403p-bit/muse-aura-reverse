package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDeviceRowsSectionKt$ConnectedDeviceRowCard$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectedDeviceRow $row;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDeviceRowsSectionKt$ConnectedDeviceRowCard$2$1(AuraNavigator auraNavigator, ConnectedDeviceRow connectedDeviceRow) {
        super(0);
        this.$navigator = auraNavigator;
        this.$row = connectedDeviceRow;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate(this.$row.target, false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
