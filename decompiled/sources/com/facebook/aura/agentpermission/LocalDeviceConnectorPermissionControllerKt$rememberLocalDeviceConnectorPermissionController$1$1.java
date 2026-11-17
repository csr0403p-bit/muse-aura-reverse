package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.key.PermissionDestination;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class LocalDeviceConnectorPermissionControllerKt$rememberLocalDeviceConnectorPermissionController$1$1 extends AbstractC7559F3s implements G0U<LocalDeviceConnector, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r1 = X.AbstractC0878AGe.A0G(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(com.facebook.aura.agentpermission.LocalDeviceConnector r6) {
        /*
            r5 = this;
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            java.util.List r4 = com.facebook.aura.agentpermission.LocalDeviceConnectorKt.devicePermissionDestinations(r6)
            android.content.Context r3 = r5.$context
            java.util.Iterator r2 = r4.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.navigation.key.PermissionDestination r0 = (com.facebook.aura.navigation.key.PermissionDestination) r0
            boolean r0 = com.facebook.aura.agentpermission.DevicePermissionStateKt.isDevicePermissionGranted(r3, r0)
            if (r0 != 0) goto Le
            if (r1 != 0) goto L29
        L23:
            java.lang.Object r1 = X.AbstractC0878AGe.A0G(r4)
            if (r1 == 0) goto L2e
        L29:
            X.G0U<com.facebook.aura.navigation.key.PermissionDestination, kotlin.Unit> r0 = r5.$managePermission
            r0.invoke(r1)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.LocalDeviceConnectorPermissionControllerKt$rememberLocalDeviceConnectorPermissionController$1$1.invoke2(com.facebook.aura.agentpermission.LocalDeviceConnector):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocalDeviceConnectorPermissionControllerKt$rememberLocalDeviceConnectorPermissionController$1$1(G0U<? super PermissionDestination, Unit> g0u, Context context) {
        super(1);
        this.$managePermission = g0u;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LocalDeviceConnector localDeviceConnector) {
        invoke2(localDeviceConnector);
        return Unit.INSTANCE;
    }
}
