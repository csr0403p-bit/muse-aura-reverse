package com.facebook.aura.invite;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class InviteBadgeSeenRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long badge_version;

    public final class Companion {
        public final C9hr<InviteBadgeSeenRequestJson> serializer() {
            return InviteBadgeSeenRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof InviteBadgeSeenRequestJson) && this.badge_version == ((InviteBadgeSeenRequestJson) obj).badge_version);
    }

    public /* synthetic */ InviteBadgeSeenRequestJson(int i, long j, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(InviteBadgeSeenRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.badge_version = j;
    }

    public static /* synthetic */ InviteBadgeSeenRequestJson copy$default(InviteBadgeSeenRequestJson inviteBadgeSeenRequestJson, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = inviteBadgeSeenRequestJson.badge_version;
        }
        return new InviteBadgeSeenRequestJson(j);
    }

    public final long component1() {
        return this.badge_version;
    }

    public final InviteBadgeSeenRequestJson copy(long j) {
        return new InviteBadgeSeenRequestJson(j);
    }

    public final long getBadge_version() {
        return this.badge_version;
    }

    public int hashCode() {
        return AnonymousClass002.A0A(this.badge_version);
    }

    public String toString() {
        return super.toString();
    }

    public InviteBadgeSeenRequestJson(long j) {
        this.badge_version = j;
    }
}
