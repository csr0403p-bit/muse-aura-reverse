package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SpacesModalScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean fromNavigation;
    public final String slug;
    public final String tabId;

    public final class Companion {
        public final C9hr<SpacesModalScreenKey> serializer() {
            return SpacesModalScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpacesModalScreenKey(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
        this.tabId = str2;
        this.fromNavigation = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SpacesModalScreenKey spacesModalScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spacesModalScreenKey.slug, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || spacesModalScreenKey.tabId != null) {
            c9j5.AAP(spacesModalScreenKey.tabId, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || spacesModalScreenKey.fromNavigation) {
            c9j5.AA7(c9iZ, 2, spacesModalScreenKey.fromNavigation);
        }
    }

    public final SpacesModalScreenKey copy(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new SpacesModalScreenKey(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpacesModalScreenKey) {
                SpacesModalScreenKey spacesModalScreenKey = (SpacesModalScreenKey) obj;
                if (!C7384Etj.areEqual(this.slug, spacesModalScreenKey.slug) || !C7384Etj.areEqual(this.tabId, spacesModalScreenKey.tabId) || this.fromNavigation != spacesModalScreenKey.fromNavigation) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpacesModalScreenKey copy$default(SpacesModalScreenKey spacesModalScreenKey, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spacesModalScreenKey.slug;
        }
        if ((i & 2) != 0) {
            str2 = spacesModalScreenKey.tabId;
        }
        if ((i & 4) != 0) {
            z = spacesModalScreenKey.fromNavigation;
        }
        return spacesModalScreenKey.copy(str, str2, z);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.tabId;
    }

    public final boolean component3() {
        return this.fromNavigation;
    }

    public final boolean getFromNavigation() {
        return this.fromNavigation;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTabId() {
        return this.tabId;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.slug) + AnonymousClass006.A0G(this.tabId)) * 31, this.fromNavigation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpacesModalScreenKey(String str, String str2, boolean z, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), AnonymousClass005.A1O(i, z));
    }

    public /* synthetic */ SpacesModalScreenKey(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpacesModalScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.slug = str;
        this.tabId = (i & 2) == 0 ? null : str2;
        if ((i & 4) == 0) {
            this.fromNavigation = false;
        } else {
            this.fromNavigation = z;
        }
    }
}
