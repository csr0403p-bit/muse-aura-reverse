package com.facebook.aura.commands.notifications;

import android.service.notification.StatusBarNotification;
import java.util.List;

/* loaded from: classes3.dex */
public interface NotificationRepoOps {
    List<StatusBarNotification> getActiveNotifications();
}
