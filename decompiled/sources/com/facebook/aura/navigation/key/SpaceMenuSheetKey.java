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
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SpaceMenuSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final boolean isTab;
    public final String parentContentKey;
    public final String slug;
    public final boolean useNavigationArtifact;

    public final class Companion {
        public final C9hr<SpaceMenuSheetKey> serializer() {
            return SpaceMenuSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceMenuSheetKey(String str, boolean z, boolean z2, String str2) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
        this.isTab = z;
        this.useNavigationArtifact = z2;
        this.parentContentKey = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(SpaceMenuSheetKey spaceMenuSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spaceMenuSheetKey.slug, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceMenuSheetKey.isTab) {
            c9j5.AA7(c9iZ, 1, spaceMenuSheetKey.isTab);
        }
        if (zAfR || spaceMenuSheetKey.useNavigationArtifact) {
            c9j5.AA7(c9iZ, 2, spaceMenuSheetKey.useNavigationArtifact);
        }
        if (zAfR || spaceMenuSheetKey.parentContentKey != null) {
            c9j5.AAP(spaceMenuSheetKey.parentContentKey, C07779iq.A01, c9iZ, 3);
        }
    }

    public final SpaceMenuSheetKey copy(String str, boolean z, boolean z2, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SpaceMenuSheetKey(str, z, z2, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceMenuSheetKey) {
                SpaceMenuSheetKey spaceMenuSheetKey = (SpaceMenuSheetKey) obj;
                if (!C7384Etj.areEqual(this.slug, spaceMenuSheetKey.slug) || this.isTab != spaceMenuSheetKey.isTab || this.useNavigationArtifact != spaceMenuSheetKey.useNavigationArtifact || !C7384Etj.areEqual(this.parentContentKey, spaceMenuSheetKey.parentContentKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceMenuSheetKey copy$default(SpaceMenuSheetKey spaceMenuSheetKey, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceMenuSheetKey.slug;
        }
        if ((i & 2) != 0) {
            z = spaceMenuSheetKey.isTab;
        }
        if ((i & 4) != 0) {
            z2 = spaceMenuSheetKey.useNavigationArtifact;
        }
        if ((i & 8) != 0) {
            str2 = spaceMenuSheetKey.parentContentKey;
        }
        C7384Etj.A0Y(str, 0);
        return new SpaceMenuSheetKey(str, z, z2, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final boolean component2() {
        return this.isTab;
    }

    public final boolean component3() {
        return this.useNavigationArtifact;
    }

    public final String component4() {
        return this.parentContentKey;
    }

    public final String getParentContentKey() {
        return this.parentContentKey;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final boolean getUseNavigationArtifact() {
        return this.useNavigationArtifact;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(AnonymousClass001.A0G(this.slug), this.isTab), this.useNavigationArtifact) + AnonymousClass006.A0G(this.parentContentKey);
    }

    public final boolean isTab() {
        return this.isTab;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceMenuSheetKey(String str, boolean z, boolean z2, String str2, int i, C06H c06h) {
        this(str, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), AnonymousClass006.A0u(i, str2));
    }

    public /* synthetic */ SpaceMenuSheetKey(int i, String str, boolean z, boolean z2, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceMenuSheetKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.slug = str;
        if ((i & 2) == 0) {
            this.isTab = false;
        } else {
            this.isTab = z;
        }
        if ((i & 4) == 0) {
            this.useNavigationArtifact = false;
        } else {
            this.useNavigationArtifact = z2;
        }
        if ((i & 8) == 0) {
            this.parentContentKey = null;
        } else {
            this.parentContentKey = str2;
        }
    }
}
