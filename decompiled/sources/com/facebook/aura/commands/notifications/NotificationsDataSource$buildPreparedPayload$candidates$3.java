package com.facebook.aura.commands.notifications;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0U;
import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public final class NotificationsDataSource$buildPreparedPayload$candidates$3 extends AbstractC7559F3s implements G0U<StatusBarNotification, Boolean> {
    public final /* synthetic */ long $lastSynced;

    @Override // X.G0U
    public final Boolean invoke(StatusBarNotification statusBarNotification) {
        C7384Etj.A0Y(statusBarNotification, 0);
        return Boolean.valueOf(AnonymousClass002.A1N((statusBarNotification.getPostTime() > this.$lastSynced ? 1 : (statusBarNotification.getPostTime() == this.$lastSynced ? 0 : -1))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsDataSource$buildPreparedPayload$candidates$3(long j) {
        super(1);
        this.$lastSynced = j;
    }
}
