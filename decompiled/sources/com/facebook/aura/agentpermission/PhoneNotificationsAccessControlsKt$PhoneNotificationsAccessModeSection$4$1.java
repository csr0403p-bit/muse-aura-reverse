package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.BGK;
import X.C7384Etj;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.gateway.AuraProactiveSyncManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import java.io.IOException;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$4$1 extends AbstractC7559F3s implements G0V<String, Boolean, Unit> {
    public final /* synthetic */ MutableState<Set<String>> $blockedApps$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$4$1(HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context, MutableState<Set<String>> mutableState) {
        super(2);
        this.$prefsStore = hatchGatewayPrefsStore;
        this.$context = context;
        this.$blockedApps$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) throws IOException {
        invoke(str, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, boolean z) throws IOException {
        Set<String> setA02;
        C7384Etj.A0Y(str, 0);
        MutableState<Set<String>> mutableState = this.$blockedApps$delegate;
        Set<String> value = mutableState.getValue();
        if (z) {
            setA02 = BGK.A04(str, value);
        } else {
            setA02 = BGK.A02(str, value);
        }
        mutableState.Af8(setA02);
        this.$prefsStore.setPhoneNotificationsAccessBlockedApps(this.$blockedApps$delegate.getValue());
        AuraProactiveSyncManager.INSTANCE.scheduleNotificationsSync(this.$context);
        HatchInteractionLogger.INSTANCE.logToggle(z, HatchSurface.SETTINGS, HatchSubsurface.PHONE_NOTIFICATIONS_PERMISSION, HatchScreen.PHONE_NOTIFICATIONS_PERMISSION, HatchComponent.APP_FILTER_TOGGLE, null, null);
    }
}
