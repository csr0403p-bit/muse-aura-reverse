package com.facebook.aura.devices.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass801;
import android.content.Context;

/* loaded from: classes.dex */
public class ConversationSendHookStatic {
    public static int[] getKeys() {
        return new int[]{0, 1, 2};
    }

    public static void onUserSentMessage(int i, Context context, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass801.A0X(i, context, abstractC3358CGz);
    }
}
