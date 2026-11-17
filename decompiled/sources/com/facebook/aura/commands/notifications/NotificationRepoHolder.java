package com.facebook.aura.commands.notifications;

/* loaded from: classes3.dex */
public final class NotificationRepoHolder {
    public static final NotificationRepoHolder INSTANCE = new NotificationRepoHolder();
    public static volatile NotificationRepoImpl repo;

    public final NotificationRepoImpl getRepo() {
        return repo;
    }

    public final void setRepo(NotificationRepoImpl notificationRepoImpl) {
        repo = notificationRepoImpl;
    }
}
