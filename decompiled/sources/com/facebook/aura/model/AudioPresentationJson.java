package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AudioPresentationJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentFileJson audio;

    public final class Companion {
        public final C9hr<AudioPresentationJson> serializer() {
            return AudioPresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(AudioPresentationJson audioPresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || audioPresentationJson.audio != null) {
            c9j5.AAP(audioPresentationJson.audio, HatchAttachmentFileJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AudioPresentationJson) && C7384Etj.areEqual(this.audio, ((AudioPresentationJson) obj).audio));
    }

    public static /* synthetic */ AudioPresentationJson copy$default(AudioPresentationJson audioPresentationJson, HatchAttachmentFileJson hatchAttachmentFileJson, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentFileJson = audioPresentationJson.audio;
        }
        return new AudioPresentationJson(hatchAttachmentFileJson);
    }

    public final HatchAttachmentFileJson component1() {
        return this.audio;
    }

    public final AudioPresentationJson copy(HatchAttachmentFileJson hatchAttachmentFileJson) {
        return new AudioPresentationJson(hatchAttachmentFileJson);
    }

    public final HatchAttachmentFileJson getAudio() {
        return this.audio;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.audio);
    }

    public final AudioPresentationData toDomain() {
        HatchAttachmentFile domain;
        HatchAttachmentFileJson hatchAttachmentFileJson = this.audio;
        if (hatchAttachmentFileJson == null || (domain = hatchAttachmentFileJson.toDomain()) == null) {
            return null;
        }
        return new AudioPresentationData(domain);
    }

    public /* synthetic */ AudioPresentationJson(int i, HatchAttachmentFileJson hatchAttachmentFileJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.audio = null;
        } else {
            this.audio = hatchAttachmentFileJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AudioPresentationJson(HatchAttachmentFileJson hatchAttachmentFileJson) {
        this.audio = hatchAttachmentFileJson;
    }

    public /* synthetic */ AudioPresentationJson(HatchAttachmentFileJson hatchAttachmentFileJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchAttachmentFileJson);
    }

    public AudioPresentationJson() {
        this(null);
    }
}
