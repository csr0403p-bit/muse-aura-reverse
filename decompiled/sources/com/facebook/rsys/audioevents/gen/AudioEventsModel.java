package com.facebook.rsys.audioevents.gen;

import X.AbstractC7610F5x;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AudioEventsModel {
    public static G50<AudioEventsModel> CONVERTER = C8926Fti.A00(6);
    public static long sMcfTypeId;
    public final boolean hasAudioPlayed;
    public final int latestAudioEvent;

    public static native AudioEventsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioEventsModel) {
                AudioEventsModel audioEventsModel = (AudioEventsModel) obj;
                if (this.latestAudioEvent != audioEventsModel.latestAudioEvent || this.hasAudioPlayed != audioEventsModel.hasAudioPlayed) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.latestAudioEvent) * 31) + (this.hasAudioPlayed ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioEventsModel{latestAudioEvent=");
        sbA0x.append(this.latestAudioEvent);
        sbA0x.append(",hasAudioPlayed=");
        return AbstractC7610F5x.A0y(sbA0x, this.hasAudioPlayed);
    }

    public AudioEventsModel(int i, boolean z) {
        this.latestAudioEvent = i;
        this.hasAudioPlayed = z;
    }
}
