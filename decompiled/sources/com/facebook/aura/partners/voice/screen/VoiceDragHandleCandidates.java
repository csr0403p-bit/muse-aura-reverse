package com.facebook.aura.partners.voice.screen;

import X.C06G;

/* loaded from: classes4.dex */
public final class VoiceDragHandleCandidates extends C06G {
    public static final int $stable = 0;
    public final int onDarkArt;
    public final int onLightArt;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoiceDragHandleCandidates) {
                VoiceDragHandleCandidates voiceDragHandleCandidates = (VoiceDragHandleCandidates) obj;
                if (this.onLightArt != voiceDragHandleCandidates.onLightArt || this.onDarkArt != voiceDragHandleCandidates.onDarkArt) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoiceDragHandleCandidates copy$default(VoiceDragHandleCandidates voiceDragHandleCandidates, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = voiceDragHandleCandidates.onLightArt;
        }
        if ((i3 & 2) != 0) {
            i2 = voiceDragHandleCandidates.onDarkArt;
        }
        return new VoiceDragHandleCandidates(i, i2);
    }

    public final int component1() {
        return this.onLightArt;
    }

    public final int component2() {
        return this.onDarkArt;
    }

    public final VoiceDragHandleCandidates copy(int i, int i2) {
        return new VoiceDragHandleCandidates(i, i2);
    }

    public final int getOnDarkArt() {
        return this.onDarkArt;
    }

    public final int getOnLightArt() {
        return this.onLightArt;
    }

    public int hashCode() {
        return (this.onLightArt * 31) + this.onDarkArt;
    }

    public VoiceDragHandleCandidates(int i, int i2) {
        this.onLightArt = i;
        this.onDarkArt = i2;
    }

    public String toString() {
        return super.toString();
    }
}
