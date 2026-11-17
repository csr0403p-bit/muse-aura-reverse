package com.facebook.aura.composer.dictation.voyager;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class VoyagerAsrTranscriptJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Long audioProcessedMs;

    /* renamed from: final, reason: not valid java name */
    public final boolean f17final;
    public final String transcript;

    public final class Companion {
        public final C9hr<VoyagerAsrTranscriptJson> serializer() {
            return VoyagerAsrTranscriptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoyagerAsrTranscriptJson(String str, boolean z, Long l) {
        C7384Etj.A0Y(str, 0);
        this.transcript = str;
        this.f17final = z;
        this.audioProcessedMs = l;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_composer_dictation_voyager_voyager(VoyagerAsrTranscriptJson voyagerAsrTranscriptJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(voyagerAsrTranscriptJson.transcript)) {
            c9j5.AAV(voyagerAsrTranscriptJson.transcript, c9iZ, 0);
        }
        if (zAfR || voyagerAsrTranscriptJson.f17final) {
            c9j5.AA7(c9iZ, 1, voyagerAsrTranscriptJson.f17final);
        }
        if (zAfR || voyagerAsrTranscriptJson.audioProcessedMs != null) {
            c9j5.AAP(voyagerAsrTranscriptJson.audioProcessedMs, C9j1.A00, c9iZ, 2);
        }
    }

    public final VoyagerAsrTranscriptJson copy(String str, boolean z, Long l) {
        C7384Etj.A0Y(str, 0);
        return new VoyagerAsrTranscriptJson(str, z, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VoyagerAsrTranscriptJson) {
                VoyagerAsrTranscriptJson voyagerAsrTranscriptJson = (VoyagerAsrTranscriptJson) obj;
                if (!C7384Etj.areEqual(this.transcript, voyagerAsrTranscriptJson.transcript) || this.f17final != voyagerAsrTranscriptJson.f17final || !C7384Etj.areEqual(this.audioProcessedMs, voyagerAsrTranscriptJson.audioProcessedMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VoyagerAsrTranscriptJson copy$default(VoyagerAsrTranscriptJson voyagerAsrTranscriptJson, String str, boolean z, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voyagerAsrTranscriptJson.transcript;
        }
        if ((i & 2) != 0) {
            z = voyagerAsrTranscriptJson.f17final;
        }
        if ((i & 4) != 0) {
            l = voyagerAsrTranscriptJson.audioProcessedMs;
        }
        return voyagerAsrTranscriptJson.copy(str, z, l);
    }

    public final String component1() {
        return this.transcript;
    }

    public final boolean component2() {
        return this.f17final;
    }

    public final Long component3() {
        return this.audioProcessedMs;
    }

    public final Long getAudioProcessedMs() {
        return this.audioProcessedMs;
    }

    public final boolean getFinal() {
        return this.f17final;
    }

    public final String getTranscript() {
        return this.transcript;
    }

    public int hashCode() {
        return C0KA.A01(AnonymousClass001.A0G(this.transcript), this.f17final) + AnonymousClass006.A0D(this.audioProcessedMs);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ VoyagerAsrTranscriptJson(int i, String str, boolean z, Long l, C2hx c2hx) {
        this.transcript = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.f17final = false;
        } else {
            this.f17final = z;
        }
        if ((i & 4) == 0) {
            this.audioProcessedMs = null;
        } else {
            this.audioProcessedMs = l;
        }
    }

    public /* synthetic */ VoyagerAsrTranscriptJson(String str, boolean z, Long l, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : l);
    }

    public VoyagerAsrTranscriptJson() {
        this("", false, null);
    }
}
