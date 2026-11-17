package com.facebook.aura.partners.voice.impl;

import X.AnonymousClass005;
import X.C60O;

/* loaded from: classes6.dex */
public final class PreConnectHandoff {
    public final long callGeneration;
    public final String messageId;
    public final StringBuilder serverText;
    public final String shownText;
    public final String turnId;

    public final long getCallGeneration() {
        return this.callGeneration;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final StringBuilder getServerText() {
        return this.serverText;
    }

    public final String getShownText() {
        return this.shownText;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public PreConnectHandoff(String str, String str2, String str3, long j) {
        AnonymousClass005.A0x(str, str2, str3);
        this.messageId = str;
        this.turnId = str2;
        this.shownText = str3;
        this.callGeneration = j;
        this.serverText = C60O.A0w();
    }
}
