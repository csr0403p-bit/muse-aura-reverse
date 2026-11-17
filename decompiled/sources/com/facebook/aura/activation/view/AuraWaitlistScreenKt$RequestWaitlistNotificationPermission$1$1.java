package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.C7OU;
import X.G0U;
import android.app.Activity;
import com.facebook.aura.utils.HatchNotificationPermissionLauncherKt;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$RequestWaitlistNotificationPermission$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C7OU<String, Boolean> $notificationPermissionLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$RequestWaitlistNotificationPermission$1$1(Activity activity, C7OU<String, Boolean> c7ou) {
        super(1);
        this.$activity = activity;
        this.$notificationPermissionLauncher = c7ou;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (HatchNotificationPermissionLauncherKt.canRequestNotificationPermission(this.$activity)) {
            A02("android.permission.POST_NOTIFICATIONS");
        }
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraWaitlistScreenKt$RequestWaitlistNotificationPermission$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
