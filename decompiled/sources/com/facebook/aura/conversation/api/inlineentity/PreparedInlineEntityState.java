package com.facebook.aura.conversation.api.inlineentity;

import X.AHD;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class PreparedInlineEntityState implements ConversationInlineEntityState {
    public final AHD<PreparedInlineEntityIntegration> integrations;

    public PreparedInlineEntityState(AHD<PreparedInlineEntityIntegration> ahd) {
        C7384Etj.A0Y(ahd, 0);
        this.integrations = ahd;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PreparedInlineEntityState) && C7384Etj.areEqual(this.integrations, ((PreparedInlineEntityState) obj).integrations);
        }
        return true;
    }

    public final AHD<PreparedInlineEntityIntegration> getIntegrations() {
        return this.integrations;
    }

    public int hashCode() {
        return this.integrations.hashCode();
    }
}
