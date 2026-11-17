package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C7384Etj;
import X.C7502EyJ;
import X.EG6;
import X.EG7;
import X.EGD;
import android.content.Context;
import com.facebook.aura.notifications.push.NotificationReplyReceiver;
import com.facebook.aura.notifications.push.api.ConversationNotificationContributor;

/* loaded from: classes3.dex */
public final class WatchConversationNotificationContributor implements ConversationNotificationContributor {
    public static final int $stable = 0;
    public static final WatchConversationNotificationContributor INSTANCE = new WatchConversationNotificationContributor();

    @Override // com.facebook.aura.notifications.push.api.ConversationNotificationContributor
    public void contribute(Context context, AbstractC3358CGz abstractC3358CGz, EG6 eg6, C7502EyJ c7502EyJ, int i, String str) {
        String strLinkedWatchNode;
        AnonymousClass003.A0v(context, eg6);
        C7384Etj.A0Y(str, 5);
        EGD egdA00 = NotificationReplyReceiver.Companion.replyAction(context, i, str, true).A00();
        EG7 eg7 = new EG7();
        eg7.A0C.add(egdA00);
        if (str.equals("main") && (strLinkedWatchNode = WatchSessionHandoffLink.INSTANCE.linkedWatchNode()) != null && WatchOpenChatSupport.INSTANCE.supports(context, strLinkedWatchNode)) {
            eg7.A0C.add(WatchChatOpenReceiver.Companion.action(context));
        }
        eg7.A00(eg6);
    }
}
