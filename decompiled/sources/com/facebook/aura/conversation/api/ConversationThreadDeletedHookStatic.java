package com.facebook.aura.conversation.api;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import com.facebook.aura.conversation.viewmodel.HatchComposerDraftThreadDeletedHook;
import com.facebook.aura.partners.voice.session.impl.VoiceThreadDeletedHook;

/* loaded from: classes3.dex */
public class ConversationThreadDeletedHookStatic {
    public static void onThreadDeleted(int i, AbstractC3358CGz abstractC3358CGz, String str) {
        if (i == 0) {
            HatchComposerDraftThreadDeletedHook.INSTANCE.onThreadDeleted(abstractC3358CGz, str);
        } else {
            if (i != 1) {
                throw AnonymousClass005.A0c(i);
            }
            VoiceThreadDeletedHook.INSTANCE.onThreadDeleted(abstractC3358CGz, str);
        }
    }

    public static int[] getKeys() {
        return AnonymousClass003.A1a();
    }
}
