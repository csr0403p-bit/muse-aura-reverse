package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactEdgeJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String cursor;
    public final ArtifactNodeJson node;

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<ArtifactEdgeJson> serializer() {
            return ArtifactEdgeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactEdgeJson artifactEdgeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean z = false;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(artifactEdgeJson.cursor)) {
            c9j5.AAV(artifactEdgeJson.cursor, c9iZ, 0);
        }
        if (!zAfR) {
            if (C7384Etj.areEqual(artifactEdgeJson.node, new ArtifactNodeJson((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), z, (String) (0 == true ? 1 : 0), (ArtifactPreviewJson) (0 == true ? 1 : 0), (ArtifactOpenTargetJson) (0 == true ? 1 : 0), (ArtifactCapabilitiesJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (ArtifactSharingInfoJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 131071, (C06H) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        c9j5.AAQ(artifactEdgeJson.node, ArtifactNodeJson$$serializer.INSTANCE, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactEdgeJson) {
                ArtifactEdgeJson artifactEdgeJson = (ArtifactEdgeJson) obj;
                if (!C7384Etj.areEqual(this.cursor, artifactEdgeJson.cursor) || !C7384Etj.areEqual(this.node, artifactEdgeJson.node)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactEdgeJson copy$default(ArtifactEdgeJson artifactEdgeJson, String str, ArtifactNodeJson artifactNodeJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactEdgeJson.cursor;
        }
        if ((i & 2) != 0) {
            artifactNodeJson = artifactEdgeJson.node;
        }
        AnonymousClass003.A0u(str, artifactNodeJson);
        return new ArtifactEdgeJson(str, artifactNodeJson);
    }

    public final String component1() {
        return this.cursor;
    }

    public final ArtifactNodeJson component2() {
        return this.node;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final ArtifactNodeJson getNode() {
        return this.node;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.node, AnonymousClass001.A0G(this.cursor));
    }

    public ArtifactEdgeJson(String str, ArtifactNodeJson artifactNodeJson) {
        AnonymousClass003.A0u(str, artifactNodeJson);
        this.cursor = str;
        this.node = artifactNodeJson;
    }

    public final ArtifactEdgeJson copy(String str, ArtifactNodeJson artifactNodeJson) {
        AnonymousClass003.A0u(str, artifactNodeJson);
        return new ArtifactEdgeJson(str, artifactNodeJson);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ArtifactEdgeJson(int i, String str, ArtifactNodeJson artifactNodeJson, C2hx c2hx) {
        this.cursor = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.node = new ArtifactNodeJson((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), false, (String) (0 == true ? 1 : 0), (ArtifactPreviewJson) (0 == true ? 1 : 0), (ArtifactOpenTargetJson) (0 == true ? 1 : 0), (ArtifactCapabilitiesJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (ArtifactSharingInfoJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 131071, (C06H) (0 == true ? 1 : 0));
            return;
        }
        this.node = artifactNodeJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ArtifactEdgeJson(String str, ArtifactNodeJson artifactNodeJson, int i, C06H c06h) {
        ArtifactNodeJson artifactNodeJson2 = artifactNodeJson;
        String str2 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            artifactNodeJson2 = new ArtifactNodeJson((String) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), false, (String) (0 == true ? 1 : 0), (ArtifactPreviewJson) (0 == true ? 1 : 0), (ArtifactOpenTargetJson) (0 == true ? 1 : 0), (ArtifactCapabilitiesJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (ArtifactSharingInfoJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 131071, (C06H) (0 == true ? 1 : 0));
        }
        this(str2, artifactNodeJson2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArtifactEdgeJson() {
        this((String) null, (ArtifactNodeJson) (0 == true ? 1 : 0), 3, (C06H) (0 == true ? 1 : 0));
    }
}
