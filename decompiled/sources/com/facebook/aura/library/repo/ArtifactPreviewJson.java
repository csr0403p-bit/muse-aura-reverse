package com.facebook.aura.library.repo;

import X.AnonymousClass005;
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
public final class ArtifactPreviewJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String icon_url;
    public final String thumbnail_url;

    public final class Companion {
        public final C9hr<ArtifactPreviewJson> serializer() {
            return ArtifactPreviewJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactPreviewJson artifactPreviewJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || artifactPreviewJson.icon_url != null) {
            c9j5.AAP(artifactPreviewJson.icon_url, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || artifactPreviewJson.thumbnail_url != null) {
            c9j5.AAP(artifactPreviewJson.thumbnail_url, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactPreviewJson) {
                ArtifactPreviewJson artifactPreviewJson = (ArtifactPreviewJson) obj;
                if (!C7384Etj.areEqual(this.icon_url, artifactPreviewJson.icon_url) || !C7384Etj.areEqual(this.thumbnail_url, artifactPreviewJson.thumbnail_url)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactPreviewJson copy$default(ArtifactPreviewJson artifactPreviewJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactPreviewJson.icon_url;
        }
        if ((i & 2) != 0) {
            str2 = artifactPreviewJson.thumbnail_url;
        }
        return new ArtifactPreviewJson(str, str2);
    }

    public final String component1() {
        return this.icon_url;
    }

    public final String component2() {
        return this.thumbnail_url;
    }

    public final ArtifactPreviewJson copy(String str, String str2) {
        return new ArtifactPreviewJson(str, str2);
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final String getThumbnail_url() {
        return this.thumbnail_url;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.icon_url) * 31) + AnonymousClass005.A0H(this.thumbnail_url);
    }

    public ArtifactPreviewJson(String str, String str2) {
        this.icon_url = str;
        this.thumbnail_url = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactPreviewJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.icon_url = null;
        } else {
            this.icon_url = str;
        }
        if ((i & 2) == 0) {
            this.thumbnail_url = null;
        } else {
            this.thumbnail_url = str2;
        }
    }

    public /* synthetic */ ArtifactPreviewJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public ArtifactPreviewJson() {
        this(null, null);
    }
}
