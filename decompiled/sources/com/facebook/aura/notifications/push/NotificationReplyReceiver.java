package com.facebook.aura.notifications.push;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7380Etd;
import X.C7390EuO;
import X.C7502EyJ;
import X.C7BY;
import X.CFK;
import X.EFx;
import X.EFz;
import X.EG6;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat$MessagingStyle;
import com.facebook.aura.R;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class NotificationReplyReceiver extends BroadcastReceiver {
    public static final String ACTION_REPLY_ON_ANOTHER_DEVICE = "com.facebook.aura.notifications.push.REPLY_ON_ANOTHER_DEVICE";
    public static final Companion Companion = new Companion();
    public static final String EXTRA_NOTIFICATION_ID = "extra_notification_id";
    public static final String EXTRA_THREAD_KEY = "extra_thread_key";
    public static final String KEY_TEXT_REPLY = "key_text_reply";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CharSequence charSequence;
        String string;
        boolean zA1a = AnonymousClass002.A1a(context, intent);
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence(KEY_TEXT_REPLY)) == null || (string = charSequence.toString()) == null || C7BY.A0j(string)) {
            return;
        }
        int intExtra = intent.getIntExtra("extra_notification_id", 0);
        String stringExtra = intent.getStringExtra("extra_thread_key");
        if (stringExtra == null) {
            stringExtra = "main";
        }
        boolean zEquals = ACTION_REPLY_ON_ANOTHER_DEVICE.equals(intent.getAction());
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            CFK.A06(NotificationReplyReceiverKt.TAG, "No user session, cannot send reply");
            return;
        }
        ConversationNotificationState companion = ConversationNotificationState.Companion.getInstance(currentUserSession);
        EFx userPerson = companion.getUserPerson(context);
        companion.addMessage(stringExtra, string, System.currentTimeMillis(), userPerson);
        companion.recordReply(stringExtra, zEquals);
        CFK.A02(stringExtra, Boolean.valueOf(zEquals), NotificationReplyReceiverKt.TAG, "Reply received: threadKey=%s fromAnotherDevice=%s");
        NotificationCompat$MessagingStyle notificationCompat$MessagingStyle = new NotificationCompat$MessagingStyle(userPerson);
        Iterator<EFz> it = companion.recentMessages(stringExtra).iterator();
        while (it.hasNext()) {
            notificationCompat$MessagingStyle.A06(it.next());
        }
        EG6 eg6A08 = C3cI.A08(context, AuraNotificationChannels.CONVERSATIONS);
        eg6A08.A06(notificationCompat$MessagingStyle);
        eg6A08.A0L = AuraConversationShortcut.SHORTCUT_ID;
        eg6A08.A0I = "msg";
        eg6A08.A02();
        Notification notification = eg6A08.A07;
        int i = notification.flags;
        int i2 = i & (-9);
        if (zEquals) {
            i2 = i | 8;
        }
        notification.flags = i2;
        eg6A08.A04 = zA1a ? 1 : 0;
        new C7380Etd(context).A01(null, intExtra, C60Q.A07(eg6A08));
        NotificationReplyService.Companion.enqueue(context, string, intExtra, stringExtra);
    }

    public final class Companion {
        public final C7502EyJ replyAction(Context context, int i, String str, boolean z) {
            AnonymousClass003.A0v(context, str);
            String string = context.getString(R.string._name_removed__res_0x7f120b8e);
            Intent intent = new Intent(context, (Class<?>) NotificationReplyReceiver.class);
            if (z) {
                intent.setAction(NotificationReplyReceiver.ACTION_REPLY_ON_ANOTHER_DEVICE);
            }
            intent.putExtra("extra_notification_id", i);
            intent.putExtra("extra_thread_key", str);
            C7502EyJ c7502EyJ = new C7502EyJ(PendingIntent.getBroadcast(context, i, intent, 167772160), string, R.drawable.hatch_notification_icon);
            C7390EuO c7390EuO = new C7390EuO(new Bundle(), string, C60O.A13());
            ArrayList<C7390EuO> arrayListA0h = c7502EyJ.A00;
            if (arrayListA0h == null) {
                arrayListA0h = C3cG.A0h();
                c7502EyJ.A00 = arrayListA0h;
            }
            arrayListA0h.add(c7390EuO);
            return c7502EyJ;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
