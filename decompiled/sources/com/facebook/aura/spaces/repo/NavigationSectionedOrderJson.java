package com.facebook.aura.spaces.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
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
public final class NavigationSectionedOrderJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<NavigationTabReferenceJson> navbar;
    public final List<NavigationTabReferenceJson> spaces;

    public final class Companion {
        public final C9hr<NavigationSectionedOrderJson> serializer() {
            return NavigationSectionedOrderJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationSectionedOrderJson) {
                NavigationSectionedOrderJson navigationSectionedOrderJson = (NavigationSectionedOrderJson) obj;
                if (!C7384Etj.areEqual(this.navbar, navigationSectionedOrderJson.navbar) || !C7384Etj.areEqual(this.spaces, navigationSectionedOrderJson.spaces)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1W(num, AbstractC5321DgF.A02(num, NavigationSectionedOrderJson$Companion$$childSerializers$1.INSTANCE), NavigationSectionedOrderJson$Companion$$childSerializers$2.INSTANCE);
    }

    public static /* synthetic */ NavigationSectionedOrderJson copy$default(NavigationSectionedOrderJson navigationSectionedOrderJson, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = navigationSectionedOrderJson.navbar;
        }
        if ((i & 2) != 0) {
            list2 = navigationSectionedOrderJson.spaces;
        }
        AnonymousClass003.A0u(list, list2);
        return new NavigationSectionedOrderJson(list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(NavigationSectionedOrderJson navigationSectionedOrderJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(navigationSectionedOrderJson.navbar)) {
            c9j5.AAQ(navigationSectionedOrderJson.navbar, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(navigationSectionedOrderJson.spaces)) {
            c9j5.AAQ(navigationSectionedOrderJson.spaces, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final List<NavigationTabReferenceJson> component1() {
        return this.navbar;
    }

    public final List<NavigationTabReferenceJson> component2() {
        return this.spaces;
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

    public NavigationSectionedOrderJson(List<NavigationTabReferenceJson> list, List<NavigationTabReferenceJson> list2) {
        AnonymousClass003.A0u(list, list2);
        this.navbar = list;
        this.spaces = list2;
    }

    public final NavigationSectionedOrderJson copy(List<NavigationTabReferenceJson> list, List<NavigationTabReferenceJson> list2) {
        AnonymousClass003.A0u(list, list2);
        return new NavigationSectionedOrderJson(list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NavigationSectionedOrderJson(int i, List list, List list2, C2hx c2hx) {
        this.navbar = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.spaces = C0881AGi.A00;
        } else {
            this.spaces = list2;
        }
    }

    public /* synthetic */ NavigationSectionedOrderJson(List list, List list2, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationSectionedOrderJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi);
    }
}
