package com.facebook.aura.conversation.viewmodel;

import X.C7384Etj;
import com.facebook.aura.model.HatchMessageRole;

/* loaded from: classes.dex */
public final class MessageGroupTracker {
    public String prevCorrelationId;
    public int prevIndex = -1;
    public HatchMessageRole prevRole;
    public long prevTimestamp;

    public final void advance(int i, HatchMessageRole hatchMessageRole, String str, long j) {
        C7384Etj.A0Y(hatchMessageRole, 1);
        this.prevIndex = i;
        this.prevRole = hatchMessageRole;
        this.prevCorrelationId = str;
        this.prevTimestamp = j;
    }

    public final void reset() {
        this.prevIndex = -1;
        this.prevRole = null;
        this.prevCorrelationId = null;
        this.prevTimestamp = 0L;
    }

    public final String getPrevCorrelationId() {
        return this.prevCorrelationId;
    }

    public final int getPrevIndex() {
        return this.prevIndex;
    }

    public final HatchMessageRole getPrevRole() {
        return this.prevRole;
    }

    public final long getPrevTimestamp() {
        return this.prevTimestamp;
    }
}
