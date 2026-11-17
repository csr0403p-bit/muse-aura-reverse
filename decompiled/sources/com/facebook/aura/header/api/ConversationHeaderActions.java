package com.facebook.aura.header.api;

import X.AnonymousClass005;
import com.facebook.aura.partners.voice.chrome.VoiceConversationHeaderActionProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ConversationHeaderActions {
    public static final int $stable = 0;
    public static final ConversationHeaderActions INSTANCE = new ConversationHeaderActions();

    public final List<ConversationHeaderActionContributor> contributors() {
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(VoiceConversationHeaderActionProvider.INSTANCE.contributor());
        return arrayList;
    }
}
