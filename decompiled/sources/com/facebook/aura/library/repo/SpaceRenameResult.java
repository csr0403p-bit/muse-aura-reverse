package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SpaceRenameResult extends C06G {
    public final String name;
    public final String slug;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceRenameResult) {
                SpaceRenameResult spaceRenameResult = (SpaceRenameResult) obj;
                if (!C7384Etj.areEqual(this.slug, spaceRenameResult.slug) || !C7384Etj.areEqual(this.name, spaceRenameResult.name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceRenameResult copy$default(SpaceRenameResult spaceRenameResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceRenameResult.slug;
        }
        if ((i & 2) != 0) {
            str2 = spaceRenameResult.name;
        }
        AnonymousClass003.A0u(str, str2);
        return new SpaceRenameResult(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.name;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.name, AnonymousClass001.A0G(this.slug));
    }

    public SpaceRenameResult(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.slug = str;
        this.name = str2;
    }

    public final SpaceRenameResult copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new SpaceRenameResult(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
