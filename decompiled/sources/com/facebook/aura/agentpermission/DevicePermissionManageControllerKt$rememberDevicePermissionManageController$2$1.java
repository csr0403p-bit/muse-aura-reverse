package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LocalConnectorConsentSheetKey;
import com.facebook.aura.navigation.key.PermissionDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class DevicePermissionManageControllerKt$rememberDevicePermissionManageController$2$1 extends AbstractC7559F3s implements G0U<PermissionDestination, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $launch;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: com.facebook.aura.agentpermission.DevicePermissionManageControllerKt$rememberDevicePermissionManageController$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ PermissionDestination $destination;
        public final /* synthetic */ G0U<PermissionDestination, Unit> $launch;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super PermissionDestination, Unit> g0u, PermissionDestination permissionDestination) {
            super(0);
            this.$launch = g0u;
            this.$destination = permissionDestination;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$launch.invoke(this.$destination);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PermissionDestination permissionDestination) {
        C7384Etj.A0Y(permissionDestination, 0);
        if (!LocalConnectorConsentSheetKt.requiresLocalConnectorConsent(permissionDestination) || DevicePermissionStateKt.isDevicePermissionGranted(this.$context, permissionDestination)) {
            this.$launch.invoke(permissionDestination);
        } else {
            LocalConnectorConsentHandshake.onAccept = new AnonymousClass1(this.$launch, permissionDestination);
            this.$navigator.navigate((AuraNavKey) new LocalConnectorConsentSheetKey(permissionDestination), false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DevicePermissionManageControllerKt$rememberDevicePermissionManageController$2$1(Context context, AuraNavigator auraNavigator, G0U<? super PermissionDestination, Unit> g0u) {
        super(1);
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$launch = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(PermissionDestination permissionDestination) {
        invoke2(permissionDestination);
        return Unit.INSTANCE;
    }
}
