package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.BFM;
import X.C78N;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.key.PermissionDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class LocalDeviceConnectorPermissionControllerKt {
    public static final G0U<LocalDeviceConnector, Unit> rememberLocalDeviceConnectorPermissionController(Context context, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass003.A0u(context, function0);
        G0U<PermissionDestination, Unit> g0uRememberDevicePermissionManageController = DevicePermissionManageControllerKt.rememberDevicePermissionManageController(function0, null, bfm, (i >> 3) & 14, 2);
        boolean zA1K = AnonymousClass003.A1K(bfm, context, g0uRememberDevicePermissionManageController);
        Object objAaT = bfm.AaT();
        if (zA1K || objAaT == C78N.A00) {
            objAaT = new LocalDeviceConnectorPermissionControllerKt$rememberLocalDeviceConnectorPermissionController$1$1(g0uRememberDevicePermissionManageController, context);
            bfm.Ai0(objAaT);
        }
        return (G0U) objAaT;
    }
}
