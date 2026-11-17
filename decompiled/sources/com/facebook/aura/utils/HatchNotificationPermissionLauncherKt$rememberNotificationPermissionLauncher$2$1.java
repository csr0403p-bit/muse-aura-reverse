package com.facebook.aura.utils;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchOsNotificationSettingEventType;
import com.facebook.aura.analytics.hatch.HatchOsNotificationSettingLogger;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchNotificationPermissionLauncherKt$rememberNotificationPermissionLauncher$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ G0U<Boolean, Unit> $onResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchNotificationPermissionLauncherKt$rememberNotificationPermissionLauncher$2$1(G0U<? super Boolean, Unit> g0u) {
        super(1);
        this.$onResult = g0u;
    }

    public final void invoke(boolean z) {
        HatchPermissionRequestStore.INSTANCE.markPermissionRequested("android.permission.POST_NOTIFICATIONS");
        HatchOsNotificationSettingLogger.INSTANCE.logSnapshot(HatchOsNotificationSettingEventType.PERMISSION_CHANGE);
        PermissionChangeNotifier.INSTANCE.notifyChanged();
        AnonymousClass001.A1K(z, this.$onResult);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
