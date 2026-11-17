package com.facebook.aura.partners.voice.session.impl;

import X.C7384Etj;

/* loaded from: classes2.dex */
public final class CallStartWait {
    public String awaitedStem;
    public final String callId;

    public CallStartWait(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.callId = str;
        this.awaitedStem = str2;
    }

    public final String getAwaitedStem() {
        return this.awaitedStem;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final void setAwaitedStem(String str) {
        this.awaitedStem = str;
    }
}
