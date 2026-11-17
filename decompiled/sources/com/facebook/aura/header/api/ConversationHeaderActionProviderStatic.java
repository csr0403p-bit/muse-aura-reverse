package com.facebook.aura.header.api;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.chrome.VoiceConversationHeaderActionProvider;

/* loaded from: classes.dex */
public class ConversationHeaderActionProviderStatic {
    public static ConversationHeaderActionContributor contributor(int i) {
        if (i == 0) {
            return VoiceConversationHeaderActionProvider.INSTANCE.contributor();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
