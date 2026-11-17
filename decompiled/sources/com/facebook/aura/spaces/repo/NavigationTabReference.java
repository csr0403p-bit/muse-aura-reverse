package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NavigationTabReference extends C06G {
    public final String itemKey;
    public final NavigationTabSource source;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationTabReference) {
                NavigationTabReference navigationTabReference = (NavigationTabReference) obj;
                if (this.source != navigationTabReference.source || !C7384Etj.areEqual(this.itemKey, navigationTabReference.itemKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NavigationTabReference copy$default(NavigationTabReference navigationTabReference, NavigationTabSource navigationTabSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationTabSource = navigationTabReference.source;
        }
        if ((i & 2) != 0) {
            str = navigationTabReference.itemKey;
        }
        AnonymousClass003.A0u(navigationTabSource, str);
        return new NavigationTabReference(navigationTabSource, str);
    }

    public final NavigationTabSource component1() {
        return this.source;
    }

    public final String component2() {
        return this.itemKey;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final NavigationTabSource getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.itemKey, AnonymousClass005.A0E(this.source));
    }

    public NavigationTabReference(NavigationTabSource navigationTabSource, String str) {
        AnonymousClass003.A0u(navigationTabSource, str);
        this.source = navigationTabSource;
        this.itemKey = str;
    }

    public final NavigationTabReference copy(NavigationTabSource navigationTabSource, String str) {
        AnonymousClass003.A0u(navigationTabSource, str);
        return new NavigationTabReference(navigationTabSource, str);
    }

    public String toString() {
        return super.toString();
    }
}
