package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoyagerAsrSpeechCompleteJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long audioProcessedMs;
    public final String transcript;
    public final int turnId;

    public final class Companion {
        public final C9hr<VoyagerAsrSpeechCompleteJson> serializer() {
            return VoyagerAsrSpeechCompleteJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoyagerAsrSpeechCompleteJson(long j, int i, String str) {
        C7384Etj.A0Y(str, 2);
        this.audioProcessedMs = j;
        this.turnId = i;
        this.transcript = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAN(c9iZ, 0, voyagerAsrSpeechCompleteJson.audioProcessedMs);
        c9j5.AAK(c9iZ, 1, voyagerAsrSpeechCompleteJson.turnId);
        c9j5.AAV(voyagerAsrSpeechCompleteJson.transcript, c9iZ, 2);
    }

    public final VoyagerAsrSpeechCompleteJson copy(long j, int i, String str) {
        C7384Etj.A0Y(str, 2);
        return new VoyagerAsrSpeechCompleteJson(j, i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoyagerAsrSpeechCompleteJson) {
                VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson = (VoyagerAsrSpeechCompleteJson) obj;
                if (this.audioProcessedMs != voyagerAsrSpeechCompleteJson.audioProcessedMs || this.turnId != voyagerAsrSpeechCompleteJson.turnId || !C7384Etj.areEqual(this.transcript, voyagerAsrSpeechCompleteJson.transcript)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoyagerAsrSpeechCompleteJson copy$default(VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = voyagerAsrSpeechCompleteJson.audioProcessedMs;
        }
        if ((i2 & 2) != 0) {
            i = voyagerAsrSpeechCompleteJson.turnId;
        }
        if ((i2 & 4) != 0) {
            str = voyagerAsrSpeechCompleteJson.transcript;
        }
        return voyagerAsrSpeechCompleteJson.copy(j, i, str);
    }

    public final long component1() {
        return this.audioProcessedMs;
    }

    public final int component2() {
        return this.turnId;
    }

    public final String component3() {
        return this.transcript;
    }

    public final long getAudioProcessedMs() {
        return this.audioProcessedMs;
    }

    public final String getTranscript() {
        return this.transcript;
    }

    public final int getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.transcript, (C3cI.A01(this.audioProcessedMs) + this.turnId) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoyagerAsrSpeechCompleteJson(int i, long j, int i2, String str, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(VoyagerAsrSpeechCompleteJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.audioProcessedMs = j;
        this.turnId = i2;
        this.transcript = str;
    }
}
