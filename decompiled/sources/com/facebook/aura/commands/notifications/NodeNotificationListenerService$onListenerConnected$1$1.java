package com.facebook.aura.commands.notifications;

import X.AbstractC7559F3s;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import android.service.notification.StatusBarNotification;

/* loaded from: classes3.dex */
public final class NodeNotificationListenerService$onListenerConnected$1$1 extends AbstractC7559F3s implements G0U<StatusBarNotification, Boolean> {
    public final /* synthetic */ NodeNotificationListenerService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeNotificationListenerService$onListenerConnected$1$1(NodeNotificationListenerService nodeNotificationListenerService) {
        super(1);
        this.this$0 = nodeNotificationListenerService;
    }

    @Override // X.G0U
    public final Boolean invoke(StatusBarNotification statusBarNotification) {
        HatchNotificationFilterManager hatchNotificationFilterManager = this.this$0.filterManager;
        boolean z = false;
        if (hatchNotificationFilterManager != null) {
            C7384Etj.A0X(statusBarNotification);
            if (!hatchNotificationFilterManager.shouldBlock(statusBarNotification)) {
                z = true;
            }
        }
        return C3cG.A0P(z);
    }
}
