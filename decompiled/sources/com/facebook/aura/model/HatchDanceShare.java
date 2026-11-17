package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchDanceShare extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentAudio audio;

    public final class Companion {
        public final C9hr<HatchDanceShare> serializer() {
            return HatchDanceShare$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HatchDanceShare) && C7384Etj.areEqual(this.audio, ((HatchDanceShare) obj).audio));
    }

    public /* synthetic */ HatchDanceShare(int i, HatchAttachmentAudio hatchAttachmentAudio, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchDanceShare$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.audio = hatchAttachmentAudio;
    }

    public static /* synthetic */ HatchDanceShare copy$default(HatchDanceShare hatchDanceShare, HatchAttachmentAudio hatchAttachmentAudio, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentAudio = hatchDanceShare.audio;
        }
        return new HatchDanceShare(hatchAttachmentAudio);
    }

    public final HatchAttachmentAudio component1() {
        return this.audio;
    }

    public final HatchDanceShare copy(HatchAttachmentAudio hatchAttachmentAudio) {
        return new HatchDanceShare(hatchAttachmentAudio);
    }

    public final HatchAttachmentAudio getAudio() {
        return this.audio;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.audio);
    }

    public String toString() {
        return super.toString();
    }

    public HatchDanceShare(HatchAttachmentAudio hatchAttachmentAudio) {
        this.audio = hatchAttachmentAudio;
    }
}
