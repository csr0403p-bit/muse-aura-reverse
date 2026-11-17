package com.facebook.aura.notifications.push;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cI;
import X.C60Q;
import X.C7502EyJ;
import X.EFx;
import X.EFz;
import X.EG6;
import X.FGI;
import X.Hy2;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.app.NotificationCompat$MessagingStyle;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.notifications.attention.AttentionNotifications;
import com.facebook.aura.notifications.push.api.ConversationNotificationContributors;
import com.facebook.aura.notifications.push.api.PushPresentation;
import com.facebook.aura.utils.HatchStringUtils;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class AuraPushNotificationRenderer {
    public static final String AGENT_PERMISSION_REQUEST_COLLAPSE_KEY = "approval_request";
    public static final String EXTRA_INAPP_NOTIF_ID = "hatch_inapp_notif_id";
    public static final String EXTRA_NDID = "hatch_notif_ndid";
    public static final String EXTRA_NOTIF_CHANNEL = "hatch_notif_channel";
    public static final String EXTRA_NOTIF_ORIGIN = "hatch_notif_origin";
    public static final String EXTRA_NOTIF_TARGET_USER_ID = "hatch_notif_target_user_id";
    public static final String EXTRA_NOTIF_TYPE = "hatch_notif_type";
    public static final String PUSH_ALERT_SUMMARY_TAG = "aura_push_alert_summary";
    public static final String PUSH_ALERT_TAG = "aura_push_alert";
    public static final AuraPushNotificationRenderer INSTANCE = new AuraPushNotificationRenderer();
    public static final Object postLock = C3cG.A0T();

    /* JADX WARN: Removed duplicated region for block: B:54:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void render(android.content.Context r12, com.facebook.aura.notifications.push.AuraPushNotificationData r13, com.facebook.aura.analytics.hatch.HatchNotificationChannel r14, com.facebook.aura.analytics.hatch.HatchNotificationOrigin r15, X.AbstractC3358CGz r16, boolean r17, com.facebook.aura.notifications.push.api.PushPresentation.Alert r18) {
        /*
            r11 = this;
            r0 = 0
            r1 = r12
            X.C7384Etj.A0Y(r12, r0)
            r5 = 1
            r10 = r13
            r11 = r14
            r12 = r15
            X.AnonymousClass005.A11(r13, r14, r15, r5)
            boolean r0 = r13.isLoggedOutPush
            if (r0 != 0) goto L1e
            com.facebook.aura.auth.store.AuraUserSessionStore r0 = com.facebook.aura.auth.store.AuraUserSessionStore.INSTANCE
            boolean r0 = r0.isCurrentUserAuthenticated()
            if (r0 != 0) goto L1e
            java.lang.String r0 = "logged_out"
        L1a:
            render$logDrop(r11, r13, r12, r0)
            return
        L1e:
            boolean r0 = com.facebook.aura.notifications.suppression.HatchNotificationSuppression.voiceCallActive
            if (r0 == 0) goto L25
            java.lang.String r0 = "voice_call_active"
            goto L1a
        L25:
            android.content.Context r8 = r1.getApplicationContext()
            X.Etd r9 = new X.Etd
            r9.<init>(r8)
            com.facebook.aura.notifications.push.AuraNotificationChannels r0 = com.facebook.aura.notifications.push.AuraNotificationChannels.INSTANCE     // Catch: java.lang.SecurityException -> Lb6
            X.C7384Etj.A0X(r8)     // Catch: java.lang.SecurityException -> Lb6
            r0.ensureChannelsExist(r8)     // Catch: java.lang.SecurityException -> Lb6
            android.app.NotificationManager r0 = r9.A00     // Catch: java.lang.SecurityException -> Lb6
            boolean r0 = r0.areNotificationsEnabled()     // Catch: java.lang.SecurityException -> Lb6
            if (r0 != 0) goto L44
            java.lang.String r0 = "notification_disabled"
            render$logDrop(r14, r13, r15, r0)     // Catch: java.lang.SecurityException -> Lb6
            goto L5c
        L44:
            java.lang.String r1 = com.facebook.aura.notifications.push.AuraPushNotificationRendererKt.approvalId(r13)
            r4 = 0
            r15 = r4
            r14 = r17
            if (r17 != 0) goto L5d
            r15 = r1
            if (r1 == 0) goto L5d
            com.facebook.aura.notifications.attention.AttentionNotifications r0 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE
            boolean r0 = r0.claimApprovalAlert(r1)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "approval_already_shown"
            goto L1a
        L5c:
            return
        L5d:
            java.lang.String r3 = com.facebook.aura.notifications.push.AuraPushNotificationRendererKt.dedupKey(r13)
            java.lang.Long r0 = r13.targetUid
            r13 = r16
            if (r0 == 0) goto L78
            long r0 = r0.longValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L6f:
            com.facebook.aura.notifications.push.AuraPostedNotificationStore r4 = new com.facebook.aura.notifications.push.AuraPostedNotificationStore
            r4.<init>(r0)
        L74:
            java.lang.Object r6 = com.facebook.aura.notifications.push.AuraPushNotificationRenderer.postLock
            monitor-enter(r6)
            goto L80
        L78:
            if (r16 == 0) goto L74
            r0 = r13
            X.CH0 r0 = (X.CH0) r0
            java.lang.String r0 = r0.A01
            goto L6f
        L80:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto L94
            if (r4 == 0) goto L94
            boolean r2 = r4.contains(r3, r0)     // Catch: java.lang.Throwable -> Lb3
            if (r2 != r5) goto L94
            java.lang.String r0 = "already_notified"
            render$logDrop(r11, r10, r12, r0)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        L94:
            com.facebook.aura.notifications.push.AuraPushNotificationRenderer r7 = com.facebook.aura.notifications.push.AuraPushNotificationRenderer.INSTANCE     // Catch: java.lang.SecurityException -> La5 java.lang.Throwable -> Lb3
            r16 = r18
            r7.post(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.SecurityException -> La5 java.lang.Throwable -> Lb3
            if (r3 == 0) goto Lb1
            if (r17 != 0) goto Lb1
            if (r4 == 0) goto Lb1
            r4.record(r3, r0)     // Catch: java.lang.Throwable -> Lb3
            goto Lb1
        La5:
            if (r15 == 0) goto Lac
            com.facebook.aura.notifications.attention.AttentionNotifications r0 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE     // Catch: java.lang.Throwable -> Lb3
            r0.releaseApprovalAlert(r15)     // Catch: java.lang.Throwable -> Lb3
        Lac:
            java.lang.String r0 = "security_exception"
            render$logDrop(r11, r10, r12, r0)     // Catch: java.lang.Throwable -> Lb3
        Lb1:
            monitor-exit(r6)
            return
        Lb3:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        Lb6:
            java.lang.String r0 = "security_exception"
            render$logDrop(r14, r13, r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushNotificationRenderer.render(android.content.Context, com.facebook.aura.notifications.push.AuraPushNotificationData, com.facebook.aura.analytics.hatch.HatchNotificationChannel, com.facebook.aura.analytics.hatch.HatchNotificationOrigin, X.CGz, boolean, com.facebook.aura.notifications.push.api.PushPresentation$Alert):void");
    }

    private final Notification buildAlertSummary(Context context, PushPresentation.Alert alert, String str, AuraPushNotificationData auraPushNotificationData, PendingIntent pendingIntent) {
        AttentionNotifications attentionNotifications = AttentionNotifications.INSTANCE;
        String strA0M = FGI.A0M("aura_push_alert:", alert.key);
        HatchStringUtils hatchStringUtils = HatchStringUtils.INSTANCE;
        String str2 = auraPushNotificationData.title;
        if (str2 == null) {
            str2 = "";
        }
        EG6 eg6Builder = attentionNotifications.builder(context, true, strA0M, hatchStringUtils.sanitizeForNotification(str2), str, pendingIntent, null, R.drawable.hatch_notification_icon, null);
        eg6Builder.A0Q = true;
        eg6Builder.A02 = 2;
        return C60Q.A07(eg6Builder);
    }

    private final Notification buildAttentionNotification(Context context, String str, String str2, String str3, AuraPushNotificationData auraPushNotificationData, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        AttentionNotifications attentionNotifications = AttentionNotifications.INSTANCE;
        HatchStringUtils hatchStringUtils = HatchStringUtils.INSTANCE;
        String str4 = auraPushNotificationData.title;
        if (str4 == null) {
            str4 = "";
        }
        EG6 eg6Builder = attentionNotifications.builder(context, true, str, hatchStringUtils.sanitizeForNotification(str4), str3, pendingIntent, str2, R.drawable.hatch_notification_icon, null);
        if (pendingIntent2 != null) {
            eg6Builder.A07.deleteIntent = pendingIntent2;
        }
        return C60Q.A07(eg6Builder);
    }

    private final Notification buildConversationNotification(Context context, String str, AuraPushNotificationData auraPushNotificationData, AbstractC3358CGz abstractC3358CGz, int i, String str2, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        ConversationNotificationState companion = ConversationNotificationState.Companion.getInstance(abstractC3358CGz);
        EFx orCreateAgentPerson = companion.getOrCreateAgentPerson(abstractC3358CGz);
        AuraConversationShortcut.INSTANCE.ensureShortcutExists(context, orCreateAgentPerson);
        C7502EyJ c7502EyJReplyAction = NotificationReplyReceiver.Companion.replyAction(context, i, str2, false);
        companion.addMessage(str2, str, System.currentTimeMillis(), orCreateAgentPerson);
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(companion.getUserPerson(context));
        Iterator<EFz> it = companion.recentMessages(str2).iterator();
        while (it.hasNext()) {
            notificationCompat$MessagingStyle.A06(it.next());
        }
        EG6 eg6A08 = C3cI.A08(context, AuraNotificationChannels.CONVERSATIONS);
        eg6A08.A06(notificationCompat$MessagingStyle);
        eg6A08.A0L = AuraConversationShortcut.SHORTCUT_ID;
        eg6A08.A0I = "msg";
        eg6A08.A02();
        boolean zRepliedOnAnotherDeviceRecently = companion.repliedOnAnotherDeviceRecently(str2);
        Notification notification = eg6A08.A07;
        int i2 = notification.flags;
        int i3 = i2 & (-9);
        if (zRepliedOnAnotherDeviceRecently) {
            i3 = i2 | 8;
        }
        notification.flags = i3;
        Integer num = auraPushNotificationData.unreadCount;
        eg6A08.A03 = num != null ? num.intValue() : 0;
        eg6A08.A04 = 1;
        if (pendingIntent != null) {
            eg6A08.A09 = pendingIntent;
        }
        if (pendingIntent2 != null) {
            notification.deleteIntent = pendingIntent2;
        }
        ConversationNotificationContributors.INSTANCE.contribute(context, abstractC3358CGz, eg6A08, c7502EyJReplyAction, i, str2);
        eg6A08.A0M.add(c7502EyJReplyAction.A00());
        return C60Q.A07(eg6A08);
    }

    private final Bitmap loadAgentAvatarBitmap(AbstractC3358CGz abstractC3358CGz) {
        if (abstractC3358CGz == null) {
            return null;
        }
        return HatchAgentAvatarLoader.INSTANCE.loadCircularAvatar(abstractC3358CGz, 256);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00da A[PHI: r8 r20
  0x00da: PHI (r8v1 boolean) = (r8v0 boolean), (r8v31 boolean) binds: [B:7:0x0022, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x00da: PHI (r20v1 boolean) = (r20v0 boolean), (r20v3 boolean) binds: [B:7:0x0022, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e5 A[PHI: r9
  0x01e5: PHI (r9v7 android.app.Notification) = (r9v9 android.app.Notification), (r9v10 android.app.Notification) binds: [B:69:0x01c3, B:67:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[PHI: r8
  0x0024: PHI (r8v31 boolean) = (r8v0 boolean), (r8v32 boolean) binds: [B:7:0x0022, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void post(android.content.Context r32, X.C7380Etd r33, com.facebook.aura.notifications.push.AuraPushNotificationData r34, com.facebook.aura.analytics.hatch.HatchNotificationChannel r35, com.facebook.aura.analytics.hatch.HatchNotificationOrigin r36, X.AbstractC3358CGz r37, boolean r38, java.lang.String r39, com.facebook.aura.notifications.push.api.PushPresentation.Alert r40) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushNotificationRenderer.post(android.content.Context, X.Etd, com.facebook.aura.notifications.push.AuraPushNotificationData, com.facebook.aura.analytics.hatch.HatchNotificationChannel, com.facebook.aura.analytics.hatch.HatchNotificationOrigin, X.CGz, boolean, java.lang.String, com.facebook.aura.notifications.push.api.PushPresentation$Alert):void");
    }

    public static /* synthetic */ void render$default(AuraPushNotificationRenderer auraPushNotificationRenderer, Context context, AuraPushNotificationData auraPushNotificationData, HatchNotificationChannel hatchNotificationChannel, HatchNotificationOrigin hatchNotificationOrigin, AbstractC3358CGz abstractC3358CGz, boolean z, PushPresentation.Alert alert, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchNotificationChannel = HatchNotificationChannel.PUSH;
        }
        if ((i & 8) != 0) {
            hatchNotificationOrigin = HatchNotificationOrigin.SERVER;
        }
        if ((i & 16) != 0) {
            abstractC3358CGz = null;
        }
        boolean zA1R = AnonymousClass002.A1R(i, z);
        if ((i & 64) != 0) {
            alert = null;
        }
        auraPushNotificationRenderer.render(context, auraPushNotificationData, hatchNotificationChannel, hatchNotificationOrigin, abstractC3358CGz, zA1R, alert);
    }

    public static final void render$logDrop(HatchNotificationChannel hatchNotificationChannel, AuraPushNotificationData auraPushNotificationData, HatchNotificationOrigin hatchNotificationOrigin, String str) {
        HatchNotificationEventsLogger.INSTANCE.logDrop(hatchNotificationChannel, auraPushNotificationData.notificationType, hatchNotificationOrigin, auraPushNotificationData.ndid, auraPushNotificationData.inappNotifId, str);
    }

    private final Notification buildStandardNotification(Context context, String str, AuraPushNotificationData auraPushNotificationData, AbstractC3358CGz abstractC3358CGz, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Bitmap bitmapLoadAgentAvatarBitmap = loadAgentAvatarBitmap(abstractC3358CGz);
        if (bitmapLoadAgentAvatarBitmap == null) {
            bitmapLoadAgentAvatarBitmap = fallbackLargeIcon(context);
        }
        EG6 eg6A08 = C3cI.A08(context, AuraNotificationChannels.GENERAL);
        eg6A08.A05(bitmapLoadAgentAvatarBitmap);
        HatchStringUtils hatchStringUtils = HatchStringUtils.INSTANCE;
        String str2 = auraPushNotificationData.title;
        if (str2 == null) {
            str2 = "";
        }
        eg6A08.A08(hatchStringUtils.sanitizeForNotification(str2));
        eg6A08.A07(str);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A00 = EG6.A00(str);
        eg6A08.A06(notificationCompat$BigTextStyle);
        eg6A08.A02();
        Integer num = auraPushNotificationData.unreadCount;
        eg6A08.A03 = num != null ? num.intValue() : 0;
        eg6A08.A04 = 1;
        if (pendingIntent != null) {
            eg6A08.A09 = pendingIntent;
        }
        if (pendingIntent2 != null) {
            eg6A08.A07.deleteIntent = pendingIntent2;
        }
        return C60Q.A07(eg6A08);
    }

    private final Bitmap fallbackLargeIcon(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.aura_default_avatar);
        if (drawable != null) {
            return Hy2.A00(drawable, 256, 256);
        }
        return null;
    }

    public final void retract(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        NotificationManager notificationManager = (NotificationManager) context.getApplicationContext().getSystemService("notification");
        int iHashCode = str.hashCode();
        notificationManager.cancel(PUSH_ALERT_TAG, iHashCode);
        notificationManager.cancel(PUSH_ALERT_SUMMARY_TAG, iHashCode);
    }
}
