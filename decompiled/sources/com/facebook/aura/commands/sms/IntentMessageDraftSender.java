package com.facebook.aura.commands.sms;

import X.AnonymousClass003;
import X.BQG;
import X.C3cH;
import X.C60Q;
import X.C60R;
import X.CFK;
import X.EG6;
import X.HtJ;
import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.utils.HatchStringUtils;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class IntentMessageDraftSender implements MessageDraftSender {
    public final String channelName;
    public final String notificationTitleFormat;

    @Override // com.facebook.aura.commands.sms.MessageDraftSender
    public Object send(Context context, String str, String str2, HtJ<? super MessageDraftResult> htJ) {
        try {
            Intent intentBuildSmsDraftIntent = MessageDraftSenderKt.buildSmsDraftIntent(str, str2);
            int iIncrementAndGet = MessageDraftSenderKt.notificationIdCounter.incrementAndGet() + 9000;
            PendingIntent activity = PendingIntent.getActivity(context, iIncrementAndGet, intentBuildSmsDraftIntent, 201326592);
            NotificationManager notificationManagerA07 = C60R.A07(context);
            C60Q.A15(notificationManagerA07, this.channelName, MessageDraftSenderKt.NOTIFICATION_CHANNEL_ID, 4);
            EG6 eg6 = new EG6(context, MessageDraftSenderKt.NOTIFICATION_CHANNEL_ID);
            eg6.A03(R.drawable.ic_dialog_email);
            eg6.A08(String.format(this.notificationTitleFormat, Arrays.copyOf(new Object[]{str}, 1)));
            String strSanitizeForNotificationOrNull = HatchStringUtils.INSTANCE.sanitizeForNotificationOrNull(str2);
            if (strSanitizeForNotificationOrNull == null) {
                strSanitizeForNotificationOrNull = context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120b8c);
            }
            eg6.A07(BQG.A17(strSanitizeForNotificationOrNull, 100));
            eg6.A02();
            eg6.A09 = activity;
            eg6.A04 = 1;
            notificationManagerA07.notify(iIncrementAndGet, C60Q.A07(eg6));
            CFK.A05(MessageDraftSenderKt.TAG, "SMS draft notification posted");
            return new MessageDraftResult(true, context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120d21), null, null, null);
        } catch (Exception e) {
            C3cH.A1B("Failed to post SMS draft notification: ", e.getMessage(), MessageDraftSenderKt.TAG, e);
            return new MessageDraftResult(false, context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120d20), null, null, null);
        }
    }

    public IntentMessageDraftSender(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.channelName = str;
        this.notificationTitleFormat = str2;
    }
}
