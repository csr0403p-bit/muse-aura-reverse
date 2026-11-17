package com.facebook.aura.conversation.repo;

import X.C60O;
import X.C7384Etj;
import com.facebook.aura.livesession.api.LiveConversationReplies;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageRole;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ConversationReplies implements LiveConversationReplies {
    public final HatchConversationState state;

    public ConversationReplies(HatchConversationState hatchConversationState) {
        C7384Etj.A0Y(hatchConversationState, 0);
        this.state = hatchConversationState;
    }

    @Override // com.facebook.aura.livesession.api.LiveConversationReplies
    public String agentMessageText(String str) {
        Object next;
        HatchMessage next2;
        C7384Etj.A0Y(str, 0);
        Iterator itA14 = C60O.A14(this.state);
        while (true) {
            if (!itA14.hasNext()) {
                next = null;
                break;
            }
            next = itA14.next();
            HatchMessage hatchMessage = (HatchMessage) next;
            if (str.equals(hatchMessage.id) && hatchMessage.role == HatchMessageRole.AGENT) {
                break;
            }
        }
        HatchMessage hatchMessage2 = (HatchMessage) next;
        if (hatchMessage2 == null) {
            Iterator<HatchMessage> it = this.state.history.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                HatchMessage hatchMessage3 = next2;
                if (str.equals(hatchMessage3.id) && hatchMessage3.role == HatchMessageRole.AGENT) {
                    break;
                }
            }
            hatchMessage2 = next2;
            if (hatchMessage2 == null) {
                return null;
            }
        }
        return hatchMessage2.content;
    }

    @Override // com.facebook.aura.livesession.api.LiveConversationReplies
    public String getStreamingMessageId() {
        return this.state.streamingMessageId;
    }

    @Override // com.facebook.aura.livesession.api.LiveConversationReplies
    public boolean isStreamDone() {
        return this.state.streamingState == StreamingState.Done;
    }
}
