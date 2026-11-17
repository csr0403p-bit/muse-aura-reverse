package com.facebook.aura.spaces.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.HsK;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpacesFavoritesRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final double favorite_order;
    public final String slug;

    public final class Companion {
        public final C9hr<SpacesFavoritesRequestJson> serializer() {
            return SpacesFavoritesRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpacesFavoritesRequestJson(String str, double d) {
        C7384Etj.A0Y(str, 0);
        this.slug = str;
        this.favorite_order = d;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(SpacesFavoritesRequestJson spacesFavoritesRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spacesFavoritesRequestJson.slug, c9iZ, 0);
        c9j5.AAD(c9iZ, spacesFavoritesRequestJson.favorite_order, 1);
    }

    public final SpacesFavoritesRequestJson copy(String str, double d) {
        C7384Etj.A0Y(str, 0);
        return new SpacesFavoritesRequestJson(str, d);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpacesFavoritesRequestJson) {
                SpacesFavoritesRequestJson spacesFavoritesRequestJson = (SpacesFavoritesRequestJson) obj;
                if (!C7384Etj.areEqual(this.slug, spacesFavoritesRequestJson.slug) || Double.compare(this.favorite_order, spacesFavoritesRequestJson.favorite_order) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpacesFavoritesRequestJson copy$default(SpacesFavoritesRequestJson spacesFavoritesRequestJson, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spacesFavoritesRequestJson.slug;
        }
        if ((i & 2) != 0) {
            d = spacesFavoritesRequestJson.favorite_order;
        }
        C7384Etj.A0Y(str, 0);
        return new SpacesFavoritesRequestJson(str, d);
    }

    public final String component1() {
        return this.slug;
    }

    public final double component2() {
        return this.favorite_order;
    }

    public final double getFavorite_order() {
        return this.favorite_order;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.slug) + HsK.A00(this.favorite_order);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpacesFavoritesRequestJson(int i, String str, double d, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SpacesFavoritesRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.slug = str;
        this.favorite_order = d;
    }
}
