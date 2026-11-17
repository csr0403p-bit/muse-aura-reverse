package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class NavigationTabReferenceJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String item_key;
    public final String source;

    /* loaded from: classes3.dex */
    public final class Companion {
        public final C9hr<NavigationTabReferenceJson> serializer() {
            return NavigationTabReferenceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(NavigationTabReferenceJson navigationTabReferenceJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(navigationTabReferenceJson.source, c9iZ, 0);
        c9j5.AAV(navigationTabReferenceJson.item_key, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NavigationTabReferenceJson) {
                NavigationTabReferenceJson navigationTabReferenceJson = (NavigationTabReferenceJson) obj;
                if (!C7384Etj.areEqual(this.source, navigationTabReferenceJson.source) || !C7384Etj.areEqual(this.item_key, navigationTabReferenceJson.item_key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NavigationTabReferenceJson copy$default(NavigationTabReferenceJson navigationTabReferenceJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationTabReferenceJson.source;
        }
        if ((i & 2) != 0) {
            str2 = navigationTabReferenceJson.item_key;
        }
        AnonymousClass003.A0u(str, str2);
        return new NavigationTabReferenceJson(str, str2);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.item_key;
    }

    public final String getItem_key() {
        return this.item_key;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.item_key, AnonymousClass001.A0G(this.source));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String toNavigationId() {
        String str;
        String strA0l = AnonymousClass002.A0l(this.item_key);
        if (strA0l.length() > 0) {
            String str2 = this.source;
            switch (str2.hashCode()) {
                case -1843153943:
                    str = "peer_space";
                    break;
                case -887328209:
                    if (str2.equals(PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM) && PinnedItemsRepositoryJsonKt.RENDERED_SYSTEM_TAB_KEYS.contains(strA0l)) {
                        return PinnedItemsRepositoryJsonKt.toLocalSystemNavigationId(strA0l);
                    }
                    break;
                case 109637894:
                    str = "space";
                    break;
                case 411468110:
                    str = PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SAVED_SPACE;
                    break;
            }
            if (str2.equals(str)) {
                return FGI.A0M(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, strA0l);
            }
        }
        return null;
    }

    public NavigationTabReferenceJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.source = str;
        this.item_key = str2;
    }

    public final NavigationTabReferenceJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new NavigationTabReferenceJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NavigationTabReferenceJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(NavigationTabReferenceJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.source = str;
        this.item_key = str2;
    }
}
