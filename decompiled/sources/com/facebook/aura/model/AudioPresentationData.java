package com.facebook.aura.model;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class AudioPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentFile audio;

    public final class Companion {
        public final C9hr<AudioPresentationData> serializer() {
            return AudioPresentationData$$serializer.INSTANCE;
        }

        public final AudioPresentationData fromJson(JsonElement jsonElement) {
            return HatchAttachmentPresentationJsonKt.parseAudioPresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final AudioPresentationData copy(HatchAttachmentFile hatchAttachmentFile) {
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        return new AudioPresentationData(hatchAttachmentFile);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AudioPresentationData) && C7384Etj.areEqual(this.audio, ((AudioPresentationData) obj).audio));
    }

    public /* synthetic */ AudioPresentationData(int i, HatchAttachmentFile hatchAttachmentFile, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AudioPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.audio = hatchAttachmentFile;
    }

    public static /* synthetic */ AudioPresentationData copy$default(AudioPresentationData audioPresentationData, HatchAttachmentFile hatchAttachmentFile, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentFile = audioPresentationData.audio;
        }
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        return new AudioPresentationData(hatchAttachmentFile);
    }

    public final HatchAttachmentFile component1() {
        return this.audio;
    }

    public final HatchAttachmentFile getAudio() {
        return this.audio;
    }

    public int hashCode() {
        return this.audio.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public AudioPresentationData(HatchAttachmentFile hatchAttachmentFile) {
        C7384Etj.A0Y(hatchAttachmentFile, 0);
        this.audio = hatchAttachmentFile;
    }
}
