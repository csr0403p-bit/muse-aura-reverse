package com.facebook.aura.spaces.repo;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class NavigationOrderPayload extends C06G {
    public final List<NavigationTabReferenceJson> navbar;
    public final List<NavigationTabReferenceJson> spaces;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationOrderPayload) {
                NavigationOrderPayload navigationOrderPayload = (NavigationOrderPayload) obj;
                if (!C7384Etj.areEqual(this.navbar, navigationOrderPayload.navbar) || !C7384Etj.areEqual(this.spaces, navigationOrderPayload.spaces)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NavigationOrderPayload copy$default(NavigationOrderPayload navigationOrderPayload, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navigationOrderPayload.navbar;
        }
        if ((i & 2) != 0) {
            list2 = navigationOrderPayload.spaces;
        }
        AnonymousClass003.A0u(list, list2);
        return new NavigationOrderPayload(list, list2);
    }

    public final List<NavigationTabReferenceJson> component1() {
        return this.navbar;
    }

    public final List<NavigationTabReferenceJson> component2() {
        return this.spaces;
    }

    public final List<NavigationTabReferenceJson> getFlat() {
        return AbstractC0878AGe.A0P(this.spaces, this.navbar);
    }

    public final List<NavigationTabReferenceJson> getNavbar() {
        return this.navbar;
    }

    public final List<NavigationTabReferenceJson> getSpaces() {
        return this.spaces;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.spaces, AnonymousClass005.A0E(this.navbar));
    }

    public NavigationOrderPayload(List<NavigationTabReferenceJson> list, List<NavigationTabReferenceJson> list2) {
        AnonymousClass003.A0u(list, list2);
        this.navbar = list;
        this.spaces = list2;
    }

    public final NavigationOrderPayload copy(List<NavigationTabReferenceJson> list, List<NavigationTabReferenceJson> list2) {
        AnonymousClass003.A0u(list, list2);
        return new NavigationOrderPayload(list, list2);
    }

    public String toString() {
        return super.toString();
    }
}
