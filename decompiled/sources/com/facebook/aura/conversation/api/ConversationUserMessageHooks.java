package com.facebook.aura.conversation.api;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.analytics.hatch.HatchClientCvmSendMessageHook;
import com.facebook.aura.nudge.ConversationNudgeUserMessageHook;

/* loaded from: classes3.dex */
public final class ConversationUserMessageHooks {
    public static final int $stable = 0;
    public static final ConversationUserMessageHooks INSTANCE = new ConversationUserMessageHooks();

    public final void notifySent() {
        int[] iArrA1a = AnonymousClass003.A1a();
        int i = 0;
        do {
            int i2 = iArrA1a[i];
            if (i2 == 0) {
                HatchClientCvmSendMessageHook.INSTANCE.onUserMessageSent();
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                ConversationNudgeUserMessageHook.INSTANCE.onUserMessageSent();
            }
            i++;
        } while (i < 2);
    }
}
