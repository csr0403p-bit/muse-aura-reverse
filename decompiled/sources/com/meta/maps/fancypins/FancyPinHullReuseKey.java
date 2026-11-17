package com.meta.maps.fancypins;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes6.dex */
public final class FancyPinHullReuseKey {
    public final String blueprintId;
    public final long registrationRevision;

    public FancyPinHullReuseKey(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.blueprintId = str;
        this.registrationRevision = j;
    }

    public final FancyPinHullReuseKey copy(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new FancyPinHullReuseKey(str, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FancyPinHullReuseKey) {
                FancyPinHullReuseKey fancyPinHullReuseKey = (FancyPinHullReuseKey) obj;
                if (!C7384Etj.areEqual(this.blueprintId, fancyPinHullReuseKey.blueprintId) || this.registrationRevision != fancyPinHullReuseKey.registrationRevision) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FancyPinHullReuseKey copy$default(FancyPinHullReuseKey fancyPinHullReuseKey, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fancyPinHullReuseKey.blueprintId;
        }
        if ((i & 2) != 0) {
            j = fancyPinHullReuseKey.registrationRevision;
        }
        C7384Etj.A0Y(str, 0);
        return new FancyPinHullReuseKey(str, j);
    }

    public final String component1() {
        return this.blueprintId;
    }

    public final long component2() {
        return this.registrationRevision;
    }

    public final String getBlueprintId() {
        return this.blueprintId;
    }

    public final long getRegistrationRevision() {
        return this.registrationRevision;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.registrationRevision, AnonymousClass001.A0G(this.blueprintId));
    }

    public String toString() {
        return FGI.A0g("FancyPinHullReuseKey(blueprintId=", this.blueprintId, ", registrationRevision=", ")", this.registrationRevision);
    }
}
