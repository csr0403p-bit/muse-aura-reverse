package com.facebook.aura.storagerecovery;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class Directory extends C06G {
    public final String displayName;
    public final String selectionToken;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Directory) {
                Directory directory = (Directory) obj;
                if (!C7384Etj.areEqual(this.displayName, directory.displayName) || !C7384Etj.areEqual(this.selectionToken, directory.selectionToken)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ Directory copy$default(Directory directory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directory.displayName;
        }
        if ((i & 2) != 0) {
            str2 = directory.selectionToken;
        }
        AnonymousClass003.A0u(str, str2);
        return new Directory(str, str2);
    }

    public final String component1() {
        return this.displayName;
    }

    public final String component2() {
        return this.selectionToken;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getSelectionToken() {
        return this.selectionToken;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.selectionToken, AnonymousClass001.A0G(this.displayName));
    }

    public Directory(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.displayName = str;
        this.selectionToken = str2;
    }

    public final Directory copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new Directory(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
