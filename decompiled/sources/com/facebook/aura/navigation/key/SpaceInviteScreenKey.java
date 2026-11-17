package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceInviteScreenKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String slug;

    public final class Companion {
        public final C9hr<SpaceInviteScreenKey> serializer() {
            return SpaceInviteScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SpaceInviteScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SpaceInviteScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpaceInviteScreenKey) && C7384Etj.areEqual(this.slug, ((SpaceInviteScreenKey) obj).slug));
    }

    public /* synthetic */ SpaceInviteScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceInviteScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.slug = str;
    }

    public static /* synthetic */ SpaceInviteScreenKey copy$default(SpaceInviteScreenKey spaceInviteScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceInviteScreenKey.slug;
        }
        C7384Etj.A0Y(str, 0);
        return new SpaceInviteScreenKey(str);
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

    public SpaceInviteScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
    }
}
