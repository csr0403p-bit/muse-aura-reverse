package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class ConversationTurn {
    public final AHD<HatchConversationListItem> items;
    public final String turnKey;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationTurn(AHD<? extends HatchConversationListItem> ahd, String str) {
        C7384Etj.A0Y(ahd, 0);
        this.items = ahd;
        this.turnKey = str;
    }

    public final AHD<HatchConversationListItem> getItems() {
        return this.items;
    }

    public final String getTurnKey() {
        return this.turnKey;
    }
}
