package com.facebook.aura.commands.notifications;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public final class NotificationsDataSource$buildPreparedPayload$candidates$1 extends AbstractC7559F3s implements G0U<StatusBarNotification, Boolean> {
    public final /* synthetic */ Context $context;

    @Override // X.G0U
    public final Boolean invoke(StatusBarNotification statusBarNotification) {
        C7384Etj.A0Y(statusBarNotification, 0);
        return Boolean.valueOf(NotificationSerializer.INSTANCE.isSelfNotification(statusBarNotification, this.$context));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDataSource$buildPreparedPayload$candidates$1(Context context) {
        super(1);
        this.$context = context;
    }
}
