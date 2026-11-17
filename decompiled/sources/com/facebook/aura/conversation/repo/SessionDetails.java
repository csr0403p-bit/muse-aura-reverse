package com.facebook.aura.conversation.repo;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchSessionItem;

/* loaded from: classes3.dex */
public final class SessionDetails extends C06G {
    public final boolean archived;
    public final HatchSessionItem session;

    public SessionDetails(HatchSessionItem hatchSessionItem, boolean z) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        this.session = hatchSessionItem;
        this.archived = z;
    }

    public final SessionDetails copy(HatchSessionItem hatchSessionItem, boolean z) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        return new SessionDetails(hatchSessionItem, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SessionDetails) {
                SessionDetails sessionDetails = (SessionDetails) obj;
                if (!C7384Etj.areEqual(this.session, sessionDetails.session) || this.archived != sessionDetails.archived) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, HatchSessionItem hatchSessionItem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSessionItem = sessionDetails.session;
        }
        if ((i & 2) != 0) {
            z = sessionDetails.archived;
        }
        C7384Etj.A0Y(hatchSessionItem, 0);
        return new SessionDetails(hatchSessionItem, z);
    }

    public final HatchSessionItem component1() {
        return this.session;
    }

    public final boolean component2() {
        return this.archived;
    }

    public final boolean getArchived() {
        return this.archived;
    }

    public final HatchSessionItem getSession() {
        return this.session;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.session), this.archived);
    }

    public String toString() {
        return super.toString();
    }
}
