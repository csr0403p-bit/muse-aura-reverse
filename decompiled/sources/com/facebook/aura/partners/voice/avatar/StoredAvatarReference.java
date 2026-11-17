package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class StoredAvatarReference extends C06G {
    public final boolean cropRefreshed;
    public final HatchAvatarReference reference;

    public StoredAvatarReference(HatchAvatarReference hatchAvatarReference, boolean z) {
        C7384Etj.A0Y(hatchAvatarReference, 0);
        this.reference = hatchAvatarReference;
        this.cropRefreshed = z;
    }

    public final StoredAvatarReference copy(HatchAvatarReference hatchAvatarReference, boolean z) {
        C7384Etj.A0Y(hatchAvatarReference, 0);
        return new StoredAvatarReference(hatchAvatarReference, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoredAvatarReference) {
                StoredAvatarReference storedAvatarReference = (StoredAvatarReference) obj;
                if (!C7384Etj.areEqual(this.reference, storedAvatarReference.reference) || this.cropRefreshed != storedAvatarReference.cropRefreshed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ StoredAvatarReference copy$default(StoredAvatarReference storedAvatarReference, HatchAvatarReference hatchAvatarReference, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAvatarReference = storedAvatarReference.reference;
        }
        if ((i & 2) != 0) {
            z = storedAvatarReference.cropRefreshed;
        }
        C7384Etj.A0Y(hatchAvatarReference, 0);
        return new StoredAvatarReference(hatchAvatarReference, z);
    }

    public final HatchAvatarReference component1() {
        return this.reference;
    }

    public final boolean component2() {
        return this.cropRefreshed;
    }

    public final boolean getCropRefreshed() {
        return this.cropRefreshed;
    }

    public final HatchAvatarReference getReference() {
        return this.reference;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0E(this.reference), this.cropRefreshed);
    }

    public String toString() {
        return super.toString();
    }
}
