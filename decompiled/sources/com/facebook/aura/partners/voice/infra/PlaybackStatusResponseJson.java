package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PlaybackStatusResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean accepted;

    public final class Companion {
        public final C9hr<PlaybackStatusResponseJson> serializer() {
            return PlaybackStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(PlaybackStatusResponseJson playbackStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || playbackStatusResponseJson.accepted != null) {
            c9j5.AAP(playbackStatusResponseJson.accepted, C07839ix.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PlaybackStatusResponseJson) && C7384Etj.areEqual(this.accepted, ((PlaybackStatusResponseJson) obj).accepted));
    }

    public static /* synthetic */ PlaybackStatusResponseJson copy$default(PlaybackStatusResponseJson playbackStatusResponseJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = playbackStatusResponseJson.accepted;
        }
        return new PlaybackStatusResponseJson(bool);
    }

    public final Boolean component1() {
        return this.accepted;
    }

    public final PlaybackStatusResponseJson copy(Boolean bool) {
        return new PlaybackStatusResponseJson(bool);
    }

    public final Boolean getAccepted() {
        return this.accepted;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.accepted);
    }

    public /* synthetic */ PlaybackStatusResponseJson(int i, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.accepted = null;
        } else {
            this.accepted = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PlaybackStatusResponseJson(Boolean bool) {
        this.accepted = bool;
    }

    public /* synthetic */ PlaybackStatusResponseJson(Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool);
    }

    public PlaybackStatusResponseJson() {
        this(null);
    }
}
