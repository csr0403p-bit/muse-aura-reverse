package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.conversation.api.ConversationThreadDeletedHook;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;

/* loaded from: classes2.dex */
public final class VoiceThreadDeletedHook implements ConversationThreadDeletedHook {
    public static final VoiceThreadDeletedHook INSTANCE = new VoiceThreadDeletedHook();

    @Override // com.facebook.aura.conversation.api.ConversationThreadDeletedHook
    public void onThreadDeleted(AbstractC3358CGz abstractC3358CGz, String str) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        VoiceCallStateHolder voiceCallStateHolderA0K = C3cG.A0K(abstractC3358CGz);
        if (C3cH.A1P(voiceCallStateHolderA0K) && C7384Etj.areEqual(voiceCallStateHolderA0K.activeThreadId.getValue(), str)) {
            voiceCallStateHolderA0K.requestEndCall(null, null, "thread_deleted");
        }
    }
}
