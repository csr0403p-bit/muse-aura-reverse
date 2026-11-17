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
/* loaded from: classes3.dex */
public final class ArtifactRecentsTouchRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String item_key;
    public final String source;

    public final class Companion {
        public final C9hr<ArtifactRecentsTouchRequestJson> serializer() {
            return ArtifactRecentsTouchRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactRecentsTouchRequestJson artifactRecentsTouchRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(artifactRecentsTouchRequestJson.source, c9iZ, 0);
        c9j5.AAV(artifactRecentsTouchRequestJson.item_key, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactRecentsTouchRequestJson) {
                ArtifactRecentsTouchRequestJson artifactRecentsTouchRequestJson = (ArtifactRecentsTouchRequestJson) obj;
                if (!C7384Etj.areEqual(this.source, artifactRecentsTouchRequestJson.source) || !C7384Etj.areEqual(this.item_key, artifactRecentsTouchRequestJson.item_key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactRecentsTouchRequestJson copy$default(ArtifactRecentsTouchRequestJson artifactRecentsTouchRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactRecentsTouchRequestJson.source;
        }
        if ((i & 2) != 0) {
            str2 = artifactRecentsTouchRequestJson.item_key;
        }
        AnonymousClass003.A0u(str, str2);
        return new ArtifactRecentsTouchRequestJson(str, str2);
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

    public ArtifactRecentsTouchRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.source = str;
        this.item_key = str2;
    }

    public final ArtifactRecentsTouchRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new ArtifactRecentsTouchRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactRecentsTouchRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(ArtifactRecentsTouchRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.source = str;
        this.item_key = str2;
    }
}
