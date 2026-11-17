package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class PeerChatEventJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final PeerChatAuthorJson author;
    public final String display_text;
    public final String event_name;
    public final String message_id;
    public final long occurred_at_ms;
    public final JsonObject payload;
    public final long seq;

    public final class Companion {
        public final C9hr<PeerChatEventJson> serializer() {
            return PeerChatEventJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ PeerChatEventJson copy$default(PeerChatEventJson peerChatEventJson, long j, long j2, String str, String str2, String str3, JsonObject jsonObject, PeerChatAuthorJson peerChatAuthorJson, int i, Object obj) {
        long j3 = j;
        long j4 = j2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        JsonObject jsonObject2 = jsonObject;
        PeerChatAuthorJson peerChatAuthorJson2 = peerChatAuthorJson;
        if ((i & 1) != 0) {
            j3 = peerChatEventJson.seq;
        }
        if ((i & 2) != 0) {
            j4 = peerChatEventJson.occurred_at_ms;
        }
        if ((i & 4) != 0) {
            str4 = peerChatEventJson.event_name;
        }
        if ((i & 8) != 0) {
            str5 = peerChatEventJson.message_id;
        }
        if ((i & 16) != 0) {
            str6 = peerChatEventJson.display_text;
        }
        if ((i & 32) != 0) {
            jsonObject2 = peerChatEventJson.payload;
        }
        if ((i & 64) != 0) {
            peerChatAuthorJson2 = peerChatEventJson.author;
        }
        return new PeerChatEventJson(j3, j4, str4, str5, str6, jsonObject2, peerChatAuthorJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerChatEventJson peerChatEventJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerChatEventJson.seq != 0) {
            c9j5.AAN(c9iZ, 0, peerChatEventJson.seq);
        }
        if (zAfR || peerChatEventJson.occurred_at_ms != 0) {
            c9j5.AAN(c9iZ, 1, peerChatEventJson.occurred_at_ms);
        }
        if (zAfR || peerChatEventJson.event_name != null) {
            c9j5.AAP(peerChatEventJson.event_name, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || peerChatEventJson.message_id != null) {
            c9j5.AAP(peerChatEventJson.message_id, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || peerChatEventJson.display_text != null) {
            c9j5.AAP(peerChatEventJson.display_text, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || peerChatEventJson.payload != null) {
            c9j5.AAP(peerChatEventJson.payload, JsonObjectSerializer.A01, c9iZ, 5);
        }
        if (zAfR || peerChatEventJson.author != null) {
            c9j5.AAP(peerChatEventJson.author, PeerChatAuthorJson$$serializer.INSTANCE, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerChatEventJson) {
                PeerChatEventJson peerChatEventJson = (PeerChatEventJson) obj;
                if (this.seq != peerChatEventJson.seq || this.occurred_at_ms != peerChatEventJson.occurred_at_ms || !C7384Etj.areEqual(this.event_name, peerChatEventJson.event_name) || !C7384Etj.areEqual(this.message_id, peerChatEventJson.message_id) || !C7384Etj.areEqual(this.display_text, peerChatEventJson.display_text) || !C7384Etj.areEqual(this.payload, peerChatEventJson.payload) || !C7384Etj.areEqual(this.author, peerChatEventJson.author)) {
                }
            }
            return false;
        }
        return true;
    }

    public final long component1() {
        return this.seq;
    }

    public final long component2() {
        return this.occurred_at_ms;
    }

    public final String component3() {
        return this.event_name;
    }

    public final String component4() {
        return this.message_id;
    }

    public final String component5() {
        return this.display_text;
    }

    public final JsonObject component6() {
        return this.payload;
    }

    public final PeerChatAuthorJson component7() {
        return this.author;
    }

    public final PeerChatEventJson copy(long j, long j2, String str, String str2, String str3, JsonObject jsonObject, PeerChatAuthorJson peerChatAuthorJson) {
        return new PeerChatEventJson(j, j2, str, str2, str3, jsonObject, peerChatAuthorJson);
    }

    public final PeerChatAuthorJson getAuthor() {
        return this.author;
    }

    public final String getDisplay_text() {
        return this.display_text;
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getMessage_id() {
        return this.message_id;
    }

    public final long getOccurred_at_ms() {
        return this.occurred_at_ms;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }

    public final long getSeq() {
        return this.seq;
    }

    public int hashCode() {
        return ((((((((AnonymousClass006.A06(this.occurred_at_ms, AnonymousClass005.A07(this.seq)) + AnonymousClass006.A0G(this.event_name)) * 31) + AnonymousClass006.A0G(this.message_id)) * 31) + AnonymousClass006.A0G(this.display_text)) * 31) + AnonymousClass006.A0D(this.payload)) * 31) + C3cH.A02(this.author);
    }

    public /* synthetic */ PeerChatEventJson(int i, long j, long j2, String str, String str2, String str3, JsonObject jsonObject, PeerChatAuthorJson peerChatAuthorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.seq = 0L;
        } else {
            this.seq = j;
        }
        if ((i & 2) == 0) {
            this.occurred_at_ms = 0L;
        } else {
            this.occurred_at_ms = j2;
        }
        if ((i & 4) == 0) {
            this.event_name = null;
        } else {
            this.event_name = str;
        }
        if ((i & 8) == 0) {
            this.message_id = null;
        } else {
            this.message_id = str2;
        }
        if ((i & 16) == 0) {
            this.display_text = null;
        } else {
            this.display_text = str3;
        }
        if ((i & 32) == 0) {
            this.payload = null;
        } else {
            this.payload = jsonObject;
        }
        if ((i & 64) == 0) {
            this.author = null;
        } else {
            this.author = peerChatAuthorJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerChatEventJson(long j, long j2, String str, String str2, String str3, JsonObject jsonObject, PeerChatAuthorJson peerChatAuthorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : jsonObject, (i & 64) != 0 ? null : peerChatAuthorJson);
    }

    public PeerChatEventJson(long j, long j2, String str, String str2, String str3, JsonObject jsonObject, PeerChatAuthorJson peerChatAuthorJson) {
        this.seq = j;
        this.occurred_at_ms = j2;
        this.event_name = str;
        this.message_id = str2;
        this.display_text = str3;
        this.payload = jsonObject;
        this.author = peerChatAuthorJson;
    }

    public PeerChatEventJson() {
        this(0L, 0L, null, null, null, null, null);
    }
}
