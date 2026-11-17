package com.facebook.aura.library.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactItemPreviewJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String icon_url;

    public final class Companion {
        public final C9hr<ArtifactItemPreviewJson> serializer() {
            return ArtifactItemPreviewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactItemPreviewJson artifactItemPreviewJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || artifactItemPreviewJson.icon_url != null) {
            c9j5.AAP(artifactItemPreviewJson.icon_url, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ArtifactItemPreviewJson) && C7384Etj.areEqual(this.icon_url, ((ArtifactItemPreviewJson) obj).icon_url));
    }

    public static /* synthetic */ ArtifactItemPreviewJson copy$default(ArtifactItemPreviewJson artifactItemPreviewJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactItemPreviewJson.icon_url;
        }
        return new ArtifactItemPreviewJson(str);
    }

    public final String component1() {
        return this.icon_url;
    }

    public final ArtifactItemPreviewJson copy(String str) {
        return new ArtifactItemPreviewJson(str);
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.icon_url);
    }

    public /* synthetic */ ArtifactItemPreviewJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ArtifactItemPreviewJson(String str) {
        this.icon_url = str;
    }

    public /* synthetic */ ArtifactItemPreviewJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public ArtifactItemPreviewJson() {
        this(null);
    }
}
