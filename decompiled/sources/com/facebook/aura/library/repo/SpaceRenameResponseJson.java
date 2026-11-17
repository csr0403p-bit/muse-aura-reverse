package com.facebook.aura.library.repo;

import X.AnonymousClass001;
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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class SpaceRenameResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String name;
    public final String slug;

    public final class Companion {
        public final C9hr<SpaceRenameResponseJson> serializer() {
            return SpaceRenameResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(SpaceRenameResponseJson spaceRenameResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spaceRenameResponseJson.slug, c9iZ, 0);
        c9j5.AAV(spaceRenameResponseJson.name, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceRenameResponseJson) {
                SpaceRenameResponseJson spaceRenameResponseJson = (SpaceRenameResponseJson) obj;
                if (!C7384Etj.areEqual(this.slug, spaceRenameResponseJson.slug) || !C7384Etj.areEqual(this.name, spaceRenameResponseJson.name)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceRenameResponseJson copy$default(SpaceRenameResponseJson spaceRenameResponseJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceRenameResponseJson.slug;
        }
        if ((i & 2) != 0) {
            str2 = spaceRenameResponseJson.name;
        }
        AnonymousClass003.A0u(str, str2);
        return new SpaceRenameResponseJson(str, str2);
    }

    public final String component1() {
        return this.slug;
    }

    public final String component2() {
        return this.name;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.name, AnonymousClass001.A0G(this.slug));
    }

    public SpaceRenameResponseJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.slug = str;
        this.name = str2;
    }

    public final SpaceRenameResponseJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new SpaceRenameResponseJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceRenameResponseJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SpaceRenameResponseJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.slug = str;
        this.name = str2;
    }
}
