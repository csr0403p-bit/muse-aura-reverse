package com.facebook.aura.commands.alarm;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class ReminderDismissTarget {
    public final String messageLabel;
    public final String reminderId;

    public final String getMessageLabel() {
        return this.messageLabel;
    }

    public final String getReminderId() {
        return this.reminderId;
    }

    public ReminderDismissTarget(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.reminderId = str;
        this.messageLabel = str2;
    }
}
