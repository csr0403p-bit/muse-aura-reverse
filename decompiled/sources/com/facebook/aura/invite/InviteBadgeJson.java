package com.facebook.aura.invite;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class InviteBadgeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long badge_version;
    public final boolean has_unseen_invite_redemptions;

    public final class Companion {
        public final C9hr<InviteBadgeJson> serializer() {
            return InviteBadgeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_invite_invite(InviteBadgeJson inviteBadgeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || inviteBadgeJson.has_unseen_invite_redemptions) {
            c9j5.AA7(c9iZ, 0, inviteBadgeJson.has_unseen_invite_redemptions);
        }
        if (zAfR || inviteBadgeJson.badge_version != 0) {
            c9j5.AAN(c9iZ, 1, inviteBadgeJson.badge_version);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InviteBadgeJson) {
                InviteBadgeJson inviteBadgeJson = (InviteBadgeJson) obj;
                if (this.has_unseen_invite_redemptions != inviteBadgeJson.has_unseen_invite_redemptions || this.badge_version != inviteBadgeJson.badge_version) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ InviteBadgeJson copy$default(InviteBadgeJson inviteBadgeJson, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inviteBadgeJson.has_unseen_invite_redemptions;
        }
        if ((i & 2) != 0) {
            j = inviteBadgeJson.badge_version;
        }
        return new InviteBadgeJson(z, j);
    }

    public final boolean component1() {
        return this.has_unseen_invite_redemptions;
    }

    public final long component2() {
        return this.badge_version;
    }

    public final InviteBadgeJson copy(boolean z, long j) {
        return new InviteBadgeJson(z, j);
    }

    public final long getBadge_version() {
        return this.badge_version;
    }

    public final boolean getHas_unseen_invite_redemptions() {
        return this.has_unseen_invite_redemptions;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.badge_version, C0KA.A02(this.has_unseen_invite_redemptions));
    }

    public InviteBadgeJson(boolean z, long j) {
        this.has_unseen_invite_redemptions = z;
        this.badge_version = j;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InviteBadgeJson(boolean z, long j, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? 0L : j);
    }

    public /* synthetic */ InviteBadgeJson(int i, boolean z, long j, C2hx c2hx) {
        this.has_unseen_invite_redemptions = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.badge_version = 0L;
        } else {
            this.badge_version = j;
        }
    }

    public InviteBadgeJson() {
        this(false, 0L);
    }
}
