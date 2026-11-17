package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.navigation.key.PermissionDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$PermissionSummaryRow$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ PermissionDestination $destination;
    public final /* synthetic */ Function0<Unit> $onSecondaryClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDeviceDetailsScreenKt$PermissionSummaryRow$1$1(PermissionDestination permissionDestination, Function0<Unit> function0) {
        super(0);
        this.$destination = permissionDestination;
        this.$onSecondaryClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.DEVICES, HatchScreen.DEVICE_DETAILS, HatchComponent.PERMISSION_ROW, null, AnonymousClass006.A10(HatchMetadataKey.PERMISSION_KEY.getValue(), AnonymousClass006.A0x(this.$destination)), null);
        this.$onSecondaryClick.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
