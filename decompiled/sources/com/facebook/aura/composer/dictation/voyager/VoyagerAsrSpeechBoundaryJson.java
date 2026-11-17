package com.facebook.aura.composer.dictation.voyager;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoyagerAsrSpeechBoundaryJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long audioProcessedMs;
    public final int turnId;

    public final class Companion {
        public final C9hr<VoyagerAsrSpeechBoundaryJson> serializer() {
            return VoyagerAsrSpeechBoundaryJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAN(c9iZ, 0, voyagerAsrSpeechBoundaryJson.audioProcessedMs);
        c9j5.AAK(c9iZ, 1, voyagerAsrSpeechBoundaryJson.turnId);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoyagerAsrSpeechBoundaryJson) {
                VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson = (VoyagerAsrSpeechBoundaryJson) obj;
                if (this.audioProcessedMs != voyagerAsrSpeechBoundaryJson.audioProcessedMs || this.turnId != voyagerAsrSpeechBoundaryJson.turnId) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoyagerAsrSpeechBoundaryJson copy$default(VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = voyagerAsrSpeechBoundaryJson.audioProcessedMs;
        }
        if ((i2 & 2) != 0) {
            i = voyagerAsrSpeechBoundaryJson.turnId;
        }
        return new VoyagerAsrSpeechBoundaryJson(j, i);
    }

    public final long component1() {
        return this.audioProcessedMs;
    }

    public final int component2() {
        return this.turnId;
    }

    public final VoyagerAsrSpeechBoundaryJson copy(long j, int i) {
        return new VoyagerAsrSpeechBoundaryJson(j, i);
    }

    public final long getAudioProcessedMs() {
        return this.audioProcessedMs;
    }

    public final int getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        return C3cI.A01(this.audioProcessedMs) + this.turnId;
    }

    public VoyagerAsrSpeechBoundaryJson(long j, int i) {
        this.audioProcessedMs = j;
        this.turnId = i;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoyagerAsrSpeechBoundaryJson(int i, long j, int i2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(VoyagerAsrSpeechBoundaryJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.audioProcessedMs = j;
        this.turnId = i2;
    }
}
