package com.facebook.aura.conversation.api;

import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.analytics.hatch.HatchClientCvmSendMessageHook;
import com.facebook.aura.nudge.ConversationNudgeUserMessageHook;

/* loaded from: classes3.dex */
public class ConversationUserMessageHookStatic {
    public static void onUserMessageSent(int i) {
        if (i == 0) {
            HatchClientCvmSendMessageHook.INSTANCE.onUserMessageSent();
        } else {
            if (i != 1) {
                throw AnonymousClass005.A0c(i);
            }
            ConversationNudgeUserMessageHook.INSTANCE.onUserMessageSent();
        }
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
