package com.facebook.aura.commands.notifications;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public final class NotificationsDataSource$buildPreparedPayload$candidates$2 extends AbstractC7559F3s implements G0U<StatusBarNotification, Boolean> {
    public static final NotificationsDataSource$buildPreparedPayload$candidates$2 INSTANCE = new NotificationsDataSource$buildPreparedPayload$candidates$2();

    public NotificationsDataSource$buildPreparedPayload$candidates$2() {
        super(1);
    }

    @Override // X.G0U
    public final Boolean invoke(StatusBarNotification statusBarNotification) {
        C7384Etj.A0Y(statusBarNotification, 0);
        return Boolean.valueOf(NotificationSerializer.INSTANCE.isSystemNoise(statusBarNotification));
    }
}
