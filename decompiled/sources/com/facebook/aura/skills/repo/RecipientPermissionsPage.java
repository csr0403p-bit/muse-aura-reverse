package com.facebook.aura.skills.repo;

import X.AHD;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class RecipientPermissionsPage extends C06G {
    public final AHD<RecipientPermission> items;
    public final String nextCursor;

    public RecipientPermissionsPage(AHD<RecipientPermission> ahd, String str) {
        C7384Etj.A0Y(ahd, 0);
        this.items = ahd;
        this.nextCursor = str;
    }

    public final RecipientPermissionsPage copy(AHD<RecipientPermission> ahd, String str) {
        C7384Etj.A0Y(ahd, 0);
        return new RecipientPermissionsPage(ahd, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientPermissionsPage) {
                RecipientPermissionsPage recipientPermissionsPage = (RecipientPermissionsPage) obj;
                if (!C7384Etj.areEqual(this.items, recipientPermissionsPage.items) || !C7384Etj.areEqual(this.nextCursor, recipientPermissionsPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecipientPermissionsPage copy$default(RecipientPermissionsPage recipientPermissionsPage, AHD ahd, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = recipientPermissionsPage.items;
        }
        if ((i & 2) != 0) {
            str = recipientPermissionsPage.nextCursor;
        }
        C7384Etj.A0Y(ahd, 0);
        return new RecipientPermissionsPage(ahd, str);
    }

    public final AHD<RecipientPermission> component1() {
        return this.items;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final AHD<RecipientPermission> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.items) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}
