package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7OU;
import X.G0U;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$1$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C7OU<String, Boolean> $notifyPermissionLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationsSettingsScreenKt$HatchNotificationsSettingsScreen$1$1$1$1$1$1$1(C7OU<String, Boolean> c7ou, Context context) {
        super(1);
        this.$notifyPermissionLauncher = c7ou;
        this.$context = context;
    }

    public final void invoke(boolean z) {
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.NOTIFICATIONS, HatchScreen.NOTIFICATIONS, HatchComponent.NOTIFICATIONS_TOGGLE, null, null);
        if (z) {
            A02("android.permission.POST_NOTIFICATIONS");
        } else {
            HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
