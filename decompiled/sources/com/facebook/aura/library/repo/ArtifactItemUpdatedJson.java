package com.facebook.aura.library.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactItemUpdatedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ArtifactItemJson item;

    public final class Companion {
        public final C9hr<ArtifactItemUpdatedJson> serializer() {
            return ArtifactItemUpdatedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactItemUpdatedJson artifactItemUpdatedJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || artifactItemUpdatedJson.item != null) {
            c9j5.AAP(artifactItemUpdatedJson.item, ArtifactItemJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ArtifactItemUpdatedJson) && C7384Etj.areEqual(this.item, ((ArtifactItemUpdatedJson) obj).item));
    }

    public static /* synthetic */ ArtifactItemUpdatedJson copy$default(ArtifactItemUpdatedJson artifactItemUpdatedJson, ArtifactItemJson artifactItemJson, int i, Object obj) {
        if ((i & 1) != 0) {
            artifactItemJson = artifactItemUpdatedJson.item;
        }
        return new ArtifactItemUpdatedJson(artifactItemJson);
    }

    public final ArtifactItemJson component1() {
        return this.item;
    }

    public final ArtifactItemUpdatedJson copy(ArtifactItemJson artifactItemJson) {
        return new ArtifactItemUpdatedJson(artifactItemJson);
    }

    public final ArtifactItemJson getItem() {
        return this.item;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.item);
    }

    public /* synthetic */ ArtifactItemUpdatedJson(int i, ArtifactItemJson artifactItemJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.item = null;
        } else {
            this.item = artifactItemJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactItemUpdatedJson(ArtifactItemJson artifactItemJson) {
        this.item = artifactItemJson;
    }

    public /* synthetic */ ArtifactItemUpdatedJson(ArtifactItemJson artifactItemJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : artifactItemJson);
    }

    public ArtifactItemUpdatedJson() {
        this(null);
    }
}
