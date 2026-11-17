package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.AuraProactiveSyncManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.PhoneNotificationsAccessMode;
import java.io.IOException;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
    public final /* synthetic */ MutableState<PhoneNotificationsAccessMode> $readMode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$2$1$1$1$1(HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context, MutableState<PhoneNotificationsAccessMode> mutableState) {
        super(1);
        this.$prefsStore = hatchGatewayPrefsStore;
        this.$context = context;
        this.$readMode$delegate = mutableState;
    }

    public final void invoke(boolean z) throws IOException {
        PhoneNotificationsAccessMode value = this.$readMode$delegate.getValue();
        PhoneNotificationsAccessMode phoneNotificationsAccessMode = PhoneNotificationsAccessMode.ALL;
        if (value != phoneNotificationsAccessMode) {
            this.$readMode$delegate.Af8(phoneNotificationsAccessMode);
            this.$prefsStore.setPhoneNotificationsAccessMode(phoneNotificationsAccessMode);
            AuraProactiveSyncManager.INSTANCE.scheduleNotificationsSync(this.$context);
            HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.PHONE_NOTIFICATIONS_PERMISSION, HatchScreen.PHONE_NOTIFICATIONS_PERMISSION, HatchComponent.ALL_APPS_TOGGLE, null, null);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) throws IOException {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
