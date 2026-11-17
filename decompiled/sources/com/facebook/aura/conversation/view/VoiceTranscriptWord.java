package com.facebook.aura.conversation.view;

import X.C7384Etj;

/* loaded from: classes.dex */
public final class VoiceTranscriptWord {
    public final long appearedAtMs;
    public final int end;
    public final int start;
    public final String text;

    public VoiceTranscriptWord(String str, int i, int i2, long j) {
        C7384Etj.A0Y(str, 0);
        this.text = str;
        this.start = i;
        this.end = i2;
        this.appearedAtMs = j;
    }

    public final long getAppearedAtMs() {
        return this.appearedAtMs;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final String getText() {
        return this.text;
    }
}
