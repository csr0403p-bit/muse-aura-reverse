package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C3cG;
import com.facebook.aura.commands.core.TelephonyFeatureUtils;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$2 extends AbstractC7559F3s implements Function0<Boolean> {
    public static final LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$2 INSTANCE = new LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$2();

    public LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(TelephonyFeatureUtils.INSTANCE.hasMessaging(C3cG.A06()));
    }
}
