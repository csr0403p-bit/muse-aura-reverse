package com.facebook.aura.spaces.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class NavigationTabOrderResponseJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<NavigationTabReferenceJson> navbar;
    public final List<NavigationTabReferenceJson> spaces;
    public final List<NavigationTabReferenceJson> tabs;

    public final class Companion {
        public final C9hr<NavigationTabOrderResponseJson> serializer() {
            return NavigationTabOrderResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public NavigationTabOrderResponseJson(List<NavigationTabReferenceJson> list, List<NavigationTabReferenceJson> list2, List<NavigationTabReferenceJson> list3) {
        C7384Etj.A0Y(list, 0);
        this.tabs = list;
        this.navbar = list2;
        this.spaces = list3;
    }

    public final NavigationTabOrderResponseJson copy(List<NavigationTabReferenceJson> list, List<NavigationTabReferenceJson> list2, List<NavigationTabReferenceJson> list3) {
        C7384Etj.A0Y(list, 0);
        return new NavigationTabOrderResponseJson(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationTabOrderResponseJson) {
                NavigationTabOrderResponseJson navigationTabOrderResponseJson = (NavigationTabOrderResponseJson) obj;
                if (!C7384Etj.areEqual(this.tabs, navigationTabOrderResponseJson.tabs) || !C7384Etj.areEqual(this.navbar, navigationTabOrderResponseJson.navbar) || !C7384Etj.areEqual(this.spaces, navigationTabOrderResponseJson.spaces)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, AbstractC5321DgF.A02(num, NavigationTabOrderResponseJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, NavigationTabOrderResponseJson$Companion$$childSerializers$2.INSTANCE), NavigationTabOrderResponseJson$Companion$$childSerializers$3.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationTabOrderResponseJson copy$default(NavigationTabOrderResponseJson navigationTabOrderResponseJson, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navigationTabOrderResponseJson.tabs;
        }
        if ((i & 2) != 0) {
            list2 = navigationTabOrderResponseJson.navbar;
        }
        if ((i & 4) != 0) {
            list3 = navigationTabOrderResponseJson.spaces;
        }
        return navigationTabOrderResponseJson.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(NavigationTabOrderResponseJson navigationTabOrderResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(navigationTabOrderResponseJson.tabs)) {
            c9j5.AAQ(navigationTabOrderResponseJson.tabs, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || navigationTabOrderResponseJson.navbar != null) {
            c9j5.AAP(navigationTabOrderResponseJson.navbar, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || navigationTabOrderResponseJson.spaces != null) {
            c9j5.AAP(navigationTabOrderResponseJson.spaces, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final List<NavigationTabReferenceJson> component1() {
        return this.tabs;
    }

    public final List<NavigationTabReferenceJson> component2() {
        return this.navbar;
    }

    public final List<NavigationTabReferenceJson> component3() {
        return this.spaces;
    }

    public final List<NavigationTabReferenceJson> getNavbar() {
        return this.navbar;
    }

    public final List<NavigationTabReferenceJson> getSpaces() {
        return this.spaces;
    }

    public final List<NavigationTabReferenceJson> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.tabs) + AnonymousClass006.A0D(this.navbar)) * 31) + C3cH.A02(this.spaces);
    }

    public final boolean isSectioned() {
        return (this.navbar == null && this.spaces == null) ? false : true;
    }

    public final NavigationOrderPayload toOrder() {
        List<NavigationTabReferenceJson> list;
        List list2;
        if (isSectioned()) {
            list = this.navbar;
            if (list == null) {
                list = C0881AGi.A00;
            }
            list2 = this.spaces;
            if (list2 == null) {
            }
            return new NavigationOrderPayload(list, list2);
        }
        list = this.tabs;
        list2 = C0881AGi.A00;
        return new NavigationOrderPayload(list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NavigationTabOrderResponseJson(int i, List list, List list2, List list3, C2hx c2hx) {
        this.tabs = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.navbar = null;
        } else {
            this.navbar = list2;
        }
        if ((i & 4) == 0) {
            this.spaces = null;
        } else {
            this.spaces = list3;
        }
    }

    public /* synthetic */ NavigationTabOrderResponseJson(List list, List list2, List list3, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }

    public NavigationTabOrderResponseJson() {
        this(C0881AGi.A00, null, null);
    }
}
