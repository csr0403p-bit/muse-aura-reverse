package com.facebook.aura.modellock;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class ModelLockOwner extends C06G {
    public final Long lockedAtMs;
    public final String vmId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModelLockOwner) {
                ModelLockOwner modelLockOwner = (ModelLockOwner) obj;
                if (!C7384Etj.areEqual(this.vmId, modelLockOwner.vmId) || !C7384Etj.areEqual(this.lockedAtMs, modelLockOwner.lockedAtMs)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ModelLockOwner copy$default(ModelLockOwner modelLockOwner, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelLockOwner.vmId;
        }
        if ((i & 2) != 0) {
            l = modelLockOwner.lockedAtMs;
        }
        return new ModelLockOwner(str, l);
    }

    public final String component1() {
        return this.vmId;
    }

    public final Long component2() {
        return this.lockedAtMs;
    }

    public final ModelLockOwner copy(String str, Long l) {
        return new ModelLockOwner(str, l);
    }

    public final Long getLockedAtMs() {
        return this.lockedAtMs;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.vmId) * 31) + C3cH.A02(this.lockedAtMs);
    }

    public ModelLockOwner(String str, Long l) {
        this.vmId = str;
        this.lockedAtMs = l;
    }

    public String toString() {
        return super.toString();
    }
}
