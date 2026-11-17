package com.facebook.aura.commands.notifications;

import X.AbstractC0882AGj;
import X.C2nw;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class NotificationsDataSourceKt {
    public static final int MAX_BATCH_SIZE = 50;
    public static final String TAG = "NotificationsDataSource";

    public static final JsonObject buildCurrentTrayPayload(Context context) {
        C7384Etj.A0Y(context, 0);
        NotificationRepoImpl notificationRepoImpl = NotificationRepoHolder.repo;
        if (notificationRepoImpl == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<StatusBarNotification> activeNotifications = notificationRepoImpl.activeProvider.getActiveNotifications();
        ArrayList arrayListA0h = C3cG.A0h();
        for (StatusBarNotification statusBarNotification : activeNotifications) {
            if (!NotificationSerializer.INSTANCE.isSelfNotification(statusBarNotification, context)) {
                arrayListA0h.add(statusBarNotification);
            }
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            if (!NotificationSerializer.INSTANCE.isSystemNoise((StatusBarNotification) obj)) {
                arrayListA0h2.add(obj);
            }
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator it = arrayListA0h2.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(NotificationSerializer.INSTANCE.toJson((StatusBarNotification) it.next(), context), arrayListA0h3);
        }
        C2nw c2nwA02 = C7qW.A02();
        C7pd c7pdA02 = C7pd.A02(Long.valueOf(jCurrentTimeMillis), "syncedAt", c2nwA02);
        Iterator it2 = arrayListA0h3.iterator();
        while (it2.hasNext()) {
            c7pdA02.A06(C60Q.A11(it2));
        }
        return C60O.A1I("notifications", C7pd.A00(c7pdA02), c2nwA02);
    }
}
