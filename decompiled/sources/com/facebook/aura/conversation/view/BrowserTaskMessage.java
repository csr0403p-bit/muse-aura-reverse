package com.facebook.aura.conversation.view;

import X.AnonymousClass003;

/* loaded from: classes2.dex */
public final class BrowserTaskMessage {
    public final int index;
    public final String messageKey;
    public final String taskId;

    public final int getIndex() {
        return this.index;
    }

    public final String getMessageKey() {
        return this.messageKey;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public BrowserTaskMessage(int i, String str, String str2) {
        AnonymousClass003.A0x(str, str2);
        this.index = i;
        this.messageKey = str;
        this.taskId = str2;
    }
}
