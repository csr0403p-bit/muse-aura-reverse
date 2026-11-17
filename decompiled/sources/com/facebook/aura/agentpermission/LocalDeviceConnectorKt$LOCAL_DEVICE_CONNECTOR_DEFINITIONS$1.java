package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.assist.status.HatchDefaultAssistantStatus;

/* loaded from: classes3.dex */
public final class LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$1 extends AbstractC7559F3s implements G0U<Context, Boolean> {
    public static final LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$1 INSTANCE = new LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$1();

    public LocalDeviceConnectorKt$LOCAL_DEVICE_CONNECTOR_DEFINITIONS$1() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(Context context) {
        C7384Etj.A0Y(context, 0);
        return Boolean.valueOf(HatchDefaultAssistantStatus.INSTANCE.isDefaultAssistant(context));
    }
}
