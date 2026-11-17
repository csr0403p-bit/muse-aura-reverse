package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import com.facebook.aura.conversation.viewmodel.HatchComposerDraftThreadDeletedHook;
import com.facebook.aura.partners.voice.session.impl.VoiceThreadDeletedHook;

/* loaded from: classes3.dex */
public final class ConversationThreadDeletedHooks {
    public static final int $stable = 0;
    public static final ConversationThreadDeletedHooks INSTANCE = new ConversationThreadDeletedHooks();

    public final void notifyDeleted(AbstractC3358CGz abstractC3358CGz, String str) {
        int[] iArr = {0, AnonymousClass002.A1a(abstractC3358CGz, str)};
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 == 0) {
                HatchComposerDraftThreadDeletedHook.INSTANCE.onThreadDeleted(abstractC3358CGz, str);
            } else {
                if (i2 != 1) {
                    throw AnonymousClass005.A0c(i2);
                }
                VoiceThreadDeletedHook.INSTANCE.onThreadDeleted(abstractC3358CGz, str);
            }
            i++;
        } while (i < 2);
    }
}
