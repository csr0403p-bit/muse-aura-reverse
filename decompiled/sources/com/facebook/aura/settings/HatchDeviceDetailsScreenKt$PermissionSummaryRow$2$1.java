package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.PermissionDestination;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$PermissionSummaryRow$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ PermissionDestination $destination;
    public final /* synthetic */ G0U<PermissionDestination, Unit> $managePermission;
    public final /* synthetic */ G0U<Boolean, Unit> $onRunInBackgroundChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDeviceDetailsScreenKt$PermissionSummaryRow$2$1(PermissionDestination permissionDestination, G0U<? super Boolean, Unit> g0u, G0U<? super PermissionDestination, Unit> g0u2) {
        super(1);
        this.$destination = permissionDestination;
        this.$onRunInBackgroundChange = g0u;
        this.$managePermission = g0u2;
    }

    public final void invoke(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICE_DETAILS, HatchComponent.PERMISSION_TOGGLE, null, AnonymousClass006.A10(HatchMetadataKey.PERMISSION_KEY.getValue(), AnonymousClass006.A0x(this.$destination)));
        PermissionDestination permissionDestination = this.$destination;
        if (permissionDestination == PermissionDestination.RUN_IN_BACKGROUND) {
            AnonymousClass001.A1K(z, this.$onRunInBackgroundChange);
        } else {
            this.$managePermission.invoke(permissionDestination);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
