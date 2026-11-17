package com.facebook.aura.notifications.push;

import X.AnonymousClass005;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import android.app.NotificationManager;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.notifications.attention.AttentionNotifications;
import com.facebook.aura.partners.voice.background.VoiceNotificationChannel;

/* loaded from: classes3.dex */
public final class AuraNotificationChannels {
    public static final String CHAT_NOTIF_ID = "hatch_chat";
    public static final String COMMAND_EXECUTION = "aura_command_execution";
    public static final String CONVERSATIONS = "aura_conversations";
    public static final String DOWNLOADS = "aura_downloads";
    public static final String GENERAL = "aura_notifications";
    public static final AuraNotificationChannels INSTANCE = new AuraNotificationChannels();

    public final void ensureChannelsExist(Context context) {
        C7384Etj.A0Y(context, 0);
        NotificationManager notificationManagerA07 = C60R.A07(context);
        if (notificationManagerA07.getNotificationChannel(GENERAL) == null) {
            C60Q.A15(notificationManagerA07, context.getString(R.string._name_removed__res_0x7f120d2e), GENERAL, 4);
        }
        if (notificationManagerA07.getNotificationChannel(CONVERSATIONS) == null) {
            C60Q.A15(notificationManagerA07, context.getString(R.string._name_removed__res_0x7f120d2c), CONVERSATIONS, 4);
        }
        if (notificationManagerA07.getNotificationChannel("aura_command_execution") == null) {
            C60Q.A15(notificationManagerA07, context.getString(R.string._name_removed__res_0x7f120d2b), "aura_command_execution", 2);
        }
        if (notificationManagerA07.getNotificationChannel(DOWNLOADS) == null) {
            C60Q.A15(notificationManagerA07, context.getString(R.string._name_removed__res_0x7f120d2d), DOWNLOADS, 3);
        }
        AttentionNotifications.INSTANCE.ensureChannels(context);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        VoiceNotificationChannel.INSTANCE.ensureChannels(context, notificationManagerA07);
    }
}
