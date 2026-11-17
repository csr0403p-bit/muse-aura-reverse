package com.facebook.aura.partners.voice.api;

/* loaded from: classes2.dex */
public final class TtsStreamStats {
    public static final int $stable = 8;
    public int audioFrames;
    public long bytes;
    public int doneFrames;
    public int invalidAudioFrames;
    public int malformedFrames;
    public int otherFrames;
    public int oversizedLines;

    public final int getAudioFrames() {
        return this.audioFrames;
    }

    public final long getBytes() {
        return this.bytes;
    }

    public final int getDoneFrames() {
        return this.doneFrames;
    }

    public final int getInvalidAudioFrames() {
        return this.invalidAudioFrames;
    }

    public final int getMalformedFrames() {
        return this.malformedFrames;
    }

    public final int getOtherFrames() {
        return this.otherFrames;
    }

    public final int getOversizedLines() {
        return this.oversizedLines;
    }

    public final void setAudioFrames(int i) {
        this.audioFrames = i;
    }

    public final void setBytes(long j) {
        this.bytes = j;
    }

    public final void setDoneFrames(int i) {
        this.doneFrames = i;
    }

    public final void setInvalidAudioFrames(int i) {
        this.invalidAudioFrames = i;
    }

    public final void setMalformedFrames(int i) {
        this.malformedFrames = i;
    }

    public final void setOtherFrames(int i) {
        this.otherFrames = i;
    }

    public final void setOversizedLines(int i) {
        this.oversizedLines = i;
    }
}
