package com.facebook.aura.gateway;

import X.C7384Etj;
import com.facebook.aura.model.HatchMessage;

/* loaded from: classes3.dex */
public final class HatchChatHandler$parseChatEventsToMessages$MessageEntry {
    public HatchMessage message;
    public long sortSeq;

    public HatchChatHandler$parseChatEventsToMessages$MessageEntry(long j, HatchMessage hatchMessage) {
        C7384Etj.A0Y(hatchMessage, 1);
        this.sortSeq = j;
        this.message = hatchMessage;
    }

    public final void setMessage(HatchMessage hatchMessage) {
        C7384Etj.A0Y(hatchMessage, 0);
        this.message = hatchMessage;
    }

    public final HatchMessage getMessage() {
        return this.message;
    }

    public final long getSortSeq() {
        return this.sortSeq;
    }

    public final void setSortSeq(long j) {
        this.sortSeq = j;
    }
}
