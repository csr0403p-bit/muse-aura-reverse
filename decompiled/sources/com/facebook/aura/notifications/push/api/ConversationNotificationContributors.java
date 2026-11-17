package com.facebook.aura.notifications.push.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import X.C7502EyJ;
import X.CFK;
import X.EG6;
import X.FGI;
import android.content.Context;
import com.facebook.aura.watchhandoff.WatchConversationNotificationContributor;

/* loaded from: classes3.dex */
public final class ConversationNotificationContributors {
    public static final ConversationNotificationContributors INSTANCE = new ConversationNotificationContributors();

    public final void contribute(Context context, AbstractC3358CGz abstractC3358CGz, EG6 eg6, C7502EyJ c7502EyJ, int i, String str) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(abstractC3358CGz, eg6, c7502EyJ, 1);
        C7384Etj.A0Y(str, 5);
        int i2 = new int[]{0}[0];
        try {
            if (i2 != 0) {
                throw C60O.A0i(String.format("No implementation bound to key: %s", Integer.valueOf(i2)));
            }
            WatchConversationNotificationContributor.INSTANCE.contribute(context, abstractC3358CGz, eg6, c7502EyJ, i, str);
        } catch (Exception e) {
            CFK.A0L(ConversationNotificationContributorKt.TAG, e, FGI.A0I("Conversation notification contributor ", i2, " failed"));
        }
    }
}
