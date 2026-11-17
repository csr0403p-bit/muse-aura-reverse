package com.facebook.aura.library.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class UnifiedArtifactsResponseJson extends C06G {
    public final List<ArtifactEdgeJson> edges;
    public final ArtifactPageInfoJson page_info;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, UnifiedArtifactsResponseJson$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final C9hr<UnifiedArtifactsResponseJson> serializer() {
            return UnifiedArtifactsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnifiedArtifactsResponseJson) {
                UnifiedArtifactsResponseJson unifiedArtifactsResponseJson = (UnifiedArtifactsResponseJson) obj;
                if (!C7384Etj.areEqual(this.edges, unifiedArtifactsResponseJson.edges) || !C7384Etj.areEqual(this.page_info, unifiedArtifactsResponseJson.page_info)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UnifiedArtifactsResponseJson copy$default(UnifiedArtifactsResponseJson unifiedArtifactsResponseJson, List list, ArtifactPageInfoJson artifactPageInfoJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = unifiedArtifactsResponseJson.edges;
        }
        if ((i & 2) != 0) {
            artifactPageInfoJson = unifiedArtifactsResponseJson.page_info;
        }
        AnonymousClass003.A0u(list, artifactPageInfoJson);
        return new UnifiedArtifactsResponseJson(list, artifactPageInfoJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(UnifiedArtifactsResponseJson unifiedArtifactsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C7384Etj.areEqual(unifiedArtifactsResponseJson.edges, C0881AGi.A00)) {
            c9j5.AAQ(unifiedArtifactsResponseJson.edges, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(unifiedArtifactsResponseJson.page_info, new ArtifactPageInfoJson(false, false, null, null))) {
            c9j5.AAQ(unifiedArtifactsResponseJson.page_info, ArtifactPageInfoJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<ArtifactEdgeJson> component1() {
        return this.edges;
    }

    public final ArtifactPageInfoJson component2() {
        return this.page_info;
    }

    public final List<ArtifactEdgeJson> getEdges() {
        return this.edges;
    }

    public final ArtifactPageInfoJson getPage_info() {
        return this.page_info;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.page_info, AnonymousClass005.A0E(this.edges));
    }

    public UnifiedArtifactsResponseJson(List<ArtifactEdgeJson> list, ArtifactPageInfoJson artifactPageInfoJson) {
        AnonymousClass003.A0u(list, artifactPageInfoJson);
        this.edges = list;
        this.page_info = artifactPageInfoJson;
    }

    public final UnifiedArtifactsResponseJson copy(List<ArtifactEdgeJson> list, ArtifactPageInfoJson artifactPageInfoJson) {
        AnonymousClass003.A0u(list, artifactPageInfoJson);
        return new UnifiedArtifactsResponseJson(list, artifactPageInfoJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ UnifiedArtifactsResponseJson(List list, ArtifactPageInfoJson artifactPageInfoJson, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list, (i & 2) != 0 ? new ArtifactPageInfoJson(false, false, null, null) : artifactPageInfoJson);
    }

    public /* synthetic */ UnifiedArtifactsResponseJson(int i, List list, ArtifactPageInfoJson artifactPageInfoJson, C2hx c2hx) {
        this.edges = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.page_info = new ArtifactPageInfoJson(false, false, null, null);
        } else {
            this.page_info = artifactPageInfoJson;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedArtifactsResponseJson() {
        this((List) null, (ArtifactPageInfoJson) (0 == true ? 1 : 0), 3, (C06H) (0 == true ? 1 : 0));
    }
}
