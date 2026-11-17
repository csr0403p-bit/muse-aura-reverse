package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$6 extends AbstractC7559F3s implements Function0<Boolean> {
    public static final LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$6 INSTANCE = new LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$6();

    public LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$6() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(LocalDeviceConnectorKt.isNodesMediaEnabled());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        return Boolean.valueOf(LocalDeviceConnectorKt.isNodesMediaEnabled());
    }
}
