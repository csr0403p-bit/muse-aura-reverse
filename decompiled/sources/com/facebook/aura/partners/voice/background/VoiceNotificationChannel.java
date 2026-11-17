package com.facebook.aura.partners.voice.background;

import X.AnonymousClass003;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.notifications.push.NotificationChannelContributor;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;

/* loaded from: classes2.dex */
public final class VoiceNotificationChannel implements NotificationChannelContributor {
    public static final String ID = "aura_voice_call_v2";
    public static final VoiceNotificationChannel INSTANCE = new VoiceNotificationChannel();
    public static final String LEGACY_ID = "aura_voice_call";

    @Override // com.facebook.aura.notifications.push.NotificationChannelContributor
    public void ensureChannels(Context context, NotificationManager notificationManager) {
        AnonymousClass003.A0u(context, notificationManager);
        if (VoiceCallSupport.INSTANCE.isVoiceCallSupported()) {
            notificationManager.deleteNotificationChannel("aura_voice_call");
            if (notificationManager.getNotificationChannel(ID) == null) {
                notificationManager.createNotificationChannel(new NotificationChannel(ID, context.getString(R.string._name_removed__res_0x7f120d30), 2));
            }
        }
    }
}
