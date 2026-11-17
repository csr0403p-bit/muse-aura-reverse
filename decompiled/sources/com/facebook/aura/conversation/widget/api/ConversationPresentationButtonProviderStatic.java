package com.facebook.aura.conversation.widget.api;

import X.AnonymousClass005;
import com.facebook.aura.email.view.EmailSetupButtonProvider;

/* loaded from: classes3.dex */
public class ConversationPresentationButtonProviderStatic {
    public static ConversationPresentationButtonPolicy policy(int i) {
        if (i == 0) {
            return EmailSetupButtonProvider.INSTANCE.policy();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
