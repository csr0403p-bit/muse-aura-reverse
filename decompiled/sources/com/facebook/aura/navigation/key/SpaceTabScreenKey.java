package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SpaceTabScreenKey extends C06G implements AuraTabRootNavKey {
    public static final Companion Companion = new Companion();
    public final String slug;

    public final class Companion {
        public final C9hr<SpaceTabScreenKey> serializer() {
            return SpaceTabScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SpaceTabScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SpaceTabScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpaceTabScreenKey) && C7384Etj.areEqual(this.slug, ((SpaceTabScreenKey) obj).slug));
    }

    public /* synthetic */ SpaceTabScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceTabScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.slug = str;
    }

    public static /* synthetic */ SpaceTabScreenKey copy$default(SpaceTabScreenKey spaceTabScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceTabScreenKey.slug;
        }
        C7384Etj.A0Y(str, 0);
        return new SpaceTabScreenKey(str);
    }

    public final String component1() {
        return this.slug;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return this.slug.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SpaceTabScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
    }
}
