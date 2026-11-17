package com.facebook.aura.notifications.push;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import X.C7m8;
import X.C8fD;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.secure.receiver.InternalStaticBroadcastReceiver;

/* loaded from: classes3.dex */
public final class HatchNotificationDismissReceiver extends InternalStaticBroadcastReceiver {
    public static final Companion Companion = new Companion();
    public static final String EXTRA_INAPP_NOTIF_ID = "hatch_inapp_notif_id";
    public static final String EXTRA_NDID = "hatch_notif_ndid";
    public static final String EXTRA_NOTIF_CHANNEL = "hatch_notif_channel";
    public static final String EXTRA_NOTIF_ORIGIN = "hatch_notif_origin";
    public static final String EXTRA_NOTIF_TYPE = "hatch_notif_type";
    public static final String EXTRA_THREAD_KEY = "hatch_notif_thread_key";

    public final class Companion {
        public final PendingIntent createPendingIntent(Context context, int i, String str, String str2, HatchNotificationOrigin hatchNotificationOrigin, HatchNotificationChannel hatchNotificationChannel, String str3, String str4) {
            C7384Etj.A0Y(context, 0);
            AnonymousClass003.A0y(hatchNotificationOrigin, hatchNotificationChannel);
            Intent intent = new Intent(context, (Class<?>) HatchNotificationDismissReceiver.class);
            intent.putExtra("hatch_notif_ndid", str);
            intent.putExtra("hatch_notif_type", str2);
            intent.putExtra("hatch_notif_origin", hatchNotificationOrigin.getValue());
            intent.putExtra("hatch_notif_channel", hatchNotificationChannel.getValue());
            intent.putExtra("hatch_inapp_notif_id", str3);
            intent.putExtra(HatchNotificationDismissReceiver.EXTRA_THREAD_KEY, str4);
            C7m8 c7m8 = new C7m8();
            c7m8.A06(intent, context.getClassLoader());
            c7m8.A01 = true;
            return c7m8.A02(context, i, 1140850688);
        }

        public static /* synthetic */ PendingIntent createPendingIntent$default(Companion companion, Context context, int i, String str, String str2, HatchNotificationOrigin hatchNotificationOrigin, HatchNotificationChannel hatchNotificationChannel, String str3, String str4, int i2, Object obj) {
            if ((i2 & 64) != 0) {
                str3 = null;
            }
            if ((i2 & 128) != 0) {
                str4 = null;
            }
            return companion.createPendingIntent(context, i, str, str2, hatchNotificationOrigin, hatchNotificationChannel, str3, str4);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // com.facebook.secure.receiver.StaticBroadcastReceiverBase
    public void doReceive(Context context, Intent intent, C8fD c8fD) {
        HatchNotificationOrigin hatchNotificationOrigin;
        HatchNotificationChannel hatchNotificationChannel;
        AbstractC3358CGz currentSession;
        C7384Etj.A0Y(intent, 1);
        String stringExtra = intent.getStringExtra("hatch_notif_ndid");
        String stringExtra2 = intent.getStringExtra("hatch_inapp_notif_id");
        String stringExtra3 = intent.getStringExtra("hatch_notif_type");
        String stringExtra4 = intent.getStringExtra("hatch_notif_origin");
        HatchNotificationOrigin[] hatchNotificationOriginArrValues = HatchNotificationOrigin.values();
        int length = hatchNotificationOriginArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                hatchNotificationOrigin = HatchNotificationOrigin.SERVER;
                break;
            }
            hatchNotificationOrigin = hatchNotificationOriginArrValues[i2];
            if (C7384Etj.areEqual(hatchNotificationOrigin.getValue(), stringExtra4)) {
                break;
            } else {
                i2++;
            }
        }
        String stringExtra5 = intent.getStringExtra("hatch_notif_channel");
        HatchNotificationChannel[] hatchNotificationChannelArrValues = HatchNotificationChannel.values();
        int length2 = hatchNotificationChannelArrValues.length;
        while (true) {
            if (i >= length2) {
                hatchNotificationChannel = HatchNotificationChannel.PUSH;
                break;
            }
            hatchNotificationChannel = hatchNotificationChannelArrValues[i];
            if (C7384Etj.areEqual(hatchNotificationChannel.getValue(), stringExtra5)) {
                break;
            } else {
                i++;
            }
        }
        HatchNotificationEventsLogger.INSTANCE.logDismiss(hatchNotificationChannel, stringExtra3, hatchNotificationOrigin, stringExtra, stringExtra2);
        String stringExtra6 = intent.getStringExtra(EXTRA_THREAD_KEY);
        if (stringExtra6 == null || (currentSession = AuraSessionManager.INSTANCE.getCurrentSession()) == null) {
            return;
        }
        ConversationNotificationState.Companion.getInstance(currentSession).clear(stringExtra6);
    }
}
