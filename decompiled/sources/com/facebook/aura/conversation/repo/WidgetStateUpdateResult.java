package com.facebook.aura.conversation.repo;

import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.HatchMessage;
import java.util.List;

/* loaded from: classes3.dex */
public final class WidgetStateUpdateResult {
    public final boolean changed;
    public final boolean found;
    public final List<HatchMessage> messages;
    public final HatchMessage updatedMessage;

    public /* synthetic */ WidgetStateUpdateResult(List list, boolean z, boolean z2, HatchMessage hatchMessage, int i, C06H c06h) {
        this(list, z, z2, (i & 8) != 0 ? null : hatchMessage);
    }

    public final boolean getChanged() {
        return this.changed;
    }

    public final boolean getFound() {
        return this.found;
    }

    public final List<HatchMessage> getMessages() {
        return this.messages;
    }

    public final HatchMessage getUpdatedMessage() {
        return this.updatedMessage;
    }

    public WidgetStateUpdateResult(List<HatchMessage> list, boolean z, boolean z2, HatchMessage hatchMessage) {
        C7384Etj.A0Y(list, 0);
        this.messages = list;
        this.found = z;
        this.changed = z2;
        this.updatedMessage = hatchMessage;
    }
}
