package com.facebook.aura.commands.notifications;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import android.service.notification.StatusBarNotification;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NotificationRepoImpl {
    public final NotificationRepoOps activeProvider;
    public final G0U<String, Unit> cancel;

    public final void cancelNotification(String str) {
        C7384Etj.A0Y(str, 0);
        this.cancel.invoke(str);
    }

    public final List<StatusBarNotification> getActiveNotifications() {
        return this.activeProvider.getActiveNotifications();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationRepoImpl(NotificationRepoOps notificationRepoOps, G0U<? super String, Unit> g0u) {
        AnonymousClass003.A0u(notificationRepoOps, g0u);
        this.activeProvider = notificationRepoOps;
        this.cancel = g0u;
    }
}
