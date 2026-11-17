package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchSessionUpdate extends C06G {
    public static final int $stable = HatchSessionItem.$stable;
    public final boolean archived;
    public final HatchSessionItem session;

    public HatchSessionUpdate(HatchSessionItem hatchSessionItem, boolean z) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        this.session = hatchSessionItem;
        this.archived = z;
    }

    public final HatchSessionUpdate copy(HatchSessionItem hatchSessionItem, boolean z) {
        C7384Etj.A0Y(hatchSessionItem, 0);
        return new HatchSessionUpdate(hatchSessionItem, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSessionUpdate) {
                HatchSessionUpdate hatchSessionUpdate = (HatchSessionUpdate) obj;
                if (!C7384Etj.areEqual(this.session, hatchSessionUpdate.session) || this.archived != hatchSessionUpdate.archived) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSessionUpdate copy$default(HatchSessionUpdate hatchSessionUpdate, HatchSessionItem hatchSessionItem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchSessionItem = hatchSessionUpdate.session;
        }
        if ((i & 2) != 0) {
            z = hatchSessionUpdate.archived;
        }
        C7384Etj.A0Y(hatchSessionItem, 0);
        return new HatchSessionUpdate(hatchSessionItem, z);
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
