package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchAvatarSelection extends C06G {
    public final boolean fullFrame;
    public final String kind;
    public final HatchAvatarReference reference;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAvatarSelection) {
                HatchAvatarSelection hatchAvatarSelection = (HatchAvatarSelection) obj;
                if (!C7384Etj.areEqual(this.kind, hatchAvatarSelection.kind) || !C7384Etj.areEqual(this.reference, hatchAvatarSelection.reference) || this.fullFrame != hatchAvatarSelection.fullFrame) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAvatarSelection copy$default(HatchAvatarSelection hatchAvatarSelection, String str, HatchAvatarReference hatchAvatarReference, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAvatarSelection.kind;
        }
        if ((i & 2) != 0) {
            hatchAvatarReference = hatchAvatarSelection.reference;
        }
        if ((i & 4) != 0) {
            z = hatchAvatarSelection.fullFrame;
        }
        return hatchAvatarSelection.copy(str, hatchAvatarReference, z);
    }

    public final String component1() {
        return this.kind;
    }

    public final HatchAvatarReference component2() {
        return this.reference;
    }

    public final boolean component3() {
        return this.fullFrame;
    }

    public final boolean getFullFrame() {
        return this.fullFrame;
    }

    public final String getKind() {
        return this.kind;
    }

    public final HatchAvatarReference getReference() {
        return this.reference;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.reference, AnonymousClass001.A0G(this.kind)), this.fullFrame);
    }

    public HatchAvatarSelection(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
        AnonymousClass003.A0u(str, hatchAvatarReference);
        this.kind = str;
        this.reference = hatchAvatarReference;
        this.fullFrame = z;
    }

    public final HatchAvatarSelection copy(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
        AnonymousClass003.A0u(str, hatchAvatarReference);
        return new HatchAvatarSelection(str, hatchAvatarReference, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchAvatarSelection(String str, HatchAvatarReference hatchAvatarReference, boolean z, int i, C06H c06h) {
        this(str, hatchAvatarReference, AnonymousClass005.A1O(i, z));
    }
}
