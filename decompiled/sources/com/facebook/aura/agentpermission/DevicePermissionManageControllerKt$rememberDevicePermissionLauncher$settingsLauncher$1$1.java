package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.gateway.AuraProactiveSyncManager;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$settingsLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onPermissionFlowFinished;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePermissionManageControllerKt$rememberDevicePermissionLauncher$settingsLauncher$1$1(Context context, Function0<Unit> function0) {
        super(1);
        this.$context = context;
        this.$onPermissionFlowFinished = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) throws IOException {
        PermissionChangeNotifier.INSTANCE.notifyChanged();
        AuraProactiveSyncManager.INSTANCE.scheduleNotificationsSync(this.$context);
        this.$onPermissionFlowFinished.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) throws IOException {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
