package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PlaybackStatusRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String call_id;
    public final long seq;
    public final String state;

    public final class Companion {
        public final C9hr<PlaybackStatusRequestJson> serializer() {
            return PlaybackStatusRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(PlaybackStatusRequestJson playbackStatusRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(playbackStatusRequestJson.call_id, c9iZ, 0);
        c9j5.AAN(c9iZ, 1, playbackStatusRequestJson.seq);
        c9j5.AAV(playbackStatusRequestJson.state, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlaybackStatusRequestJson) {
                PlaybackStatusRequestJson playbackStatusRequestJson = (PlaybackStatusRequestJson) obj;
                if (!C7384Etj.areEqual(this.call_id, playbackStatusRequestJson.call_id) || this.seq != playbackStatusRequestJson.seq || !C7384Etj.areEqual(this.state, playbackStatusRequestJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PlaybackStatusRequestJson copy$default(PlaybackStatusRequestJson playbackStatusRequestJson, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playbackStatusRequestJson.call_id;
        }
        if ((i & 2) != 0) {
            j = playbackStatusRequestJson.seq;
        }
        if ((i & 4) != 0) {
            str2 = playbackStatusRequestJson.state;
        }
        return playbackStatusRequestJson.copy(str, j, str2);
    }

    public final String component1() {
        return this.call_id;
    }

    public final long component2() {
        return this.seq;
    }

    public final String component3() {
        return this.state;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final long getSeq() {
        return this.seq;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.state, C60R.A00(this.seq, AnonymousClass001.A0G(this.call_id)));
    }

    public PlaybackStatusRequestJson(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        this.call_id = str;
        this.seq = j;
        this.state = str2;
    }

    public final PlaybackStatusRequestJson copy(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        return new PlaybackStatusRequestJson(str, j, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PlaybackStatusRequestJson(int i, String str, long j, String str2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PlaybackStatusRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.call_id = str;
        this.seq = j;
        this.state = str2;
    }
}
