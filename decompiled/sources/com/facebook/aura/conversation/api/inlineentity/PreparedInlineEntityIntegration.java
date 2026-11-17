package com.facebook.aura.conversation.api.inlineentity;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class PreparedInlineEntityIntegration {
    public final ConversationInlineEntityIntegration integration;
    public final ConversationInlineEntityState state;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreparedInlineEntityIntegration)) {
            return false;
        }
        PreparedInlineEntityIntegration preparedInlineEntityIntegration = (PreparedInlineEntityIntegration) obj;
        return C7384Etj.areEqual(this.integration, preparedInlineEntityIntegration.integration) && C7384Etj.areEqual(this.state, preparedInlineEntityIntegration.state);
    }

    public final ConversationInlineEntityIntegration getIntegration() {
        return this.integration;
    }

    public final ConversationInlineEntityState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, AnonymousClass005.A0E(this.integration));
    }

    public PreparedInlineEntityIntegration(ConversationInlineEntityIntegration conversationInlineEntityIntegration, ConversationInlineEntityState conversationInlineEntityState) {
        AnonymousClass003.A0u(conversationInlineEntityIntegration, conversationInlineEntityState);
        this.integration = conversationInlineEntityIntegration;
        this.state = conversationInlineEntityState;
    }
}
