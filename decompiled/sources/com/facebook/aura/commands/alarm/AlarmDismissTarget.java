package com.facebook.aura.commands.alarm;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class AlarmDismissTarget {
    public final String alarmId;
    public final String messageLabel;

    public final String getAlarmId() {
        return this.alarmId;
    }

    public final String getMessageLabel() {
        return this.messageLabel;
    }

    public AlarmDismissTarget(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.alarmId = str;
        this.messageLabel = str2;
    }
}
