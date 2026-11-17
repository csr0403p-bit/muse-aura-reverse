package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C7OU;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.utils.HatchNotificationPermissionLauncherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AuraWaitlistScreenKt$NotificationOptInCta$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C7OU<String, Boolean> $notificationPermissionLauncher;
    public final /* synthetic */ MutableState<Boolean> $showDeniedDialog$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraWaitlistScreenKt$NotificationOptInCta$3$1(Activity activity, C7OU<String, Boolean> c7ou, MutableState<Boolean> mutableState) {
        super(0);
        this.$activity = activity;
        this.$notificationPermissionLauncher = c7ou;
        this.$showDeniedDialog$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.ONBOARDING, null, HatchScreen.ONBOARDING_WAITLIST, HatchComponent.NOTIFICATION_PERMISSION, null, null, null);
        if (HatchNotificationPermissionLauncherKt.canRequestNotificationPermission(this.$activity)) {
            A02("android.permission.POST_NOTIFICATIONS");
        } else {
            MutableState.A09(true, this.$showDeniedDialog$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
