package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchNotificationPermissionLauncherKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchNotificationOptInCardKt$rememberNotificationOptInAction$launcher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ MutableState<Boolean> $requestInFlight$delegate;
    public final /* synthetic */ MutableState<Boolean> $showDeniedDialog$delegate;
    public final /* synthetic */ NotificationOptInStore $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationOptInCardKt$rememberNotificationOptInAction$launcher$1$1(NotificationOptInStore notificationOptInStore, Activity activity, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$store = notificationOptInStore;
        this.$activity = activity;
        this.$requestInFlight$delegate = mutableState;
        this.$showDeniedDialog$delegate = mutableState2;
    }

    public final void invoke(boolean z) {
        MutableState.A09(false, this.$requestInFlight$delegate);
        Boolean boolRefresh = this.$store.refresh();
        this.$store.logEvent("outcome", z ? "system_dialog_accepted" : "system_dialog_denied");
        if (!AnonymousClass002.A1b(boolRefresh, false) || z || HatchNotificationPermissionLauncherKt.canRequestNotificationPermission(this.$activity)) {
            return;
        }
        MutableState.A09(true, this.$showDeniedDialog$delegate);
        this.$store.logEvent("outcome", "denied_dialog_shown");
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
