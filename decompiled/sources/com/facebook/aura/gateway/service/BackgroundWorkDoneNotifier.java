package com.facebook.aura.gateway.service;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C3cG;
import X.C3cI;
import X.C7380Etd;
import X.C7384Etj;
import X.EG6;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat$BigPictureStyle;
import com.facebook.aura.R;
import com.facebook.aura.backgroundwork.api.BackgroundWorkContent;
import com.facebook.aura.backgroundwork.api.BackgroundWorkHook;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.notifications.attention.AttentionNotificationsKt;

/* loaded from: classes2.dex */
public final class BackgroundWorkDoneNotifier implements BackgroundWorkHook {
    public static final String CHANNEL_ID = "aura_task_updates";
    public static final BackgroundWorkDoneNotifier INSTANCE = new BackgroundWorkDoneNotifier();
    public static final int NOTIFICATION_ID = 9005;

    public final void cancelPrompt(String str) {
        C7384Etj.A0Y(str, 0);
        NotificationManager notificationManager = (NotificationManager) C3cG.A06().getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            C7384Etj.A0U(activeNotifications);
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == 9005 && str.equals(statusBarNotification.getTag()) && statusBarNotification.getNotification().getTimeoutAfter() > 0) {
                    notificationManager.cancel(str, NOTIFICATION_ID);
                    return;
                }
            }
        }
    }

    @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkHook
    public void onAcknowledged(AbstractC3358CGz abstractC3358CGz, String str) {
        C7384Etj.A0Y(str, 1);
        new C7380Etd(C3cG.A06()).A00.cancel(str, NOTIFICATION_ID);
    }

    @Override // com.facebook.aura.backgroundwork.api.BackgroundWorkHook
    public void onFinished(AbstractC3358CGz abstractC3358CGz, BackgroundWorkContent backgroundWorkContent) {
        C7384Etj.A0Y(backgroundWorkContent, 1);
        String str = backgroundWorkContent.openUri;
        if (str == null || AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
            return;
        }
        post(C3cG.A06(), str, backgroundWorkContent);
    }

    private final void ensureChannel(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager == null || notificationManager.getNotificationChannel(CHANNEL_ID) != null) {
            return;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(CHANNEL_ID, context.getString(R.string._name_removed__res_0x7f120bf1), 2));
    }

    private final void post(Context context, String str, BackgroundWorkContent backgroundWorkContent) {
        ensureChannel(context);
        EG6 eg6A08 = C3cI.A08(context, CHANNEL_ID);
        eg6A08.A08(backgroundWorkContent.title);
        eg6A08.A07(backgroundWorkContent.text);
        eg6A08.A09 = AttentionNotificationsKt.openUriPendingIntent(context, NOTIFICATION_ID, str, false);
        eg6A08.A02();
        eg6A08.A0T = true;
        eg6A08.A05 = -1;
        Bitmap bitmap = backgroundWorkContent.image;
        if (bitmap != null) {
            FittedNotificationImages fittedNotificationImagesFitNotificationImages = BackgroundWorkNotificationPartsKt.fitNotificationImages(bitmap);
            eg6A08.A05(fittedNotificationImagesFitNotificationImages.largeIcon);
            NotificationCompat$BigPictureStyle notificationCompat$BigPictureStyle = new NotificationCompat$BigPictureStyle();
            notificationCompat$BigPictureStyle.A06(fittedNotificationImagesFitNotificationImages.bigPicture);
            notificationCompat$BigPictureStyle.A00 = null;
            notificationCompat$BigPictureStyle.A01 = true;
            eg6A08.A06(notificationCompat$BigPictureStyle);
        }
        new C7380Etd(context).A01(str, NOTIFICATION_ID, eg6A08.A01());
    }

    public final void postPrompt(String str, String str2, String str3, long j) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        Context contextA06 = C3cG.A06();
        ensureChannel(contextA06);
        EG6 eg6A08 = C3cI.A08(contextA06, CHANNEL_ID);
        eg6A08.A08(str);
        eg6A08.A07(str2);
        eg6A08.A09 = AttentionNotificationsKt.openUriOrAppPendingIntent(contextA06, NOTIFICATION_ID, str3);
        eg6A08.A02();
        eg6A08.A0T = zA1a;
        eg6A08.A06 = j;
        Notification notificationA01 = eg6A08.A01();
        C7384Etj.A0U(notificationA01);
        new C7380Etd(contextA06).A01(str3, NOTIFICATION_ID, notificationA01);
    }
}
