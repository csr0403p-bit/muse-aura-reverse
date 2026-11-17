package com.facebook.aura.nodes.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7OU;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchNotificationPermissionLauncherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchNotificationOptInCardKt$rememberNotificationOptInAction$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ C7OU<String, Boolean> $launcher;
    public final /* synthetic */ Function0<Unit> $openSettings;
    public final /* synthetic */ MutableState<Boolean> $requestInFlight$delegate;
    public final /* synthetic */ NotificationOptInStore $store;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNotificationOptInCardKt$rememberNotificationOptInAction$2$1(NotificationOptInStore notificationOptInStore, Activity activity, C7OU<String, Boolean> c7ou, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$store = notificationOptInStore;
        this.$activity = activity;
        this.$launcher = c7ou;
        this.$openSettings = function0;
        this.$requestInFlight$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$requestInFlight$delegate)) {
            return;
        }
        this.$store.logInteraction("tapped");
        if (AnonymousClass002.A1b(this.$store.refresh(), true)) {
            return;
        }
        if (!HatchNotificationPermissionLauncherKt.canRequestNotificationPermission(this.$activity)) {
            this.$openSettings.invoke();
        } else {
            MutableState.A09(true, this.$requestInFlight$delegate);
            A02("android.permission.POST_NOTIFICATIONS");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
