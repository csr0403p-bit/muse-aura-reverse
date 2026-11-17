package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class UnreadCountResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Long seen_at_ms;
    public final int unread_count;

    public final class Companion {
        public final C9hr<UnreadCountResponseJson> serializer() {
            return UnreadCountResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(UnreadCountResponseJson unreadCountResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || unreadCountResponseJson.unread_count != 0) {
            c9j5.AAK(c9iZ, 0, unreadCountResponseJson.unread_count);
        }
        if (zAfR || unreadCountResponseJson.seen_at_ms != null) {
            c9j5.AAP(unreadCountResponseJson.seen_at_ms, C9j1.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnreadCountResponseJson) {
                UnreadCountResponseJson unreadCountResponseJson = (UnreadCountResponseJson) obj;
                if (this.unread_count != unreadCountResponseJson.unread_count || !C7384Etj.areEqual(this.seen_at_ms, unreadCountResponseJson.seen_at_ms)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UnreadCountResponseJson copy$default(UnreadCountResponseJson unreadCountResponseJson, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = unreadCountResponseJson.unread_count;
        }
        if ((i2 & 2) != 0) {
            l = unreadCountResponseJson.seen_at_ms;
        }
        return new UnreadCountResponseJson(i, l);
    }

    public final int component1() {
        return this.unread_count;
    }

    public final Long component2() {
        return this.seen_at_ms;
    }

    public final UnreadCountResponseJson copy(int i, Long l) {
        return new UnreadCountResponseJson(i, l);
    }

    public final Long getSeen_at_ms() {
        return this.seen_at_ms;
    }

    public final int getUnread_count() {
        return this.unread_count;
    }

    public int hashCode() {
        return (this.unread_count * 31) + AnonymousClass006.A0D(this.seen_at_ms);
    }

    public UnreadCountResponseJson(int i, Long l) {
        this.unread_count = i;
        this.seen_at_ms = l;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ UnreadCountResponseJson(int i, int i2, Long l, C2hx c2hx) {
        this.unread_count = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.seen_at_ms = null;
        } else {
            this.seen_at_ms = l;
        }
    }

    public /* synthetic */ UnreadCountResponseJson(int i, Long l, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : l);
    }

    public UnreadCountResponseJson() {
        this(0, null);
    }
}
