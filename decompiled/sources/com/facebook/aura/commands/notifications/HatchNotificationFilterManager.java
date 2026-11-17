package com.facebook.aura.commands.notifications;

import X.AnonymousClass001;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.mdm.AuraManagedConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchNotificationFilterManager {
    public final Context appContext;
    public final List<NotificationFilter> filters;

    public HatchNotificationFilterManager(Context context) {
        C7384Etj.A0Y(context, 0);
        Context contextA0I = AnonymousClass001.A0I(context);
        this.appContext = contextA0I;
        this.filters = Arrays.asList(new WorkAppNotificationFilter(context), new BlockedAppsNotificationFilter());
        WorkFilterPolicyWatch.INSTANCE.ensureRegistered(contextA0I);
    }

    public final List<StatusBarNotification> filter(List<? extends StatusBarNotification> list) {
        C7384Etj.A0Y(list, 0);
        if (AuraManagedConfig.INSTANCE.isNotificationIngestionDisabled(this.appContext)) {
            return C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (StatusBarNotification statusBarNotification : list) {
            if (!shouldBlock(statusBarNotification)) {
                arrayListA0h.add(statusBarNotification);
            }
        }
        return arrayListA0h;
    }

    public final boolean shouldBlock(StatusBarNotification statusBarNotification) {
        C7384Etj.A0Y(statusBarNotification, 0);
        if (AuraManagedConfig.INSTANCE.isNotificationIngestionDisabled(this.appContext)) {
            return true;
        }
        List<NotificationFilter> list = this.filters;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<NotificationFilter> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().shouldBlock(statusBarNotification)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean shouldBlockPackage(String str) {
        C7384Etj.A0Y(str, 0);
        if (AuraManagedConfig.INSTANCE.isNotificationIngestionDisabled(this.appContext)) {
            return true;
        }
        List<NotificationFilter> list = this.filters;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<NotificationFilter> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().shouldBlockPackage(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
