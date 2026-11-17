package com.facebook.aura.notifications.push.api;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C7502EyJ;
import X.EG6;
import android.content.Context;
import com.facebook.aura.watchhandoff.WatchConversationNotificationContributor;

/* loaded from: classes3.dex */
public class ConversationNotificationContributorStatic {
    public static void contribute(int i, Context context, AbstractC3358CGz abstractC3358CGz, EG6 eg6, C7502EyJ c7502EyJ, int i2, String str) {
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        WatchConversationNotificationContributor.INSTANCE.contribute(context, abstractC3358CGz, eg6, c7502EyJ, i2, str);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
