package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ResolvedAvatarSelection extends C06G {
    public final boolean isSettled;
    public final HatchAvatarSelection selection;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResolvedAvatarSelection) {
                ResolvedAvatarSelection resolvedAvatarSelection = (ResolvedAvatarSelection) obj;
                if (!C7384Etj.areEqual(this.selection, resolvedAvatarSelection.selection) || this.isSettled != resolvedAvatarSelection.isSettled) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ResolvedAvatarSelection copy$default(ResolvedAvatarSelection resolvedAvatarSelection, HatchAvatarSelection hatchAvatarSelection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAvatarSelection = resolvedAvatarSelection.selection;
        }
        if ((i & 2) != 0) {
            z = resolvedAvatarSelection.isSettled;
        }
        return new ResolvedAvatarSelection(hatchAvatarSelection, z);
    }

    public final HatchAvatarSelection component1() {
        return this.selection;
    }

    public final boolean component2() {
        return this.isSettled;
    }

    public final ResolvedAvatarSelection copy(HatchAvatarSelection hatchAvatarSelection, boolean z) {
        return new ResolvedAvatarSelection(hatchAvatarSelection, z);
    }

    public final HatchAvatarSelection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0D(this.selection) * 31, this.isSettled);
    }

    public final boolean isSettled() {
        return this.isSettled;
    }

    public ResolvedAvatarSelection(HatchAvatarSelection hatchAvatarSelection, boolean z) {
        this.selection = hatchAvatarSelection;
        this.isSettled = z;
    }

    public String toString() {
        return super.toString();
    }
}
