package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes4.dex */
public final class VoyagerAsrMessageJson extends C06G {
    public static final Companion Companion = new Companion();
    public final JsonElement error;
    public final String sessionId;
    public final VoyagerAsrSpeechCompleteJson speechComplete;
    public final VoyagerAsrSpeechBoundaryJson speechEnd;
    public final VoyagerAsrSpeechBoundaryJson speechStart;
    public final VoyagerAsrTranscriptJson transcript;

    public final class Companion {
        public final C9hr<VoyagerAsrMessageJson> serializer() {
            return VoyagerAsrMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(VoyagerAsrMessageJson voyagerAsrMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(voyagerAsrMessageJson.sessionId)) {
            c9j5.AAV(voyagerAsrMessageJson.sessionId, c9iZ, 0);
        }
        if (zAfR || voyagerAsrMessageJson.error != null) {
            c9j5.AAP(voyagerAsrMessageJson.error, JsonElementSerializer.A00, c9iZ, 1);
        }
        if (zAfR || voyagerAsrMessageJson.speechStart != null) {
            c9j5.AAP(voyagerAsrMessageJson.speechStart, VoyagerAsrSpeechBoundaryJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || voyagerAsrMessageJson.speechEnd != null) {
            c9j5.AAP(voyagerAsrMessageJson.speechEnd, VoyagerAsrSpeechBoundaryJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || voyagerAsrMessageJson.speechComplete != null) {
            c9j5.AAP(voyagerAsrMessageJson.speechComplete, VoyagerAsrSpeechCompleteJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || voyagerAsrMessageJson.transcript != null) {
            c9j5.AAP(voyagerAsrMessageJson.transcript, VoyagerAsrTranscriptJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public final VoyagerAsrMessageJson copy(String str, JsonElement jsonElement, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2, VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson) {
        C7384Etj.A0Y(str, 0);
        return new VoyagerAsrMessageJson(str, jsonElement, voyagerAsrSpeechBoundaryJson, voyagerAsrSpeechBoundaryJson2, voyagerAsrSpeechCompleteJson, voyagerAsrTranscriptJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoyagerAsrMessageJson) {
                VoyagerAsrMessageJson voyagerAsrMessageJson = (VoyagerAsrMessageJson) obj;
                if (!C7384Etj.areEqual(this.sessionId, voyagerAsrMessageJson.sessionId) || !C7384Etj.areEqual(this.error, voyagerAsrMessageJson.error) || !C7384Etj.areEqual(this.speechStart, voyagerAsrMessageJson.speechStart) || !C7384Etj.areEqual(this.speechEnd, voyagerAsrMessageJson.speechEnd) || !C7384Etj.areEqual(this.speechComplete, voyagerAsrMessageJson.speechComplete) || !C7384Etj.areEqual(this.transcript, voyagerAsrMessageJson.transcript)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoyagerAsrMessageJson copy$default(VoyagerAsrMessageJson voyagerAsrMessageJson, String str, JsonElement jsonElement, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2, VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voyagerAsrMessageJson.sessionId;
        }
        if ((i & 2) != 0) {
            jsonElement = voyagerAsrMessageJson.error;
        }
        if ((i & 4) != 0) {
            voyagerAsrSpeechBoundaryJson = voyagerAsrMessageJson.speechStart;
        }
        if ((i & 8) != 0) {
            voyagerAsrSpeechBoundaryJson2 = voyagerAsrMessageJson.speechEnd;
        }
        if ((i & 16) != 0) {
            voyagerAsrSpeechCompleteJson = voyagerAsrMessageJson.speechComplete;
        }
        if ((i & 32) != 0) {
            voyagerAsrTranscriptJson = voyagerAsrMessageJson.transcript;
        }
        return voyagerAsrMessageJson.copy(str, jsonElement, voyagerAsrSpeechBoundaryJson, voyagerAsrSpeechBoundaryJson2, voyagerAsrSpeechCompleteJson, voyagerAsrTranscriptJson);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final JsonElement component2() {
        return this.error;
    }

    public final VoyagerAsrSpeechBoundaryJson component3() {
        return this.speechStart;
    }

    public final VoyagerAsrSpeechBoundaryJson component4() {
        return this.speechEnd;
    }

    public final VoyagerAsrSpeechCompleteJson component5() {
        return this.speechComplete;
    }

    public final VoyagerAsrTranscriptJson component6() {
        return this.transcript;
    }

    public final JsonElement getError() {
        return this.error;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final VoyagerAsrSpeechCompleteJson getSpeechComplete() {
        return this.speechComplete;
    }

    public final VoyagerAsrSpeechBoundaryJson getSpeechEnd() {
        return this.speechEnd;
    }

    public final VoyagerAsrSpeechBoundaryJson getSpeechStart() {
        return this.speechStart;
    }

    public final VoyagerAsrTranscriptJson getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        return ((((((((AnonymousClass001.A0G(this.sessionId) + AnonymousClass006.A0D(this.error)) * 31) + AnonymousClass006.A0D(this.speechStart)) * 31) + AnonymousClass006.A0D(this.speechEnd)) * 31) + AnonymousClass006.A0D(this.speechComplete)) * 31) + C3cH.A02(this.transcript);
    }

    public /* synthetic */ VoyagerAsrMessageJson(int i, String str, JsonElement jsonElement, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2, VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson, C2hx c2hx) {
        this.sessionId = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.error = null;
        } else {
            this.error = jsonElement;
        }
        if ((i & 4) == 0) {
            this.speechStart = null;
        } else {
            this.speechStart = voyagerAsrSpeechBoundaryJson;
        }
        if ((i & 8) == 0) {
            this.speechEnd = null;
        } else {
            this.speechEnd = voyagerAsrSpeechBoundaryJson2;
        }
        if ((i & 16) == 0) {
            this.speechComplete = null;
        } else {
            this.speechComplete = voyagerAsrSpeechCompleteJson;
        }
        if ((i & 32) == 0) {
            this.transcript = null;
        } else {
            this.transcript = voyagerAsrTranscriptJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public VoyagerAsrMessageJson(String str, JsonElement jsonElement, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2, VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson) {
        C7384Etj.A0Y(str, 0);
        this.sessionId = str;
        this.error = jsonElement;
        this.speechStart = voyagerAsrSpeechBoundaryJson;
        this.speechEnd = voyagerAsrSpeechBoundaryJson2;
        this.speechComplete = voyagerAsrSpeechCompleteJson;
        this.transcript = voyagerAsrTranscriptJson;
    }

    public /* synthetic */ VoyagerAsrMessageJson(String str, JsonElement jsonElement, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson, VoyagerAsrSpeechBoundaryJson voyagerAsrSpeechBoundaryJson2, VoyagerAsrSpeechCompleteJson voyagerAsrSpeechCompleteJson, VoyagerAsrTranscriptJson voyagerAsrTranscriptJson, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? null : jsonElement, (i & 4) != 0 ? null : voyagerAsrSpeechBoundaryJson, (i & 8) != 0 ? null : voyagerAsrSpeechBoundaryJson2, (i & 16) != 0 ? null : voyagerAsrSpeechCompleteJson, (i & 32) != 0 ? null : voyagerAsrTranscriptJson);
    }

    public VoyagerAsrMessageJson() {
        this("", null, null, null, null, null);
    }
}
