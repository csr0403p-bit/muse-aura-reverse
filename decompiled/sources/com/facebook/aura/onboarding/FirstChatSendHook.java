package com.facebook.aura.onboarding;

import X.AbstractC3358CGz;
import X.C7384Etj;
import android.content.Context;
import com.facebook.aura.devices.intf.ConversationSendHook;

/* loaded from: classes3.dex */
public final class FirstChatSendHook implements ConversationSendHook {
    public static final FirstChatSendHook INSTANCE = new FirstChatSendHook();

    @Override // com.facebook.aura.devices.intf.ConversationSendHook
    public void onUserSentMessage(Context context, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 1);
        FirstChatLogging firstChatLogging = (FirstChatLogging) abstractC3358CGz.A02(FirstChatLogging.class);
        if (firstChatLogging != null) {
            firstChatLogging.onUserMessageSent();
        }
    }
}
