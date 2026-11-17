package com.facebook.aura.commands.notifications;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.PhoneNotificationsAccessMode;

/* loaded from: classes3.dex */
public final class BlockedAppsNotificationFilter implements NotificationFilter {
    @Override // com.facebook.aura.commands.notifications.NotificationFilter
    public boolean shouldBlock(StatusBarNotification statusBarNotification) {
        C7384Etj.A0Y(statusBarNotification, 0);
        String packageName = statusBarNotification.getPackageName();
        C7384Etj.A0U(packageName);
        return shouldBlockPackage(packageName);
    }

    @Override // com.facebook.aura.commands.notifications.NotificationFilter
    public boolean shouldBlockPackage(String str) {
        C7384Etj.A0Y(str, 0);
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            return false;
        }
        HatchGatewayPrefsStore hatchGatewayPrefsStoreA0D = C3cG.A0D(currentUserSession);
        int iOrdinal = hatchGatewayPrefsStoreA0D.getPhoneNotificationsAccessMode().ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return hatchGatewayPrefsStoreA0D.getPhoneNotificationsAccessBlockedApps().contains(str);
        }
        throw C3cG.A0q();
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PhoneNotificationsAccessMode.values().length];
            try {
                AnonymousClass002.A13(PhoneNotificationsAccessMode.ALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PhoneNotificationsAccessMode.SELECTED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
